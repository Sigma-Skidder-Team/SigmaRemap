package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class NoViewReset extends Module {
    public NoViewReset() {
        super(ModuleCategory.PLAYER, "NoViewReset", "Prevents the server from resetting your client yaw/pitch");
    }

    @EventTarget
    private void RecievePacketEvent(ReceivePacketEvent event) {
        if (this.isEnabled()) {
            if (mc.player != null) {
                if (mc.player.ticksExisted >= 10) {
                    if (mc.player != null && event.getPacket() instanceof SPlayerPositionLookPacket) {
                        SPlayerPositionLookPacket positionLookPacket = (SPlayerPositionLookPacket) event.getPacket();
                        mc.player.prevRotationYaw = positionLookPacket.yaw;
                        mc.player.prevRotationPitch = positionLookPacket.pitch;
                        positionLookPacket.yaw = mc.player.rotationYaw;
                        positionLookPacket.pitch = mc.player.rotationPitch;
                    }
                }
            }
        }
    }
}
