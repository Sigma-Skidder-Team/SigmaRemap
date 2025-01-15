package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class LootBonusEnchantment extends Enchantment
{
    protected LootBonusEnchantment(Enchantment.Rarity p_i859_1_, EnchantmentType p_i859_2_, EquipmentSlotType... p_i859_3_)
    {
        super(p_i859_1_, p_i859_2_, p_i859_3_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 15 + (enchantmentLevel - 1) * 9;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    public int getMaxLevel()
    {
        return 3;
    }

    public boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench) && ench != Enchantments.SILK_TOUCH;
    }
}
