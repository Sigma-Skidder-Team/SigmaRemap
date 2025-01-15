package net.minecraft.entity.ai.goal;

import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.player.PlayerEntity;

public class LookAtCustomerGoal extends LookAtGoal
{
    private final AbstractVillagerEntity villager;

    public LookAtCustomerGoal(AbstractVillagerEntity p_i782_1_)
    {
        super(p_i782_1_, PlayerEntity.class, 8.0F);
        this.villager = p_i782_1_;
    }

    public boolean shouldExecute()
    {
        if (this.villager.hasCustomer())
        {
            this.closestEntity = this.villager.getCustomer();
            return true;
        }
        else
        {
            return false;
        }
    }
}
