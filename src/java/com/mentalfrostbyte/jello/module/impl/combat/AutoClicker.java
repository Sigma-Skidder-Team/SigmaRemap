package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.CUseEntityPacket;
import mapped.ColorUtils;
import mapped.Hand;

import java.util.Random;

public class AutoClicker extends Module {
    private int field23548;

    public AutoClicker() {
        super(ModuleCategory.COMBAT, "AutoClicker", "Longpress your attack keybind to hit entities automaticly");
    }

    @EventTarget
    private void method16244(TickEvent var1) {
        if (this.isEnabled()) {
            this.field23548++;
            Random var4 = new Random();
            byte var5 = 2;
            byte var6 = 4;
            int var7 = var4.nextInt(var6 - var5) + var5;
            if (mc.gameSettings.keyBindAttack.isKeyDown() && this.field23548 >= var7) {
                mc.player.swingArm(Hand.MAIN_HAND);
                this.field23548 = 0;
                if (ColorUtils.method17711(mc.player.rotationYaw, mc.player.rotationPitch, 4.6F, 0.0) != null) {
                    mc.getConnection()
                            .sendPacket(
                                    new CUseEntityPacket(
                                            ColorUtils.method17711(mc.player.rotationYaw, mc.player.rotationPitch, 4.6F, 0.0), mc.player.method3331()
                                    )
                            );
                    mc.player.swingArm(Hand.MAIN_HAND);
                }
            }
        }
    }
}
