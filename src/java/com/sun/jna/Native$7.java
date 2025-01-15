// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public final class Native$7 extends ThreadLocal<Memory>
{
    public Memory initialValue() {
        final Memory memory = new Memory(4L);
        memory.clear();
        return memory;
    }
}
