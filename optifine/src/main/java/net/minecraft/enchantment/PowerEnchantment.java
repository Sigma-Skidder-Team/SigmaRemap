package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class PowerEnchantment extends Enchantment
{
    public PowerEnchantment(Enchantment.Rarity p_i2151_1_, EquipmentSlotType... p_i2151_2_)
    {
        super(p_i2151_1_, EnchantmentType.BOW, p_i2151_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 1 + (enchantmentLevel - 1) * 10;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + 15;
    }

    public int getMaxLevel()
    {
        return 5;
    }
}
