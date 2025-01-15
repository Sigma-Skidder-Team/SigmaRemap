// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Method;

public final class VarArgsChecker$NoVarArgsChecker extends VarArgsChecker
{
    private VarArgsChecker$NoVarArgsChecker() {
        super(null);
    }
    
    @Override
    public boolean isVarArgs(final Method m) {
        return false;
    }
    
    @Override
    public int fixedArgs(final Method m) {
        return 0;
    }
}
