package com.mentalfrostbyte.jello.module.impl.world.disabler;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class VeltPvPDisabler extends Module {
    private int field23801;

    public VeltPvPDisabler() {
        super(ModuleCategory.EXPLOIT, "VeltPvP", "Disabler for VeltPvP.");
    }

    @Override
    public void onEnable() {
        this.field23801 = 0;
    }

    @EventTarget
    public void method16619(Class4399 var1) {
        if (this.isEnabled() && mc.player != null && var1.method13921()) {
            this.field23801++;
            double var4 = -0.1;
            if (this.field23801 >= 20) {
                this.field23801 = 0;
                var1.method13912(var4);
                var1.method13920(false);
            }
        }
    }

    @EventTarget
    public void method16620(RecievePacketEvent var1) {
        if (!this.isEnabled()) {
        }
    }
}
