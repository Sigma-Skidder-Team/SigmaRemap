package com.mentalfrostbyte.jello.module.impl.movement.phase;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4425;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.ColorUtils;
import mapped.Class9567;

public class FullBlockPhase extends Module {
    public FullBlockPhase() {
        super(ModuleCategory.MOVEMENT, "FullBlock", "Basic phase");
    }

    @EventTarget
    private void method16491(Class4399 var1) {
        if (this.isEnabled() && ColorUtils.method17761()) {
            var1.method13908(true);
        }
    }

    @EventTarget
    private void method16492(Class4435 var1) {
        if (this.isEnabled()) {
            if (!ColorUtils.method17761()) {
                if (mc.player.collidedHorizontally) {
                    Class9567.method37088(var1, 0.0);
                    Class9567.method37095(1.1920931E-8);
                }
            } else {
                Class9567.method37095(0.617);
            }
        }
    }

    @EventTarget
    private void method16493(Class4425 var1) {
        if (this.isEnabled()) {
            var1.method13900(true);
        }
    }
}
