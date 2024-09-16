package com.mentalfrostbyte.jello.module.impl.movement.highjump;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.JumpEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.NumberSetting;

public class VanillaHighJump extends Module {
    public VanillaHighJump() {
        super(ModuleCategory.MOVEMENT, "Vanilla", "Highjump for minecraft vanilla");
        this.registerSetting(new NumberSetting<Float>("Motion", "Highjump motion", 0.75F, Float.class, 0.42F, 5.0F, 0.05F));
    }

    @EventTarget
    public void method16273(JumpEvent var1) {
        if (this.isEnabled()) {
            var1.method14002(this.getNumberValueBySettingName("Motion"));
        }
    }
}
