package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.potion.Effects;

public class AntiLevitation extends Module {
    public AntiLevitation() {
        super(ModuleCategory.MISC, "AntiLevitation", "Removes levitation effects");
    }

    @EventTarget
    public void method16490(TickEvent var1) {
        if (this.isEnabled()) {
            mc.player.removeEffects(Effects.LEVITATION);
        }
    }
}
