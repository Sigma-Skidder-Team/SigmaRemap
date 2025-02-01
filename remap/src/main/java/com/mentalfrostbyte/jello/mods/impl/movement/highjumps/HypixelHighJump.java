// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.highjumps;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

public class HypixelHighJump extends Module
{
    private int field15851;
    private boolean field15852;
    private double field15853;
    
    public HypixelHighJump() {
        super(Category.MOVEMENT, "Hypixel", "Highjump for Hypixel");
        this.addSetting(new NumberSetting("Motion", "Highjump motion", 0.75f, Float.class, 0.42f, 5.0f, 0.05f));
    }
    
    @Override
    public void method9879() {
        this.field15851 = -1;
        this.field15852 = false;
        this.field15853 = 999.0;
    }
    
    @EventListener
    public void method10420(final Class5717 class5717) {
        if (this.method9906() && HypixelHighJump.mc.player != null) {
            if (HypixelHighJump.mc.player.fallDistance > 3.0f + this.getNumberSettingValueByName("Motion") * 4.0f) {
                if (class5717.method16974() < -0.3) {
                    if (this.field15852) {
                        if (HypixelHighJump.mc.player.posY + class5717.method16974() < this.field15853) {
                            class5717.method16975(this.field15853 - HypixelHighJump.mc.player.posY);
                            this.field15852 = false;
                        }
                    }
                    else {
                        this.field15851 = 0;
                    }
                }
            }
            if (this.field15851 >= 0) {
                ++this.field15851;
                class5717.method16975(0.0);
                Class7482.method23149(class5717, 0.0);
                class5717.method16975(this.getNumberSettingValueByName("Motion"));
                this.field15852 = true;
                this.field15853 = HypixelHighJump.mc.player.posY;
                this.field15851 = -1;
            }
            if (this.field15852) {
                if (ColorUtils.method19160(HypixelHighJump.mc.player, 0.001f)) {
                    this.field15852 = !this.field15852;
                }
            }
            ColorUtils.method19155(class5717.method16974());
        }
    }
    
    @EventListener
    public void method10421(final Class5744 class5744) {
        if (this.method9906()) {
            if (this.field15851 >= 0) {
                class5744.method17033(true);
            }
        }
    }
}
