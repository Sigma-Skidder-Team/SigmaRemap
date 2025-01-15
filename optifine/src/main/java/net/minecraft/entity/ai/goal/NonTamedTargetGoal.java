package net.minecraft.entity.ai.goal;

import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.TameableEntity;

public class NonTamedTargetGoal<T extends LivingEntity> extends NearestAttackableTargetGoal<T>
{
    private final TameableEntity tameable;

    public NonTamedTargetGoal(TameableEntity p_i469_1_, Class<T> p_i469_2_, boolean p_i469_3_, @Nullable Predicate<LivingEntity> p_i469_4_)
    {
        super(p_i469_1_, p_i469_2_, 10, p_i469_3_, false, p_i469_4_);
        this.tameable = p_i469_1_;
    }

    public boolean shouldExecute()
    {
        return !this.tameable.isTamed() && super.shouldExecute();
    }

    public boolean shouldContinueExecuting()
    {
        return this.targetEntitySelector != null ? this.targetEntitySelector.canTarget(this.goalOwner, this.nearestTarget) : super.shouldContinueExecuting();
    }
}
