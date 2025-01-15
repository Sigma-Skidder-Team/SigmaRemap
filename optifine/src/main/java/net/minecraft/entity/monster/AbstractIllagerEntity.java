package net.minecraft.entity.monster;

import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.World;

public abstract class AbstractIllagerEntity extends AbstractRaiderEntity
{
    protected AbstractIllagerEntity(EntityType <? extends AbstractIllagerEntity > p_i422_1_, World p_i422_2_)
    {
        super(p_i422_1_, p_i422_2_);
    }

    protected void registerGoals()
    {
        super.registerGoals();
    }

    public CreatureAttribute getCreatureAttribute()
    {
        return CreatureAttribute.ILLAGER;
    }

    public AbstractIllagerEntity.ArmPose getArmPose()
    {
        return AbstractIllagerEntity.ArmPose.CROSSED;
    }

    public static enum ArmPose
    {
        CROSSED,
        ATTACKING,
        SPELLCASTING,
        BOW_AND_ARROW,
        CROSSBOW_HOLD,
        CROSSBOW_CHARGE,
        CELEBRATING,
        NEUTRAL;
    }

    public class RaidOpenDoorGoal extends OpenDoorGoal
    {
        public RaidOpenDoorGoal(AbstractRaiderEntity p_i2667_2_)
        {
            super(p_i2667_2_, false);
        }

        public boolean shouldExecute()
        {
            return super.shouldExecute() && AbstractIllagerEntity.this.isRaidActive();
        }
    }
}
