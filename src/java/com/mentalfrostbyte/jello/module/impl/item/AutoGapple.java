package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.item.autogapple.BasicAutoGapple;
import com.mentalfrostbyte.jello.module.impl.item.autogapple.HypixelAutoGapple;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import mapped.Effects;
import mapped.InvManagerUtils;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;

import java.util.List;

public class AutoGapple extends ModuleWithModuleSettings {
    public AutoGapple() {
        super(ModuleCategory.ITEM, "AutoGapple", "Automatically eat golden apples", new BasicAutoGapple(), new HypixelAutoGapple());
        this.registerSetting(new NumberSetting<Float>("Health", "Maximum health before eating gapple.", 7.0F, Float.class, 0.5F, 10.0F, 0.5F));
    }

    public int findGappleSlot(boolean checkForFireResistance) {
        for (int slotIndex = 36; slotIndex < 45; slotIndex++) {
            if (mc.player.container.getSlot(slotIndex).getHasStack()) {
                ItemStack stack = mc.player.container.getSlot(slotIndex).getStack();
                if (stack != null) {
                    if (!checkForFireResistance) {
                        if (stack.getItem() == Items.GOLDEN_APPLE || stack.getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
                            return slotIndex - 36;
                        }
                    } else {
                        List<EffectInstance> effects = InvManagerUtils.getPotionEffects(stack);
                        if (effects != null) {
                            for (EffectInstance effect : effects) {
                                if (effect.getPotion() == Effects.FIRE_RESISTANCE) {
                                    return slotIndex - 36;
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int slotIndex = 9; slotIndex < 36; slotIndex++) {
            if (mc.player.container.getSlot(slotIndex).getHasStack()) {
                ItemStack stack = mc.player.container.getSlot(slotIndex).getStack();
                if (!checkForFireResistance) {
                    if (stack.getItem() == Items.GOLDEN_APPLE || stack.getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
                        InvManagerUtils.moveItemToHotbar(slotIndex, 4);
                        return -1;
                    }
                } else {
                    List<EffectInstance> effects = InvManagerUtils.getPotionEffects(stack);
                    if (effects != null) {
                        for (EffectInstance effect : effects) {
                            if (effect.getPotion() == Effects.FIRE_RESISTANCE) {
                                InvManagerUtils.moveItemToHotbar(slotIndex, 4);
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
