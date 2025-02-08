package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import com.mojang.authlib.GameProfile;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import mapped.*;
import net.minecraft.client.entity.player.RemoteClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CUseEntityPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;

public class Freecam extends Module {
    public static PlayerEntity field23814;
    public float field23824;
    public float field23825;
    public boolean field23826;
    public boolean field23827;
    public boolean field23828;
    public boolean field23829;
    public boolean field23830;
    public boolean field23831;
    private double field23815;
    private double field23816;
    private double field23817;
    private double field23818;
    private double field23819;
    private double field23820;
    private float field23821;
    private float field23822;
    private int field23823;

    public Freecam() {
        super(ModuleCategory.RENDER, "Freecam", "Move client side but not server side");
        this.registerSetting(new NumberSetting<Float>("Speed", "Speed value", 4.0F, Float.class, 1.0F, 10.0F, 0.1F));
    }

    @EventTarget
    public void method16639(EventRenderEntity var1) {
        if (this.isEnabled()) {
            if (var1.method13953() instanceof ClientPlayerEntity && var1.method13953() != field23814) {
                var1.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void method16640(Render2DEvent var1) {
        if (this.isEnabled()) {
            if (field23814 == null) {
                this.onEnable();
            }

            mc.player.lastReportedPitch = mc.player.rotationPitch;
            AxisAlignedBB var4 = mc.player.boundingBox;
            field23814.setPosition((var4.minX + var4.maxX) / 2.0, var4.minY, (var4.minZ + var4.maxZ) / 2.0);
            double var5 = this.field23818 + (this.field23815 - this.field23818) * (double) var1.partialTicks;
            double var7 = this.field23819 + (this.field23816 - this.field23819) * (double) var1.partialTicks;
            double var9 = this.field23820 + (this.field23817 - this.field23820) * (double) var1.partialTicks;
            mc.player.positionVec.x = var5;
            mc.player.lastTickPosX = var5;
            mc.player.chasingPosX = var5;
            mc.player.prevPosX = var5;
            mc.player.positionVec.y = var7;
            mc.player.lastTickPosY = var7;
            mc.player.chasingPosY = var7;
            mc.player.prevPosY = var7;
            mc.player.positionVec.z = var9;
            mc.player.lastTickPosZ = var9;
            mc.player.chasingPosZ = var9;
            mc.player.prevPosZ = var9;
            if (MovementUtil.isMoving()) {
                mc.player.cameraYaw = 0.099999994F;
            }
        }
    }

    @EventTarget
    public void method16641(Render3DEvent var1) {
        if (this.isEnabled()) {
            field23814.resetPositionToBB();
            field23814.boundingBox = new AxisAlignedBB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void onEnable() {
        this.field23815 = mc.player.getPosX();
        this.field23816 = mc.player.getPosY();
        this.field23817 = mc.player.getPosZ();
        this.field23821 = mc.player.rotationYaw;
        this.field23822 = mc.player.rotationPitch;
        String var3 = mc.player.getName().getString();
        GameProfile var4 = new GameProfile(mc.player.getGameProfile().getId(), var3);
        field23814 = new RemoteClientPlayerEntity(mc.world, var4);
        field23814.inventory = mc.player.inventory;
        field23814.setPositionAndRotation(this.field23815, this.field23816, this.field23817, this.field23821, this.field23822);
        field23814.noClip = true;
        field23814.entityCollisionReduction = mc.player.entityCollisionReduction;
        field23814.rotationYawHead = this.field23821;
        field23814.prevRotationYawHead = this.field23821;
        field23814.renderYawOffset = this.field23821;
        field23814.prevRenderYawOffset = this.field23821;
        mc.world.addEntity(this.field23823 = (int) (Math.random() * -10000.0), field23814);
        this.field23826 = mc.gameSettings.keyBindForward.isKeyDown();
        this.field23827 = mc.gameSettings.keyBindBack.isKeyDown();
        this.field23828 = mc.gameSettings.keyBindLeft.isKeyDown();
        this.field23829 = mc.gameSettings.keyBindRight.isKeyDown();
        this.field23825 = this.field23826 != this.field23827 ? (float) (!this.field23826 ? -1 : 1) : 0.0F;
        this.field23824 = this.field23828 != this.field23829 ? (float) (!this.field23828 ? -1 : 1) : 0.0F;
        this.field23830 = mc.gameSettings.keyBindJump.isKeyDown();
        this.field23831 = mc.gameSettings.keyBindSneak.isKeyDown();
        mc.gameSettings.keyBindForward.pressed = false;
        mc.gameSettings.keyBindBack.pressed = false;
        mc.gameSettings.keyBindLeft.pressed = false;
        mc.gameSettings.keyBindRight.pressed = false;
        mc.gameSettings.keyBindJump.pressed = false;
        mc.gameSettings.keyBindSneak.pressed = false;
    }

    @Override
    public void onDisable() {
        mc.gameSettings.keyBindForward.pressed = this.field23826;
        mc.gameSettings.keyBindBack.pressed = this.field23827;
        mc.gameSettings.keyBindLeft.pressed = this.field23828;
        mc.gameSettings.keyBindRight.pressed = this.field23829;
        mc.gameSettings.keyBindJump.pressed = this.field23830;
        mc.gameSettings.keyBindSneak.pressed = this.field23831;
        mc.world.removeEntityFromWorld(this.field23823);
        mc.player.resetPositionToBB();
        if (field23814 != null) {
            mc.player.entityCollisionReduction = field23814.entityCollisionReduction;
        }

        field23814 = null;
    }

    @EventTarget
    private void method16642(EventPushBlock var1) {
        if (this.isEnabled()) {
            var1.setCancelled(true);
        }
    }

    @EventTarget
    private void method16643(EventKeyPress var1) {
        if (this.isEnabled()) {
            if (var1.getKey() != mc.gameSettings.keyBindSneak.keyCode.keyCode) {
                if (var1.getKey() != mc.gameSettings.keyBindJump.keyCode.keyCode) {
                    if (var1.getKey() != mc.gameSettings.keyBindForward.keyCode.keyCode) {
                        if (var1.getKey() != mc.gameSettings.keyBindBack.keyCode.keyCode) {
                            if (var1.getKey() != mc.gameSettings.keyBindLeft.keyCode.keyCode) {
                                if (var1.getKey() == mc.gameSettings.keyBindRight.keyCode.keyCode) {
                                    var1.setCancelled(true);
                                    this.field23829 = true;
                                }
                            } else {
                                var1.setCancelled(true);
                                this.field23828 = true;
                            }
                        } else {
                            var1.setCancelled(true);
                            this.field23827 = true;
                        }
                    } else {
                        var1.setCancelled(true);
                        this.field23826 = true;
                    }
                } else {
                    var1.setCancelled(true);
                    this.field23830 = true;
                }
            } else {
                var1.setCancelled(true);
                this.field23831 = true;
            }

            this.field23825 = this.field23826 != this.field23827 ? (float) (!this.field23826 ? -1 : 1) : 0.0F;
            this.field23824 = this.field23828 != this.field23829 ? (float) (!this.field23828 ? -1 : 1) : 0.0F;
        }
    }

    @EventTarget
    private void method16644(MouseHoverEvent var1) {
        if (this.isEnabled()) {
            if (var1.getMouseButton() != mc.gameSettings.keyBindSneak.keyCode.keyCode) {
                if (var1.getMouseButton() != mc.gameSettings.keyBindJump.keyCode.keyCode) {
                    if (var1.getMouseButton() != mc.gameSettings.keyBindForward.keyCode.keyCode) {
                        if (var1.getMouseButton() != mc.gameSettings.keyBindBack.keyCode.keyCode) {
                            if (var1.getMouseButton() != mc.gameSettings.keyBindLeft.keyCode.keyCode) {
                                if (var1.getMouseButton() == mc.gameSettings.keyBindRight.keyCode.keyCode) {
                                    var1.setCancelled(true);
                                    this.field23829 = false;
                                }
                            } else {
                                var1.setCancelled(true);
                                this.field23828 = false;
                            }
                        } else {
                            var1.setCancelled(true);
                            this.field23827 = false;
                        }
                    } else {
                        var1.setCancelled(true);
                        this.field23826 = false;
                    }
                } else {
                    var1.setCancelled(true);
                    this.field23830 = false;
                }
            } else {
                var1.setCancelled(true);
                this.field23831 = false;
            }

            this.field23825 = this.field23826 != this.field23827 ? (float) (!this.field23826 ? -1 : 1) : 0.0F;
            this.field23824 = this.field23828 != this.field23829 ? (float) (!this.field23828 ? -1 : 1) : 0.0F;
        }
    }

    @EventTarget
    public void method16645(JumpEvent var1) {
        if (this.isEnabled()) {
            var1.setCancelled(true);
        }
    }

    @EventTarget
    public void method16646(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            var1.setYaw(this.field23821 % 360.0F);
            var1.setPitch(this.field23822);
            mc.player.lastReportedYaw = this.field23821;
            mc.player.lastReportedPitch = this.field23822;
            float[] var4 = MovementUtil.getAdjustedStrafe(this.field23825, this.field23824);
            float var5 = var4[1];
            float var6 = var4[2];
            float var7 = var4[0];
            double var8 = Math.cos(Math.toRadians(var7));
            double var10 = Math.sin(Math.toRadians(var7));
            double var12 = this.getNumberValueBySettingName("Speed") / 2.0F;
            this.field23818 = this.field23815;
            this.field23820 = this.field23817;
            this.field23819 = this.field23816;
            this.field23815 += ((double) var5 * var8 + (double) var6 * var10) * var12;
            this.field23817 += ((double) var5 * var10 - (double) var6 * var8) * var12;
            if (this.field23830) {
                this.field23816 += var12;
            }

            if (this.field23831) {
                this.field23816 -= var12;
            }
        }
    }

    @EventTarget
    private void method16647(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null) {
                if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                    SPlayerPositionLookPacket var4 = (SPlayerPositionLookPacket) var1.getPacket();
                    this.field23821 = var4.yaw;
                    this.field23822 = var4.pitch;
                    var4.yaw = mc.player.rotationYaw;
                    var4.pitch = mc.player.rotationPitch;
                    double var5 = var4.x;
                    double var7 = var4.y;
                    double var9 = var4.z;
                    float var11 = PlayerEntity.STANDING_SIZE.width;
                    float var12 = PlayerEntity.STANDING_SIZE.height;
                    mc.player
                            .setBoundingBox(new AxisAlignedBB(var5 - (double) var11, var7, var9 - (double) var11, var5 + (double) var11, var7 + (double) var12, var9 + (double) var11));
                    var1.setCancelled(true);
                    field23814.setMotion(0.0, 0.0, 0.0);
                }
            }
        }
    }

    @EventTarget
    private void method16648(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof CAnimateHandPacket) {
                field23814.swingArm(Hand.MAIN_HAND);
            }

            if (var1.getPacket() instanceof CUseEntityPacket) {
                CUseEntityPacket var4 = (CUseEntityPacket) var1.getPacket();
                if (var4.getEntityFromWorld(mc.world) == null) {
                    var1.setCancelled(true);
                }
            }
        }
    }

    @EventTarget
    private void method16649(RenderFireEvent var1) {
        if (this.isEnabled()) {
            var1.setCancelled(true);
        }
    }

    @EventTarget
    private void method16650(WorldLoadEvent var1) {
        if (this.isEnabled()) {
            this.setState(false);
        }
    }
}
