// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$66 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$66() {}
    static final FunctionDescriptor _ultow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _ultow$MH = RuntimeHelper.downcallHandle(
        "_ultow",
        constants$66._ultow$FUNC
    );
    static final FunctionDescriptor wcstod$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcstod$MH = RuntimeHelper.downcallHandle(
        "wcstod",
        constants$66.wcstod$FUNC
    );
    static final FunctionDescriptor _wcstod_l$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wcstod_l$MH = RuntimeHelper.downcallHandle(
        "_wcstod_l",
        constants$66._wcstod_l$FUNC
    );
    static final FunctionDescriptor wcstol$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle wcstol$MH = RuntimeHelper.downcallHandle(
        "wcstol",
        constants$66.wcstol$FUNC
    );
    static final FunctionDescriptor _wcstol_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wcstol_l$MH = RuntimeHelper.downcallHandle(
        "_wcstol_l",
        constants$66._wcstol_l$FUNC
    );
    static final FunctionDescriptor wcstoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle wcstoll$MH = RuntimeHelper.downcallHandle(
        "wcstoll",
        constants$66.wcstoll$FUNC
    );
}

