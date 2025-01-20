package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.world.Timer;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.MovementUtils;
import mapped.*;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

import java.util.ArrayList;
import java.util.List;

public class HypixelFly extends Module {
    private double flySpeed;
    private float duration;
    private boolean grounded;
    private int field23563;

    public HypixelFly() {
        super(ModuleCategory.MOVEMENT, "Hypixel", "Fly for Hypixel");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Fast", "NoDmg", "Funcraft", "Fast"));
        this.registerSetting(new NumberSetting<Float>("Speed", "Fast and Funcraft speed", 1.0F, Float.class, 0.0F, 1.0F, 0.1F));
        this.registerSetting(new BooleanSetting("No Collision", "Prevents block collison.", true));
        this.registerSetting(new NumberSetting<Float>("Timer Boost", "Boost strength", 2.5F, Float.class, 1.0F, 3.0F, 0.1F));
        this.registerSetting(new NumberSetting<Float>("Timer Duration", "Boost duration", 0.3F, Float.class, 0.1F, 1.0F, 0.01F));
    }

    @Override
    public void onEnable() {
        String var3 = this.getStringSettingValueByName("Mode");
        this.duration = 1.0F;
        this.field23563 = -1;
        if (mc.player.onGround || MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
            this.duration = this.getNumberValueBySettingName("Timer Boost");
        }

        if (mc.player.onGround) {
            switch (var3) {
                case "Basic":
                    this.flySpeed = 0.0;
                    this.grounded = true;
                    break;
                case "Fast":
                    MultiUtilities.method17749(false);
                    this.grounded = true;
                    break;
                case "NoDmg":
                    this.grounded = true;
                    break;
                case "Funcraft":
                    this.grounded = true;
            }

            this.field23563 = 0;
        } else {
            this.flySpeed = 0.0;
            this.grounded = false;
        }
    }

    @Override
    public void onDisable() {
        double var3 = MovementUtils.getSpeed();
        MovementUtils.strafe(var3 * 0.7);
        this.duration = 1.0F;
        mc.timer.timerSpeed = 1.0F;
        this.field23563 = -1;
    }

    @EventTarget
    @Class5631
    @HigestPriority
    public void onReceive(ReceivePacketEvent event) {
        if (mc.getConnection() != null && MultiUtilities.isHypixel()) {
            IPacket pack = event.getPacket();
            if (this.isEnabled()) {
                if (pack instanceof SPlayerPositionLookPacket) {
                    this.access().toggle();
                }
            }
        }
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        if (event.isPre()) {
            for (double var7 : MultiUtilities.method17747()) {
                if ((double) ((int) event.getY()) - event.getY() + var7 == 0.0) {
                    event.setGround(true);
                    break;
                }
            }

            event.method13908(true);
        }
    }

    @EventTarget
    public void onMove(EventMove event) {
        String curMode = this.getStringSettingValueByName("Mode");
        float boost = this.getNumberValueBySettingName("Timer Boost");
        this.duration = (float) ((double) this.duration - 0.01);
        if (this.duration < boost - this.getNumberValueBySettingName("Timer Duration") || this.duration < 1.0F) {
            this.duration = 1.0F;
        }

        if (!Client.getInstance().moduleManager.getModuleByClass(Timer.class).isEnabled()) {
            mc.timer.timerSpeed = this.duration;
        }

        if (this.grounded) {
            double var28 = 0.64 - Math.random() * 1.0E-10;
            if (curMode.equals("Funcraft")) {
                var28 -= 0.04;
            }

            switch (curMode) {
                case "Basic":
                    this.grounded = !this.grounded;
                    break;
                case "Fast":
                    event.setY(MovementUtils.getJumpValue());
                    MovementUtils.setSpeed(event, var28);
                    this.grounded = !this.grounded;
                    this.flySpeed = 0.51 + (double) this.getNumberValueBySettingName("Speed") + 0.015 * (double) MovementUtils.getSpeedBoost();
                    break;
                case "NoDmg":
                    event.setY(MovementUtils.getJumpValue());
                    MovementUtils.setSpeed(event, var28);
                    this.grounded = !this.grounded;
                    this.flySpeed = var28 * 0.987;
                    break;
                case "Funcraft":
                    event.setY(MovementUtils.getJumpValue());
                    MovementUtils.setSpeed(event, var28);
                    this.grounded = !this.grounded;
                    this.flySpeed = 0.51 + (double) this.getNumberValueBySettingName("Speed");
            }
        } else {
            if (curMode.equals("NoDmg") && this.field23563 > 20) {
                this.flySpeed = 0.0;
            }

            double var6 = 0.99375 - (double) this.field23563 * 1.0E-13;
            this.flySpeed *= var6;
            if (mc.player.collidedHorizontally || mc.player.collidedVertically) {
                this.flySpeed = 0.0;
            }

            double var10 = curMode.equals("Basic") ? MovementUtils.method37076() : MovementUtils.method37076() - 0.008;
            if (this.flySpeed < var10) {
                this.flySpeed = var10;
            } else if (!MultiUtilities.method17686()) {
                this.flySpeed = var10;
            }

            MovementUtils.setSpeed(event, this.flySpeed);
            if (!mc.player.onGround || !MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
                this.field23563++;
                event.setY(0.0);
                MultiUtilities.setPlayerYMotion(0.0);
                if (this.field23563 % 5 < 4) {
                    double var12 = mc.player.getPosX();
                    double var14 = mc.player.getPosY();
                    double var16 = mc.player.getPosZ();
                    mc.player.setPosition(var12, var14 + 1.0E-14, var16);
                }
            }

            Vector3d allowedMovement = mc.player.getAllowedMovement(event.getVector().add(0.0, -event.getVector().getY(), 0.0));
            double var19 = Math.abs(Math.sqrt(allowedMovement.lengthSquared()) - this.flySpeed);
            boolean var21 = var19 < 1.0E-4;
            if (this.getBooleanValueFromSettingName("No Collision") && this.flySpeed > var10) {
                List<Vector3d> var22 = new ArrayList();
                float var23 = MathHelper.wrapDegrees(MovementUtils.method37086());
                if (var23 > 0.0F && var23 < 90.0F) {
                    var22.add(new Vector3d(1.0, 0.0, 0.0));
                    var22.add(new Vector3d(0.0, 0.0, 1.0));
                    var22.add(new Vector3d(0.0, 0.0, -1.0));
                    var22.add(new Vector3d(-1.0, 0.0, 0.0));
                } else if (var23 > 90.0F && var23 < 180.0F) {
                    var22.add(new Vector3d(0.0, 0.0, 1.0));
                    var22.add(new Vector3d(-1.0, 0.0, 0.0));
                    var22.add(new Vector3d(0.0, 0.0, -1.0));
                    var22.add(new Vector3d(1.0, 0.0, 0.0));
                } else if (var23 > -180.0F && var23 < -90.0F) {
                    var22.add(new Vector3d(0.0, 0.0, -1.0));
                    var22.add(new Vector3d(-1.0, 0.0, 0.0));
                    var22.add(new Vector3d(1.0, 0.0, 0.0));
                    var22.add(new Vector3d(0.0, 0.0, 1.0));
                } else {
                    var22.add(new Vector3d(0.0, 0.0, -1.0));
                    var22.add(new Vector3d(1.0, 0.0, 0.0));
                    var22.add(new Vector3d(0.0, 0.0, 1.0));
                    var22.add(new Vector3d(-1.0, 0.0, 0.0));
                }

                event.setVector(allowedMovement);
                if (!var21 && mc.player.getPosY() % 1.0 > 0.1F && MovementUtils.isMoving()) {
                    for (Vector3d var25 : var22) {
                        var25.x = var25.x * this.flySpeed;
                        var25.z = var25.z * this.flySpeed;
                        double var26 = Math.abs(Math.sqrt(mc.player.getAllowedMovement(var25).lengthSquared()) - this.flySpeed);
                        var21 = var26 < 1.0E-4;
                        if (var21) {
                            event.setVector(var25);
                            break;
                        }
                    }
                }
            }

            if (mc.gameSettings.keyBindJump.pressed) {
                event.setY(0.25);
            }
        }
    }
}
