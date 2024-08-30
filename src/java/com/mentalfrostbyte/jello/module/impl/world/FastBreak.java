package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class FastBreak extends Module {
    public FastBreak() {
        super(ModuleCategory.WORLD, "FastBreak", "Break blocks faster");
    }

    @EventTarget
    private void method16107(TickEvent var1) {
        if (this.isEnabled()) {
            if (mc.playerController.field31362 > 0.7F) {
                mc.playerController.field31362 = 1.0F;
            }

            mc.playerController.field31364 = 0;
        }
    }
}
