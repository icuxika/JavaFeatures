// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RcOverride {
 *     int start_frame;
 *     int end_frame;
 *     int qscale;
 *     float quality_factor;
 * };
 * }
 */
public class RcOverride {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("start_frame"),
        Constants$root.C_LONG$LAYOUT.withName("end_frame"),
        Constants$root.C_LONG$LAYOUT.withName("qscale"),
        Constants$root.C_FLOAT$LAYOUT.withName("quality_factor")
    ).withName("RcOverride");
    public static MemoryLayout $LAYOUT() {
        return RcOverride.$struct$LAYOUT;
    }
    static final VarHandle start_frame$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("start_frame"));
    public static VarHandle start_frame$VH() {
        return RcOverride.start_frame$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int start_frame;
     * }
     */
    public static int start_frame$get(MemorySegment seg) {
        return (int)RcOverride.start_frame$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int start_frame;
     * }
     */
    public static void start_frame$set(MemorySegment seg, int x) {
        RcOverride.start_frame$VH.set(seg, x);
    }
    public static int start_frame$get(MemorySegment seg, long index) {
        return (int)RcOverride.start_frame$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void start_frame$set(MemorySegment seg, long index, int x) {
        RcOverride.start_frame$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle end_frame$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("end_frame"));
    public static VarHandle end_frame$VH() {
        return RcOverride.end_frame$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int end_frame;
     * }
     */
    public static int end_frame$get(MemorySegment seg) {
        return (int)RcOverride.end_frame$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int end_frame;
     * }
     */
    public static void end_frame$set(MemorySegment seg, int x) {
        RcOverride.end_frame$VH.set(seg, x);
    }
    public static int end_frame$get(MemorySegment seg, long index) {
        return (int)RcOverride.end_frame$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void end_frame$set(MemorySegment seg, long index, int x) {
        RcOverride.end_frame$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle qscale$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("qscale"));
    public static VarHandle qscale$VH() {
        return RcOverride.qscale$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int qscale;
     * }
     */
    public static int qscale$get(MemorySegment seg) {
        return (int)RcOverride.qscale$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int qscale;
     * }
     */
    public static void qscale$set(MemorySegment seg, int x) {
        RcOverride.qscale$VH.set(seg, x);
    }
    public static int qscale$get(MemorySegment seg, long index) {
        return (int)RcOverride.qscale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void qscale$set(MemorySegment seg, long index, int x) {
        RcOverride.qscale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle quality_factor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("quality_factor"));
    public static VarHandle quality_factor$VH() {
        return RcOverride.quality_factor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float quality_factor;
     * }
     */
    public static float quality_factor$get(MemorySegment seg) {
        return (float)RcOverride.quality_factor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float quality_factor;
     * }
     */
    public static void quality_factor$set(MemorySegment seg, float x) {
        RcOverride.quality_factor$VH.set(seg, x);
    }
    public static float quality_factor$get(MemorySegment seg, long index) {
        return (float)RcOverride.quality_factor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void quality_factor$set(MemorySegment seg, long index, float x) {
        RcOverride.quality_factor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


