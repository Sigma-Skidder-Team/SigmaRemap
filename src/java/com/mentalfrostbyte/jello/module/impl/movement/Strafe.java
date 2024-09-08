package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.Class9567;

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
    public void method16817(Class4435 var1) {
        if (this.isEnabled()) {
            this.field23932 = Class9567.method37075();
            float var4 = Class9567.method37082()[1];
            float var5 = Class9567.method37082()[2];
            float var6 = Class9567.method37086();
            double var7 = Math.cos(Math.toRadians(var6));
            double var9 = Math.sin(Math.toRadians(var6));
            double var11 = Math.sqrt(var1.method13992() * var1.method13992() + var1.method13996() * var1.method13996());
            if (!Class9567.isMoving()) {
                var11 = 0.0;
            }

            float var13 = 0.2F;
            if (!(var11 > this.field23936 + 0.1F)) {
                this.field23936 = var11;
                if (var11 != 0.0) {
                    var11 = Math.max(var11, Class9567.method37075());
                }

                var1.method13993(var1.method13992() * (double) (1.0F - var13) + var11 * var7 * (double) var13);
                var1.method13997(var1.method13996() * (double) (1.0F - var13) + var11 * var9 * (double) var13);
                if (Class9567.isMoving()) {
                }
            } else {
                this.field23936 = var11;
            }
        }
    }
}
