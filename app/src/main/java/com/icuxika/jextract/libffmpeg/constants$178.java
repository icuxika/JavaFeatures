// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$178 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$178() {}
    static final FunctionDescriptor avio_printf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle avio_printf$MH = RuntimeHelper.downcallHandleVariadic(
        "avio_printf",
        constants$178.avio_printf$FUNC
    );
    static final FunctionDescriptor avio_print_string_array$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle avio_print_string_array$MH = RuntimeHelper.downcallHandle(
        "avio_print_string_array",
        constants$178.avio_print_string_array$FUNC
    );
    static final FunctionDescriptor avio_flush$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle avio_flush$MH = RuntimeHelper.downcallHandle(
        "avio_flush",
        constants$178.avio_flush$FUNC
    );
    static final FunctionDescriptor avio_read$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle avio_read$MH = RuntimeHelper.downcallHandle(
        "avio_read",
        constants$178.avio_read$FUNC
    );
    static final FunctionDescriptor avio_read_partial$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle avio_read_partial$MH = RuntimeHelper.downcallHandle(
        "avio_read_partial",
        constants$178.avio_read_partial$FUNC
    );
    static final FunctionDescriptor avio_r8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle avio_r8$MH = RuntimeHelper.downcallHandle(
        "avio_r8",
        constants$178.avio_r8$FUNC
    );
}

