package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.ColorUtils;
import mapped.*;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class OmegaCraftTestFly extends Module {
    private int field23854;
    private int field23855;
    private double field23856;
    private double field23857;
    private double field23858;
    private double field23859;
    private double field23860;
    private double field23861;

    public OmegaCraftTestFly() {
        super(ModuleCategory.MOVEMENT, "Test", "A fly for OmegaCraft");
    }

    @Override
    public void onEnable() {
        this.field23856 = mc.player.getPosX();
        this.field23857 = mc.player.getPosY();
        this.field23858 = mc.player.getPosZ();
        this.field23859 = 0.0;
        this.field23854 = 2;
        this.field23855 = 0;
    }

    @Override
    public void onDisable() {
        MovementUtils.strafe(0.0);
        if (mc.player.getMotion().y > 0.0) {
            ColorUtils.setPlayerYMotion(-0.0789);
        }

        mc.timer.timerSpeed = 1.0F;
    }

    @EventTarget
    @LowerPriority
    public void method16700(EventMove var1) {
        if (this.isEnabled()) {
            double var4 = Math.sqrt(var1.getX() * var1.getX() + var1.getZ() * var1.getZ());
            if (this.field23854 <= 1) {
                if (this.field23854 != -1) {
                    if (this.field23854 != 0) {
                        if (this.field23854 < 1) {
                        }
                    } else {
                        MovementUtils.setSpeed(var1, 0.1);
                    }
                } else {
                    this.field23855++;
                    if (this.field23855 != 1 && this.field23855 % 3 != 0 && this.field23855 % 3 != 1) {
                    }

                    ColorUtils.setPlayerYMotion(var1.getY());
                    MovementUtils.setSpeed(var1, 1.0);
                }
            } else {
                var1.setY(0.0);
                MovementUtils.setSpeed(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16701(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            this.field23854++;
            if (this.field23854 != 3) {
                if (this.field23854 > 3) {
                    if (this.field23854 >= 20 && this.field23854 % 20 == 0) {
                        var1.setY(0.0);
                    } else {
                        var1.setCancelled(true);
                    }
                }
            } else {
                var1.setY(1000.0);
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16702(ReceivePacketEvent event) {
        if (this.isEnabled()) {
            Packet<?> packet = event.getPacket();
            if (packet instanceof SPlayerPositionLookPacket) {
                SPlayerPositionLookPacket var5 = (SPlayerPositionLookPacket) packet;
                if (this.field23854 >= 1) {
                    this.field23854 = -1;
                }

                this.field23860 = this.field23857;
                this.field23861 = this.field23858;
                this.field23856 = var5.x;
                this.field23857 = var5.y;
                this.field23858 = var5.z;
                var5.yaw = mc.player.rotationYaw;
                var5.pitch = mc.player.rotationPitch;
            }
        }
    }

    @EventTarget
    public void method16703(SendPacketEvent event) {
        if (this.isEnabled()) {
            Packet<?> packet = event.getPacket();
            if (packet instanceof CPlayerPacket) {
                CPlayerPacket var5 = (CPlayerPacket) packet;
                if (this.field23854 == -1) {
                    var5.onGround = true;
                }
            }
        }
    }

    @EventTarget
    public void method16704(Render2DEvent var1) {
        if (!this.isEnabled()) {
        }
    }
}
