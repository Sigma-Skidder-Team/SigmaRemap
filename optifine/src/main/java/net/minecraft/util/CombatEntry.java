package net.minecraft.util;

import javax.annotation.Nullable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.text.ITextComponent;

public class CombatEntry
{
    private final DamageSource damageSrc;
    private final int time;
    private final float damage;
    private final float health;
    private final String fallSuffix;
    private final float fallDistance;

    public CombatEntry(DamageSource p_i3925_1_, int p_i3925_2_, float p_i3925_3_, float p_i3925_4_, String p_i3925_5_, float p_i3925_6_)
    {
        this.damageSrc = p_i3925_1_;
        this.time = p_i3925_2_;
        this.damage = p_i3925_4_;
        this.health = p_i3925_3_;
        this.fallSuffix = p_i3925_5_;
        this.fallDistance = p_i3925_6_;
    }

    public DamageSource getDamageSrc()
    {
        return this.damageSrc;
    }

    public float getDamage()
    {
        return this.damage;
    }

    public boolean isLivingDamageSrc()
    {
        return this.damageSrc.getTrueSource() instanceof LivingEntity;
    }

    @Nullable
    public String getFallSuffix()
    {
        return this.fallSuffix;
    }

    @Nullable
    public ITextComponent getDamageSrcDisplayName()
    {
        return this.getDamageSrc().getTrueSource() == null ? null : this.getDamageSrc().getTrueSource().getDisplayName();
    }

    public float getDamageAmount()
    {
        return this.damageSrc == DamageSource.OUT_OF_WORLD ? Float.MAX_VALUE : this.fallDistance;
    }
}
