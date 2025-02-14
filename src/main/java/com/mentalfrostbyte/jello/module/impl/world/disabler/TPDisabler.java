package com.mentalfrostbyte.jello.module.impl.world.disabler;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import net.minecraft.network.play.client.CPlayerPacket;

public class TPDisabler extends Module {
    private int tickCounter;

    public TPDisabler() {
        super(ModuleCategory.EXPLOIT, "TP", "Disabler working on some anticheats.");
        this.registerSetting(new NumberSetting<Float>("Delay", "Tp delay.", 20.0F, Float.class, 5.0F, 40.0F, 1.0F));
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Basic1", "Basic2", "MinInfinity", "MaxInfinity", "MinValue", "MaxValue"));
        this.registerSetting(new BooleanSetting("OnGround", "Send on ground packets.", false));
        this.registerSetting(new BooleanSetting("More Packets", "Send more packets.", false));
        this.registerSetting(new BooleanSetting("Ping spoof", "Spoof your ping.", false));
    }

    @Override
    public void onEnable() {
        this.tickCounter = 0;
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        if (this.isEnabled() && mc.player != null && event.isPre() && mc.getCurrentServerData() != null) {
            this.tickCounter++;
            double PosY = -4.503599627370497E15;
            String mode = this.getStringSettingValueByName("Mode");
            switch (mode) {
                case "Basic1":
                    PosY = mc.player.getPosY() - 20.0;
                    break;
                case "Basic2":
                    PosY = mc.player.getPosY() - 1000.0 + Math.random() * 1000.0;
                    break;
                case "MinInfinity":
                    PosY = Double.NEGATIVE_INFINITY;
                    break;
                case "MaxInfinity":
                    PosY = Double.POSITIVE_INFINITY;
                    break;
                case "MinValue":
                    PosY = Double.MIN_VALUE;
                    break;
                case "MaxValue":
                    PosY = Double.MAX_VALUE;
            }

            if ((float) this.tickCounter >= this.getNumberValueBySettingName("Delay")) {
                this.tickCounter = 0;
                boolean onGround = this.getBooleanValueFromSettingName("OnGround");
                if (this.getBooleanValueFromSettingName("More Packets")) {
                    mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(mc.player.getPosX(), PosY, mc.player.getPosX(), onGround));
                } else {
                    event.setY(PosY);
                    event.setGround(onGround);
                }
            }
        }
    }
}
