// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*av_buffer_pool_init2$pool_free)(void*);
 * }
 */
public interface av_buffer_pool_init2$pool_free {

    void apply(java.lang.foreign.MemorySegment _x0);
    static MemorySegment allocate(av_buffer_pool_init2$pool_free fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$134.av_buffer_pool_init2$pool_free_UP$MH, fi, constants$134.av_buffer_pool_init2$pool_free$FUNC, scope);
    }
    static av_buffer_pool_init2$pool_free ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0) -> {
            try {
                constants$134.av_buffer_pool_init2$pool_free_DOWN$MH.invokeExact(symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

