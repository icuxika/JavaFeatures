// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union {
 *     unsigned short _Word[4];
 *     float _Float;
 *     double _Double;
 *     long double _Long_double;
 * };
 * }
 */
public class _float_const {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, Constants$root.C_SHORT$LAYOUT).withName("_Word"),
        Constants$root.C_FLOAT$LAYOUT.withName("_Float"),
        Constants$root.C_DOUBLE$LAYOUT.withName("_Double"),
        MemoryLayout.paddingLayout(128).withName("_Long_double")
    );
    public static MemoryLayout $LAYOUT() {
        return _float_const.$union$LAYOUT;
    }
    public static MemorySegment _Word$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle _Float$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_Float"));
    public static VarHandle _Float$VH() {
        return _float_const._Float$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float _Float;
     * }
     */
    public static float _Float$get(MemorySegment seg) {
        return (float)_float_const._Float$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float _Float;
     * }
     */
    public static void _Float$set(MemorySegment seg, float x) {
        _float_const._Float$VH.set(seg, x);
    }
    public static float _Float$get(MemorySegment seg, long index) {
        return (float)_float_const._Float$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _Float$set(MemorySegment seg, long index, float x) {
        _float_const._Float$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _Double$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_Double"));
    public static VarHandle _Double$VH() {
        return _float_const._Double$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double _Double;
     * }
     */
    public static double _Double$get(MemorySegment seg) {
        return (double)_float_const._Double$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double _Double;
     * }
     */
    public static void _Double$set(MemorySegment seg, double x) {
        _float_const._Double$VH.set(seg, x);
    }
    public static double _Double$get(MemorySegment seg, long index) {
        return (double)_float_const._Double$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _Double$set(MemorySegment seg, long index, double x) {
        _float_const._Double$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

