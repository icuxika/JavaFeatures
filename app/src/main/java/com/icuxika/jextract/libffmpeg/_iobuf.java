// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _iobuf {
 *     void* _Placeholder;
 * };
 * }
 */
public class _iobuf {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("_Placeholder")
    ).withName("_iobuf");
    public static MemoryLayout $LAYOUT() {
        return _iobuf.$struct$LAYOUT;
    }
    static final VarHandle _Placeholder$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_Placeholder"));
    public static VarHandle _Placeholder$VH() {
        return _iobuf._Placeholder$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* _Placeholder;
     * }
     */
    public static MemorySegment _Placeholder$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_iobuf._Placeholder$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* _Placeholder;
     * }
     */
    public static void _Placeholder$set(MemorySegment seg, MemorySegment x) {
        _iobuf._Placeholder$VH.set(seg, x);
    }
    public static MemorySegment _Placeholder$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_iobuf._Placeholder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _Placeholder$set(MemorySegment seg, long index, MemorySegment x) {
        _iobuf._Placeholder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


