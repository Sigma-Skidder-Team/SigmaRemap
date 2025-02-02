// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.Class4036;
import mapped.Class5743;
import mapped.EventListener;
import mapped.Minecraft;

public class FastPlace extends Module
{
    public FastPlace() {
        super(Category.WORLD, "FastPlace", "Allows you to place blocks faster");
        this.addSetting(new BooleanSetting("Reduce Delay", "Makes block placement faster, but not too much!", true));
    }
    
    @EventListener
    private void method10040(final Class5743 class5743) {
        if (!this.isEnabled()) {
            return;
        }
        if (FastPlace.mc.player.getHeldItemMainhand() == null) {
            return;
        }
        if (FastPlace.mc.player.getHeldItemMainhand().getItem() instanceof Class4036) {
            if (!this.method9883("Reduce Delay")) {
                FastPlace.mc.field4692 = 0;
            }
            else {
                final Minecraft field15514 = FastPlace.mc;
                --field15514.field4692;
            }
        }
    }
}
