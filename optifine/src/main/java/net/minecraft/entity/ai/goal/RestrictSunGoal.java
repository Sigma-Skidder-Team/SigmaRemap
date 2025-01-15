package net.minecraft.entity.ai.goal;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.pathfinding.GroundPathNavigator;

public class RestrictSunGoal extends Goal
{
    private final CreatureEntity entity;

    public RestrictSunGoal(CreatureEntity p_i3753_1_)
    {
        this.entity = p_i3753_1_;
    }

    public boolean shouldExecute()
    {
        return this.entity.world.isDaytime() && this.entity.getItemStackFromSlot(EquipmentSlotType.HEAD).isEmpty() && this.entity.getNavigator() instanceof GroundPathNavigator;
    }

    public void startExecuting()
    {
        ((GroundPathNavigator)this.entity.getNavigator()).setAvoidSun(true);
    }

    public void resetTask()
    {
        ((GroundPathNavigator)this.entity.getNavigator()).setAvoidSun(false);
    }
}
