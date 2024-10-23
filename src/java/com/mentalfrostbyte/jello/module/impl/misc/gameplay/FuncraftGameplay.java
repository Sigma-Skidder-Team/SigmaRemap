package com.mentalfrostbyte.jello.module.impl.misc.gameplay;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.misc.GamePlay;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SChatPacket;

public class FuncraftGameplay extends Module {
    private GamePlay gameplayModule;

    public FuncraftGameplay() {
        super(ModuleCategory.MISC, "Funcraft", "Gameplay for Funcraft");
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

                if (this.gameplayModule.getBooleanValueFromSettingName("AutoL") &&
                        (chatMessage.toLowerCase().contains("a été tué par " + playerName) ||
                                chatMessage.toLowerCase().contains("a été tué par le vide et " + playerName))) {
                    this.gameplayModule.method16761(chatMessage);
                }
            }
        }
    }
}
