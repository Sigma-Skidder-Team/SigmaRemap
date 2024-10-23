package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.MovementUtils;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class Unstuck extends Module {
    private int flagCount;
    private int unstuckDelay;

    public Unstuck() {
        super(ModuleCategory.MISC, "Unstuck", "Toggle this when an anticheat freezes you mid-air");
        this.registerSetting(new NumberSetting<Float>("Flags", "Maximum flag before trying to unstuck", 5.0F, Float.class, 2.0F, 20.0F, 1.0F));
    }

    @Override
    public void onEnable() {
        this.flagCount = 0;
    }

    @EventTarget
    public void onMove(EventMove event) {
        if (this.isEnabled()) {
            if ((float) this.flagCount >= this.getNumberValueBySettingName("Flags")) {
                MovementUtils.setSpeed(event, 0.0);
                event.setY(0.0);
                mc.player.setMotion(0.0, 0.0, 0.0);
            }
        }
    }

    @EventTarget
    public void onWorldLoad(WorldLoadEvent event) {
        if (this.isEnabled()) {
            this.flagCount = 0;
        }
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        if (this.isEnabled() && event.isPre()) {
            if (!mc.player.onGround && !MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
                if ((float) this.flagCount >= this.getNumberValueBySettingName("Flags") && this.unstuckDelay == 0) {
                    this.unstuckDelay = 60;
                    Client.getInstance().getNotificationManager().send(new Notification("Unstuck", "Trying to unstuck you.."));
                }

                if (this.unstuckDelay > 0) {
                    this.unstuckDelay--;
                    if (this.unstuckDelay == 0) {
                        this.flagCount = 0;
                    }

                    event.setCancelled(true);
                }
            } else {
                this.flagCount = 0;
            }
        }
    }

    @EventTarget
    public void onReceivePacket(ReceivePacketEvent event) {
        if (this.isEnabled()) {
            if (mc.player != null) {
                if (event.getPacket() instanceof SPlayerPositionLookPacket && !MultiUtilities.isAboveBounds(mc.player, 0.3F) && mc.player.ticksExisted > 10) {
                    this.flagCount++;
                    if ((float) this.flagCount > this.getNumberValueBySettingName("Flags")) {
                        event.setCancelled(true);
                    }
                }
            }
        }
    }
}
