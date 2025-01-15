package net.minecraft.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;

public class MegaPineTree extends HugeTreesFeature<HugeTreeFeatureConfig>
{
    public MegaPineTree(Function < Dynamic<?>, ? extends HugeTreeFeatureConfig > p_i2288_1_)
    {
        super(p_i2288_1_);
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
            this.func_227253_a_(p_225557_1_, p_225557_2_, p_225557_3_.getX(), p_225557_3_.getZ(), p_225557_3_.getY() + i, 0, p_225557_5_, p_225557_6_, p_225557_7_);
            this.func_227254_a_(p_225557_1_, p_225557_2_, p_225557_3_, i, p_225557_4_, p_225557_6_, p_225557_7_);
            return true;
        }
    }

    private void func_227253_a_(IWorldGenerationReader p_227253_1_, Random p_227253_2_, int p_227253_3_, int p_227253_4_, int p_227253_5_, int p_227253_6_, Set<BlockPos> p_227253_7_, MutableBoundingBox p_227253_8_, HugeTreeFeatureConfig p_227253_9_)
    {
        int i = p_227253_2_.nextInt(5) + p_227253_9_.field_227276_b_;
        int j = 0;

        for (int k = p_227253_5_ - i; k <= p_227253_5_; ++k)
        {
            int l = p_227253_5_ - k;
            int i1 = p_227253_6_ + MathHelper.floor((float)l / (float)i * 3.5F);
            this.func_227255_a_(p_227253_1_, p_227253_2_, new BlockPos(p_227253_3_, k, p_227253_4_), i1 + (l > 0 && i1 == j && (k & 1) == 0 ? 1 : 0), p_227253_7_, p_227253_8_, p_227253_9_);
            j = i1;
        }
    }
}
