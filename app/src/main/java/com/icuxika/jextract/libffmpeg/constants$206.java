// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$206 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$206() {}
    static final FunctionDescriptor av_chroma_location_enum_to_pos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_chroma_location_enum_to_pos$MH = RuntimeHelper.downcallHandle(
        "av_chroma_location_enum_to_pos",
        constants$206.av_chroma_location_enum_to_pos$FUNC
    );
    static final FunctionDescriptor av_chroma_location_pos_to_enum$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_chroma_location_pos_to_enum$MH = RuntimeHelper.downcallHandle(
        "av_chroma_location_pos_to_enum",
        constants$206.av_chroma_location_pos_to_enum$FUNC
    );
    static final FunctionDescriptor av_get_pix_fmt$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_get_pix_fmt$MH = RuntimeHelper.downcallHandle(
        "av_get_pix_fmt",
        constants$206.av_get_pix_fmt$FUNC
    );
    static final FunctionDescriptor av_get_pix_fmt_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_get_pix_fmt_name$MH = RuntimeHelper.downcallHandle(
        "av_get_pix_fmt_name",
        constants$206.av_get_pix_fmt_name$FUNC
    );
    static final FunctionDescriptor av_get_pix_fmt_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_get_pix_fmt_string$MH = RuntimeHelper.downcallHandle(
        "av_get_pix_fmt_string",
        constants$206.av_get_pix_fmt_string$FUNC
    );
    static final FunctionDescriptor av_read_image_line2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_read_image_line2$MH = RuntimeHelper.downcallHandle(
        "av_read_image_line2",
        constants$206.av_read_image_line2$FUNC
    );
}


