// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$102 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$102() {}
    static final FunctionDescriptor wcscpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcscpy$MH = RuntimeHelper.downcallHandle(
        "wcscpy",
        constants$102.wcscpy$FUNC
    );
    static final FunctionDescriptor wcscspn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcscspn$MH = RuntimeHelper.downcallHandle(
        "wcscspn",
        constants$102.wcscspn$FUNC
    );
    static final FunctionDescriptor wcslen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcslen$MH = RuntimeHelper.downcallHandle(
        "wcslen",
        constants$102.wcslen$FUNC
    );
    static final FunctionDescriptor wcsnlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle wcsnlen$MH = RuntimeHelper.downcallHandle(
        "wcsnlen",
        constants$102.wcsnlen$FUNC
    );
    static final FunctionDescriptor wcsncat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle wcsncat$MH = RuntimeHelper.downcallHandle(
        "wcsncat",
        constants$102.wcsncat$FUNC
    );
    static final FunctionDescriptor wcsncmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle wcsncmp$MH = RuntimeHelper.downcallHandle(
        "wcsncmp",
        constants$102.wcsncmp$FUNC
    );
}


