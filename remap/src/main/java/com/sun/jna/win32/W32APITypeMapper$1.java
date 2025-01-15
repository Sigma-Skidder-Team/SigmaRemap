// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna.win32;

import com.sun.jna.FromNativeContext;
import com.sun.jna.WString;
import com.sun.jna.StringArray;
import com.sun.jna.ToNativeContext;
import com.sun.jna.TypeConverter;

public class W32APITypeMapper$1 implements TypeConverter
{
    public final /* synthetic */ W32APITypeMapper this$0;
    
    public W32APITypeMapper$1(final W32APITypeMapper this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public Object toNative(final Object value, final ToNativeContext context) {
        if (value == null) {
            return null;
        }
        if (value instanceof String[]) {
            return new StringArray((String[])value, true);
        }
        return new WString(value.toString());
    }
    
    @Override
    public Object fromNative(final Object value, final FromNativeContext context) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }
    
    @Override
    public Class<?> nativeType() {
        return WString.class;
    }
}
