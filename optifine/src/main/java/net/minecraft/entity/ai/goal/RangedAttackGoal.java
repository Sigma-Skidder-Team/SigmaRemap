package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class RangedAttackGoal extends Goal
{
    private final MobEntity entityHost;
    private final IRangedAttackMob rangedAttackEntityHost;
    private LivingEntity attackTarget;
    private int rangedAttackTime = -1;
    private final double entityMoveSpeed;
    private int seeTime;
    private final int attackIntervalMin;
    private final int maxRangedAttackTime;
    private final float attackRadius;
    private final float maxAttackDistance;

    public RangedAttackGoal(IRangedAttackMob p_i3513_1_, double p_i3513_2_, int p_i3513_4_, float p_i3513_5_)
    {
        this(p_i3513_1_, p_i3513_2_, p_i3513_4_, p_i3513_4_, p_i3513_5_);
    }

    public RangedAttackGoal(IRangedAttackMob p_i3514_1_, double p_i3514_2_, int p_i3514_4_, int p_i3514_5_, float p_i3514_6_)
    {
        if (!(p_i3514_1_ instanceof LivingEntity))
        {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        else
        {
            this.rangedAttackEntityHost = p_i3514_1_;
            this.entityHost = (MobEntity)p_i3514_1_;
            this.entityMoveSpeed = p_i3514_2_;
            this.attackIntervalMin = p_i3514_4_;
            this.maxRangedAttackTime = p_i3514_5_;
            this.attackRadius = p_i3514_6_;
            this.maxAttackDistance = p_i3514_6_ * p_i3514_6_;
            this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
        }
    }

    public boolean shouldExecute()
    {
        LivingEntity livingentity = this.entityHost.getAttackTarget();

        if (livingentity != null && livingentity.isAlive())
        {
            this.attackTarget = livingentity;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean shouldContinueExecuting()
    {
        return this.shouldExecute() || !this.entityHost.getNavigator().noPath();
    }

    public void resetTask()
    {
        this.attackTarget = null;
        this.seeTime = 0;
        this.rangedAttackTime = -1;
    }

    public void tick()
    {
        double d0 = this.entityHost.getDistanceSq(this.attackTarget.getPosX(), this.attackTarget.getPosY(), this.attackTarget.getPosZ());
        boolean flag = this.entityHost.getEntitySenses().canSee(this.attackTarget);

        if (flag)
        {
            ++this.seeTime;
        }
        else
        {
            this.seeTime = 0;
        }

        if (!(d0 > (double)this.maxAttackDistance) && this.seeTime >= 5)
        {
            this.entityHost.getNavigator().clearPath();
        }
        else
        {
            this.entityHost.getNavigator().tryMoveToEntityLiving(this.attackTarget, this.entityMoveSpeed);
        }

        this.entityHost.getLookController().setLookPositionWithEntity(this.attackTarget, 30.0F, 30.0F);

        if (--this.rangedAttackTime == 0)
        {
            if (!flag)
            {
                return;
            }

            float f = MathHelper.sqrt(d0) / this.attackRadius;
            float lvt_5_1_ = MathHelper.clamp(f, 0.1F, 1.0F);
            this.rangedAttackEntityHost.attackEntityWithRangedAttack(this.attackTarget, lvt_5_1_);
            this.rangedAttackTime = MathHelper.floor(f * (float)(this.maxRangedAttackTime - this.attackIntervalMin) + (float)this.attackIntervalMin);
        }
        else if (this.rangedAttackTime < 0)
        {
            float f2 = MathHelper.sqrt(d0) / this.attackRadius;
            this.rangedAttackTime = MathHelper.floor(f2 * (float)(this.maxRangedAttackTime - this.attackIntervalMin) + (float)this.attackIntervalMin);
        }
    }
}
