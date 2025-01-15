package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class KnockbackEnchantment extends Enchantment
{
    protected KnockbackEnchantment(Enchantment.Rarity p_i4130_1_, EquipmentSlotType... p_i4130_2_)
    {
        super(p_i4130_1_, EnchantmentType.WEAPON, p_i4130_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 5 + 20 * (enchantmentLevel - 1);
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    public int getMaxLevel()
    {
        return 2;
    }
}
