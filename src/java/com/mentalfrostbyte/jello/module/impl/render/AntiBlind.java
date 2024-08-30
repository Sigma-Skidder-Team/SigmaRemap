package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render2DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.Effects;

public class AntiBlind extends Module {
    public AntiBlind() {
        super(ModuleCategory.RENDER, "AntiBlind", "Disables bad visual potion effects");
    }

    @EventTarget
    private void method16067(Render2DEvent var1) {
        if (this.isEnabled()) {
            mc.player.removeEffects(Effects.NAUSEA);
            mc.player.removeEffects(Effects.BLINDNESS);
        }
    }
}
