// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * AVBufferRef* (*av_buffer_pool_init2$alloc)(void*,size_t);
 * }
 */
public interface av_buffer_pool_init2$alloc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, long _x1);
    static MemorySegment allocate(av_buffer_pool_init2$alloc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$134.av_buffer_pool_init2$alloc_UP$MH, fi, constants$134.av_buffer_pool_init2$alloc$FUNC, scope);
    }
    static av_buffer_pool_init2$alloc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, long __x1) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$134.av_buffer_pool_init2$alloc_DOWN$MH.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

