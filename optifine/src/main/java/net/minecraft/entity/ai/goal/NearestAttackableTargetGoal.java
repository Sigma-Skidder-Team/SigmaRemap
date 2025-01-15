package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;

public class NearestAttackableTargetGoal<T extends LivingEntity> extends TargetGoal
{
    protected final Class<T> targetClass;
    protected final int targetChance;
    protected LivingEntity nearestTarget;
    protected EntityPredicate targetEntitySelector;

    public NearestAttackableTargetGoal(MobEntity p_i902_1_, Class<T> p_i902_2_, boolean p_i902_3_)
    {
        this(p_i902_1_, p_i902_2_, p_i902_3_, false);
    }

    public NearestAttackableTargetGoal(MobEntity p_i903_1_, Class<T> p_i903_2_, boolean p_i903_3_, boolean p_i903_4_)
    {
        this(p_i903_1_, p_i903_2_, 10, p_i903_3_, p_i903_4_, (Predicate<LivingEntity>)null);
    }

    public NearestAttackableTargetGoal(MobEntity p_i904_1_, Class<T> p_i904_2_, int p_i904_3_, boolean p_i904_4_, boolean p_i904_5_, @Nullable Predicate<LivingEntity> p_i904_6_)
    {
        super(p_i904_1_, p_i904_4_, p_i904_5_);
        this.targetClass = p_i904_2_;
        this.targetChance = p_i904_3_;
        this.setMutexFlags(EnumSet.of(Goal.Flag.TARGET));
        this.targetEntitySelector = (new EntityPredicate()).setDistance(this.getTargetDistance()).setCustomPredicate(p_i904_6_);
    }

    public boolean shouldExecute()
    {
        if (this.targetChance > 0 && this.goalOwner.getRNG().nextInt(this.targetChance) != 0)
        {
            return false;
        }
        else
        {
            this.findNearestTarget();
            return this.nearestTarget != null;
        }
    }

    protected AxisAlignedBB getTargetableArea(double targetDistance)
    {
        return this.goalOwner.getBoundingBox().grow(targetDistance, 4.0D, targetDistance);
    }

    protected void findNearestTarget()
    {
        if (this.targetClass != PlayerEntity.class && this.targetClass != ServerPlayerEntity.class)
        {
            this.nearestTarget = this.goalOwner.world.<T>func_225318_b(this.targetClass, this.targetEntitySelector, this.goalOwner, this.goalOwner.getPosX(), this.goalOwner.getPosYEye(), this.goalOwner.getPosZ(), this.getTargetableArea(this.getTargetDistance()));
        }
        else
        {
            this.nearestTarget = this.goalOwner.world.getClosestPlayer(this.targetEntitySelector, this.goalOwner, this.goalOwner.getPosX(), this.goalOwner.getPosYEye(), this.goalOwner.getPosZ());
        }
    }

    public void startExecuting()
    {
        this.goalOwner.setAttackTarget(this.nearestTarget);
        super.startExecuting();
    }
}
