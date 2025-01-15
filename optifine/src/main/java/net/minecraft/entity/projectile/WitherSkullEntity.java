package net.minecraft.entity.projectile;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.fluid.IFluidState;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Difficulty;
import net.minecraft.world.Explosion;
import net.minecraft.world.GameRules;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class WitherSkullEntity extends DamagingProjectileEntity
{
    private static final DataParameter<Boolean> INVULNERABLE = EntityDataManager.createKey(WitherSkullEntity.class, DataSerializers.BOOLEAN);

    public WitherSkullEntity(EntityType <? extends WitherSkullEntity > p_i1371_1_, World p_i1371_2_)
    {
        super(p_i1371_1_, p_i1371_2_);
    }

    public WitherSkullEntity(World p_i1372_1_, LivingEntity p_i1372_2_, double p_i1372_3_, double p_i1372_5_, double p_i1372_7_)
    {
        super(EntityType.WITHER_SKULL, p_i1372_2_, p_i1372_3_, p_i1372_5_, p_i1372_7_, p_i1372_1_);
    }

    public WitherSkullEntity(World p_i1373_1_, double p_i1373_2_, double p_i1373_4_, double p_i1373_6_, double p_i1373_8_, double p_i1373_10_, double p_i1373_12_)
    {
        super(EntityType.WITHER_SKULL, p_i1373_2_, p_i1373_4_, p_i1373_6_, p_i1373_8_, p_i1373_10_, p_i1373_12_, p_i1373_1_);
    }

    protected float getMotionFactor()
    {
        return this.isSkullInvulnerable() ? 0.73F : super.getMotionFactor();
    }

    public boolean isBurning()
    {
        return false;
    }

    public float getExplosionResistance(Explosion explosionIn, IBlockReader worldIn, BlockPos pos, BlockState blockStateIn, IFluidState p_180428_5_, float p_180428_6_)
    {
        return this.isSkullInvulnerable() && WitherEntity.canDestroyBlock(blockStateIn) ? Math.min(0.8F, p_180428_6_) : p_180428_6_;
    }

    protected void onImpact(RayTraceResult result)
    {
        super.onImpact(result);

        if (!this.world.isRemote)
        {
            if (result.getType() == RayTraceResult.Type.ENTITY)
            {
                Entity entity = ((EntityRayTraceResult)result).getEntity();

                if (this.shootingEntity != null)
                {
                    if (entity.attackEntityFrom(DamageSource.causeMobDamage(this.shootingEntity), 8.0F))
                    {
                        if (entity.isAlive())
                        {
                            this.applyEnchantments(this.shootingEntity, entity);
                        }
                        else
                        {
                            this.shootingEntity.heal(5.0F);
                        }
                    }
                }
                else
                {
                    entity.attackEntityFrom(DamageSource.MAGIC, 5.0F);
                }

                if (entity instanceof LivingEntity)
                {
                    int i = 0;

                    if (this.world.getDifficulty() == Difficulty.NORMAL)
                    {
                        i = 10;
                    }
                    else if (this.world.getDifficulty() == Difficulty.HARD)
                    {
                        i = 40;
                    }

                    if (i > 0)
                    {
                        ((LivingEntity)entity).addPotionEffect(new EffectInstance(Effects.WITHER, 20 * i, 1));
                    }
                }
            }

            Explosion.Mode explosion$mode = this.world.getGameRules().getBoolean(GameRules.MOB_GRIEFING) ? Explosion.Mode.DESTROY : Explosion.Mode.NONE;
            this.world.createExplosion(this, this.getPosX(), this.getPosY(), this.getPosZ(), 1.0F, false, explosion$mode);
            this.remove();
        }
    }

    public boolean canBeCollidedWith()
    {
        return false;
    }

    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        return false;
    }

    protected void registerData()
    {
        this.dataManager.register(INVULNERABLE, false);
    }

    public boolean isSkullInvulnerable()
    {
        return this.dataManager.get(INVULNERABLE);
    }

    public void setSkullInvulnerable(boolean invulnerable)
    {
        this.dataManager.set(INVULNERABLE, invulnerable);
    }

    protected boolean isFireballFiery()
    {
        return false;
    }
}
