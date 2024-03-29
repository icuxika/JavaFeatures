// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVCodecParser {
 *     int codec_ids[7];
 *     int priv_data_size;
 *     int (*parser_init)(AVCodecParserContext*);
 *     int (*parser_parse)(AVCodecParserContext*,AVCodecContext*,const uint8_t**,int*,const uint8_t*,int);
 *     void (*parser_close)(AVCodecParserContext*);
 *     int (*split)(AVCodecContext*,const uint8_t*,int);
 * };
 * }
 */
public class AVCodecParser {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(7, Constants$root.C_LONG$LAYOUT).withName("codec_ids"),
        Constants$root.C_LONG$LAYOUT.withName("priv_data_size"),
        Constants$root.C_POINTER$LAYOUT.withName("parser_init"),
        Constants$root.C_POINTER$LAYOUT.withName("parser_parse"),
        Constants$root.C_POINTER$LAYOUT.withName("parser_close"),
        Constants$root.C_POINTER$LAYOUT.withName("split")
    ).withName("AVCodecParser");
    public static MemoryLayout $LAYOUT() {
        return AVCodecParser.$struct$LAYOUT;
    }
    public static MemorySegment codec_ids$slice(MemorySegment seg) {
        return seg.asSlice(0, 28);
    }
    static final VarHandle priv_data_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priv_data_size"));
    public static VarHandle priv_data_size$VH() {
        return AVCodecParser.priv_data_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int priv_data_size;
     * }
     */
    public static int priv_data_size$get(MemorySegment seg) {
        return (int)AVCodecParser.priv_data_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int priv_data_size;
     * }
     */
    public static void priv_data_size$set(MemorySegment seg, int x) {
        AVCodecParser.priv_data_size$VH.set(seg, x);
    }
    public static int priv_data_size$get(MemorySegment seg, long index) {
        return (int)AVCodecParser.priv_data_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priv_data_size$set(MemorySegment seg, long index, int x) {
        AVCodecParser.priv_data_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor parser_init$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor parser_init_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle parser_init_UP$MH = RuntimeHelper.upcallHandle(parser_init.class, "apply", AVCodecParser.parser_init_UP$FUNC);
    static final FunctionDescriptor parser_init_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle parser_init_DOWN$MH = RuntimeHelper.downcallHandle(
        AVCodecParser.parser_init_DOWN$FUNC
    );
    /**
     * {@snippet :
 * int (*parser_init)(AVCodecParserContext*);
     * }
     */
    public interface parser_init {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(parser_init fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(AVCodecParser.parser_init_UP$MH, fi, AVCodecParser.parser_init$FUNC, scope);
        }
        static parser_init ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)AVCodecParser.parser_init_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle parser_init$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("parser_init"));
    public static VarHandle parser_init$VH() {
        return AVCodecParser.parser_init$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*parser_init)(AVCodecParserContext*);
     * }
     */
    public static MemorySegment parser_init$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVCodecParser.parser_init$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*parser_init)(AVCodecParserContext*);
     * }
     */
    public static void parser_init$set(MemorySegment seg, MemorySegment x) {
        AVCodecParser.parser_init$VH.set(seg, x);
    }
    public static MemorySegment parser_init$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVCodecParser.parser_init$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void parser_init$set(MemorySegment seg, long index, MemorySegment x) {
        AVCodecParser.parser_init$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static parser_init parser_init(MemorySegment segment, SegmentScope scope) {
        return parser_init.ofAddress(parser_init$get(segment), scope);
    }
    static final FunctionDescriptor parser_parse$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor parser_parse_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle parser_parse_UP$MH = RuntimeHelper.upcallHandle(parser_parse.class, "apply", AVCodecParser.parser_parse_UP$FUNC);
    static final FunctionDescriptor parser_parse_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle parser_parse_DOWN$MH = RuntimeHelper.downcallHandle(
        AVCodecParser.parser_parse_DOWN$FUNC
    );
    /**
     * {@snippet :
 * int (*parser_parse)(AVCodecParserContext*,AVCodecContext*,const uint8_t**,int*,const uint8_t*,int);
     * }
     */
    public interface parser_parse {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, int _x5);
        static MemorySegment allocate(parser_parse fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(AVCodecParser.parser_parse_UP$MH, fi, AVCodecParser.parser_parse$FUNC, scope);
        }
        static parser_parse ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, int __x5) -> {
                try {
                    return (int)AVCodecParser.parser_parse_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle parser_parse$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("parser_parse"));
    public static VarHandle parser_parse$VH() {
        return AVCodecParser.parser_parse$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*parser_parse)(AVCodecParserContext*,AVCodecContext*,const uint8_t**,int*,const uint8_t*,int);
     * }
     */
    public static MemorySegment parser_parse$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVCodecParser.parser_parse$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*parser_parse)(AVCodecParserContext*,AVCodecContext*,const uint8_t**,int*,const uint8_t*,int);
     * }
     */
    public static void parser_parse$set(MemorySegment seg, MemorySegment x) {
        AVCodecParser.parser_parse$VH.set(seg, x);
    }
    public static MemorySegment parser_parse$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVCodecParser.parser_parse$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void parser_parse$set(MemorySegment seg, long index, MemorySegment x) {
        AVCodecParser.parser_parse$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static parser_parse parser_parse(MemorySegment segment, SegmentScope scope) {
        return parser_parse.ofAddress(parser_parse$get(segment), scope);
    }
    static final FunctionDescriptor parser_close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor parser_close_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle parser_close_UP$MH = RuntimeHelper.upcallHandle(parser_close.class, "apply", AVCodecParser.parser_close_UP$FUNC);
    static final FunctionDescriptor parser_close_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle parser_close_DOWN$MH = RuntimeHelper.downcallHandle(
        AVCodecParser.parser_close_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*parser_close)(AVCodecParserContext*);
     * }
     */
    public interface parser_close {

        void apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(parser_close fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(AVCodecParser.parser_close_UP$MH, fi, AVCodecParser.parser_close$FUNC, scope);
        }
        static parser_close ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    AVCodecParser.parser_close_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle parser_close$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("parser_close"));
    public static VarHandle parser_close$VH() {
        return AVCodecParser.parser_close$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*parser_close)(AVCodecParserContext*);
     * }
     */
    public static MemorySegment parser_close$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVCodecParser.parser_close$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*parser_close)(AVCodecParserContext*);
     * }
     */
    public static void parser_close$set(MemorySegment seg, MemorySegment x) {
        AVCodecParser.parser_close$VH.set(seg, x);
    }
    public static MemorySegment parser_close$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVCodecParser.parser_close$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void parser_close$set(MemorySegment seg, long index, MemorySegment x) {
        AVCodecParser.parser_close$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static parser_close parser_close(MemorySegment segment, SegmentScope scope) {
        return parser_close.ofAddress(parser_close$get(segment), scope);
    }
    static final FunctionDescriptor split$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor split_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle split_UP$MH = RuntimeHelper.upcallHandle(split.class, "apply", AVCodecParser.split_UP$FUNC);
    static final FunctionDescriptor split_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle split_DOWN$MH = RuntimeHelper.downcallHandle(
        AVCodecParser.split_DOWN$FUNC
    );
    /**
     * {@snippet :
 * int (*split)(AVCodecContext*,const uint8_t*,int);
     * }
     */
    public interface split {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2);
        static MemorySegment allocate(split fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(AVCodecParser.split_UP$MH, fi, AVCodecParser.split$FUNC, scope);
        }
        static split ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2) -> {
                try {
                    return (int)AVCodecParser.split_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle split$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("split"));
    public static VarHandle split$VH() {
        return AVCodecParser.split$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*split)(AVCodecContext*,const uint8_t*,int);
     * }
     */
    public static MemorySegment split$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVCodecParser.split$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*split)(AVCodecContext*,const uint8_t*,int);
     * }
     */
    public static void split$set(MemorySegment seg, MemorySegment x) {
        AVCodecParser.split$VH.set(seg, x);
    }
    public static MemorySegment split$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVCodecParser.split$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void split$set(MemorySegment seg, long index, MemorySegment x) {
        AVCodecParser.split$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static split split(MemorySegment segment, SegmentScope scope) {
        return split.ofAddress(split$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


