// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$76 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$76() {}
    static final FunctionDescriptor _purecall_handler$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _purecall_handler_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _purecall_handler_UP$MH = RuntimeHelper.upcallHandle(_purecall_handler.class, "apply", constants$76._purecall_handler_UP$FUNC);
    static final FunctionDescriptor _purecall_handler_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _purecall_handler_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$76._purecall_handler_DOWN$FUNC
    );
    static final FunctionDescriptor _invalid_parameter_handler$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor _invalid_parameter_handler_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _invalid_parameter_handler_UP$MH = RuntimeHelper.upcallHandle(_invalid_parameter_handler.class, "apply", constants$76._invalid_parameter_handler_UP$FUNC);
    static final FunctionDescriptor _invalid_parameter_handler_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _invalid_parameter_handler_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$76._invalid_parameter_handler_DOWN$FUNC
    );
    static final FunctionDescriptor _set_purecall_handler$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _set_purecall_handler$MH = RuntimeHelper.downcallHandle(
        "_set_purecall_handler",
        constants$76._set_purecall_handler$FUNC
    );
    static final FunctionDescriptor _get_purecall_handler$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle _get_purecall_handler$MH = RuntimeHelper.downcallHandle(
        "_get_purecall_handler",
        constants$76._get_purecall_handler$FUNC
    );
}


