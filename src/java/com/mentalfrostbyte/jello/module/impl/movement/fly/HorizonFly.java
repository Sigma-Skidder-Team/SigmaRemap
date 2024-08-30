package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;

public class HorizonFly extends Module {
    private int field23497;
    private double field23498;

    public HorizonFly() {
        super(ModuleCategory.MOVEMENT, "Horizon", "A fly for Horizon anticheat");
    }

    @Override
    public void onEnable() {
        this.field23498 = mc.player.getPosY();
        this.field23497 = 10;
        mc.timer.timerSpeed = 0.6F;
    }

    @Override
    public void onDisable() {
        Class9567.method37090(0.0);
        if (mc.player.method3433().field18049 > 0.0) {
            Class5628.method17725(-0.0789);
        }

        mc.timer.timerSpeed = 1.0F;
    }

    @EventTarget
    @LowerPriority
    public void method16158(Class4435 var1) {
        if (this.isEnabled()) {
            double var4 = Math.sqrt(var1.method13992() * var1.method13992() + var1.method13996() * var1.method13996());
            if (this.field23497 <= 9) {
                if (this.field23497 != -1) {
                    if (this.field23497 != 0) {
                        if (this.field23497 >= 1) {
                            Class9567.method37088(var1, var4 + 5.0E-4);
                        }
                    } else {
                        Class9567.method37088(var1, var4 + 0.0015);
                    }
                } else {
                    var1.method13995(Class9567.method37080());
                    Class5628.method17725(var1.method13994());
                    Class9567.method37088(var1, 0.125);
                }
            } else {
                Class9567.method37088(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16159(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            this.field23497++;
            if (this.field23497 != 11) {
                if (this.field23497 > 11 && this.field23497 >= 20 && this.field23497 % 20 == 0) {
                    var1.method13912(0.0);
                }
            } else {
                var1.method13912(0.0);
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16160(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof Class5473) {
                Class5473 var5 = (Class5473) var4;
                if (this.field23497 >= 1) {
                    this.field23497 = -1;
                }

                this.field23498 = var5.field24298;
                var5.field24300 = mc.player.rotationYaw;
                var5.field24301 = mc.player.rotationPitch;
            }
        }
    }

    @EventTarget
    public void method16161(SendPacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.method13932();
            if (var4 instanceof Class5603) {
                Class5603 var5 = (Class5603) var4;
                if (this.field23497 == -1) {
                    var5.field24883 = true;
                }
            }
        }
    }

    @EventTarget
    public void method16162(Render2DEvent var1) {
        if (this.isEnabled()) {
            double var4 = this.field23498;
            mc.player.positionVec.field18049 = var4;
            mc.player.lastTickPosY = var4;
            mc.player.field4915 = var4;
            mc.player.prevPosY = var4;
        }
    }
}
