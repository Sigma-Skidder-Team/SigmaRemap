// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5738;
import mapped.EventListener;

public class SafeWalk extends Module
{
    public SafeWalk() {
        super(Category.MOVEMENT, "SafeWalk", "Doesn't let you run off edges");
    }
    
    @EventListener
    public void method10801(final Class5738 class5738) {
        if (!this.isEnabled() || !SafeWalk.mc.player.onGround) {
            return;
        }
        if (!Client.getInstance().method35189().getModuleByClass(BlockFly.class).isEnabled()) {
            class5738.method17026(true);
        }
    }
}
