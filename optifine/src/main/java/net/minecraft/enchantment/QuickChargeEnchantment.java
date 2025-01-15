package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class QuickChargeEnchantment extends Enchantment
{
    public QuickChargeEnchantment(Enchantment.Rarity p_i2498_1_, EquipmentSlotType... p_i2498_2_)
    {
        super(p_i2498_1_, EnchantmentType.CROSSBOW, p_i2498_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 12 + (enchantmentLevel - 1) * 20;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return 50;
    }

    public int getMaxLevel()
    {
        return 3;
    }
}
