// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _Mbstatet {
 *     unsigned long _Wchar;
 *     unsigned short _Byte;
 *     unsigned short _State;
 * };
 * }
 */
public class _Mbstatet {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("_Wchar"),
        Constants$root.C_SHORT$LAYOUT.withName("_Byte"),
        Constants$root.C_SHORT$LAYOUT.withName("_State")
    ).withName("_Mbstatet");
    public static MemoryLayout $LAYOUT() {
        return _Mbstatet.$struct$LAYOUT;
    }
    static final VarHandle _Wchar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_Wchar"));
    public static VarHandle _Wchar$VH() {
        return _Mbstatet._Wchar$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long _Wchar;
     * }
     */
    public static int _Wchar$get(MemorySegment seg) {
        return (int)_Mbstatet._Wchar$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long _Wchar;
     * }
     */
    public static void _Wchar$set(MemorySegment seg, int x) {
        _Mbstatet._Wchar$VH.set(seg, x);
    }
    public static int _Wchar$get(MemorySegment seg, long index) {
        return (int)_Mbstatet._Wchar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _Wchar$set(MemorySegment seg, long index, int x) {
        _Mbstatet._Wchar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _Byte$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_Byte"));
    public static VarHandle _Byte$VH() {
        return _Mbstatet._Byte$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short _Byte;
     * }
     */
    public static short _Byte$get(MemorySegment seg) {
        return (short)_Mbstatet._Byte$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short _Byte;
     * }
     */
    public static void _Byte$set(MemorySegment seg, short x) {
        _Mbstatet._Byte$VH.set(seg, x);
    }
    public static short _Byte$get(MemorySegment seg, long index) {
        return (short)_Mbstatet._Byte$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _Byte$set(MemorySegment seg, long index, short x) {
        _Mbstatet._Byte$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _State$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_State"));
    public static VarHandle _State$VH() {
        return _Mbstatet._State$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short _State;
     * }
     */
    public static short _State$get(MemorySegment seg) {
        return (short)_Mbstatet._State$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short _State;
     * }
     */
    public static void _State$set(MemorySegment seg, short x) {
        _Mbstatet._State$VH.set(seg, x);
    }
    public static short _State$get(MemorySegment seg, long index) {
        return (short)_Mbstatet._State$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _State$set(MemorySegment seg, long index, short x) {
        _Mbstatet._State$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

