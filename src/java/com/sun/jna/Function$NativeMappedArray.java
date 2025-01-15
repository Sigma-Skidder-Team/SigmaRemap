// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public class Function$NativeMappedArray extends Memory implements Function$PostCallRead
{
    private final NativeMapped[] original;
    
    public Function$NativeMappedArray(final NativeMapped[] arg) {
        super(Native.getNativeSize(arg.getClass(), arg));
        this.setValue(0L, this.original = arg, this.original.getClass());
    }
    
    @Override
    public void read() {
        this.getValue(0L, this.original.getClass(), this.original);
    }
}
