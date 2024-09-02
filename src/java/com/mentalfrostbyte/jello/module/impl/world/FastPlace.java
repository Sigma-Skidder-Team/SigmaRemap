package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.util.math.BlockRayTraceResult;
import mapped.BooleanSetting;
import mapped.Class3292;

public class FastPlace extends Module {
    public FastPlace() {
        super(ModuleCategory.WORLD, "FastPlace", "Allows you to place blocks faster");
        this.registerSetting(new BooleanSetting("Reduce Delay", "Makes block placement faster, but not too much!", true));
    }

    @EventTarget
    private void method16186(TickEvent var1) {
        if (this.isEnabled()) {
            if (mc.player.method3090() != null) {
                if (mc.player.method3090().getItem() instanceof Class3292) {
                    if (mc.objectMouseOver instanceof BlockRayTraceResult) {
                        if (!this.getBooleanValueFromSetttingName("Reduce Delay")) {
                            mc.rightClickDelayTimer = 0;
                        } else {
                            mc.rightClickDelayTimer--;
                        }
                    }
                }
            }
        }
    }
}
