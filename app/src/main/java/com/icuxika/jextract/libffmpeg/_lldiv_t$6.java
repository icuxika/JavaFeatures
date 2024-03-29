// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _lldiv_t {
 *     long long quot;
 *     long long rem;
 * };
 * }
 */
public class _lldiv_t$6 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rem")
    ).withName("_lldiv_t");
    public static MemoryLayout $LAYOUT() {
        return _lldiv_t$6.$struct$LAYOUT;
    }
    static final VarHandle quot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("quot"));
    public static VarHandle quot$VH() {
        return _lldiv_t$6.quot$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long quot;
     * }
     */
    public static long quot$get(MemorySegment seg) {
        return (long)_lldiv_t$6.quot$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long quot;
     * }
     */
    public static void quot$set(MemorySegment seg, long x) {
        _lldiv_t$6.quot$VH.set(seg, x);
    }
    public static long quot$get(MemorySegment seg, long index) {
        return (long)_lldiv_t$6.quot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void quot$set(MemorySegment seg, long index, long x) {
        _lldiv_t$6.quot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rem"));
    public static VarHandle rem$VH() {
        return _lldiv_t$6.rem$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long rem;
     * }
     */
    public static long rem$get(MemorySegment seg) {
        return (long)_lldiv_t$6.rem$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long rem;
     * }
     */
    public static void rem$set(MemorySegment seg, long x) {
        _lldiv_t$6.rem$VH.set(seg, x);
    }
    public static long rem$get(MemorySegment seg, long index) {
        return (long)_lldiv_t$6.rem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rem$set(MemorySegment seg, long index, long x) {
        _lldiv_t$6.rem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


