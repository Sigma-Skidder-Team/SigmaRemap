package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;

public class EventUseLess extends CancellableEvent {
    private final double field21552;

    public EventUseLess(double var1) {
        this.field21552 = var1;
    }

    public double method13969() {
        return this.field21552;
    }
}
