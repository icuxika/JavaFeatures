// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVCodecParserContext {
 *     void* priv_data;
 *     struct AVCodecParser* parser;
 *     int64_t frame_offset;
 *     int64_t cur_offset;
 *     int64_t next_frame_offset;
 *     int pict_type;
 *     int repeat_pict;
 *     int64_t pts;
 *     int64_t dts;
 *     int64_t last_pts;
 *     int64_t last_dts;
 *     int fetch_timestamp;
 *     int cur_frame_start_index;
 *     int64_t cur_frame_offset[4];
 *     int64_t cur_frame_pts[4];
 *     int64_t cur_frame_dts[4];
 *     int flags;
 *     int64_t offset;
 *     int64_t cur_frame_end[4];
 *     int key_frame;
 *     int dts_sync_point;
 *     int dts_ref_dts_delta;
 *     int pts_dts_delta;
 *     int64_t cur_frame_pos[4];
 *     int64_t pos;
 *     int64_t last_pos;
 *     int duration;
 *     enum AVFieldOrder field_order;
 *     enum AVPictureStructure picture_structure;
 *     int output_picture_number;
 *     int width;
 *     int height;
 *     int coded_width;
 *     int coded_height;
 *     int format;
 * };
 * }
 */
public class AVCodecParserContext {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("priv_data"),
        Constants$root.C_POINTER$LAYOUT.withName("parser"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("frame_offset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("cur_offset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("next_frame_offset"),
        Constants$root.C_LONG$LAYOUT.withName("pict_type"),
        Constants$root.C_LONG$LAYOUT.withName("repeat_pict"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("pts"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dts"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("last_pts"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("last_dts"),
        Constants$root.C_LONG$LAYOUT.withName("fetch_timestamp"),
        Constants$root.C_LONG$LAYOUT.withName("cur_frame_start_index"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_LONG_LONG$LAYOUT).withName("cur_frame_offset"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_LONG_LONG$LAYOUT).withName("cur_frame_pts"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_LONG_LONG$LAYOUT).withName("cur_frame_dts"),
        Constants$root.C_LONG$LAYOUT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("offset"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_LONG_LONG$LAYOUT).withName("cur_frame_end"),
        Constants$root.C_LONG$LAYOUT.withName("key_frame"),
        Constants$root.C_LONG$LAYOUT.withName("dts_sync_point"),
        Constants$root.C_LONG$LAYOUT.withName("dts_ref_dts_delta"),
        Constants$root.C_LONG$LAYOUT.withName("pts_dts_delta"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_LONG_LONG$LAYOUT).withName("cur_frame_pos"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("pos"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("last_pos"),
        Constants$root.C_LONG$LAYOUT.withName("duration"),
        Constants$root.C_LONG$LAYOUT.withName("field_order"),
        Constants$root.C_LONG$LAYOUT.withName("picture_structure"),
        Constants$root.C_LONG$LAYOUT.withName("output_picture_number"),
        Constants$root.C_LONG$LAYOUT.withName("width"),
        Constants$root.C_LONG$LAYOUT.withName("height"),
        Constants$root.C_LONG$LAYOUT.withName("coded_width"),
        Constants$root.C_LONG$LAYOUT.withName("coded_height"),
        Constants$root.C_LONG$LAYOUT.withName("format"),
        MemoryLayout.paddingLayout(32)
    ).withName("AVCodecParserContext");
    public static MemoryLayout $LAYOUT() {
        return AVCodecParserContext.$struct$LAYOUT;
    }
    static final VarHandle priv_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priv_data"));
    public static VarHandle priv_data$VH() {
        return AVCodecParserContext.priv_data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* priv_data;
     * }
     */
    public static MemorySegment priv_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVCodecParserContext.priv_data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* priv_data;
     * }
     */
    public static void priv_data$set(MemorySegment seg, MemorySegment x) {
        AVCodecParserContext.priv_data$VH.set(seg, x);
    }
    public static MemorySegment priv_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVCodecParserContext.priv_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priv_data$set(MemorySegment seg, long index, MemorySegment x) {
        AVCodecParserContext.priv_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle parser$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("parser"));
    public static VarHandle parser$VH() {
        return AVCodecParserContext.parser$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVCodecParser* parser;
     * }
     */
    public static MemorySegment parser$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVCodecParserContext.parser$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVCodecParser* parser;
     * }
     */
    public static void parser$set(MemorySegment seg, MemorySegment x) {
        AVCodecParserContext.parser$VH.set(seg, x);
    }
    public static MemorySegment parser$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVCodecParserContext.parser$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void parser$set(MemorySegment seg, long index, MemorySegment x) {
        AVCodecParserContext.parser$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle frame_offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("frame_offset"));
    public static VarHandle frame_offset$VH() {
        return AVCodecParserContext.frame_offset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t frame_offset;
     * }
     */
    public static long frame_offset$get(MemorySegment seg) {
        return (long)AVCodecParserContext.frame_offset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t frame_offset;
     * }
     */
    public static void frame_offset$set(MemorySegment seg, long x) {
        AVCodecParserContext.frame_offset$VH.set(seg, x);
    }
    public static long frame_offset$get(MemorySegment seg, long index) {
        return (long)AVCodecParserContext.frame_offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void frame_offset$set(MemorySegment seg, long index, long x) {
        AVCodecParserContext.frame_offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cur_offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cur_offset"));
    public static VarHandle cur_offset$VH() {
        return AVCodecParserContext.cur_offset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t cur_offset;
     * }
     */
    public static long cur_offset$get(MemorySegment seg) {
        return (long)AVCodecParserContext.cur_offset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t cur_offset;
     * }
     */
    public static void cur_offset$set(MemorySegment seg, long x) {
        AVCodecParserContext.cur_offset$VH.set(seg, x);
    }
    public static long cur_offset$get(MemorySegment seg, long index) {
        return (long)AVCodecParserContext.cur_offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cur_offset$set(MemorySegment seg, long index, long x) {
        AVCodecParserContext.cur_offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle next_frame_offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next_frame_offset"));
    public static VarHandle next_frame_offset$VH() {
        return AVCodecParserContext.next_frame_offset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t next_frame_offset;
     * }
     */
    public static long next_frame_offset$get(MemorySegment seg) {
        return (long)AVCodecParserContext.next_frame_offset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t next_frame_offset;
     * }
     */
    public static void next_frame_offset$set(MemorySegment seg, long x) {
        AVCodecParserContext.next_frame_offset$VH.set(seg, x);
    }
    public static long next_frame_offset$get(MemorySegment seg, long index) {
        return (long)AVCodecParserContext.next_frame_offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next_frame_offset$set(MemorySegment seg, long index, long x) {
        AVCodecParserContext.next_frame_offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pict_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pict_type"));
    public static VarHandle pict_type$VH() {
        return AVCodecParserContext.pict_type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pict_type;
     * }
     */
    public static int pict_type$get(MemorySegment seg) {
        return (int)AVCodecParserContext.pict_type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pict_type;
     * }
     */
    public static void pict_type$set(MemorySegment seg, int x) {
        AVCodecParserContext.pict_type$VH.set(seg, x);
    }
    public static int pict_type$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.pict_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pict_type$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.pict_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle repeat_pict$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("repeat_pict"));
    public static VarHandle repeat_pict$VH() {
        return AVCodecParserContext.repeat_pict$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int repeat_pict;
     * }
     */
    public static int repeat_pict$get(MemorySegment seg) {
        return (int)AVCodecParserContext.repeat_pict$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int repeat_pict;
     * }
     */
    public static void repeat_pict$set(MemorySegment seg, int x) {
        AVCodecParserContext.repeat_pict$VH.set(seg, x);
    }
    public static int repeat_pict$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.repeat_pict$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void repeat_pict$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.repeat_pict$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pts"));
    public static VarHandle pts$VH() {
        return AVCodecParserContext.pts$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t pts;
     * }
     */
    public static long pts$get(MemorySegment seg) {
        return (long)AVCodecParserContext.pts$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t pts;
     * }
     */
    public static void pts$set(MemorySegment seg, long x) {
        AVCodecParserContext.pts$VH.set(seg, x);
    }
    public static long pts$get(MemorySegment seg, long index) {
        return (long)AVCodecParserContext.pts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pts$set(MemorySegment seg, long index, long x) {
        AVCodecParserContext.pts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dts"));
    public static VarHandle dts$VH() {
        return AVCodecParserContext.dts$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t dts;
     * }
     */
    public static long dts$get(MemorySegment seg) {
        return (long)AVCodecParserContext.dts$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t dts;
     * }
     */
    public static void dts$set(MemorySegment seg, long x) {
        AVCodecParserContext.dts$VH.set(seg, x);
    }
    public static long dts$get(MemorySegment seg, long index) {
        return (long)AVCodecParserContext.dts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dts$set(MemorySegment seg, long index, long x) {
        AVCodecParserContext.dts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle last_pts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("last_pts"));
    public static VarHandle last_pts$VH() {
        return AVCodecParserContext.last_pts$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t last_pts;
     * }
     */
    public static long last_pts$get(MemorySegment seg) {
        return (long)AVCodecParserContext.last_pts$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t last_pts;
     * }
     */
    public static void last_pts$set(MemorySegment seg, long x) {
        AVCodecParserContext.last_pts$VH.set(seg, x);
    }
    public static long last_pts$get(MemorySegment seg, long index) {
        return (long)AVCodecParserContext.last_pts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void last_pts$set(MemorySegment seg, long index, long x) {
        AVCodecParserContext.last_pts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle last_dts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("last_dts"));
    public static VarHandle last_dts$VH() {
        return AVCodecParserContext.last_dts$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t last_dts;
     * }
     */
    public static long last_dts$get(MemorySegment seg) {
        return (long)AVCodecParserContext.last_dts$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t last_dts;
     * }
     */
    public static void last_dts$set(MemorySegment seg, long x) {
        AVCodecParserContext.last_dts$VH.set(seg, x);
    }
    public static long last_dts$get(MemorySegment seg, long index) {
        return (long)AVCodecParserContext.last_dts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void last_dts$set(MemorySegment seg, long index, long x) {
        AVCodecParserContext.last_dts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fetch_timestamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fetch_timestamp"));
    public static VarHandle fetch_timestamp$VH() {
        return AVCodecParserContext.fetch_timestamp$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int fetch_timestamp;
     * }
     */
    public static int fetch_timestamp$get(MemorySegment seg) {
        return (int)AVCodecParserContext.fetch_timestamp$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int fetch_timestamp;
     * }
     */
    public static void fetch_timestamp$set(MemorySegment seg, int x) {
        AVCodecParserContext.fetch_timestamp$VH.set(seg, x);
    }
    public static int fetch_timestamp$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.fetch_timestamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fetch_timestamp$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.fetch_timestamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cur_frame_start_index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cur_frame_start_index"));
    public static VarHandle cur_frame_start_index$VH() {
        return AVCodecParserContext.cur_frame_start_index$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cur_frame_start_index;
     * }
     */
    public static int cur_frame_start_index$get(MemorySegment seg) {
        return (int)AVCodecParserContext.cur_frame_start_index$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cur_frame_start_index;
     * }
     */
    public static void cur_frame_start_index$set(MemorySegment seg, int x) {
        AVCodecParserContext.cur_frame_start_index$VH.set(seg, x);
    }
    public static int cur_frame_start_index$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.cur_frame_start_index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cur_frame_start_index$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.cur_frame_start_index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment cur_frame_offset$slice(MemorySegment seg) {
        return seg.asSlice(88, 32);
    }
    public static MemorySegment cur_frame_pts$slice(MemorySegment seg) {
        return seg.asSlice(120, 32);
    }
    public static MemorySegment cur_frame_dts$slice(MemorySegment seg) {
        return seg.asSlice(152, 32);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return AVCodecParserContext.flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)AVCodecParserContext.flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        AVCodecParserContext.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offset"));
    public static VarHandle offset$VH() {
        return AVCodecParserContext.offset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t offset;
     * }
     */
    public static long offset$get(MemorySegment seg) {
        return (long)AVCodecParserContext.offset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t offset;
     * }
     */
    public static void offset$set(MemorySegment seg, long x) {
        AVCodecParserContext.offset$VH.set(seg, x);
    }
    public static long offset$get(MemorySegment seg, long index) {
        return (long)AVCodecParserContext.offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, long x) {
        AVCodecParserContext.offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment cur_frame_end$slice(MemorySegment seg) {
        return seg.asSlice(200, 32);
    }
    static final VarHandle key_frame$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("key_frame"));
    public static VarHandle key_frame$VH() {
        return AVCodecParserContext.key_frame$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int key_frame;
     * }
     */
    public static int key_frame$get(MemorySegment seg) {
        return (int)AVCodecParserContext.key_frame$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int key_frame;
     * }
     */
    public static void key_frame$set(MemorySegment seg, int x) {
        AVCodecParserContext.key_frame$VH.set(seg, x);
    }
    public static int key_frame$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.key_frame$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void key_frame$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.key_frame$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dts_sync_point$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dts_sync_point"));
    public static VarHandle dts_sync_point$VH() {
        return AVCodecParserContext.dts_sync_point$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dts_sync_point;
     * }
     */
    public static int dts_sync_point$get(MemorySegment seg) {
        return (int)AVCodecParserContext.dts_sync_point$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dts_sync_point;
     * }
     */
    public static void dts_sync_point$set(MemorySegment seg, int x) {
        AVCodecParserContext.dts_sync_point$VH.set(seg, x);
    }
    public static int dts_sync_point$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.dts_sync_point$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dts_sync_point$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.dts_sync_point$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dts_ref_dts_delta$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dts_ref_dts_delta"));
    public static VarHandle dts_ref_dts_delta$VH() {
        return AVCodecParserContext.dts_ref_dts_delta$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dts_ref_dts_delta;
     * }
     */
    public static int dts_ref_dts_delta$get(MemorySegment seg) {
        return (int)AVCodecParserContext.dts_ref_dts_delta$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dts_ref_dts_delta;
     * }
     */
    public static void dts_ref_dts_delta$set(MemorySegment seg, int x) {
        AVCodecParserContext.dts_ref_dts_delta$VH.set(seg, x);
    }
    public static int dts_ref_dts_delta$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.dts_ref_dts_delta$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dts_ref_dts_delta$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.dts_ref_dts_delta$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pts_dts_delta$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pts_dts_delta"));
    public static VarHandle pts_dts_delta$VH() {
        return AVCodecParserContext.pts_dts_delta$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pts_dts_delta;
     * }
     */
    public static int pts_dts_delta$get(MemorySegment seg) {
        return (int)AVCodecParserContext.pts_dts_delta$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pts_dts_delta;
     * }
     */
    public static void pts_dts_delta$set(MemorySegment seg, int x) {
        AVCodecParserContext.pts_dts_delta$VH.set(seg, x);
    }
    public static int pts_dts_delta$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.pts_dts_delta$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pts_dts_delta$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.pts_dts_delta$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment cur_frame_pos$slice(MemorySegment seg) {
        return seg.asSlice(248, 32);
    }
    static final VarHandle pos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pos"));
    public static VarHandle pos$VH() {
        return AVCodecParserContext.pos$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t pos;
     * }
     */
    public static long pos$get(MemorySegment seg) {
        return (long)AVCodecParserContext.pos$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t pos;
     * }
     */
    public static void pos$set(MemorySegment seg, long x) {
        AVCodecParserContext.pos$VH.set(seg, x);
    }
    public static long pos$get(MemorySegment seg, long index) {
        return (long)AVCodecParserContext.pos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pos$set(MemorySegment seg, long index, long x) {
        AVCodecParserContext.pos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle last_pos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("last_pos"));
    public static VarHandle last_pos$VH() {
        return AVCodecParserContext.last_pos$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t last_pos;
     * }
     */
    public static long last_pos$get(MemorySegment seg) {
        return (long)AVCodecParserContext.last_pos$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t last_pos;
     * }
     */
    public static void last_pos$set(MemorySegment seg, long x) {
        AVCodecParserContext.last_pos$VH.set(seg, x);
    }
    public static long last_pos$get(MemorySegment seg, long index) {
        return (long)AVCodecParserContext.last_pos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void last_pos$set(MemorySegment seg, long index, long x) {
        AVCodecParserContext.last_pos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle duration$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("duration"));
    public static VarHandle duration$VH() {
        return AVCodecParserContext.duration$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int duration;
     * }
     */
    public static int duration$get(MemorySegment seg) {
        return (int)AVCodecParserContext.duration$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int duration;
     * }
     */
    public static void duration$set(MemorySegment seg, int x) {
        AVCodecParserContext.duration$VH.set(seg, x);
    }
    public static int duration$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.duration$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void duration$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.duration$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle field_order$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("field_order"));
    public static VarHandle field_order$VH() {
        return AVCodecParserContext.field_order$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVFieldOrder field_order;
     * }
     */
    public static int field_order$get(MemorySegment seg) {
        return (int)AVCodecParserContext.field_order$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVFieldOrder field_order;
     * }
     */
    public static void field_order$set(MemorySegment seg, int x) {
        AVCodecParserContext.field_order$VH.set(seg, x);
    }
    public static int field_order$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.field_order$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void field_order$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.field_order$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle picture_structure$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("picture_structure"));
    public static VarHandle picture_structure$VH() {
        return AVCodecParserContext.picture_structure$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVPictureStructure picture_structure;
     * }
     */
    public static int picture_structure$get(MemorySegment seg) {
        return (int)AVCodecParserContext.picture_structure$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVPictureStructure picture_structure;
     * }
     */
    public static void picture_structure$set(MemorySegment seg, int x) {
        AVCodecParserContext.picture_structure$VH.set(seg, x);
    }
    public static int picture_structure$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.picture_structure$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void picture_structure$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.picture_structure$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle output_picture_number$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("output_picture_number"));
    public static VarHandle output_picture_number$VH() {
        return AVCodecParserContext.output_picture_number$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int output_picture_number;
     * }
     */
    public static int output_picture_number$get(MemorySegment seg) {
        return (int)AVCodecParserContext.output_picture_number$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int output_picture_number;
     * }
     */
    public static void output_picture_number$set(MemorySegment seg, int x) {
        AVCodecParserContext.output_picture_number$VH.set(seg, x);
    }
    public static int output_picture_number$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.output_picture_number$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void output_picture_number$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.output_picture_number$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return AVCodecParserContext.width$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static int width$get(MemorySegment seg) {
        return (int)AVCodecParserContext.width$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static void width$set(MemorySegment seg, int x) {
        AVCodecParserContext.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return AVCodecParserContext.height$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static int height$get(MemorySegment seg) {
        return (int)AVCodecParserContext.height$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static void height$set(MemorySegment seg, int x) {
        AVCodecParserContext.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle coded_width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("coded_width"));
    public static VarHandle coded_width$VH() {
        return AVCodecParserContext.coded_width$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int coded_width;
     * }
     */
    public static int coded_width$get(MemorySegment seg) {
        return (int)AVCodecParserContext.coded_width$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int coded_width;
     * }
     */
    public static void coded_width$set(MemorySegment seg, int x) {
        AVCodecParserContext.coded_width$VH.set(seg, x);
    }
    public static int coded_width$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.coded_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void coded_width$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.coded_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle coded_height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("coded_height"));
    public static VarHandle coded_height$VH() {
        return AVCodecParserContext.coded_height$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int coded_height;
     * }
     */
    public static int coded_height$get(MemorySegment seg) {
        return (int)AVCodecParserContext.coded_height$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int coded_height;
     * }
     */
    public static void coded_height$set(MemorySegment seg, int x) {
        AVCodecParserContext.coded_height$VH.set(seg, x);
    }
    public static int coded_height$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.coded_height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void coded_height$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.coded_height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle format$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("format"));
    public static VarHandle format$VH() {
        return AVCodecParserContext.format$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int format;
     * }
     */
    public static int format$get(MemorySegment seg) {
        return (int)AVCodecParserContext.format$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int format;
     * }
     */
    public static void format$set(MemorySegment seg, int x) {
        AVCodecParserContext.format$VH.set(seg, x);
    }
    public static int format$get(MemorySegment seg, long index) {
        return (int)AVCodecParserContext.format$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void format$set(MemorySegment seg, long index, int x) {
        AVCodecParserContext.format$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


