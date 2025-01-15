package net.minecraft.entity.boss.dragon.phase;

import javax.annotation.Nullable;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.util.math.Vec3d;

public class HoverPhase extends Phase
{
    private Vec3d targetLocation;

    public HoverPhase(EnderDragonEntity p_i2088_1_)
    {
        super(p_i2088_1_);
    }

    public void serverTick()
    {
        if (this.targetLocation == null)
        {
            this.targetLocation = this.dragon.getPositionVec();
        }
    }

    public boolean getIsStationary()
    {
        return true;
    }

    public void initPhase()
    {
        this.targetLocation = null;
    }

    public float getMaxRiseOrFall()
    {
        return 1.0F;
    }

    @Nullable
    public Vec3d getTargetLocation()
    {
        return this.targetLocation;
    }

    public PhaseType<HoverPhase> getType()
    {
        return PhaseType.HOVER;
    }
}
