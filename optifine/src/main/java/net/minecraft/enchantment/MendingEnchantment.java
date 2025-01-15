package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class MendingEnchantment extends Enchantment
{
    public MendingEnchantment(Enchantment.Rarity p_i3757_1_, EquipmentSlotType... p_i3757_2_)
    {
        super(p_i3757_1_, EnchantmentType.BREAKABLE, p_i3757_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return enchantmentLevel * 25;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + 50;
    }

    public boolean isTreasureEnchantment()
    {
        return true;
    }

    public int getMaxLevel()
    {
        return 1;
    }
}
