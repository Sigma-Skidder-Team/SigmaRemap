package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class FlameEnchantment extends Enchantment
{
    public FlameEnchantment(Enchantment.Rarity p_i4202_1_, EquipmentSlotType... p_i4202_2_)
    {
        super(p_i4202_1_, EnchantmentType.BOW, p_i4202_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 20;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return 50;
    }

    public int getMaxLevel()
    {
        return 1;
    }
}
