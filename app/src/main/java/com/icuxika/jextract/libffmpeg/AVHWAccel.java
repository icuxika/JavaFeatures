// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVHWAccel {
 *     char* name;
 *     enum AVMediaType type;
 *     enum AVCodecID id;
 *     enum AVPixelFormat pix_fmt;
 *     int capabilities;
 *     int (*alloc_frame)(AVCodecContext*,AVFrame*);
 *     int (*start_frame)(AVCodecContext*,const uint8_t*,uint32_t);
 *     int (*decode_params)(AVCodecContext*,int,const uint8_t*,uint32_t);
 *     int (*decode_slice)(AVCodecContext*,const uint8_t*,uint32_t);
 *     int (*end_frame)(AVCodecContext*);
 *     int frame_priv_data_size;
 *     int (*init)(AVCodecContext*);
 *     int (*uninit)(AVCodecContext*);
 *     int priv_data_size;
 *     int caps_internal;
 *     int (*frame_params)(AVCodecContext*,AVBufferRef*);
 * };
 * }
 */
public class AVHWAccel {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("name"),
        Constants$root.C_LONG$LAYOUT.withName("type"),
        Constants$root.C_LONG$LAYOUT.withName("id"),
        Constants$root.C_LONG$LAYOUT.withName("pix_fmt"),
        Constants$root.C_LONG$LAYOUT.withName("capabilities"),
        Constants$root.C_POINTER$LAYOUT.withName("alloc_frame"),
        Constants$root.C_POINTER$LAYOUT.withName("start_frame"),
        Constants$root.C_POINTER$LAYOUT.withName("decode_params"),
        Constants$root.C_POINTER$LAYOUT.withName("decode_slice"),
        Constants$root.C_POINTER$LAYOUT.withName("end_frame"),
        Constants$root.C_LONG$LAYOUT.withName("frame_priv_data_size"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("init"),
        Constants$root.C_POINTER$LAYOUT.withName("uninit"),
        Constants$root.C_LONG$LAYOUT.withName("priv_data_size"),
        Constants$root.C_LONG$LAYOUT.withName("caps_internal"),
        Constants$root.C_POINTER$LAYOUT.withName("frame_params")
    ).withName("AVHWAccel");
    public static MemoryLayout $LAYOUT() {
        return AVHWAccel.$struct$LAYOUT;
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return AVHWAccel.name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        AVHWAccel.name$VH.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        AVHWAccel.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return AVHWAccel.type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVMediaType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)AVHWAccel.type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVMediaType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        AVHWAccel.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)AVHWAccel.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        AVHWAccel.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("id"));
    public static VarHandle id$VH() {
        return AVHWAccel.id$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVCodecID id;
     * }
     */
    public static int id$get(MemorySegment seg) {
        return (int)AVHWAccel.id$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVCodecID id;
     * }
     */
    public static void id$set(MemorySegment seg, int x) {
        AVHWAccel.id$VH.set(seg, x);
    }
    public static int id$get(MemorySegment seg, long index) {
        return (int)AVHWAccel.id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, int x) {
        AVHWAccel.id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pix_fmt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pix_fmt"));
    public static VarHandle pix_fmt$VH() {
        return AVHWAccel.pix_fmt$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVPixelFormat pix_fmt;
     * }
     */
    public static int pix_fmt$get(MemorySegment seg) {
        return (int)AVHWAccel.pix_fmt$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVPixelFormat pix_fmt;
     * }
     */
    public static void pix_fmt$set(MemorySegment seg, int x) {
        AVHWAccel.pix_fmt$VH.set(seg, x);
    }
    public static int pix_fmt$get(MemorySegment seg, long index) {
        return (int)AVHWAccel.pix_fmt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pix_fmt$set(MemorySegment seg, long index, int x) {
        AVHWAccel.pix_fmt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle capabilities$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("capabilities"));
    public static VarHandle capabilities$VH() {
        return AVHWAccel.capabilities$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int capabilities;
     * }
     */
    public static int capabilities$get(MemorySegment seg) {
        return (int)AVHWAccel.capabilities$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int capabilities;
     * }
     */
    public static void capabilities$set(MemorySegment seg, int x) {
        AVHWAccel.capabilities$VH.set(seg, x);
    }
    public static int capabilities$get(MemorySegment seg, long index) {
        return (int)AVHWAccel.capabilities$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void capabilities$set(MemorySegment seg, long index, int x) {
        AVHWAccel.capabilities$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor alloc_frame$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor alloc_frame_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle alloc_frame_UP$MH = RuntimeHelper.upcallHandle(alloc_frame.class, "apply", AVHWAccel.alloc_frame_UP$FUNC);
    static final FunctionDescriptor alloc_frame_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle alloc_frame_DOWN$MH = RuntimeHelper.downcallHandle(
        AVHWAccel.alloc_frame_DOWN$FUNC
    );
    /**
     * {@snippet :
 * int (*alloc_frame)(AVCodecContext*,AVFrame*);
     * }
     */
    public interface alloc_frame {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(alloc_frame fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(AVHWAccel.alloc_frame_UP$MH, fi, AVHWAccel.alloc_frame$FUNC, scope);
        }
        static alloc_frame ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)AVHWAccel.alloc_frame_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle alloc_frame$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("alloc_frame"));
    public static VarHandle alloc_frame$VH() {
        return AVHWAccel.alloc_frame$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*alloc_frame)(AVCodecContext*,AVFrame*);
     * }
     */
    public static MemorySegment alloc_frame$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.alloc_frame$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*alloc_frame)(AVCodecContext*,AVFrame*);
     * }
     */
    public static void alloc_frame$set(MemorySegment seg, MemorySegment x) {
        AVHWAccel.alloc_frame$VH.set(seg, x);
    }
    public static MemorySegment alloc_frame$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.alloc_frame$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void alloc_frame$set(MemorySegment seg, long index, MemorySegment x) {
        AVHWAccel.alloc_frame$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static alloc_frame alloc_frame(MemorySegment segment, SegmentScope scope) {
        return alloc_frame.ofAddress(alloc_frame$get(segment), scope);
    }
    static final FunctionDescriptor start_frame$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor start_frame_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle start_frame_UP$MH = RuntimeHelper.upcallHandle(start_frame.class, "apply", AVHWAccel.start_frame_UP$FUNC);
    static final FunctionDescriptor start_frame_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle start_frame_DOWN$MH = RuntimeHelper.downcallHandle(
        AVHWAccel.start_frame_DOWN$FUNC
    );
    /**
     * {@snippet :
 * int (*start_frame)(AVCodecContext*,const uint8_t*,uint32_t);
     * }
     */
    public interface start_frame {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2);
        static MemorySegment allocate(start_frame fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(AVHWAccel.start_frame_UP$MH, fi, AVHWAccel.start_frame$FUNC, scope);
        }
        static start_frame ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2) -> {
                try {
                    return (int)AVHWAccel.start_frame_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle start_frame$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("start_frame"));
    public static VarHandle start_frame$VH() {
        return AVHWAccel.start_frame$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*start_frame)(AVCodecContext*,const uint8_t*,uint32_t);
     * }
     */
    public static MemorySegment start_frame$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.start_frame$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*start_frame)(AVCodecContext*,const uint8_t*,uint32_t);
     * }
     */
    public static void start_frame$set(MemorySegment seg, MemorySegment x) {
        AVHWAccel.start_frame$VH.set(seg, x);
    }
    public static MemorySegment start_frame$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.start_frame$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void start_frame$set(MemorySegment seg, long index, MemorySegment x) {
        AVHWAccel.start_frame$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static start_frame start_frame(MemorySegment segment, SegmentScope scope) {
        return start_frame.ofAddress(start_frame$get(segment), scope);
    }
    static final FunctionDescriptor decode_params$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor decode_params_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle decode_params_UP$MH = RuntimeHelper.upcallHandle(decode_params.class, "apply", AVHWAccel.decode_params_UP$FUNC);
    static final FunctionDescriptor decode_params_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle decode_params_DOWN$MH = RuntimeHelper.downcallHandle(
        AVHWAccel.decode_params_DOWN$FUNC
    );
    /**
     * {@snippet :
 * int (*decode_params)(AVCodecContext*,int,const uint8_t*,uint32_t);
     * }
     */
    public interface decode_params {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, int _x3);
        static MemorySegment allocate(decode_params fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(AVHWAccel.decode_params_UP$MH, fi, AVHWAccel.decode_params$FUNC, scope);
        }
        static decode_params ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    return (int)AVHWAccel.decode_params_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle decode_params$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("decode_params"));
    public static VarHandle decode_params$VH() {
        return AVHWAccel.decode_params$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*decode_params)(AVCodecContext*,int,const uint8_t*,uint32_t);
     * }
     */
    public static MemorySegment decode_params$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.decode_params$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*decode_params)(AVCodecContext*,int,const uint8_t*,uint32_t);
     * }
     */
    public static void decode_params$set(MemorySegment seg, MemorySegment x) {
        AVHWAccel.decode_params$VH.set(seg, x);
    }
    public static MemorySegment decode_params$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.decode_params$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void decode_params$set(MemorySegment seg, long index, MemorySegment x) {
        AVHWAccel.decode_params$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static decode_params decode_params(MemorySegment segment, SegmentScope scope) {
        return decode_params.ofAddress(decode_params$get(segment), scope);
    }
    static final FunctionDescriptor decode_slice$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor decode_slice_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle decode_slice_UP$MH = RuntimeHelper.upcallHandle(decode_slice.class, "apply", AVHWAccel.decode_slice_UP$FUNC);
    static final FunctionDescriptor decode_slice_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle decode_slice_DOWN$MH = RuntimeHelper.downcallHandle(
        AVHWAccel.decode_slice_DOWN$FUNC
    );
    /**
     * {@snippet :
 * int (*decode_slice)(AVCodecContext*,const uint8_t*,uint32_t);
     * }
     */
    public interface decode_slice {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2);
        static MemorySegment allocate(decode_slice fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(AVHWAccel.decode_slice_UP$MH, fi, AVHWAccel.decode_slice$FUNC, scope);
        }
        static decode_slice ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2) -> {
                try {
                    return (int)AVHWAccel.decode_slice_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle decode_slice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("decode_slice"));
    public static VarHandle decode_slice$VH() {
        return AVHWAccel.decode_slice$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*decode_slice)(AVCodecContext*,const uint8_t*,uint32_t);
     * }
     */
    public static MemorySegment decode_slice$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.decode_slice$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*decode_slice)(AVCodecContext*,const uint8_t*,uint32_t);
     * }
     */
    public static void decode_slice$set(MemorySegment seg, MemorySegment x) {
        AVHWAccel.decode_slice$VH.set(seg, x);
    }
    public static MemorySegment decode_slice$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.decode_slice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void decode_slice$set(MemorySegment seg, long index, MemorySegment x) {
        AVHWAccel.decode_slice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static decode_slice decode_slice(MemorySegment segment, SegmentScope scope) {
        return decode_slice.ofAddress(decode_slice$get(segment), scope);
    }
    static final FunctionDescriptor end_frame$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor end_frame_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle end_frame_UP$MH = RuntimeHelper.upcallHandle(end_frame.class, "apply", AVHWAccel.end_frame_UP$FUNC);
    static final FunctionDescriptor end_frame_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle end_frame_DOWN$MH = RuntimeHelper.downcallHandle(
        AVHWAccel.end_frame_DOWN$FUNC
    );
    /**
     * {@snippet :
 * int (*end_frame)(AVCodecContext*);
     * }
     */
    public interface end_frame {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(end_frame fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(AVHWAccel.end_frame_UP$MH, fi, AVHWAccel.end_frame$FUNC, scope);
        }
        static end_frame ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)AVHWAccel.end_frame_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle end_frame$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("end_frame"));
    public static VarHandle end_frame$VH() {
        return AVHWAccel.end_frame$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*end_frame)(AVCodecContext*);
     * }
     */
    public static MemorySegment end_frame$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.end_frame$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*end_frame)(AVCodecContext*);
     * }
     */
    public static void end_frame$set(MemorySegment seg, MemorySegment x) {
        AVHWAccel.end_frame$VH.set(seg, x);
    }
    public static MemorySegment end_frame$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.end_frame$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void end_frame$set(MemorySegment seg, long index, MemorySegment x) {
        AVHWAccel.end_frame$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static end_frame end_frame(MemorySegment segment, SegmentScope scope) {
        return end_frame.ofAddress(end_frame$get(segment), scope);
    }
    static final VarHandle frame_priv_data_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("frame_priv_data_size"));
    public static VarHandle frame_priv_data_size$VH() {
        return AVHWAccel.frame_priv_data_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int frame_priv_data_size;
     * }
     */
    public static int frame_priv_data_size$get(MemorySegment seg) {
        return (int)AVHWAccel.frame_priv_data_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int frame_priv_data_size;
     * }
     */
    public static void frame_priv_data_size$set(MemorySegment seg, int x) {
        AVHWAccel.frame_priv_data_size$VH.set(seg, x);
    }
    public static int frame_priv_data_size$get(MemorySegment seg, long index) {
        return (int)AVHWAccel.frame_priv_data_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void frame_priv_data_size$set(MemorySegment seg, long index, int x) {
        AVHWAccel.frame_priv_data_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor init$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor init_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle init_UP$MH = RuntimeHelper.upcallHandle(init.class, "apply", AVHWAccel.init_UP$FUNC);
    static final FunctionDescriptor init_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle init_DOWN$MH = RuntimeHelper.downcallHandle(
        AVHWAccel.init_DOWN$FUNC
    );
    /**
     * {@snippet :
 * int (*init)(AVCodecContext*);
     * }
     */
    public interface init {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(init fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(AVHWAccel.init_UP$MH, fi, AVHWAccel.init$FUNC, scope);
        }
        static init ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)AVHWAccel.init_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle init$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("init"));
    public static VarHandle init$VH() {
        return AVHWAccel.init$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*init)(AVCodecContext*);
     * }
     */
    public static MemorySegment init$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.init$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*init)(AVCodecContext*);
     * }
     */
    public static void init$set(MemorySegment seg, MemorySegment x) {
        AVHWAccel.init$VH.set(seg, x);
    }
    public static MemorySegment init$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.init$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void init$set(MemorySegment seg, long index, MemorySegment x) {
        AVHWAccel.init$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static init init(MemorySegment segment, SegmentScope scope) {
        return init.ofAddress(init$get(segment), scope);
    }
    static final FunctionDescriptor uninit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor uninit_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle uninit_UP$MH = RuntimeHelper.upcallHandle(uninit.class, "apply", AVHWAccel.uninit_UP$FUNC);
    static final FunctionDescriptor uninit_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle uninit_DOWN$MH = RuntimeHelper.downcallHandle(
        AVHWAccel.uninit_DOWN$FUNC
    );
    /**
     * {@snippet :
 * int (*uninit)(AVCodecContext*);
     * }
     */
    public interface uninit {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(uninit fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(AVHWAccel.uninit_UP$MH, fi, AVHWAccel.uninit$FUNC, scope);
        }
        static uninit ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)AVHWAccel.uninit_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle uninit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uninit"));
    public static VarHandle uninit$VH() {
        return AVHWAccel.uninit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*uninit)(AVCodecContext*);
     * }
     */
    public static MemorySegment uninit$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.uninit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*uninit)(AVCodecContext*);
     * }
     */
    public static void uninit$set(MemorySegment seg, MemorySegment x) {
        AVHWAccel.uninit$VH.set(seg, x);
    }
    public static MemorySegment uninit$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.uninit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uninit$set(MemorySegment seg, long index, MemorySegment x) {
        AVHWAccel.uninit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static uninit uninit(MemorySegment segment, SegmentScope scope) {
        return uninit.ofAddress(uninit$get(segment), scope);
    }
    static final VarHandle priv_data_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priv_data_size"));
    public static VarHandle priv_data_size$VH() {
        return AVHWAccel.priv_data_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int priv_data_size;
     * }
     */
    public static int priv_data_size$get(MemorySegment seg) {
        return (int)AVHWAccel.priv_data_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int priv_data_size;
     * }
     */
    public static void priv_data_size$set(MemorySegment seg, int x) {
        AVHWAccel.priv_data_size$VH.set(seg, x);
    }
    public static int priv_data_size$get(MemorySegment seg, long index) {
        return (int)AVHWAccel.priv_data_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priv_data_size$set(MemorySegment seg, long index, int x) {
        AVHWAccel.priv_data_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle caps_internal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("caps_internal"));
    public static VarHandle caps_internal$VH() {
        return AVHWAccel.caps_internal$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int caps_internal;
     * }
     */
    public static int caps_internal$get(MemorySegment seg) {
        return (int)AVHWAccel.caps_internal$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int caps_internal;
     * }
     */
    public static void caps_internal$set(MemorySegment seg, int x) {
        AVHWAccel.caps_internal$VH.set(seg, x);
    }
    public static int caps_internal$get(MemorySegment seg, long index) {
        return (int)AVHWAccel.caps_internal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void caps_internal$set(MemorySegment seg, long index, int x) {
        AVHWAccel.caps_internal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor frame_params$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor frame_params_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle frame_params_UP$MH = RuntimeHelper.upcallHandle(frame_params.class, "apply", AVHWAccel.frame_params_UP$FUNC);
    static final FunctionDescriptor frame_params_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle frame_params_DOWN$MH = RuntimeHelper.downcallHandle(
        AVHWAccel.frame_params_DOWN$FUNC
    );
    /**
     * {@snippet :
 * int (*frame_params)(AVCodecContext*,AVBufferRef*);
     * }
     */
    public interface frame_params {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(frame_params fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(AVHWAccel.frame_params_UP$MH, fi, AVHWAccel.frame_params$FUNC, scope);
        }
        static frame_params ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)AVHWAccel.frame_params_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle frame_params$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("frame_params"));
    public static VarHandle frame_params$VH() {
        return AVHWAccel.frame_params$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*frame_params)(AVCodecContext*,AVBufferRef*);
     * }
     */
    public static MemorySegment frame_params$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.frame_params$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*frame_params)(AVCodecContext*,AVBufferRef*);
     * }
     */
    public static void frame_params$set(MemorySegment seg, MemorySegment x) {
        AVHWAccel.frame_params$VH.set(seg, x);
    }
    public static MemorySegment frame_params$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVHWAccel.frame_params$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void frame_params$set(MemorySegment seg, long index, MemorySegment x) {
        AVHWAccel.frame_params$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static frame_params frame_params(MemorySegment segment, SegmentScope scope) {
        return frame_params.ofAddress(frame_params$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


