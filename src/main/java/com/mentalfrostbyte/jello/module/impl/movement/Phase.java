package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RenderFireEvent;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.phase.*;

public class Phase extends ModuleWithModuleSettings {
    public Phase() {
        super(
                ModuleCategory.MOVEMENT,
                "Phase",
                "Allows you to go through blocks",
                new FullBlockPhase(),
                new NCPPhase(),
                new NoClipPhase(),
                new UnfullPhase(),
                new VanillaPhase()
        );
    }

    @EventTarget
    private void RenderFireEvent(RenderFireEvent event) {
        if (this.isEnabled()) {
            event.setFireHeight(0.0F);
            event.setCancelled(true);
        }
    }
}
