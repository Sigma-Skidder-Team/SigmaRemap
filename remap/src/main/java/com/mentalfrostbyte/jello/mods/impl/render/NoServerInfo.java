// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class4301;
import mapped.Class4400;
import mapped.EventReceivePacket;
import mapped.EventListener;

public class NoServerInfo extends Module
{
    public NoServerInfo() {
        super(Category.RENDER, "NoServerInfo", "Hides the server scoreboard and boss bar at top");
    }
    
    @EventListener
    private void method10582(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            if (eventReceivePacket.getPacket() instanceof Class4301) {
                final Class4301 class5724 = (Class4301) eventReceivePacket.getPacket();
                eventReceivePacket.setCancelled(true);
            }
            if (eventReceivePacket.getPacket() instanceof Class4400) {
                final Class4400 class5725 = (Class4400) eventReceivePacket.getPacket();
                eventReceivePacket.setCancelled(true);
            }
        }
    }
}
