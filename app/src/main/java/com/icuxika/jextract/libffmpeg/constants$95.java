// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$95 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$95() {}
    static final FunctionDescriptor getenv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getenv$MH = RuntimeHelper.downcallHandle(
        "getenv",
        constants$95.getenv$FUNC
    );
    static final FunctionDescriptor _dupenv_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _dupenv_s$MH = RuntimeHelper.downcallHandle(
        "_dupenv_s",
        constants$95._dupenv_s$FUNC
    );
    static final FunctionDescriptor system$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle system$MH = RuntimeHelper.downcallHandle(
        "system",
        constants$95.system$FUNC
    );
    static final FunctionDescriptor _putenv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _putenv$MH = RuntimeHelper.downcallHandle(
        "_putenv",
        constants$95._putenv$FUNC
    );
    static final FunctionDescriptor _putenv_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _putenv_s$MH = RuntimeHelper.downcallHandle(
        "_putenv_s",
        constants$95._putenv_s$FUNC
    );
    static final FunctionDescriptor _searchenv_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _searchenv_s$MH = RuntimeHelper.downcallHandle(
        "_searchenv_s",
        constants$95._searchenv_s$FUNC
    );
}


