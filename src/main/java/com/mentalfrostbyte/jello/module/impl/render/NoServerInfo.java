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
    private void RecievePacketEvent(ReceivePacketEvent event) {
        if (this.isEnabled()) {
            if (event.getPacket() instanceof SUpdateBossInfoPacket) {
                SUpdateBossInfoPacket sUpdateBossInfoPacket = (SUpdateBossInfoPacket) event.getPacket();
                event.setCancelled(true);
            }

            if (event.getPacket() instanceof SScoreboardObjectivePacket) {
                SScoreboardObjectivePacket sScoreboardObjectivePacket = (SScoreboardObjectivePacket) event.getPacket();
                event.setCancelled(true);
            }
        }
    }
}
