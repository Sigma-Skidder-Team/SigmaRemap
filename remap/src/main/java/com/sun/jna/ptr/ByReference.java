// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna.ptr;

import com.sun.jna.Pointer;
import com.sun.jna.Memory;
import com.sun.jna.PointerType;

public abstract class ByReference extends PointerType
{
    public ByReference(final int dataSize) {
        this.setPointer(new Memory(dataSize));
    }
}
