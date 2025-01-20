package com.mentalfrostbyte.jello.module.impl.movement.longjump;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.JumpEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import com.mentalfrostbyte.jello.util.player.MovementUtils;
import net.minecraft.util.math.BlockPos;

public class MineplexLongJump extends Module {
    private double field23802;
    private double field23803;
    private int field23804;
    private int field23805;
    private int field23806;
    private boolean field23807;

    public MineplexLongJump() {
        super(ModuleCategory.MOVEMENT, "Mineplex", "Mineplex longjump.");
    }

    @Override
    public void onDisable() {
        MovementUtils.strafe(MovementUtils.getSpeed() * 0.7);
    }

    @Override
    public void onEnable() {
        this.field23807 = true;
        this.field23804 = -1;
        this.field23805 = 0;
        this.field23806 = 0;
    }

    @EventTarget
    public void method16621(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre() && this.field23804 >= 0) {
            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16622(EventMove var1) {
        if (this.isEnabled() && mc.player != null) {
            if (!mc.player.onGround) {
                if (this.field23804 >= 0) {
                    if (this.field23807 && !MultiUtilities.method17686()) {
                        this.field23807 = !this.field23807;
                        this.field23802 = 0.5;
                        this.field23805 = 1;
                    }

                    this.field23804++;
                    this.field23803 -= 0.04000000000001;
                    if (this.field23804 <= 22) {
                        if (this.field23804 == 10 && this.field23807) {
                            this.field23803 = -0.005;
                        }
                    } else {
                        this.field23803 -= 0.02;
                    }

                    if (this.field23804 > 6 && !MultiUtilities.method17686()) {
                        this.field23803 -= 0.05;
                    }

                    if (mc.player.collidedHorizontally) {
                        this.field23802 = 0.35;
                        this.field23805 = 1;
                    }

                    if (mc.player.collidedVertically) {
                        this.field23803 = -0.078;
                        this.field23804 = 23;
                    }

                    this.field23802 -= 0.01;
                    if (this.field23802 < 0.3) {
                        this.field23802 = 0.3;
                    }

                    MovementUtils.setSpeed(var1, this.field23802);
                    var1.setY(this.field23803);
                }
            } else {
                if (this.field23806 > 1) {
                    this.field23805 = 0;
                } else {
                    this.field23806++;
                }

                if (this.field23804 > 0) {
                    this.field23804 = -1;
                    if (this.access().getBooleanValueFromSettingName("Auto Disable")) {
                        this.access().toggle();
                        return;
                    }
                }

                this.field23807 = MultiUtilities.method17686();
                BlockPos var4 = new BlockPos(mc.player.getPosX(), mc.player.getPosY() - 0.4, mc.player.getPosZ());
                if (MultiUtilities.method17686()
                        && (this.access().getBooleanValueFromSettingName("BorderJump") && !BlockUtil.method34578(var4) || this.access().getBooleanValueFromSettingName("Auto Jump"))) {
                    mc.player.jump();
                    var1.setY(mc.player.getMotion().y);
                    MovementUtils.setSpeed(var1, 0.0);
                }
            }
        }
    }

    @EventTarget
    public void method16623(JumpEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            this.field23802 = 0.81 + (double) this.field23805 * 0.095;
            if (mc.player.getPosY() != (double) ((int) mc.player.getPosY())) {
                this.field23802 = 0.52;
                this.field23805 = 1;
            }

            this.field23806 = 0;
            this.field23803 = 0.4299999;
            if (this.field23805 < 2) {
                this.field23805++;
            }

            this.field23804 = 0;
            var1.method14003(0.0);
            var1.method14002(this.field23803);
        }
    }

    @EventTarget
    public void method16624(ReceivePacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                this.field23804 = -1;
                this.field23805 = 0;
            }
        }
    }
}
