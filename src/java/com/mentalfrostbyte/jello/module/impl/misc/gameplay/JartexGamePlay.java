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
    private GamePlay field23527;

    public JartexGamePlay() {
        super(ModuleCategory.MISC, "Jartex", "Gameplay for Jartex network");
    }

    @Override
    public void method15953() {
        this.field23527 = (GamePlay) this.access();
    }

    @EventTarget
    private void method16219(ReceivePacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            IPacket var4 = var1.getPacket();
            if (var4 instanceof SChatPacket) {
                SChatPacket var5 = (SChatPacket) var4;
                String var6 = var5.getChatComponent().getString();
                String var7 = mc.player.getName().getString().toLowerCase();
                String var8 = var5.getChatComponent().getString();
                if (this.field23527.getBooleanValueFromSetttingName("AutoL")
                        && (
                        var8.toLowerCase().contains("§r§7 has been killed by §r§a§l" + var7)
                                || var8.toLowerCase().contains("§r§7 was shot by §r§a§l" + var7)
                                || var6.toLowerCase().contains("§r§7 was killed with dynamite by §r§a§l" + var7)
                )) {
                    this.field23527.method16761(var6);
                }

                if (var8.contains("§e§lPlay Again? §r§7Click here!§r")) {
                    if (this.field23527.getBooleanValueFromSetttingName("AutoGG")) {
                        this.field23527.method16760();
                    }

                    if (this.field23527.getBooleanValueFromSetttingName("Auto Join")) {
                        for (ITextComponent var10 : var5.getChatComponent().getSiblings()) {
                            ClickEvent var11 = var10.getStyle().getClickEvent();
                            if (var11 != null && var11.getAction() == ClickEvent$Action.RUN_COMMAND) {
                                this.field23527.method16759(new Class7200(var11.getValue(), (long) this.field23527.getNumberValueBySettingName("Auto Join delay") * 1000L));
                                Client.getInstance()
                                        .getNotificationManager()
                                        .send(
                                                new Notification(
                                                        "Auto Join", "Joining a new game in 3 seconds.", (int) (this.field23527.getNumberValueBySettingName("Auto Join delay") - 1.0F) * 1000
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
