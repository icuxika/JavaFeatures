// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$8 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$8() {}
    static final FunctionDescriptor _dsign$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle _dsign$MH = RuntimeHelper.downcallHandle(
        "_dsign",
        constants$8._dsign$FUNC
    );
    static final FunctionDescriptor _fdsign$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle _fdsign$MH = RuntimeHelper.downcallHandle(
        "_fdsign",
        constants$8._fdsign$FUNC
    );
    static final FunctionDescriptor _dpcomp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle _dpcomp$MH = RuntimeHelper.downcallHandle(
        "_dpcomp",
        constants$8._dpcomp$FUNC
    );
    static final FunctionDescriptor _fdpcomp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle _fdpcomp$MH = RuntimeHelper.downcallHandle(
        "_fdpcomp",
        constants$8._fdpcomp$FUNC
    );
    static final FunctionDescriptor _dtest$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _dtest$MH = RuntimeHelper.downcallHandle(
        "_dtest",
        constants$8._dtest$FUNC
    );
    static final FunctionDescriptor _ldtest$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _ldtest$MH = RuntimeHelper.downcallHandle(
        "_ldtest",
        constants$8._ldtest$FUNC
    );
}

