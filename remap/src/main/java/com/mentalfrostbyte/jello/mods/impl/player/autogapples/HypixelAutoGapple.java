// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player.autogapples;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.PremiumModule;
import com.mentalfrostbyte.jello.mods.impl.item.AutoGapple;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;

public class HypixelAutoGapple extends PremiumModule
{
    private int field16026;
    private int field16027;
    private int field16028;
    private int field16029;
    
    public HypixelAutoGapple() {
        super("Hypixel", "Hypixel bypass", Category.PLAYER);
        this.addSetting(new BooleanSetting("Fire resistance potions", "Automatically drink fire pots", true));
        this.field16026 = -1;
        this.field16029 = -1;
    }
    
    @Override
    public void onEnable() {
        this.field16026 = -1;
        this.field16028 = 20;
        this.field16029 = -1;
    }
    
    @EventListener
    public void method10697(final Class5744 class5744) {
        if (this.isEnabled()) {
            if (class5744.method17046()) {
                if (!(HypixelAutoGapple.mc.currentScreen instanceof Class726)) {
                    if (this.field16028 < 20) {
                        ++this.field16028;
                    }
                    if (this.field16029 == -1) {
                        if (this.field16028 >= 20) {
                            if (this.field16026 == -1) {
                                if (HypixelAutoGapple.mc.player.method2664() <= this.method9914().getNumberSettingValueByName("Health") * 2.0f) {
                                    if (HypixelAutoGapple.mc.player.method2750() == 0.0f) {
                                        this.field16029 = ((AutoGapple)this.method9914()).method10292(false);
                                        if (this.field16029 >= 0) {
                                            this.field16026 = 0;
                                            this.field16028 = 0;
                                        }
                                    }
                                }
                                if (this.field16026 == -1) {
                                    if (this.method9883("Fire resistance potions")) {
                                        if (!HypixelAutoGapple.mc.player.method2653(Class5328.method16450(12))) {
                                            this.field16029 = ((AutoGapple)this.method9914()).method10292(true);
                                            if (this.field16029 >= 0) {
                                                this.field16026 = 0;
                                                this.field16028 = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field16029 >= 0) {
                        if (this.field16026 >= 0) {
                            ++this.field16026;
                            if (this.field16026 == 2) {
                                class5744.method17041(class5744.method17040() + 1.0f);
                            }
                            if (this.field16026 != 1) {
                                if (this.field16026 >= 3) {
                                    HypixelAutoGapple.mc.method5269().method17292(new Class4307(Class316.field1877));
                                    HypixelAutoGapple.mc.method5269().method17292(new Class4321(this.field16029 + ((this.field16029 != 8) ? 1 : -1)));
                                    HypixelAutoGapple.mc.method5269().method17292(new Class4321(this.field16029));
                                    HypixelAutoGapple.mc.player.inventory.field2743 = this.field16027;
                                    this.field16027 = -1;
                                    this.field16026 = -1;
                                    this.field16029 = -1;
                                }
                            }
                            else {
                                this.field16027 = HypixelAutoGapple.mc.player.inventory.field2743;
                                HypixelAutoGapple.mc.player.inventory.field2743 = this.field16029;
                            }
                        }
                    }
                }
            }
        }
    }
}
