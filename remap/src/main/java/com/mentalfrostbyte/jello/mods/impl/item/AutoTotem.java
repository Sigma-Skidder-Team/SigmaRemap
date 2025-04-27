// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.item;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class AutoTotem extends Module
{
    public int field15889;
    
    public AutoTotem() {
        super(Category.ITEM, "AutoTotem", "Automatically equips a totem in your second hand");
        this.field15889 = -1;
    }
    
    @EventListener
    private void method10473(final EventPlayerTick eventPlayerTick) {
        this.method10475();
    }
    
    @EventListener
    private void method10474(final UpdateWalkingEvent updateWalkingEvent) {
        if (!updateWalkingEvent.isPre()) {
            this.method10475();
        }
    }
    
    private void method10475() {
        if (this.isEnabled()) {
            if (AutoTotem.mc.player != null) {
                if (!AutoTotem.mc.player.field3025.field27304) {
                    if (AutoTotem.mc.player.method2718(Class2215.field13601).getItem() == Items.field31590) {
                        return;
                    }
                    final int method29319 = InvManagerUtil.method29319(Items.field31590);
                    if (method29319 != -1) {
                        AutoTotem.mc.playerController.method27324(0, (method29319 >= 9) ? method29319 : (method29319 + 36), 0, Class2133.field12437, AutoTotem.mc.player);
                        AutoTotem.mc.playerController.method27324(0, 45, 0, Class2133.field12437, AutoTotem.mc.player);
                        AutoTotem.mc.playerController.method27324(0, (method29319 >= 9) ? method29319 : (method29319 + 36), 0, Class2133.field12437, AutoTotem.mc.player);
                    }
                }
            }
        }
    }
}
