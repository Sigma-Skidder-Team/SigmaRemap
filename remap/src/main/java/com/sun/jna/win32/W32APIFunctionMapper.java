// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna.win32;

import java.lang.reflect.Method;
import com.sun.jna.NativeLibrary;
import com.sun.jna.FunctionMapper;

public class W32APIFunctionMapper implements FunctionMapper
{
    public static final FunctionMapper UNICODE;
    public static final FunctionMapper ASCII;
    private final String suffix;
    
    public W32APIFunctionMapper(final boolean unicode) {
        this.suffix = (unicode ? "W" : "A");
    }
    
    @Override
    public String getFunctionName(final NativeLibrary library, final Method method) {
        String str = method.getName();
        if (!str.endsWith("W") && !str.endsWith("A")) {
            try {
                str = library.getFunction(str + this.suffix, 63).getName();
            }
            catch (final UnsatisfiedLinkError unsatisfiedLinkError) {}
        }
        return str;
    }
    
    static {
        UNICODE = new W32APIFunctionMapper(true);
        ASCII = new W32APIFunctionMapper(false);
    }
}
