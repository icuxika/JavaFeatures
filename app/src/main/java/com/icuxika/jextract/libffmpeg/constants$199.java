// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$199 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$199() {}
    static final FunctionDescriptor sws_isSupportedEndiannessConversion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle sws_isSupportedEndiannessConversion$MH = RuntimeHelper.downcallHandle(
        "sws_isSupportedEndiannessConversion",
        constants$199.sws_isSupportedEndiannessConversion$FUNC
    );
    static final FunctionDescriptor sws_alloc_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle sws_alloc_context$MH = RuntimeHelper.downcallHandle(
        "sws_alloc_context",
        constants$199.sws_alloc_context$FUNC
    );
    static final FunctionDescriptor sws_init_context$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sws_init_context$MH = RuntimeHelper.downcallHandle(
        "sws_init_context",
        constants$199.sws_init_context$FUNC
    );
    static final FunctionDescriptor sws_freeContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sws_freeContext$MH = RuntimeHelper.downcallHandle(
        "sws_freeContext",
        constants$199.sws_freeContext$FUNC
    );
    static final FunctionDescriptor sws_getContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sws_getContext$MH = RuntimeHelper.downcallHandle(
        "sws_getContext",
        constants$199.sws_getContext$FUNC
    );
    static final FunctionDescriptor sws_scale$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sws_scale$MH = RuntimeHelper.downcallHandle(
        "sws_scale",
        constants$199.sws_scale$FUNC
    );
}


