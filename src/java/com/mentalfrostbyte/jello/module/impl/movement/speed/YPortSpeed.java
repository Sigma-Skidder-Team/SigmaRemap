package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.MovementUtils;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class YPortSpeed extends Module {
    private boolean field23541;
    private double field23542;
    private double field23543;
    private double field23544;
    private int field23545;

    public YPortSpeed() {
        super(ModuleCategory.MOVEMENT, "YPort", "YPort speed");
        this.registerSetting(new ModeSetting("Mode", "YPort mode", 0, "NCP", "OldNCP"));
        this.registerSetting(new BooleanSetting("OnGround", "See yourself on ground", true));
    }

    @EventTarget
    public void method16235(EventUpdate var1) {
        if (this.isEnabled() && mc.player != null && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
            if (mc.player.onGround && var1.isPre() && MultiUtilities.isHypixel()) {
                var1.setY(var1.getY() + 1.0E-14);
            }
        }
    }

    @Override
    public void onEnable() {
        this.field23541 = false;
        this.field23545 = 0;
        this.field23543 = mc.player != null ? MovementUtils.getSpeed() : 0.2873;
        this.field23542 = mc.player.getPosY();
    }

    @Override
    public void onDisable() {
        this.field23541 = false;
        if (mc.player.getMotion().y > 0.33) {
            MultiUtilities.setPlayerYMotion(-0.43 + (double) MovementUtils.getJumpBoost() * 0.1);
            MovementUtils.strafe(MovementUtils.getSpeed());
        }
    }

    @EventTarget
    public void method16236(EventMove var1) {
        if (this.isEnabled() && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
            if (!mc.player.isJumping) {
                String var4 = this.getStringSettingValueByName("Mode");
                switch (var4) {
                    case "NCP":
                        if (MovementUtils.isMoving() && mc.player.onGround) {
                            mc.player.jump();
                            var1.setY(mc.player.getMotion().y);
                            MovementUtils.setSpeed(var1, 0.461);
                            this.field23541 = true;
                            mc.player.stepHeight = 0.5F;
                        } else if (this.field23541
                                && MultiUtilities.isAboveBounds(mc.player, (float) (MovementUtils.getJumpValue() + (double) MovementUtils.getJumpBoost() * 0.1 + 0.001F))) {
                            this.field23541 = !this.field23541;
                            MovementUtils.setSpeed(var1, 0.312);
                            var1.setY(-0.43 + (double) MovementUtils.getJumpBoost() * 0.1);
                            MultiUtilities.setPlayerYMotion(var1.getY());
                            mc.player.stepHeight = 0.0F;
                        } else if (this.field23541) {
                            var1.setY(-0.1);
                            this.field23541 = !this.field23541;
                        }
                        break;
                    case "OldNCP":
                        if (mc.player.onGround && MultiUtilities.method17686()) {
                            this.field23545 = 2;
                        }

                        if (this.field23545 == 1 && MultiUtilities.method17686()) {
                            this.field23545 = 2;
                            this.field23543 = 1.38 * MovementUtils.getSpeed() - 0.01;
                        } else if (this.field23545 == 2) {
                            this.field23545 = 3;
                            double var8 = 0.401448482 + 0.002 * Math.random();
                            var8 *= 1.0 + Math.sqrt((float) MovementUtils.getJumpBoost() / 2.0F) / 2.0;
                            var1.setY(var8);
                            this.field23543 *= 2.149;
                        } else if (this.field23545 == 3) {
                            this.field23545 = 4;
                            double var6 = 0.66 * (this.field23544 - MovementUtils.getSpeed());
                            this.field23543 = this.field23544 - var6;
                        } else {
                            if (mc.world
                                    .getCollisionShapes(
                                            mc.player, mc.player.boundingBox.offset(0.0, mc.player.getMotion().y, 0.0)
                                    )
                                    .count()
                                    > 0L
                                    || mc.player.collidedVertically) {
                                this.field23545 = 1;
                            }

                            this.field23543 = this.field23544 - this.field23544 / 159.0;
                        }

                        this.field23543 = Math.max(this.field23543, MovementUtils.getSpeed());
                        MovementUtils.setSpeed(var1, this.field23543);
                        mc.player.stepHeight = 0.6F;
                        MultiUtilities.setPlayerYMotion(var1.getY());
                }
            }
        }
    }

    @EventTarget
    private void method16237(EventWalkingUpdate var1) {
        if (this.isEnabled()
                && !this.getStringSettingValueByName("Mode").equalsIgnoreCase("NCP")
                && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
            if (!mc.player.isInWater() && !mc.player.isInLava() && !mc.player.isOnLadder()) {
                if (!mc.gameSettings.keyBindJump.pressed
                        && !mc.player.isOnLadder()
                        && !MovementUtils.isInWater()
                        && !mc.player.isInWater()
                        && MultiUtilities.isAboveBounds(mc.player, 1.0F)
                        && !mc.player.onGround
                        && this.field23545 == 3) {
                    MultiUtilities.setPlayerYMotion(-0.3994);
                }

                double var4 = mc.player.getPosX() - mc.player.prevPosX;
                double var6 = mc.player.getPosZ() - mc.player.prevPosZ;
                this.field23544 = Math.sqrt(var4 * var4 + var6 * var6);
            }
        }
    }

    @EventTarget
    public void method16238(Render2DEvent var1) {
        if (this.isEnabled()
                && MultiUtilities.isAboveBounds(mc.player, 0.43F)
                && !((double) mc.player.fallDistance > 0.09)
                && this.getBooleanValueFromSettingName("OnGround")
                && !mc.gameSettings.keyBindJump.pressed
                && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
            if (mc.player.onGround && MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
                this.field23542 = mc.player.getPosY();
            }

            mc.player.positionVec.y = this.field23542;
            mc.player.lastTickPosY = this.field23542;
            mc.player.chasingPosY = this.field23542;
            mc.player.prevPosY = this.field23542;
            if (MovementUtils.isMoving()) {
                mc.player.cameraYaw = 0.099999994F;
            }
        }
    }

    @EventTarget
    private void method16239(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                this.field23544 = 0.0;
            }
        }
    }
}
