// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*avcodec_default_execute2$func)(AVCodecContext*,void*,int,int);
 * }
 */
public interface avcodec_default_execute2$func {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3);
    static MemorySegment allocate(avcodec_default_execute2$func fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$161.avcodec_default_execute2$func_UP$MH, fi, constants$161.avcodec_default_execute2$func$FUNC, scope);
    }
    static avcodec_default_execute2$func ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3) -> {
            try {
                return (int)constants$162.avcodec_default_execute2$func_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


