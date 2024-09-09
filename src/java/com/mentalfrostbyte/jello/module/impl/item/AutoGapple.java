package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.item.autogapple.HypixelAutoGapple;
import com.mentalfrostbyte.jello.module.impl.item.autogapple.BasicAutoGapple;
import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.List;

public class AutoGapple extends ModuleWithModuleSettings {
    public AutoGapple() {
        super(ModuleCategory.ITEM, "AutoGapple", "Automatically eat golden apples", new BasicAutoGapple(), new HypixelAutoGapple());
        this.registerSetting(new NumberSetting<Float>("Health", "Maximum health before eating gapple.", 7.0F, Float.class, 0.5F, 10.0F, 0.5F));
    }

    public int method16749(boolean var1) {
        for (int var4 = 36; var4 < 45; var4++) {
            if (mc.player.container.getSlot(var4).getHasStack()) {
                ItemStack var5 = mc.player.container.getSlot(var4).getStack();
                if (var5 != null) {
                    if (!var1) {
                        if (var5.getItem() == Items.GOLDEN_APPLE || var5.getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
                            return var4 - 36;
                        }
                    } else {
                        List<EffectInstance> var6 = InvManagerUtils.method25858(var5);
                        if (var6 != null) {
                            for (EffectInstance var8 : var6) {
                                if (var8.getPotion() == Effects.FIRE_RESISTANCE) {
                                    return var4 - 36;
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int var9 = 9; var9 < 36; var9++) {
            if (mc.player.container.getSlot(var9).getHasStack()) {
                ItemStack var10 = mc.player.container.getSlot(var9).getStack();
                if (!var1) {
                    if (var10.getItem() == Items.GOLDEN_APPLE || var10.getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
                        InvManagerUtils.method25873(var9, 4);
                        return -1;
                    }
                } else {
                    List<EffectInstance> var11 = InvManagerUtils.method25858(var10);
                    if (var11 != null) {
                        for (EffectInstance var13 : var11) {
                            if (var13.getPotion() == Effects.FIRE_RESISTANCE) {
                                InvManagerUtils.method25873(var9, 4);
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
