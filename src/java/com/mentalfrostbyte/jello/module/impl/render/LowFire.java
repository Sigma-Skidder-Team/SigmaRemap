package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RenderFireEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class LowFire extends Module {
    public LowFire() {
        super(ModuleCategory.RENDER, "LowFire", "Makes the fire transparent when you're burning");
    }

    @EventTarget
    public void onFire(RenderFireEvent event) {
        if (this.isEnabled()) {
            event.setFireHeight(0.14F);
        }
    }
}
