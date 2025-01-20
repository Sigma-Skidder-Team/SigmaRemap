package com.mentalfrostbyte.jello.module.impl.movement.clicktp;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.ClickEvent;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import lol.MovementUtils;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;

public class SpartanClickTP extends Module {
    private int field23464;
    private BlockPos field23465;

    public SpartanClickTP() {
        super(ModuleCategory.MOVEMENT, "Spartan", "ClickTP for spartan anticheat");
    }

    @Override
    public void onEnable() {
        this.field23464 = -1;
        this.field23465 = null;
    }

    @Override
    public void onDisable() {
        MultiUtilities.setPlayerYMotion(-0.08);
        double var3 = MovementUtils.getSpeed();
        MovementUtils.strafe(var3);
        mc.timer.timerSpeed = 1.0F;
    }

    @EventTarget
    private void method16104(ClickEvent var1) {
        if (this.isEnabled() && (mc.player.isSneaking() || !this.access().getBooleanValueFromSettingName("Sneak"))) {
            if (var1.getButton() == ClickEvent.Button.RIGHT) {
                BlockRayTraceResult var4 = BlockUtil.rayTrace(
                        mc.player.rotationYaw, mc.player.rotationPitch,
                        this.access().getNumberValueBySettingName("Maximum range"));
                BlockPos var5 = null;
                if (var4 != null) {
                    var5 = var4.getPos();
                }

                if (var5 == null) {
                    return;
                }

                this.field23465 = var5;
                mc.getConnection()
                        .sendPacket(
                                new CPlayerPacket.PositionPacket(
                                        (double) this.field23465.getX() + 0.5, this.field23465.getY() + 1,
                                        (double) this.field23465.getZ() + 0.5, true));
                this.field23464 = 0;
            }
        }
    }

    @EventTarget
    public void method16105(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                SPlayerPositionLookPacket var4 = (SPlayerPositionLookPacket) var1.getPacket();
                if (var4.x == (double) this.field23465.getX() + 0.5
                        && var4.y == (double) (this.field23465.getY() + 1)
                        && var4.z == (double) this.field23465.getZ() + 0.5) {
                    Client.getInstance().notificationManager
                            .send(new Notification("ClickTP", "Successfully teleported"));
                    if (!this.access().getBooleanValueFromSettingName("Auto Disable")) {
                        this.field23464 = -1;
                        this.field23465 = null;
                        MultiUtilities.setPlayerYMotion(-0.08);
                        double var5 = MovementUtils.getSpeed();
                        MovementUtils.strafe(var5);
                        mc.timer.timerSpeed = 1.0F;
                    } else {
                        this.access().toggle();
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16106(EventMove var1) {
        if (this.isEnabled()) {
            if (this.field23464 > -1 && this.field23465 != null) {
                var1.setY(0.01);
                this.field23464++;
                if (this.field23464 >= 20) {
                    mc.timer.timerSpeed = 1.4F;
                } else {
                    mc.timer.timerSpeed = 2.0F;
                }

                mc.getConnection()
                        .sendPacket(new CPlayerPacket.PositionPacket(mc.player.getPosX(), mc.player.getPosY(),
                                mc.player.getPosZ(), true));
                mc.getConnection()
                        .sendPacket(
                                new CPlayerPacket.PositionPacket(
                                        (double) this.field23465.getX() + 0.5, this.field23465.getY() + 1,
                                        (double) this.field23465.getZ() + 0.5, true));
            }
        }
    }
}
