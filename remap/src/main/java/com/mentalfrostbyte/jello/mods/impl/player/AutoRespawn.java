// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.EventPlayerTickI;
import mapped.EventListener;

public class AutoRespawn extends Module
{
    public int field15563;
    
    public AutoRespawn() {
        super(Category.PLAYER, "AutoRespawn", "Respawns for you");
        this.field15563 = 30;
    }
    
    @EventListener
    public void method9974(final EventPlayerTickI eventPlayerTick) {
        if (this.isEnabled()) {
            if (!AutoRespawn.mc.player.isAlive()) {
                AutoRespawn.mc.player.method2842();
            }
        }
    }
}
