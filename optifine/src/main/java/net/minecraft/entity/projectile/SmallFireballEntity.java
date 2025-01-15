package net.minecraft.entity.projectile;

import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class SmallFireballEntity extends AbstractFireballEntity
{
    public SmallFireballEntity(EntityType <? extends SmallFireballEntity > p_i1677_1_, World p_i1677_2_)
    {
        super(p_i1677_1_, p_i1677_2_);
    }

    public SmallFireballEntity(World p_i1678_1_, LivingEntity p_i1678_2_, double p_i1678_3_, double p_i1678_5_, double p_i1678_7_)
    {
        super(EntityType.SMALL_FIREBALL, p_i1678_2_, p_i1678_3_, p_i1678_5_, p_i1678_7_, p_i1678_1_);
    }

    public SmallFireballEntity(World p_i1679_1_, double p_i1679_2_, double p_i1679_4_, double p_i1679_6_, double p_i1679_8_, double p_i1679_10_, double p_i1679_12_)
    {
        super(EntityType.SMALL_FIREBALL, p_i1679_2_, p_i1679_4_, p_i1679_6_, p_i1679_8_, p_i1679_10_, p_i1679_12_, p_i1679_1_);
    }

    protected void onImpact(RayTraceResult result)
    {
        super.onImpact(result);

        if (!this.world.isRemote)
        {
            if (result.getType() == RayTraceResult.Type.ENTITY)
            {
                Entity entity = ((EntityRayTraceResult)result).getEntity();

                if (!entity.isImmuneToFire())
                {
                    int i = entity.getFireTimer();
                    entity.setFire(5);
                    boolean flag = entity.attackEntityFrom(DamageSource.causeFireballDamage(this, this.shootingEntity), 5.0F);

                    if (flag)
                    {
                        this.applyEnchantments(this.shootingEntity, entity);
                    }
                    else
                    {
                        entity.setFireTimer(i);
                    }
                }
            }
            else if (this.shootingEntity == null || !(this.shootingEntity instanceof MobEntity) || this.world.getGameRules().getBoolean(GameRules.MOB_GRIEFING))
            {
                BlockRayTraceResult blockraytraceresult = (BlockRayTraceResult)result;
                BlockPos blockpos = blockraytraceresult.getPos().offset(blockraytraceresult.getFace());

                if (this.world.isAirBlock(blockpos))
                {
                    this.world.setBlockState(blockpos, Blocks.FIRE.getDefaultState());
                }
            }

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
}
