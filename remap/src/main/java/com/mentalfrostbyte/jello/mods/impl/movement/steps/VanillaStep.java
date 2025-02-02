// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.steps;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.Class5738;
import mapped.EventListener;

public class VanillaStep extends Module
{
    public VanillaStep() {
        super(Category.MOVEMENT, "Vanilla", "Step for Vanilla");
        this.addSetting(new NumberSetting("Maximum heigh", "Maximum heigh", 2.0f, Float.class, 1.0f, 10.0f, 0.5f));
    }
    
    @EventListener
    private void method10795(final Class5738 class5738) {
        if (this.isEnabled() && VanillaStep.mc.player != null) {
            if (!class5738.method17027()) {
                VanillaStep.mc.player.stepHeight = this.getNumberSettingValueByName("Maximum heigh");
            }
            else {
                VanillaStep.mc.player.stepHeight = 0.5f;
            }
        }
    }
}
