package com.mentalfrostbyte.jello.module.impl.misc.gameplay;

import com.mentalfrostbyte.Client;
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
    private GamePlay field23626;

    public HypixelGamePlay() {
        super(ModuleCategory.MISC, "Hypixel", "Gameplay for Hypixel");
        this.registerSetting(new BooleanSetting("FriendAccept", "Automatically accept friend requests", false));
        this.registerSetting(new BooleanSetting("Hide infos", "Hide scoreboard server informations & date when ingame", false));
    }

    @Override
    public void initialize() {
        this.field23626 = (GamePlay) this.access();
    }

    @EventTarget
    private void method16372(ReceivePacketEvent var1) {
        if (mc.player != null) {
            IPacket var4 = var1.getPacket();
            if (var4 instanceof SChatPacket) {
                SChatPacket var5 = (SChatPacket) var4;
                String var6 = var5.getChatComponent().getString().replaceAll("§.", "");
                if (var5.getType() != ChatType.SYSTEM && var5.getType() != ChatType.CHAT) {
                    return;
                }

                String var7 = mc.player.getName().getString().toLowerCase();
                if (Client.getInstance().moduleManager.getModuleByClass(NameProtect.class).isEnabled()) {
                }

                if (this.field23626.getBooleanValueFromSettingName("AutoL")) {
                    String[] var8 = new String[]{"MULTI ", "PENTA ", "QUADRA ", "TRIPLE ", "DOUBLE ", ""};
                    boolean var9 = false;

                    for (int var10 = 0; var10 < 6; var10++) {
                        if (var6.startsWith(var8[var10] + "KILL! ")) {
                            var9 = true;
                            break;
                        }
                    }

                    if (var9) {
                        String[] var33 = var6.split(" ");
                        if (var33.length > 3) {
                            this.field23626.method16761(var33[3]);
                        }
                    }

                    if (var6.toLowerCase().contains("was killed by " + var7)
                            || var6.toLowerCase().contains("was thrown into the void by " + var7 + ".")
                            || var6.toLowerCase().contains("was thrown off a cliff by " + var7 + ".")
                            || var6.toLowerCase().contains("was struck down by " + var7 + ".")
                            || var6.toLowerCase().contains("be sent to davy jones' locker by " + var7 + ".")) {
                        Scoreboard var34 = mc.world.getScoreboard();
                        Class8375 var11 = null;
                        ScorePlayerTeam var12 = var34.method20998(mc.player.method2956());
                        if (var12 != null) {
                            int var13 = var12.getColor().getColorIndex();
                            if (var13 >= 0) {
                                var11 = var34.method20989(3 + var13);
                            }
                        }

                        Class8375 var38 = var11 != null ? var11 : var34.method20989(1);
                        Collection<Class9411> var14 = var34.method20981(var38);
                        int var15 = -1;

                        label155:
                        for (Class9411 var17 : var14) {
                            ScorePlayerTeam var18 = var34.method20998(var17.method36054());
                            String var19 = ScorePlayerTeam.method28577(var18, new StringTextComponent(var17.method36054())).getString().replaceAll("§t", "");

                            for (String var22 : new ArrayList<String>(Arrays.asList("players left", "joueurs restants", "spieler verbleibend"))) {
                                if (var19.toLowerCase().contains(var22 + ":")) {
                                    String[] var23 = var19.split(" ");
                                    if (var23.length > 2) {
                                        try {
                                            var15 = Integer.parseInt(var23[2]);
                                        } catch (NumberFormatException var25) {
                                        }
                                        break label155;
                                    }
                                }
                            }
                        }

                        if (var15 > 2) {
                            this.field23626.method16761(var6);
                        }
                    }
                }

                if (this.getBooleanValueFromSettingName("FriendAccept") && var6.contains("[ACCEPT] - [DENY] - [IGNORE]")) {
                    for (ITextComponent var31 : var5.getChatComponent().getSiblings()) {
                        ClickEvent var35 = var31.getStyle().getClickEvent();
                        if (var35 != null && var35.getAction() == ClickEvent$Action.RUN_COMMAND && var35.getValue().contains("/f accept")) {
                            MultiUtilities.sendChatMessage(var35.getValue());
                        }
                    }
                }

                if (var6.contains("Want to play again? Click here! ") || var6.contains("coins! (Win)")) {
                    if (this.field23626.getBooleanValueFromSettingName("Auto Join")) {
                        for (ITextComponent var32 : var5.getChatComponent().getSiblings()) {
                            ClickEvent var36 = var32.getStyle().getClickEvent();
                            if (var36 != null && var36.getAction() == ClickEvent$Action.RUN_COMMAND) {
                                Class7200 var37 = new Class7200(var36.getValue(), (long) this.field23626.getNumberValueBySettingName("Auto Join delay") * 1000L);
                                this.field23626.method16759(var37);
                            }
                        }
                    }

                    if (this.field23626.getBooleanValueFromSettingName("AutoGG")) {
                        this.field23626.method16760();
                    }
                }
            } else if (var4 instanceof STeamsPacket && this.getBooleanValueFromSettingName("Hide infos")) {
                STeamsPacket var26 = (STeamsPacket) var4;
                if (var26.getAction() == 2 && var26.getName().startsWith("team_")) {
                    String var27 = var26.getPrefix().getString() + var26.getSuffix().getString();
                    String[] var28 = var27.split(" ");
                    if (var28 != null && var28.length > 1 && StringUtils.countMatches(var28[0], "/") == 2) {
                        var1.setCancelled(true);
                    }
                }
            }
        }
    }
}
