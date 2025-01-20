package com.mentalfrostbyte.jello.module.impl.movement.phase;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventPushBlock;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;

public class FullBlockPhase extends Module {
    public FullBlockPhase() {
        super(ModuleCategory.MOVEMENT, "FullBlock", "Basic phase");
    }

    @EventTarget
    private void EventUpdate(EventUpdate event) {
        if (this.isEnabled() && MultiUtilities.method17761()) {
            event.method13908(true);
        }
    }

    @EventTarget
    private void EventMove(EventMove event) {
        if (this.isEnabled()) {
            if (!MultiUtilities.method17761()) {
                if (mc.player.collidedHorizontally) {
                    MovementUtil.setSpeed(event, 0.0);
                    MovementUtil.method37095(1.1920931E-8);
                }
            } else {
                MovementUtil.method37095(0.617);
            }
        }
    }

    @EventTarget
    private void EventPushBlock(EventPushBlock event) {
        if (this.isEnabled()) {
            event.setCancelled(true);
        }
    }
}
