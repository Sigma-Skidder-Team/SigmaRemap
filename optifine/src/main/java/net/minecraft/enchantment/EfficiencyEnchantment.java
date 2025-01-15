package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class EfficiencyEnchantment extends Enchantment
{
    protected EfficiencyEnchantment(Enchantment.Rarity p_i3121_1_, EquipmentSlotType... p_i3121_2_)
    {
        super(p_i3121_1_, EnchantmentType.DIGGER, p_i3121_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 1 + 10 * (enchantmentLevel - 1);
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    public int getMaxLevel()
    {
        return 5;
    }

    public boolean canApply(ItemStack stack)
    {
        return stack.getItem() == Items.SHEARS ? true : super.canApply(stack);
    }
}
