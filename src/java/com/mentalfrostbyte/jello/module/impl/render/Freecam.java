package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mojang.authlib.GameProfile;
import mapped.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
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
    public void method16639(Class4410 var1) {
        if (this.isEnabled()) {
            if (var1.method13953() instanceof ClientPlayerEntity && var1.method13953() != field23814) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16640(Render2DEvent var1) {
        if (this.isEnabled()) {
            if (field23814 == null) {
                this.onEnable();
            }

            mc.player.field6123 = mc.player.rotationPitch;
            AxisAlignedBB var4 = mc.player.boundingBox;
            field23814.setPosition((var4.field28449 + var4.field28452) / 2.0, var4.field28450, (var4.field28451 + var4.field28454) / 2.0);
            double var5 = this.field23818 + (this.field23815 - this.field23818) * (double) var1.field21554;
            double var7 = this.field23819 + (this.field23816 - this.field23819) * (double) var1.field21554;
            double var9 = this.field23820 + (this.field23817 - this.field23820) * (double) var1.field21554;
            mc.player.positionVec.x = var5;
            mc.player.lastTickPosX = var5;
            mc.player.field4914 = var5;
            mc.player.prevPosX = var5;
            mc.player.positionVec.y = var7;
            mc.player.lastTickPosY = var7;
            mc.player.field4915 = var7;
            mc.player.prevPosY = var7;
            mc.player.positionVec.z = var9;
            mc.player.lastTickPosZ = var9;
            mc.player.field4916 = var9;
            mc.player.prevPosZ = var9;
            if (Class9567.method37087()) {
                mc.player.field4909 = 0.099999994F;
            }
        }
    }

    @EventTarget
    public void method16641(Render3DEvent var1) {
        if (this.isEnabled()) {
            field23814.method3239();
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
        field23814 = new Class1116(mc.world, var4);
        field23814.inventory = mc.player.inventory;
        field23814.method3269(this.field23815, this.field23816, this.field23817, this.field23821, this.field23822);
        field23814.noClip = true;
        field23814.entityCollisionReduction = mc.player.entityCollisionReduction;
        field23814.field4967 = this.field23821;
        field23814.field4968 = this.field23821;
        field23814.field4965 = this.field23821;
        field23814.field4966 = this.field23821;
        mc.world.method6846(this.field23823 = (int) (Math.random() * -10000.0), field23814);
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
        mc.world.method6848(this.field23823);
        mc.player.method3239();
        if (field23814 != null) {
            mc.player.entityCollisionReduction = field23814.entityCollisionReduction;
        }

        field23814 = null;
    }

    @EventTarget
    private void method16642(Class4425 var1) {
        if (this.isEnabled()) {
            var1.method13900(true);
        }
    }

    @EventTarget
    private void method16643(Class4430 var1) {
        if (this.isEnabled()) {
            if (var1.method13977() != mc.gameSettings.keyBindSneak.keycode.keyCode) {
                if (var1.method13977() != mc.gameSettings.keyBindJump.keycode.keyCode) {
                    if (var1.method13977() != mc.gameSettings.keyBindForward.keycode.keyCode) {
                        if (var1.method13977() != mc.gameSettings.keyBindBack.keycode.keyCode) {
                            if (var1.method13977() != mc.gameSettings.keyBindLeft.keycode.keyCode) {
                                if (var1.method13977() == mc.gameSettings.keyBindRight.keycode.keyCode) {
                                    var1.method13900(true);
                                    this.field23829 = true;
                                }
                            } else {
                                var1.method13900(true);
                                this.field23828 = true;
                            }
                        } else {
                            var1.method13900(true);
                            this.field23827 = true;
                        }
                    } else {
                        var1.method13900(true);
                        this.field23826 = true;
                    }
                } else {
                    var1.method13900(true);
                    this.field23830 = true;
                }
            } else {
                var1.method13900(true);
                this.field23831 = true;
            }

            this.field23825 = this.field23826 != this.field23827 ? (float) (!this.field23826 ? -1 : 1) : 0.0F;
            this.field23824 = this.field23828 != this.field23829 ? (float) (!this.field23828 ? -1 : 1) : 0.0F;
        }
    }

    @EventTarget
    private void method16644(Class4426 var1) {
        if (this.isEnabled()) {
            if (var1.method13973() != mc.gameSettings.keyBindSneak.keycode.keyCode) {
                if (var1.method13973() != mc.gameSettings.keyBindJump.keycode.keyCode) {
                    if (var1.method13973() != mc.gameSettings.keyBindForward.keycode.keyCode) {
                        if (var1.method13973() != mc.gameSettings.keyBindBack.keycode.keyCode) {
                            if (var1.method13973() != mc.gameSettings.keyBindLeft.keycode.keyCode) {
                                if (var1.method13973() == mc.gameSettings.keyBindRight.keycode.keyCode) {
                                    var1.method13900(true);
                                    this.field23829 = false;
                                }
                            } else {
                                var1.method13900(true);
                                this.field23828 = false;
                            }
                        } else {
                            var1.method13900(true);
                            this.field23827 = false;
                        }
                    } else {
                        var1.method13900(true);
                        this.field23826 = false;
                    }
                } else {
                    var1.method13900(true);
                    this.field23830 = false;
                }
            } else {
                var1.method13900(true);
                this.field23831 = false;
            }

            this.field23825 = this.field23826 != this.field23827 ? (float) (!this.field23826 ? -1 : 1) : 0.0F;
            this.field23824 = this.field23828 != this.field23829 ? (float) (!this.field23828 ? -1 : 1) : 0.0F;
        }
    }

    @EventTarget
    public void method16645(Class4436 var1) {
        if (this.isEnabled()) {
            var1.method13900(true);
        }
    }

    @EventTarget
    public void method16646(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            var1.method13918(this.field23821 % 360.0F);
            var1.method13916(this.field23822);
            mc.player.field6122 = this.field23821;
            mc.player.field6123 = this.field23822;
            float[] var4 = Class9567.method37084(this.field23825, this.field23824);
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
    private void method16647(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null) {
                if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                    SPlayerPositionLookPacket var4 = (SPlayerPositionLookPacket) var1.getPacket();
                    this.field23821 = var4.field24300;
                    this.field23822 = var4.field24301;
                    var4.field24300 = mc.player.rotationYaw;
                    var4.field24301 = mc.player.rotationPitch;
                    double var5 = var4.field24297;
                    double var7 = var4.field24298;
                    double var9 = var4.field24299;
                    float var11 = PlayerEntity.field4893.field39968;
                    float var12 = PlayerEntity.field4893.field39969;
                    mc.player
                            .method3391(new AxisAlignedBB(var5 - (double) var11, var7, var9 - (double) var11, var5 + (double) var11, var7 + (double) var12, var9 + (double) var11));
                    var1.method13900(true);
                    field23814.method3435(0.0, 0.0, 0.0);
                }
            }
        }
    }

    @EventTarget
    private void method16648(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.method13932() instanceof CAnimateHandPacket) {
                field23814.swingArm(Hand.MAIN_HAND);
            }

            if (var1.method13932() instanceof CUseEntityPacket) {
                CUseEntityPacket var4 = (CUseEntityPacket) var1.method13932();
                if (var4.getEntityFromWorld(mc.world) == null) {
                    var1.method13900(true);
                }
            }
        }
    }

    @EventTarget
    private void method16649(RenderFireEvent var1) {
        if (this.isEnabled()) {
            var1.method13900(true);
        }
    }

    @EventTarget
    private void method16650(WorldLoadEvent var1) {
        if (this.isEnabled()) {
            this.setState(false);
        }
    }
}
