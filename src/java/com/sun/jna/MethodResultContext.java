// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Method;

public class MethodResultContext extends FunctionResultContext
{
    private final Method method;
    
    public MethodResultContext(final Class<?> resultClass, final Function function, final Object[] args, final Method method) {
        super(resultClass, function, args);
        this.method = method;
    }
    
    public Method getMethod() {
        return this.method;
    }
}
