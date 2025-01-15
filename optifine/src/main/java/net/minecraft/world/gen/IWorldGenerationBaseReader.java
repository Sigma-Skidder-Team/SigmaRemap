package net.minecraft.world.gen;

import java.util.function.Predicate;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public interface IWorldGenerationBaseReader
{
    boolean hasBlockState(BlockPos p_217375_1_, Predicate<BlockState> p_217375_2_);

    BlockPos getHeight(Heightmap.Type heightmapType, BlockPos pos);
}
