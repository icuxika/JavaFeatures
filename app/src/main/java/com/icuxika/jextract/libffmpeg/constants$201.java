// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$201 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$201() {}
    static final FunctionDescriptor sws_setColorspaceDetails$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle sws_setColorspaceDetails$MH = RuntimeHelper.downcallHandle(
        "sws_setColorspaceDetails",
        constants$201.sws_setColorspaceDetails$FUNC
    );
    static final FunctionDescriptor sws_getColorspaceDetails$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sws_getColorspaceDetails$MH = RuntimeHelper.downcallHandle(
        "sws_getColorspaceDetails",
        constants$201.sws_getColorspaceDetails$FUNC
    );
    static final FunctionDescriptor sws_allocVec$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle sws_allocVec$MH = RuntimeHelper.downcallHandle(
        "sws_allocVec",
        constants$201.sws_allocVec$FUNC
    );
    static final FunctionDescriptor sws_getGaussianVec$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle sws_getGaussianVec$MH = RuntimeHelper.downcallHandle(
        "sws_getGaussianVec",
        constants$201.sws_getGaussianVec$FUNC
    );
    static final FunctionDescriptor sws_scaleVec$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle sws_scaleVec$MH = RuntimeHelper.downcallHandle(
        "sws_scaleVec",
        constants$201.sws_scaleVec$FUNC
    );
    static final FunctionDescriptor sws_normalizeVec$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle sws_normalizeVec$MH = RuntimeHelper.downcallHandle(
        "sws_normalizeVec",
        constants$201.sws_normalizeVec$FUNC
    );
}

