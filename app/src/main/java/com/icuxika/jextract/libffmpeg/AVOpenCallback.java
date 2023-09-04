// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*AVOpenCallback)(struct AVFormatContext* s,struct AVIOContext** pb,char* url,int flags,struct AVIOInterruptCB* int_cb,struct AVDictionary** options);
 * }
 */
public interface AVOpenCallback {

    int apply(java.lang.foreign.MemorySegment s, java.lang.foreign.MemorySegment pb, java.lang.foreign.MemorySegment url, int flags, java.lang.foreign.MemorySegment int_cb, java.lang.foreign.MemorySegment options);
    static MemorySegment allocate(AVOpenCallback fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$184.AVOpenCallback_UP$MH, fi, constants$184.AVOpenCallback$FUNC, scope);
    }
    static AVOpenCallback ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _s, java.lang.foreign.MemorySegment _pb, java.lang.foreign.MemorySegment _url, int _flags, java.lang.foreign.MemorySegment _int_cb, java.lang.foreign.MemorySegment _options) -> {
            try {
                return (int)constants$184.AVOpenCallback_DOWN$MH.invokeExact(symbol, _s, _pb, _url, _flags, _int_cb, _options);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


