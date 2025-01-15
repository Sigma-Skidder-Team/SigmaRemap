package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class PunchEnchantment extends Enchantment
{
    public PunchEnchantment(Enchantment.Rarity p_i3495_1_, EquipmentSlotType... p_i3495_2_)
    {
        super(p_i3495_1_, EnchantmentType.BOW, p_i3495_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 12 + (enchantmentLevel - 1) * 20;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + 25;
    }

    public int getMaxLevel()
    {
        return 2;
    }
}
