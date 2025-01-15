package net.minecraft.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;

public class MegaJungleFeature extends HugeTreesFeature<HugeTreeFeatureConfig>
{
    public MegaJungleFeature(Function < Dynamic<?>, ? extends HugeTreeFeatureConfig > p_i808_1_)
    {
        super(p_i808_1_);
    }

    public boolean func_225557_a_(IWorldGenerationReader p_225557_1_, Random p_225557_2_, BlockPos p_225557_3_, Set<BlockPos> p_225557_4_, Set<BlockPos> p_225557_5_, MutableBoundingBox p_225557_6_, HugeTreeFeatureConfig p_225557_7_)
    {
        int i = this.func_227256_a_(p_225557_2_, p_225557_7_);

        if (!this.func_203427_a(p_225557_1_, p_225557_3_, i))
        {
            return false;
        }
        else
        {
            this.func_227252_c_(p_225557_1_, p_225557_2_, p_225557_3_.up(i), 2, p_225557_5_, p_225557_6_, p_225557_7_);

            for (int j = p_225557_3_.getY() + i - 2 - p_225557_2_.nextInt(4); j > p_225557_3_.getY() + i / 2; j -= 2 + p_225557_2_.nextInt(4))
            {
                float f = p_225557_2_.nextFloat() * ((float)Math.PI * 2F);
                int k = p_225557_3_.getX() + (int)(0.5F + MathHelper.cos(f) * 4.0F);
                int l = p_225557_3_.getZ() + (int)(0.5F + MathHelper.sin(f) * 4.0F);

                for (int i1 = 0; i1 < 5; ++i1)
                {
                    k = p_225557_3_.getX() + (int)(1.5F + MathHelper.cos(f) * (float)i1);
                    l = p_225557_3_.getZ() + (int)(1.5F + MathHelper.sin(f) * (float)i1);
                    BlockPos blockpos = new BlockPos(k, j - 3 + i1 / 2, l);
                    this.func_227216_a_(p_225557_1_, p_225557_2_, blockpos, p_225557_4_, p_225557_6_, p_225557_7_);
                }

                int l1 = 1 + p_225557_2_.nextInt(2);
                int i2 = j;

                for (int j1 = j - l1; j1 <= i2; ++j1)
                {
                    int k1 = j1 - i2;
                    this.func_227257_b_(p_225557_1_, p_225557_2_, new BlockPos(k, j1, l), 1 - k1, p_225557_5_, p_225557_6_, p_225557_7_);
                }
            }

            this.func_227254_a_(p_225557_1_, p_225557_2_, p_225557_3_, i, p_225557_4_, p_225557_6_, p_225557_7_);
            return true;
        }
    }

    private void func_227252_c_(IWorldGenerationReader p_227252_1_, Random p_227252_2_, BlockPos p_227252_3_, int p_227252_4_, Set<BlockPos> p_227252_5_, MutableBoundingBox p_227252_6_, BaseTreeFeatureConfig p_227252_7_)
    {
        int i = 2;

        for (int j = -2; j <= 0; ++j)
        {
            this.func_227255_a_(p_227252_1_, p_227252_2_, p_227252_3_.up(j), p_227252_4_ + 1 - j, p_227252_5_, p_227252_6_, p_227252_7_);
        }
    }
}
