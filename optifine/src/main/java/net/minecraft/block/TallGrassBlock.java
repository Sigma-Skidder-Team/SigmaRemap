package net.minecraft.block;

import java.util.Random;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class TallGrassBlock extends BushBlock implements IGrowable
{
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

    protected TallGrassBlock(Block.Properties p_i2535_1_)
    {
        super(p_i2535_1_);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return SHAPE;
    }

    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient)
    {
        return true;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state)
    {
        return true;
    }

    public void grow(ServerWorld p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_)
    {
        DoublePlantBlock doubleplantblock = (DoublePlantBlock)(this == Blocks.FERN ? Blocks.LARGE_FERN : Blocks.TALL_GRASS);

        if (doubleplantblock.getDefaultState().isValidPosition(p_225535_1_, p_225535_3_) && p_225535_1_.isAirBlock(p_225535_3_.up()))
        {
            doubleplantblock.placeAt(p_225535_1_, p_225535_3_, 2);
        }
    }

    public Block.OffsetType getOffsetType()
    {
        return Block.OffsetType.XYZ;
    }
}
