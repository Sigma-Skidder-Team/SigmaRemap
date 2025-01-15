package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class RespirationEnchantment extends Enchantment
{
    public RespirationEnchantment(Enchantment.Rarity p_i685_1_, EquipmentSlotType... p_i685_2_)
    {
        super(p_i685_1_, EnchantmentType.ARMOR_HEAD, p_i685_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 10 * enchantmentLevel;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + 30;
    }

    public int getMaxLevel()
    {
        return 3;
    }
}
