package com.mentalfrostbyte.jello.event.impl;

public class EventSlowDown extends CancellableEvent {
    public float slowDown;

    public EventSlowDown(float var1) {
        this.slowDown = var1;
    }

    public float getSlowDown() {
        return this.slowDown;
    }

    public void setSlowDown(float var1) {
        this.slowDown = var1;
    }
}
