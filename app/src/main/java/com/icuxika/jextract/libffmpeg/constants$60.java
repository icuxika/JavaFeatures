// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$60 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$60() {}
    static final FunctionDescriptor free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle free$MH = RuntimeHelper.downcallHandle(
        "free",
        constants$60.free$FUNC
    );
    static final FunctionDescriptor _malloc_base$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _malloc_base$MH = RuntimeHelper.downcallHandle(
        "_malloc_base",
        constants$60._malloc_base$FUNC
    );
    static final FunctionDescriptor malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle malloc$MH = RuntimeHelper.downcallHandle(
        "malloc",
        constants$60.malloc$FUNC
    );
    static final FunctionDescriptor _msize_base$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _msize_base$MH = RuntimeHelper.downcallHandle(
        "_msize_base",
        constants$60._msize_base$FUNC
    );
    static final FunctionDescriptor _msize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _msize$MH = RuntimeHelper.downcallHandle(
        "_msize",
        constants$60._msize$FUNC
    );
    static final FunctionDescriptor _realloc_base$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _realloc_base$MH = RuntimeHelper.downcallHandle(
        "_realloc_base",
        constants$60._realloc_base$FUNC
    );
}


