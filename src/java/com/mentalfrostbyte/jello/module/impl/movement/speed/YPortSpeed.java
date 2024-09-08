package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import mapped.*;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class YPortSpeed extends Module {
    private boolean field23541;
    private double field23542;
    private double field23543;
    private double field23544;
    private int field23545;

    public YPortSpeed() {
        super(ModuleCategory.MOVEMENT, "YPort", "YPort speed");
        this.registerSetting(new ModeSetting("Mode", "YPort mode", 0, "NCP", "OldNCP"));
        this.registerSetting(new BooleanSetting("OnGround", "See yourself on ground", true));
    }

    @EventTarget
    public void method16235(Class4399 var1) {
        if (this.isEnabled() && mc.player != null && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
            if (mc.player.onGround && var1.method13921() && ColorUtils.method17716()) {
                var1.method13912(var1.method13911() + 1.0E-14);
            }
        }
    }

    @Override
    public void onEnable() {
        this.field23541 = false;
        this.field23545 = 0;
        this.field23543 = mc.player != null ? Class9567.method37075() : 0.2873;
        this.field23542 = mc.player.getPosY();
    }

    @Override
    public void onDisable() {
        this.field23541 = false;
        if (mc.player.getVec().y > 0.33) {
            ColorUtils.method17725(-0.43 + (double) Class9567.method37079() * 0.1);
            Class9567.method37090(Class9567.method37075());
        }
    }

    @EventTarget
    public void method16236(Class4435 var1) {
        if (this.isEnabled() && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
            if (!mc.player.field4981) {
                String var4 = this.getStringSettingValueByName("Mode");
                switch (var4) {
                    case "NCP":
                        if (Class9567.method37087() && mc.player.onGround) {
                            mc.player.method2914();
                            var1.method13995(mc.player.getVec().y);
                            Class9567.method37088(var1, 0.461);
                            this.field23541 = true;
                            mc.player.stepHeight = 0.5F;
                        } else if (this.field23541
                                && ColorUtils.method17730(mc.player, (float) (Class9567.method37080() + (double) Class9567.method37079() * 0.1 + 0.001F))) {
                            this.field23541 = !this.field23541;
                            Class9567.method37088(var1, 0.312);
                            var1.method13995(-0.43 + (double) Class9567.method37079() * 0.1);
                            ColorUtils.method17725(var1.method13994());
                            mc.player.stepHeight = 0.0F;
                        } else if (this.field23541) {
                            var1.method13995(-0.1);
                            this.field23541 = !this.field23541;
                        }
                        break;
                    case "OldNCP":
                        if (mc.player.onGround && ColorUtils.method17686()) {
                            this.field23545 = 2;
                        }

                        if (this.field23545 == 1 && ColorUtils.method17686()) {
                            this.field23545 = 2;
                            this.field23543 = 1.38 * Class9567.method37075() - 0.01;
                        } else if (this.field23545 == 2) {
                            this.field23545 = 3;
                            double var8 = 0.401448482 + 0.002 * Math.random();
                            var8 *= 1.0 + Math.sqrt((float) Class9567.method37079() / 2.0F) / 2.0;
                            var1.method13995(var8);
                            this.field23543 *= 2.149;
                        } else if (this.field23545 == 3) {
                            this.field23545 = 4;
                            double var6 = 0.66 * (this.field23544 - Class9567.method37075());
                            this.field23543 = this.field23544 - var6;
                        } else {
                            if (mc.world
                                    .method7055(
                                            mc.player, mc.player.boundingBox.method19667(0.0, mc.player.getVec().y, 0.0)
                                    )
                                    .count()
                                    > 0L
                                    || mc.player.collidedVertically) {
                                this.field23545 = 1;
                            }

                            this.field23543 = this.field23544 - this.field23544 / 159.0;
                        }

                        this.field23543 = Math.max(this.field23543, Class9567.method37075());
                        Class9567.method37088(var1, this.field23543);
                        mc.player.stepHeight = 0.6F;
                        ColorUtils.method17725(var1.method13994());
                }
            }
        }
    }

    @EventTarget
    private void method16237(Class4404 var1) {
        if (this.isEnabled()
                && !this.getStringSettingValueByName("Mode").equalsIgnoreCase("NCP")
                && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
            if (!mc.player.method3250() && !mc.player.method3264() && !mc.player.method3063()) {
                if (!mc.gameSettings.keyBindJump.pressed
                        && !mc.player.method3063()
                        && !Class9567.method37081()
                        && !mc.player.method3250()
                        && ColorUtils.method17730(mc.player, 1.0F)
                        && !mc.player.onGround
                        && this.field23545 == 3) {
                    ColorUtils.method17725(-0.3994);
                }

                double var4 = mc.player.getPosX() - mc.player.prevPosX;
                double var6 = mc.player.getPosZ() - mc.player.prevPosZ;
                this.field23544 = Math.sqrt(var4 * var4 + var6 * var6);
            }
        }
    }

    @EventTarget
    public void method16238(Render2DEvent var1) {
        if (this.isEnabled()
                && ColorUtils.method17730(mc.player, 0.43F)
                && !((double) mc.player.fallDistance > 0.09)
                && this.getBooleanValueFromSetttingName("OnGround")
                && !mc.gameSettings.keyBindJump.pressed
                && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
            if (mc.player.onGround && ColorUtils.method17730(mc.player, 0.001F)) {
                this.field23542 = mc.player.getPosY();
            }

            mc.player.positionVec.y = this.field23542;
            mc.player.lastTickPosY = this.field23542;
            mc.player.field4915 = this.field23542;
            mc.player.prevPosY = this.field23542;
            if (Class9567.method37087()) {
                mc.player.field4909 = 0.099999994F;
            }
        }
    }

    @EventTarget
    private void method16239(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                this.field23544 = 0.0;
            }
        }
    }
}
