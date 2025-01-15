package net.minecraft.util;

import net.minecraft.client.GameSettings;

public class MovementInputFromOptions extends MovementInput
{
    private final GameSettings gameSettings;

    public MovementInputFromOptions(GameSettings p_i1495_1_)
    {
        this.gameSettings = p_i1495_1_;
    }

    public void func_225607_a_(boolean p_225607_1_)
    {
        this.forwardKeyDown = this.gameSettings.keyBindForward.isKeyDown();
        this.backKeyDown = this.gameSettings.keyBindBack.isKeyDown();
        this.leftKeyDown = this.gameSettings.keyBindLeft.isKeyDown();
        this.rightKeyDown = this.gameSettings.keyBindRight.isKeyDown();
        this.moveForward = this.forwardKeyDown == this.backKeyDown ? 0.0F : (this.forwardKeyDown ? 1.0F : -1.0F);
        this.moveStrafe = this.leftKeyDown == this.rightKeyDown ? 0.0F : (this.leftKeyDown ? 1.0F : -1.0F);
        this.jump = this.gameSettings.keyBindJump.isKeyDown();
        this.field_228350_h_ = this.gameSettings.keyBindSneak.isKeyDown();

        if (p_225607_1_)
        {
            this.moveStrafe = (float)((double)this.moveStrafe * 0.3D);
            this.moveForward = (float)((double)this.moveForward * 0.3D);
        }
    }
}
