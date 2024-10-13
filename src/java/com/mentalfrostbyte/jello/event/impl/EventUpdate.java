package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;

import java.util.ArrayList;
import java.util.List;

public class EventUpdate extends CancellableEvent {
    public static float prevPitch;
    public static float prevYaw;
    public static float field21498;
    public static float field21499;
    public boolean pre;
    private double x;
    private double y;
    private double z;
    private float pitch;
    private float yaw;
    private boolean ground;
    private boolean field21495;
    private final List<Runnable> runnables = new ArrayList<>();

    public EventUpdate(double var1, double var3, double var5, float var7, float var8, boolean var9) {
        this.x = var1;
        this.y = var3;
        this.z = var5;
        this.pitch = var7;
        this.yaw = var8;
        this.ground = var9;
        this.pre = true;
        this.field21495 = false;
    }

    public void postUpdate() {
        field21498 = prevPitch;
        field21499 = prevYaw;
        prevPitch = this.yaw;
        prevYaw = this.pitch;
        this.pre = false;
    }

    public boolean isMoving() {
        return this.field21495;
    }

    public void method13908(boolean var1) {
        this.field21495 = var1;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double var1) {
        this.x = var1;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double var1) {
        this.y = var1;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double var1) {
        this.z = var1;
    }

    public float getPitch() {
        return this.pitch;
    }

    public void setPitch(float var1) {
        this.pitch = var1;
    }

    public float getYaw() {
        return this.yaw;
    }

    public void setYaw(float var1) {
        this.yaw = var1;
    }

    public boolean onGround() {
        return this.ground;
    }

    public void setGround(boolean var1) {
        this.ground = var1;
    }

    public boolean isPre() {
        return this.pre;
    }

    public void attackPost(Runnable runnable) {
        this.runnables.add(runnable);
    }

    public List<Runnable> getRunnableList() {
        return this.runnables;
    }
}
