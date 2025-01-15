package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class SilkTouchEnchantment extends Enchantment
{
    protected SilkTouchEnchantment(Enchantment.Rarity p_i3821_1_, EquipmentSlotType... p_i3821_2_)
    {
        super(p_i3821_1_, EnchantmentType.DIGGER, p_i3821_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 15;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    public int getMaxLevel()
    {
        return 1;
    }

    public boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench) && ench != Enchantments.FORTUNE;
    }
}
