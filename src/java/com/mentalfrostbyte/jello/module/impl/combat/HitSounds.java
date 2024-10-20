package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.server.SEntityStatusPacket;

public class HitSounds extends Module {
    public HitSounds() {
        super(ModuleCategory.COMBAT, "HitSounds", "Changes the player hurting sounds client side.");
    }

    @EventTarget
    @LowerPriority
    private void RecievePacketEvent(ReceivePacketEvent event) {
        if (this.isEnabled()) {
            if (event.getPacket() instanceof SEntityStatusPacket) {
                SEntityStatusPacket sEntityStatusPacket = (SEntityStatusPacket) event.getPacket();
                if (sEntityStatusPacket.getEntity(mc.world) == null
                        || !sEntityStatusPacket.getEntity(mc.world).isAlive()
                        || sEntityStatusPacket.getEntity(mc.world).getDistance(mc.player) > 5.0F
                        || sEntityStatusPacket.getEntity(mc.world) == mc.player) {
                }
            }
        }
    }
}
