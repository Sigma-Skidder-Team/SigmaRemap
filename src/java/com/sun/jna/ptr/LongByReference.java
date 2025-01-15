// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna.ptr;

public class LongByReference extends ByReference
{
    public LongByReference() {
        this(0L);
    }
    
    public LongByReference(final long value) {
        super(8);
        this.setValue(value);
    }
    
    public void setValue(final long value) {
        this.getPointer().setLong(0L, value);
    }
    
    public long getValue() {
        return this.getPointer().getLong(0L);
    }
}
