// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$139 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$139() {}
    static final FunctionDescriptor av_channel_description$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_channel_description$MH = RuntimeHelper.downcallHandle(
        "av_channel_description",
        constants$139.av_channel_description$FUNC
    );
    static final FunctionDescriptor av_channel_description_bprint$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_channel_description_bprint$MH = RuntimeHelper.downcallHandle(
        "av_channel_description_bprint",
        constants$139.av_channel_description_bprint$FUNC
    );
    static final FunctionDescriptor av_channel_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_channel_from_string$MH = RuntimeHelper.downcallHandle(
        "av_channel_from_string",
        constants$139.av_channel_from_string$FUNC
    );
    static final FunctionDescriptor av_channel_layout_from_mask$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle av_channel_layout_from_mask$MH = RuntimeHelper.downcallHandle(
        "av_channel_layout_from_mask",
        constants$139.av_channel_layout_from_mask$FUNC
    );
    static final FunctionDescriptor av_channel_layout_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_channel_layout_from_string$MH = RuntimeHelper.downcallHandle(
        "av_channel_layout_from_string",
        constants$139.av_channel_layout_from_string$FUNC
    );
    static final FunctionDescriptor av_channel_layout_default$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_channel_layout_default$MH = RuntimeHelper.downcallHandle(
        "av_channel_layout_default",
        constants$139.av_channel_layout_default$FUNC
    );
}


