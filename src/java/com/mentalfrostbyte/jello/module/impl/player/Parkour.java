package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventWalkingUpdate;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.ColorUtils;

public class Parkour extends Module {
    public Parkour() {
        super(ModuleCategory.PLAYER, "Parkour", "Automatically jumps at the edge of blocks");
    }

    @EventTarget
    public void method16656(EventWalkingUpdate var1) {
        if (this.isEnabled()) {
            if (mc.player.onGround) {
                if (!ColorUtils.method17729()) {
                    mc.player.jump();
                }
            }
        }
    }
}
