package net.minecraft.util.math;

import net.minecraft.entity.Entity;

public class EntityRayTraceResult extends RayTraceResult
{
    private final Entity entity;

    public EntityRayTraceResult(Entity p_i2939_1_)
    {
        this(p_i2939_1_, p_i2939_1_.getPositionVec());
    }

    public EntityRayTraceResult(Entity p_i2940_1_, Vec3d p_i2940_2_)
    {
        super(p_i2940_2_);
        this.entity = p_i2940_1_;
    }

    public Entity getEntity()
    {
        return this.entity;
    }

    public RayTraceResult.Type getType()
    {
        return RayTraceResult.Type.ENTITY;
    }
}
