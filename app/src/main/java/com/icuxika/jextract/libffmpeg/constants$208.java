// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$208 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$208() {}
    static final FunctionDescriptor av_image_fill_max_pixsteps$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_image_fill_max_pixsteps$MH = RuntimeHelper.downcallHandle(
        "av_image_fill_max_pixsteps",
        constants$208.av_image_fill_max_pixsteps$FUNC
    );
    static final FunctionDescriptor av_image_get_linesize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_image_get_linesize$MH = RuntimeHelper.downcallHandle(
        "av_image_get_linesize",
        constants$208.av_image_get_linesize$FUNC
    );
    static final FunctionDescriptor av_image_fill_linesizes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_image_fill_linesizes$MH = RuntimeHelper.downcallHandle(
        "av_image_fill_linesizes",
        constants$208.av_image_fill_linesizes$FUNC
    );
    static final FunctionDescriptor av_image_fill_plane_sizes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_image_fill_plane_sizes$MH = RuntimeHelper.downcallHandle(
        "av_image_fill_plane_sizes",
        constants$208.av_image_fill_plane_sizes$FUNC
    );
    static final FunctionDescriptor av_image_fill_pointers$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_image_fill_pointers$MH = RuntimeHelper.downcallHandle(
        "av_image_fill_pointers",
        constants$208.av_image_fill_pointers$FUNC
    );
    static final FunctionDescriptor av_image_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_image_alloc$MH = RuntimeHelper.downcallHandle(
        "av_image_alloc",
        constants$208.av_image_alloc$FUNC
    );
}


