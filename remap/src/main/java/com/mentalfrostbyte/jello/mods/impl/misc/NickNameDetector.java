// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5743;
import mapped.ColorUtils;
import mapped.EventListener;
import net.minecraft.entity.Entity;

public class NickNameDetector extends Module
{
    public NickNameDetector() {
        super(Category.MISC, "NickNameDetector", "Detect if a player has a custom name");
    }
    
    @EventListener
    private void method10838(final Class5743 class5743) {
        if (this.isEnabled()) {
            for (final Entity class5744 : ColorUtils.method19108()) {
                if (Client.getInstance().getBotManager().method31751(class5744)) {
                    continue;
                }
                if (class5744.ticksExisted <= 30) {
                    continue;
                }
                if (!class5744.hasCustomName()) {
                    continue;
                }
                ColorUtils.method19106(class5744.getName().getUnformattedComponentText() + " might have a custom nametag");
            }
        }
    }
}
