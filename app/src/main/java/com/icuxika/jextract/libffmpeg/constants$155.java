// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$155 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$155() {}
    static final FunctionDescriptor av_packet_move_ref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_packet_move_ref$MH = RuntimeHelper.downcallHandle(
        "av_packet_move_ref",
        constants$155.av_packet_move_ref$FUNC
    );
    static final FunctionDescriptor av_packet_copy_props$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_packet_copy_props$MH = RuntimeHelper.downcallHandle(
        "av_packet_copy_props",
        constants$155.av_packet_copy_props$FUNC
    );
    static final FunctionDescriptor av_packet_make_refcounted$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_packet_make_refcounted$MH = RuntimeHelper.downcallHandle(
        "av_packet_make_refcounted",
        constants$155.av_packet_make_refcounted$FUNC
    );
    static final FunctionDescriptor av_packet_make_writable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_packet_make_writable$MH = RuntimeHelper.downcallHandle(
        "av_packet_make_writable",
        constants$155.av_packet_make_writable$FUNC
    );
    static final FunctionDescriptor av_packet_rescale_ts$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("num"),
            Constants$root.C_LONG$LAYOUT.withName("den")
        ).withName("AVRational"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("num"),
            Constants$root.C_LONG$LAYOUT.withName("den")
        ).withName("AVRational")
    );
    static final MethodHandle av_packet_rescale_ts$MH = RuntimeHelper.downcallHandle(
        "av_packet_rescale_ts",
        constants$155.av_packet_rescale_ts$FUNC
    );
    static final FunctionDescriptor avcodec_version$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle avcodec_version$MH = RuntimeHelper.downcallHandle(
        "avcodec_version",
        constants$155.avcodec_version$FUNC
    );
}


