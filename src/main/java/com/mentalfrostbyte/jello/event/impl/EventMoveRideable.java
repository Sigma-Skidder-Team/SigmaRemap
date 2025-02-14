package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;

public class EventMoveRideable extends CancellableEvent {
    public double field21576;
    public double field21577;
    public double field21578;

    public EventMoveRideable(double var1, double var3, double var5) {
        this.field21576 = var1;
        this.field21577 = var3;
        this.field21578 = var5;
    }

    public double getX() {
        return this.field21576;
    }

    public void setX(double var1) {
        this.field21576 = var1;
    }

    public double getY() {
        return this.field21577;
    }

    public void setY(double var1) {
        this.field21577 = var1;
    }

    public double getZ() {
        return this.field21578;
    }

    public void setZ(double var1) {
        this.field21578 = var1;
    }
}
