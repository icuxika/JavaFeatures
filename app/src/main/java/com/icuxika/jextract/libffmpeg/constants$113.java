// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$113 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$113() {}
    static final FunctionDescriptor _strerror_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strerror_s$MH = RuntimeHelper.downcallHandle(
        "_strerror_s",
        constants$113._strerror_s$FUNC
    );
    static final FunctionDescriptor strerror$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle strerror$MH = RuntimeHelper.downcallHandle(
        "strerror",
        constants$113.strerror$FUNC
    );
    static final FunctionDescriptor _stricmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _stricmp$MH = RuntimeHelper.downcallHandle(
        "_stricmp",
        constants$113._stricmp$FUNC
    );
    static final FunctionDescriptor _stricoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _stricoll$MH = RuntimeHelper.downcallHandle(
        "_stricoll",
        constants$113._stricoll$FUNC
    );
    static final FunctionDescriptor _stricoll_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _stricoll_l$MH = RuntimeHelper.downcallHandle(
        "_stricoll_l",
        constants$113._stricoll_l$FUNC
    );
    static final FunctionDescriptor _stricmp_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _stricmp_l$MH = RuntimeHelper.downcallHandle(
        "_stricmp_l",
        constants$113._stricmp_l$FUNC
    );
}


