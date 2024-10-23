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

public class CubecraftGamePlay extends Module {
    private GamePlay gameplayModule;

    public CubecraftGamePlay() {
        super(ModuleCategory.MISC, "Cubecraft", "Gameplay for Cubecraft");
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
                String chatContent = chatPacket.getChatComponent().getString();
                String playerName = mc.player.getName().getString().toLowerCase();

                if (this.gameplayModule.getBooleanValueFromSettingName("AutoL") &&
                        (chatMessage.toLowerCase().contains("was slain by " + playerName) ||
                                chatMessage.toLowerCase().contains("burned to death while fighting " + playerName) ||
                                chatMessage.toLowerCase().contains("was shot by " + playerName) ||
                                chatMessage.toLowerCase().contains("burnt to a crisp while fighting " + playerName) ||
                                chatMessage.toLowerCase().contains("couldn't fly while escaping " + playerName) ||
                                chatMessage.toLowerCase().contains("thought they could survive in the void while escaping " + playerName) ||
                                chatMessage.toLowerCase().contains("fell to their death while escaping " + playerName) ||
                                chatMessage.toLowerCase().contains("died in the void while escaping " + playerName))) {
                    this.gameplayModule.method16761(chatMessage);
                }

                if (chatContent.contains("§a§lPlay Again §r§8• §r§6§lAuto Mode §r§8• §r§c§lLeave") &&
                        this.gameplayModule.getBooleanValueFromSettingName("Auto Join")) {
                    for (ITextComponent sibling : chatPacket.getChatComponent().getSiblings()) {
                        ClickEvent clickEvent = sibling.getStyle().getClickEvent();
                        if (clickEvent != null && clickEvent.getAction() == ClickEvent$Action.RUN_COMMAND && clickEvent.getValue().contains("playagain")) {
                            this.gameplayModule.method16759(new Class7200(clickEvent.getValue(),
                                    (long) this.gameplayModule.getNumberValueBySettingName("Auto Join delay") * 1000L));
                            Client.getInstance()
                                    .getNotificationManager()
                                    .send(new Notification("Auto Join", "Joining a new game in " +
                                            this.gameplayModule.getNumberValueBySettingName("Auto Join delay") + " seconds.",
                                            (int) (this.gameplayModule.getNumberValueBySettingName("Auto Join delay") - 1.0F) * 1000));
                            break;
                        }
                    }
                }

                if (this.gameplayModule.getBooleanValueFromSettingName("AutoGG") &&
                        chatContent.equalsIgnoreCase("§e" + mc.player.getName().getString() + "§r§a won the game!§r")) {
                    this.gameplayModule.method16760();
                }
            }
        }
    }
}
