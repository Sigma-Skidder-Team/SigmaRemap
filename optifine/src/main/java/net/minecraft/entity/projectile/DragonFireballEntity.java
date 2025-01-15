package net.minecraft.entity.projectile;

import java.util.List;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class DragonFireballEntity extends DamagingProjectileEntity
{
    public DragonFireballEntity(EntityType <? extends DragonFireballEntity > p_i2292_1_, World p_i2292_2_)
    {
        super(p_i2292_1_, p_i2292_2_);
    }

    public DragonFireballEntity(World p_i2293_1_, double p_i2293_2_, double p_i2293_4_, double p_i2293_6_, double p_i2293_8_, double p_i2293_10_, double p_i2293_12_)
    {
        super(EntityType.DRAGON_FIREBALL, p_i2293_2_, p_i2293_4_, p_i2293_6_, p_i2293_8_, p_i2293_10_, p_i2293_12_, p_i2293_1_);
    }

    public DragonFireballEntity(World p_i2294_1_, LivingEntity p_i2294_2_, double p_i2294_3_, double p_i2294_5_, double p_i2294_7_)
    {
        super(EntityType.DRAGON_FIREBALL, p_i2294_2_, p_i2294_3_, p_i2294_5_, p_i2294_7_, p_i2294_1_);
    }

    protected void onImpact(RayTraceResult result)
    {
        super.onImpact(result);

        if (result.getType() != RayTraceResult.Type.ENTITY || !((EntityRayTraceResult)result).getEntity().isEntityEqual(this.shootingEntity))
        {
            if (!this.world.isRemote)
            {
                List<LivingEntity> list = this.world.getEntitiesWithinAABB(LivingEntity.class, this.getBoundingBox().grow(4.0D, 2.0D, 4.0D));
                AreaEffectCloudEntity areaeffectcloudentity = new AreaEffectCloudEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ());
                areaeffectcloudentity.setOwner(this.shootingEntity);
                areaeffectcloudentity.setParticleData(ParticleTypes.DRAGON_BREATH);
                areaeffectcloudentity.setRadius(3.0F);
                areaeffectcloudentity.setDuration(600);
                areaeffectcloudentity.setRadiusPerTick((7.0F - areaeffectcloudentity.getRadius()) / (float)areaeffectcloudentity.getDuration());
                areaeffectcloudentity.addEffect(new EffectInstance(Effects.INSTANT_DAMAGE, 1, 1));

                if (!list.isEmpty())
                {
                    for (LivingEntity livingentity : list)
                    {
                        double d0 = this.getDistanceSq(livingentity);

                        if (d0 < 16.0D)
                        {
                            areaeffectcloudentity.setPosition(livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ());
                            break;
                        }
                    }
                }

                this.world.playEvent(2006, new BlockPos(this), 0);
                this.world.addEntity(areaeffectcloudentity);
                this.remove();
            }
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

    protected IParticleData getParticle()
    {
        return ParticleTypes.DRAGON_BREATH;
    }

    protected boolean isFireballFiery()
    {
        return false;
    }
}
