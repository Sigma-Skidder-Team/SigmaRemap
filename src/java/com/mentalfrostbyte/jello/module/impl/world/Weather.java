package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.BooleanSetting;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.network.play.server.SUpdateTimePacket;
import mapped.NumberSetting;

public class Weather extends Module {
    private float field23538;
    private boolean field23539;

    public Weather() {
        super(ModuleCategory.WORLD, "Weather", "Removes rain and changes the world's time");
        this.registerSetting(new BooleanSetting("Custom time", "Set the world time", true));
        this.registerSetting(new NumberSetting<Float>("Time", "Time to set the world to", 12000.0F, Float.class, 0.0F, 24000.0F, 1.0F).method18616(var1 -> {
            if (this.getBooleanValueFromSetttingName("Custom time") && this.isEnabled()) {
                mc.world.method6834(-((long) this.getNumberValueBySettingName("Time")));
            }
        }));
        this.registerSetting(new BooleanSetting("Disable rain", "Disable rain", true));
    }

    @Override
    public void onEnable() {
        this.field23538 = mc.world.method6792(1.0F);
        if (mc.world.method6792(1.0F) != 1.0F) {
            if (mc.world.method6792(1.0F) == 0.0F) {
                this.field23539 = false;
            }
        } else {
            this.field23539 = true;
        }

        mc.world.method6834((long) this.getNumberValueBySettingName("Time"));
    }

    @EventTarget
    private void method16230(TickEvent var1) {
        if (this.isEnabled()) {
            if (!this.getBooleanValueFromSetttingName("Disable rain")) {
                if (this.field23539) {
                    if (!(this.field23538 < 1.0F)) {
                        if (this.field23538 > 1.0F) {
                            this.field23538 = 1.0F;
                        }
                    } else {
                        this.field23538 = (float) ((double) this.field23538 + 0.05);
                    }
                }
            } else if (!(this.field23538 > 0.0F)) {
                if (this.field23538 < 0.0F) {
                    this.field23538 = 0.0F;
                }
            } else {
                this.field23538 = (float) ((double) this.field23538 - 0.05);
            }

            mc.world.method6793(this.field23538);
            mc.world.method6791(this.field23538);
        }
    }

    @EventTarget
    private void method16231(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (!(var1.getPacket() instanceof SUpdateTimePacket)) {
                if (var1.getPacket() instanceof SChangeGameStatePacket) {
                    SChangeGameStatePacket var4 = (SChangeGameStatePacket) var1.getPacket();
                    if (var4.method17397().field43543 == 7) {
                        if (var4.method17398() != 1.0F) {
                            if (var4.method17398() == 0.0F) {
                                this.field23539 = false;
                            }
                        } else {
                            this.field23539 = true;
                        }

                        if (!this.getBooleanValueFromSetttingName("Disable rain")) {
                            this.field23538 = var4.method17398();
                        } else {
                            var1.method13899(new SChangeGameStatePacket(var4.method17397(), 0.0F));
                            this.field23538 = 0.0F;
                        }
                    }
                }
            } else if (this.getBooleanValueFromSetttingName("Custom time")) {
                var1.method13899(new SUpdateTimePacket(-((long) this.getNumberValueBySettingName("Time")), -((long) this.getNumberValueBySettingName("Time")), true));
            }
        }
    }
}
