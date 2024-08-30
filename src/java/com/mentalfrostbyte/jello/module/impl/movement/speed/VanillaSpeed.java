package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.Class9567;
import mapped.NumberSetting;

public class VanillaSpeed extends Module {
    public VanillaSpeed() {
        super(ModuleCategory.MOVEMENT, "Vanilla", "Vanilla speed");
        this.registerSetting(new NumberSetting<Float>("Speed", "Speed value", 4.0F, Float.class, 1.0F, 10.0F, 0.1F));
    }

    @EventTarget
    public void method16056(Class4435 var1) {
        if (this.isEnabled()) {
            double var4 = Class9567.method37075() * (double) this.getNumberValueBySettingName("Speed");
            Class9567.method37088(var1, var4);
        }
    }
}
