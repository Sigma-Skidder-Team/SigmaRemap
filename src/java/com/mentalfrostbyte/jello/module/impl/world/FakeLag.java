package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.*;

import java.util.ArrayList;

public class FakeLag extends Module {
    private final ArrayList<IPacket<?>> packets = new ArrayList<>();
    private final TimerUtil timerUtil = new TimerUtil();
    private boolean isLagging;

    public FakeLag() {
        super(ModuleCategory.WORLD, "FakeLag", "Other players will see you lagging !");
        this.registerSetting(
                new NumberSetting<Float>("Lag duration", "The lags duration", 0.3F, Float.class, 0.1F, 2.0F, 0.01F));
        this.registerSetting(
                new NumberSetting<Float>("Delay", "The lags cooldown", 0.4F, Float.class, 0.1F, 2.0F, 0.01F));
        this.registerSetting(new BooleanSetting("Combat", "Delay combat packets", true));
        this.registerSetting(new BooleanSetting("Blocks", "Delay blocks packets", true));
        this.registerSetting(new BooleanSetting("Ping", "Delay ping packets", true));
        this.timerUtil.start();
    }

    @Override
    public void onEnable() {
        this.packets.clear();
        this.isLagging = false;
        this.timerUtil.reset();
    }

    @Override
    public void onDisable() {
        for (IPacket<?> packet : this.packets) {
            mc.getConnection().networkManager.sendNoEventPacket(packet);
        }
    }

    @EventTarget
    private void onWorldLoad(WorldLoadEvent event) {
        if (this.isEnabled()) {
            this.packets.clear();
            this.isLagging = false;
            this.timerUtil.reset();
        }
    }

    @EventTarget
    private void onSendPacket(SendPacketEvent event) {
        if (!this.isEnabled() || mc.getConnection() == null) {
            return;
        }

        if (!this.isLagging) {
            // Check if delay period has passed, then start lagging
            if (this.timerUtil.getElapsedTime() > this.getNumberValueBySettingName("Delay") * 1000.0F) {
                this.isLagging = true;
                this.timerUtil.reset();
            }
        } else {
            // If lag duration has not ended, process packets
            if (this.timerUtil.getElapsedTime() <= this.getNumberValueBySettingName("Lag duration") * 1000.0F) {
                IPacket<?> packet = event.getPacket();

                // Check for packet types and module settings
                if (shouldDelayPacket(packet)) {
                    this.packets.add(packet);
                    event.setCancelled(true);
                }
            } else {
                // End lagging and send all delayed packets
                this.isLagging = false;
                this.timerUtil.reset();

                for (IPacket<?> packet : this.packets) {
                    mc.getConnection().networkManager.sendNoEventPacket(packet);
                }
                this.packets.clear();
            }
        }
    }

    private boolean shouldDelayPacket(IPacket<?> packet) {
        if (packet instanceof CPlayerPacket) {
            return false;
        }

        if (packet instanceof CKeepAlivePacket || packet instanceof CConfirmTransactionPacket) {
            return this.getBooleanValueFromSettingName("Ping");
        }

        if (packet instanceof CUseEntityPacket || packet instanceof CAnimateHandPacket) {
            return this.getBooleanValueFromSettingName("Combat");
        }

        if (packet instanceof CPlayerTryUseItemPacket || packet instanceof CPlayerDiggingPacket
                || packet instanceof CPlayerTryUseItemOnBlockPacket) {
            return this.getBooleanValueFromSettingName("Blocks");
        }

        return false;
    }
}
