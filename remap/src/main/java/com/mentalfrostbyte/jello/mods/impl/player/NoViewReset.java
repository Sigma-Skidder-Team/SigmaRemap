// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.SPlayerPositionLookPacket;
import mapped.EventReceivePacket;
import mapped.EventListener;

public class NoViewReset extends Module
{
    public NoViewReset() {
        super(Category.PLAYER, "NoViewReset", "Prevents the server from resetting your client yaw/pitch");
    }
    
    @EventListener
    private void onReceivePacket(final EventReceivePacket eventReceivePacket) {
        if (!this.isEnabled()) {
            return;
        }
        if (NoViewReset.mc.player == null) {
            return;
        }
        if (NoViewReset.mc.player.ticksExisted >= 10) {
            if (eventReceivePacket.getPacket() instanceof SPlayerPositionLookPacket) {
                final SPlayerPositionLookPacket positionLookPacket = (SPlayerPositionLookPacket) eventReceivePacket.getPacket();
                NoViewReset.mc.player.prevRotationYaw = positionLookPacket.yaw;
                NoViewReset.mc.player.prevRotationPitch = positionLookPacket.pitch;
                positionLookPacket.yaw = NoViewReset.mc.player.rotationYaw;
                positionLookPacket.pitch = NoViewReset.mc.player.rotationPitch;
            }
        }
    }
}
