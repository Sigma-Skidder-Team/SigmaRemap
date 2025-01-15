package net.minecraft.entity.projectile;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EggEntity extends ProjectileItemEntity
{
    public EggEntity(EntityType <? extends EggEntity > p_i3486_1_, World p_i3486_2_)
    {
        super(p_i3486_1_, p_i3486_2_);
    }

    public EggEntity(World p_i3487_1_, LivingEntity p_i3487_2_)
    {
        super(EntityType.EGG, p_i3487_2_, p_i3487_1_);
    }

    public EggEntity(World p_i3488_1_, double p_i3488_2_, double p_i3488_4_, double p_i3488_6_)
    {
        super(EntityType.EGG, p_i3488_2_, p_i3488_4_, p_i3488_6_, p_i3488_1_);
    }

    public void handleStatusUpdate(byte id)
    {
        if (id == 3)
        {
            double d0 = 0.08D;

            for (int i = 0; i < 8; ++i)
            {
                this.world.addParticle(new ItemParticleData(ParticleTypes.ITEM, this.getItem()), this.getPosX(), this.getPosY(), this.getPosZ(), ((double)this.rand.nextFloat() - 0.5D) * 0.08D, ((double)this.rand.nextFloat() - 0.5D) * 0.08D, ((double)this.rand.nextFloat() - 0.5D) * 0.08D);
            }
        }
    }

    protected void onImpact(RayTraceResult result)
    {
        if (result.getType() == RayTraceResult.Type.ENTITY)
        {
            ((EntityRayTraceResult)result).getEntity().attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 0.0F);
        }

        if (!this.world.isRemote)
        {
            if (this.rand.nextInt(8) == 0)
            {
                int i = 1;

                if (this.rand.nextInt(32) == 0)
                {
                    i = 4;
                }

                for (int j = 0; j < i; ++j)
                {
                    ChickenEntity chickenentity = EntityType.CHICKEN.create(this.world);
                    chickenentity.setGrowingAge(-24000);
                    chickenentity.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, 0.0F);
                    this.world.addEntity(chickenentity);
                }
            }

            this.world.setEntityState(this, (byte)3);
            this.remove();
        }
    }

    protected Item getDefaultItem()
    {
        return Items.EGG;
    }
}
