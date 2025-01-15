package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class LureEnchantment extends Enchantment
{
    protected LureEnchantment(Enchantment.Rarity p_i2879_1_, EnchantmentType p_i2879_2_, EquipmentSlotType... p_i2879_3_)
    {
        super(p_i2879_1_, p_i2879_2_, p_i2879_3_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 15 + (enchantmentLevel - 1) * 9;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    public int getMaxLevel()
    {
        return 3;
    }
}
