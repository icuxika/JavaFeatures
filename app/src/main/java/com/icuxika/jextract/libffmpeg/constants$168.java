// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$168 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$168() {}
    static final FunctionDescriptor _difftime64$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _difftime64$MH = RuntimeHelper.downcallHandle(
        "_difftime64",
        constants$168._difftime64$FUNC
    );
    static final FunctionDescriptor _gmtime32$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _gmtime32$MH = RuntimeHelper.downcallHandle(
        "_gmtime32",
        constants$168._gmtime32$FUNC
    );
    static final FunctionDescriptor _gmtime32_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _gmtime32_s$MH = RuntimeHelper.downcallHandle(
        "_gmtime32_s",
        constants$168._gmtime32_s$FUNC
    );
    static final FunctionDescriptor _gmtime64$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _gmtime64$MH = RuntimeHelper.downcallHandle(
        "_gmtime64",
        constants$168._gmtime64$FUNC
    );
    static final FunctionDescriptor _gmtime64_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _gmtime64_s$MH = RuntimeHelper.downcallHandle(
        "_gmtime64_s",
        constants$168._gmtime64_s$FUNC
    );
    static final FunctionDescriptor _localtime32$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _localtime32$MH = RuntimeHelper.downcallHandle(
        "_localtime32",
        constants$168._localtime32$FUNC
    );
}

