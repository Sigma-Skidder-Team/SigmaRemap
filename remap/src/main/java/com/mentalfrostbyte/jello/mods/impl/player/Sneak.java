// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class287;
import mapped.Class4336;
import mapped.UpdateWalkingEvent;
import mapped.EventListener;

public class Sneak extends Module
{
    public Sneak() {
        super(Category.PLAYER, "Sneak", "Always sneaks");
    }
    
    @Override
    public void onDisable() {
        Sneak.mc.method5269().method17292(new Class4336(Sneak.mc.player, Class287.field1592));
    }
    
    @EventListener
    public void method10328(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled()) {
            if (!updateWalkingEvent.method17046()) {
                Sneak.mc.method5269().method17292(new Class4336(Sneak.mc.player, Class287.field1592));
                Sneak.mc.method5269().method17292(new Class4336(Sneak.mc.player, Class287.field1591));
            }
            else {
                Sneak.mc.method5269().method17292(new Class4336(Sneak.mc.player, Class287.field1591));
                Sneak.mc.method5269().method17292(new Class4336(Sneak.mc.player, Class287.field1592));
            }
        }
    }
}
