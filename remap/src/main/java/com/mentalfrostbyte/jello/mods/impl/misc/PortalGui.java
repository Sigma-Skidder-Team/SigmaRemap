// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.EventPlayerTick;
import mapped.EventListener;

public class PortalGui extends Module
{
    public PortalGui() {
        super(Category.MISC, "PortalGui", "Allows GUIs while in nether portal");
    }
    
    @EventListener
    private void method10159(final EventPlayerTick eventPlayerTick) {
        if (this.isEnabled()) {
            PortalGui.mc.player.inPortal = false;
        }
    }
}
