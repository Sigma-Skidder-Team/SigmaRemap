// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public class Memory$SharedMemory extends Memory
{
    public final /* synthetic */ Memory this$0;
    
    public Memory$SharedMemory(final Memory this$0, final long offset, final long size) {
        this.this$0 = this$0;
        this.size = size;
        this.peer = this$0.peer + offset;
    }
    
    @Override
    public void dispose() {
        this.peer = 0L;
    }
    
    @Override
    public void boundsCheck(final long off, final long sz) {
        this.this$0.boundsCheck(this.peer - this.this$0.peer + off, sz);
    }
    
    @Override
    public String toString() {
        return super.toString() + " (shared from " + this.this$0.toString() + ")";
    }
}
