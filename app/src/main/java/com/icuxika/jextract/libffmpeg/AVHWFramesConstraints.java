// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVHWFramesConstraints {
 *     enum AVPixelFormat* valid_hw_formats;
 *     enum AVPixelFormat* valid_sw_formats;
 *     int min_width;
 *     int min_height;
 *     int max_width;
 *     int max_height;
 * };
 * }
 */
public class AVHWFramesConstraints {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("valid_hw_formats"),
        Constants$root.C_POINTER$LAYOUT.withName("valid_sw_formats"),
        Constants$root.C_LONG$LAYOUT.withName("min_width"),
        Constants$root.C_LONG$LAYOUT.withName("min_height"),
        Constants$root.C_LONG$LAYOUT.withName("max_width"),
        Constants$root.C_LONG$LAYOUT.withName("max_height")
    ).withName("AVHWFramesConstraints");
    public static MemoryLayout $LAYOUT() {
        return AVHWFramesConstraints.$struct$LAYOUT;
    }
    static final VarHandle valid_hw_formats$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("valid_hw_formats"));
    public static VarHandle valid_hw_formats$VH() {
        return AVHWFramesConstraints.valid_hw_formats$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVPixelFormat* valid_hw_formats;
     * }
     */
    public static MemorySegment valid_hw_formats$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVHWFramesConstraints.valid_hw_formats$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVPixelFormat* valid_hw_formats;
     * }
     */
    public static void valid_hw_formats$set(MemorySegment seg, MemorySegment x) {
        AVHWFramesConstraints.valid_hw_formats$VH.set(seg, x);
    }
    public static MemorySegment valid_hw_formats$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVHWFramesConstraints.valid_hw_formats$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void valid_hw_formats$set(MemorySegment seg, long index, MemorySegment x) {
        AVHWFramesConstraints.valid_hw_formats$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle valid_sw_formats$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("valid_sw_formats"));
    public static VarHandle valid_sw_formats$VH() {
        return AVHWFramesConstraints.valid_sw_formats$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVPixelFormat* valid_sw_formats;
     * }
     */
    public static MemorySegment valid_sw_formats$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVHWFramesConstraints.valid_sw_formats$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVPixelFormat* valid_sw_formats;
     * }
     */
    public static void valid_sw_formats$set(MemorySegment seg, MemorySegment x) {
        AVHWFramesConstraints.valid_sw_formats$VH.set(seg, x);
    }
    public static MemorySegment valid_sw_formats$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVHWFramesConstraints.valid_sw_formats$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void valid_sw_formats$set(MemorySegment seg, long index, MemorySegment x) {
        AVHWFramesConstraints.valid_sw_formats$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle min_width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("min_width"));
    public static VarHandle min_width$VH() {
        return AVHWFramesConstraints.min_width$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int min_width;
     * }
     */
    public static int min_width$get(MemorySegment seg) {
        return (int)AVHWFramesConstraints.min_width$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int min_width;
     * }
     */
    public static void min_width$set(MemorySegment seg, int x) {
        AVHWFramesConstraints.min_width$VH.set(seg, x);
    }
    public static int min_width$get(MemorySegment seg, long index) {
        return (int)AVHWFramesConstraints.min_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void min_width$set(MemorySegment seg, long index, int x) {
        AVHWFramesConstraints.min_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle min_height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("min_height"));
    public static VarHandle min_height$VH() {
        return AVHWFramesConstraints.min_height$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int min_height;
     * }
     */
    public static int min_height$get(MemorySegment seg) {
        return (int)AVHWFramesConstraints.min_height$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int min_height;
     * }
     */
    public static void min_height$set(MemorySegment seg, int x) {
        AVHWFramesConstraints.min_height$VH.set(seg, x);
    }
    public static int min_height$get(MemorySegment seg, long index) {
        return (int)AVHWFramesConstraints.min_height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void min_height$set(MemorySegment seg, long index, int x) {
        AVHWFramesConstraints.min_height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_width"));
    public static VarHandle max_width$VH() {
        return AVHWFramesConstraints.max_width$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int max_width;
     * }
     */
    public static int max_width$get(MemorySegment seg) {
        return (int)AVHWFramesConstraints.max_width$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int max_width;
     * }
     */
    public static void max_width$set(MemorySegment seg, int x) {
        AVHWFramesConstraints.max_width$VH.set(seg, x);
    }
    public static int max_width$get(MemorySegment seg, long index) {
        return (int)AVHWFramesConstraints.max_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_width$set(MemorySegment seg, long index, int x) {
        AVHWFramesConstraints.max_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_height"));
    public static VarHandle max_height$VH() {
        return AVHWFramesConstraints.max_height$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int max_height;
     * }
     */
    public static int max_height$get(MemorySegment seg) {
        return (int)AVHWFramesConstraints.max_height$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int max_height;
     * }
     */
    public static void max_height$set(MemorySegment seg, int x) {
        AVHWFramesConstraints.max_height$VH.set(seg, x);
    }
    public static int max_height$get(MemorySegment seg, long index) {
        return (int)AVHWFramesConstraints.max_height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_height$set(MemorySegment seg, long index, int x) {
        AVHWFramesConstraints.max_height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

