// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.impl.movement.phases.NCPPhase;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;

public class EventHandler {
    private final Object listenerInstance;
    private final Class<?> eventClass;
    private final Method handlerMethod;
    private final MethodInvoker invoker;
    private final MethodHandle methodHandle;
    private final EventPriority priority;
    private final boolean isFromNCPPhase;

    public EventHandler(final Object listenerInstance, final Class<?> eventClass, final Method handlerMethod, final EventPriority priority) {
        this.listenerInstance = listenerInstance;
        this.eventClass = eventClass;
        this.handlerMethod = handlerMethod;
        this.invoker = ClassUtil.createMethodInvoker(handlerMethod);
        MethodHandle tempHandle = null;
        try {
            tempHandle = MethodHandles.lookup().unreflect(handlerMethod);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        this.methodHandle = tempHandle;
        this.priority = priority;
        this.isFromNCPPhase = (listenerInstance.getClass().getSuperclass() == NCPPhase.class.getSuperclass());
    }

    public Object getListenerInstance() {
        return this.listenerInstance;
    }

    public MethodHandle getMethodHandle() {
        return this.methodHandle;
    }

    public MethodInvoker getInvoker() {
        return this.invoker;
    }

    public Method getHandlerMethod() {
        return this.handlerMethod;
    }

    public EventPriority getPriority() {
        return this.priority;
    }

    public boolean isFromNCPPhase() {
        return this.isFromNCPPhase;
    }

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof EventHandler)) {
            return false;
        }
        final EventHandler other = (EventHandler) obj;
        return this.listenerInstance == other.listenerInstance
                && this.handlerMethod == other.handlerMethod
                && this.priority == other.priority;
    }
}
