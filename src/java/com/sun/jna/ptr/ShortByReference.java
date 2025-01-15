// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna.ptr;

public class ShortByReference extends ByReference
{
    public ShortByReference() {
        this((short)0);
    }
    
    public ShortByReference(final short value) {
        super(2);
        this.setValue(value);
    }
    
    public void setValue(final short value) {
        this.getPointer().setShort(0L, value);
    }
    
    public short getValue() {
        return this.getPointer().getShort(0L);
    }
}
