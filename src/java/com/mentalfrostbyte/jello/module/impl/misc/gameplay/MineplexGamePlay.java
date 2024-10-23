package com.mentalfrostbyte.jello.module.impl.misc.gameplay;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.misc.GamePlay;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SChatPacket;

public class MineplexGamePlay extends Module {
    private GamePlay gameplayModule;
    private boolean gameWon;
    private final TimerUtil timerUtil = new TimerUtil();

    public MineplexGamePlay() {
        super(ModuleCategory.MISC, "Mineplex", "Gameplay for Mineplex");
    }

    @Override
    public void initialize() {
        this.gameplayModule = (GamePlay) this.access();
    }

    @Override
    public void onEnable() {
        this.gameWon = false;
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
                        chatMessage.toLowerCase().contains("killed by " + playerName + " ")) {
                    this.gameplayModule.method16761(chatMessage);
                }

                String[] winningColors = {"Green", "Red", "Blue", "Yellow"};

                for (String color : winningColors) {
                    if (chatMessage.equals(color + " won the game!")) {
                        this.timerUtil.reset();
                        this.gameWon = true;
                    }
                }
            }
        }
    }

    @EventTarget
    private void onWorldLoad(WorldLoadEvent event) {
        if (this.isEnabled()) {
            this.gameWon = false;
        }
    }

    @EventTarget
    private void onTick(TickEvent event) {
        if (this.isEnabled() && this.getBooleanValueFromSettingName("AutoGG") &&
                this.timerUtil.getElapsedTime() > 5000L && this.gameWon) {
            this.gameWon = false;
            this.timerUtil.reset();
            this.gameplayModule.method16760();
        }
    }
}
