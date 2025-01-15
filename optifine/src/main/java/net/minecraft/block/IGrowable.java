package net.minecraft.block;

import java.util.Random;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public interface IGrowable
{
    boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient);

    boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state);

    void grow(ServerWorld p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_);
}
