// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$20 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$20() {}
    static final FunctionDescriptor _hypot$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle _hypot$MH = RuntimeHelper.downcallHandle(
        "_hypot",
        constants$20._hypot$FUNC
    );
    static final FunctionDescriptor ilogb$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle ilogb$MH = RuntimeHelper.downcallHandle(
        "ilogb",
        constants$20.ilogb$FUNC
    );
    static final FunctionDescriptor ldexp$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ldexp$MH = RuntimeHelper.downcallHandle(
        "ldexp",
        constants$20.ldexp$FUNC
    );
    static final FunctionDescriptor lgamma$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle lgamma$MH = RuntimeHelper.downcallHandle(
        "lgamma",
        constants$20.lgamma$FUNC
    );
    static final FunctionDescriptor llrint$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle llrint$MH = RuntimeHelper.downcallHandle(
        "llrint",
        constants$20.llrint$FUNC
    );
    static final FunctionDescriptor llround$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle llround$MH = RuntimeHelper.downcallHandle(
        "llround",
        constants$20.llround$FUNC
    );
}


