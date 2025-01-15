package net.minecraft.enchantment;

import net.minecraft.util.WeightedRandom;

public class EnchantmentData extends WeightedRandom.Item
{
    public final Enchantment enchantment;
    public final int enchantmentLevel;

    public EnchantmentData(Enchantment p_i3823_1_, int p_i3823_2_)
    {
        super(p_i3823_1_.getRarity().getWeight());
        this.enchantment = p_i3823_1_;
        this.enchantmentLevel = p_i3823_2_;
    }
}
