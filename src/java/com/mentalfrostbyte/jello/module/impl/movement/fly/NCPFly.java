package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;

public class NCPFly extends Module {
    private int field23919;
    private double field23920;

    public NCPFly() {
        super(ModuleCategory.MOVEMENT, "NCPSpigot", "A fly for NoCheatPlus");
    }

    @Override
    public void onEnable() {
        this.field23920 = mc.player.getPosY();
        this.field23919 = 2;
    }

    @Override
    public void onDisable() {
        Class9567.method37090(0.0);
        if (mc.player.method3433().field18049 > 0.0) {
            Class5628.method17725(-0.0789);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16800(Class4435 var1) {
        if (this.isEnabled()) {
            if (this.field23919 <= 1) {
                if (this.field23919 != -1) {
                    if (this.field23919 != 0) {
                        if (this.field23919 == 1) {
                            var1.method13995(-1.0E-7);
                            Class9567.method37088(var1, Class9567.method37075());
                            Class5628.method17725(var1.method13994());
                        }
                    } else {
                        var1.method13995(-1.0E-7);
                        Class9567.method37088(var1, Class9567.method37075());
                        Class5628.method17725(var1.method13994());
                    }
                } else {
                    var1.method13995(0.0);
                    Class5628.method17725(var1.method13994());
                    Class9567.method37088(var1, Class9567.method37075());
                }
            } else {
                Class9567.method37088(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16801(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            this.field23919++;
            if (this.field23919 != 3) {
                if (this.field23919 > 3 && this.field23919 >= 20 && this.field23919 % 20 == 0) {
                    var1.method13912(-150.0 - Math.random() * 150.0);
                }
            } else {
                var1.method13912(-150.0 - Math.random() * 150.0);
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16802(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof Class5473) {
                Class5473 var5 = (Class5473) var4;
                if (this.field23919 >= 1) {
                    this.field23919 = -1;
                }

                this.field23920 = var5.field24298;
                var5.field24300 = mc.player.rotationYaw;
                var5.field24301 = mc.player.rotationPitch;
            }
        }
    }

    @EventTarget
    public void method16803(SendPacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.method13932();
            if (var4 instanceof Class5603) {
                Class5603 var5 = (Class5603) var4;
                if (this.field23919 == -1) {
                    var5.field24883 = true;
                }
            }
        }
    }

    @EventTarget
    public void method16804(Render2DEvent var1) {
        if (this.isEnabled()) {
            double var4 = this.field23920;
            mc.player.positionVec.field18049 = var4;
            mc.player.lastTickPosY = var4;
            mc.player.field4915 = var4;
            mc.player.prevPosY = var4;
        }
    }
}
