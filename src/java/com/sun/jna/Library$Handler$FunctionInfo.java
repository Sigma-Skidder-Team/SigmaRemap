// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.Map;
import java.lang.reflect.InvocationHandler;

public final class Library$Handler$FunctionInfo
{
    public final InvocationHandler handler;
    public final Function function;
    public final boolean isVarArgs;
    public final Map<String, ?> options;
    public final Class<?>[] parameterTypes;
    
    public Library$Handler$FunctionInfo(final InvocationHandler handler, final Function function, final Class<?>[] parameterTypes, final boolean isVarArgs, final Map<String, ?> options) {
        this.handler = handler;
        this.function = function;
        this.isVarArgs = isVarArgs;
        this.options = options;
        this.parameterTypes = parameterTypes;
    }
}
