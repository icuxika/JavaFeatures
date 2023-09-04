// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVSubtitle {
 *     uint16_t format;
 *     uint32_t start_display_time;
 *     uint32_t end_display_time;
 *     unsigned int num_rects;
 *     AVSubtitleRect** rects;
 *     int64_t pts;
 * };
 * }
 */
public class AVSubtitle {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("format"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_LONG$LAYOUT.withName("start_display_time"),
        Constants$root.C_LONG$LAYOUT.withName("end_display_time"),
        Constants$root.C_LONG$LAYOUT.withName("num_rects"),
        Constants$root.C_POINTER$LAYOUT.withName("rects"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("pts")
    ).withName("AVSubtitle");
    public static MemoryLayout $LAYOUT() {
        return AVSubtitle.$struct$LAYOUT;
    }
    static final VarHandle format$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("format"));
    public static VarHandle format$VH() {
        return AVSubtitle.format$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t format;
     * }
     */
    public static short format$get(MemorySegment seg) {
        return (short)AVSubtitle.format$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t format;
     * }
     */
    public static void format$set(MemorySegment seg, short x) {
        AVSubtitle.format$VH.set(seg, x);
    }
    public static short format$get(MemorySegment seg, long index) {
        return (short)AVSubtitle.format$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void format$set(MemorySegment seg, long index, short x) {
        AVSubtitle.format$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle start_display_time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("start_display_time"));
    public static VarHandle start_display_time$VH() {
        return AVSubtitle.start_display_time$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t start_display_time;
     * }
     */
    public static int start_display_time$get(MemorySegment seg) {
        return (int)AVSubtitle.start_display_time$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t start_display_time;
     * }
     */
    public static void start_display_time$set(MemorySegment seg, int x) {
        AVSubtitle.start_display_time$VH.set(seg, x);
    }
    public static int start_display_time$get(MemorySegment seg, long index) {
        return (int)AVSubtitle.start_display_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void start_display_time$set(MemorySegment seg, long index, int x) {
        AVSubtitle.start_display_time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle end_display_time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("end_display_time"));
    public static VarHandle end_display_time$VH() {
        return AVSubtitle.end_display_time$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t end_display_time;
     * }
     */
    public static int end_display_time$get(MemorySegment seg) {
        return (int)AVSubtitle.end_display_time$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t end_display_time;
     * }
     */
    public static void end_display_time$set(MemorySegment seg, int x) {
        AVSubtitle.end_display_time$VH.set(seg, x);
    }
    public static int end_display_time$get(MemorySegment seg, long index) {
        return (int)AVSubtitle.end_display_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void end_display_time$set(MemorySegment seg, long index, int x) {
        AVSubtitle.end_display_time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle num_rects$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_rects"));
    public static VarHandle num_rects$VH() {
        return AVSubtitle.num_rects$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int num_rects;
     * }
     */
    public static int num_rects$get(MemorySegment seg) {
        return (int)AVSubtitle.num_rects$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int num_rects;
     * }
     */
    public static void num_rects$set(MemorySegment seg, int x) {
        AVSubtitle.num_rects$VH.set(seg, x);
    }
    public static int num_rects$get(MemorySegment seg, long index) {
        return (int)AVSubtitle.num_rects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_rects$set(MemorySegment seg, long index, int x) {
        AVSubtitle.num_rects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rects$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rects"));
    public static VarHandle rects$VH() {
        return AVSubtitle.rects$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AVSubtitleRect** rects;
     * }
     */
    public static MemorySegment rects$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)AVSubtitle.rects$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AVSubtitleRect** rects;
     * }
     */
    public static void rects$set(MemorySegment seg, MemorySegment x) {
        AVSubtitle.rects$VH.set(seg, x);
    }
    public static MemorySegment rects$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)AVSubtitle.rects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rects$set(MemorySegment seg, long index, MemorySegment x) {
        AVSubtitle.rects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pts"));
    public static VarHandle pts$VH() {
        return AVSubtitle.pts$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t pts;
     * }
     */
    public static long pts$get(MemorySegment seg) {
        return (long)AVSubtitle.pts$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t pts;
     * }
     */
    public static void pts$set(MemorySegment seg, long x) {
        AVSubtitle.pts$VH.set(seg, x);
    }
    public static long pts$get(MemorySegment seg, long index) {
        return (long)AVSubtitle.pts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pts$set(MemorySegment seg, long index, long x) {
        AVSubtitle.pts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


