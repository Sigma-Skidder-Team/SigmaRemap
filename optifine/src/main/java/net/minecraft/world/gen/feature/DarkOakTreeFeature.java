package net.minecraft.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;

public class DarkOakTreeFeature extends AbstractTreeFeature<HugeTreeFeatureConfig>
{
    public DarkOakTreeFeature(Function < Dynamic<?>, ? extends HugeTreeFeatureConfig > p_i1900_1_)
    {
        super(p_i1900_1_);
    }

    public boolean func_225557_a_(IWorldGenerationReader p_225557_1_, Random p_225557_2_, BlockPos p_225557_3_, Set<BlockPos> p_225557_4_, Set<BlockPos> p_225557_5_, MutableBoundingBox p_225557_6_, HugeTreeFeatureConfig p_225557_7_)
    {
        int i = p_225557_2_.nextInt(3) + p_225557_2_.nextInt(2) + p_225557_7_.baseHeight;
        int j = p_225557_3_.getX();
        int k = p_225557_3_.getY();
        int l = p_225557_3_.getZ();

        if (k >= 1 && k + i + 1 < 256)
        {
            BlockPos blockpos = p_225557_3_.down();

            if (!isDirtOrGrassBlock(p_225557_1_, blockpos))
            {
                return false;
            }
            else if (!this.func_214615_a(p_225557_1_, p_225557_3_, i))
            {
                return false;
            }
            else
            {
                this.func_214584_a(p_225557_1_, blockpos);
                this.func_214584_a(p_225557_1_, blockpos.east());
                this.func_214584_a(p_225557_1_, blockpos.south());
                this.func_214584_a(p_225557_1_, blockpos.south().east());
                Direction direction = Direction.Plane.HORIZONTAL.random(p_225557_2_);
                int i1 = i - p_225557_2_.nextInt(4);
                int j1 = 2 - p_225557_2_.nextInt(3);
                int k1 = j;
                int l1 = l;
                int i2 = k + i - 1;

                for (int j2 = 0; j2 < i; ++j2)
                {
                    if (j2 >= i1 && j1 > 0)
                    {
                        k1 += direction.getXOffset();
                        l1 += direction.getZOffset();
                        --j1;
                    }

                    int k2 = k + j2;
                    BlockPos blockpos1 = new BlockPos(k1, k2, l1);

                    if (isAirOrLeaves(p_225557_1_, blockpos1))
                    {
                        this.func_227216_a_(p_225557_1_, p_225557_2_, blockpos1, p_225557_4_, p_225557_6_, p_225557_7_);
                        this.func_227216_a_(p_225557_1_, p_225557_2_, blockpos1.east(), p_225557_4_, p_225557_6_, p_225557_7_);
                        this.func_227216_a_(p_225557_1_, p_225557_2_, blockpos1.south(), p_225557_4_, p_225557_6_, p_225557_7_);
                        this.func_227216_a_(p_225557_1_, p_225557_2_, blockpos1.east().south(), p_225557_4_, p_225557_6_, p_225557_7_);
                    }
                }

                for (int j3 = -2; j3 <= 0; ++j3)
                {
                    for (int i4 = -2; i4 <= 0; ++i4)
                    {
                        int l4 = -1;
                        this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(k1 + j3, i2 + l4, l1 + i4), p_225557_5_, p_225557_6_, p_225557_7_);
                        this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(1 + k1 - j3, i2 + l4, l1 + i4), p_225557_5_, p_225557_6_, p_225557_7_);
                        this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(k1 + j3, i2 + l4, 1 + l1 - i4), p_225557_5_, p_225557_6_, p_225557_7_);
                        this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(1 + k1 - j3, i2 + l4, 1 + l1 - i4), p_225557_5_, p_225557_6_, p_225557_7_);

                        if ((j3 > -2 || i4 > -1) && (j3 != -1 || i4 != -2))
                        {
                            l4 = 1;
                            this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(k1 + j3, i2 + l4, l1 + i4), p_225557_5_, p_225557_6_, p_225557_7_);
                            this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(1 + k1 - j3, i2 + l4, l1 + i4), p_225557_5_, p_225557_6_, p_225557_7_);
                            this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(k1 + j3, i2 + l4, 1 + l1 - i4), p_225557_5_, p_225557_6_, p_225557_7_);
                            this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(1 + k1 - j3, i2 + l4, 1 + l1 - i4), p_225557_5_, p_225557_6_, p_225557_7_);
                        }
                    }
                }

                if (p_225557_2_.nextBoolean())
                {
                    this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(k1, i2 + 2, l1), p_225557_5_, p_225557_6_, p_225557_7_);
                    this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(k1 + 1, i2 + 2, l1), p_225557_5_, p_225557_6_, p_225557_7_);
                    this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(k1 + 1, i2 + 2, l1 + 1), p_225557_5_, p_225557_6_, p_225557_7_);
                    this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(k1, i2 + 2, l1 + 1), p_225557_5_, p_225557_6_, p_225557_7_);
                }

                for (int k3 = -3; k3 <= 4; ++k3)
                {
                    for (int j4 = -3; j4 <= 4; ++j4)
                    {
                        if ((k3 != -3 || j4 != -3) && (k3 != -3 || j4 != 4) && (k3 != 4 || j4 != -3) && (k3 != 4 || j4 != 4) && (Math.abs(k3) < 3 || Math.abs(j4) < 3))
                        {
                            this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(k1 + k3, i2, l1 + j4), p_225557_5_, p_225557_6_, p_225557_7_);
                        }
                    }
                }

                for (int l3 = -1; l3 <= 2; ++l3)
                {
                    for (int k4 = -1; k4 <= 2; ++k4)
                    {
                        if ((l3 < 0 || l3 > 1 || k4 < 0 || k4 > 1) && p_225557_2_.nextInt(3) <= 0)
                        {
                            int i5 = p_225557_2_.nextInt(3) + 2;

                            for (int l2 = 0; l2 < i5; ++l2)
                            {
                                this.func_227216_a_(p_225557_1_, p_225557_2_, new BlockPos(j + l3, i2 - l2 - 1, l + k4), p_225557_4_, p_225557_6_, p_225557_7_);
                            }

                            for (int j5 = -1; j5 <= 1; ++j5)
                            {
                                for (int i3 = -1; i3 <= 1; ++i3)
                                {
                                    this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(k1 + l3 + j5, i2, l1 + k4 + i3), p_225557_5_, p_225557_6_, p_225557_7_);
                                }
                            }

                            for (int k5 = -2; k5 <= 2; ++k5)
                            {
                                for (int l5 = -2; l5 <= 2; ++l5)
                                {
                                    if (Math.abs(k5) != 2 || Math.abs(l5) != 2)
                                    {
                                        this.func_227219_b_(p_225557_1_, p_225557_2_, new BlockPos(k1 + l3 + k5, i2 - 1, l1 + k4 + l5), p_225557_5_, p_225557_6_, p_225557_7_);
                                    }
                                }
                            }
                        }
                    }
                }

                return true;
            }
        }
        else
        {
            return false;
        }
    }

    private boolean func_214615_a(IWorldGenerationBaseReader p_214615_1_, BlockPos p_214615_2_, int p_214615_3_)
    {
        int i = p_214615_2_.getX();
        int j = p_214615_2_.getY();
        int k = p_214615_2_.getZ();
        BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

        for (int l = 0; l <= p_214615_3_ + 1; ++l)
        {
            int i1 = 1;

            if (l == 0)
            {
                i1 = 0;
            }

            if (l >= p_214615_3_ - 1)
            {
                i1 = 2;
            }

            for (int j1 = -i1; j1 <= i1; ++j1)
            {
                for (int k1 = -i1; k1 <= i1; ++k1)
                {
                    if (!func_214587_a(p_214615_1_, blockpos$mutable.setPos(i + j1, j + l, k + k1)))
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
