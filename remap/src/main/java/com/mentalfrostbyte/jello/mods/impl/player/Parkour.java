// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5747;
import mapped.AllUtils;
import mapped.EventListener;

public class Parkour extends Module
{
    public Parkour() {
        super(Category.PLAYER, "Parkour", "Automatically jumps at the edge of blocks");
    }
    
    @EventListener
    public void method10160(final Class5747 class5747) {
        if (!this.isEnabled()) {
            return;
        }
        if (!Parkour.mc.player.onGround) {
            return;
        }
        if (!AllUtils.method19159()) {
            Parkour.mc.player.method2725();
        }
    }
}
