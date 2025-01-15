// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar.item.view;

import com.thizzer.jtouchbar.NativeLinkObject;

public abstract class TouchBarView extends NativeLinkObject
{
    public void update() {
        this.setChanged();
        this.notifyObservers();
    }
}
