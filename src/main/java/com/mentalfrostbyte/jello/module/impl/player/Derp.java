package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import net.minecraft.network.play.client.CEntityActionPacket;
import net.minecraft.util.Hand;

import java.util.Random;

public class Derp extends Module {
    private Random random = new Random();
    private boolean releaseShift;
    private int hitCounter;
    private int spinCounter;

    public Derp() {
        super(ModuleCategory.PLAYER, "Derp", "Spazzes around");
        this.registerSetting(new ModeSetting("Rotation Mode", "Rotation Mode", 0, "Random", "Spin", "None"));
        this.registerSetting(new BooleanSetting("Hit", "Randomly hit", true));
        this.registerSetting(new BooleanSetting("Sneak", "Randomly sneak", true));
    }

    @EventTarget
    public void onUpdate(EventUpdate event) { // meh
        if (this.isEnabled() && event.isPre()) {
            if (this.getBooleanValueFromSettingName("Sneak")) {
                if (this.releaseShift) {
                    mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.RELEASE_SHIFT_KEY));
                } else {
                    mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.PRESS_SHIFT_KEY));
                }
            }

            this.releaseShift = !this.releaseShift;
            this.hitCounter++;
            if (this.getBooleanValueFromSettingName("Hit") && this.hitCounter > this.random.nextInt(5) + 3) {
                this.hitCounter = 0;
                Hand hand = Hand.values()[this.random.nextInt(1)];
                mc.player.swingArm(hand);
            }

            String rotationMode = this.getStringSettingValueByName("Rotation Mode");
            switch (rotationMode) {
                case "Random":
                    event.setYaw(this.random.nextFloat() * 360.0F);
                    event.setPitch(this.random.nextFloat() * 180.0F - 90.0F);
                    break;
                case "Spin":
                    this.spinCounter += 20;

                    while (this.spinCounter > 360) {
                        this.spinCounter -= 360;
                    }

                    event.setYaw((float) this.spinCounter + this.random.nextFloat());
            }
        }
    }

    @Override
    public void onEnable() {
        this.spinCounter = (int) mc.player.rotationYaw;
    }
}
