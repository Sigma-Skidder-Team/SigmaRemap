package com.mentalfrostbyte.jello.module.impl.world.disabler;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import net.minecraft.network.play.client.CPlayerPacket;

public class TPDisabler extends Module {
    private int field23517;

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
        this.field23517 = 0;
    }

    @EventTarget
    public void method16197(EventUpdate var1) {
        if (this.isEnabled() && mc.player != null && var1.isPre() && mc.getCurrentServerData() != null) {
            this.field23517++;
            double var4 = -4.503599627370497E15;
            String var6 = this.getStringSettingValueByName("Mode");
            switch (var6) {
                case "Basic1":
                    var4 = mc.player.getPosY() - 20.0;
                    break;
                case "Basic2":
                    var4 = mc.player.getPosY() - 1000.0 + Math.random() * 1000.0;
                    break;
                case "MinInfinity":
                    var4 = Double.NEGATIVE_INFINITY;
                    break;
                case "MaxInfinity":
                    var4 = Double.POSITIVE_INFINITY;
                    break;
                case "MinValue":
                    var4 = Double.MIN_VALUE;
                    break;
                case "MaxValue":
                    var4 = Double.MAX_VALUE;
            }

            if ((float) this.field23517 >= this.getNumberValueBySettingName("Delay")) {
                this.field23517 = 0;
                boolean var8 = this.getBooleanValueFromSettingName("OnGround");
                if (this.getBooleanValueFromSettingName("More Packets")) {
                    mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(mc.player.getPosX(), var4, mc.player.getPosX(), var8));
                } else {
                    var1.setY(var4);
                    var1.setGround(var8);
                }
            }
        }
    }
}
