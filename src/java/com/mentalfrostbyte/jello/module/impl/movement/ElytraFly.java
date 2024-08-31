package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import org.lwjgl.glfw.GLFW;

public class ElytraFly extends Module {
    public int field23528 = 0;
    public int field23533 = 0;
    private float field23529;
    private float field23530;
    private float field23531;
    private boolean field23532;

    public ElytraFly() {
        super(ModuleCategory.MOVEMENT, "ElytraFly", "Better elytra flying");
        this.registerSetting(new BooleanSetting("NCP", "Bypass NCP", true));
    }

    @EventTarget
    public void method16220(TickEvent var1) {
        if (this.isEnabled()) {
            mc.gameSettings.keyBindSneak.pressed = false;
            if (!(mc.player.method3433().y < 0.08) || mc.player.onGround) {
                mc.player.method3349(7, false);
                if (mc.player.method3331()) {
                    this.method15999(false);
                }
            } else if (!mc.player.method3165()) {
                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, Class1865.field10048));
                mc.player.method3349(7, true);
            }
        }
    }

    @EventTarget
    public void method16221(Class4435 var1) {
        if (this.isEnabled()) {
            double var4 = Class9567.method37075();
            boolean var6 = ColorUtils.method17686();
            if (!this.getBooleanValueFromSetttingName("NCP") && mc.player.method3331()) {
                var4 *= 2.5;
            }

            Class9567.method37088(var1, 0.0);
            if (!mc.player.method3165()) {
                this.field23528 = 0;
            } else {
                if (this.field23528 > 0) {
                    if (this.field23528 > 7) {
                        Class9567.method37088(var1, var4 * 6.3F);
                    }

                    ColorUtils.method17725(-0.071);
                    var1.method13995(-1.0001E-4F);
                }

                this.field23528++;
            }

            if (this.field23530 > 1.0001E-4F && mc.player.field4981) {
                Class9567.method37088(var1, var4 * 6.3F);
                var1.method13995(this.field23530);
            }

            int var7 = GLFW.glfwGetKey(mc.mainWindow.getHandle(), mc.gameSettings.keyBindSneak.keycode.keyCode);
            if (var7 == 1 && this.getBooleanValueFromSetttingName("NCP")) {
                var1.method13995(-0.9F);
            } else if (!mc.player.method3331()) {
                if (mc.player.field4981 && !this.getBooleanValueFromSetttingName("NCP")) {
                    var1.method13995(1.4F);
                }
            } else {
                var1.method13995(1.4F);
            }

            this.field23530 = (float) ((double) this.field23530 * 0.85);
        }
    }

    @EventTarget
    private void method16222(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null && var1.getPacket() instanceof SEntityVelocityPacket) {
                SEntityVelocityPacket var4 = (SEntityVelocityPacket) var1.getPacket();
                Entity var5 = mc.world.method6774(var4.method17565());
                if (var5 instanceof Class888) {
                    Class888 var6 = (Class888) var5;
                    if (var6.field5125 != null && var6.field5125.method3205() == mc.player.method3205()) {
                        this.field23529 = this.field23529 + (float) var4.field24801 / 8000.0F;
                        this.field23531 = this.field23531 + (float) var4.field24803 / 8000.0F;
                        this.field23530 = this.field23530 + (float) var4.field24802 / 8000.0F;
                        this.field23532 = true;
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16223(Class4399 var1) {
        if (this.isEnabled()) {
            byte var4 = 65;
            if (this.field23533 != var4 - 1) {
                if (this.field23533 <= 0 && mc.player.field4981) {
                    this.field23533 = var4;
                }
            } else {
                int var5 = Class7789.method25843(Items.field38068);
                if (var5 >= 0) {
                    if (var5 != mc.player.inventory.currentItem) {
                        mc.getConnection().sendPacket(new Class5539(var5));
                    }

                    mc.getConnection().sendPacket(new Class5555(Hand.MAIN_HAND));
                    if (var5 != mc.player.inventory.currentItem) {
                        mc.getConnection().sendPacket(new Class5539(mc.player.inventory.currentItem));
                    }
                }
            }

            if (this.field23533 > 0) {
                var1.method13916(-90.0F);
            }

            if (!mc.player.field4981) {
                this.field23533 = 0;
            }

            this.field23533--;
        }
    }

    @EventTarget
    @HigherPriority
    private void method16224(SendPacketEvent var1) {
        if (!this.isEnabled()) {
        }
    }

    @EventTarget
    private void method16225(Class4426 var1) {
        if (!this.isEnabled()) {
        }
    }

    @Override
    public void onEnable() {
        if (mc.player.onGround) {
            ColorUtils.method17725(0.3994F);
        }
    }

    @Override
    public void onDisable() {
        if (!Class9567.method37087()) {
            ColorUtils.method17724(0.0);
            ColorUtils.method17726(0.0);
        }
    }
}
