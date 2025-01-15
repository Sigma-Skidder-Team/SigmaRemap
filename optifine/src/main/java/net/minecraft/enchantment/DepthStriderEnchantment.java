package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class DepthStriderEnchantment extends Enchantment
{
    public DepthStriderEnchantment(Enchantment.Rarity report, EquipmentSlotType... name)
    {
        super(report, EnchantmentType.ARMOR_FEET, name);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return enchantmentLevel * 10;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + 15;
    }

    public int getMaxLevel()
    {
        return 3;
    }

    public boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench) && ench != Enchantments.FROST_WALKER;
    }
}
