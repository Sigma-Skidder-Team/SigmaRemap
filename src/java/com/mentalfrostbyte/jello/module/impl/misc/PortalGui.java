package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class PortalGui extends Module {
    public PortalGui() {
        super(ModuleCategory.MISC, "PortalGui", "Allows GUIs while in nether portal");
    }

    @EventTarget
    private void onTick(TickEvent event) {
        if (this.isEnabled()) {
            mc.player.inPortal = false;
        }
    }
}
