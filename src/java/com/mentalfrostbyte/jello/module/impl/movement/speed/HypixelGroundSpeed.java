package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.JumpEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import lol.MovementUtils;

public class HypixelGroundSpeed extends Module {
    private double speedMultiplier;

    public HypixelGroundSpeed() {
        super(ModuleCategory.MOVEMENT, "HypixelGround", "Ground Speed for Hypixel");
        this.registerSetting(new BooleanSetting("Auto Jump", "Automatically jumps for you.", true));
    }

    @Override
    public void onEnable() {
        speedMultiplier = MovementUtils.getSpeed(); // Initialize speed
    }

    @Override
    public void onDisable() {
        // Reset player speed on disable
        mc.player.setSprinting(false);
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        // Automatically jump when on the ground if enabled
        if (mc.player.onGround && getBooleanValueFromSettingName("Auto Jump")) {
            mc.player.jump();
        }
    }

    @EventTarget
    public void onMove(EventMove event) {
        if (this.isEnabled() && mc.player != null) {
            double baseSpeed = MovementUtils.getSpeed();

            // Apply momentum logic
            if (mc.player.onGround) {
                // When on ground, set speed normally
                speedMultiplier = baseSpeed * 1.2; // Adjust speed multiplier as needed

                // Allow strafing while on ground
                MovementUtils.setSpeed(event, speedMultiplier);
            } else {
                // While in the air, maintain horizontal momentum but don't strafe
                event.setX(mc.player.getMotion().x);
                event.setZ(mc.player.getMotion().z);
                // Maintain the current speed without modifying it
                event.setY(mc.player.getMotion().y); // Preserve Y motion while in air
            }
        }
    }

    @EventTarget
    public void onJump(JumpEvent event) {
        if (this.isEnabled() && mc.player != null) {
            if (mc.player.onGround && getBooleanValueFromSettingName("Auto Jump")) {
                mc.player.jump();
                event.setCancelled(true); // Prevent default jump behavior if using Auto Jump
            }
        }
    }
}
