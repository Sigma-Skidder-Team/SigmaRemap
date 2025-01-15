// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public final class Structure$3 extends Pointer
{
    public Structure$3(final long peer) {
        super(peer);
    }
    
    @Override
    public Pointer share(final long offset, final long sz) {
        return this;
    }
}
