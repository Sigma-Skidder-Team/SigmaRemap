package net.minecraft.entity.ai.goal;

import net.minecraft.entity.monster.ZombieEntity;

public class ZombieAttackGoal extends MeleeAttackGoal
{
    private final ZombieEntity zombie;
    private int raiseArmTicks;

    public ZombieAttackGoal(ZombieEntity p_i426_1_, double p_i426_2_, boolean p_i426_4_)
    {
        super(p_i426_1_, p_i426_2_, p_i426_4_);
        this.zombie = p_i426_1_;
    }

    public void startExecuting()
    {
        super.startExecuting();
        this.raiseArmTicks = 0;
    }

    public void resetTask()
    {
        super.resetTask();
        this.zombie.setAggroed(false);
    }

    public void tick()
    {
        super.tick();
        ++this.raiseArmTicks;

        if (this.raiseArmTicks >= 5 && this.attackTick < 10)
        {
            this.zombie.setAggroed(true);
        }
        else
        {
            this.zombie.setAggroed(false);
        }
    }
}
