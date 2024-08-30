package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import mapped.*;

import java.util.List;

public class AutoGapple extends ModuleWithModuleSettings {
    public AutoGapple() {
        super(ModuleCategory.ITEM, "AutoGapple", "Automatically eat golden apples", new Class5218(), new Class5264());
        this.registerSetting(new NumberSetting<Float>("Health", "Maximum health before eating gapple.", 7.0F, Float.class, 0.5F, 10.0F, 0.5F));
    }

    public int method16749(boolean var1) {
        for (int var4 = 36; var4 < 45; var4++) {
            if (mc.player.field4904.method18131(var4).method18266()) {
                ItemStack var5 = mc.player.field4904.method18131(var4).method18265();
                if (var5 != null) {
                    if (!var1) {
                        if (var5.getItem() == Items.GOLDEN_APPLE || var5.getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
                            return var4 - 36;
                        }
                    } else {
                        List<Class2023> var6 = Class7789.method25858(var5);
                        if (var6 != null) {
                            for (Class2023 var8 : var6) {
                                if (var8.method8627() == Effects.FIRE_RESISTANCE) {
                                    return var4 - 36;
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int var9 = 9; var9 < 36; var9++) {
            if (mc.player.field4904.method18131(var9).method18266()) {
                ItemStack var10 = mc.player.field4904.method18131(var9).method18265();
                if (!var1) {
                    if (var10.getItem() == Items.GOLDEN_APPLE || var10.getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
                        Class7789.method25873(var9, 4);
                        return -1;
                    }
                } else {
                    List<Class2023> var11 = Class7789.method25858(var10);
                    if (var11 != null) {
                        for (Class2023 var13 : var11) {
                            if (var13.method8627() == Effects.FIRE_RESISTANCE) {
                                Class7789.method25873(var9, 4);
                                return -1;
                            }
                        }
                    }
                }
            }
        }

        return -1;
    }
}
