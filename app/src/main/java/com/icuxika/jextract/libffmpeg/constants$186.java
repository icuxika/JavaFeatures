// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$186 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$186() {}
    static final FunctionDescriptor av_muxer_iterate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_muxer_iterate$MH = RuntimeHelper.downcallHandle(
        "av_muxer_iterate",
        constants$186.av_muxer_iterate$FUNC
    );
    static final FunctionDescriptor av_demuxer_iterate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_demuxer_iterate$MH = RuntimeHelper.downcallHandle(
        "av_demuxer_iterate",
        constants$186.av_demuxer_iterate$FUNC
    );
    static final FunctionDescriptor avformat_alloc_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle avformat_alloc_context$MH = RuntimeHelper.downcallHandle(
        "avformat_alloc_context",
        constants$186.avformat_alloc_context$FUNC
    );
    static final FunctionDescriptor avformat_free_context$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle avformat_free_context$MH = RuntimeHelper.downcallHandle(
        "avformat_free_context",
        constants$186.avformat_free_context$FUNC
    );
    static final FunctionDescriptor avformat_get_class$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle avformat_get_class$MH = RuntimeHelper.downcallHandle(
        "avformat_get_class",
        constants$186.avformat_get_class$FUNC
    );
    static final FunctionDescriptor av_stream_get_class$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle av_stream_get_class$MH = RuntimeHelper.downcallHandle(
        "av_stream_get_class",
        constants$186.av_stream_get_class$FUNC
    );
}

