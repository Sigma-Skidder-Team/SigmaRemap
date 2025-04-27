// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;

import java.util.Random;

public class Derp extends Module
{
    private final Random field15869;
    private boolean field15870;
    private int field15871;
    private int field15872;
    
    public Derp() {
        super(Category.PLAYER, "Derp", "Spazzes around");
        this.field15869 = new Random();
        this.addSetting(new StringSetting("Rotation Mode", "Rotation Mode", 0, "Random", "Spin", "None"));
        this.addSetting(new BooleanSetting("Hit", "Randomly hit", true));
        this.addSetting(new BooleanSetting("Sneak", "Randomly sneak", true));
    }
    
    @EventListener
    public void method10456(final UpdateWalkingEventI updateWalkingEvent) {
        if (!this.isEnabled() || !updateWalkingEvent.isPre()) {
            return;
        }
        if (this.getBooleanValueFromSettingName("Sneak")) {
            if (this.field15870) {
                Derp.mc.method5269().method17292(new Class4336(Derp.mc.player, Class287.field1592));
            }
            else {
                Derp.mc.method5269().method17292(new Class4336(Derp.mc.player, Class287.field1591));
            }
        }
        this.field15870 = !this.field15870;
        ++this.field15871;
        if (this.getBooleanValueFromSettingName("Hit") && this.field15871 > this.field15869.nextInt(5) + 3) {
            this.field15871 = 0;
            Derp.mc.player.method2707(Class316.values()[this.field15869.nextInt(1)]);
        }
        final String method9887 = this.getStringSettingValueByName("Rotation Mode");
        switch (method9887) {
            case "Random": {
                updateWalkingEvent.method17043(this.field15869.nextFloat() * 360.0f);
                updateWalkingEvent.method17041(this.field15869.nextFloat() * 180.0f - 90.0f);
                break;
            }
            case "Spin": {
                this.field15872 += 20;
                while (this.field15872 > 360) {
                    this.field15872 -= 360;
                }
                updateWalkingEvent.method17043(this.field15872 + this.field15869.nextFloat());
                break;
            }
        }
    }
    
    @Override
    public void onEnable() {
        this.field15872 = (int) Derp.mc.player.rotationYaw;
    }
}
