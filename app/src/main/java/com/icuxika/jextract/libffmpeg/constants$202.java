// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$202 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$202() {}
    static final FunctionDescriptor sws_freeVec$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sws_freeVec$MH = RuntimeHelper.downcallHandle(
        "sws_freeVec",
        constants$202.sws_freeVec$FUNC
    );
    static final FunctionDescriptor sws_getDefaultFilter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle sws_getDefaultFilter$MH = RuntimeHelper.downcallHandle(
        "sws_getDefaultFilter",
        constants$202.sws_getDefaultFilter$FUNC
    );
    static final FunctionDescriptor sws_freeFilter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sws_freeFilter$MH = RuntimeHelper.downcallHandle(
        "sws_freeFilter",
        constants$202.sws_freeFilter$FUNC
    );
    static final FunctionDescriptor sws_getCachedContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sws_getCachedContext$MH = RuntimeHelper.downcallHandle(
        "sws_getCachedContext",
        constants$202.sws_getCachedContext$FUNC
    );
    static final FunctionDescriptor sws_convertPalette8ToPacked32$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sws_convertPalette8ToPacked32$MH = RuntimeHelper.downcallHandle(
        "sws_convertPalette8ToPacked32",
        constants$202.sws_convertPalette8ToPacked32$FUNC
    );
    static final FunctionDescriptor sws_convertPalette8ToPacked24$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sws_convertPalette8ToPacked24$MH = RuntimeHelper.downcallHandle(
        "sws_convertPalette8ToPacked24",
        constants$202.sws_convertPalette8ToPacked24$FUNC
    );
}

