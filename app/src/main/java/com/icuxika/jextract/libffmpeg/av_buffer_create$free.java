// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*av_buffer_create$free)(void*,uint8_t*);
 * }
 */
public interface av_buffer_create$free {

    void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
    static MemorySegment allocate(av_buffer_create$free fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$131.av_buffer_create$free_UP$MH, fi, constants$131.av_buffer_create$free$FUNC, scope);
    }
    static av_buffer_create$free ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
            try {
                constants$131.av_buffer_create$free_DOWN$MH.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


