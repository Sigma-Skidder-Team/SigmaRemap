package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.CUseEntityPacket;
import net.minecraft.util.Hand;

import java.util.Random;

public class AutoClicker extends Module {
    private int tickCounter;

    public AutoClicker() {
        super(ModuleCategory.COMBAT, "AutoClicker", "Longpress your attack keybind to hit entities automaticly");
    }

    @EventTarget
    private void onTick(TickEvent event) {
        if (this.isEnabled()) {
            this.tickCounter++;

            Random random = new Random();
            int randomDelay = random.nextInt(4 - 2) + 2;

            if (mc.gameSettings.keyBindAttack.isKeyDown() && this.tickCounter >= randomDelay) {
                mc.player.swingArm(Hand.MAIN_HAND);

                this.tickCounter = 0;

                if (MultiUtilities.getEntityFromRayTrace(mc.player.rotationYaw, mc.player.rotationPitch, 3.0F, 0.0) != null) {
                    Entity target = MultiUtilities.getEntityFromRayTrace(mc.player.rotationYaw, mc.player.rotationPitch, 3.0F, 0.0);

                    if (target != null) {
                        mc.getConnection().sendPacket(new CUseEntityPacket(target, mc.player.isSneaking()));
                        mc.player.swingArm(Hand.MAIN_HAND);
                    }
                }
            }
        }
    }
}
