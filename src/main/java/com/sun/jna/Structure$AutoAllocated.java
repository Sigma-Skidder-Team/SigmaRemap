// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public class Structure$AutoAllocated extends Memory
{
    public Structure$AutoAllocated(final int size) {
        super(size);
        super.clear();
    }
    
    @Override
    public String toString() {
        return "auto-" + super.toString();
    }
}
