// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5743;
import mapped.EventListener;

public class AutoRespawn extends Module
{
    public int field15563;
    
    public AutoRespawn() {
        super(Category.PLAYER, "AutoRespawn", "Respawns for you");
        this.field15563 = 30;
    }
    
    @EventListener
    public void method9974(final Class5743 class5743) {
        if (this.method9906()) {
            if (!AutoRespawn.mc.player.method1768()) {
                AutoRespawn.mc.player.method2842();
            }
        }
    }
}
