package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import mapped.MovementUtils;
import net.minecraft.util.math.vector.Vector3d;

public class JumpEvent extends CancellableEvent {
    public Vector3d vector;
    public boolean field21588;

    public JumpEvent(Vector3d var1) {
        this.vector = var1;
    }

    public boolean method14000() {
        return this.field21588;
    }

    public Vector3d getVector() {
        return this.vector;
    }

    public void method14002(double var1) {
        this.vector.y = var1;
    }

    public void method14003(double var1) {
        float[] var5 = MovementUtils.lenientStrafe();
        float var6 = var5[1];
        float var7 = var5[2];
        float var8 = var5[0];
        if (var6 == 0.0F && var7 == 0.0F) {
            this.vector.x = 0.0;
            this.vector.z = 0.0;
        }

        double var9 = Math.cos(Math.toRadians(var8));
        double var11 = Math.sin(Math.toRadians(var8));
        double var13 = ((double) var6 * var9 + (double) var7 * var11) * var1;
        double var15 = ((double) var6 * var11 - (double) var7 * var9) * var1;
        this.vector.x = var13;
        this.vector.z = var15;
        this.field21588 = true;
    }

    public void method14004(Vector3d var1) {
        this.vector = var1;
        this.field21588 = true;
    }
}
