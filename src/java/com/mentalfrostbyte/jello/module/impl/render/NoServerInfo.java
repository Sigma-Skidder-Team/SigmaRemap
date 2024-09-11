package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.server.SUpdateBossInfoPacket;
import net.minecraft.network.play.server.SScoreboardObjectivePacket;

public class NoServerInfo extends Module {
    public NoServerInfo() {
        super(ModuleCategory.RENDER, "NoServerInfo", "Hides the server scoreboard and boss bar at top");
    }

    @EventTarget
    private void method16245(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SUpdateBossInfoPacket) {
                SUpdateBossInfoPacket var4 = (SUpdateBossInfoPacket) var1.getPacket();
                var1.setCancelled(true);
            }

            if (var1.getPacket() instanceof SScoreboardObjectivePacket) {
                SScoreboardObjectivePacket var5 = (SScoreboardObjectivePacket) var1.getPacket();
                var1.setCancelled(true);
            }
        }
    }
}
