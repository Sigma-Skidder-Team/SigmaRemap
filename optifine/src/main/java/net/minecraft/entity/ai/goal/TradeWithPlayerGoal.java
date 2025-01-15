package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.player.PlayerEntity;

public class TradeWithPlayerGoal extends Goal
{
    private final AbstractVillagerEntity villager;

    public TradeWithPlayerGoal(AbstractVillagerEntity p_i2339_1_)
    {
        this.villager = p_i2339_1_;
        this.setMutexFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
    }

    public boolean shouldExecute()
    {
        if (!this.villager.isAlive())
        {
            return false;
        }
        else if (this.villager.isInWater())
        {
            return false;
        }
        else if (!this.villager.onGround)
        {
            return false;
        }
        else if (this.villager.velocityChanged)
        {
            return false;
        }
        else
        {
            PlayerEntity playerentity = this.villager.getCustomer();

            if (playerentity == null)
            {
                return false;
            }
            else if (this.villager.getDistanceSq(playerentity) > 16.0D)
            {
                return false;
            }
            else
            {
                return playerentity.openContainer != null;
            }
        }
    }

    public void startExecuting()
    {
        this.villager.getNavigator().clearPath();
    }

    public void resetTask()
    {
        this.villager.setCustomer((PlayerEntity)null);
    }
}
