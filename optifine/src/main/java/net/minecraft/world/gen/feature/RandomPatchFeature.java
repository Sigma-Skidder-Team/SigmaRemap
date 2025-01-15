package net.minecraft.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.function.Function;
import net.minecraft.block.BlockState;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.Heightmap;

public class RandomPatchFeature extends Feature<BlockClusterFeatureConfig>
{
    public RandomPatchFeature(Function < Dynamic<?>, ? extends BlockClusterFeatureConfig > p_i1925_1_)
    {
        super(p_i1925_1_);
    }

    public boolean place(IWorld worldIn, ChunkGenerator <? extends GenerationSettings > generator, Random rand, BlockPos pos, BlockClusterFeatureConfig config)
    {
        BlockState blockstate = config.stateProvider.getBlockState(rand, pos);
        BlockPos blockpos;

        if (config.field_227298_k_)
        {
            blockpos = worldIn.getHeight(Heightmap.Type.WORLD_SURFACE_WG, pos);
        }
        else
        {
            blockpos = pos;
        }

        int i = 0;
        BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

        for (int j = 0; j < config.field_227293_f_; ++j)
        {
            blockpos$mutable.setPos(blockpos).move(rand.nextInt(config.field_227294_g_ + 1) - rand.nextInt(config.field_227294_g_ + 1), rand.nextInt(config.field_227295_h_ + 1) - rand.nextInt(config.field_227295_h_ + 1), rand.nextInt(config.field_227296_i_ + 1) - rand.nextInt(config.field_227296_i_ + 1));
            BlockPos blockpos1 = blockpos$mutable.down();
            BlockState blockstate1 = worldIn.getBlockState(blockpos1);

            if ((worldIn.isAirBlock(blockpos$mutable) || config.field_227297_j_ && worldIn.getBlockState(blockpos$mutable).getMaterial().isReplaceable()) && blockstate.isValidPosition(worldIn, blockpos$mutable) && (config.field_227291_c_.isEmpty() || config.field_227291_c_.contains(blockstate1.getBlock())) && !config.field_227292_d_.contains(blockstate1) && (!config.field_227299_l_ || worldIn.getFluidState(blockpos1.west()).isTagged(FluidTags.WATER) || worldIn.getFluidState(blockpos1.east()).isTagged(FluidTags.WATER) || worldIn.getFluidState(blockpos1.north()).isTagged(FluidTags.WATER) || worldIn.getFluidState(blockpos1.south()).isTagged(FluidTags.WATER)))
            {
                config.field_227290_b_.func_225567_a_(worldIn, blockpos$mutable, blockstate, rand);
                ++i;
            }
        }

        return i > 0;
    }
}
