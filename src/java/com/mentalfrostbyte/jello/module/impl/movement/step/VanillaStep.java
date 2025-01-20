package com.mentalfrostbyte.jello.module.impl.movement.step;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SafeWalkEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;

public class VanillaStep extends Module {
    public VanillaStep() {
        super(ModuleCategory.MOVEMENT, "Vanilla", "Step for Vanilla");
        this.registerSetting(new NumberSetting<Float>("Maximum heigh", "Maximum heigh", 2.0F, Float.class, 1.0F, 10.0F, 0.5F));
    }

    @EventTarget
    private void method16337(SafeWalkEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (!var1.isOnEdge()) {
                mc.player.stepHeight = this.getNumberValueBySettingName("Maximum heigh");
            } else {
                mc.player.stepHeight = 0.5F;
            }
        }
    }
}
