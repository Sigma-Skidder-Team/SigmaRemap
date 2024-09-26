package com.mentalfrostbyte.jello.module.impl.misc.gameplay;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.misc.GamePlay;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SChatPacket;

public class MineplexGamePlay extends Module {
    private GamePlay field23602;
    private boolean field23603;
    private final TimerUtil field23604 = new TimerUtil();

    public MineplexGamePlay() {
        super(ModuleCategory.MISC, "Mineplex", "Gameplay for Mineplex");
    }

    @Override
    public void method15953() {
        this.field23602 = (GamePlay) this.access();
    }

    @Override
    public void onEnable() {
        this.field23603 = false;
    }

    @EventTarget
    private void method16340(ReceivePacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            IPacket var4 = var1.getPacket();
            if (var4 instanceof SChatPacket) {
                SChatPacket var5 = (SChatPacket) var4;
                String var6 = var5.getChatComponent().getString();
                String var7 = mc.player.getName().getString().toLowerCase();
                if (this.field23602.getBooleanValueFromSetttingName("AutoL") && var6.toLowerCase().contains("killed by " + var7 + " ")) {
                    this.field23602.method16761(var6);
                }

                String[] var8 = new String[]{"Green", "Red", "Blue", "Yellow"};

                for (int var9 = 0; var9 < var8.length; var9++) {
                    if (var6.equals(var8[var9] + " won the game!")) {
                        this.field23604.reset();
                        this.field23603 = true;
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16341(WorldLoadEvent var1) {
        if (this.isEnabled()) {
            this.field23603 = false;
        }
    }

    @EventTarget
    private void method16342(TickEvent var1) {
        if (this.isEnabled()) {
            if (this.getBooleanValueFromSetttingName("AutoGG") && this.field23604.getElapsedTime() > 5000L && this.field23603) {
                this.field23603 = false;
                this.field23604.reset();
                this.field23602.method16760();
            }
        }
    }
}
