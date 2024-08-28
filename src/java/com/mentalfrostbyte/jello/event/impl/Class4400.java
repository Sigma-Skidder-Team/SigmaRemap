package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import mapped.Class2205;
import mapped.Class8848;
import mapped.Class9332;

public class Class4400 extends CancellableEvent {
    private static String[] field21503;
    private final boolean field21504;
    private boolean field21505;
    private final float field21506;
    private final float field21507;
    private final Class2205 field21508;
    private final Class8848 field21509;
    private final Class9332 field21510;

    public Class4400(boolean var1, float var2, float var3, Class2205 var4, Class8848 var5, Class9332 var6) {
        this.field21504 = var1;
        this.field21506 = var2;
        this.field21507 = var3;
        this.field21508 = var4;
        this.field21509 = var5;
        this.field21510 = var6;
        this.field21505 = true;
    }

    public float method13924() {
        return this.field21506;
    }

    public float method13925() {
        return this.field21507;
    }

    public boolean method13926() {
        return this.field21504;
    }

    public Class2205 method13927() {
        return this.field21508;
    }

    public Class8848 method13928() {
        return this.field21509;
    }

    public Class9332 method13929() {
        return this.field21510;
    }

    public boolean method13930() {
        return this.field21505;
    }

    public void method13931(boolean var1) {
        this.field21505 = var1;
    }
}
