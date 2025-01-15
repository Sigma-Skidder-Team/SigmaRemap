// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.Map;
import java.lang.reflect.Method;

public class NativeLibrary$1 extends Function
{
    public final /* synthetic */ NativeLibrary this$0;
    
    public NativeLibrary$1(final NativeLibrary this$0, final NativeLibrary library, final String functionName, final int callFlags, final String encoding) {
        this.this$0 = this$0;
        super(library, functionName, callFlags, encoding);
    }
    
    @Override
    public Object invoke(final Object[] args, final Class<?> returnType, final boolean b, final int fixedArgs) {
        return Native.getLastError();
    }
    
    @Override
    public Object invoke(final Method invokingMethod, final Class<?>[] paramTypes, final Class<?> returnType, final Object[] inArgs, final Map<String, ?> options) {
        return Native.getLastError();
    }
}
