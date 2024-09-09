package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.util.math.vector.Vector3d;

public class EventMove extends CancellableEvent {
    private static String[] field21584;
    public Vector3d vector;

    public EventMove(Vector3d var1) {
        this.vector = var1;
    }

    public double getX() {
        return this.vector.x;
    }

    public void setX(double var1) {
        this.vector.x = var1;
    }

    public double getY() {
        return this.vector.y;
    }

    public void setY(double var1) {
        this.vector.y = var1;
    }

    public double getZ() {
        return this.vector.z;
    }

    public void setZ(double var1) {
        this.vector.z = var1;
    }

    public Vector3d getVector() {
        return this.vector;
    }

    public void setVector(Vector3d var1) {
        this.vector = var1;
    }
}
