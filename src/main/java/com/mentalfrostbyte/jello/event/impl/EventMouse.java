package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;

public class EventMouse extends CancellableEvent {
    private final double field21574;

    public EventMouse(double var1) {
        this.field21574 = var1;
    }

    public double method13980() {
        return this.field21574;
    }
}
