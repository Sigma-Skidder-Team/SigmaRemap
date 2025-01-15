package net.minecraft.entity.projectile;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class FireballEntity extends AbstractFireballEntity
{
    public int explosionPower = 1;

    public FireballEntity(EntityType <? extends FireballEntity > p_i2794_1_, World p_i2794_2_)
    {
        super(p_i2794_1_, p_i2794_2_);
    }

    public FireballEntity(World p_i2795_1_, double p_i2795_2_, double p_i2795_4_, double p_i2795_6_, double p_i2795_8_, double p_i2795_10_, double p_i2795_12_)
    {
        super(EntityType.FIREBALL, p_i2795_2_, p_i2795_4_, p_i2795_6_, p_i2795_8_, p_i2795_10_, p_i2795_12_, p_i2795_1_);
    }

    public FireballEntity(World p_i2796_1_, LivingEntity p_i2796_2_, double p_i2796_3_, double p_i2796_5_, double p_i2796_7_)
    {
        super(EntityType.FIREBALL, p_i2796_2_, p_i2796_3_, p_i2796_5_, p_i2796_7_, p_i2796_1_);
    }

    protected void onImpact(RayTraceResult result)
    {
        super.onImpact(result);

        if (!this.world.isRemote)
        {
            if (result.getType() == RayTraceResult.Type.ENTITY)
            {
                Entity entity = ((EntityRayTraceResult)result).getEntity();
                entity.attackEntityFrom(DamageSource.causeFireballDamage(this, this.shootingEntity), 6.0F);
                this.applyEnchantments(this.shootingEntity, entity);
            }

            boolean flag = this.world.getGameRules().getBoolean(GameRules.MOB_GRIEFING);
            this.world.createExplosion((Entity)null, this.getPosX(), this.getPosY(), this.getPosZ(), (float)this.explosionPower, flag, flag ? Explosion.Mode.DESTROY : Explosion.Mode.NONE);
            this.remove();
        }
    }

    public void writeAdditional(CompoundNBT compound)
    {
        super.writeAdditional(compound);
        compound.putInt("ExplosionPower", this.explosionPower);
    }

    public void readAdditional(CompoundNBT compound)
    {
        super.readAdditional(compound);

        if (compound.contains("ExplosionPower", 99))
        {
            this.explosionPower = compound.getInt("ExplosionPower");
        }
    }
}
