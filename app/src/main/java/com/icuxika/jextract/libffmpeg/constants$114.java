// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$114 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$114() {}
    static final FunctionDescriptor strlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strlen$MH = RuntimeHelper.downcallHandle(
        "strlen",
        constants$114.strlen$FUNC
    );
    static final FunctionDescriptor _strlwr_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _strlwr_s$MH = RuntimeHelper.downcallHandle(
        "_strlwr_s",
        constants$114._strlwr_s$FUNC
    );
    static final FunctionDescriptor _strlwr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strlwr$MH = RuntimeHelper.downcallHandle(
        "_strlwr",
        constants$114._strlwr$FUNC
    );
    static final FunctionDescriptor _strlwr_s_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strlwr_s_l$MH = RuntimeHelper.downcallHandle(
        "_strlwr_s_l",
        constants$114._strlwr_s_l$FUNC
    );
    static final FunctionDescriptor _strlwr_l$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strlwr_l$MH = RuntimeHelper.downcallHandle(
        "_strlwr_l",
        constants$114._strlwr_l$FUNC
    );
    static final FunctionDescriptor strncat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strncat$MH = RuntimeHelper.downcallHandle(
        "strncat",
        constants$114.strncat$FUNC
    );
}


