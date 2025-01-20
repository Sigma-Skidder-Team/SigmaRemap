package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtils;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class Unstuck extends Module {
    private int field23574;
    private int field23575;

    public Unstuck() {
        super(ModuleCategory.MISC, "Unstuck", "Toggle this when an anticheat freeze you mid-air");
        this.registerSetting(new NumberSetting<Float>("Flags", "Maximum flag before trying to unstuck", 5.0F,
                Float.class, 2.0F, 20.0F, 1.0F));
    }

    @Override
    public void onEnable() {
        this.field23574 = 0;
    }

    @EventTarget
    public void method16285(EventMove var1) {
        if (this.isEnabled()) {
            if ((float) this.field23574 >= this.getNumberValueBySettingName("Flags")) {
                MovementUtils.setSpeed(var1, 0.0);
                var1.setY(0.0);
                mc.player.setMotion(0.0, 0.0, 0.0);
            }
        }
    }

    @EventTarget
    public void method16286(WorldLoadEvent var1) {
        if (this.isEnabled()) {
            this.field23574 = 0;
        }
    }

    @EventTarget
    public void method16287(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            if (!mc.player.onGround && !MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
                if ((float) this.field23574 >= this.getNumberValueBySettingName("Flags") && this.field23575 == 0) {
                    this.field23575 = 60;
                    Client.getInstance().notificationManager
                            .send(new Notification("Unstuck", "Trying to unstuck you.."));
                }

                if (this.field23575 > 0) {
                    this.field23575--;
                    if (this.field23575 == 0) {
                        this.field23574 = 0;
                    }

                    var1.setCancelled(true);
                }
            } else {
                this.field23574 = 0;
            }
        }
    }

    @EventTarget
    public void method16288(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null) {
                if (var1.getPacket() instanceof SPlayerPositionLookPacket
                        && !MultiUtilities.isAboveBounds(mc.player, 0.3F) && mc.player.ticksExisted > 10) {
                    this.field23574++;
                    if ((float) this.field23574 > this.getNumberValueBySettingName("Flags")) {
                        var1.setCancelled(true);
                    }
                }
            }
        }
    }
}
