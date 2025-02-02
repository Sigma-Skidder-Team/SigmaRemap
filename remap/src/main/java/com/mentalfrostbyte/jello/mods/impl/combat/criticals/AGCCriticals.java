// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.criticals;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5744;
import mapped.Class6757;
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
    @Class6757
    private void method9880(final Class5744 class5744) {
        if (this.isEnabled() && class5744.method17046()) {
            if (!AGCCriticals.mc.player.onGround) {
                this.field15513 = 0;
            }
            else {
                if (this.field15513 > 0) {
                    if (this.field15513 % 2 != 0) {
                        class5744.method17037(class5744.method17036() - 1.0E-14);
                    }
                    class5744.method17045(false);
                }
                ++this.field15513;
                class5744.method17033(true);
            }
            if (AGCCriticals.mc.playerController.method27337()) {
                if (AGCCriticals.mc.player.onGround) {
                    this.field15513 = 0;
                    class5744.method17037(AGCCriticals.mc.player.posY);
                    class5744.method17045(true);
                }
            }
        }
    }
}
