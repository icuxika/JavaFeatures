// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$117 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$117() {}
    static final FunctionDescriptor strpbrk$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strpbrk$MH = RuntimeHelper.downcallHandle(
        "strpbrk",
        constants$117.strpbrk$FUNC
    );
    static final FunctionDescriptor _strrev$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strrev$MH = RuntimeHelper.downcallHandle(
        "_strrev",
        constants$117._strrev$FUNC
    );
    static final FunctionDescriptor _strset_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _strset_s$MH = RuntimeHelper.downcallHandle(
        "_strset_s",
        constants$117._strset_s$FUNC
    );
    static final FunctionDescriptor _strset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _strset$MH = RuntimeHelper.downcallHandle(
        "_strset",
        constants$117._strset$FUNC
    );
    static final FunctionDescriptor strspn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strspn$MH = RuntimeHelper.downcallHandle(
        "strspn",
        constants$117.strspn$FUNC
    );
    static final FunctionDescriptor strtok$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strtok$MH = RuntimeHelper.downcallHandle(
        "strtok",
        constants$117.strtok$FUNC
    );
}


