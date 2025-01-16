// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.entity.Entity;

public class InteractRange extends Module
{
    public InteractRange() {
        super(Category.COMBAT, "InteractRange", "Allows you to interact farer away");
        this.addSetting(new NumberSetting("Range", "Range value", 4.0f, Float.class, 3.0f, 8.0f, 0.01f));
    }
    
    @EventListener
    private void method10085(final Class5748 class5748) {
        if (this.method9906()) {
            final Entity method19141 = Class6430.method19141(InteractRange.mc.player.rotationYaw, InteractRange.mc.player.rotationPitch, this.getNumberSettingValueByName("Range"), 0.0);
            final BlockRayTraceResult method19142 = Class4609.method13697(InteractRange.mc.player.rotationYaw, InteractRange.mc.player.rotationPitch, this.getNumberSettingValueByName("Range"));
            if (method19141 != null) {
                if (InteractRange.mc.field4691.getType() == RayTraceResult.Type.MISS) {
                    InteractRange.mc.field4691 = new Class7007(method19141);
                }
            }
            if (method19141 == null) {
                if (InteractRange.mc.field4691.getType() == RayTraceResult.Type.MISS) {
                    if (method19142 != null) {
                        InteractRange.mc.field4691 = method19142;
                    }
                }
            }
        }
    }
}
