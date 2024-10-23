package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.play.server.SEntityPacket;
import net.minecraft.network.play.server.SPlayerListItemPacket;

import java.util.HashMap;

public class StaffRepealer extends Module {
    private final HashMap<Integer, Integer> playerMap = new HashMap<>();

    public StaffRepealer() {
        super(ModuleCategory.MISC, "StaffRepealer", "Repeals Hypixel's staff ban laws with a simple rage quit!");
    }

    @EventTarget
    private void onTick(TickEvent event) {
        if (this.isEnabled() && MultiUtilities.isHypixel()) {
            mc.gameSettings.method37149();
        }
    }

    @EventTarget
    private void onReceivePacket(ReceivePacketEvent event) {
        if (this.isEnabled()) {
            if (event.getPacket() instanceof SEntityPacket) {
                SEntityPacket entityPacket = (SEntityPacket) event.getPacket();
                // Additional processing for SEntityPacket can be added here if needed
            }

            if (event.getPacket() instanceof SPlayerListItemPacket) {
                SPlayerListItemPacket playerListPacket = (SPlayerListItemPacket) event.getPacket();
                new Thread(() -> {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    for (SPlayerListItemPacket.AddPlayerData playerData : playerListPacket.getEntries()) {
                        PlayerEntity playerEntity = mc.world.method7196(playerData.getProfile().getId());
                        if (playerEntity == null && playerData.getGameMode() != null) {
                            MultiUtilities.addChatMessage("Detected an anomaly: " + playerData + " " + playerData.getProfile());
                        } else {
                            System.out.println("All seems good: " + playerData + " " + playerData.getProfile());
                        }
                    }
                }).start();
            }
        }
    }
}
