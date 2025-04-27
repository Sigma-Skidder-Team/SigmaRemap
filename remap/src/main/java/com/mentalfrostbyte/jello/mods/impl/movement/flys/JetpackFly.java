// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.EventPlayerTick;
import mapped.EventListener;

public class JetpackFly extends Module
{
    public JetpackFly() {
        super(Category.MOVEMENT, "Jetpack", "A jetpack type fly");
    }
    
    @EventListener
    public void method10550(final EventPlayerTick eventPlayerTick) {
        if (this.isEnabled()) {
            if (JetpackFly.mc.player.field2967) {
                JetpackFly.mc.player.method2725();
            }
        }
    }
}
