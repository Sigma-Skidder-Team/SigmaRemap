package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class FPSBooster extends Module {
    public static boolean isEnabled = false;

    public FPSBooster() {
        super(ModuleCategory.RENDER, "FPSBooster", "Disables Armor Stand and particle rendering");
    }

    @Override
    public void initialize() {
        super.initialize();
        isEnabled = this.isEnabled();
    }

    @Override
    public void onDisable() {
        isEnabled = false;
    }

    @Override
    public void onEnable() {
        isEnabled = true;
    }
}
