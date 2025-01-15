// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public class DefaultTypeMapper$Entry
{
    public Class<?> type;
    public Object converter;
    
    public DefaultTypeMapper$Entry(final Class<?> type, final Object converter) {
        this.type = type;
        this.converter = converter;
    }
}
