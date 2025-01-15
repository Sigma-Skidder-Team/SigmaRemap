package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class FireAspectEnchantment extends Enchantment
{
    protected FireAspectEnchantment(Enchantment.Rarity p_i2421_1_, EquipmentSlotType... p_i2421_2_)
    {
        super(p_i2421_1_, EnchantmentType.WEAPON, p_i2421_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 10 + 20 * (enchantmentLevel - 1);
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
