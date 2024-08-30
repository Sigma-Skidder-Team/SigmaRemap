package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.Class9567;

public class MinemenSpeed extends Module {
    public MinemenSpeed() {
        super(ModuleCategory.MOVEMENT, "Minemen", "Speed for AGC");
    }

    @EventTarget
    @HigherPriority
    public void method16683(Class4435 var1) {
        if (mc.player.onGround) {
            double var4 = 0.3399 + (double) Class9567.method37078() * 0.06;
            if (mc.player.ticksExisted % 3 == 0) {
                var4 = 0.679 + (double) Class9567.method37078() * 0.12;
            }

            Class9567.method37088(var1, var4);
        }
    }
}
