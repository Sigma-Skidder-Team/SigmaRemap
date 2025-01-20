package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventBlockCollision;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import mapped.Class3220;
import mapped.Class3399;
import mapped.VoxelShapes;

public class AntiCactus extends Module {
    public AntiCactus() {
        super(ModuleCategory.WORLD, "AntiCactus", "Prevent you from taking damage from cactus");
        this.registerSetting(new BooleanSetting("Above", "Avoid damage above cactus also", true));
    }

    @EventTarget
    private void EventBlockCollision(EventBlockCollision event) {
        if (this.isEnabled()) {
            if (mc.world.getBlockState(event.getBlockPos()).getBlock() instanceof Class3220) {
                event.setBoxelShape(VoxelShapes.create(0.0, 0.0, 0.0, 1.0, !this.getBooleanValueFromSettingName("Above") ? 0.9375 : 0.999, 1.0));
            }

            if (mc.world.getBlockState(event.getBlockPos()).getBlock() instanceof Class3399) {
                event.setBoxelShape(VoxelShapes.create(-0.01, 0.0, -0.01, 1.02, 1.9375, 1.02));
            }
        }
    }
}
