package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class BindingCurseEnchantment extends Enchantment
{
    public BindingCurseEnchantment(Enchantment.Rarity p_i3365_1_, EquipmentSlotType... p_i3365_2_)
    {
        super(p_i3365_1_, EnchantmentType.WEARABLE, p_i3365_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 25;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return 50;
    }

    public int getMaxLevel()
    {
        return 1;
    }

    public boolean isTreasureEnchantment()
    {
        return true;
    }

    public boolean isCurse()
    {
        return true;
    }
}
