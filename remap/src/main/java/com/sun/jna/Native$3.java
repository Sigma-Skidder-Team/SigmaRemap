// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

public final class Native$3 implements InvocationHandler
{
    public final /* synthetic */ Library$Handler val$handler;
    public final /* synthetic */ Library val$library;
    
    public Native$3(final Library$Handler val$handler, final Library val$library) {
        this.val$handler = val$handler;
        this.val$library = val$library;
    }
    
    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
        synchronized (this.val$handler.getNativeLibrary()) {
            return this.val$handler.invoke(this.val$library, method, args);
        }
    }
}
