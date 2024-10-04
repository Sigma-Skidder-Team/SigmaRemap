package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import lol.MovementUtils;

public class ViperMCSpeed extends Module {
    private int field24009;

    public ViperMCSpeed() {
        super(ModuleCategory.MOVEMENT, "ViperMC", "ViperMC speed");
    }

    @Override
    public void onEnable() {
        this.field24009 = 1;
    }

    @Override
    public void onDisable() {
        MovementUtils.strafe(0.28F);
        mc.timer.timerSpeed = 1.0F;
    }

    @EventTarget
    public void method16942(EventMove var1) {
        if (this.isEnabled()) {
            this.field24009++;
            float var4 = 0.28F + (float) MovementUtils.method37078() * 0.05F;
            if (this.field24009 >= 4) {
                this.field24009 = 0;
                var4 = 1.15F + (float) MovementUtils.method37078() * 0.04F;
            }

            if (mc.gameSettings.keyBindBack.pressed) {
                var4 /= 1.3F;
            }

            MovementUtils.setSpeed(var1, var4);
        }
    }
}
