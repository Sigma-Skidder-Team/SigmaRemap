package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;

public class LookAtWithoutMovingGoal extends LookAtGoal
{
    public LookAtWithoutMovingGoal(MobEntity p_i2526_1_, Class <? extends LivingEntity > p_i2526_2_, float p_i2526_3_, float p_i2526_4_)
    {
        super(p_i2526_1_, p_i2526_2_, p_i2526_3_, p_i2526_4_);
        this.setMutexFlags(EnumSet.of(Goal.Flag.LOOK, Goal.Flag.MOVE));
    }
}
