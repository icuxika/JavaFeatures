// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct __crt_locale_pointers {
 *     struct __crt_locale_data* locinfo;
 *     struct __crt_multibyte_data* mbcinfo;
 * };
 * }
 */
public class __crt_locale_pointers {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("locinfo"),
        Constants$root.C_POINTER$LAYOUT.withName("mbcinfo")
    ).withName("__crt_locale_pointers");
    public static MemoryLayout $LAYOUT() {
        return __crt_locale_pointers.$struct$LAYOUT;
    }
    static final VarHandle locinfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("locinfo"));
    public static VarHandle locinfo$VH() {
        return __crt_locale_pointers.locinfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct __crt_locale_data* locinfo;
     * }
     */
    public static MemorySegment locinfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)__crt_locale_pointers.locinfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct __crt_locale_data* locinfo;
     * }
     */
    public static void locinfo$set(MemorySegment seg, MemorySegment x) {
        __crt_locale_pointers.locinfo$VH.set(seg, x);
    }
    public static MemorySegment locinfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)__crt_locale_pointers.locinfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void locinfo$set(MemorySegment seg, long index, MemorySegment x) {
        __crt_locale_pointers.locinfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mbcinfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mbcinfo"));
    public static VarHandle mbcinfo$VH() {
        return __crt_locale_pointers.mbcinfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct __crt_multibyte_data* mbcinfo;
     * }
     */
    public static MemorySegment mbcinfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)__crt_locale_pointers.mbcinfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct __crt_multibyte_data* mbcinfo;
     * }
     */
    public static void mbcinfo$set(MemorySegment seg, MemorySegment x) {
        __crt_locale_pointers.mbcinfo$VH.set(seg, x);
    }
    public static MemorySegment mbcinfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)__crt_locale_pointers.mbcinfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mbcinfo$set(MemorySegment seg, long index, MemorySegment x) {
        __crt_locale_pointers.mbcinfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


