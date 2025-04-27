// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class AutoFish extends Module
{
    public AutoFish() {
        super(Category.WORLD, "AutoFish", "Automatically catches fish for you");
    }
    
    @EventListener
    public void method10301(final EventReceivePacket eventReceivePacket) {
        if (!this.isEnabled()) {
            return;
        }
        if (!(eventReceivePacket.getPacket() instanceof Class4282) && !(eventReceivePacket.getPacket() instanceof Class4342)) {
            return;
        }
        if (AutoFish.mc.player.getHeldItemMainhand() == null) {
            return;
        }
        if (AutoFish.mc.player.getHeldItemMainhand().getItem() instanceof Class4047) {
            if (!(eventReceivePacket.getPacket() instanceof Class4282)) {
                if (eventReceivePacket.getPacket() instanceof Class4342) {
                    if (!((Class4342) eventReceivePacket.getPacket()).field19450.equals("entity.bobber.splash")) {
                        return;
                    }
                }
            }
            else if (!((Class4282) eventReceivePacket.getPacket()).method12863().equals(Class8520.field35037)) {
                return;
            }
            AutoFish.mc.method5269().method17292(new Class4307(Class316.field1877));
            AutoFish.mc.method5269().method17292(new Class4307(Class316.field1877));
            Client.getInstance().getNotificationManager().send(new Notification("AutoFish", "We catched something!", ClientAssets.done));
        }
    }
}
