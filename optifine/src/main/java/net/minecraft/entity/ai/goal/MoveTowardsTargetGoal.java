package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.math.Vec3d;

public class MoveTowardsTargetGoal extends Goal
{
    private final CreatureEntity creature;
    private LivingEntity targetEntity;
    private double movePosX;
    private double movePosY;
    private double movePosZ;
    private final double speed;
    private final float maxTargetDistance;

    public MoveTowardsTargetGoal(CreatureEntity p_i3945_1_, double p_i3945_2_, float p_i3945_4_)
    {
        this.creature = p_i3945_1_;
        this.speed = p_i3945_2_;
        this.maxTargetDistance = p_i3945_4_;
        this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
    }

    public boolean shouldExecute()
    {
        this.targetEntity = this.creature.getAttackTarget();

        if (this.targetEntity == null)
        {
            return false;
        }
        else if (this.targetEntity.getDistanceSq(this.creature) > (double)(this.maxTargetDistance * this.maxTargetDistance))
        {
            return false;
        }
        else
        {
            Vec3d vec3d = RandomPositionGenerator.findRandomTargetBlockTowards(this.creature, 16, 7, this.targetEntity.getPositionVec());

            if (vec3d == null)
            {
                return false;
            }
            else
            {
                this.movePosX = vec3d.x;
                this.movePosY = vec3d.y;
                this.movePosZ = vec3d.z;
                return true;
            }
        }
    }

    public boolean shouldContinueExecuting()
    {
        return !this.creature.getNavigator().noPath() && this.targetEntity.isAlive() && this.targetEntity.getDistanceSq(this.creature) < (double)(this.maxTargetDistance * this.maxTargetDistance);
    }

    public void resetTask()
    {
        this.targetEntity = null;
    }

    public void startExecuting()
    {
        this.creature.getNavigator().tryMoveToXYZ(this.movePosX, this.movePosY, this.movePosZ, this.speed);
    }
}
