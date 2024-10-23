package com.mentalfrostbyte.jello.module.impl.misc.gameplay;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.misc.GamePlay;
import com.mentalfrostbyte.jello.module.impl.render.NameProtect;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.Class7200;
import mapped.Class8375;
import mapped.Class9411;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SChatPacket;
import net.minecraft.network.play.server.STeamsPacket;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class HypixelGamePlay extends Module {
    private GamePlay gameplayModule;

    public HypixelGamePlay() {
        super(ModuleCategory.MISC, "Hypixel", "Gameplay for Hypixel");
        this.registerSetting(new BooleanSetting("FriendAccept", "Automatically accept friend requests", false));
        this.registerSetting(new BooleanSetting("Hide infos", "Hide scoreboard server informations & date when in-game", false));
    }

    @Override
    public void initialize() {
        this.gameplayModule = (GamePlay) this.access();
    }

    @EventTarget
    private void onReceivePacket(ReceivePacketEvent event) {
        if (mc.player != null) {
            IPacket packet = event.getPacket();
            if (packet instanceof SChatPacket) {
                SChatPacket chatPacket = (SChatPacket) packet;
                String chatMessage = chatPacket.getChatComponent().getString().replaceAll("§.", "");

                if (chatPacket.getType() != ChatType.SYSTEM && chatPacket.getType() != ChatType.CHAT) {
                    return;
                }

                String playerName = mc.player.getName().getString().toLowerCase();

                if (this.gameplayModule.getBooleanValueFromSettingName("AutoL")) {
                    String[] killPrefixes = {"MULTI ", "PENTA ", "QUADRA ", "TRIPLE ", "DOUBLE ", ""};
                    boolean isKillMessage = false;

                    for (String prefix : killPrefixes) {
                        if (chatMessage.startsWith(prefix + "KILL! ")) {
                            isKillMessage = true;
                            break;
                        }
                    }

                    if (isKillMessage) {
                        String[] messageParts = chatMessage.split(" ");
                        if (messageParts.length > 3) {
                            this.gameplayModule.method16761(messageParts[3]);
                        }
                    }

                    if (chatMessage.toLowerCase().contains("was killed by " + playerName) ||
                            chatMessage.toLowerCase().contains("was thrown into the void by " + playerName + ".") ||
                            chatMessage.toLowerCase().contains("was thrown off a cliff by " + playerName + ".") ||
                            chatMessage.toLowerCase().contains("was struck down by " + playerName + ".") ||
                            chatMessage.toLowerCase().contains("be sent to davy jones' locker by " + playerName + ".")) {

                        Scoreboard scoreboard = mc.world.method6805();
                        Class8375 teamClass = null;
                        ScorePlayerTeam playerTeam = scoreboard.method20998(mc.player.method2956());

                        if (playerTeam != null) {
                            int colorIndex = playerTeam.getColor().getColorIndex();
                            if (colorIndex >= 0) {
                                teamClass = scoreboard.method20989(3 + colorIndex);
                            }
                        }

                        Class8375 effectiveClass = teamClass != null ? teamClass : scoreboard.method20989(1);
                        Collection<Class9411> teamMembers = scoreboard.method20981(effectiveClass);
                        int remainingPlayers = -1;

                        for (Class9411 member : teamMembers) {
                            ScorePlayerTeam memberTeam = scoreboard.method20998(member.method36054());
                            String formattedName = ScorePlayerTeam.method28577(memberTeam, new StringTextComponent(member.method36054()))
                                    .getString().replaceAll("§t", "");

                            for (String keyword : new ArrayList<>(Arrays.asList("players left", "joueurs restants", "spieler verbleibend"))) {
                                if (formattedName.toLowerCase().contains(keyword + ":")) {
                                    String[] parts = formattedName.split(" ");
                                    if (parts.length > 2) {
                                        try {
                                            remainingPlayers = Integer.parseInt(parts[2]);
                                        } catch (NumberFormatException e) {
                                            // Handle parse exception
                                        }
                                        break;
                                    }
                                }
                            }
                        }

                        if (remainingPlayers > 2) {
                            this.gameplayModule.method16761(chatMessage);
                        }
                    }
                }

                if (this.getBooleanValueFromSettingName("FriendAccept") && chatMessage.contains("[ACCEPT] - [DENY] - [IGNORE]")) {
                    for (ITextComponent sibling : chatPacket.getChatComponent().getSiblings()) {
                        ClickEvent clickEvent = sibling.getStyle().getClickEvent();
                        if (clickEvent != null && clickEvent.getAction() == ClickEvent$Action.RUN_COMMAND && clickEvent.getValue().contains("/f accept")) {
                            MultiUtilities.sendChatMessage(clickEvent.getValue());
                        }
                    }
                }

                if (chatMessage.contains("Want to play again? Click here!") || chatMessage.contains("coins! (Win)")) {
                    if (this.gameplayModule.getBooleanValueFromSettingName("Auto Join")) {
                        for (ITextComponent sibling : chatPacket.getChatComponent().getSiblings()) {
                            ClickEvent clickEvent = sibling.getStyle().getClickEvent();
                            if (clickEvent != null && clickEvent.getAction() == ClickEvent$Action.RUN_COMMAND) {
                                Class7200 joinClass = new Class7200(clickEvent.getValue(),
                                        (long) this.gameplayModule.getNumberValueBySettingName("Auto Join delay") * 1000L);
                                this.gameplayModule.method16759(joinClass);
                            }
                        }
                    }

                    if (this.gameplayModule.getBooleanValueFromSettingName("AutoGG")) {
                        this.gameplayModule.method16760();
                    }
                }
            } else if (packet instanceof STeamsPacket && this.getBooleanValueFromSettingName("Hide infos")) {
                STeamsPacket teamsPacket = (STeamsPacket) packet;
                if (teamsPacket.getAction() == 2 && teamsPacket.getName().startsWith("team_")) {
                    String prefixSuffix = teamsPacket.getPrefix().getString() + teamsPacket.getSuffix().getString();
                    String[] parts = prefixSuffix.split(" ");
                    if (parts != null && parts.length > 1 && StringUtils.countMatches(parts[0], "/") == 2) {
                        event.setCancelled(true);
                    }
                }
            }
        }
    }
}
