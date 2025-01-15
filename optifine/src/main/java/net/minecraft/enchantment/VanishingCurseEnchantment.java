package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class VanishingCurseEnchantment extends Enchantment
{
    public VanishingCurseEnchantment(Enchantment.Rarity p_i1973_1_, EquipmentSlotType... p_i1973_2_)
    {
        super(p_i1973_1_, EnchantmentType.ALL, p_i1973_2_);
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

    public boolean isTreasureEnchantment()
    {
        return true;
    }

    public boolean isCurse()
    {
        return true;
    }
}
