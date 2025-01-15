package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.CreeperEntity;

public class CreeperSwellGoal extends Goal
{
    private final CreeperEntity swellingCreeper;
    private LivingEntity creeperAttackTarget;

    public CreeperSwellGoal(CreeperEntity p_i3205_1_)
    {
        this.swellingCreeper = p_i3205_1_;
        this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
    }

    public boolean shouldExecute()
    {
        LivingEntity livingentity = this.swellingCreeper.getAttackTarget();
        return this.swellingCreeper.getCreeperState() > 0 || livingentity != null && this.swellingCreeper.getDistanceSq(livingentity) < 9.0D;
    }

    public void startExecuting()
    {
        this.swellingCreeper.getNavigator().clearPath();
        this.creeperAttackTarget = this.swellingCreeper.getAttackTarget();
    }

    public void resetTask()
    {
        this.creeperAttackTarget = null;
    }

    public void tick()
    {
        if (this.creeperAttackTarget == null)
        {
            this.swellingCreeper.setCreeperState(-1);
        }
        else if (this.swellingCreeper.getDistanceSq(this.creeperAttackTarget) > 49.0D)
        {
            this.swellingCreeper.setCreeperState(-1);
        }
        else if (!this.swellingCreeper.getEntitySenses().canSee(this.creeperAttackTarget))
        {
            this.swellingCreeper.setCreeperState(-1);
        }
        else
        {
            this.swellingCreeper.setCreeperState(1);
        }
    }
}
