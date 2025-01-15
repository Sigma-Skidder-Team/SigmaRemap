package net.minecraft.block.trees;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.HugeTreeFeatureConfig;

public abstract class BigTree extends Tree
{
    public boolean func_225545_a_(IWorld p_225545_1_, ChunkGenerator<?> p_225545_2_, BlockPos p_225545_3_, BlockState p_225545_4_, Random p_225545_5_)
    {
        for (int i = 0; i >= -1; --i)
        {
            for (int j = 0; j >= -1; --j)
            {
                if (canBigTreeSpawnAt(p_225545_4_, p_225545_1_, p_225545_3_, i, j))
                {
                    return this.func_227017_a_(p_225545_1_, p_225545_2_, p_225545_3_, p_225545_4_, p_225545_5_, i, j);
                }
            }
        }

        return super.func_225545_a_(p_225545_1_, p_225545_2_, p_225545_3_, p_225545_4_, p_225545_5_);
    }

    @Nullable
    protected abstract ConfiguredFeature < HugeTreeFeatureConfig, ? > getHugeTreeFeature(Random p_225547_1_);

    public boolean func_227017_a_(IWorld p_227017_1_, ChunkGenerator<?> p_227017_2_, BlockPos p_227017_3_, BlockState p_227017_4_, Random p_227017_5_, int p_227017_6_, int p_227017_7_)
    {
        ConfiguredFeature < HugeTreeFeatureConfig, ? > configuredfeature = this.getHugeTreeFeature(p_227017_5_);

        if (configuredfeature == null)
        {
            return false;
        }
        else
        {
            BlockState blockstate = Blocks.AIR.getDefaultState();
            p_227017_1_.setBlockState(p_227017_3_.add(p_227017_6_, 0, p_227017_7_), blockstate, 4);
            p_227017_1_.setBlockState(p_227017_3_.add(p_227017_6_ + 1, 0, p_227017_7_), blockstate, 4);
            p_227017_1_.setBlockState(p_227017_3_.add(p_227017_6_, 0, p_227017_7_ + 1), blockstate, 4);
            p_227017_1_.setBlockState(p_227017_3_.add(p_227017_6_ + 1, 0, p_227017_7_ + 1), blockstate, 4);

            if (configuredfeature.place(p_227017_1_, p_227017_2_, p_227017_5_, p_227017_3_.add(p_227017_6_, 0, p_227017_7_)))
            {
                return true;
            }
            else
            {
                p_227017_1_.setBlockState(p_227017_3_.add(p_227017_6_, 0, p_227017_7_), p_227017_4_, 4);
                p_227017_1_.setBlockState(p_227017_3_.add(p_227017_6_ + 1, 0, p_227017_7_), p_227017_4_, 4);
                p_227017_1_.setBlockState(p_227017_3_.add(p_227017_6_, 0, p_227017_7_ + 1), p_227017_4_, 4);
                p_227017_1_.setBlockState(p_227017_3_.add(p_227017_6_ + 1, 0, p_227017_7_ + 1), p_227017_4_, 4);
                return false;
            }
        }
    }

    public static boolean canBigTreeSpawnAt(BlockState blockUnder, IBlockReader worldIn, BlockPos pos, int xOffset, int zOffset)
    {
        Block block = blockUnder.getBlock();
        return block == worldIn.getBlockState(pos.add(xOffset, 0, zOffset)).getBlock() && block == worldIn.getBlockState(pos.add(xOffset + 1, 0, zOffset)).getBlock() && block == worldIn.getBlockState(pos.add(xOffset, 0, zOffset + 1)).getBlock() && block == worldIn.getBlockState(pos.add(xOffset + 1, 0, zOffset + 1)).getBlock();
    }
}
