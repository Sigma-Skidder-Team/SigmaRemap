package com.mentalfrostbyte.jello.module.impl.world.disabler;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.client.CInputPacket;

public class GhostlyDisabler extends Module {
    public GhostlyDisabler() {
        super(ModuleCategory.EXPLOIT, "Ghostly", "Disable ghostly's anticheat.");
    }

    @EventTarget
    public void method16909(TickEvent var1) {
        if (this.isEnabled() && mc.getCurrentServerData() != null) {
            mc.getConnection().sendPacket(new CInputPacket(1.0F, 1.0F, false, false));
        }
    }
}
