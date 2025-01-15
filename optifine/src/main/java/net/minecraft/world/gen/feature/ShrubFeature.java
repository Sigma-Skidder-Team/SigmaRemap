package net.minecraft.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.IWorldGenerationReader;

public class ShrubFeature extends AbstractTreeFeature<BaseTreeFeatureConfig>
{
    public ShrubFeature(Function < Dynamic<?>, ? extends BaseTreeFeatureConfig > p_i3799_1_)
    {
        super(p_i3799_1_);
    }

    public boolean func_225557_a_(IWorldGenerationReader p_225557_1_, Random p_225557_2_, BlockPos p_225557_3_, Set<BlockPos> p_225557_4_, Set<BlockPos> p_225557_5_, MutableBoundingBox p_225557_6_, BaseTreeFeatureConfig p_225557_7_)
    {
        p_225557_3_ = p_225557_1_.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, p_225557_3_).down();

        if (isDirtOrGrassBlock(p_225557_1_, p_225557_3_))
        {
            p_225557_3_ = p_225557_3_.up();
            this.func_227216_a_(p_225557_1_, p_225557_2_, p_225557_3_, p_225557_4_, p_225557_6_, p_225557_7_);

            for (int i = 0; i <= 2; ++i)
            {
                int j = 2 - i;

                for (int k = -j; k <= j; ++k)
                {
                    for (int l = -j; l <= j; ++l)
                    {
                        if (Math.abs(k) != j || Math.abs(l) != j || p_225557_2_.nextInt(2) != 0)
                        {
                            this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(k + p_225557_3_.getX(), i + p_225557_3_.getY(), l + p_225557_3_.getZ()), p_225557_5_, p_225557_6_, p_225557_7_);
                        }
                    }
                }
            }
        }

        return true;
    }
}
