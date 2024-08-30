package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Render2DEvent;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.Class5473;
import mapped.ColorUtils;
import mapped.Class9567;
import mapped.Packet;

public class HawkFly extends Module {
    private int field23424;
    private double field23425;
    private double field23426;
    private double field23427;

    public HawkFly() {
        super(ModuleCategory.MOVEMENT, "Hawk", "A fly for Hawk anticheat");
    }

    @Override
    public void onEnable() {
        this.field23425 = mc.player.getPosX();
        this.field23426 = mc.player.getPosY();
        this.field23427 = mc.player.getPosZ();
        this.field23424 = 0;
    }

    @Override
    public void onDisable() {
        Class9567.method37090(0.0);
        if (mc.player.method3433().field18049 > 0.0) {
            ColorUtils.method17725(-0.0789);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16052(Class4435 var1) {
        if (this.isEnabled()) {
            double var4 = 0.125;
            if (this.field23424 != -1) {
                if (this.field23424 == 0) {
                    Class9567.method37088(var1, 0.18);
                }
            } else {
                var1.method13995(0.015);
                Class9567.method37088(var1, var4);
            }

            ColorUtils.method17725(var1.method13994());
            ColorUtils.method17724(var1.method13992());
            ColorUtils.method17726(var1.method13996());
        }
    }

    @EventTarget
    public void method16053(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            this.field23424++;
            if (this.field23424 == 1) {
                var1.method13912(0.1);
            }

            var1.method13908(true);
            var1.method13920(false);
        }
    }

    @EventTarget
    public void method16054(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof Class5473) {
                Class5473 var5 = (Class5473) var4;
                if (this.field23424 >= 1) {
                    this.field23424 = -1;
                }

                this.field23425 = var5.field24297;
                this.field23426 = var5.field24298;
                this.field23427 = var5.field24299;
                var5.field24300 = mc.player.rotationYaw;
                var5.field24301 = mc.player.rotationPitch;
            }
        }
    }

    @EventTarget
    public void method16055(Render2DEvent var1) {
        if (this.isEnabled()) {
            double var4 = this.field23426;
            double var6 = this.field23425;
            double var8 = this.field23427;
            mc.player.positionVec.field18049 = var4;
            mc.player.lastTickPosY = var4;
            mc.player.field4915 = var4;
            mc.player.prevPosY = var4;
            mc.player.positionVec.field18048 = var6;
            mc.player.lastTickPosX = var6;
            mc.player.field4914 = var6;
            mc.player.prevPosX = var6;
            mc.player.positionVec.field18050 = var8;
            mc.player.lastTickPosZ = var8;
            mc.player.field4916 = var8;
            mc.player.prevPosZ = var8;
        }
    }
}
