// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna.win32;

import com.sun.jna.ToNativeConverter;
import com.sun.jna.TypeConverter;
import com.sun.jna.TypeMapper;
import com.sun.jna.DefaultTypeMapper;

public class W32APITypeMapper extends DefaultTypeMapper
{
    public static final TypeMapper UNICODE;
    public static final TypeMapper ASCII;
    public static final TypeMapper DEFAULT;
    
    public W32APITypeMapper(final boolean unicode) {
        if (unicode) {
            final W32APITypeMapper$1 w32APITypeMapper$1 = new W32APITypeMapper$1(this);
            this.addTypeConverter(String.class, w32APITypeMapper$1);
            this.addToNativeConverter(String[].class, w32APITypeMapper$1);
        }
        this.addTypeConverter(Boolean.class, new W32APITypeMapper$2(this));
    }
    
    static {
        UNICODE = new W32APITypeMapper(true);
        ASCII = new W32APITypeMapper(false);
        DEFAULT = (Boolean.getBoolean("w32.ascii") ? W32APITypeMapper.ASCII : W32APITypeMapper.UNICODE);
    }
}
