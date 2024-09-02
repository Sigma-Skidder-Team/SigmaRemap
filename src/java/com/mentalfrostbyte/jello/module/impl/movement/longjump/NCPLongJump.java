package com.mentalfrostbyte.jello.module.impl.movement.longjump;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SafeWalkEvent;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.Step;
import com.mentalfrostbyte.jello.module.impl.movement.LongJump;
import com.mentalfrostbyte.jello.module.impl.player.NoFall;
import mapped.*;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.util.math.BlockPos;

public class NCPLongJump extends Module {
    private int field23477;
    private int field23478;
    private boolean field23479;
    private double field23480;

    public NCPLongJump() {
        super(ModuleCategory.MOVEMENT, "NCP", "Longjump for NoCheatPlus.");
        this.registerSetting(new NumberSetting<Float>("Boost", "Longjump boost", 3.0F, Float.class, 1.0F, 5.0F, 0.01F));
        this.registerSetting(new NumberSetting<Float>("Duration", "Speed duration", 10.0F, Float.class, 7.0F, 200.0F, 1.0F));
        this.registerSetting(new ModeSetting("Glide Mode", "The way you will glide", 1, "None", "Basic", "High"));
        this.registerSetting(new ModeSetting("Speed Mode", "The way you will speed", 0, "Basic", "Funcraft", "Hypixel"));
    }

    @Override
    public void onDisable() {
        this.field23479 = false;
        mc.timer.timerSpeed = 1.0F;
        Class9567.method37090(Class9567.method37076() * 0.7);
    }

    @Override
    public void onEnable() {
        this.field23479 = false;
        this.field23477 = 0;
    }

    @EventTarget
    public void method16122(Class4435 var1) {
        if (this.isEnabled() && mc.player != null) {
            if (mc.player.onGround) {
                this.field23478 = 0;
                this.field23477++;
                if (this.field23479 && var1.method13994() != 0.599 && this.method16004().getBooleanValueFromSetttingName("Auto Disable")) {
                    this.method16004().method16000();
                    Class9567.method37088(var1, Class9567.method37076() * 0.8);
                    return;
                }

                BlockPos var4 = new BlockPos(mc.player.getPosX(), mc.player.getPosY() - 0.4, mc.player.getPosZ());
                if (Step.field23887 > 1) {
                    if (this.method16004().getBooleanValueFromSetttingName("BorderJump") && !Class9217.method34578(var4) && this.field23477 > 0 && ColorUtils.method17686()) {
                        mc.player.method2914();
                        var1.method13993(mc.player.method3433().x);
                        var1.method13995(mc.player.method3433().y);
                        var1.method13997(mc.player.method3433().z);
                    } else if (this.method16004().getBooleanValueFromSetttingName("Auto Jump") && this.field23477 > (this.field23479 ? 1 : 0) && ColorUtils.method17686()) {
                        mc.player.method2914();
                        var1.method13993(mc.player.method3433().x);
                        var1.method13995(mc.player.method3433().y);
                        var1.method13997(mc.player.method3433().z);
                    }
                }
            } else {
                this.field23478++;
                this.field23477 = 0;
                if (this.field23479) {
                    double var5 = Class9567.method37076() * 0.95;
                    if (this.field23478 == 1) {
                        this.field23480 = (double) this.getNumberValueBySettingName("Boost") * 0.4 + (double) Class9567.method37078() * 0.05;
                    } else if ((float) this.field23478 > this.getNumberValueBySettingName("Duration") + (float) Class9567.method37078()) {
                        this.field23480 = var5;
                    } else if (this.field23480 > var5) {
                        String var7 = this.getStringSettingValueByName("Speed Mode");
                        switch (var7) {
                            case "Basic":
                                this.field23480 *= 0.987;
                                break;
                            case "Funcraft":
                                this.field23480 -= 0.0075;
                                break;
                            case "Hypixel":
                                this.field23480 -= 0.0079;
                        }

                        if (this.field23480 < var5) {
                            this.field23480 = var5;
                        }
                    }

                    if (mc.player.collidedHorizontally || !ColorUtils.method17686()) {
                        this.field23480 = var5;
                    }

                    Class9567.method37088(var1, this.field23480);
                    if (Class9567.method37079() == 0) {
                        String var13 = this.getStringSettingValueByName("Glide Mode");
                        switch (var13) {
                            case "Basic":
                                var1.method13995(((LongJump) this.method16004()).method16730(this.field23478));
                                break;
                            case "High":
                                var1.method13995(((LongJump) this.method16004()).method16731(this.field23478));
                                if (ColorUtils.method17716()
                                        && Client.getInstance().getModuleManager().getModuleByClass(NoFall.class).isEnabled()
                                        && (this.field23478 == 8 || this.field23478 == 21)) {
                                    double var9 = mc.player.getPosY() + var1.method13994();
                                    double var11 = var9 - (double) ((int) (var9 + 0.001));
                                    if (Math.abs(var11) < 0.001) {
                                        var1.method13995(var1.method13994() - var11);
                                    } else {
                                        var11 = var9 - (double) ((int) var9) - 0.25;
                                        if (Math.abs(var11) < 0.007) {
                                            var1.method13995(var1.method13994() - var11);
                                        }
                                    }
                                }
                        }
                    }
                }

                if (this.field23477 == 1 && mc.player.method3433().y < 0.0 && this.method16004().getBooleanValueFromSetttingName("Auto Jump")) {
                    Class9567.method37088(var1, Class9567.method37076() * 0.2);
                }
            }

            ColorUtils.method17725(var1.method13994());
        }
    }

    @EventTarget
    public void method16123(Class4436 var1) {
        if (this.isEnabled() && mc.player != null) {
            this.field23479 = true;
            this.field23480 = Class9567.method37076();
            var1.method14003(this.field23480);
            var1.method14002(0.425 + (double) Class9567.method37079() * 0.1);
            if (this.getStringSettingValueByName("Glide Mode").equals("High") && Class9567.method37079() == 0) {
                var1.method14002(0.599);
                var1.method14003(0.0);
                if ((double) this.getNumberValueBySettingName("Boost") > 1.5) {
                    var1.method14003(0.28 + (double) this.getNumberValueBySettingName("Boost") * 0.1 + (double) Class9567.method37078() * 0.05);
                }

                if (this.getStringSettingValueByName("Speed Mode").equals("Hypixel") && (double) this.getNumberValueBySettingName("Boost") > 1.75) {
                    ColorUtils.method17749(true);
                }

                mc.getConnection()
                        .sendPacket(
                                new CPlayerPacket.PositionPacket(mc.player.getPosX(), mc.player.getPosY() + 0.425, mc.player.getPosZ(), false)
                        );
                mc.getConnection()
                        .sendPacket(
                                new CPlayerPacket.PositionPacket(mc.player.getPosX(), mc.player.getPosY() + 0.425 + 0.396, mc.player.getPosZ(), false)
                        );
                mc.getConnection()
                        .sendPacket(
                                new CPlayerPacket.PositionPacket(
                                        mc.player.getPosX(), mc.player.getPosY() + 0.425 + 0.396 - 0.122, mc.player.getPosZ(), false
                                )
                        );
            }
        }
    }

    @EventTarget
    public void method16124(SafeWalkEvent var1) {
        if (!this.isEnabled() || !this.getStringSettingValueByName("Glide Mode").equals("High")) {
        }
    }
}
