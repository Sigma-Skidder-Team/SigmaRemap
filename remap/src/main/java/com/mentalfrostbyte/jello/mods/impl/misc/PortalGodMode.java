// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class4348;
import mapped.Class5723;
import mapped.EventListener;

public class PortalGodMode extends Module
{
    public PortalGodMode() {
        super(Category.MISC, "PortalGodMode", "Makes you invulnerable when you go through a portal and stay in it");
    }
    
    @EventListener
    private void method10002(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4348) {
                class5723.method16961(true);
            }
        }
    }
}
