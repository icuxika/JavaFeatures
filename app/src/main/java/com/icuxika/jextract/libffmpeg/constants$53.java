// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$53 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$53() {}
    static final FunctionDescriptor _unlock_file$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _unlock_file$MH = RuntimeHelper.downcallHandle(
        "_unlock_file",
        constants$53._unlock_file$FUNC
    );
    static final FunctionDescriptor _fclose_nolock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fclose_nolock$MH = RuntimeHelper.downcallHandle(
        "_fclose_nolock",
        constants$53._fclose_nolock$FUNC
    );
    static final FunctionDescriptor _fflush_nolock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fflush_nolock$MH = RuntimeHelper.downcallHandle(
        "_fflush_nolock",
        constants$53._fflush_nolock$FUNC
    );
    static final FunctionDescriptor _fgetc_nolock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fgetc_nolock$MH = RuntimeHelper.downcallHandle(
        "_fgetc_nolock",
        constants$53._fgetc_nolock$FUNC
    );
    static final FunctionDescriptor _fputc_nolock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fputc_nolock$MH = RuntimeHelper.downcallHandle(
        "_fputc_nolock",
        constants$53._fputc_nolock$FUNC
    );
    static final FunctionDescriptor _fread_nolock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fread_nolock$MH = RuntimeHelper.downcallHandle(
        "_fread_nolock",
        constants$53._fread_nolock$FUNC
    );
}


