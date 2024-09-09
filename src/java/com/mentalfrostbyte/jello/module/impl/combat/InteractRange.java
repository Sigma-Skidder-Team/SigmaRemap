package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ClickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockRayTraceResult;

public class InteractRange extends Module {
    public InteractRange() {
        super(ModuleCategory.COMBAT, "InteractRange", "Allows you to interact farer away");
        this.registerSetting(new NumberSetting<Float>("Range", "Range value", 4.0F, Float.class, 3.0F, 8.0F, 0.01F));
    }

    @EventTarget
    private void method16684(ClickEvent var1) {
        if (this.isEnabled()) {
            Entity var4 = ColorUtils.method17711(mc.player.rotationYaw, mc.player.rotationPitch, this.getNumberValueBySettingName("Range"), 0.0);
            BlockRayTraceResult var5 = BlockUtil.rayTrace(mc.player.rotationYaw, mc.player.rotationPitch, this.getNumberValueBySettingName("Range"));
            if (var4 != null && mc.objectMouseOver.getType() == RayTraceResult.Type.MISS) {
                mc.objectMouseOver = new EntityRayTraceResult(var4);
            }

            if (var4 == null && mc.objectMouseOver.getType() == RayTraceResult.Type.MISS && var5 != null) {
                mc.objectMouseOver = var5;
            }
        }
    }
}
