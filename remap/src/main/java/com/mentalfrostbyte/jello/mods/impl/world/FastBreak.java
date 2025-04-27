// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.EventPlayerTick;
import mapped.EventListener;

public class FastBreak extends Module
{
    public FastBreak() {
        super(Category.WORLD, "FastBreak", "Break blocks faster");
    }
    
    @EventListener
    private void method10017(final EventPlayerTick eventPlayerTick) {
        if (this.isEnabled()) {
            if (FastBreak.mc.playerController.field33867 > 0.7f) {
                FastBreak.mc.playerController.field33867 = 1.0f;
            }
            FastBreak.mc.playerController.field33869 = 0;
        }
    }
}
