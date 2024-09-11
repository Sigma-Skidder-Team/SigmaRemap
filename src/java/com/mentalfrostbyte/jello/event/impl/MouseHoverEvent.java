package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;

public class MouseHoverEvent extends CancellableEvent {
    private final int field21563;

    public MouseHoverEvent(int var1) {
        this.field21563 = var1;
    }

    public int getMouseButton() {
        return this.field21563;
    }
}
