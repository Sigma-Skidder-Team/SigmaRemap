package com.thizzer.jtouchbar;

import java.util.Observable;

public abstract class NativeLinkObject extends Observable {
    private long _nativeInstancePointer = 0L;

    public long getNativeInstancePointer() {
        return this._nativeInstancePointer;
    }

    public void setNativeInstancePointer(long nativeInstancePointer) {
        this._nativeInstancePointer = nativeInstancePointer;
    }
}
