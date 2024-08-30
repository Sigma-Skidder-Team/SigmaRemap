package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render2DEvent;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.world.Timer;
import mapped.*;

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
        Class9567.method37090(0.2);
        if (mc.player.method3433().field18049 > 0.0) {
            Class5628.method17725(-0.078);
        }
    }

    @EventTarget
    public void method16361(Class4435 var1) {
        if (this.isEnabled()
                && !Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class).isEnabled()
                && !Class5628.method17684(mc.player)) {
            String var4 = this.getStringSettingValueByName("Mode");
            switch (var4) {
                case "Basic":
                    this.field23618++;
                    this.field23619 = 0.27;
                    mc.timer.timerSpeed = 0.7F;
                    if (Class5628.method17730(mc.player, 0.01F)) {
                        if (this.getBooleanValueFromSetttingName("AutoJump")) {
                            mc.player.method2914();
                            var1.method13995(mc.player.method3433().field18049);
                            Class9567.method37088(var1, this.field23619);
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
                            if (var1.method13994() > 0.0) {
                                this.field23619 = 2.0;
                            }
                        } else if (this.field23618 > 1) {
                            this.field23618 = 0;
                        }
                    }

                    Class9567.method37088(var1, this.field23619);
                    break;
                case "Hop":
                    if (!mc.player.collidedVertically || !Class5628.method17730(mc.player, 0.001F) || !Class9567.method37087()) {
                        this.field23618++;
                        if (this.field23618 == 1) {
                            this.field23619 = 0.4 + (double) Class9567.method37078() * 0.1;
                        }

                        this.field23619 -= 0.015;
                        if (mc.gameSettings.keyBindBack.pressed) {
                            this.field23619 -= 0.07;
                        }

                        this.field23619 = Math.max(this.field23619, 0.2);
                        Class9567.method37088(var1, this.field23619);
                    } else if (this.getBooleanValueFromSetttingName("AutoJump")) {
                        mc.player.method2914();
                        var1.method13995(mc.player.method3433().field18049);
                        Class9567.method37088(var1, this.field23619);
                    }
                    break;
                case "YPort":
                    if (mc.player.onGround) {
                        if (Class5628.method17686()) {
                            var1.method13995(0.53000000000001);
                            Class9567.method37088(var1, 3.67 * (double) this.getNumberValueBySettingName("Speed"));
                            this.field23618 = 0;
                        }

                        this.field23620 = mc.player.getPosY();
                        if (!Client.getInstance().getModuleManager().getModuleByClass(Timer.class).isEnabled()) {
                            mc.timer.timerSpeed = 1.0F;
                        }
                    } else {
                        mc.timer.timerSpeed = 1.0F - this.getNumberValueBySettingName("Speed") * 0.13F;
                        if (this.field23618 == 0 && var1.method13994() == 0.44100000858307864) {
                            this.field23618 = 1;
                            Class9567.method37088(var1, 0.286);
                            var1.method13995(-0.265);
                            Class5628.method17725(var1.method13994());
                        } else if (this.field23618 == 1) {
                            this.field23618 = -1;
                            Class9567.method37088(var1, 0.285);
                        }
                    }
            }
        }
    }

    @EventTarget
    public void method16362(Render2DEvent var1) {
        if (this.isEnabled() && !(this.field23620 < 0.0) && this.getStringSettingValueByName("Mode").equals("YPort")) {
            if (mc.player.onGround && Class5628.method17730(mc.player, 0.001F)) {
                this.field23620 = mc.player.getPosY();
            }

            mc.player.positionVec.field18049 = this.field23620;
            mc.player.lastTickPosY = this.field23620;
            mc.player.field4915 = this.field23620;
            mc.player.prevPosY = this.field23620;
            if (Class9567.method37087()) {
                mc.player.field4909 = 0.099999994F;
            }
        }
    }

    @EventTarget
    public void method16363(Class4436 var1) {
        if (this.isEnabled()) {
            var1.method14002(0.4);
            this.field23619 = 0.6 + (double) Class9567.method37078() * 0.1;
            this.field23618 = 0;
            var1.method14003(this.field23619);
        }
    }
}
