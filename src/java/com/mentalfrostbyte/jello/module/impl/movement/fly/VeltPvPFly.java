package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.network.play.server.SChatPacket;

public class VeltPvPFly extends Module {
    private int field23419;
    private int field23420;
    private double field23421;
    private double field23422;
    private boolean field23423;

    public VeltPvPFly() {
        super(ModuleCategory.MOVEMENT, "VeltPvP", "A fly for VeltPvP");
        this.registerSetting(new NumberSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.2F, 5.0F, 0.1F));
    }

    @Override
    public void onEnable() {
        this.field23421 = mc.player.getPosY();
        this.field23419 = 0;
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
                this.field23423 = false;
            }
        } else {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23423 = true;
        }
    }

    @Override
    public void onDisable() {
        Class9567.method37090(0.0);
        if (mc.player.method3433().y > 0.0) {
            ColorUtils.method17725(-0.0789);
        }
    }

    @EventTarget
    private void method16045(Class4430 var1) {
        if (this.isEnabled()) {
            if (var1.method13977() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.method13900(true);
                this.field23423 = true;
            }
        }
    }

    @EventTarget
    private void method16046(Class4426 var1) {
        if (this.isEnabled()) {
            if (var1.method13973() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.method13900(true);
                this.field23423 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16047(Class4435 var1) {
        if (this.isEnabled()) {
            double var4 = (double) this.getNumberValueBySettingName("Speed");
            if (this.field23419 <= 0) {
                if (this.field23419 != -1) {
                    if (this.field23419 == 0) {
                        if (!mc.gameSettings.keyBindJump.isKeyDown() && var1.method13994() > 0.0) {
                            var1.method13995(-Class9567.method37080());
                        }

                        ColorUtils.method17725(var1.method13994());
                        Class9567.method37088(var1, var4 - 0.1);
                    }
                } else {
                    if (!mc.gameSettings.keyBindJump.isKeyDown()) {
                        var1.method13995(!this.field23423 ? Class9567.method37080() : -var4 / 2.0);
                    } else {
                        var1.method13995(!this.field23423 ? var4 / 2.0 : Class9567.method37080());
                        this.field23422 = this.field23421;
                        this.field23421 = !this.field23423 ? mc.player.getPosY() + var1.method13994() : this.field23421;
                    }

                    ColorUtils.method17725(var1.method13994());
                    Class9567.method37088(var1, var4);
                }
            } else {
                var1.method13995(0.0);
                Class9567.method37088(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16048(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            this.field23419++;
            if (this.field23419 != 2) {
                if (this.field23419 > 2) {
                    if (this.field23419 >= 20 && this.field23419 % 20 == 0) {
                        double var4 = 150.0 + Math.random() * 150.0;
                        double var6 = -var4;
                        var1.method13912(var6);
                        this.field23420 += 2;
                    } else {
                        var1.method13900(true);
                    }
                }
            } else {
                double var8 = 150.0 + Math.random() * 150.0;
                double var9 = -var8;
                var1.method13912(var9);
                this.field23420 += 2;
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16049(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (!(var4 instanceof SPlayerPositionLookPacket)) {
                if (var4 instanceof SChatPacket) {
                    SChatPacket var5 = (SChatPacket) var4;
                    String var6 = var5.method17648().getString();
                    if (this.field23420 > 0 && (var6.contains("Now leaving: §") || var6.contains("Now entering: §"))) {
                        this.field23420--;
                        var1.method13900(true);
                    }
                }
            } else {
                SPlayerPositionLookPacket var7 = (SPlayerPositionLookPacket) var4;
                if (this.field23419 >= 1) {
                    this.field23419 = -1;
                }

                this.field23422 = this.field23421;
                this.field23421 = var7.field24298;
            }
        }
    }

    @EventTarget
    public void method16050(SendPacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.method13932();
            if (var4 instanceof Class5603) {
                Class5603 var5 = (Class5603) var4;
                if (this.field23419 == -1) {
                    var5.field24883 = true;
                }
            }
        }
    }

    @EventTarget
    public void method16051(Render2DEvent var1) {
        if (this.isEnabled()) {
            double var4 = this.field23421;
            mc.player.positionVec.y = var4;
            mc.player.lastTickPosY = var4;
            mc.player.field4915 = var4;
            mc.player.prevPosY = var4;
        }
    }
}
