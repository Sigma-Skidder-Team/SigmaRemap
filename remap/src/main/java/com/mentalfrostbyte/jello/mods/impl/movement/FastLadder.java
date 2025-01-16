// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.Class5717;
import mapped.Class7906;
import mapped.Class9367;
import mapped.EventListener;

public class FastLadder extends Module
{
    public FastLadder() {
        super(Category.MOVEMENT, "FastLadder", "Allows you to climp ladders faster");
        this.addSetting(new NumberSetting("Motion", "Climbing motion", 0.35f, Float.class, 0.2f, 1.0f, 0.05f));
        this.addSetting(new StringSetting("Down mode", "The way you will go down on ladders", 0, new String[] { "None", "OnSneak", "Always" }));
    }
    
    @EventListener
    private void method10233(final Class5717 class5717) {
        if (this.method9906() && FastLadder.mc.player.method2688()) {
            final boolean b = Class9367.method34762() >= Class7906.field32453.method25613() || FastLadder.mc.method5282() == null;
            if (!FastLadder.mc.player.collidedHorizontally && (!FastLadder.mc.player.field2967 || !b)) {
                if ((this.method9887("Down mode").equals("OnSneak") && FastLadder.mc.gameSettings.field23440.method1056()) || this.method9887("Down mode").equals("Always")) {
                    class5717.method16975(-this.getNumberSettingValueByName("Motion"));
                }
            }
            else {
                class5717.method16975(this.getNumberSettingValueByName("Motion"));
            }
        }
    }
}
