package com.mentalfrostbyte.jello.module.impl.movement.spider;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventBlockCollision;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.*;
import net.minecraft.util.math.vector.Vector3d;

public class JumpSpider extends Module {
    private boolean field23832 = false;

    public JumpSpider() {
        super(ModuleCategory.MOVEMENT, "Jump", "Jump spider");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Spartan"));
        this.registerSetting(new BooleanSetting("AutoJump", "Automatically jumps for you", true));
    }

    @Override
    public void onEnable() {
        this.field23832 = false;
    }

    @EventTarget
    private void method16651(EventMove var1) {
        if (!mc.player.collidedHorizontally) {
            this.field23832 = false;
        } else if (!mc.player.onGround) {
            if (mc.player.getPositionVec().y != (double) ((int) mc.player.getPositionVec().y)) {
                if (var1.getY() < 0.0
                        && mc.player.getPositionVec().y + var1.getY() < (double) ((int) mc.player.getPositionVec().y)) {
                    var1.setY((double) ((int) mc.player.getPositionVec().y) - mc.player.getPositionVec().y);
                    this.field23832 = true;
                }
            } else if (this.getBooleanValueFromSettingName("AutoJump") || mc.gameSettings.keyBindJump.isKeyDown()) {
                mc.player.jump();
                var1.setY(mc.player.getMotion().y);
            } else if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
                MovementUtils.setSpeed(var1, 0.28 + (double) MovementUtils.method37078() * 0.05);
                var1.setY(0.0);
            } else {
                var1.setY(-0.0784);
            }
        } else if (this.getBooleanValueFromSettingName("AutoJump")) {
            mc.player.jump();
            var1.setY(mc.player.getMotion().y);
        }

        MultiUtilities.setPlayerYMotion(var1.getY());
    }

    @EventTarget
    private void method16652(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            Class9629 var4 = MultiUtilities.method17760(1.0E-4);
            String var5 = this.getStringSettingValueByName("Mode");
            if (this.getBooleanValueFromSettingName("Ceiling")
                    && !mc.player.onGround
                    && mc.world.getCollisionShapes(mc.player, mc.player.boundingBox.offset(0.0, 1.0E-6, 0.0)).count() > 0L) {
                var1.setY(var1.getY() + 4.9E-7);
            }

            if (var4 != null) {
                var1.method13908(true);
                double var6 = 0.0;
                switch (var5) {
                    case "AGC":
                        var6 = 4.85E-7;
                        break;
                    case "Spartan":
                        var6 = 1.0E-13;
                }

                if (this.field23832) {
                    if (this.getBooleanValueFromSettingName("AutoJump") || mc.gameSettings.keyBindJump.isKeyDown()) {
                        this.field23832 = !this.field23832;
                    }

                    var1.setGround(true);
                    switch (var5) {
                        case "AGC":
                            var6 = 4.85E-7;
                            break;
                        case "Spartan":
                            var6 = 1.0E-12;
                    }
                }

                if (((net.minecraft.util.Direction) var4.method37538()).getAxis() == Direction.X) {
                    var1.setX(
                            (double) Math.round((((Vector3d) var4.method37539()).x + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((net.minecraft.util.Direction) var4.method37538()).method539() * var6
                    );
                } else {
                    var1.setZ(
                            (double) Math.round((((Vector3d) var4.method37539()).z + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((net.minecraft.util.Direction) var4.method37538()).method541() * var6
                    );
                }
            }
        }
    }

    @EventTarget
    private void method16653(EventBlockCollision var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.getVoxelShape() != null
                    && !var1.getVoxelShape().isEmpty()
                    && var1.getVoxelShape().getBoundingBox().minY > mc.player.boundingBox.minY + 1.0) {
                var1.setCancelled(true);
            }
        }
    }
}
