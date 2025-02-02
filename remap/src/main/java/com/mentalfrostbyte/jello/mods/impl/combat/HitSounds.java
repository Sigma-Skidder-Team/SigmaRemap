// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class4264;
import mapped.Class5723;
import mapped.Class6759;
import mapped.EventListener;

public class HitSounds extends Module
{
    public HitSounds() {
        super(Category.COMBAT, "HitSounds", "Changes the player hurting sounds client side.");
    }
    
    @EventListener
    @Class6759
    private void method10580(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (class5723.method16998() instanceof Class4264) {
                final Class4264 class5724 = (Class4264)class5723.method16998();
                if (class5724.method12799(HitSounds.mc.world) != null) {
                    if (class5724.method12799(HitSounds.mc.world).method1768()) {
                        if (class5724.method12799(HitSounds.mc.world).method1732(HitSounds.mc.player) <= 5.0f) {
                            if (class5724.method12799(HitSounds.mc.world) != HitSounds.mc.player) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
