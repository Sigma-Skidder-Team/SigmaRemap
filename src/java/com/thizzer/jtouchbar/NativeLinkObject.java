// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar;

import java.util.Observable;

public abstract class NativeLinkObject extends Observable
{
    private long _nativeInstancePointer;
    
    public NativeLinkObject() {
        this._nativeInstancePointer = 0L;
    }
    
    public long getNativeInstancePointer() {
        return this._nativeInstancePointer;
    }
    
    public void setNativeInstancePointer(final long nativeInstancePointer) {
        this._nativeInstancePointer = nativeInstancePointer;
    }
}
