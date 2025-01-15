package net.minecraft.entity.ai.brain.memory;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockPosWrapper;
import net.minecraft.util.math.IPosWrapper;
import net.minecraft.util.math.Vec3d;

public class WalkTarget
{
    private final IPosWrapper target;
    private final float speed;
    private final int distance;

    public WalkTarget(BlockPos p_i624_1_, float p_i624_2_, int p_i624_3_)
    {
        this(new BlockPosWrapper(p_i624_1_), p_i624_2_, p_i624_3_);
    }

    public WalkTarget(Vec3d p_i625_1_, float p_i625_2_, int p_i625_3_)
    {
        this(new BlockPosWrapper(new BlockPos(p_i625_1_)), p_i625_2_, p_i625_3_);
    }

    public WalkTarget(IPosWrapper p_i626_1_, float p_i626_2_, int p_i626_3_)
    {
        this.target = p_i626_1_;
        this.speed = p_i626_2_;
        this.distance = p_i626_3_;
    }

    public IPosWrapper getTarget()
    {
        return this.target;
    }

    public float getSpeed()
    {
        return this.speed;
    }

    public int getDistance()
    {
        return this.distance;
    }
}
