package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigestPriority;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.world.Timer;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import lol.MovementUtils;
import mapped.*;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.CClickWindowPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

import java.util.ArrayList;
import java.util.List;

public class HypixelFly extends Module {
    private short field23559;
    private double field23560;
    private float field23561;
    private boolean field23562;
    private int field23563;
    private TimerUtil field23564;
    private List<Short> field23565 = new ArrayList<Short>();

    public HypixelFly() {
        super(ModuleCategory.MOVEMENT, "Hypixel", "Fly for Hypixel");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Fast", "NoDmg", "Funcraft"));
        this.registerSetting(new NumberSetting<Float>("Speed", "Fast and Funcraft speed", 1.0F, Float.class, 0.0F, 1.0F, 0.1F));
        this.registerSetting(new BooleanSetting("No Collision", "Prevents block collison.", true));
        this.registerSetting(new NumberSetting<Float>("Timer Boost", "Boost strength", 2.5F, Float.class, 1.0F, 3.0F, 0.1F));
        this.registerSetting(new NumberSetting<Float>("Timer Duration", "Boost duration", 0.3F, Float.class, 0.1F, 1.0F, 0.01F));
    }

    @Override
    public void onEnable() {
        String var3 = this.getStringSettingValueByName("Mode");
        this.field23561 = 1.0F;
        this.field23563 = -1;
        if (mc.player.onGround || MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
            this.field23561 = this.getNumberValueBySettingName("Timer Boost");
        }

        if (mc.player.onGround) {
            switch (var3) {
                case "Basic":
                    this.field23560 = 0.0;
                    this.field23562 = true;
                    break;
                case "Fast":
                    MultiUtilities.method17749(false);
                    this.field23562 = true;
                    break;
                case "NoDmg":
                    this.field23562 = true;
                    break;
                case "Funcraft":
                    this.field23562 = true;
            }

            this.field23563 = 0;
        } else {
            this.field23560 = 0.0;
            this.field23562 = false;
        }
    }

    @Override
    public void onDisable() {
        double var3 = MovementUtils.getSpeed();
        MovementUtils.strafe(var3 * 0.7);
        this.field23561 = 1.0F;
        mc.timer.timerSpeed = 1.0F;
        this.field23563 = -1;
    }

    @EventTarget
    @Class5631
    public void method16257(WorldLoadEvent var1) {
        this.field23559 = 0;
        this.field23564 = new TimerUtil();
        this.field23565 = null;
    }

    @EventTarget
    @LowestPriority
    @Class5631
    public void method16258(SendPacketEvent var1) {
        if (MultiUtilities.isHypixel()) {
            IPacket var4 = var1.getPacket();
            if (var4 instanceof CClickWindowPacket) {
                CClickWindowPacket var5 = (CClickWindowPacket) var4;
                this.field23559 = var5.getActionNumber();
            }
        }
    }

    @EventTarget
    @Class5631
    @HigestPriority
    public void method16259(ReceivePacketEvent var1) {
        if (mc.getConnection() != null && MultiUtilities.isHypixel()) {
            IPacket var4 = var1.getPacket();
            if (this.isEnabled()) {
                if (var4 instanceof SPlayerPositionLookPacket) {
                    this.access().toggle();
                }
            }
        }
    }

    @EventTarget
    @Class5631
    public void method16260(TickEvent var1) {
    }

    @EventTarget
    public void method16261(EventUpdate var1) {
        if (var1.isPre()) {
            for (double var7 : MultiUtilities.method17747()) {
                if ((double) ((int) var1.getY()) - var1.getY() + var7 == 0.0) {
                    var1.setGround(true);
                    break;
                }
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16262(EventMove var1) {
        String var4 = this.getStringSettingValueByName("Mode");
        float var5 = this.getNumberValueBySettingName("Timer Boost");
        this.field23561 = (float) ((double) this.field23561 - 0.01);
        if (this.field23561 < var5 - this.getNumberValueBySettingName("Timer Duration") || this.field23561 < 1.0F) {
            this.field23561 = 1.0F;
        }

        if (!Client.getInstance().getModuleManager().getModuleByClass(Timer.class).isEnabled()) {
            mc.timer.timerSpeed = this.field23561;
        }

        if (this.field23562) {
            double var28 = 0.64 - Math.random() * 1.0E-10;
            if (var4.equals("Funcraft")) {
                var28 -= 0.04;
            }

            switch (var4) {
                case "Basic":
                    this.field23562 = !this.field23562;
                    break;
                case "Fast":
                    var1.setY(MovementUtils.method37080());
                    MovementUtils.setSpeed(var1, var28);
                    this.field23562 = !this.field23562;
                    this.field23560 = 0.51 + (double) this.getNumberValueBySettingName("Speed") + 0.015 * (double) MovementUtils.method37078();
                    break;
                case "NoDmg":
                    var1.setY(MovementUtils.method37080());
                    MovementUtils.setSpeed(var1, var28);
                    this.field23562 = !this.field23562;
                    this.field23560 = var28 * 0.987;
                    break;
                case "Funcraft":
                    var1.setY(MovementUtils.method37080());
                    MovementUtils.setSpeed(var1, var28);
                    this.field23562 = !this.field23562;
                    this.field23560 = 0.51 + (double) this.getNumberValueBySettingName("Speed");
            }
        } else {
            if (var4.equals("NoDmg") && this.field23563 > 20) {
                this.field23560 = 0.0;
            }

            double var6 = 0.99375 - (double) this.field23563 * 1.0E-13;
            this.field23560 *= var6;
            if (mc.player.collidedHorizontally || mc.player.collidedVertically) {
                this.field23560 = 0.0;
            }

            double var10 = var4.equals("Basic") ? MovementUtils.method37076() : MovementUtils.method37076() - 0.008;
            if (this.field23560 < var10) {
                this.field23560 = var10;
            } else if (!MultiUtilities.method17686()) {
                this.field23560 = var10;
            }

            MovementUtils.setSpeed(var1, this.field23560);
            if (!mc.player.onGround || !MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
                this.field23563++;
                var1.setY(0.0);
                MultiUtilities.setPlayerYMotion(0.0);
                if (this.field23563 % 5 < 4) {
                    double var12 = mc.player.getPosX();
                    double var14 = mc.player.getPosY();
                    double var16 = mc.player.getPosZ();
                    mc.player.setPosition(var12, var14 + 1.0E-14, var16);
                }
            }

            Vector3d var18 = mc.player.getAllowedMovement(var1.getVector().add(0.0, -var1.getVector().getY(), 0.0));
            double var19 = Math.abs(Math.sqrt(var18.lengthSquared()) - this.field23560);
            boolean var21 = var19 < 1.0E-4;
            if (this.getBooleanValueFromSettingName("No Collision") && this.field23560 > var10) {
                List<Vector3d> var22 = new ArrayList();
                float var23 = MathHelper.method37792(MovementUtils.method37086());
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

                var1.setVector(var18);
                if (!var21 && mc.player.getPosY() % 1.0 > 0.1F && MovementUtils.isMoving()) {
                    for (Vector3d var25 : var22) {
                        var25.x = var25.x * this.field23560;
                        var25.z = var25.z * this.field23560;
                        double var26 = Math.abs(Math.sqrt(mc.player.getAllowedMovement(var25).lengthSquared()) - this.field23560);
                        var21 = var26 < 1.0E-4;
                        if (var21) {
                            var1.setVector(var25);
                            break;
                        }
                    }
                }
            }

            if (mc.gameSettings.keyBindJump.pressed) {
                var1.setY(0.25);
            }
        }
    }
}
