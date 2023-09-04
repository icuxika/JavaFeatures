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
 *     unsigned short _Sh[4];
 *     double _Val;
 * };
 * }
 */
public class _double_val {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, Constants$root.C_SHORT$LAYOUT).withName("_Sh"),
        Constants$root.C_DOUBLE$LAYOUT.withName("_Val")
    );
    public static MemoryLayout $LAYOUT() {
        return _double_val.$union$LAYOUT;
    }
    public static MemorySegment _Sh$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle _Val$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_Val"));
    public static VarHandle _Val$VH() {
        return _double_val._Val$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double _Val;
     * }
     */
    public static double _Val$get(MemorySegment seg) {
        return (double)_double_val._Val$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double _Val;
     * }
     */
    public static void _Val$set(MemorySegment seg, double x) {
        _double_val._Val$VH.set(seg, x);
    }
    public static double _Val$get(MemorySegment seg, long index) {
        return (double)_double_val._Val$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _Val$set(MemorySegment seg, long index, double x) {
        _double_val._Val$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


