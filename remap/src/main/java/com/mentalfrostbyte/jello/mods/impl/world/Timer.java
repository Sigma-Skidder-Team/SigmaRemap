// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.EventPlayerTickI;
import mapped.EventListener;

public class Timer extends Module
{
    public Timer() {
        super(Category.WORLD, "Timer", "Speeds up the world's timer");
        this.addSetting(new NumberSetting("Timer", "Timer value", 0.1f, Float.class, 0.1f, 10.0f, 0.1f));
    }
    
    @EventListener
    private void method10344(final EventPlayerTickI eventPlayerTick) {
        if (this.isEnabled()) {
            Timer.mc.timer.timerSpeed = this.getNumberSettingValueByName("Timer");
        }
    }
    
    @Override
    public void onDisable() {
        Timer.mc.timer.timerSpeed = 1.0f;
    }
}
