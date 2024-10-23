package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.network.play.server.SPlayerListItemPacket;
import net.minecraft.util.text.ITextComponent;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class AntiVanish extends Module {
    private final List<UUID> vanishedPlayers = new CopyOnWriteArrayList<>();
    private int tickCounter = -3200;

    public AntiVanish() {
        super(ModuleCategory.WORLD, "AntiVanish", "Detects if there are vanished players");
    }

    @EventTarget
    private void onUpdate(EventUpdate event) {
        if (this.isEnabled()) {
            if (event.isPre() && mc.getCurrentServerData() != null) {
                if (!this.vanishedPlayers.isEmpty()) {
                    if (this.tickCounter > 3200) {
                        this.vanishedPlayers.clear();
                        Client.getInstance().getNotificationManager().send(new Notification("Vanished Cleared", "Vanish List has been Cleared.", 5500));
                        this.tickCounter = -3200;
                    } else {
                        this.tickCounter++;
                    }
                }

                if (this.vanishedPlayers != null) {
                    try {
                        for (UUID playerId : this.vanishedPlayers) {
                            NetworkPlayerInfo playerInfo = mc.getConnection().method15792(playerId);
                            ITextComponent playerName = playerInfo == null ? null : playerInfo.method19979();
                            if (playerInfo != null && this.vanishedPlayers.contains(playerId)) {
                                if (playerName == null) {
                                    Client.getInstance().getNotificationManager()
                                            .send(new Notification("Vanished Warning", "A player is vanished !!" + playerInfo.method19979().getUnformattedComponentText(), 5500));
                                } else {
                                    Client.getInstance().getNotificationManager()
                                            .send(new Notification("Vanish Warning", playerInfo.method19979().getString() + " is no longer Vanished.", 5500));
                                }
                            }

                            this.vanishedPlayers.remove(playerId);
                        }
                    } catch (Exception e) {
                        Client.getInstance().getNotificationManager().send(new Notification("Vanished Error", "Something bad happened.", 5500));
                    }
                }
            }
        }
    }

    @EventTarget
    private void onReceivePacket(ReceivePacketEvent event) {
        if (this.isEnabled()) {
            if (mc.getConnection() != null && event.getPacket() instanceof SPlayerListItemPacket) {
                SPlayerListItemPacket packet = (SPlayerListItemPacket) event.getPacket();
                if (packet.getAction() == SPlayerListItemPacket.Action.UPDATE_LATENCY) {
                    for (SPlayerListItemPacket.AddPlayerData playerData : packet.getEntries()) {
                        NetworkPlayerInfo playerInfo = mc.getConnection().method15792(playerData.getProfile().getId());
                        if (playerInfo == null && !this.addVanishedPlayer(playerData.getProfile().getId())) {
                            System.out.println(playerData.getProfile().getId());
                            Client.getInstance().getNotificationManager().send(new Notification("Vanished Warning", "A player is vanished!", 5500));
                            this.tickCounter = -3200;
                        }
                    }
                }
            }
        }
    }

    private boolean addVanishedPlayer(UUID playerId) {
        if (!this.vanishedPlayers.contains(playerId)) {
            this.vanishedPlayers.add(playerId);
            return false;
        } else {
            return true;
        }
    }
}
