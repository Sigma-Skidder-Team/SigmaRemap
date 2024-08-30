package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class FPSBooster extends Module {
    public static boolean field23568 = false;

    public FPSBooster() {
        super(ModuleCategory.RENDER, "FPSBooster", "Disables Armor Stand and particle rendering");
    }

    @Override
    public void method15953() {
        super.method15953();
        field23568 = this.isEnabled();
    }

    @Override
    public void onDisable() {
        field23568 = false;
    }

    @Override
    public void onEnable() {
        field23568 = true;
    }
}
