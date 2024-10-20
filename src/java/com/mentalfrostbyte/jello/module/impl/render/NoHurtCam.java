package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render2DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class NoHurtCam extends Module {
    public NoHurtCam() {
        super(ModuleCategory.RENDER, "NoHurtCam", "Disables the hurt animation");
    }

    @EventTarget
    private void Render2DEvent(Render2DEvent event) {
        if (this.isEnabled()) {
            mc.player.hurtTime = 0;
        }
    }
}
