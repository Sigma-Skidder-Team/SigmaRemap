// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.criticals;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.Speed;
import mapped.*;

public class AAC4Criticals extends Module
{
    private static int field15534;
    
    public AAC4Criticals() {
        super(Category.COMBAT, "AAC 4", "Criticals for aac 4.*");
    }
    
    @Override
    public void onEnable() {
        AAC4Criticals.field15534 = 0;
    }
    
    @EventListener
    @LowerPriority
    private void method9939(final Class5745 class5745) {
        if (this.isEnabled() && class5745.method17049() >= 0.625) {
            AAC4Criticals.field15534 = 0;
        }
    }
    
    @EventListener
    private void method9940(final Class5722 class5722) {
        if (AAC4Criticals.field15534 == 2) {
            class5722.setCancelled(true);
        }
    }
    
    @EventListener
    @HigherPriority
    private void method9941(final UpdateWalkingEventI updateWalkingEvent) {
        if (!this.isEnabled() || Client.getInstance().moduleManager().getModuleByClass(Speed.class).isEnabled()) {
            AAC4Criticals.field15534 = 0;
            return;
        }
        if (updateWalkingEvent.isPre()) {
            if (AAC4Criticals.mc.playerController.method27337()) {
                AAC4Criticals.field15534 = 0;
            }
            if (AAC4Criticals.mc.player.onGround && AAC4Criticals.mc.player.collidedVertically) {
                ++AAC4Criticals.field15534;
                AAC4Criticals.mc.player.field4075 = 0.0;
                if (AAC4Criticals.field15534 != 2) {
                    if (AAC4Criticals.field15534 >= 3) {
                        updateWalkingEvent.method17037(updateWalkingEvent.method17036() + 0.001);
                        updateWalkingEvent.method17045(false);
                    }
                }
                else {
                    updateWalkingEvent.method17037(updateWalkingEvent.method17036() + 0.00101);
                    updateWalkingEvent.method17045(false);
                }
            }
            else {
                AAC4Criticals.field15534 = 0;
            }
        }
    }
    
    public static boolean method9942() {
        return AAC4Criticals.field15534 == 2;
    }
}
