// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$59 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$59() {}
    static final FunctionDescriptor rmtmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle rmtmp$MH = RuntimeHelper.downcallHandle(
        "rmtmp",
        constants$59.rmtmp$FUNC
    );
    static final FunctionDescriptor _calloc_base$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _calloc_base$MH = RuntimeHelper.downcallHandle(
        "_calloc_base",
        constants$59._calloc_base$FUNC
    );
    static final FunctionDescriptor calloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle calloc$MH = RuntimeHelper.downcallHandle(
        "calloc",
        constants$59.calloc$FUNC
    );
    static final FunctionDescriptor _callnewh$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _callnewh$MH = RuntimeHelper.downcallHandle(
        "_callnewh",
        constants$59._callnewh$FUNC
    );
    static final FunctionDescriptor _expand$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _expand$MH = RuntimeHelper.downcallHandle(
        "_expand",
        constants$59._expand$FUNC
    );
    static final FunctionDescriptor _free_base$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _free_base$MH = RuntimeHelper.downcallHandle(
        "_free_base",
        constants$59._free_base$FUNC
    );
}


