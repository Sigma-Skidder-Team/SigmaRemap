package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.TameableEntity;

public class OwnerHurtByTargetGoal extends TargetGoal
{
    private final TameableEntity tameable;
    private LivingEntity attacker;
    private int timestamp;

    public OwnerHurtByTargetGoal(TameableEntity worldIn)
    {
        super(worldIn, false);
        this.tameable = worldIn;
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
                this.attacker = livingentity.getRevengeTarget();
                int i = livingentity.getRevengeTimer();
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
            this.timestamp = livingentity.getRevengeTimer();
        }

        super.startExecuting();
    }
}
