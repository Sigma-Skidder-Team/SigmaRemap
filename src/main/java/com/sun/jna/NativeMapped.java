// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public interface NativeMapped
{
    Object fromNative(final Object p0, final FromNativeContext p1);
    
    Object toNative();
    
    Class<?> nativeType();
}
