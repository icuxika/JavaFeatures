// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$111 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$111() {}
    static final FunctionDescriptor strncpy_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strncpy_s$MH = RuntimeHelper.downcallHandle(
        "strncpy_s",
        constants$111.strncpy_s$FUNC
    );
    static final FunctionDescriptor strtok_s$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strtok_s$MH = RuntimeHelper.downcallHandle(
        "strtok_s",
        constants$111.strtok_s$FUNC
    );
    static final FunctionDescriptor _memccpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _memccpy$MH = RuntimeHelper.downcallHandle(
        "_memccpy",
        constants$111._memccpy$FUNC
    );
    static final FunctionDescriptor strcat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcat$MH = RuntimeHelper.downcallHandle(
        "strcat",
        constants$111.strcat$FUNC
    );
    static final FunctionDescriptor strcmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcmp$MH = RuntimeHelper.downcallHandle(
        "strcmp",
        constants$111.strcmp$FUNC
    );
    static final FunctionDescriptor _strcmpi$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strcmpi$MH = RuntimeHelper.downcallHandle(
        "_strcmpi",
        constants$111._strcmpi$FUNC
    );
}


