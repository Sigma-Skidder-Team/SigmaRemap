package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.JumpEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.antikb.AACAntiKB;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class OldAACSpeed extends Module {
    private double field23534;
    private float field23535;
    private int field23536;
    private int field23537;

    public OldAACSpeed() {
        super(ModuleCategory.MOVEMENT, "OldAAC", "Speed for old version of AAC");
        this.registerSetting(new BooleanSetting("Auto Jump", "Automatically jumps for you.", true));
    }

    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
        this.field23537 = Client.getInstance().getPlayerTracker().getgroundTicks() <= 0 ? 1 : 0;
        this.field23534 = MovementUtil.getSpeed();
        this.field23535 = MovementUtil.otherStrafe()[0];
    }

    @EventTarget
    public void method16226(EventMove var1) {
        if (this.isEnabled()) {
            if (!mc.player.onGround) {
                if (MultiUtilities.method17686() && AACAntiKB.field23907 >= 7) {
                    this.field23536++;
                    if (this.field23536 == 1) {
                        if (this.field23537 != 1) {
                            if (this.field23537 == 2) {
                                this.field23534 = 0.362;
                            }
                        } else {
                            this.field23534 = 0.306;
                        }
                    }

                    if (mc.player.collidedHorizontally) {
                        this.field23534 = MovementUtil.getSpeed();
                    }

                    this.field23535 = MovementUtil.method37092(var1, this.field23534, MovementUtil.otherStrafe()[0], this.field23535, 45.0F);
                }
            } else if (this.getBooleanValueFromSettingName("Auto Jump") && MultiUtilities.method17686()) {
                this.field23536 = 0;
                mc.player.jump();
                var1.setX(mc.player.getMotion().x);
                var1.setY(mc.player.getMotion().y);
                var1.setZ(mc.player.getMotion().z);
            } else if (var1.getY() != 0.4 + (double) MovementUtil.getJumpBoost() * 0.1) {
                this.field23537 = 0;
            } else {
                MovementUtil.setSpeed(var1, this.field23534);
            }
        }
    }

    @EventTarget
    public void method16227(JumpEvent var1) {
        if (this.isEnabled()) {
            if (this.field23537 < 2) {
                this.field23537++;
            }

            if (this.field23537 != 1) {
                if (this.field23537 == 2) {
                    this.field23534 = 0.6;
                }
            } else {
                this.field23534 = 0.5;
            }

            this.field23535 = MovementUtil.otherStrafe()[0];
            var1.method14003(this.field23534);
            var1.method14002(0.4 + (double) MovementUtil.getJumpBoost() * 0.1);
            this.field23536 = 0;
        }
    }

    @EventTarget
    public void method16228(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                this.field23537 = 0;
                this.field23534 = MovementUtil.getSpeed();
            }
        }
    }
}
