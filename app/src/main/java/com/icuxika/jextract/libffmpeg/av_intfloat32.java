// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union av_intfloat32 {
 *     uint32_t i;
 *     float f;
 * };
 * }
 */
public class av_intfloat32 {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_LONG$LAYOUT.withName("i"),
        Constants$root.C_FLOAT$LAYOUT.withName("f")
    ).withName("av_intfloat32");
    public static MemoryLayout $LAYOUT() {
        return av_intfloat32.$union$LAYOUT;
    }
    static final VarHandle i$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("i"));
    public static VarHandle i$VH() {
        return av_intfloat32.i$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t i;
     * }
     */
    public static int i$get(MemorySegment seg) {
        return (int)av_intfloat32.i$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t i;
     * }
     */
    public static void i$set(MemorySegment seg, int x) {
        av_intfloat32.i$VH.set(seg, x);
    }
    public static int i$get(MemorySegment seg, long index) {
        return (int)av_intfloat32.i$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void i$set(MemorySegment seg, long index, int x) {
        av_intfloat32.i$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle f$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("f"));
    public static VarHandle f$VH() {
        return av_intfloat32.f$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float f;
     * }
     */
    public static float f$get(MemorySegment seg) {
        return (float)av_intfloat32.f$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float f;
     * }
     */
    public static void f$set(MemorySegment seg, float x) {
        av_intfloat32.f$VH.set(seg, x);
    }
    public static float f$get(MemorySegment seg, long index) {
        return (float)av_intfloat32.f$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void f$set(MemorySegment seg, long index, float x) {
        av_intfloat32.f$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


