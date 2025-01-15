package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class LoyaltyEnchantment extends Enchantment
{
    public LoyaltyEnchantment(Enchantment.Rarity p_i3072_1_, EquipmentSlotType... p_i3072_2_)
    {
        super(p_i3072_1_, EnchantmentType.TRIDENT, p_i3072_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 5 + enchantmentLevel * 7;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return 50;
    }

    public int getMaxLevel()
    {
        return 3;
    }

    public boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench);
    }
}
