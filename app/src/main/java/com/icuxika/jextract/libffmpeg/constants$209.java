// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$209 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$209() {}
    static final FunctionDescriptor av_image_copy_plane$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_image_copy_plane$MH = RuntimeHelper.downcallHandle(
        "av_image_copy_plane",
        constants$209.av_image_copy_plane$FUNC
    );
    static final FunctionDescriptor av_image_copy_plane_uc_from$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_image_copy_plane_uc_from$MH = RuntimeHelper.downcallHandle(
        "av_image_copy_plane_uc_from",
        constants$209.av_image_copy_plane_uc_from$FUNC
    );
    static final FunctionDescriptor av_image_copy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_image_copy$MH = RuntimeHelper.downcallHandle(
        "av_image_copy",
        constants$209.av_image_copy$FUNC
    );
    static final FunctionDescriptor av_image_copy_uc_from$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_image_copy_uc_from$MH = RuntimeHelper.downcallHandle(
        "av_image_copy_uc_from",
        constants$209.av_image_copy_uc_from$FUNC
    );
    static final FunctionDescriptor av_image_fill_arrays$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_image_fill_arrays$MH = RuntimeHelper.downcallHandle(
        "av_image_fill_arrays",
        constants$209.av_image_fill_arrays$FUNC
    );
    static final FunctionDescriptor av_image_get_buffer_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_image_get_buffer_size$MH = RuntimeHelper.downcallHandle(
        "av_image_get_buffer_size",
        constants$209.av_image_get_buffer_size$FUNC
    );
}

