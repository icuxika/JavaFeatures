// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*_invalid_parameter_handler)(unsigned short*,unsigned short*,unsigned short*,unsigned int,unsigned long long);
 * }
 */
public interface _invalid_parameter_handler {

    void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, long _x4);
    static MemorySegment allocate(_invalid_parameter_handler fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$76._invalid_parameter_handler_UP$MH, fi, constants$76._invalid_parameter_handler$FUNC, scope);
    }
    static _invalid_parameter_handler ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, long __x4) -> {
            try {
                constants$76._invalid_parameter_handler_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


