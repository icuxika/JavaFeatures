// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$144 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$144() {}
    static final FunctionDescriptor av_frame_new_side_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle av_frame_new_side_data$MH = RuntimeHelper.downcallHandle(
        "av_frame_new_side_data",
        constants$144.av_frame_new_side_data$FUNC
    );
    static final FunctionDescriptor av_frame_new_side_data_from_buf$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_frame_new_side_data_from_buf$MH = RuntimeHelper.downcallHandle(
        "av_frame_new_side_data_from_buf",
        constants$144.av_frame_new_side_data_from_buf$FUNC
    );
    static final FunctionDescriptor av_frame_get_side_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_frame_get_side_data$MH = RuntimeHelper.downcallHandle(
        "av_frame_get_side_data",
        constants$144.av_frame_get_side_data$FUNC
    );
    static final FunctionDescriptor av_frame_remove_side_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_frame_remove_side_data$MH = RuntimeHelper.downcallHandle(
        "av_frame_remove_side_data",
        constants$144.av_frame_remove_side_data$FUNC
    );
    static final FunctionDescriptor av_frame_apply_cropping$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_frame_apply_cropping$MH = RuntimeHelper.downcallHandle(
        "av_frame_apply_cropping",
        constants$144.av_frame_apply_cropping$FUNC
    );
    static final FunctionDescriptor av_frame_side_data_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_frame_side_data_name$MH = RuntimeHelper.downcallHandle(
        "av_frame_side_data_name",
        constants$144.av_frame_side_data_name$FUNC
    );
}

