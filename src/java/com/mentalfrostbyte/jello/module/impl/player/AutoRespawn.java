package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class AutoRespawn extends Module {

    public AutoRespawn() {
        super(ModuleCategory.PLAYER, "AutoRespawn", "Respawns for you");
    }

    @EventTarget 
    public void TickEvent(TickEvent event) {
        if (this.isEnabled()) {
            if (!mc.player.isAlive()) {
                mc.player.respawnPlayer();
            }
        }
    }
}
