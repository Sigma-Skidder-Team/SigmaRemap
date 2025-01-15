package net.minecraft.enchantment;

import java.util.Random;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

public class UnbreakingEnchantment extends Enchantment
{
    protected UnbreakingEnchantment(Enchantment.Rarity p_i2828_1_, EquipmentSlotType... p_i2828_2_)
    {
        super(p_i2828_1_, EnchantmentType.BREAKABLE, p_i2828_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 5 + (enchantmentLevel - 1) * 8;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    public int getMaxLevel()
    {
        return 3;
    }

    public boolean canApply(ItemStack stack)
    {
        return stack.isDamageable() ? true : super.canApply(stack);
    }

    public static boolean negateDamage(ItemStack stack, int level, Random rand)
    {
        if (stack.getItem() instanceof ArmorItem && rand.nextFloat() < 0.6F)
        {
            return false;
        }
        else
        {
            return rand.nextInt(level + 1) > 0;
        }
    }
}
