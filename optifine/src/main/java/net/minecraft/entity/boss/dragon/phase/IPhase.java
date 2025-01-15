package net.minecraft.entity.boss.dragon.phase;

import javax.annotation.Nullable;
import net.minecraft.entity.item.EnderCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public interface IPhase
{
    boolean getIsStationary();

    void clientTick();

    void serverTick();

    void onCrystalDestroyed(EnderCrystalEntity crystal, BlockPos pos, DamageSource dmgSrc, @Nullable PlayerEntity plyr);

    void initPhase();

    void removeAreaEffect();

    float getMaxRiseOrFall();

    float getYawFactor();

    PhaseType <? extends IPhase > getType();

    @Nullable
    Vec3d getTargetLocation();

    float func_221113_a(DamageSource p_221113_1_, float p_221113_2_);
}
