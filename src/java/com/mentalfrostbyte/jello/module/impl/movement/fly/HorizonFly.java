package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

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
        MovementUtils.method37090(0.0);
        if (mc.player.getMotion().y > 0.0) {
            ColorUtils.method17725(-0.0789);
        }

        mc.timer.timerSpeed = 1.0F;
    }

    @EventTarget
    @LowerPriority
    public void method16158(EventMove var1) {
        if (this.isEnabled()) {
            double var4 = Math.sqrt(var1.getX() * var1.getX() + var1.getZ() * var1.getZ());
            if (this.field23497 <= 9) {
                if (this.field23497 != -1) {
                    if (this.field23497 != 0) {
                        if (this.field23497 >= 1) {
                            MovementUtils.method37088(var1, var4 + 5.0E-4);
                        }
                    } else {
                        MovementUtils.method37088(var1, var4 + 0.0015);
                    }
                } else {
                    var1.setY(MovementUtils.method37080());
                    ColorUtils.method17725(var1.getY());
                    MovementUtils.method37088(var1, 0.125);
                }
            } else {
                MovementUtils.method37088(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16159(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            this.field23497++;
            if (this.field23497 != 11) {
                if (this.field23497 > 11 && this.field23497 >= 20 && this.field23497 % 20 == 0) {
                    var1.setY(0.0);
                }
            } else {
                var1.setY(0.0);
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16160(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof SPlayerPositionLookPacket) {
                SPlayerPositionLookPacket var5 = (SPlayerPositionLookPacket) var4;
                if (this.field23497 >= 1) {
                    this.field23497 = -1;
                }

                this.field23498 = var5.y;
                var5.yaw = mc.player.rotationYaw;
                var5.pitch = mc.player.rotationPitch;
            }
        }
    }

    @EventTarget
    public void method16161(SendPacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof CPlayerPacket) {
                CPlayerPacket var5 = (CPlayerPacket) var4;
                if (this.field23497 == -1) {
                    var5.onGround = true;
                }
            }
        }
    }

    @EventTarget
    public void method16162(Render2DEvent var1) {
        if (this.isEnabled()) {
            double var4 = this.field23498;
            mc.player.positionVec.y = var4;
            mc.player.lastTickPosY = var4;
            mc.player.field4915 = var4;
            mc.player.prevPosY = var4;
        }
    }
}
