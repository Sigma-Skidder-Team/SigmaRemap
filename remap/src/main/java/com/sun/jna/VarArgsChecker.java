// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Method;

public abstract class VarArgsChecker
{
    private VarArgsChecker() {
    }
    
    public static VarArgsChecker create() {
        try {
            if (Method.class.getMethod("isVarArgs", new Class[0]) != null) {
                return new VarArgsChecker$RealVarArgsChecker(null);
            }
            return new VarArgsChecker$NoVarArgsChecker(null);
        }
        catch (final NoSuchMethodException ex) {
            return new VarArgsChecker$NoVarArgsChecker(null);
        }
        catch (final SecurityException ex2) {
            return new VarArgsChecker$NoVarArgsChecker(null);
        }
    }
    
    public abstract boolean isVarArgs(final Method p0);
    
    public abstract int fixedArgs(final Method p0);
}
