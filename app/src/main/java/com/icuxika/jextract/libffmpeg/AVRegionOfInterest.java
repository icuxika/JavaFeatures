// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVRegionOfInterest {
 *     uint32_t self_size;
 *     int top;
 *     int bottom;
 *     int left;
 *     int right;
 *     AVRational qoffset;
 * };
 * }
 */
public class AVRegionOfInterest {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("self_size"),
        Constants$root.C_LONG$LAYOUT.withName("top"),
        Constants$root.C_LONG$LAYOUT.withName("bottom"),
        Constants$root.C_LONG$LAYOUT.withName("left"),
        Constants$root.C_LONG$LAYOUT.withName("right"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("num"),
            Constants$root.C_LONG$LAYOUT.withName("den")
        ).withName("qoffset")
    ).withName("AVRegionOfInterest");
    public static MemoryLayout $LAYOUT() {
        return AVRegionOfInterest.$struct$LAYOUT;
    }
    static final VarHandle self_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("self_size"));
    public static VarHandle self_size$VH() {
        return AVRegionOfInterest.self_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t self_size;
     * }
     */
    public static int self_size$get(MemorySegment seg) {
        return (int)AVRegionOfInterest.self_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t self_size;
     * }
     */
    public static void self_size$set(MemorySegment seg, int x) {
        AVRegionOfInterest.self_size$VH.set(seg, x);
    }
    public static int self_size$get(MemorySegment seg, long index) {
        return (int)AVRegionOfInterest.self_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void self_size$set(MemorySegment seg, long index, int x) {
        AVRegionOfInterest.self_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle top$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("top"));
    public static VarHandle top$VH() {
        return AVRegionOfInterest.top$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int top;
     * }
     */
    public static int top$get(MemorySegment seg) {
        return (int)AVRegionOfInterest.top$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int top;
     * }
     */
    public static void top$set(MemorySegment seg, int x) {
        AVRegionOfInterest.top$VH.set(seg, x);
    }
    public static int top$get(MemorySegment seg, long index) {
        return (int)AVRegionOfInterest.top$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void top$set(MemorySegment seg, long index, int x) {
        AVRegionOfInterest.top$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bottom$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bottom"));
    public static VarHandle bottom$VH() {
        return AVRegionOfInterest.bottom$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int bottom;
     * }
     */
    public static int bottom$get(MemorySegment seg) {
        return (int)AVRegionOfInterest.bottom$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int bottom;
     * }
     */
    public static void bottom$set(MemorySegment seg, int x) {
        AVRegionOfInterest.bottom$VH.set(seg, x);
    }
    public static int bottom$get(MemorySegment seg, long index) {
        return (int)AVRegionOfInterest.bottom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bottom$set(MemorySegment seg, long index, int x) {
        AVRegionOfInterest.bottom$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle left$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("left"));
    public static VarHandle left$VH() {
        return AVRegionOfInterest.left$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int left;
     * }
     */
    public static int left$get(MemorySegment seg) {
        return (int)AVRegionOfInterest.left$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int left;
     * }
     */
    public static void left$set(MemorySegment seg, int x) {
        AVRegionOfInterest.left$VH.set(seg, x);
    }
    public static int left$get(MemorySegment seg, long index) {
        return (int)AVRegionOfInterest.left$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void left$set(MemorySegment seg, long index, int x) {
        AVRegionOfInterest.left$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle right$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("right"));
    public static VarHandle right$VH() {
        return AVRegionOfInterest.right$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int right;
     * }
     */
    public static int right$get(MemorySegment seg) {
        return (int)AVRegionOfInterest.right$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int right;
     * }
     */
    public static void right$set(MemorySegment seg, int x) {
        AVRegionOfInterest.right$VH.set(seg, x);
    }
    public static int right$get(MemorySegment seg, long index) {
        return (int)AVRegionOfInterest.right$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void right$set(MemorySegment seg, long index, int x) {
        AVRegionOfInterest.right$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment qoffset$slice(MemorySegment seg) {
        return seg.asSlice(20, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


