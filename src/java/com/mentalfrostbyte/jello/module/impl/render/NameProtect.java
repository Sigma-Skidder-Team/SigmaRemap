package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.TextReplaceEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.InputSetting;
import mapped.*;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.*;
import net.minecraft.util.text.StringTextComponent;

import java.util.List;

public class NameProtect extends Module {
    public NameProtect() {
        super(ModuleCategory.RENDER, "NameProtect", "Useful for recording/streaming");
        this.registerSetting(new InputSetting("Username", "The name which your username is replaced with", "Me"));
    }

    @EventTarget
    public void method16883(TextReplaceEvent var1) {
        if (this.isEnabled()) {
            var1.setText(var1.setText().replaceAll(mc.getSession().getUsername(), this.getStringSettingValueByName("Username")));
        }
    }

    @EventTarget
    public void method16884(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof SUpdateScorePacket) {
                SUpdateScorePacket var5 = (SUpdateScorePacket) var4;
                if (var5.method17476() == Class2073.field13503) {
                    String var6 = var5.method17473();
                    if (var6.contains(mc.getSession().getUsername())) {
                        var6 = var6.replaceAll(mc.getSession().getUsername(), this.getStringSettingValueByName("Username"));
                        var1.method13899(new SUpdateScorePacket(var5.method17476(), var5.method17474(), var6, var5.method17475()));
                    }
                }
            }

            if (var4 instanceof SChatPacket) {
                SChatPacket var10 = (SChatPacket) var4;
            }

            if (var4 instanceof SPlayerListItemPacket) {
                SPlayerListItemPacket var11 = (SPlayerListItemPacket) var4;
                List var15 = var11.getEntries();

                for (int var7 = 0; var7 < var15.size(); var7++) {
                    SPlayerListItemPacket.AddPlayerData var8 = (SPlayerListItemPacket.AddPlayerData) var15.get(var7);
                    if (var8.getDisplayName() != null) {
                        String var9 = var8.getDisplayName().getString();
                        if (var9.contains(mc.getSession().getUsername())) {
                            var9 = var9.replaceAll(mc.getSession().getUsername(), this.getStringSettingValueByName("Username"));
                            var8.displayName = new StringTextComponent(var9);
                        }
                    }
                }

                var11.players = var15;
            }

            if (var4 instanceof SUpdateBossInfoPacket) {
                SUpdateBossInfoPacket var12 = (SUpdateBossInfoPacket) var4;
                if (var12.method17207() == null) {
                    return;
                }

                String var16 = var12.method17207().getString();
                if (var16.contains(mc.getSession().getUsername())) {
                    var16 = var16.replaceAll(mc.getSession().getUsername(), this.getStringSettingValueByName("Username"));
                    StringTextComponent var20 = new StringTextComponent(var16);
                    var12.field24289 = var20;
                }
            }

            if (var4 instanceof STitlePacket) {
                STitlePacket var13 = (STitlePacket) var4;
                if (var13.method17570() == null) {
                    return;
                }

                String var18 = var13.method17570().getString();
                if (var18.contains(mc.getSession().getUsername())) {
                    var18 = var18.replaceAll(mc.getSession().getUsername(), this.getStringSettingValueByName("Username"));
                    StringTextComponent var21 = new StringTextComponent(var18);
                    var1.method13899(new STitlePacket(var13.method17569(), var21, var13.method17571(), var13.method17572(), var13.method17573()));
                }
            }
        }
    }
}
