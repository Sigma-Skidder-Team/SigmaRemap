package net.minecraft.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.function.Function;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public class DefaultFlowersFeature extends FlowersFeature<BlockClusterFeatureConfig>
{
    public DefaultFlowersFeature(Function < Dynamic<?>, ? extends BlockClusterFeatureConfig > p_i4182_1_)
    {
        super(p_i4182_1_);
    }

    public boolean func_225559_a_(IWorld p_225559_1_, BlockPos p_225559_2_, BlockClusterFeatureConfig p_225559_3_)
    {
        return !p_225559_3_.field_227292_d_.contains(p_225559_1_.getBlockState(p_225559_2_));
    }

    public int func_225560_a_(BlockClusterFeatureConfig p_225560_1_)
    {
        return p_225560_1_.field_227293_f_;
    }

    public BlockPos getNearbyPos(Random p_225561_1_, BlockPos p_225561_2_, BlockClusterFeatureConfig p_225561_3_)
    {
        return p_225561_2_.add(p_225561_1_.nextInt(p_225561_3_.field_227294_g_) - p_225561_1_.nextInt(p_225561_3_.field_227294_g_), p_225561_1_.nextInt(p_225561_3_.field_227295_h_) - p_225561_1_.nextInt(p_225561_3_.field_227295_h_), p_225561_1_.nextInt(p_225561_3_.field_227296_i_) - p_225561_1_.nextInt(p_225561_3_.field_227296_i_));
    }

    public BlockState getFlowerToPlace(Random p_225562_1_, BlockPos p_225562_2_, BlockClusterFeatureConfig p_225562_3_)
    {
        return p_225562_3_.stateProvider.getBlockState(p_225562_1_, p_225562_2_);
    }
}
