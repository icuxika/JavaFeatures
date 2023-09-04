package com.icuxika.nineteen.fourtwofour.jextract;

import com.icuxika.jextract.libffmpeg.*;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentScope;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static com.icuxika.jextract.libffmpeg.Libffmpeg.*;
import static com.icuxika.jextract.libffmpeg.Libffmpeg_1.av_free;
import static com.icuxika.jextract.libffmpeg.Libffmpeg_2.avcodec_close;
import static java.lang.foreign.MemorySegment.NULL;

/**
 * https://github.com/openjdk/jextract/blob/master/samples/libffmpeg/LibffmpegMain.java
 */
public class LibffmpegRunDemo {

    private static int NUM_FRAMES_TO_CAPTURE = 5;

    public record Exit(String message, int exitCode) {
    }

    public static void main(String[] args) {
        var exit = run(args);
        System.err.println(exit.message());
        System.exit(exit.exitCode());
    }

    private static class ArenaCleanup implements AutoCloseable {
        private Arena arena = Arena.openConfined();
        private final List<Runnable> preCloseActions = new ArrayList<>();

        void addCleanup(Runnable runnable) {
            preCloseActions.add(runnable);
        }

        Arena arena() {
            return arena;
        }

        @Override
        public void close() {
            preCloseActions.forEach(Runnable::run);
            System.out.println("cleanup done");
            arena.close();
        }
    }

    public static Exit run(String[] args) {
        if (args.length != 1) {
            return new Exit("请输入一个 .mp4 文件的路径", 1);
        }
        try (var arenaCleanup = new ArenaCleanup()) {
            var arena = arenaCleanup.arena();
            // AVFormatContext *pFormatContext
            var ppFormatContext = arena.allocate(C_POINTER);
            var fileName = arena.allocateUtf8String(args[0]);

            if (avformat_open_input(ppFormatContext, fileName, NULL, NULL) != 0) {
                return new Exit("无法打开此文件", 1);
            }
            System.out.println("已打开文件：" + args[0]);

            var pFormatContext = ppFormatContext.get(C_POINTER, 0);

            if (avformat_find_stream_info(pFormatContext, NULL) < 0) {
                return new Exit("找不到视频流", 1);
            }

            arenaCleanup.addCleanup(() -> {
                // 程序运行结束后，在ArenaCleanup的close()中自动调用
                avformat_close_input(ppFormatContext);
            });

            // 打印视频信息
            av_dump_format(pFormatContext, 0, fileName, 0);

            var pStreams = AVFormatContext.streams$get(pFormatContext);
            System.out.println("----------------------------------------");
            int videoStreamIndex = av_find_best_stream(pFormatContext, AVMEDIA_TYPE_VIDEO(), -1, -1, NULL, 0);
            if (videoStreamIndex < 0) {
                return new Exit("没有找到最佳视频流", 1);
            }
            System.out.println("最佳视频流的index是：" + videoStreamIndex);
            // 视频流的信息
            var videoStream = pStreams.getAtIndex(C_POINTER, videoStreamIndex);
            System.out.println("--------------------音频信息--------------------");
            var videoAvgFrameRate = AVStream.avg_frame_rate$slice(videoStream);
            var videoFPS = rate2FPS(videoAvgFrameRate);
            System.out.println("视频帧率FPS：" + videoFPS);

            var videoCodecPar = AVStream.codecpar$get(videoStream);
            int width = AVCodecParameters.width$get(videoCodecPar);
            int height = AVCodecParameters.height$get(videoCodecPar);
            int videoFormat = AVCodecParameters.format$get(videoCodecPar);
            System.out.println("视频宽度：" + width);
            System.out.println("视频高度：" + height);
            System.out.println("视频像素格式：" + videoFormat);

            // 音频流的信息
            int audioStreamIndex = av_find_best_stream(pFormatContext, AVMEDIA_TYPE_AUDIO(), -1, -1, NULL, 0);
            if (audioStreamIndex >= 0) {
                System.out.println("----------------------------------------");
                System.out.println("最佳音频流的index是：" + audioStreamIndex);
                var audioStream = pStreams.getAtIndex(C_POINTER, audioStreamIndex);
                System.out.println("--------------------音频信息--------------------");
                var audioAvgFrameRate = AVStream.avg_frame_rate$slice(audioStream);
                var audioFPS = rate2FPS(audioAvgFrameRate);
                System.out.println("音频FPS：" + audioFPS);

                var audioCodecPar = AVStream.codecpar$get(audioStream);
                var sampleRate = AVCodecParameters.sample_rate$get(audioCodecPar);
                var audioFormat = AVCodecParameters.format$get(audioCodecPar);
                var channels = AVCodecParameters.channels$get(audioCodecPar);
                var frameSize = AVCodecParameters.frame_size$get(audioCodecPar);
                System.out.println("样本率：" + sampleRate);
                System.out.println("音频采样格式：" + audioFormat);
                System.out.println("声道数：" + channels);
                System.out.println("一帧音频的大小：" + frameSize);
                System.out.println("----------------------------------------");
            }
        } finally {

        }
        return new Exit("再见！", 0);
    }

    private static double rate2FPS(MemorySegment avgFrameRate) {
        int num = AVRational.num$get(avgFrameRate);
        int den = AVRational.den$get(avgFrameRate);
        return den == 0 ? 0 : (double) num / den;
    }

    /**
     * jextract 官方仓库的示例代码，此代码基于ffmpeg4版本，当前项目用的是ffmpeg6，所以代码已经不兼容
     */
    public static Exit run1(String[] args) {
        if (args.length != 1) {
            return new Exit("please pass a .mp4 file", 1);
        }

        var pCodecCtxOrig = NULL;
        var pCodecCtx = NULL;
        var pFrame = NULL;
        var pFrameRGB = NULL;
        var buffer = NULL;

        try (var arenaCleanup = new ArenaCleanup()) {
            var arena = arenaCleanup.arena();
            // AVFormatContext *ppFormatCtx;
            var ppFormatCtx = arena.allocate(C_POINTER);
            // char* fileName;
            var fileName = arena.allocateUtf8String(args[0]);

            // open video file
            if (avformat_open_input(ppFormatCtx, fileName, NULL, NULL) != 0) {
                return new Exit("Cannot open " + args[0], 1);
            }
            System.out.println("opened " + args[0]);
            // AVFormatContext *pFormatCtx;
            var pFormatCtx = ppFormatCtx.get(C_POINTER, 0);

            // Retrieve stream info
            if (avformat_find_stream_info(pFormatCtx, NULL) < 0) {
                return new Exit("Could not find stream information", 1);

            }

            arenaCleanup.addCleanup(() -> {
                // Close the video file
                avformat_close_input(ppFormatCtx);
            });

            // Dump AV format info on stderr
            av_dump_format(pFormatCtx, 0, fileName, 0);

            // Find the first video stream
            int videoStream = -1;
            // AVFrameContext formatCtx;
            // formatCtx.nb_streams
            int nb_streams = AVFormatContext.nb_streams$get(pFormatCtx);
            System.out.println("number of streams: " + nb_streams);
            // formatCtx.streams
            var pStreams = AVFormatContext.streams$get(pFormatCtx);

            // AVCodecContext* pVideoCodecCtx;
            var pVideoCodecCtx = NULL;
            // AVCodec* pCodec;
            var pCodec = NULL;
            for (int i = 0; i < nb_streams; i++) {
                // AVStream* pStream;
                var pStream = pStreams.getAtIndex(C_POINTER, i);
                // AVCodecContext* pCodecCtx;
                pCodecCtx = AVStream.codecpar$get(pStream);
                if (AVCodecContext.codec_type$get(pCodecCtx) == AVMEDIA_TYPE_VIDEO()) {
                    videoStream = i;
                    pVideoCodecCtx = pCodecCtx;
                    // Find the decoder for the video stream
                    pCodec = avcodec_find_decoder(AVCodecContext.codec_id$get(pCodecCtx));
                    break;
                }
            }

            if (videoStream == -1) {
                return new Exit("Didn't find a video stream", 1);
            } else {
                System.out.println("Found video stream (index: " + videoStream + ")");
            }

            if (pCodec.equals(NULL)) {
                return new Exit("Unsupported codec", 1);
            }

            // Copy context
            // AVCodecContext *pCodecCtxOrig;
            pCodecCtxOrig = pVideoCodecCtx;
            // AVCodecContext *pCodecCtx;
            pCodecCtx = avcodec_alloc_context3(pCodec);
//            if (avcodec_parameters_to_context(pCodecCtx, pCodecCtxOrig) != 0) {
//                return new Exit("Cannot copy context", 1);
//            }

            // Open codec
            if (avcodec_open2(pCodecCtx, pCodec, NULL) < 0) {
                return new Exit("Cannot open codec", 1);
            }

            // Allocate video frame
            // AVFrame* pFrame;
            pFrame = av_frame_alloc();
            // Allocate an AVFrame structure
            // AVFrame* pFrameRGB;
            pFrameRGB = av_frame_alloc();

            // Determine required buffer size and allocate buffer
            int width = AVCodecContext.width$get(pCodecCtx);
            int height = AVCodecContext.height$get(pCodecCtx);
            int numBytes = av_image_get_buffer_size(AV_PIX_FMT_RGB24(), width, height, 1);
            buffer = av_malloc(numBytes * C_CHAR.byteSize());


            if (pFrame.equals(NULL)) {
                return new Exit("Cannot allocate frame", 1);
            }
            if (pFrameRGB.equals(NULL)) {
                return new Exit("Cannot allocate RGB frame", 1);
            }
            if (buffer.equals(NULL)) {
                return new Exit("cannot allocate buffer", 1);
            }

            // Assign appropriate parts of buffer to image planes in pFrameRGB
            // Note that pFrameRGB is an AVFrame, but AVFrame is a superset
            // of AVPicture
            av_image_fill_arrays(AVFrame.data$slice(pFrameRGB), AVFrame.linesize$slice(pFrameRGB), buffer, AV_PIX_FMT_RGB24(), width, height, 1);

            // initialize SWS context for software scaling
            int pix_fmt = AVCodecContext.pix_fmt$get(pCodecCtx);
            var sws_ctx = sws_getContext(width, height, pix_fmt, width, height,
                    AV_PIX_FMT_RGB24(), SWS_BILINEAR(), NULL, NULL, NULL);

            int i = 0;
            // ACPacket packet;
            var packet = AVPacket.allocate(arena);
            // int* pFrameFinished;
            var pFrameFinished = arena.allocate(C_INT);

            while (av_read_frame(pFormatCtx, packet) >= 0) {
                // Is this a packet from the video stream?
                // packet.stream_index == videoStream
                if (AVPacket.stream_index$get(packet) == videoStream) {
                    // Decode video frame
                    avcodec_send_packet(pCodecCtx, packet);
                    avcodec_receive_frame(pCodecCtx, pFrame);
                    pFrameFinished.set(C_INT, 0, 1);

                    int frameFinished = pFrameFinished.get(C_INT, 0);
                    // Did we get a video frame?
                    if (frameFinished != 0) {
                        // Convert the image from its native format to RGB
                        sws_scale(sws_ctx, AVFrame.data$slice(pFrame),
                                AVFrame.linesize$slice(pFrame), 0, height,
                                AVFrame.data$slice(pFrameRGB), AVFrame.linesize$slice(pFrameRGB));

                        // Save the frame to disk
                        if (++i <= NUM_FRAMES_TO_CAPTURE) {
                            try {
                                saveFrame(pFrameRGB, arena.scope(), width, height, i);
                            } catch (Exception exp) {
                                exp.printStackTrace();
                                return new Exit("save frame failed for frame " + i, 1);
                            }
                        }
                    }
                }

                // Free the packet that was allocated by av_read_frame
                av_packet_free(packet);
            }
        } finally {
            // clean-up everything

            // Free the RGB image
            if (!buffer.equals(NULL)) {
                av_free(buffer);
            }

            if (!pFrameRGB.equals(NULL)) {
                av_free(pFrameRGB);
            }

            // Free the YUV frame
            if (!pFrame.equals(NULL)) {
                av_free(pFrame);
            }

            // Close the codecs
            if (!pCodecCtx.equals(NULL)) {
                avcodec_close(pCodecCtx);
            }

            if (!pCodecCtxOrig.equals(NULL)) {
                avcodec_close(pCodecCtxOrig);
            }
        }

        return new Exit("Goodbye!", 0);
    }

    private static void saveFrame(MemorySegment frameRGB, SegmentScope scope,
                                  int width, int height, int iFrame)
            throws IOException {
        var header = String.format("P6\n%d %d\n255\n", width, height);
        var path = Paths.get("frame" + iFrame + ".ppm");
        try (var os = Files.newOutputStream(path)) {
            System.out.println("writing " + path.toString());
            os.write(header.getBytes());
            var data = AVFrame.data$slice(frameRGB);
            // frameRGB.data[0]
            var pdata = data.get(C_POINTER, 0);
            // frameRGB.linespace[0]
            var linesize = AVFrame.linesize$slice(frameRGB).get(C_INT, 0);
            // Write pixel data
            for (int y = 0; y < height; y++) {
                // frameRGB.data[0] + y*frameRGB.linesize[0] is the pointer. And 3*width size of data
                var pixelArray = MemorySegment.ofAddress(pdata.address() + y * linesize, 3 * width, scope);
                // dump the pixel byte buffer to file
                os.write(pixelArray.toArray(C_CHAR));
            }
        }
    }
}
