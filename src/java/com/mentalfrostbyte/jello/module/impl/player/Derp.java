package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import mapped.*;
import net.minecraft.network.play.client.CEntityActionPacket;
import net.minecraft.util.Hand;

import java.util.Random;

public class Derp extends Module {
    private Random field23434 = new Random();
    private boolean field23435;
    private int field23436;
    private int field23437;

    public Derp() {
        super(ModuleCategory.PLAYER, "Derp", "Spazzes around");
        this.registerSetting(new ModeSetting("Rotation Mode", "Rotation Mode", 0, "Random", "Spin", "None"));
        this.registerSetting(new BooleanSetting("Hit", "Randomly hit", true));
        this.registerSetting(new BooleanSetting("Sneak", "Randomly sneak", true));
    }

    @EventTarget
    public void method16065(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            if (this.getBooleanValueFromSetttingName("Sneak")) {
                if (this.field23435) {
                    mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.RELEASE_SHIFT_KEY));
                } else {
                    mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.PRESS_SHIFT_KEY));
                }
            }

            this.field23435 = !this.field23435;
            this.field23436++;
            if (this.getBooleanValueFromSetttingName("Hit") && this.field23436 > this.field23434.nextInt(5) + 3) {
                this.field23436 = 0;
                Hand var4 = Hand.values()[this.field23434.nextInt(1)];
                mc.player.swingArm(var4);
            }

            String var6 = this.getStringSettingValueByName("Rotation Mode");
            switch (var6) {
                case "Random":
                    var1.setPitch(this.field23434.nextFloat() * 360.0F);
                    var1.setYaw(this.field23434.nextFloat() * 180.0F - 90.0F);
                    break;
                case "Spin":
                    this.field23437 += 20;

                    while (this.field23437 > 360) {
                        this.field23437 -= 360;
                    }

                    var1.setPitch((float) this.field23437 + this.field23434.nextFloat());
            }
        }
    }

    @Override
    public void onEnable() {
        this.field23437 = (int) mc.player.rotationYaw;
    }
}
