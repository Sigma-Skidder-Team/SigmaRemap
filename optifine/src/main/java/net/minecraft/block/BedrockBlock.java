package net.minecraft.block;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class BedrockBlock extends Block
{
    public BedrockBlock(Block.Properties p_i3734_1_)
    {
        super(p_i3734_1_);
    }

    public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type)
    {
        return false;
    }
}
