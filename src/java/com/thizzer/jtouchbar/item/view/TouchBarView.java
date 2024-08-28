package com.thizzer.jtouchbar.item.view;

import com.thizzer.jtouchbar.NativeLinkObject;

public abstract class TouchBarView extends NativeLinkObject {
    public void update() {
        this.setChanged();
        this.notifyObservers();
    }
}
