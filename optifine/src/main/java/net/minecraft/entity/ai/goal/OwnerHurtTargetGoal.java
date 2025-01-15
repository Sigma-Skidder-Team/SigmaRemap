package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.TameableEntity;

public class OwnerHurtTargetGoal extends TargetGoal
{
    private final TameableEntity tameable;
    private LivingEntity attacker;
    private int timestamp;

    public OwnerHurtTargetGoal(TameableEntity p_i785_1_)
    {
        super(p_i785_1_, false);
        this.tameable = p_i785_1_;
        this.setMutexFlags(EnumSet.of(Goal.Flag.TARGET));
    }

    public boolean shouldExecute()
    {
        if (this.tameable.isTamed() && !this.tameable.isSitting())
        {
            LivingEntity livingentity = this.tameable.getOwner();

            if (livingentity == null)
            {
                return false;
            }
            else
            {
                this.attacker = livingentity.getLastAttackedEntity();
                int i = livingentity.getLastAttackedEntityTime();
                return i != this.timestamp && this.isSuitableTarget(this.attacker, EntityPredicate.DEFAULT) && this.tameable.shouldAttackEntity(this.attacker, livingentity);
            }
        }
        else
        {
            return false;
        }
    }

    public void startExecuting()
    {
        this.goalOwner.setAttackTarget(this.attacker);
        LivingEntity livingentity = this.tameable.getOwner();

        if (livingentity != null)
        {
            this.timestamp = livingentity.getLastAttackedEntityTime();
        }

        super.startExecuting();
    }
}
