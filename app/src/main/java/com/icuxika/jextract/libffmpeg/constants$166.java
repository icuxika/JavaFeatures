// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$166 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$166() {}
    static final FunctionDescriptor _get_daylight$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _get_daylight$MH = RuntimeHelper.downcallHandle(
        "_get_daylight",
        constants$166._get_daylight$FUNC
    );
    static final FunctionDescriptor _get_dstbias$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _get_dstbias$MH = RuntimeHelper.downcallHandle(
        "_get_dstbias",
        constants$166._get_dstbias$FUNC
    );
    static final FunctionDescriptor _get_timezone$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _get_timezone$MH = RuntimeHelper.downcallHandle(
        "_get_timezone",
        constants$166._get_timezone$FUNC
    );
    static final FunctionDescriptor _get_tzname$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _get_tzname$MH = RuntimeHelper.downcallHandle(
        "_get_tzname",
        constants$166._get_tzname$FUNC
    );
    static final FunctionDescriptor asctime$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle asctime$MH = RuntimeHelper.downcallHandle(
        "asctime",
        constants$166.asctime$FUNC
    );
    static final FunctionDescriptor asctime_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle asctime_s$MH = RuntimeHelper.downcallHandle(
        "asctime_s",
        constants$166.asctime_s$FUNC
    );
}


