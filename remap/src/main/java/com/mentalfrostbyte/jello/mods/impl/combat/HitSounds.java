// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class4264;
import mapped.EventReceivePacket;
import mapped.LowerPriority;
import mapped.EventListener;

public class HitSounds extends Module
{
    public HitSounds() {
        super(Category.COMBAT, "HitSounds", "Changes the player hurting sounds client side.");
    }
    
    @EventListener
    @LowerPriority
    private void method10580(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            if (eventReceivePacket.getPacket() instanceof Class4264) {
                final Class4264 class5724 = (Class4264) eventReceivePacket.getPacket();
                if (class5724.method12799(HitSounds.mc.world) != null) {
                    if (class5724.method12799(HitSounds.mc.world).isAlive()) {
                        if (class5724.method12799(HitSounds.mc.world).method1732(HitSounds.mc.player) <= 5.0f) {
                            if (class5724.method12799(HitSounds.mc.world) != HitSounds.mc.player) {
                            }
                        }
                    }
                }
            }
        }
    }
}
