package com.mentalfrostbyte.jello.module.impl.movement.phase;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventPushBlock;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.MovementUtils;

public class FullBlockPhase extends Module {
    public FullBlockPhase() {
        super(ModuleCategory.MOVEMENT, "FullBlock", "Basic phase");
    }

    @EventTarget
    private void method16491(EventUpdate var1) {
        if (this.isEnabled() && MultiUtilities.method17761()) {
            var1.method13908(true);
        }
    }

    @EventTarget
    private void method16492(EventMove var1) {
        if (this.isEnabled()) {
            if (!MultiUtilities.method17761()) {
                if (mc.player.collidedHorizontally) {
                    MovementUtils.setSpeed(var1, 0.0);
                    MovementUtils.method37095(1.1920931E-8);
                }
            } else {
                MovementUtils.method37095(0.617);
            }
        }
    }

    @EventTarget
    private void method16493(EventPushBlock var1) {
        if (this.isEnabled()) {
            var1.setCancelled(true);
        }
    }
}
