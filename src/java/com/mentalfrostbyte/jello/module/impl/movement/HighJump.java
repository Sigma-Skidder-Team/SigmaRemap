package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.highjump.HypixelHighJump;
import com.mentalfrostbyte.jello.module.impl.movement.highjump.MineplexHighJump;
import com.mentalfrostbyte.jello.module.impl.movement.highjump.VanillaHighJump;

public class HighJump extends ModuleWithModuleSettings {
    public HighJump() {
        super(ModuleCategory.MOVEMENT,
                "HighJump",
                "Makes you jump higher",
                new VanillaHighJump(),
                new MineplexHighJump(),
                new HypixelHighJump());
    }
}
