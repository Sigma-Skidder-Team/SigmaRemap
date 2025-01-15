package net.minecraft.entity;

import javax.annotation.Nullable;
import net.minecraft.item.ItemStack;

public interface ICrossbowUser
{
    void setCharging(boolean p_213671_1_);

    void shoot(LivingEntity target, ItemStack p_213670_2_, IProjectile projectile, float projectileAngle);

    @Nullable
    LivingEntity getAttackTarget();
}
