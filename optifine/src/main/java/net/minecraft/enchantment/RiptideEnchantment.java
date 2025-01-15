package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class RiptideEnchantment extends Enchantment
{
    public RiptideEnchantment(Enchantment.Rarity p_i1233_1_, EquipmentSlotType... p_i1233_2_)
    {
        super(p_i1233_1_, EnchantmentType.TRIDENT, p_i1233_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 10 + enchantmentLevel * 7;
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
        return super.canApplyTogether(ench) && ench != Enchantments.LOYALTY && ench != Enchantments.CHANNELING;
    }
}
