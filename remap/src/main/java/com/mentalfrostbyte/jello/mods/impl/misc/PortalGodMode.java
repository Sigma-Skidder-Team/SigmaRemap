// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class4348;
import mapped.EventReceivePacket;
import mapped.EventListener;

public class PortalGodMode extends Module
{
    public PortalGodMode() {
        super(Category.MISC, "PortalGodMode", "Makes you invulnerable when you go through a portal and stay in it");
    }
    
    @EventListener
    private void method10002(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            if (eventReceivePacket.getPacket() instanceof Class4348) {
                eventReceivePacket.setCancelled(true);
            }
        }
    }
}
