// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVComponentDescriptor {
 *     int plane;
 *     int step;
 *     int offset;
 *     int shift;
 *     int depth;
 * };
 * }
 */
public class AVComponentDescriptor {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("plane"),
        Constants$root.C_LONG$LAYOUT.withName("step"),
        Constants$root.C_LONG$LAYOUT.withName("offset"),
        Constants$root.C_LONG$LAYOUT.withName("shift"),
        Constants$root.C_LONG$LAYOUT.withName("depth")
    ).withName("AVComponentDescriptor");
    public static MemoryLayout $LAYOUT() {
        return AVComponentDescriptor.$struct$LAYOUT;
    }
    static final VarHandle plane$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("plane"));
    public static VarHandle plane$VH() {
        return AVComponentDescriptor.plane$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int plane;
     * }
     */
    public static int plane$get(MemorySegment seg) {
        return (int)AVComponentDescriptor.plane$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int plane;
     * }
     */
    public static void plane$set(MemorySegment seg, int x) {
        AVComponentDescriptor.plane$VH.set(seg, x);
    }
    public static int plane$get(MemorySegment seg, long index) {
        return (int)AVComponentDescriptor.plane$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void plane$set(MemorySegment seg, long index, int x) {
        AVComponentDescriptor.plane$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle step$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("step"));
    public static VarHandle step$VH() {
        return AVComponentDescriptor.step$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int step;
     * }
     */
    public static int step$get(MemorySegment seg) {
        return (int)AVComponentDescriptor.step$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int step;
     * }
     */
    public static void step$set(MemorySegment seg, int x) {
        AVComponentDescriptor.step$VH.set(seg, x);
    }
    public static int step$get(MemorySegment seg, long index) {
        return (int)AVComponentDescriptor.step$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void step$set(MemorySegment seg, long index, int x) {
        AVComponentDescriptor.step$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offset"));
    public static VarHandle offset$VH() {
        return AVComponentDescriptor.offset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int offset;
     * }
     */
    public static int offset$get(MemorySegment seg) {
        return (int)AVComponentDescriptor.offset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int offset;
     * }
     */
    public static void offset$set(MemorySegment seg, int x) {
        AVComponentDescriptor.offset$VH.set(seg, x);
    }
    public static int offset$get(MemorySegment seg, long index) {
        return (int)AVComponentDescriptor.offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, int x) {
        AVComponentDescriptor.offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle shift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("shift"));
    public static VarHandle shift$VH() {
        return AVComponentDescriptor.shift$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int shift;
     * }
     */
    public static int shift$get(MemorySegment seg) {
        return (int)AVComponentDescriptor.shift$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int shift;
     * }
     */
    public static void shift$set(MemorySegment seg, int x) {
        AVComponentDescriptor.shift$VH.set(seg, x);
    }
    public static int shift$get(MemorySegment seg, long index) {
        return (int)AVComponentDescriptor.shift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void shift$set(MemorySegment seg, long index, int x) {
        AVComponentDescriptor.shift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle depth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("depth"));
    public static VarHandle depth$VH() {
        return AVComponentDescriptor.depth$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int depth;
     * }
     */
    public static int depth$get(MemorySegment seg) {
        return (int)AVComponentDescriptor.depth$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int depth;
     * }
     */
    public static void depth$set(MemorySegment seg, int x) {
        AVComponentDescriptor.depth$VH.set(seg, x);
    }
    public static int depth$get(MemorySegment seg, long index) {
        return (int)AVComponentDescriptor.depth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void depth$set(MemorySegment seg, long index, int x) {
        AVComponentDescriptor.depth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


