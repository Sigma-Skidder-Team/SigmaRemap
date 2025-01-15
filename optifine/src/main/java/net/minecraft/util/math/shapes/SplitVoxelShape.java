package net.minecraft.util.math.shapes;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.util.Direction;

public class SplitVoxelShape extends VoxelShape
{
    private final VoxelShape shape;
    private final Direction.Axis axis;
    private static final DoubleList field_223415_d = new DoubleRangeList(1);

    public SplitVoxelShape(VoxelShape p_i3748_1_, Direction.Axis p_i3748_2_, int p_i3748_3_)
    {
        super(makeShapePart(p_i3748_1_.part, p_i3748_2_, p_i3748_3_));
        this.shape = p_i3748_1_;
        this.axis = p_i3748_2_;
    }

    private static VoxelShapePart makeShapePart(VoxelShapePart shapePartIn, Direction.Axis axis, int p_197775_2_)
    {
        return new PartSplitVoxelShape(shapePartIn, axis.getCoordinate(p_197775_2_, 0, 0), axis.getCoordinate(0, p_197775_2_, 0), axis.getCoordinate(0, 0, p_197775_2_), axis.getCoordinate(p_197775_2_ + 1, shapePartIn.xSize, shapePartIn.xSize), axis.getCoordinate(shapePartIn.ySize, p_197775_2_ + 1, shapePartIn.ySize), axis.getCoordinate(shapePartIn.zSize, shapePartIn.zSize, p_197775_2_ + 1));
    }

    protected DoubleList getValues(Direction.Axis axis)
    {
        return axis == this.axis ? field_223415_d : this.shape.getValues(axis);
    }
}
