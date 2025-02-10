package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

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
        MovementUtil.strafe(0.0);
        if (mc.player.getMotion().y > 0.0) {
            MultiUtilities.setPlayerYMotion(-0.0789);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16800(EventMove var1) {
        if (this.isEnabled()) {
            if (this.field23919 <= 1) {
                if (this.field23919 != -1) {
                    if (this.field23919 != 0) {
                        if (this.field23919 == 1) {
                            var1.setY(-1.0E-7);
                            MovementUtil.setMotion(var1, MovementUtil.getSpeed());
                            MultiUtilities.setPlayerYMotion(var1.getY());
                        }
                    } else {
                        var1.setY(-1.0E-7);
                        MovementUtil.setMotion(var1, MovementUtil.getSpeed());
                        MultiUtilities.setPlayerYMotion(var1.getY());
                    }
                } else {
                    var1.setY(0.0);
                    MultiUtilities.setPlayerYMotion(var1.getY());
                    MovementUtil.setMotion(var1, MovementUtil.getSpeed());
                }
            } else {
                MovementUtil.setMotion(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16801(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            this.field23919++;
            if (this.field23919 != 3) {
                if (this.field23919 > 3 && this.field23919 >= 20 && this.field23919 % 20 == 0) {
                    var1.setY(-150.0 - Math.random() * 150.0);
                }
            } else {
                var1.setY(-150.0 - Math.random() * 150.0);
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16802(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            IPacket var4 = var1.getPacket();
            if (var4 instanceof SPlayerPositionLookPacket) {
                SPlayerPositionLookPacket var5 = (SPlayerPositionLookPacket) var4;
                if (this.field23919 >= 1) {
                    this.field23919 = -1;
                }

                this.field23920 = var5.y;
                var5.yaw = mc.player.rotationYaw;
                var5.pitch = mc.player.rotationPitch;
            }
        }
    }

    @EventTarget
    public void method16803(SendPacketEvent var1) {
        if (this.isEnabled()) {
            IPacket var4 = var1.getPacket();
            if (var4 instanceof CPlayerPacket) {
                CPlayerPacket var5 = (CPlayerPacket) var4;
                if (this.field23919 == -1) {
                    var5.onGround = true;
                }
            }
        }
    }

    @EventTarget
    public void method16804(Render2DEvent var1) {
        if (this.isEnabled()) {
            double var4 = this.field23920;
            mc.player.positionVec.y = var4;
            mc.player.lastTickPosY = var4;
            mc.player.chasingPosY = var4;
            mc.player.prevPosY = var4;
        }
    }
}
