package com.mentalfrostbyte.jello.event;

import com.mentalfrostbyte.jello.event.priority.Priority;
import com.mentalfrostbyte.jello.unmapped.Invoker;
import lol.ReflectionUtils;

import java.lang.reflect.Method;

public class MethodWrapper {
    private final Object parent;
    private final Method method;
    private final Invoker invoker;
    private final Priority priority;

    public MethodWrapper(Object parent, Method method, Priority priority) {
        this.parent = parent;
        this.method = method;
        this.invoker = ReflectionUtils.getMethodInvoker(method);
        this.priority = priority;
    }

    public Object getParent() {
        return this.parent;
    }

    public Invoker getReflection() {
        return this.invoker;
    }

    public Method getMethod() {
        return this.method;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public boolean getTrue() {
        return true; //IF THIS IS SET TO FALSE MODULES WONT FUNCTION
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof MethodWrapper)) {
            return false;
        } else {
            MethodWrapper var4 = (MethodWrapper) object;
            return this.parent == var4.parent && this.method == var4.method && this.priority == var4.priority;
        }
    }
}
