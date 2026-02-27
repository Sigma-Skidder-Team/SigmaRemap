package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.Criticals;
import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.Jesus;
import com.mentalfrostbyte.jello.module.impl.movement.Step;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import com.mentalfrostbyte.jello.module.impl.world.Timer;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import mapped.*;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class HypixelSpeed extends Module {
    private int hopStage;
    private double targetMoveSpeed;
    private double lastGroundY;
    private double criticalsOffsetAccumulator;
    private Class2094 hopProfile = Class2094.field13640;

    public HypixelSpeed() {
        super(ModuleCategory.MOVEMENT, "Hypixel", "Speed for Hypixel");
        this.registerSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
        this.registerSetting(new BooleanSetting("Timer", "Use timer", true));
        this.registerSetting(new BooleanSetting("GroundSpeed", "Move faster on ground", true));
        this.registerSetting(new BooleanSetting("BorderJump", "Automatically jumps off edges with speed", true));
    }

    @Override
    public void onEnable() {
        this.targetMoveSpeed = MovementUtil.method37076();
        this.hopStage = 6;
        this.hopProfile = Class2094.field13640;
        this.lastGroundY = -1.0;
        this.criticalsOffsetAccumulator = 0.0;
    }

    @Override
    public void onDisable() {
        if (this.hopProfile == Class2094.field13641 && mc.player.getMotion().y > 0.0 && this.hopStage == 0) {
            MovementUtil.setPlayerYMotion(-MovementUtil.getJumpValue() - 1.0E-5 - 0.0625);
        }

        if (Math.abs((double) mc.timer.timerSpeed - 1.4123) < 0.001
                && !Client.getInstance().moduleManager.getModuleByClass(Timer.class).isEnabled()) {
            mc.timer.timerSpeed = 1.0F;
        }
    }

    @EventTarget
    @LowerPriority
    public void method16037(EventUpdate var1) {
        if (mc.player.onGround) {
            if (!Client.getInstance().moduleManager.getModuleByClass(Criticals.class).isEnabled2()
                    || KillAura.target == null && KillAura.timedTarget == null
                    || this.hopProfile != Class2094.field13641) {
                this.criticalsOffsetAccumulator = 0.0;
            } else if (var1.isPre()) {
                if (this.criticalsOffsetAccumulator > 3.0) {
                    this.criticalsOffsetAccumulator = 0.0;
                    mc.getConnection().sendPacket(new CPlayerPacket(true));
                }

                var1.setGround(false);
            }
        }
    }

    @EventTarget
    @Class5631
    @HigherPriority
    public void method16038(EventMove var1) {
        if (!this.isEnabled()) {
            if (mc.player.onGround || MultiUtilities.isAboveBounds(mc.player, 0.001F) || mc.player.getPosY() < this.lastGroundY) {
                this.lastGroundY = -1.0;
            }
        } else {
            mc.player.jumpTicks = 0;
            if (mc.player.onGround) {
                this.lastGroundY = mc.player.getPosY();
                if (!Client.getInstance().moduleManager.getModuleByClass(Timer.class).isEnabled()) {
                    mc.timer.timerSpeed = 1.0F;
                }

                if (this.hopStage >= 0 && Step.field23887 >= 2) {
                    if ((var1.getY() > 0.0 || this.getBooleanValueFromSettingName("AutoJump") && MovementUtil.isMoving()) && !MultiUtilities.inLiquid(mc.player)) {
                        mc.player.jump();
                        var1.setY(MovementUtil.getJumpValue());
                        MovementUtil.setMotion(var1, 0.644348756324588 + Math.random() * 1.0E-6 + (double) MovementUtil.getSpeedBoost() * 0.13);
                        if (this.getBooleanValueFromSettingName("Timer") && !Client.getInstance().moduleManager.getModuleByClass(Timer.class).isEnabled()) {
                            mc.timer.timerSpeed = 1.4123F;
                        }

                        this.hopStage = 0;
                        this.hopProfile = Class2094.field13640;
                    } else if (MovementUtil.isMoving() && this.getBooleanValueFromSettingName("GroundSpeed") && !MultiUtilities.inLiquid(mc.player)) {
                        mc.player.stepHeight = 0.5F;
                        mc.player.jump();
                        var1.setY(0.399 + (double) MovementUtil.getJumpBoost() * 0.1 + 1.0E-14);
                        MovementUtil.setMotion(var1, 0.51 + Math.random() * 1.0E-6 + (double) MovementUtil.getSpeedBoost() * 0.098);
                        this.hopStage = 0;
                        if (this.getBooleanValueFromSettingName("Timer") && !Client.getInstance().moduleManager.getModuleByClass(Timer.class).isEnabled()) {
                            mc.timer.timerSpeed = 1.1123F;
                        }

                        this.hopProfile = Class2094.field13641;
                    } else {
                        this.criticalsOffsetAccumulator = 0.0;
                    }
                } else {
                    MovementUtil.setMotion(var1, 0.25);
                    if (this.hopStage < 0) {
                        this.hopStage++;
                    }
                }
            } else if (this.hopStage >= 0) {
                double var4 = MovementUtil.getSpeed();
                if (!Client.getInstance().moduleManager.getModuleByClass(Timer.class).isEnabled()) {
                    mc.timer.timerSpeed = 1.0F;
                }

                switch (Class7845.field33649[this.hopProfile.ordinal()]) {
                    case 1:
                        if (this.hopStage == 0) {
                            this.targetMoveSpeed = 0.3893478969348657 + Math.random() * 1.0E-6 + (double) MovementUtil.getSpeedBoost() * 0.077;
                        } else {
                            double var8 = 0.99375 - (double) this.hopStage * 1.0E-13;
                            this.targetMoveSpeed *= var8;
                        }

                        if (MovementUtil.getJumpBoost() == 0 && !Client.getInstance().moduleManager.getModuleByClass(BlockFly.class).isEnabled()) {
                            this.applyVerticalMotionDamping(var1, this.hopStage);
                        }

                        if (this.criticalsOffsetAccumulator > 3.0) {
                            this.criticalsOffsetAccumulator = 0.0;
                            mc.getConnection().sendPacket(new CPlayerPacket(true));
                        }
                        break;
                    case 2:
                        if (this.hopStage == 0) {
                            double var6 = 0.399 + (double) MovementUtil.getJumpBoost() * 0.1 + 1.0E-5;
                            if (this.getBooleanValueFromSettingName("BorderJump")
                                    && mc.world.getCollisionShapes(mc.player, mc.player.boundingBox.expand(0.0, -var6 - 0.0625, 0.0)).count()
                                    == 0L) {
                                this.targetMoveSpeed = 0.4103345672948576 + Math.random() * 1.0E-6 + (double) MovementUtil.getSpeedBoost() * 0.085;
                                this.lastGroundY = -1.0;
                            } else {
                                var1.setY(-var6 - 0.0625);
                                this.criticalsOffsetAccumulator = this.criticalsOffsetAccumulator - var1.getY();
                                this.targetMoveSpeed = 0.3 + Math.random() * 1.0E-6 + (double) MovementUtil.getSpeedBoost() * 0.067;
                            }
                        } else if (this.hopStage == 1 && var1.getY() < 0.0) {
                            this.targetMoveSpeed *= 0.7;
                        } else {
                            this.targetMoveSpeed *= 0.981;
                        }
                }

                if (this.targetMoveSpeed < var4 || mc.player.collidedHorizontally || !MovementUtil.isMoving() || MultiUtilities.inLiquid(mc.player)) {
                    this.targetMoveSpeed = var4;
                }

                MovementUtil.setMotion(var1, this.targetMoveSpeed);
                this.hopStage++;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16039(JumpEvent var1) {
        if (!Jesus.isWalkingOnLiquid() && !Client.getInstance().moduleManager.getModuleByClass(Fly.class).isEnabled()) {
            if (this.getBooleanValueFromSettingName("Auto Jump") || mc.player.isJumping) {
                if (this.hopStage < 0) {
                    var1.setCancelled(true);
                }
            }
        }
    }

    @EventTarget
    public void method16040(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                this.hopStage = -2;
            }
        }
    }

    @EventTarget
    public void method16041(WorldLoadEvent var1) {
        this.lastGroundY = -1.0;
    }

    @EventTarget
    @Class5631
    public void method16042(Render2DEvent var1) {
        if (!mc.player.onGround
                && !MultiUtilities.isAboveBounds(mc.player, 1.0E-4F)
                && MultiUtilities.isAboveBounds(mc.player, (float) (MovementUtil.getJumpValue() + 1.0E-5 + 0.0625))
                && Step.field23887 >= 2
                && !(this.lastGroundY < 0.0)
                && this.hopProfile == Class2094.field13641
                && !(mc.player.getPosY() < this.lastGroundY)) {
            mc.player.positionVec.y = this.lastGroundY;
            mc.player.lastTickPosY = this.lastGroundY;
            mc.player.chasingPosY = this.lastGroundY;
            mc.player.prevPosY = this.lastGroundY;
            if (MovementUtil.isMoving()) {
                mc.player.cameraYaw = 0.099999994F;
            }
        }
    }

    @Override
    public boolean isEnabled2() {
        return this.isEnabled()
                && (!mc.player.onGround || mc.player.isJumping || this.getBooleanValueFromSettingName("AutoJump") || this.hopProfile == Class2094.field13641);
    }

    private void applyVerticalMotionDamping(EventMove var1, int var2) {
        if (var2 != 0) {
            if (var2 != 1) {
                if (var2 != 2) {
                    if (var2 == 3 && Math.abs(var1.getY()) < 0.1/* && JelloPortal.getCurrentVersionApplied() == ViaVerList._1_8_x.getVersionNumber()*/) {
                        var1.setY(0.0300011120129438);
                    }
                } else {
                    var1.setY(var1.getY() * 0.967);
                }
            } else {
                var1.setY(var1.getY() * 0.98);
            }
        } else {
            var1.setY(var1.getY() * 0.985);
        }
    }

    public void resetHopStage() {
        this.hopStage = 0;
    }
}
