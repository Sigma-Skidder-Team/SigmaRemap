package com.mentalfrostbyte.jello.module.impl.misc.gameplay;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.misc.GamePlay;
import com.mentalfrostbyte.jello.notification.Notification;
import mapped.Class7200;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SChatPacket;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;

public class JartexGamePlay extends Module {
    private GamePlay gameplayModule;

    public JartexGamePlay() {
        super(ModuleCategory.MISC, "Jartex", "Gameplay for Jartex network");
    }

    @Override
    public void initialize() {
        this.gameplayModule = (GamePlay) this.access();
    }

    @EventTarget
    private void onReceivePacket(ReceivePacketEvent event) {
        if (this.isEnabled() && mc.player != null) {
            IPacket packet = event.getPacket();
            if (packet instanceof SChatPacket) {
                SChatPacket chatPacket = (SChatPacket) packet;
                String chatMessage = chatPacket.getChatComponent().getString();
                String playerName = mc.player.getName().getString().toLowerCase();
                String messageContent = chatPacket.getChatComponent().getString();

                if (this.gameplayModule.getBooleanValueFromSettingName("AutoL") && (
                        messageContent.toLowerCase().contains("§r§7 has been killed by §r§a§l" + playerName) ||
                                messageContent.toLowerCase().contains("§r§7 was shot by §r§a§l" + playerName) ||
                                chatMessage.toLowerCase().contains("§r§7 was killed with dynamite by §r§a§l" + playerName))) {

                    this.gameplayModule.method16761(chatMessage);
                }

                if (messageContent.contains("§e§lPlay Again? §r§7Click here!§r")) {
                    if (this.gameplayModule.getBooleanValueFromSettingName("AutoGG")) {
                        this.gameplayModule.method16760();
                    }

                    if (this.gameplayModule.getBooleanValueFromSettingName("Auto Join")) {
                        for (ITextComponent sibling : chatPacket.getChatComponent().getSiblings()) {
                            ClickEvent clickEvent = sibling.getStyle().getClickEvent();
                            if (clickEvent != null && clickEvent.getAction() == ClickEvent$Action.RUN_COMMAND) {
                                long delay = (long) this.gameplayModule.getNumberValueBySettingName("Auto Join delay") * 1000L;
                                this.gameplayModule.method16759(new Class7200(clickEvent.getValue(), delay));
                                Client.getInstance().getNotificationManager().send(
                                        new Notification(
                                                "Auto Join",
                                                "Joining a new game in " + (this.gameplayModule.getNumberValueBySettingName("Auto Join delay") - 1.0F) + " seconds.",
                                                (int) (this.gameplayModule.getNumberValueBySettingName("Auto Join delay") - 1.0F) * 1000
                                        )
                                );
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
