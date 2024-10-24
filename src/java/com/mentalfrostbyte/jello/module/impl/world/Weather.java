package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.network.play.server.SUpdateTimePacket;

public class Weather extends Module {
    private float rainLevel;
    private boolean isRaining;

    public Weather() {
        super(ModuleCategory.WORLD, "Weather", "Removes rain and changes the world's time");
        this.registerSetting(new BooleanSetting("Custom time", "Set the world time", true));
        this.registerSetting(new NumberSetting<Float>("Time", "Time to set the world to", 12000.0F, Float.class, 0.0F, 24000.0F, 1.0F).addObserver(setting -> {
            if (this.getBooleanValueFromSettingName("Custom time") && this.isEnabled()) {
                mc.world.setDayTime(-((long) this.getNumberValueBySettingName("Time")));
            }
        }));
        this.registerSetting(new BooleanSetting("Disable rain", "Disable rain", true));
    }

    @Override
    public void onEnable() {
        this.rainLevel = mc.world.method6792(1.0F);
        this.isRaining = this.rainLevel == 1.0F;

        mc.world.setDayTime((long) this.getNumberValueBySettingName("Time"));
    }

    @EventTarget
    private void onTick(TickEvent event) {
        if (this.isEnabled()) {
            if (!this.getBooleanValueFromSettingName("Disable rain")) {
                if (this.isRaining) {
                    if (this.rainLevel < 1.0F) {
                        this.rainLevel += 0.05F;
                        if (this.rainLevel > 1.0F) {
                            this.rainLevel = 1.0F;
                        }
                    }
                }
            } else {
                if (this.rainLevel > 0.0F) {
                    this.rainLevel -= 0.05F;
                    if (this.rainLevel < 0.0F) {
                        this.rainLevel = 0.0F;
                    }
                }
            }

            mc.world.method6793(this.rainLevel);
            mc.world.method6791(this.rainLevel);
        }
    }

    @EventTarget
    private void onReceivePacket(ReceivePacketEvent event) {
        if (this.isEnabled()) {
            if (!(event.getPacket() instanceof SUpdateTimePacket)) {
                if (event.getPacket() instanceof SChangeGameStatePacket) {
                    SChangeGameStatePacket packet = (SChangeGameStatePacket) event.getPacket();
                    if (packet.method17397().field43543 == 7) {
                        this.isRaining = packet.method17398() != 0.0F;
                        if (!this.getBooleanValueFromSettingName("Disable rain")) {
                            this.rainLevel = packet.method17398();
                        } else {
                            event.setPacket(new SChangeGameStatePacket(packet.method17397(), 0.0F));
                            this.rainLevel = 0.0F;
                        }
                    }
                }
            } else if (this.getBooleanValueFromSettingName("Custom time")) {
                event.setPacket(new SUpdateTimePacket(-((long) this.getNumberValueBySettingName("Time")), -((long) this.getNumberValueBySettingName("Time")), true));
            }
        }
    }
}
