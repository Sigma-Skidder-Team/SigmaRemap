// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.aimbots;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.combat.Aimbot;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.Custom3DRenderEvent;
import mapped.Class8845;
import mapped.EventListener;
import net.minecraft.entity.Entity;

public class BasicAimbot extends Module
{
    public BasicAimbot() {
        super(Category.COMBAT, "Basic", "Automatically aims at players");
        this.addSetting(new NumberSetting("Range", "Range value", 4.0f, Float.class, 2.8f, 8.0f, 0.01f));
    }
    
    @EventListener
    private void method9918(final Custom3DRenderEvent custom3DRenderEvent) {
        if (this.isEnabled()) {
            final Entity method10266 = ((Aimbot)this.method9914()).method10266(this.getNumberSettingValueByName("Range"));
            if (method10266 != null) {
                final float[] method10267 = Class8845.method30912(method10266);
                BasicAimbot.mc.player.rotationYaw = method10267[0];
                BasicAimbot.mc.player.rotationPitch = method10267[1];
            }
        }
    }
}
