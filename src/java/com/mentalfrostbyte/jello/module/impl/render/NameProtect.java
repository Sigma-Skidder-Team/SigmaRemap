package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.TextReplaceEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.InputSetting;
import mapped.*;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.*;
import net.minecraft.util.text.StringTextComponent;

import java.util.List;

public class NameProtect extends Module {
    public NameProtect() {
        super(ModuleCategory.RENDER, "NameProtect", "Useful for recording/streaming");
        this.registerSetting(new InputSetting("Username", "The name which your username is replaced with", "Me"));
    }

    @EventTarget
    public void TextReplaceEvent(TextReplaceEvent event) {
        if (this.isEnabled()) {
            event.setText(event.setText().replaceAll(mc.getSession().getUsername(), this.getStringSettingValueByName("Username")));
        }
    }

    @EventTarget
    public void onReceivePacket(ReceivePacketEvent receivePacketEvent) {
        if (this.isEnabled()) {
            IPacket packet = receivePacketEvent.getPacket();

            if (packet instanceof SUpdateScorePacket) {
                SUpdateScorePacket scorePacket = (SUpdateScorePacket) packet;
                if (scorePacket.method17476() == Class2073.field13503) {
                    String originalUsername = scorePacket.method17473();
                    String replacementUsername = this.getStringSettingValueByName("Username");
                    if (originalUsername.contains(mc.getSession().getUsername())) {
                        originalUsername = originalUsername.replaceAll(mc.getSession().getUsername(), replacementUsername);
                        receivePacketEvent.setPacket(new SUpdateScorePacket(scorePacket.method17476(), scorePacket.method17474(), originalUsername, scorePacket.method17475()));
                    }
                }
            }

            if (packet instanceof SChatPacket) {
                SChatPacket chatPacket = (SChatPacket) packet;
            }

            if (packet instanceof SPlayerListItemPacket) {
                SPlayerListItemPacket playerListPacket = (SPlayerListItemPacket) packet;
                List<SPlayerListItemPacket.AddPlayerData> playerEntries = playerListPacket.getEntries();

                for (SPlayerListItemPacket.AddPlayerData playerData : playerEntries) {
                    if (playerData.getDisplayName() != null) {
                        String displayName = playerData.getDisplayName().getString();
                        String replacementUsername = this.getStringSettingValueByName("Username");
                        if (displayName.contains(mc.getSession().getUsername())) {
                            displayName = displayName.replaceAll(mc.getSession().getUsername(), replacementUsername);
                            playerData.displayName = new StringTextComponent(displayName);
                        }
                    }
                }

                playerListPacket.players = playerEntries;
            }

            if (packet instanceof SUpdateBossInfoPacket) {
                SUpdateBossInfoPacket bossInfoPacket = (SUpdateBossInfoPacket) packet;
                if (bossInfoPacket.getName() == null) {
                    return;
                }

                String bossName = bossInfoPacket.getName().getString();
                String replacementUsername = this.getStringSettingValueByName("Username");
                if (bossName.contains(mc.getSession().getUsername())) {
                    bossName = bossName.replaceAll(mc.getSession().getUsername(), replacementUsername);
                    bossInfoPacket.setName(new StringTextComponent(bossName));
                }
            }

            if (packet instanceof STitlePacket) {
                STitlePacket titlePacket = (STitlePacket) packet;
                if (titlePacket.method17570() == null) {
                    return;
                }

                String titleText = titlePacket.method17570().getString();
                String replacementUsername = this.getStringSettingValueByName("Username");
                if (titleText.contains(mc.getSession().getUsername())) {
                    titleText = titleText.replaceAll(mc.getSession().getUsername(), replacementUsername);
                    receivePacketEvent.setPacket(new STitlePacket(titlePacket.method17569(), new StringTextComponent(titleText), titlePacket.method17571(), titlePacket.method17572(), titlePacket.method17573()));
                }
            }
        }
    }
}
