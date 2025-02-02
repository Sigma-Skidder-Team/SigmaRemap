// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.criticals;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.combat.KillAura;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.Class4354;
import mapped.Class5722;
import mapped.Class5745;
import mapped.EventListener;

public class MinisCriticals extends Module
{
    public MinisCriticals() {
        super(Category.COMBAT, "Minis", "Minis criticals");
        this.addSetting(new BooleanSetting("Hypixel", "Hypixel bypass", false));
        this.addSetting(new BooleanSetting("Avoid Fall Damage", "Avoid fall damages", false));
    }
    
    @EventListener
    private void method10525(final Class5722 class5722) {
        if (this.isEnabled()) {
            if (KillAura.field16049) {
                MinisCriticals.mc.method5269().method17292(new Class4354(MinisCriticals.mc.player.posX, MinisCriticals.mc.player.posY, MinisCriticals.mc.player.posZ, true));
            }
        }
    }
    
    @EventListener
    private void method10526(final Class5745 class5745) {
        if (this.isEnabled()) {
            if (KillAura.field16049) {
                class5745.setCancelled(true);
            }
        }
    }
}
