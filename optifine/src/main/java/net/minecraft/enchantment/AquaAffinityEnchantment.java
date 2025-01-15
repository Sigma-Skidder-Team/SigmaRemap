package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class AquaAffinityEnchantment extends Enchantment
{
    public AquaAffinityEnchantment(Enchantment.Rarity p_i385_1_, EquipmentSlotType... p_i385_2_)
    {
        super(p_i385_1_, EnchantmentType.ARMOR_HEAD, p_i385_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 1;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + 40;
    }

    public int getMaxLevel()
    {
        return 1;
    }
}
