// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Method;
import java.security.PrivilegedAction;

public final class Native$4 implements PrivilegedAction<Method>
{
    @Override
    public Method run() {
        try {
            final Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        }
        catch (final Exception ex) {
            return null;
        }
    }
}
