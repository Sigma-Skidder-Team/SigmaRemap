package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.passive.IronGolemEntity;

public class ShowVillagerFlowerGoal extends Goal
{
    private static final EntityPredicate field_220738_a = (new EntityPredicate()).setDistance(6.0D).allowFriendlyFire().allowInvulnerable();
    private final IronGolemEntity ironGolem;
    private VillagerEntity villager;
    private int lookTime;

    public ShowVillagerFlowerGoal(IronGolemEntity p_i804_1_)
    {
        this.ironGolem = p_i804_1_;
        this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
    }

    public boolean shouldExecute()
    {
        if (!this.ironGolem.world.isDaytime())
        {
            return false;
        }
        else if (this.ironGolem.getRNG().nextInt(8000) != 0)
        {
            return false;
        }
        else
        {
            this.villager = this.ironGolem.world.getClosestEntityWithinAABB(VillagerEntity.class, field_220738_a, this.ironGolem, this.ironGolem.getPosX(), this.ironGolem.getPosY(), this.ironGolem.getPosZ(), this.ironGolem.getBoundingBox().grow(6.0D, 2.0D, 6.0D));
            return this.villager != null;
        }
    }

    public boolean shouldContinueExecuting()
    {
        return this.lookTime > 0;
    }

    public void startExecuting()
    {
        this.lookTime = 400;
        this.ironGolem.setHoldingRose(true);
    }

    public void resetTask()
    {
        this.ironGolem.setHoldingRose(false);
        this.villager = null;
    }

    public void tick()
    {
        this.ironGolem.getLookController().setLookPositionWithEntity(this.villager, 30.0F, 30.0F);
        --this.lookTime;
    }
}
