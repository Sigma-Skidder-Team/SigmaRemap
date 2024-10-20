package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import mapped.Class3292;
import net.minecraft.util.math.BlockRayTraceResult;

public class FastPlace extends Module {
    public FastPlace() {
        super(ModuleCategory.WORLD, "FastPlace", "Allows you to place blocks faster");
        this.registerSetting(new BooleanSetting("Reduce Delay", "Makes block placement faster, but not too much!", true));
    }

    @EventTarget
    private void TickEvent(TickEvent event) {
        if (this.isEnabled()) {
            if (mc.player.getHeldItemMainhand() != null) {
                if (mc.player.getHeldItemMainhand().getItem() instanceof Class3292) {
                    if (mc.objectMouseOver instanceof BlockRayTraceResult) {
                        if (!this.getBooleanValueFromSettingName("Reduce Delay")) {
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
