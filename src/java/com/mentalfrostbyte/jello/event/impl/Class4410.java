package com.mentalfrostbyte.jello.event.impl;

import mapped.Class2035;
import mapped.Class880;

public class Class4410 extends Class4406 {
    private static String[] field21526;
    private float field21527;
    private float field21528;
    private float field21529;
    private float field21530;
    private final float field21531;
    private final Class880 field21532;
    private boolean field21533 = true;
    private boolean field21534 = true;
    private Class2035 field21535;

    public Class4410(float var1, float var2, float var3, float var4, float var5, Class880 var6) {
        this.field21527 = var1;
        this.field21528 = var2;
        this.field21529 = var3;
        this.field21530 = var4;
        this.field21531 = var5;
        this.field21532 = var6;
        this.field21535 = Class2035.field13212;
    }

    public void method13942(Class2035 var1) {
        this.field21535 = var1;
    }

    public Class2035 method13943() {
        return this.field21535;
    }

    public float method13944() {
        return this.field21527;
    }

    public float method13945() {
        return this.field21528;
    }

    public float method13946() {
        return this.field21529;
    }

    public float method13947() {
        return this.field21530;
    }

    public float method13948() {
        return this.field21531;
    }

    public void method13949(float var1) {
        this.field21527 = var1;
    }

    public void method13950(float var1) {
        this.field21528 = var1;
    }

    public void method13951(float var1) {
        this.field21529 = var1;
    }

    public void method13952(float var1) {
        this.field21530 = var1;
    }

    public Class880 method13953() {
        return this.field21532;
    }

    public boolean method13954() {
        return this.field21533;
    }

    public void method13955(boolean var1) {
        this.field21534 = var1;
    }

    public boolean method13956() {
        return this.field21534;
    }

    public void method13957(boolean var1) {
        this.field21533 = var1;
    }
}
