package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.MovementUtils;

public class Strafe extends Module {
    public double field23936;
    private double field23932;
    private float field23933;
    private float field23934;
    private boolean field23935;

    public Strafe() {
        super(ModuleCategory.MOVEMENT, "Strafe", "Strafe in mid air");
    }

    @EventTarget
    public void method16817(EventMove var1) {
        if (this.isEnabled()) {
            this.field23932 = MovementUtils.getSpeed();
            float var4 = MovementUtils.lenientStrafe()[1];
            float var5 = MovementUtils.lenientStrafe()[2];
            float var6 = MovementUtils.method37086();
            double var7 = Math.cos(Math.toRadians(var6));
            double var9 = Math.sin(Math.toRadians(var6));
            double var11 = Math.sqrt(var1.getX() * var1.getX() + var1.getZ() * var1.getZ());
            if (!MovementUtils.isMoving()) {
                var11 = 0.0;
            }

            float var13 = 0.2F;
            if (!(var11 > this.field23936 + 0.1F)) {
                this.field23936 = var11;
                if (var11 != 0.0) {
                    var11 = Math.max(var11, MovementUtils.getSpeed());
                }

                var1.setX(var1.getX() * (double) (1.0F - var13) + var11 * var7 * (double) var13);
                var1.setZ(var1.getZ() * (double) (1.0F - var13) + var11 * var9 * (double) var13);
                if (MovementUtils.isMoving()) {
                }
            } else {
                this.field23936 = var11;
            }
        }
    }
}
