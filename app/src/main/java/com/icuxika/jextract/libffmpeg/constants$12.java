// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$12 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$12() {}
    static final FunctionDescriptor _dsin$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _dsin$MH = RuntimeHelper.downcallHandle(
        "_dsin",
        constants$12._dsin$FUNC
    );
    static final FunctionDescriptor _fdsin$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _fdsin$MH = RuntimeHelper.downcallHandle(
        "_fdsin",
        constants$12._fdsin$FUNC
    );
    static final OfDouble _Zero_C$LAYOUT = Constants$root.C_DOUBLE$LAYOUT;
    static final VarHandle _Zero_C$VH = constants$12._Zero_C$LAYOUT.varHandle();
    static final MemorySegment _Zero_C$SEGMENT = RuntimeHelper.lookupGlobalVariable("_Zero_C", constants$12._Zero_C$LAYOUT);
    static final OfDouble _Xbig_C$LAYOUT = Constants$root.C_DOUBLE$LAYOUT;
    static final VarHandle _Xbig_C$VH = constants$12._Xbig_C$LAYOUT.varHandle();
    static final MemorySegment _Xbig_C$SEGMENT = RuntimeHelper.lookupGlobalVariable("_Xbig_C", constants$12._Xbig_C$LAYOUT);
    static final OfFloat _FZero_C$LAYOUT = Constants$root.C_FLOAT$LAYOUT;
    static final VarHandle _FZero_C$VH = constants$12._FZero_C$LAYOUT.varHandle();
    static final MemorySegment _FZero_C$SEGMENT = RuntimeHelper.lookupGlobalVariable("_FZero_C", constants$12._FZero_C$LAYOUT);
    static final OfFloat _FXbig_C$LAYOUT = Constants$root.C_FLOAT$LAYOUT;
    static final VarHandle _FXbig_C$VH = constants$12._FXbig_C$LAYOUT.varHandle();
    static final MemorySegment _FXbig_C$SEGMENT = RuntimeHelper.lookupGlobalVariable("_FXbig_C", constants$12._FXbig_C$LAYOUT);
}

