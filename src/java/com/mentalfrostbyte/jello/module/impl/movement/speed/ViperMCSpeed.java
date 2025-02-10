package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.player.MovementUtil;

public class ViperMCSpeed extends Module {
    private int tickCounter;

    public ViperMCSpeed() {
        super(ModuleCategory.MOVEMENT, "ViperMC", "ViperMC speed");
    }

    @Override
    public void onEnable() {
        this.tickCounter = 1;
    }

    @Override
    public void onDisable() {
        MovementUtil.strafe(0.28F);
        mc.timer.timerSpeed = 1.0F;
    }

    @EventTarget
    public void EventMove(EventMove event) {
        if (this.isEnabled()) {
            this.tickCounter++;
            float speed = 0.28F + (float) MovementUtil.getSpeedBoost() * 0.05F;
            if (this.tickCounter >= 4) {
                this.tickCounter = 0;
                speed = 1.15F + (float) MovementUtil.getSpeedBoost() * 0.04F;
            }

            if (mc.gameSettings.keyBindBack.pressed) {
                speed /= 1.3F;
            }

            MovementUtil.setMotion(event, speed);
        }
    }
}
