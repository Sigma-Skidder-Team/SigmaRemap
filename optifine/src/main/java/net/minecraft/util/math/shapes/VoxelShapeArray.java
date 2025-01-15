package net.minecraft.util.math.shapes;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import net.minecraft.util.Direction;
import net.minecraft.util.Util;

public final class VoxelShapeArray extends VoxelShape
{
    private final DoubleList xPoints;
    private final DoubleList yPoints;
    private final DoubleList zPoints;

    protected VoxelShapeArray(VoxelShapePart p_i4225_1_, double[] p_i4225_2_, double[] p_i4225_3_, double[] p_i4225_4_)
    {
        this(p_i4225_1_, (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(p_i4225_2_, p_i4225_1_.getXSize() + 1)), (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(p_i4225_3_, p_i4225_1_.getYSize() + 1)), (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(p_i4225_4_, p_i4225_1_.getZSize() + 1)));
    }

    VoxelShapeArray(VoxelShapePart p_i4226_1_, DoubleList p_i4226_2_, DoubleList p_i4226_3_, DoubleList p_i4226_4_)
    {
        super(p_i4226_1_);
        int i = p_i4226_1_.getXSize() + 1;
        int j = p_i4226_1_.getYSize() + 1;
        int k = p_i4226_1_.getZSize() + 1;

        if (i == p_i4226_2_.size() && j == p_i4226_3_.size() && k == p_i4226_4_.size())
        {
            this.xPoints = p_i4226_2_;
            this.yPoints = p_i4226_3_;
            this.zPoints = p_i4226_4_;
        }
        else
        {
            throw(IllegalArgumentException)Util.pauseDevMode(new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape."));
        }
    }

    protected DoubleList getValues(Direction.Axis axis)
    {
        switch (axis)
        {
            case X:
                return this.xPoints;

            case Y:
                return this.yPoints;

            case Z:
                return this.zPoints;

            default:
                throw new IllegalArgumentException();
        }
    }
}
