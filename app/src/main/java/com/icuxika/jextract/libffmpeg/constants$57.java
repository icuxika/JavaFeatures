// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$57 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$57() {}
    static final FunctionDescriptor __stdio_common_vsnprintf_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __stdio_common_vsnprintf_s$MH = RuntimeHelper.downcallHandle(
        "__stdio_common_vsnprintf_s",
        constants$57.__stdio_common_vsnprintf_s$FUNC
    );
    static final FunctionDescriptor __stdio_common_vsprintf_p$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __stdio_common_vsprintf_p$MH = RuntimeHelper.downcallHandle(
        "__stdio_common_vsprintf_p",
        constants$57.__stdio_common_vsprintf_p$FUNC
    );
    static final FunctionDescriptor __stdio_common_vsscanf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __stdio_common_vsscanf$MH = RuntimeHelper.downcallHandle(
        "__stdio_common_vsscanf",
        constants$57.__stdio_common_vsscanf$FUNC
    );
    static final FunctionDescriptor tempnam$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tempnam$MH = RuntimeHelper.downcallHandle(
        "tempnam",
        constants$57.tempnam$FUNC
    );
    static final FunctionDescriptor fcloseall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle fcloseall$MH = RuntimeHelper.downcallHandle(
        "fcloseall",
        constants$57.fcloseall$FUNC
    );
    static final FunctionDescriptor fdopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fdopen$MH = RuntimeHelper.downcallHandle(
        "fdopen",
        constants$57.fdopen$FUNC
    );
}

