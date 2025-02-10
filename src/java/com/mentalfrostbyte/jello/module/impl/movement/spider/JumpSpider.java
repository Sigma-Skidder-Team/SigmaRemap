package com.mentalfrostbyte.jello.module.impl.movement.spider;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventBlockCollision;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import mapped.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3d;

public class JumpSpider extends Module {
    private boolean isJumping = false;

    public JumpSpider() {
        super(ModuleCategory.MOVEMENT, "Jump", "Jump spider");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Spartan"));
        this.registerSetting(new BooleanSetting("AutoJump", "Automatically jumps for you", true));
    }

    @Override
    public void onEnable() {
        this.isJumping = false;
    }

    @EventTarget
    private void EventMove(EventMove event) {
        if (!mc.player.collidedHorizontally) {
            this.isJumping = false;
        } else if (!mc.player.onGround) {
            if (mc.player.getPositionVec().y != (double) ((int) mc.player.getPositionVec().y)) {
                if (event.getY() < 0.0
                        && mc.player.getPositionVec().y + event.getY() < (double) ((int) mc.player.getPositionVec().y)) {
                    event.setY((double) ((int) mc.player.getPositionVec().y) - mc.player.getPositionVec().y);
                    this.isJumping = true;
                }
            } else if (this.getBooleanValueFromSettingName("AutoJump") || mc.gameSettings.keyBindJump.isKeyDown()) {
                mc.player.jump();
                event.setY(mc.player.getMotion().y);
            } else if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
                MovementUtil.setMotion(event, 0.28 + (double) MovementUtil.getSpeedBoost() * 0.05);
                event.setY(0.0);
            } else {
                event.setY(-0.0784);
            }
        } else if (this.getBooleanValueFromSettingName("AutoJump")) {
            mc.player.jump();
            event.setY(mc.player.getMotion().y);
        }

        MultiUtilities.setPlayerYMotion(event.getY());
    }

    @EventTarget
    private void EventUpdate(EventUpdate event) {
        if (this.isEnabled() && event.isPre()) {
            Class9629 var4 = MultiUtilities.method17760(1.0E-4);
            String mode = this.getStringSettingValueByName("Mode");
            if (this.getBooleanValueFromSettingName("Ceiling")
                    && !mc.player.onGround
                    && mc.world.getCollisionShapes(mc.player, mc.player.boundingBox.offset(0.0, 1.0E-6, 0.0)).count() > 0L) {
                event.setY(event.getY() + 4.9E-7);
            }

            if (var4 != null) {
                event.method13908(true);
                double movementOffset = 0.0;
                switch (mode) {
                    case "AGC":
                        movementOffset = 4.85E-7;
                        break;
                    case "Spartan":
                        movementOffset = 1.0E-13;
                }

                if (this.isJumping) {
                    if (this.getBooleanValueFromSettingName("AutoJump") || mc.gameSettings.keyBindJump.isKeyDown()) {
                        this.isJumping = !this.isJumping;
                    }

                    event.setGround(true);
                    switch (mode) {
                        case "AGC":
                            movementOffset = 4.85E-7;
                            break;
                        case "Spartan":
                            movementOffset = 1.0E-12;
                    }
                }

                if (((Direction) var4.method37538()).getAxis() == Direction.Axis.X) {
                    event.setX(
                            (double) Math.round((((Vector3d) var4.method37539()).x + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((Direction) var4.method37538()).getXOffset() * movementOffset
                    );
                } else {
                    event.setZ(
                            (double) Math.round((((Vector3d) var4.method37539()).z + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((Direction) var4.method37538()).getZOffset() * movementOffset
                    );
                }
            }
        }
    }

    @EventTarget
    private void EventBlockCollision(EventBlockCollision event) {
        if (this.isEnabled() && mc.player != null) {
            if (event.getVoxelShape() != null
                    && !event.getVoxelShape().isEmpty()
                    && event.getVoxelShape().getBoundingBox().minY > mc.player.boundingBox.minY + 1.0) {
                event.setCancelled(true);
            }
        }
    }
}
