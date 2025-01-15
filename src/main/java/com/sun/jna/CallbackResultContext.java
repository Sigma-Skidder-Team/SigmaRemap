// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Method;

public class CallbackResultContext extends ToNativeContext
{
    private Method method;
    
    public CallbackResultContext(final Method callbackMethod) {
        this.method = callbackMethod;
    }
    
    public Method getMethod() {
        return this.method;
    }
}
