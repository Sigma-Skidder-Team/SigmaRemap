package net.minecraft.block;

import java.util.Random;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class TallFlowerBlock extends DoublePlantBlock implements IGrowable
{
    public TallFlowerBlock(Block.Properties p_i2755_1_)
    {
        super(p_i2755_1_);
    }

    public boolean isReplaceable(BlockState state, BlockItemUseContext useContext)
    {
        return false;
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
        spawnAsEntity(p_225535_1_, p_225535_3_, new ItemStack(this));
    }
}
