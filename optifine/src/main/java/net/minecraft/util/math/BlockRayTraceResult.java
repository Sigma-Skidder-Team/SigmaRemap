package net.minecraft.util.math;

import net.minecraft.util.Direction;

public class BlockRayTraceResult extends RayTraceResult
{
    private final Direction face;
    private final BlockPos pos;
    private final boolean isMiss;
    private final boolean inside;

    public static BlockRayTraceResult createMiss(Vec3d hitVec, Direction faceIn, BlockPos posIn)
    {
        return new BlockRayTraceResult(true, hitVec, faceIn, posIn, false);
    }

    public BlockRayTraceResult(Vec3d p_i570_1_, Direction p_i570_2_, BlockPos p_i570_3_, boolean p_i570_4_)
    {
        this(false, p_i570_1_, p_i570_2_, p_i570_3_, p_i570_4_);
    }

    private BlockRayTraceResult(boolean p_i571_1_, Vec3d p_i571_2_, Direction p_i571_3_, BlockPos p_i571_4_, boolean p_i571_5_)
    {
        super(p_i571_2_);
        this.isMiss = p_i571_1_;
        this.face = p_i571_3_;
        this.pos = p_i571_4_;
        this.inside = p_i571_5_;
    }

    public BlockRayTraceResult withFace(Direction newFace)
    {
        return new BlockRayTraceResult(this.isMiss, this.hitResult, newFace, this.pos, this.inside);
    }

    public BlockPos getPos()
    {
        return this.pos;
    }

    public Direction getFace()
    {
        return this.face;
    }

    public RayTraceResult.Type getType()
    {
        return this.isMiss ? RayTraceResult.Type.MISS : RayTraceResult.Type.BLOCK;
    }

    public boolean isInside()
    {
        return this.inside;
    }
}
