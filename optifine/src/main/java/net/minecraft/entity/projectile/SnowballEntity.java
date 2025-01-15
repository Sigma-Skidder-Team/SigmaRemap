package net.minecraft.entity.projectile;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class SnowballEntity extends ProjectileItemEntity
{
    public SnowballEntity(EntityType <? extends SnowballEntity > p_i325_1_, World p_i325_2_)
    {
        super(p_i325_1_, p_i325_2_);
    }

    public SnowballEntity(World p_i326_1_, LivingEntity p_i326_2_)
    {
        super(EntityType.SNOWBALL, p_i326_2_, p_i326_1_);
    }

    public SnowballEntity(World p_i327_1_, double p_i327_2_, double p_i327_4_, double p_i327_6_)
    {
        super(EntityType.SNOWBALL, p_i327_2_, p_i327_4_, p_i327_6_, p_i327_1_);
    }

    protected Item getDefaultItem()
    {
        return Items.SNOWBALL;
    }

    private IParticleData makeParticle()
    {
        ItemStack itemstack = this.func_213882_k();
        return (IParticleData)(itemstack.isEmpty() ? ParticleTypes.ITEM_SNOWBALL : new ItemParticleData(ParticleTypes.ITEM, itemstack));
    }

    public void handleStatusUpdate(byte id)
    {
        if (id == 3)
        {
            IParticleData iparticledata = this.makeParticle();

            for (int i = 0; i < 8; ++i)
            {
                this.world.addParticle(iparticledata, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0D, 0.0D, 0.0D);
            }
        }
    }

    protected void onImpact(RayTraceResult result)
    {
        if (result.getType() == RayTraceResult.Type.ENTITY)
        {
            Entity entity = ((EntityRayTraceResult)result).getEntity();
            int i = entity instanceof BlazeEntity ? 3 : 0;
            entity.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
        }

        if (!this.world.isRemote)
        {
            this.world.setEntityState(this, (byte)3);
            this.remove();
        }
    }
}
