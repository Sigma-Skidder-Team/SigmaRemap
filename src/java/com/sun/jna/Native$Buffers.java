// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.nio.Buffer;

public class Native$Buffers
{
    private Native$Buffers() {
    }
    
    public static boolean isBuffer(final Class<?> cls) {
        return Buffer.class.isAssignableFrom(cls);
    }
}
