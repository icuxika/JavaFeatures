// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$44 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$44() {}
    static final FunctionDescriptor gets_s$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gets_s$MH = RuntimeHelper.downcallHandle(
        "gets_s",
        constants$44.gets_s$FUNC
    );
    static final FunctionDescriptor tmpfile_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tmpfile_s$MH = RuntimeHelper.downcallHandle(
        "tmpfile_s",
        constants$44.tmpfile_s$FUNC
    );
    static final FunctionDescriptor tmpnam_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle tmpnam_s$MH = RuntimeHelper.downcallHandle(
        "tmpnam_s",
        constants$44.tmpnam_s$FUNC
    );
    static final FunctionDescriptor clearerr$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clearerr$MH = RuntimeHelper.downcallHandle(
        "clearerr",
        constants$44.clearerr$FUNC
    );
    static final FunctionDescriptor fclose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fclose$MH = RuntimeHelper.downcallHandle(
        "fclose",
        constants$44.fclose$FUNC
    );
    static final FunctionDescriptor _fcloseall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _fcloseall$MH = RuntimeHelper.downcallHandle(
        "_fcloseall",
        constants$44._fcloseall$FUNC
    );
}


