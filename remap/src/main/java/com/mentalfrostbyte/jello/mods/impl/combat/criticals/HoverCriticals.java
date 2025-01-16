// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.criticals;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.Step;
import mapped.*;

public class HoverCriticals extends Module
{
    private double field15895;
    
    public HoverCriticals() {
        super(Category.COMBAT, "Hover", "Hover criticals");
    }
    
    @Override
    public void method9879() {
        this.field15895 = 1.0E-11;
    }
    
    @EventListener
    public void method10483(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15895 = 1.0E-11;
            }
        }
    }
    
    @EventListener
    @Class6757
    private void method10484(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            final boolean b = HoverCriticals.mc.field4691 != null && HoverCriticals.mc.field4691.getType() == RayTraceResult.Type.BLOCK;
            final boolean b2 = HoverCriticals.mc.field4682.method27337() || (HoverCriticals.mc.gameSettings.field23446.method1056() && b);
            if (Client.method35173().method35194().method29228() > 0 && !b2) {
                this.field15895 -= 1.0E-14;
                if (this.field15895 < 0.0 || Step.field15758 == 0) {
                    this.field15895 = 1.0E-11;
                }
                class5744.method17033(true);
                class5744.method17037(class5744.method17036() + this.field15895);
                class5744.method17045(false);
            }
            else {
                this.field15895 = 1.0E-11;
            }
        }
    }
}
