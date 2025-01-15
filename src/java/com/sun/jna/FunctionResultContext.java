// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public class FunctionResultContext extends FromNativeContext
{
    private Function function;
    private Object[] args;
    
    public FunctionResultContext(final Class<?> resultClass, final Function function, final Object[] args) {
        super(resultClass);
        this.function = function;
        this.args = args;
    }
    
    public Function getFunction() {
        return this.function;
    }
    
    public Object[] getArguments() {
        return this.args;
    }
}
