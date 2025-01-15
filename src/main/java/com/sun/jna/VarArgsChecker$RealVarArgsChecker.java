// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Method;

public final class VarArgsChecker$RealVarArgsChecker extends VarArgsChecker
{
    private VarArgsChecker$RealVarArgsChecker() {
        super(null);
    }
    
    @Override
    public boolean isVarArgs(final Method m) {
        return m.isVarArgs();
    }
    
    @Override
    public int fixedArgs(final Method m) {
        return m.isVarArgs() ? (m.getParameterTypes().length - 1) : 0;
    }
}
