// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

public class Weather extends Module
{
    private float field15983;
    private boolean field15984;
    
    public Weather() {
        super(Category.WORLD, "Weather", "Removes rain and changes the world's time");
        this.addSetting(new BooleanSetting("Custom time", "Set the world time", true));
        this.addSetting(new NumberSetting("Time", "Time to set the world to", 12000.0f, Float.class, 0.0f, 24000.0f, 1.0f).method15195(class4997 -> {
            if (this.method9883("Custom time")) {
                if (this.method9906()) {
                    Weather.mc.world.method6756(-(long)this.getNumberSettingValueByName("Time"));
                }
            }
        }));
        this.addSetting(new BooleanSetting("Disable rain", "Disable rain", true));
    }
    
    @Override
    public void method9879() {
        this.field15983 = Weather.mc.world.method6768(1.0f);
        if (Weather.mc.world.method6768(1.0f) != 1.0f) {
            if (Weather.mc.world.method6768(1.0f) == 0.0f) {
                this.field15984 = false;
            }
        }
        else {
            this.field15984 = true;
        }
        Weather.mc.world.method6752((long)this.getNumberSettingValueByName("Time"));
    }
    
    @EventListener
    private void method10619(final Class5743 class5743) {
        if (this.method9906()) {
            if (!this.method9883("Disable rain")) {
                if (this.field15984) {
                    if (this.field15983 >= 1.0f) {
                        if (this.field15983 > 1.0f) {
                            this.field15983 = 1.0f;
                        }
                    }
                    else {
                        this.field15983 += (float)0.05;
                    }
                }
            }
            else if (this.field15983 <= 0.0f) {
                if (this.field15983 < 0.0f) {
                    this.field15983 = 0.0f;
                }
            }
            else {
                this.field15983 -= (float)0.05;
            }
            Weather.mc.world.method6769(this.field15983);
            Weather.mc.world.method6767(this.field15983);
        }
    }
    
    @EventListener
    private void method10620(final Class5723 class5723) {
        if (this.method9906()) {
            if (!(class5723.method16998() instanceof Class4345)) {
                if (class5723.method16998() instanceof Class4306) {
                    final Class4306 class5724 = (Class4306)class5723.method16998();
                    if (class5724.method12948() == 7) {
                        if (class5724.method12949() != 1.0f) {
                            if (class5724.method12949() == 0.0f) {
                                this.field15984 = false;
                            }
                        }
                        else {
                            this.field15984 = true;
                        }
                        if (!this.method9883("Disable rain")) {
                            this.field15983 = class5724.method12949();
                        }
                        else {
                            class5723.method16999(new Class4306(class5724.method12948(), 0.0f));
                            this.field15983 = 0.0f;
                        }
                    }
                }
            }
            else if (this.method9883("Custom time")) {
                class5723.method16999(new Class4345(-(long)this.getNumberSettingValueByName("Time"), -(long)this.getNumberSettingValueByName("Time"), true));
            }
        }
    }
}
