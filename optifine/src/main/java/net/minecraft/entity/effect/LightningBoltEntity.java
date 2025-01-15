package net.minecraft.entity.effect;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnGlobalEntityPacket;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class LightningBoltEntity extends Entity
{
    private int lightningState;
    public long boltVertex;
    private int boltLivingTime;
    private final boolean effectOnly;
    @Nullable
    private ServerPlayerEntity caster;

    public LightningBoltEntity(World p_i3464_1_, double p_i3464_2_, double p_i3464_4_, double p_i3464_6_, boolean p_i3464_8_)
    {
        super(EntityType.LIGHTNING_BOLT, p_i3464_1_);
        this.ignoreFrustumCheck = true;
        this.setLocationAndAngles(p_i3464_2_, p_i3464_4_, p_i3464_6_, 0.0F, 0.0F);
        this.lightningState = 2;
        this.boltVertex = this.rand.nextLong();
        this.boltLivingTime = this.rand.nextInt(3) + 1;
        this.effectOnly = p_i3464_8_;
        Difficulty difficulty = p_i3464_1_.getDifficulty();

        if (difficulty == Difficulty.NORMAL || difficulty == Difficulty.HARD)
        {
            this.igniteBlocks(4);
        }
    }

    public SoundCategory getSoundCategory()
    {
        return SoundCategory.WEATHER;
    }

    public void setCaster(@Nullable ServerPlayerEntity p_204809_1_)
    {
        this.caster = p_204809_1_;
    }

    public void tick()
    {
        super.tick();

        if (this.lightningState == 2)
        {
            this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ENTITY_LIGHTNING_BOLT_THUNDER, SoundCategory.WEATHER, 10000.0F, 0.8F + this.rand.nextFloat() * 0.2F);
            this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT, SoundCategory.WEATHER, 2.0F, 0.5F + this.rand.nextFloat() * 0.2F);
        }

        --this.lightningState;

        if (this.lightningState < 0)
        {
            if (this.boltLivingTime == 0)
            {
                this.remove();
            }
            else if (this.lightningState < -this.rand.nextInt(10))
            {
                --this.boltLivingTime;
                this.lightningState = 1;
                this.boltVertex = this.rand.nextLong();
                this.igniteBlocks(0);
            }
        }

        if (this.lightningState >= 0)
        {
            if (this.world.isRemote)
            {
                this.world.setTimeLightningFlash(2);
            }
            else if (!this.effectOnly)
            {
                double d0 = 3.0D;
                List<Entity> list = this.world.getEntitiesInAABBexcluding(this, new AxisAlignedBB(this.getPosX() - 3.0D, this.getPosY() - 3.0D, this.getPosZ() - 3.0D, this.getPosX() + 3.0D, this.getPosY() + 6.0D + 3.0D, this.getPosZ() + 3.0D), Entity::isAlive);

                for (Entity entity : list)
                {
                    entity.onStruckByLightning(this);
                }

                if (this.caster != null)
                {
                    CriteriaTriggers.CHANNELED_LIGHTNING.trigger(this.caster, list);
                }
            }
        }
    }

    private void igniteBlocks(int extraIgnitions)
    {
        if (!this.effectOnly && !this.world.isRemote && this.world.getGameRules().getBoolean(GameRules.DO_FIRE_TICK))
        {
            BlockState blockstate = Blocks.FIRE.getDefaultState();
            BlockPos blockpos = new BlockPos(this);

            if (this.world.getBlockState(blockpos).isAir() && blockstate.isValidPosition(this.world, blockpos))
            {
                this.world.setBlockState(blockpos, blockstate);
            }

            for (int i = 0; i < extraIgnitions; ++i)
            {
                BlockPos blockpos1 = blockpos.add(this.rand.nextInt(3) - 1, this.rand.nextInt(3) - 1, this.rand.nextInt(3) - 1);

                if (this.world.getBlockState(blockpos1).isAir() && blockstate.isValidPosition(this.world, blockpos1))
                {
                    this.world.setBlockState(blockpos1, blockstate);
                }
            }
        }
    }

    public boolean isInRangeToRenderDist(double distance)
    {
        double d0 = 64.0D * getRenderDistanceWeight();
        return distance < d0 * d0;
    }

    protected void registerData()
    {
    }

    protected void readAdditional(CompoundNBT compound)
    {
    }

    protected void writeAdditional(CompoundNBT compound)
    {
    }

    public IPacket<?> createSpawnPacket()
    {
        return new SSpawnGlobalEntityPacket(this);
    }
}
