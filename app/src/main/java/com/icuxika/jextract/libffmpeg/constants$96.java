// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$96 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$96() {}
    static final FunctionDescriptor _searchenv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _searchenv$MH = RuntimeHelper.downcallHandle(
        "_searchenv",
        constants$96._searchenv$FUNC
    );
    static final FunctionDescriptor _seterrormode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _seterrormode$MH = RuntimeHelper.downcallHandle(
        "_seterrormode",
        constants$96._seterrormode$FUNC
    );
    static final FunctionDescriptor _beep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _beep$MH = RuntimeHelper.downcallHandle(
        "_beep",
        constants$96._beep$FUNC
    );
    static final FunctionDescriptor _sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _sleep$MH = RuntimeHelper.downcallHandle(
        "_sleep",
        constants$96._sleep$FUNC
    );
    static final FunctionDescriptor ecvt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ecvt$MH = RuntimeHelper.downcallHandle(
        "ecvt",
        constants$96.ecvt$FUNC
    );
    static final FunctionDescriptor fcvt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fcvt$MH = RuntimeHelper.downcallHandle(
        "fcvt",
        constants$96.fcvt$FUNC
    );
}


