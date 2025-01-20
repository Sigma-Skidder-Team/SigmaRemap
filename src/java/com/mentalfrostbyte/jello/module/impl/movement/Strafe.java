package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.player.MovementUtils;

public class Strafe extends Module {
    private double currentSpeed; 
    private double lastSpeed;

    public Strafe() {
        super(ModuleCategory.MOVEMENT, "Strafe", "Strafe in mid air");
    }

    @EventTarget
    public void onMove(EventMove event) {
        if (this.isEnabled()) {
            lastSpeed = MovementUtils.getSpeed();
            float strafeDirection = MovementUtils.lenientStrafe()[1];
            float forwardDirection = MovementUtils.lenientStrafe()[2];
            float playerAngle = MovementUtils.method37086();

            double cosAngle = Math.cos(Math.toRadians(playerAngle));
            double sinAngle = Math.sin(Math.toRadians(playerAngle));

            double movementMagnitude = Math.sqrt(event.getX() * event.getX() + event.getZ() * event.getZ());
            if (!MovementUtils.isMoving()) {
                movementMagnitude = 0.0;
            }
            float smoothingFactor = 0.2F;

            if (!(movementMagnitude > currentSpeed + 0.1F)) {
                currentSpeed = movementMagnitude;

                if (movementMagnitude != 0.0) {
                    movementMagnitude = Math.max(movementMagnitude, MovementUtils.getSpeed());
                }

                event.setX(event.getX() * (1.0F - smoothingFactor) + movementMagnitude * cosAngle * smoothingFactor);
                event.setZ(event.getZ() * (1.0F - smoothingFactor) + movementMagnitude * sinAngle * smoothingFactor);
            } else {
                currentSpeed = movementMagnitude;
            }
        }
    }
}
