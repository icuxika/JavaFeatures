// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$132 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$132() {}
    static final FunctionDescriptor av_buffer_default_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_buffer_default_free$MH = RuntimeHelper.downcallHandle(
        "av_buffer_default_free",
        constants$132.av_buffer_default_free$FUNC
    );
    static final FunctionDescriptor av_buffer_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_buffer_ref$MH = RuntimeHelper.downcallHandle(
        "av_buffer_ref",
        constants$132.av_buffer_ref$FUNC
    );
    static final FunctionDescriptor av_buffer_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_buffer_unref$MH = RuntimeHelper.downcallHandle(
        "av_buffer_unref",
        constants$132.av_buffer_unref$FUNC
    );
    static final FunctionDescriptor av_buffer_is_writable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_buffer_is_writable$MH = RuntimeHelper.downcallHandle(
        "av_buffer_is_writable",
        constants$132.av_buffer_is_writable$FUNC
    );
    static final FunctionDescriptor av_buffer_get_opaque$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_buffer_get_opaque$MH = RuntimeHelper.downcallHandle(
        "av_buffer_get_opaque",
        constants$132.av_buffer_get_opaque$FUNC
    );
    static final FunctionDescriptor av_buffer_get_ref_count$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_buffer_get_ref_count$MH = RuntimeHelper.downcallHandle(
        "av_buffer_get_ref_count",
        constants$132.av_buffer_get_ref_count$FUNC
    );
}


