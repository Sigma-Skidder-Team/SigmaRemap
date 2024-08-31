package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
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
    private void method16897(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SEntityStatusPacket) {
                SEntityStatusPacket var4 = (SEntityStatusPacket) var1.getPacket();
                if (var4.method17178(mc.world) == null
                        || !var4.method17178(mc.world).isAlive()
                        || var4.method17178(mc.world).method3275(mc.player) > 5.0F
                        || var4.method17178(mc.world) == mc.player) {
                }
            }
        }
    }
}
