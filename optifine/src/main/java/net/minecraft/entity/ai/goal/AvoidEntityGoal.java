package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import java.util.function.Predicate;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.math.Vec3d;

public class AvoidEntityGoal<T extends LivingEntity> extends Goal
{
    protected final CreatureEntity entity;
    private final double farSpeed;
    private final double nearSpeed;
    protected T avoidTarget;
    protected final float avoidDistance;
    protected Path path;
    protected final PathNavigator navigation;
    protected final Class<T> classToAvoid;
    protected final Predicate<LivingEntity> avoidTargetSelector;
    protected final Predicate<LivingEntity> field_203784_k;
    private final EntityPredicate builtTargetSelector;

    public AvoidEntityGoal(CreatureEntity p_i3002_1_, Class<T> p_i3002_2_, float p_i3002_3_, double p_i3002_4_, double p_i3002_6_)
    {
        this(p_i3002_1_, p_i3002_2_, (p_200828_0_) ->
        {
            return true;
        }, p_i3002_3_, p_i3002_4_, p_i3002_6_, EntityPredicates.CAN_AI_TARGET::test);
    }

    public AvoidEntityGoal(CreatureEntity p_i3003_1_, Class<T> p_i3003_2_, Predicate<LivingEntity> p_i3003_3_, float p_i3003_4_, double p_i3003_5_, double p_i3003_7_, Predicate<LivingEntity> p_i3003_9_)
    {
        this.entity = p_i3003_1_;
        this.classToAvoid = p_i3003_2_;
        this.avoidTargetSelector = p_i3003_3_;
        this.avoidDistance = p_i3003_4_;
        this.farSpeed = p_i3003_5_;
        this.nearSpeed = p_i3003_7_;
        this.field_203784_k = p_i3003_9_;
        this.navigation = p_i3003_1_.getNavigator();
        this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
        this.builtTargetSelector = (new EntityPredicate()).setDistance((double)p_i3003_4_).setCustomPredicate(p_i3003_9_.and(p_i3003_3_));
    }

    public AvoidEntityGoal(CreatureEntity p_i3004_1_, Class<T> p_i3004_2_, float p_i3004_3_, double p_i3004_4_, double p_i3004_6_, Predicate<LivingEntity> p_i3004_8_)
    {
        this(p_i3004_1_, p_i3004_2_, (p_203782_0_) ->
        {
            return true;
        }, p_i3004_3_, p_i3004_4_, p_i3004_6_, p_i3004_8_);
    }

    public boolean shouldExecute()
    {
        this.avoidTarget = this.entity.world.func_225318_b(this.classToAvoid, this.builtTargetSelector, this.entity, this.entity.getPosX(), this.entity.getPosY(), this.entity.getPosZ(), this.entity.getBoundingBox().grow((double)this.avoidDistance, 3.0D, (double)this.avoidDistance));

        if (this.avoidTarget == null)
        {
            return false;
        }
        else
        {
            Vec3d vec3d = RandomPositionGenerator.findRandomTargetBlockAwayFrom(this.entity, 16, 7, this.avoidTarget.getPositionVec());

            if (vec3d == null)
            {
                return false;
            }
            else if (this.avoidTarget.getDistanceSq(vec3d.x, vec3d.y, vec3d.z) < this.avoidTarget.getDistanceSq(this.entity))
            {
                return false;
            }
            else
            {
                this.path = this.navigation.getPathToPos(vec3d.x, vec3d.y, vec3d.z, 0);
                return this.path != null;
            }
        }
    }

    public boolean shouldContinueExecuting()
    {
        return !this.navigation.noPath();
    }

    public void startExecuting()
    {
        this.navigation.setPath(this.path, this.farSpeed);
    }

    public void resetTask()
    {
        this.avoidTarget = null;
    }

    public void tick()
    {
        if (this.entity.getDistanceSq(this.avoidTarget) < 49.0D)
        {
            this.entity.getNavigator().setSpeed(this.nearSpeed);
        }
        else
        {
            this.entity.getNavigator().setSpeed(this.farSpeed);
        }
    }
}
