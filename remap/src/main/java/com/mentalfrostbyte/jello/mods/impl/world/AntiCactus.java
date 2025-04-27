// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;

public class AntiCactus extends Module
{
    public AntiCactus() {
        super(Category.WORLD, "AntiCactus", "Prevent you from taking damage from cactus");
        this.addSetting(new BooleanSetting("Above", "Avoid damage above cactus also", true));
    }
    
    @EventListener
    private void method10794(final Class5753 class5753) {
        if (this.isEnabled()) {
            if (AntiCactus.mc.world.getBlockState(class5753.method17064()).method21696() instanceof Class3977) {
                class5753.method17067(VoxelShapes.method24488(0.0, 0.0, 0.0, 1.0, this.getBooleanValueFromSettingName("Above") ? 0.999 : 0.9375, 1.0));
            }
            if (AntiCactus.mc.world.getBlockState(class5753.method17064()).method21696() instanceof Class4011) {
                class5753.method17067(VoxelShapes.method24488(-0.01, 0.0, -0.01, 1.02, 1.9375, 1.02));
            }
        }
    }
}
