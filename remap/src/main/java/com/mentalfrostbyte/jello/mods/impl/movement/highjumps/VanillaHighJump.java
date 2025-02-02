// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.highjumps;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.Class5722;
import mapped.EventListener;

public class VanillaHighJump extends Module
{
    public VanillaHighJump() {
        super(Category.MOVEMENT, "Vanilla", "Highjump for minecraft vanilla");
        this.addSetting(new NumberSetting("Motion", "Highjump motion", 0.75f, Float.class, 0.42f, 5.0f, 0.05f));
    }
    
    @EventListener
    public void method10482(final Class5722 class5722) {
        if (this.isEnabled()) {
            class5722.method16995(this.getNumberSettingValueByName("Motion"));
        }
    }
}
