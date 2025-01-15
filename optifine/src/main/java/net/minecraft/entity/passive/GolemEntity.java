package net.minecraft.entity.passive;

import javax.annotation.Nullable;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public abstract class GolemEntity extends CreatureEntity
{
    protected GolemEntity(EntityType <? extends GolemEntity > p_i2029_1_, World p_i2029_2_)
    {
        super(p_i2029_1_, p_i2029_2_);
    }

    public boolean onLivingFall(float distance, float damageMultiplier)
    {
        return false;
    }

    @Nullable
    protected SoundEvent getAmbientSound()
    {
        return null;
    }

    @Nullable
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return null;
    }

    @Nullable
    protected SoundEvent getDeathSound()
    {
        return null;
    }

    public int getTalkInterval()
    {
        return 120;
    }

    public boolean canDespawn(double distanceToClosestPlayer)
    {
        return false;
    }
}
