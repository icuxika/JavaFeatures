// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$46 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$46() {}
    static final FunctionDescriptor fgetpos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fgetpos$MH = RuntimeHelper.downcallHandle(
        "fgetpos",
        constants$46.fgetpos$FUNC
    );
    static final FunctionDescriptor fgets$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fgets$MH = RuntimeHelper.downcallHandle(
        "fgets",
        constants$46.fgets$FUNC
    );
    static final FunctionDescriptor _fileno$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fileno$MH = RuntimeHelper.downcallHandle(
        "_fileno",
        constants$46._fileno$FUNC
    );
    static final FunctionDescriptor _flushall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _flushall$MH = RuntimeHelper.downcallHandle(
        "_flushall",
        constants$46._flushall$FUNC
    );
    static final FunctionDescriptor fopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fopen$MH = RuntimeHelper.downcallHandle(
        "fopen",
        constants$46.fopen$FUNC
    );
    static final FunctionDescriptor fputc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fputc$MH = RuntimeHelper.downcallHandle(
        "fputc",
        constants$46.fputc$FUNC
    );
}

