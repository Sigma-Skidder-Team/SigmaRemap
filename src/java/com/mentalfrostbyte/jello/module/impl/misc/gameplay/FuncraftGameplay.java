package com.mentalfrostbyte.jello.module.impl.misc.gameplay;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.misc.GamePlay;
import mapped.Packet;
import mapped.SChatPacket;

public class FuncraftGameplay extends Module {
    private GamePlay field23579;

    public FuncraftGameplay() {
        super(ModuleCategory.MISC, "Funcraft", "Gameplay for Funcraft");
    }

    @Override
    public void method15953() {
        this.field23579 = (GamePlay) this.method16004();
    }

    @EventTarget
    private void method16295(RecievePacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof SChatPacket) {
                SChatPacket var5 = (SChatPacket) var4;
                String var6 = var5.method17648().getString();
                String var7 = mc.player.getName().getString().toLowerCase();
                if (this.field23579.getBooleanValueFromSetttingName("AutoL")
                        && (var6.toLowerCase().contains("a été tué par " + var7) || var6.toLowerCase().contains("a été tué par le vide et " + var7))) {
                    this.field23579.method16761(var6);
                }
            }
        }
    }
}
