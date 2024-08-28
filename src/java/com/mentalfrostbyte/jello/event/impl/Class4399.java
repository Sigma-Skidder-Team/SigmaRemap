package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;

import java.util.ArrayList;
import java.util.List;

public class Class4399 extends CancellableEvent {
    public static float field21496;
    public static float field21497;
    public static float field21498;
    public static float field21499;
    public static float field21500;
    private static String[] field21488;
    public boolean field21502;
    private double field21489;
    private double field21490;
    private double field21491;
    private float field21492;
    private float field21493;
    private boolean field21494;
    private boolean field21495;
    private final List<Runnable> field21501 = new ArrayList<Runnable>();

    public Class4399(double var1, double var3, double var5, float var7, float var8, boolean var9) {
        this.field21489 = var1;
        this.field21490 = var3;
        this.field21491 = var5;
        this.field21492 = var7;
        this.field21493 = var8;
        this.field21494 = var9;
        this.field21502 = true;
        this.field21495 = false;
    }

    public void method13906() {
        field21498 = field21496;
        field21499 = field21497;
        field21496 = this.field21493;
        field21497 = this.field21492;
        this.field21502 = false;
    }

    public boolean method13907() {
        return this.field21495;
    }

    public void method13908(boolean var1) {
        this.field21495 = var1;
    }

    public double method13909() {
        return this.field21489;
    }

    public void method13910(double var1) {
        this.field21489 = var1;
    }

    public double method13911() {
        return this.field21490;
    }

    public void method13912(double var1) {
        this.field21490 = var1;
    }

    public double method13913() {
        return this.field21491;
    }

    public void method13914(double var1) {
        this.field21491 = var1;
    }

    public float method13915() {
        return this.field21492;
    }

    public void method13916(float var1) {
        this.field21492 = var1;
    }

    public float method13917() {
        return this.field21493;
    }

    public void method13918(float var1) {
        this.field21493 = var1;
    }

    public boolean method13919() {
        return this.field21494;
    }

    public void method13920(boolean var1) {
        this.field21494 = var1;
    }

    public boolean method13921() {
        return this.field21502;
    }

    public void method13922(Runnable var1) {
        this.field21501.add(var1);
    }

    public List<Runnable> method13923() {
        return this.field21501;
    }
}
