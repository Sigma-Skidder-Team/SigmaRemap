package net.minecraft.util;

import net.minecraft.util.math.Vec2f;

public class MovementInput
{
    public float moveStrafe;
    public float moveForward;
    public boolean forwardKeyDown;
    public boolean backKeyDown;
    public boolean leftKeyDown;
    public boolean rightKeyDown;
    public boolean jump;
    public boolean field_228350_h_;

    public void func_225607_a_(boolean p_225607_1_)
    {
    }

    public Vec2f getMoveVector()
    {
        return new Vec2f(this.moveStrafe, this.moveForward);
    }

    public boolean func_223135_b()
    {
        return this.moveForward > 1.0E-5F;
    }
}
