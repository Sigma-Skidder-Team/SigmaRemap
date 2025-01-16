// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.antiknockbacks;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

public class SpartanAntiKnockBack extends Module
{
    private int field15900;
    
    public SpartanAntiKnockBack() {
        super(Category.COMBAT, "Spartan", "Places block underneath");
        this.addSetting(new NumberSetting("Ticks", "Vertical velocity multiplier", 1.0f, Float.class, 1.0f, 6.0f, 1.0f));
    }
    
    @EventListener
    private void method10495(final Class5743 class5743) {
        if (this.method9906()) {
            if (this.field15900 < 10) {
                ++this.field15900;
                if (this.field15900 == (int)this.getNumberSettingValueByName("Ticks")) {
                    Class7482.method23151(0.0);
                }
            }
        }
    }
    
    @EventListener
    private void method10496(final Class5723 class5723) {
        if (this.method9906()) {
            if (SpartanAntiKnockBack.mc.player != null) {
                if (class5723.method16998() instanceof Class4273) {
                    if (((Class4273)class5723.method16998()).method12822() == SpartanAntiKnockBack.mc.player.getEntityId()) {
                        this.field15900 = 0;
                    }
                }
            }
        }
    }
}
