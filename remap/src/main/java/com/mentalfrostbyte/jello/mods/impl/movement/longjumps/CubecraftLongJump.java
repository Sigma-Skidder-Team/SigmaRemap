// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.longjumps;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

public class CubecraftLongJump extends Module
{
    private int field15596;
    private double field15597;
    
    public CubecraftLongJump() {
        super(Category.MOVEMENT, "Cubecraft", "Longjump for Cubecraft.");
        this.addSetting(new NumberSetting("Boost", "Longjump boost", 3.0f, Float.class, 1.0f, 5.0f, 0.01f));
    }
    
    @Override
    public void onDisable() {
        Class7482.method23151(Class7482.method23136() * 0.8);
        CubecraftLongJump.mc.timer.timerSpeed = 1.0f;
    }
    
    @Override
    public void method9879() {
        this.field15596 = -1;
        CubecraftLongJump.mc.timer.timerSpeed = 0.3f;
    }
    
    @EventListener
    public void method10016(final Class5743 class5743) {
        if (this.method9906() && CubecraftLongJump.mc.player != null) {
            if (!ColorUtils.method19160(CubecraftLongJump.mc.player, 0.001f)) {
                ++this.field15596;
                this.field15597 -= 0.005;
                if (this.field15597 < 0.26 || this.field15596 > 6) {
                    this.field15597 = 0.26;
                }
                Class7482.method23151(this.field15597);
                if (this.field15596 > 5) {
                    this.method9914().method9910();
                }
            }
            else {
                if (this.field15596 > 0) {
                    Class7482.method23151(0.0);
                    this.method9914().method9910();
                    this.field15596 = 0;
                }
                final double field2395 = CubecraftLongJump.mc.player.posX;
                final double field2396 = CubecraftLongJump.mc.player.posY;
                final double field2397 = CubecraftLongJump.mc.player.posZ;
                for (int n = 49 + Class7482.method23140() * 17, i = 0; i < n; ++i) {
                    CubecraftLongJump.mc.method5269().method17292(new Class4354(field2395, field2396 + 0.06248, field2397, false));
                    CubecraftLongJump.mc.method5269().method17292(new Class4354(field2395, field2396, field2397, false));
                }
                CubecraftLongJump.mc.method5269().method17292(new Class4354(field2395, field2396, field2397, true));
                ColorUtils.method19155(Class7482.method23141());
                this.field15596 = 0;
                Class7482.method23151(this.field15597 = this.getNumberSettingValueByName("Boost") / 2.0f);
            }
        }
    }
}
