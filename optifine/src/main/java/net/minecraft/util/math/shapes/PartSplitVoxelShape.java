package net.minecraft.util.math.shapes;

import net.minecraft.util.Direction;

public final class PartSplitVoxelShape extends VoxelShapePart
{
    private final VoxelShapePart part;
    private final int startX;
    private final int startY;
    private final int startZ;
    private final int endX;
    private final int endY;
    private final int endZ;

    protected PartSplitVoxelShape(VoxelShapePart p_i3036_1_, int p_i3036_2_, int p_i3036_3_, int p_i3036_4_, int p_i3036_5_, int p_i3036_6_, int p_i3036_7_)
    {
        super(p_i3036_5_ - p_i3036_2_, p_i3036_6_ - p_i3036_3_, p_i3036_7_ - p_i3036_4_);
        this.part = p_i3036_1_;
        this.startX = p_i3036_2_;
        this.startY = p_i3036_3_;
        this.startZ = p_i3036_4_;
        this.endX = p_i3036_5_;
        this.endY = p_i3036_6_;
        this.endZ = p_i3036_7_;
    }

    public boolean isFilled(int x, int y, int z)
    {
        return this.part.isFilled(this.startX + x, this.startY + y, this.startZ + z);
    }

    public void setFilled(int x, int y, int z, boolean expandBounds, boolean filled)
    {
        this.part.setFilled(this.startX + x, this.startY + y, this.startZ + z, expandBounds, filled);
    }

    public int getStart(Direction.Axis axis)
    {
        return Math.max(0, this.part.getStart(axis) - axis.getCoordinate(this.startX, this.startY, this.startZ));
    }

    public int getEnd(Direction.Axis axis)
    {
        return Math.min(axis.getCoordinate(this.endX, this.endY, this.endZ), this.part.getEnd(axis) - axis.getCoordinate(this.startX, this.startY, this.startZ));
    }
}
