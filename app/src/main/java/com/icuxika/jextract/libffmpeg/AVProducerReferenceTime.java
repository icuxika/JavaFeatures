// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVProducerReferenceTime {
 *     int64_t wallclock;
 *     int flags;
 * };
 * }
 */
public class AVProducerReferenceTime {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("wallclock"),
        Constants$root.C_LONG$LAYOUT.withName("flags"),
        MemoryLayout.paddingLayout(32)
    ).withName("AVProducerReferenceTime");
    public static MemoryLayout $LAYOUT() {
        return AVProducerReferenceTime.$struct$LAYOUT;
    }
    static final VarHandle wallclock$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wallclock"));
    public static VarHandle wallclock$VH() {
        return AVProducerReferenceTime.wallclock$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t wallclock;
     * }
     */
    public static long wallclock$get(MemorySegment seg) {
        return (long)AVProducerReferenceTime.wallclock$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t wallclock;
     * }
     */
    public static void wallclock$set(MemorySegment seg, long x) {
        AVProducerReferenceTime.wallclock$VH.set(seg, x);
    }
    public static long wallclock$get(MemorySegment seg, long index) {
        return (long)AVProducerReferenceTime.wallclock$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wallclock$set(MemorySegment seg, long index, long x) {
        AVProducerReferenceTime.wallclock$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return AVProducerReferenceTime.flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)AVProducerReferenceTime.flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        AVProducerReferenceTime.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)AVProducerReferenceTime.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        AVProducerReferenceTime.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

