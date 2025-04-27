// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.util.InDevelopment;
import mapped.*;
import net.minecraft.entity.EntityType;

@InDevelopment
public class PacketEssentials extends Module
{
    public PacketEssentials() {
        super(Category.MISC, "PacketEssentials", "Ignores all types of junk cosmetic packets to improve fps");
    }
    
    @EventListener
    private void method10718(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            if (!(eventReceivePacket.getPacket() instanceof Class4339)) {
                if (!(eventReceivePacket.getPacket() instanceof Class4276)) {
                    if (!(eventReceivePacket.getPacket() instanceof Class4278)) {
                        if (!(eventReceivePacket.getPacket() instanceof Class4301)) {
                            if (!(eventReceivePacket.getPacket() instanceof Class4400)) {
                                if (eventReceivePacket.getPacket() instanceof Class4268) {
                                    eventReceivePacket.setCancelled(true);
                                }
                            }
                            else {
                                eventReceivePacket.setCancelled(true);
                            }
                        }
                        else {
                            eventReceivePacket.setCancelled(true);
                        }
                    }
                    else {
                        final Class4278 class5724 = (Class4278) eventReceivePacket.getPacket();
                        eventReceivePacket.setCancelled(true);
                    }
                }
                else if (((Class4276) eventReceivePacket.getPacket()).method12831() == 1) {
                    eventReceivePacket.setCancelled(true);
                }
            }
            else {
                final Class4339 class5725 = (Class4339) eventReceivePacket.getPacket();
                if (class5725.method13033() == EntityType.field28958) {
                    eventReceivePacket.setCancelled(true);
                }
                if (class5725.method13033() == EntityType.field28987) {
                    eventReceivePacket.setCancelled(true);
                }
            }
        }
    }
}
