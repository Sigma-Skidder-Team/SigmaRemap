package net.minecraft.entity.ai.goal;

import net.minecraft.entity.MobEntity;

public class OpenDoorGoal extends InteractDoorGoal
{
    private final boolean closeDoor;
    private int closeDoorTemporisation;

    public OpenDoorGoal(MobEntity p_i3903_1_, boolean p_i3903_2_)
    {
        super(p_i3903_1_);
        this.entity = p_i3903_1_;
        this.closeDoor = p_i3903_2_;
    }

    public boolean shouldContinueExecuting()
    {
        return this.closeDoor && this.closeDoorTemporisation > 0 && super.shouldContinueExecuting();
    }

    public void startExecuting()
    {
        this.closeDoorTemporisation = 20;
        this.toggleDoor(true);
    }

    public void resetTask()
    {
        this.toggleDoor(false);
    }

    public void tick()
    {
        --this.closeDoorTemporisation;
        super.tick();
    }
}
