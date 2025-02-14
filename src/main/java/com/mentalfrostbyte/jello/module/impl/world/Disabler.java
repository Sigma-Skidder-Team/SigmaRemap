package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.world.disabler.*;

public class Disabler extends ModuleWithModuleSettings {
    public Disabler() {
        super(ModuleCategory.WORLD,
                "Disabler",
                "Disables some anticheats",
                new PingSpoofDisabler(),
                new NullDisabler(),
                new HypixelDisabler(),
                new TPDisabler(),
                new ViperDisabler(),
                new VeltPvPDisabler(),
                new GhostlyDisabler());
    }
}
