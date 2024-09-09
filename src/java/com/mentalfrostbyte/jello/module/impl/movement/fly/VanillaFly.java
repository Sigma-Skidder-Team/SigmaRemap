package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.MouseHoverEvent;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import mapped.*;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class VanillaFly extends Module {
    private boolean field23995;
    private int field23996;

    public VanillaFly() {
        super(ModuleCategory.MOVEMENT, "Vanilla", "Regular vanilla fly");
        this.registerSetting(new NumberSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.28F, 10.0F, 0.01F));
        this.registerSetting(new BooleanSetting("Kick bypass", "Bypass vanilla kick for flying", true));
    }

    @Override
    public void onEnable() {
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
                this.field23995 = false;
            }
        } else {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23995 = true;
        }
    }

    @Override
    public void onDisable() {
        ColorUtils.method17725(-0.08);
        double var3 = MovementUtils.method37075();
        MovementUtils.method37090(var3);
        if (this.field23995) {
            mc.gameSettings.keyBindSneak.pressed = true;
        }
    }

    @EventTarget
    private void method16916(EventKeyPress var1) {
        if (this.isEnabled()) {
            if (var1.getKey() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.setCancelled(true);
                this.field23995 = true;
            }
        }
    }

    @EventTarget
    private void method16917(MouseHoverEvent var1) {
        if (this.isEnabled()) {
            if (var1.method13973() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.setCancelled(true);
                this.field23995 = false;
            }
        }
    }

    @EventTarget
    public void method16918(EventUpdate var1) {
        if (this.isEnabled()) {
            if (!mc.player.onGround && this.getBooleanValueFromSetttingName("Kick bypass")) {
                if (this.field23996 > 0 && this.field23996 % 30 == 0 && !ColorUtils.method17730(mc.player, 0.01F)) {
                    if (JelloPortal.method27349() != ViaVerList.field26129.method18582()) {
                        var1.setY(var1.getY() - 0.04);
                    } else {
                        double var4 = this.method16920();
                        if (var4 < 0.0) {
                            return;
                        }

                        double var6 = var1.getY();
                       List<Double> var8 = new ArrayList();
                        if (!(var6 - var4 > 9.0)) {
                            mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var1.getX(), var4, var1.getZ(), true));
                        } else {
                            while (var6 > var4 + 9.0) {
                                var6 -= 9.0;
                                var8.add(var6);
                                mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var1.getX(), var6, var1.getZ(), true));
                            }

                            for (Double var10 : var8) {
                                mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var1.getX(), var10, var1.getZ(), true));
                            }

                            mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var1.getX(), var4, var1.getZ(), true));
                            Collections.reverse(var8);

                            for (Double var12 : var8) {
                                mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var1.getX(), var12, var1.getZ(), true));
                            }

                            mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var1.getX(), var1.getY(), var1.getZ(), true));
                        }

                        this.field23996 = 0;
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16919(EventMove var1) {
        if (this.isEnabled()) {
            if (!ColorUtils.method17730(mc.player, 0.01F)) {
                this.field23996++;
            } else {
                this.field23996 = 0;
            }

            double var4 = this.getNumberValueBySettingName("Speed");
            double var6 = !mc.gameSettings.keyBindJump.pressed ? 0.0 : var4 / 2.0;
            if (mc.gameSettings.keyBindJump.pressed && mc.gameSettings.keyBindSneak.pressed) {
                var6 = 0.0;
            } else if (!this.field23995) {
                if (mc.gameSettings.keyBindJump.pressed) {
                    var6 = var4 / 2.0;
                }
            } else {
                var6 = -var4 / 2.0;
            }

            MovementUtils.method37088(var1, var4);
            var1.setY(var6);
            ColorUtils.method17725(var1.getY());
        }
    }

    private double method16920() {
        if (!(mc.player.getPositionVec().y < 1.0)) {
            if (!mc.player.onGround) {
                AxisAlignedBB var3 = mc.player.boundingBox.method19662(0.0, -mc.player.getPositionVec().y, 0.0);
                Iterator var4 = mc.world.getCollisionShapes(mc.player, var3).iterator();
                double var5 = -1.0;

                while (var4.hasNext()) {
                    VoxelShape var7 = (VoxelShape) var4.next();
                    if (var7.method19514().maxY > var5) {
                        var5 = var7.method19514().maxY;
                    }
                }

                return var5;
            } else {
                return mc.player.getPosY();
            }
        } else {
            return -1.0;
        }
    }
}
