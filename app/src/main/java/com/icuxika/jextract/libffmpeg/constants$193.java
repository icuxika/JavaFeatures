// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$193 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$193() {}
    static final FunctionDescriptor av_hex_dump_log$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_hex_dump_log$MH = RuntimeHelper.downcallHandle(
        "av_hex_dump_log",
        constants$193.av_hex_dump_log$FUNC
    );
    static final FunctionDescriptor av_pkt_dump2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_pkt_dump2$MH = RuntimeHelper.downcallHandle(
        "av_pkt_dump2",
        constants$193.av_pkt_dump2$FUNC
    );
    static final FunctionDescriptor av_pkt_dump_log2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_pkt_dump_log2$MH = RuntimeHelper.downcallHandle(
        "av_pkt_dump_log2",
        constants$193.av_pkt_dump_log2$FUNC
    );
    static final FunctionDescriptor av_codec_get_id$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_codec_get_id$MH = RuntimeHelper.downcallHandle(
        "av_codec_get_id",
        constants$193.av_codec_get_id$FUNC
    );
    static final FunctionDescriptor av_codec_get_tag$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_codec_get_tag$MH = RuntimeHelper.downcallHandle(
        "av_codec_get_tag",
        constants$193.av_codec_get_tag$FUNC
    );
    static final FunctionDescriptor av_codec_get_tag2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_codec_get_tag2$MH = RuntimeHelper.downcallHandle(
        "av_codec_get_tag2",
        constants$193.av_codec_get_tag2$FUNC
    );
}


