package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import java.util.function.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockStateMatcher;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class EatGrassGoal extends Goal
{
    private static final Predicate<BlockState> IS_GRASS = BlockStateMatcher.forBlock(Blocks.GRASS);
    private final MobEntity grassEaterEntity;
    private final World entityWorld;
    private int eatingGrassTimer;

    public EatGrassGoal(MobEntity p_i921_1_)
    {
        this.grassEaterEntity = p_i921_1_;
        this.entityWorld = p_i921_1_.world;
        this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK, Goal.Flag.JUMP));
    }

    public boolean shouldExecute()
    {
        if (this.grassEaterEntity.getRNG().nextInt(this.grassEaterEntity.isChild() ? 50 : 1000) != 0)
        {
            return false;
        }
        else
        {
            BlockPos blockpos = new BlockPos(this.grassEaterEntity);

            if (IS_GRASS.test(this.entityWorld.getBlockState(blockpos)))
            {
                return true;
            }
            else
            {
                return this.entityWorld.getBlockState(blockpos.down()).getBlock() == Blocks.GRASS_BLOCK;
            }
        }
    }

    public void startExecuting()
    {
        this.eatingGrassTimer = 40;
        this.entityWorld.setEntityState(this.grassEaterEntity, (byte)10);
        this.grassEaterEntity.getNavigator().clearPath();
    }

    public void resetTask()
    {
        this.eatingGrassTimer = 0;
    }

    public boolean shouldContinueExecuting()
    {
        return this.eatingGrassTimer > 0;
    }

    public int getEatingGrassTimer()
    {
        return this.eatingGrassTimer;
    }

    public void tick()
    {
        this.eatingGrassTimer = Math.max(0, this.eatingGrassTimer - 1);

        if (this.eatingGrassTimer == 4)
        {
            BlockPos blockpos = new BlockPos(this.grassEaterEntity);

            if (IS_GRASS.test(this.entityWorld.getBlockState(blockpos)))
            {
                if (this.entityWorld.getGameRules().getBoolean(GameRules.MOB_GRIEFING))
                {
                    this.entityWorld.destroyBlock(blockpos, false);
                }

                this.grassEaterEntity.eatGrassBonus();
            }
            else
            {
                BlockPos blockpos1 = blockpos.down();

                if (this.entityWorld.getBlockState(blockpos1).getBlock() == Blocks.GRASS_BLOCK)
                {
                    if (this.entityWorld.getGameRules().getBoolean(GameRules.MOB_GRIEFING))
                    {
                        this.entityWorld.playEvent(2001, blockpos1, Block.getStateId(Blocks.GRASS_BLOCK.getDefaultState()));
                        this.entityWorld.setBlockState(blockpos1, Blocks.DIRT.getDefaultState(), 2);
                    }

                    this.grassEaterEntity.eatGrassBonus();
                }
            }
        }
    }
}
