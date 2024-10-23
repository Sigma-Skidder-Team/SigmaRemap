package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;

public class EventRender extends CancellableEvent {
    private int field21541 = 99;

    public int method13960() {
        return this.field21541;
    }

    public void method13961(int var1) {
        this.field21541 = var1;
    }

    public void method13962(int var1) {
        this.field21541 += var1;
    }
}
