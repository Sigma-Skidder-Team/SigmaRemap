package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class ChannelingEnchantment extends Enchantment
{
    public ChannelingEnchantment(Enchantment.Rarity p_i2051_1_, EquipmentSlotType... p_i2051_2_)
    {
        super(p_i2051_1_, EnchantmentType.TRIDENT, p_i2051_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 25;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return 50;
    }

    public int getMaxLevel()
    {
        return 1;
    }

    public boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench);
    }
}
