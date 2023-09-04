// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVChannelCustom {
 *     enum AVChannel id;
 *     char name[16];
 *     void* opaque;
 * };
 * }
 */
public class AVChannelCustom {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("id"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("name"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("opaque")
    ).withName("AVChannelCustom");
    public static MemoryLayout $LAYOUT() {
        return AVChannelCustom.$struct$LAYOUT;
    }
    static final VarHandle id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("id"));
    public static VarHandle id$VH() {
        return AVChannelCustom.id$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVChannel id;
     * }
     */
    public static int id$get(MemorySegment seg) {
        return (int)AVChannelCustom.id$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVChannel id;
     * }
     */
    public static void id$set(MemorySegment seg, int x) {
        AVChannelCustom.id$VH.set(seg, x);
    }
    public static int id$get(MemorySegment seg, long index) {
        return (int)AVChannelCustom.id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, int x) {
        AVChannelCustom.id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment name$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    static final VarHandle opaque$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("opaque"));
    public static VarHandle opaque$VH() {
        return AVChannelCustom.opaque$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* opaque;
     * }
     */
    public static MemorySegment opaque$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVChannelCustom.opaque$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* opaque;
     * }
     */
    public static void opaque$set(MemorySegment seg, MemorySegment x) {
        AVChannelCustom.opaque$VH.set(seg, x);
    }
    public static MemorySegment opaque$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVChannelCustom.opaque$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void opaque$set(MemorySegment seg, long index, MemorySegment x) {
        AVChannelCustom.opaque$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


