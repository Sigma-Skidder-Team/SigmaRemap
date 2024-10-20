package com.mentalfrostbyte.jello.module.impl.world.disabler;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class VeltPvPDisabler extends Module {
    private int tickCounter;

    public VeltPvPDisabler() {
        super(ModuleCategory.EXPLOIT, "VeltPvP", "Disabler for VeltPvP.");
    }

    @Override
    public void onEnable() {
        this.tickCounter = 0;
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        if (this.isEnabled() && mc.player != null && event.isPre()) {
            this.tickCounter++;
            double motionY = -0.1;
            if (this.tickCounter >= 20) {
                this.tickCounter = 0;
                event.setY(motionY);
                event.setGround(false);
            }
        }
    }

    @EventTarget
    public void RecievePacketEvent(ReceivePacketEvent event) {
        if (!this.isEnabled()) {
        }
    }
}
