package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.Event;

public class EventRender implements Event {
    private int field21541 = 99;

    public int getYOffset() {
        return this.field21541;
    }

    public void method13961(int var1) {
        this.field21541 = var1;
    }

    public void addOffset(int var1) {
        this.field21541 += var1;
    }
}
