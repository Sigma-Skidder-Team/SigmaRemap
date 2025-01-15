package net.minecraft.potion;

import net.minecraft.entity.ai.attributes.AttributeModifier;

public class AttackDamageEffect extends Effect
{
    protected final double bonusPerLevel;

    protected AttackDamageEffect(EffectType p_i1122_1_, int p_i1122_2_, double p_i1122_3_)
    {
        super(p_i1122_1_, p_i1122_2_);
        this.bonusPerLevel = p_i1122_3_;
    }

    public double getAttributeModifierAmount(int amplifier, AttributeModifier modifier)
    {
        return this.bonusPerLevel * (double)(amplifier + 1);
    }
}
