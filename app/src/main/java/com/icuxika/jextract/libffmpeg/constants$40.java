// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$40 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$40() {}
    static final FunctionDescriptor _wpopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wpopen$MH = RuntimeHelper.downcallHandle(
        "_wpopen",
        constants$40._wpopen$FUNC
    );
    static final FunctionDescriptor _wremove$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wremove$MH = RuntimeHelper.downcallHandle(
        "_wremove",
        constants$40._wremove$FUNC
    );
    static final FunctionDescriptor _wtempnam$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wtempnam$MH = RuntimeHelper.downcallHandle(
        "_wtempnam",
        constants$40._wtempnam$FUNC
    );
    static final FunctionDescriptor _wtmpnam_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _wtmpnam_s$MH = RuntimeHelper.downcallHandle(
        "_wtmpnam_s",
        constants$40._wtmpnam_s$FUNC
    );
    static final FunctionDescriptor _wtmpnam$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wtmpnam$MH = RuntimeHelper.downcallHandle(
        "_wtmpnam",
        constants$40._wtmpnam$FUNC
    );
    static final FunctionDescriptor _fgetwc_nolock$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fgetwc_nolock$MH = RuntimeHelper.downcallHandle(
        "_fgetwc_nolock",
        constants$40._fgetwc_nolock$FUNC
    );
}


