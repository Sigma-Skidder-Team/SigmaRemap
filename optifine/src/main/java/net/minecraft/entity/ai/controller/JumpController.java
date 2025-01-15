package net.minecraft.entity.ai.controller;

import net.minecraft.entity.MobEntity;

public class JumpController
{
    private final MobEntity mob;
    protected boolean isJumping;

    public JumpController(MobEntity p_i2466_1_)
    {
        this.mob = p_i2466_1_;
    }

    public void setJumping()
    {
        this.isJumping = true;
    }

    public void tick()
    {
        this.mob.setJumping(this.isJumping);
        this.isJumping = false;
    }
}
