package net.minecraft.entity.boss.dragon.phase;

import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.util.SoundEvents;

public class AttackingSittingPhase extends SittingPhase
{
    private int attackingTicks;

    public AttackingSittingPhase(EnderDragonEntity p_i2903_1_)
    {
        super(p_i2903_1_);
    }

    public void clientTick()
    {
        this.dragon.world.playSound(this.dragon.getPosX(), this.dragon.getPosY(), this.dragon.getPosZ(), SoundEvents.ENTITY_ENDER_DRAGON_GROWL, this.dragon.getSoundCategory(), 2.5F, 0.8F + this.dragon.getRNG().nextFloat() * 0.3F, false);
    }

    public void serverTick()
    {
        if (this.attackingTicks++ >= 40)
        {
            this.dragon.getPhaseManager().setPhase(PhaseType.SITTING_FLAMING);
        }
    }

    public void initPhase()
    {
        this.attackingTicks = 0;
    }

    public PhaseType<AttackingSittingPhase> getType()
    {
        return PhaseType.SITTING_ATTACKING;
    }
}
