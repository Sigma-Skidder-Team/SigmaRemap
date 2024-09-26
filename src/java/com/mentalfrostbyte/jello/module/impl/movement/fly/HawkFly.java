package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.Render2DEvent;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import com.mentalfrostbyte.jello.util.ColorUtils;
import mapped.MovementUtils;
import net.minecraft.network.IPacket;

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
        MovementUtils.strafe(0.0);
        if (mc.player.getMotion().y > 0.0) {
            ColorUtils.setPlayerYMotion(-0.0789);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16052(EventMove var1) {
        if (this.isEnabled()) {
            double var4 = 0.125;
            if (this.field23424 != -1) {
                if (this.field23424 == 0) {
                    MovementUtils.setSpeed(var1, 0.18);
                }
            } else {
                var1.setY(0.015);
                MovementUtils.setSpeed(var1, var4);
            }

            ColorUtils.setPlayerYMotion(var1.getY());
            ColorUtils.setPlayerXMotion(var1.getX());
            ColorUtils.setPlayerZMotion(var1.getZ());
        }
    }

    @EventTarget
    public void method16053(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            this.field23424++;
            if (this.field23424 == 1) {
                var1.setY(0.1);
            }

            var1.method13908(true);
            var1.setGround(false);
        }
    }

    @EventTarget
    public void method16054(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            IPacket var4 = var1.getPacket();
            if (var4 instanceof SPlayerPositionLookPacket) {
                SPlayerPositionLookPacket var5 = (SPlayerPositionLookPacket) var4;
                if (this.field23424 >= 1) {
                    this.field23424 = -1;
                }

                this.field23425 = var5.x;
                this.field23426 = var5.y;
                this.field23427 = var5.z;
                var5.yaw = mc.player.rotationYaw;
                var5.pitch = mc.player.rotationPitch;
            }
        }
    }

    @EventTarget
    public void method16055(Render2DEvent var1) {
        if (this.isEnabled()) {
            double var4 = this.field23426;
            double var6 = this.field23425;
            double var8 = this.field23427;
            mc.player.positionVec.y = var4;
            mc.player.lastTickPosY = var4;
            mc.player.field4915 = var4;
            mc.player.prevPosY = var4;
            mc.player.positionVec.x = var6;
            mc.player.lastTickPosX = var6;
            mc.player.field4914 = var6;
            mc.player.prevPosX = var6;
            mc.player.positionVec.z = var8;
            mc.player.lastTickPosZ = var8;
            mc.player.field4916 = var8;
            mc.player.prevPosZ = var8;
        }
    }
}
