// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$124 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$124() {}
    static final FunctionDescriptor av_dynarray_add_nofree$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_dynarray_add_nofree$MH = RuntimeHelper.downcallHandle(
        "av_dynarray_add_nofree",
        constants$124.av_dynarray_add_nofree$FUNC
    );
    static final FunctionDescriptor av_dynarray2_add$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_dynarray2_add$MH = RuntimeHelper.downcallHandle(
        "av_dynarray2_add",
        constants$124.av_dynarray2_add$FUNC
    );
    static final FunctionDescriptor av_size_mult$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle av_size_mult$MH = RuntimeHelper.downcallHandle(
        "av_size_mult",
        constants$124.av_size_mult$FUNC
    );
    static final FunctionDescriptor av_max_alloc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle av_max_alloc$MH = RuntimeHelper.downcallHandle(
        "av_max_alloc",
        constants$124.av_max_alloc$FUNC
    );
    static final FunctionDescriptor av_strerror$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle av_strerror$MH = RuntimeHelper.downcallHandle(
        "av_strerror",
        constants$124.av_strerror$FUNC
    );
    static final FunctionDescriptor av_reduce$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle av_reduce$MH = RuntimeHelper.downcallHandle(
        "av_reduce",
        constants$124.av_reduce$FUNC
    );
}

