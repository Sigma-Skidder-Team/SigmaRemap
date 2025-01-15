// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public class NativeString$StringMemory extends Memory
{
    public final /* synthetic */ NativeString this$0;
    
    public NativeString$StringMemory(final NativeString this$0, final long size) {
        this.this$0 = this$0;
        super(size);
    }
    
    @Override
    public String toString() {
        return this.this$0.toString();
    }
}
