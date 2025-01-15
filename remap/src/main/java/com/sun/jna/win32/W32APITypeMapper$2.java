// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna.win32;

import com.sun.jna.FromNativeContext;
import com.sun.jna.ToNativeContext;
import com.sun.jna.TypeConverter;

public class W32APITypeMapper$2 implements TypeConverter
{
    public final /* synthetic */ W32APITypeMapper this$0;
    
    public W32APITypeMapper$2(final W32APITypeMapper this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public Object toNative(final Object value, final ToNativeContext context) {
        return Boolean.TRUE.equals(value) ? 1 : 0;
    }
    
    @Override
    public Object fromNative(final Object value, final FromNativeContext context) {
        return ((int)value != 0) ? Boolean.TRUE : Boolean.FALSE;
    }
    
    @Override
    public Class<?> nativeType() {
        return Integer.class;
    }
}
