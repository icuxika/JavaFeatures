// Generated by jextract

package com.icuxika.jextract.libffmpeg;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$74 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$74() {}
    static final FunctionDescriptor quick_exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle quick_exit$MH = RuntimeHelper.downcallHandle(
        "quick_exit",
        constants$74.quick_exit$FUNC
    );
    static final FunctionDescriptor abort$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle abort$MH = RuntimeHelper.downcallHandle(
        "abort",
        constants$74.abort$FUNC
    );
    static final FunctionDescriptor _set_abort_behavior$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _set_abort_behavior$MH = RuntimeHelper.downcallHandle(
        "_set_abort_behavior",
        constants$74._set_abort_behavior$FUNC
    );
    static final FunctionDescriptor _onexit_t$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final FunctionDescriptor _onexit_t_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _onexit_t_UP$MH = RuntimeHelper.upcallHandle(_onexit_t.class, "apply", constants$74._onexit_t_UP$FUNC);
    static final FunctionDescriptor _onexit_t_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _onexit_t_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$74._onexit_t_DOWN$FUNC
    );
    static final FunctionDescriptor atexit$x0$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor atexit$x0_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle atexit$x0_UP$MH = RuntimeHelper.upcallHandle(atexit$x0.class, "apply", constants$74.atexit$x0_UP$FUNC);
}


