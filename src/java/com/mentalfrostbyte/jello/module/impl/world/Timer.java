package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.NumberSetting;

public class Timer extends Module {
    public Timer() {
        super(ModuleCategory.WORLD, "Timer", "Speeds up the world's timer");
        this.registerSetting(new NumberSetting<Float>("Timer", "Timer value", 0.1F, Float.class, 0.1F, 10.0F, 0.1F));
    }

    @EventTarget
    private void onTick(TickEvent event) {
        if (this.isEnabled()) {
            mc.timer.timerSpeed = this.getNumberValueBySettingName("Timer");
        }
    }

    @Override
    public void onDisable() {
        mc.timer.timerSpeed = 1.0F;
    }
}
