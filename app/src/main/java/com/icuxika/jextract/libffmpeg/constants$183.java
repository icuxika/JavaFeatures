// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$183 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$183() {}
    static final FunctionDescriptor avio_handshake$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle avio_handshake$MH = RuntimeHelper.downcallHandle(
        "avio_handshake",
        constants$183.avio_handshake$FUNC
    );
    static final FunctionDescriptor av_get_packet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_get_packet$MH = RuntimeHelper.downcallHandle(
        "av_get_packet",
        constants$183.av_get_packet$FUNC
    );
    static final FunctionDescriptor av_append_packet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_append_packet$MH = RuntimeHelper.downcallHandle(
        "av_append_packet",
        constants$183.av_append_packet$FUNC
    );
    static final FunctionDescriptor av_disposition_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_disposition_from_string$MH = RuntimeHelper.downcallHandle(
        "av_disposition_from_string",
        constants$183.av_disposition_from_string$FUNC
    );
    static final FunctionDescriptor av_disposition_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle av_disposition_to_string$MH = RuntimeHelper.downcallHandle(
        "av_disposition_to_string",
        constants$183.av_disposition_to_string$FUNC
    );
    static final FunctionDescriptor av_stream_get_parser$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_stream_get_parser$MH = RuntimeHelper.downcallHandle(
        "av_stream_get_parser",
        constants$183.av_stream_get_parser$FUNC
    );
}

