package net.minecraft.entity.ai.goal;

import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.AbstractRaiderEntity;

public class NearestAttackableTargetExpiringGoal<T extends LivingEntity> extends NearestAttackableTargetGoal<T>
{
    private int field_220782_i = 0;

    public NearestAttackableTargetExpiringGoal(AbstractRaiderEntity p_i1993_1_, Class<T> p_i1993_2_, boolean p_i1993_3_, @Nullable Predicate<LivingEntity> p_i1993_4_)
    {
        super(p_i1993_1_, p_i1993_2_, 500, p_i1993_3_, false, p_i1993_4_);
    }

    public int func_220781_h()
    {
        return this.field_220782_i;
    }

    public void func_220780_j()
    {
        --this.field_220782_i;
    }

    public boolean shouldExecute()
    {
        if (this.field_220782_i <= 0 && this.goalOwner.getRNG().nextBoolean())
        {
            if (!((AbstractRaiderEntity)this.goalOwner).isRaidActive())
            {
                return false;
            }
            else
            {
                this.findNearestTarget();
                return this.nearestTarget != null;
            }
        }
        else
        {
            return false;
        }
    }

    public void startExecuting()
    {
        this.field_220782_i = 200;
        super.startExecuting();
    }
}
