package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import net.minecraft.entity.MobEntity;

public class LookRandomlyGoal extends Goal
{
    private final MobEntity idleEntity;
    private double lookX;
    private double lookZ;
    private int idleTime;

    public LookRandomlyGoal(MobEntity p_i3677_1_)
    {
        this.idleEntity = p_i3677_1_;
        this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
    }

    public boolean shouldExecute()
    {
        return this.idleEntity.getRNG().nextFloat() < 0.02F;
    }

    public boolean shouldContinueExecuting()
    {
        return this.idleTime >= 0;
    }

    public void startExecuting()
    {
        double d0 = (Math.PI * 2D) * this.idleEntity.getRNG().nextDouble();
        this.lookX = Math.cos(d0);
        this.lookZ = Math.sin(d0);
        this.idleTime = 20 + this.idleEntity.getRNG().nextInt(20);
    }

    public void tick()
    {
        --this.idleTime;
        this.idleEntity.getLookController().setLookPosition(this.idleEntity.getPosX() + this.lookX, this.idleEntity.getPosYEye(), this.idleEntity.getPosZ() + this.lookZ);
    }
}
