package net.minecraft.world;

import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public interface IWorldWriter
{
    boolean setBlockState(BlockPos pos, BlockState newState, int flags);

    boolean removeBlock(BlockPos pos, boolean isMoving);

default boolean destroyBlock(BlockPos pos, boolean dropBlock)
    {
        return this.destroyBlock(pos, dropBlock, (Entity)null);
    }

    boolean destroyBlock(BlockPos p_225521_1_, boolean p_225521_2_, @Nullable Entity p_225521_3_);

default boolean addEntity(Entity entityIn)
    {
        return false;
    }
}
