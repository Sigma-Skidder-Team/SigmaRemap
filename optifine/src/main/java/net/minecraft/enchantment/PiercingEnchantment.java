package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class PiercingEnchantment extends Enchantment
{
    public PiercingEnchantment(Enchantment.Rarity p_i3470_1_, EquipmentSlotType... p_i3470_2_)
    {
        super(p_i3470_1_, EnchantmentType.CROSSBOW, p_i3470_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 1 + (enchantmentLevel - 1) * 10;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return 50;
    }

    public int getMaxLevel()
    {
        return 4;
    }

    public boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench) && ench != Enchantments.MULTISHOT;
    }
}
