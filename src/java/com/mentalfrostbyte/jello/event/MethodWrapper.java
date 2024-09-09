package com.mentalfrostbyte.jello.event;

import com.mentalfrostbyte.jello.event.priority.Priority;
import com.mentalfrostbyte.jello.module.impl.movement.phase.NCPPhase;
import com.mentalfrostbyte.jello.unmapped.Reflection;
import mapped.ReflectionUtils;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

public class MethodWrapper {
    private static String[] field35680;
    private final Object object;
    private final Class<?> classss;
    private final Method method;
    private final Reflection reflection;
    private MethodHandle methodHandle;
    private final Priority priority;
    private final boolean field35687;

    public MethodWrapper(Object var1, Class<?> var2, Method var3, Priority var4) {
        this.object = var1;
        this.classss = var2;
        this.method = var3;
        this.reflection = ReflectionUtils.createLambdaForMethod(var3);

        try {
            this.methodHandle = MethodHandles.lookup().unreflect(var3);
        } catch (IllegalAccessException var8) {
            var8.printStackTrace();
        }

        this.priority = var4;
        this.field35687 = var1.getClass().getSuperclass() == NCPPhase.class.getSuperclass();
    }

    public Object method29022() {
        return this.object;
    }

    public MethodHandle method29023() {
        return this.methodHandle;
    }

    public Reflection method29024() {
        return this.reflection;
    }

    public Method method29025() {
        return this.method;
    }

    public Priority method29026() {
        return this.priority;
    }

    public boolean method29027() {
        return this.field35687;
    }

    @Override
    public boolean equals(Object var1) {
        if (!(var1 instanceof MethodWrapper)) {
            return false;
        } else {
            MethodWrapper var4 = (MethodWrapper) var1;
            return this.object == var4.object && this.method == var4.method && this.priority == var4.priority;
        }
    }
}
