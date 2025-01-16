// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5743;
import mapped.EventListener;

public class PortalGui extends Module
{
    public PortalGui() {
        super(Category.MISC, "PortalGui", "Allows GUIs while in nether portal");
    }
    
    @EventListener
    private void method10159(final Class5743 class5743) {
        if (this.method9906()) {
            PortalGui.mc.player.inPortal = false;
        }
    }
}
