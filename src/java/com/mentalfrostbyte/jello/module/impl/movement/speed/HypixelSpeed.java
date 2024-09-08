package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.Client;
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
import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import mapped.*;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class HypixelSpeed extends Module {
    private int field23414;
    private double field23415;
    private double field23416;
    private double field23417;
    private Class2094 field23418 = Class2094.field13640;

    public HypixelSpeed() {
        super(ModuleCategory.MOVEMENT, "Hypixel", "Speed for Hypixel");
        this.registerSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
        this.registerSetting(new BooleanSetting("Timer", "Use timer", true));
        this.registerSetting(new BooleanSetting("GroundSpeed", "Move faster on ground", true));
        this.registerSetting(new BooleanSetting("BorderJump", "Automatically jumps off edges with speed", true));
    }

    @Override
    public void onEnable() {
        this.field23415 = Class9567.method37076();
        this.field23414 = 6;
        this.field23418 = Class2094.field13640;
        this.field23416 = -1.0;
        this.field23417 = 0.0;
    }

    @Override
    public void onDisable() {
        if (this.field23418 == Class2094.field13641 && mc.player.getVec().y > 0.0 && this.field23414 == 0) {
            ColorUtils.method17725(-Class9567.method37080() - 1.0E-5 - 0.0625);
        }

        if (Math.abs((double) mc.timer.timerSpeed - 1.4123) < 0.001
                && !Client.getInstance().getModuleManager().getModuleByClass(Timer.class).isEnabled()) {
            mc.timer.timerSpeed = 1.0F;
        }
    }

    @EventTarget
    @LowerPriority
    public void method16037(Class4399 var1) {
        if (mc.player.onGround) {
            if (!Client.getInstance().getModuleManager().getModuleByClass(Criticals.class).method15988()
                    || KillAura.field23948 == null && KillAura.field23949 == null
                    || this.field23418 != Class2094.field13641) {
                this.field23417 = 0.0;
            } else if (var1.method13921()) {
                if (this.field23417 > 3.0) {
                    this.field23417 = 0.0;
                    mc.getConnection().sendPacket(new CPlayerPacket(true));
                }

                var1.method13920(false);
            }
        }
    }

    @EventTarget
    @Class5631
    @HigherPriority
    public void method16038(Class4435 var1) {
        if (!this.isEnabled()) {
            if (mc.player.onGround || ColorUtils.method17730(mc.player, 0.001F) || mc.player.getPosY() < this.field23416) {
                this.field23416 = -1.0;
            }
        } else {
            mc.player.field4999 = 0;
            if (mc.player.onGround) {
                this.field23416 = mc.player.getPosY();
                if (!Client.getInstance().getModuleManager().getModuleByClass(Timer.class).isEnabled()) {
                    mc.timer.timerSpeed = 1.0F;
                }

                if (this.field23414 >= 0 && Step.field23887 >= 2) {
                    if ((var1.method13994() > 0.0 || this.getBooleanValueFromSetttingName("AutoJump") && ColorUtils.method17686()) && !ColorUtils.method17684(mc.player)) {
                        mc.player.method2914();
                        var1.method13995(Class9567.method37080());
                        Class9567.method37088(var1, 0.644348756324588 + Math.random() * 1.0E-6 + (double) Class9567.method37078() * 0.13);
                        if (this.getBooleanValueFromSetttingName("Timer") && !Client.getInstance().getModuleManager().getModuleByClass(Timer.class).isEnabled()) {
                            mc.timer.timerSpeed = 1.4123F;
                        }

                        this.field23414 = 0;
                        this.field23418 = Class2094.field13640;
                    } else if (ColorUtils.method17686() && this.getBooleanValueFromSetttingName("GroundSpeed") && !ColorUtils.method17684(mc.player)) {
                        mc.player.stepHeight = 0.5F;
                        mc.player.method2914();
                        var1.method13995(0.399 + (double) Class9567.method37079() * 0.1 + 1.0E-14);
                        Class9567.method37088(var1, 0.51 + Math.random() * 1.0E-6 + (double) Class9567.method37078() * 0.098);
                        this.field23414 = 0;
                        if (this.getBooleanValueFromSetttingName("Timer") && !Client.getInstance().getModuleManager().getModuleByClass(Timer.class).isEnabled()) {
                            mc.timer.timerSpeed = 1.1123F;
                        }

                        this.field23418 = Class2094.field13641;
                    } else {
                        this.field23417 = 0.0;
                    }
                } else {
                    Class9567.method37088(var1, 0.25);
                    if (this.field23414 < 0) {
                        this.field23414++;
                    }
                }
            } else if (this.field23414 >= 0) {
                double var4 = Class9567.method37075();
                if (!Client.getInstance().getModuleManager().getModuleByClass(Timer.class).isEnabled()) {
                    mc.timer.timerSpeed = 1.0F;
                }

                switch (Class7845.field33649[this.field23418.ordinal()]) {
                    case 1:
                        if (this.field23414 == 0) {
                            this.field23415 = 0.3893478969348657 + Math.random() * 1.0E-6 + (double) Class9567.method37078() * 0.077;
                        } else {
                            double var8 = 0.99375 - (double) this.field23414 * 1.0E-13;
                            this.field23415 *= var8;
                        }

                        if (Class9567.method37079() == 0 && !Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class).isEnabled()) {
                            this.method16043(var1, this.field23414);
                        }

                        if (this.field23417 > 3.0) {
                            this.field23417 = 0.0;
                            mc.getConnection().sendPacket(new CPlayerPacket(true));
                        }
                        break;
                    case 2:
                        if (this.field23414 == 0) {
                            double var6 = 0.399 + (double) Class9567.method37079() * 0.1 + 1.0E-5;
                            if (this.getBooleanValueFromSetttingName("BorderJump")
                                    && mc.world.method7055(mc.player, mc.player.boundingBox.method19662(0.0, -var6 - 0.0625, 0.0)).count()
                                    == 0L) {
                                this.field23415 = 0.4103345672948576 + Math.random() * 1.0E-6 + (double) Class9567.method37078() * 0.085;
                                this.field23416 = -1.0;
                            } else {
                                var1.method13995(-var6 - 0.0625);
                                this.field23417 = this.field23417 - var1.method13994();
                                this.field23415 = 0.3 + Math.random() * 1.0E-6 + (double) Class9567.method37078() * 0.067;
                            }
                        } else if (this.field23414 == 1 && var1.method13994() < 0.0) {
                            this.field23415 *= 0.7;
                        } else {
                            this.field23415 *= 0.981;
                        }
                }

                if (this.field23415 < var4 || mc.player.collidedHorizontally || !ColorUtils.method17686() || ColorUtils.method17684(mc.player)) {
                    this.field23415 = var4;
                }

                Class9567.method37088(var1, this.field23415);
                this.field23414++;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16039(Class4436 var1) {
        if (!Jesus.method16953() && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
            if (this.getBooleanValueFromSetttingName("Auto Jump") || mc.player.field4981) {
                if (this.field23414 < 0) {
                    var1.method13900(true);
                }
            }
        }
    }

    @EventTarget
    public void method16040(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                this.field23414 = -2;
            }
        }
    }

    @EventTarget
    public void method16041(WorldLoadEvent var1) {
        this.field23416 = -1.0;
    }

    @EventTarget
    @Class5631
    public void method16042(Render2DEvent var1) {
        if (!mc.player.onGround
                && !ColorUtils.method17730(mc.player, 1.0E-4F)
                && ColorUtils.method17730(mc.player, (float) (Class9567.method37080() + 1.0E-5 + 0.0625))
                && Step.field23887 >= 2
                && !(this.field23416 < 0.0)
                && this.field23418 == Class2094.field13641
                && !(mc.player.getPosY() < this.field23416)) {
            mc.player.positionVec.y = this.field23416;
            mc.player.lastTickPosY = this.field23416;
            mc.player.field4915 = this.field23416;
            mc.player.prevPosY = this.field23416;
            if (Class9567.isMoving()) {
                mc.player.field4909 = 0.099999994F;
            }
        }
    }

    @Override
    public boolean method15988() {
        return this.isEnabled()
                && (!mc.player.onGround || mc.player.field4981 || this.getBooleanValueFromSetttingName("AutoJump") || this.field23418 == Class2094.field13641);
    }

    private void method16043(Class4435 var1, int var2) {
        if (var2 != 0) {
            if (var2 != 1) {
                if (var2 != 2) {
                    if (var2 == 3 && Math.abs(var1.method13994()) < 0.1 && JelloPortal.method27349() == ViaVerList.field26129.method18582()) {
                        var1.method13995(0.0300011120129438);
                    }
                } else {
                    var1.method13995(var1.method13994() * 0.967);
                }
            } else {
                var1.method13995(var1.method13994() * 0.98);
            }
        } else {
            var1.method13995(var1.method13994() * 0.985);
        }
    }

    public void method16044() {
        this.field23414 = 0;
    }
}
