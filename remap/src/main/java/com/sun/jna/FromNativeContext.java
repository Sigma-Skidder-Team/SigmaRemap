// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public class FromNativeContext
{
    private final Class<?> type;
    
    public FromNativeContext(final Class<?> javaType) {
        this.type = javaType;
    }
    
    public Class<?> getTargetType() {
        return this.type;
    }
}
