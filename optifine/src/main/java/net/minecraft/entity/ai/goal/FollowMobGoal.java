package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.controller.LookController;
import net.minecraft.pathfinding.FlyingPathNavigator;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.pathfinding.PathNodeType;

public class FollowMobGoal extends Goal
{
    private final MobEntity entity;
    private final Predicate<MobEntity> followPredicate;
    private MobEntity followingEntity;
    private final double speedModifier;
    private final PathNavigator navigation;
    private int timeToRecalcPath;
    private final float stopDistance;
    private float oldWaterCost;
    private final float areaSize;

    public FollowMobGoal(MobEntity p_i1969_1_, double p_i1969_2_, float p_i1969_4_, float p_i1969_5_)
    {
        this.entity = p_i1969_1_;
        this.followPredicate = (p_210291_1_) ->
        {
            return p_210291_1_ != null && p_i1969_1_.getClass() != p_210291_1_.getClass();
        };
        this.speedModifier = p_i1969_2_;
        this.navigation = p_i1969_1_.getNavigator();
        this.stopDistance = p_i1969_4_;
        this.areaSize = p_i1969_5_;
        this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));

        if (!(p_i1969_1_.getNavigator() instanceof GroundPathNavigator) && !(p_i1969_1_.getNavigator() instanceof FlyingPathNavigator))
        {
            throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
        }
    }

    public boolean shouldExecute()
    {
        List<MobEntity> list = this.entity.world.getEntitiesWithinAABB(MobEntity.class, this.entity.getBoundingBox().grow((double)this.areaSize), this.followPredicate);

        if (!list.isEmpty())
        {
            for (MobEntity mobentity : list)
            {
                if (!mobentity.isInvisible())
                {
                    this.followingEntity = mobentity;
                    return true;
                }
            }
        }

        return false;
    }

    public boolean shouldContinueExecuting()
    {
        return this.followingEntity != null && !this.navigation.noPath() && this.entity.getDistanceSq(this.followingEntity) > (double)(this.stopDistance * this.stopDistance);
    }

    public void startExecuting()
    {
        this.timeToRecalcPath = 0;
        this.oldWaterCost = this.entity.getPathPriority(PathNodeType.WATER);
        this.entity.setPathPriority(PathNodeType.WATER, 0.0F);
    }

    public void resetTask()
    {
        this.followingEntity = null;
        this.navigation.clearPath();
        this.entity.setPathPriority(PathNodeType.WATER, this.oldWaterCost);
    }

    public void tick()
    {
        if (this.followingEntity != null && !this.entity.getLeashed())
        {
            this.entity.getLookController().setLookPositionWithEntity(this.followingEntity, 10.0F, (float)this.entity.getVerticalFaceSpeed());

            if (--this.timeToRecalcPath <= 0)
            {
                this.timeToRecalcPath = 10;
                double d0 = this.entity.getPosX() - this.followingEntity.getPosX();
                double d1 = this.entity.getPosY() - this.followingEntity.getPosY();
                double d2 = this.entity.getPosZ() - this.followingEntity.getPosZ();
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;

                if (!(d3 <= (double)(this.stopDistance * this.stopDistance)))
                {
                    this.navigation.tryMoveToEntityLiving(this.followingEntity, this.speedModifier);
                }
                else
                {
                    this.navigation.clearPath();
                    LookController lookcontroller = this.followingEntity.getLookController();

                    if (d3 <= (double)this.stopDistance || lookcontroller.getLookPosX() == this.entity.getPosX() && lookcontroller.getLookPosY() == this.entity.getPosY() && lookcontroller.getLookPosZ() == this.entity.getPosZ())
                    {
                        double d4 = this.followingEntity.getPosX() - this.entity.getPosX();
                        double d5 = this.followingEntity.getPosZ() - this.entity.getPosZ();
                        this.navigation.tryMoveToXYZ(this.entity.getPosX() - d4, this.entity.getPosY(), this.entity.getPosZ() - d5, this.speedModifier);
                    }
                }
            }
        }
    }
}
