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
    private void method10473(final Class5743 class5743) {
        this.method10475();
    }
    
    @EventListener
    private void method10474(final Class5744 class5744) {
        if (!class5744.method17046()) {
            this.method10475();
        }
    }
    
    private void method10475() {
        if (this.method9906()) {
            if (AutoTotem.mc.player != null) {
                if (!AutoTotem.mc.player.field3025.field27304) {
                    if (AutoTotem.mc.player.method2718(Class2215.field13601).getItem() == Items.field31590) {
                        return;
                    }
                    final int method29319 = Class8639.method29319(Items.field31590);
                    if (method29319 != -1) {
                        AutoTotem.mc.field4682.method27324(0, (method29319 >= 9) ? method29319 : (method29319 + 36), 0, Class2133.field12437, AutoTotem.mc.player);
                        AutoTotem.mc.field4682.method27324(0, 45, 0, Class2133.field12437, AutoTotem.mc.player);
                        AutoTotem.mc.field4682.method27324(0, (method29319 >= 9) ? method29319 : (method29319 + 36), 0, Class2133.field12437, AutoTotem.mc.player);
                    }
                }
            }
        }
    }
}
