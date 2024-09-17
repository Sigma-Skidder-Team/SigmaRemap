package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.util.math.vector.Vector3d;

public class EventMove extends CancellableEvent {
    public Vector3d vector;

    public EventMove(Vector3d vector3D) {
        this.vector = vector3D;
    }

    public double getX() {
        return this.vector.x;
    }

    public void setX(double x) {
        this.vector.x = x;
    }

    public double getY() {
        return this.vector.y;
    }

    public void setY(double y) {
        this.vector.y = y;
    }

    public double getZ() {
        return this.vector.z;
    }

    public void setZ(double z) {
        this.vector.z = z;
    }

    public Vector3d getVector() {
        return this.vector;
    }

    public void setVector(Vector3d vector3D) {
        this.vector = vector3D;
    }
}
