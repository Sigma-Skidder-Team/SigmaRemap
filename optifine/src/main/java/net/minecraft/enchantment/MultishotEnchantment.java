package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class MultishotEnchantment extends Enchantment
{
    public MultishotEnchantment(Enchantment.Rarity p_i493_1_, EquipmentSlotType... p_i493_2_)
    {
        super(p_i493_1_, EnchantmentType.CROSSBOW, p_i493_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 20;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return 50;
    }

    public int getMaxLevel()
    {
        return 1;
    }

    public boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench) && ench != Enchantments.PIERCING;
    }
}
