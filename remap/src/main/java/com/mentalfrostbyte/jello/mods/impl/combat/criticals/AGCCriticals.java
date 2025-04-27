// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.criticals;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.UpdateWalkingEvent;
import mapped.HigherPriority;
import mapped.EventListener;

public class AGCCriticals extends Module
{
    private int field15513;
    
    public AGCCriticals() {
        super(Category.COMBAT, "AGC", "Criticals for Anti Gaming Chair");
    }
    
    @Override
    public void onEnable() {
        this.field15513 = 0;
    }
    
    @EventListener
    @HigherPriority
    private void method9880(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled() && updateWalkingEvent.isPre()) {
            if (!AGCCriticals.mc.player.onGround) {
                this.field15513 = 0;
            }
            else {
                if (this.field15513 > 0) {
                    if (this.field15513 % 2 != 0) {
                        updateWalkingEvent.method17037(updateWalkingEvent.method17036() - 1.0E-14);
                    }
                    updateWalkingEvent.method17045(false);
                }
                ++this.field15513;
                updateWalkingEvent.method17033(true);
            }
            if (AGCCriticals.mc.playerController.method27337()) {
                if (AGCCriticals.mc.player.onGround) {
                    this.field15513 = 0;
                    updateWalkingEvent.method17037(AGCCriticals.mc.player.posY);
                    updateWalkingEvent.method17045(true);
                }
            }
        }
    }
}
