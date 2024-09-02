package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.util.math.vector.Vector3d;
import mapped.Class9567;

public class Class4436 extends CancellableEvent {
    private static String[] field21586;
    public Vector3d field21587;
    public boolean field21588;

    public Class4436(Vector3d var1) {
        this.field21587 = var1;
    }

    public boolean method14000() {
        return this.field21588;
    }

    public Vector3d method14001() {
        return this.field21587;
    }

    public void method14002(double var1) {
        this.field21587.y = var1;
    }

    public void method14003(double var1) {
        float[] var5 = Class9567.method37082();
        float var6 = var5[1];
        float var7 = var5[2];
        float var8 = var5[0];
        if (var6 == 0.0F && var7 == 0.0F) {
            this.field21587.x = 0.0;
            this.field21587.z = 0.0;
        }

        double var9 = Math.cos(Math.toRadians(var8));
        double var11 = Math.sin(Math.toRadians(var8));
        double var13 = ((double) var6 * var9 + (double) var7 * var11) * var1;
        double var15 = ((double) var6 * var11 - (double) var7 * var9) * var1;
        this.field21587.x = var13;
        this.field21587.z = var15;
        this.field21588 = true;
    }

    public void method14004(Vector3d var1) {
        this.field21587 = var1;
        this.field21588 = true;
    }
}
