// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$165 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$165() {}
    static final FunctionDescriptor _wstrtime_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _wstrtime_s$MH = RuntimeHelper.downcallHandle(
        "_wstrtime_s",
        constants$165._wstrtime_s$FUNC
    );
    static final FunctionDescriptor _wstrtime$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wstrtime$MH = RuntimeHelper.downcallHandle(
        "_wstrtime",
        constants$165._wstrtime$FUNC
    );
    static final FunctionDescriptor __daylight$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __daylight$MH = RuntimeHelper.downcallHandle(
        "__daylight",
        constants$165.__daylight$FUNC
    );
    static final FunctionDescriptor __dstbias$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __dstbias$MH = RuntimeHelper.downcallHandle(
        "__dstbias",
        constants$165.__dstbias$FUNC
    );
    static final FunctionDescriptor __timezone$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __timezone$MH = RuntimeHelper.downcallHandle(
        "__timezone",
        constants$165.__timezone$FUNC
    );
    static final FunctionDescriptor __tzname$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __tzname$MH = RuntimeHelper.downcallHandle(
        "__tzname",
        constants$165.__tzname$FUNC
    );
}


