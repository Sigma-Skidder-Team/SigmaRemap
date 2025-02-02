// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.wtaps;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class Normal extends Module
{
    public Normal() {
        super(Category.COMBAT, "Normal", "Increase the knockback you give to players");
    }
    
    @EventListener
    @Class6757
    private void method10369(final Class5750 class5750) {
        if (this.isEnabled() && class5750.method17059()) {
            Normal.mc.method5269().method17292(new Class4336(Normal.mc.player, Class287.field1594));
        }
    }
}
