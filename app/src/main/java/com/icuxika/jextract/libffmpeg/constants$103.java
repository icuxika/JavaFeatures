// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$103 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$103() {}
    static final FunctionDescriptor wcsncpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle wcsncpy$MH = RuntimeHelper.downcallHandle(
        "wcsncpy",
        constants$103.wcsncpy$FUNC
    );
    static final FunctionDescriptor wcspbrk$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcspbrk$MH = RuntimeHelper.downcallHandle(
        "wcspbrk",
        constants$103.wcspbrk$FUNC
    );
    static final FunctionDescriptor wcsspn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcsspn$MH = RuntimeHelper.downcallHandle(
        "wcsspn",
        constants$103.wcsspn$FUNC
    );
    static final FunctionDescriptor wcstok$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcstok$MH = RuntimeHelper.downcallHandle(
        "wcstok",
        constants$103.wcstok$FUNC
    );
    static final FunctionDescriptor _wcserror$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _wcserror$MH = RuntimeHelper.downcallHandle(
        "_wcserror",
        constants$103._wcserror$FUNC
    );
    static final FunctionDescriptor _wcserror_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _wcserror_s$MH = RuntimeHelper.downcallHandle(
        "_wcserror_s",
        constants$103._wcserror_s$FUNC
    );
}


