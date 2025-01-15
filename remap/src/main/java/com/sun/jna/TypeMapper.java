// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public interface TypeMapper
{
    FromNativeConverter getFromNativeConverter(final Class<?> p0);
    
    ToNativeConverter getToNativeConverter(final Class<?> p0);
}
