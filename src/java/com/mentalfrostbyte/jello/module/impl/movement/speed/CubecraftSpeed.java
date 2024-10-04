package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render2DEvent;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.JumpEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.world.Timer;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.MovementUtils;

public class CubecraftSpeed extends Module {
    private int field23618;
    private double field23619;
    private double field23620;

    public CubecraftSpeed() {
        super(ModuleCategory.MOVEMENT, "Cubecraft", "Speed for Cubecraft");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Hop", "YPort"));
        this.registerSetting(new NumberSetting<Float>("Speed", "Speed value", 0.75F, Float.class, 0.1F, 1.0F, 0.01F));
        this.registerSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", false));
    }

    @Override
    public void onEnable() {
        this.field23618 = 0;
        this.field23620 = -1.0;
    }

    @Override
    public void onDisable() {
        mc.timer.timerSpeed = 1.0F;
        MovementUtils.strafe(0.2);
        if (mc.player.getMotion().y > 0.0) {
            MultiUtilities.setPlayerYMotion(-0.078);
        }
    }

    @EventTarget
    public void method16361(EventMove var1) {
        if (this.isEnabled()
                && !Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class).isEnabled()
                && !MultiUtilities.method17684(mc.player)) {
            String var4 = this.getStringSettingValueByName("Mode");
            switch (var4) {
                case "Basic":
                    this.field23618++;
                    this.field23619 = 0.27;
                    mc.timer.timerSpeed = 0.7F;
                    if (MultiUtilities.isAboveBounds(mc.player, 0.01F)) {
                        if (this.getBooleanValueFromSettingName("AutoJump")) {
                            mc.player.jump();
                            var1.setY(mc.player.getMotion().y);
                            MovementUtils.setSpeed(var1, this.field23619);
                        }

                        if (this.field23618 == 1) {
                            this.field23619 = (double) this.getNumberValueBySettingName("Speed") * 2.4;
                        } else if (this.field23618 == 2) {
                            mc.timer.timerSpeed = 1.0F;
                            this.field23619 = 0.26;
                        } else if (this.field23618 >= 3) {
                            this.field23618 = 0;
                            this.field23619 = 0.26;
                        }
                    } else {
                        if (mc.timer.timerSpeed == 0.7F) {
                            mc.timer.timerSpeed = 1.0F;
                        }

                        if (this.field23618 == 1) {
                            this.field23619 = 0.27;
                            if (var1.getY() > 0.0) {
                                this.field23619 = 2.0;
                            }
                        } else if (this.field23618 > 1) {
                            this.field23618 = 0;
                        }
                    }

                    MovementUtils.setSpeed(var1, this.field23619);
                    break;
                case "Hop":
                    if (!mc.player.collidedVertically || !MultiUtilities.isAboveBounds(mc.player, 0.001F) || !MovementUtils.isMoving()) {
                        this.field23618++;
                        if (this.field23618 == 1) {
                            this.field23619 = 0.4 + (double) MovementUtils.method37078() * 0.1;
                        }

                        this.field23619 -= 0.015;
                        if (mc.gameSettings.keyBindBack.pressed) {
                            this.field23619 -= 0.07;
                        }

                        this.field23619 = Math.max(this.field23619, 0.2);
                        MovementUtils.setSpeed(var1, this.field23619);
                    } else if (this.getBooleanValueFromSettingName("AutoJump")) {
                        mc.player.jump();
                        var1.setY(mc.player.getMotion().y);
                        MovementUtils.setSpeed(var1, this.field23619);
                    }
                    break;
                case "YPort":
                    if (mc.player.onGround) {
                        if (MultiUtilities.method17686()) {
                            var1.setY(0.53000000000001);
                            MovementUtils.setSpeed(var1, 3.67 * (double) this.getNumberValueBySettingName("Speed"));
                            this.field23618 = 0;
                        }

                        this.field23620 = mc.player.getPosY();
                        if (!Client.getInstance().getModuleManager().getModuleByClass(Timer.class).isEnabled()) {
                            mc.timer.timerSpeed = 1.0F;
                        }
                    } else {
                        mc.timer.timerSpeed = 1.0F - this.getNumberValueBySettingName("Speed") * 0.13F;
                        if (this.field23618 == 0 && var1.getY() == 0.44100000858307864) {
                            this.field23618 = 1;
                            MovementUtils.setSpeed(var1, 0.286);
                            var1.setY(-0.265);
                            MultiUtilities.setPlayerYMotion(var1.getY());
                        } else if (this.field23618 == 1) {
                            this.field23618 = -1;
                            MovementUtils.setSpeed(var1, 0.285);
                        }
                    }
            }
        }
    }

    @EventTarget
    public void method16362(Render2DEvent var1) {
        if (this.isEnabled() && !(this.field23620 < 0.0) && this.getStringSettingValueByName("Mode").equals("YPort")) {
            if (mc.player.onGround && MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
                this.field23620 = mc.player.getPosY();
            }

            mc.player.positionVec.y = this.field23620;
            mc.player.lastTickPosY = this.field23620;
            mc.player.field4915 = this.field23620;
            mc.player.prevPosY = this.field23620;
            if (MovementUtils.isMoving()) {
                mc.player.cameraYaw = 0.099999994F;
            }
        }
    }

    @EventTarget
    public void method16363(JumpEvent var1) {
        if (this.isEnabled()) {
            var1.method14002(0.4);
            this.field23619 = 0.6 + (double) MovementUtils.method37078() * 0.1;
            this.field23618 = 0;
            var1.method14003(this.field23619);
        }
    }
}
