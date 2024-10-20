package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import lol.MovementUtils;

public class MinemenSpeed extends Module {
    public MinemenSpeed() {
        super(ModuleCategory.MOVEMENT, "Minemen", "Speed for AGC");
    }

    @EventTarget
    @HigherPriority
    public void EventMove(EventMove event) {
        if (mc.player.onGround) {
            double calculatedSpeed = 0.3399 + (double) MovementUtils.method37078() * 0.06;
            if (mc.player.ticksExisted % 3 == 0) {
                calculatedSpeed = 0.679 + (double) MovementUtils.method37078() * 0.12;
            }

            MovementUtils.setSpeed(event, calculatedSpeed);
        }
    }
}
