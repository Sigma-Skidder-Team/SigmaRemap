// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public class Structure$FFIType$size_t extends IntegerType
{
    private static final long serialVersionUID = 1L;
    
    public Structure$FFIType$size_t() {
        this(0L);
    }
    
    public Structure$FFIType$size_t(final long value) {
        super(Native.SIZE_T_SIZE, value);
    }
}
