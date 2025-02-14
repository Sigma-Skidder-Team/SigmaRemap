package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.util.math.vector.Vector3d;

public class EventStep extends CancellableEvent {
    private final double field21582;
    private final Vector3d vector;

    public EventStep(double var1, Vector3d var3) {
        this.field21582 = var1;
        this.vector = var3;
    }

    public double getHeight() {
        return this.field21582;
    }

    public void setY(double var1) {
        this.setCancelled(true);
        this.vector.y = var1;
    }

    public double getY() {
        return this.vector.y;
    }

    public Vector3d getVector() {
        return this.vector;
    }
}
