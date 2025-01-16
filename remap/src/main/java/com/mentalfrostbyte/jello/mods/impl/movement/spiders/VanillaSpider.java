// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.spiders;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.Class5717;
import mapped.EventListener;

public class VanillaSpider extends Module
{
    public VanillaSpider() {
        super(Category.MOVEMENT, "Vanilla", "Spider for Vanilla");
        this.addSetting(new NumberSetting("Motion", "Spider motion", 0.35f, Float.class, 0.2f, 1.0f, 0.05f));
    }
    
    @EventListener
    private void method10468(final Class5717 class5717) {
        if (this.method9906()) {
            if (VanillaSpider.mc.player.collidedHorizontally) {
                class5717.method16975(this.getNumberSettingValueByName("Motion"));
            }
        }
    }
}
