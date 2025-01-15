package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.TameableEntity;

public class SitGoal extends Goal
{
    private final TameableEntity tameable;
    private boolean isSitting;

    public SitGoal(TameableEntity p_i1880_1_)
    {
        this.tameable = p_i1880_1_;
        this.setMutexFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
    }

    public boolean shouldContinueExecuting()
    {
        return this.isSitting;
    }

    public boolean shouldExecute()
    {
        if (!this.tameable.isTamed())
        {
            return false;
        }
        else if (this.tameable.isInWaterOrBubbleColumn())
        {
            return false;
        }
        else if (!this.tameable.onGround)
        {
            return false;
        }
        else
        {
            LivingEntity livingentity = this.tameable.getOwner();

            if (livingentity == null)
            {
                return true;
            }
            else
            {
                return this.tameable.getDistanceSq(livingentity) < 144.0D && livingentity.getRevengeTarget() != null ? false : this.isSitting;
            }
        }
    }

    public void startExecuting()
    {
        this.tameable.getNavigator().clearPath();
        this.tameable.setSitting(true);
    }

    public void resetTask()
    {
        this.tameable.setSitting(false);
    }

    public void setSitting(boolean sitting)
    {
        this.isSitting = sitting;
    }
}
