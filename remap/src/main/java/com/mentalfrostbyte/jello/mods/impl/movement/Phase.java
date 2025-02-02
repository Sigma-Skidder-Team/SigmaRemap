// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.movement.phases.UnfullPhase;
import com.mentalfrostbyte.jello.mods.impl.movement.phases.NCPPhase;
import com.mentalfrostbyte.jello.mods.impl.movement.phases.NoClipPhase;
import com.mentalfrostbyte.jello.mods.impl.movement.phases.FullBlockPhase;
import mapped.*;

public class Phase extends ModuleWithSettings
{
    public Phase() {
        super(Category.MOVEMENT, "Phase", "Allows you to go through blocks", new Module[] { new FullBlockPhase(), new NCPPhase(), new NoClipPhase(), new UnfullPhase() });
    }
    
    @EventListener
    private void method10265(final Class5746 class5746) {
        if (this.isEnabled()) {
            class5746.method17053(0.0f);
            class5746.setCancelled(true);
        }
    }
}
