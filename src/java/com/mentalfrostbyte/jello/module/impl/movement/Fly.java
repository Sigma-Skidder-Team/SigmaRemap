package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.fly.*;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;

public class Fly extends ModuleWithModuleSettings {
    public Fly() {
        super(
                ModuleCategory.MOVEMENT,
                "Fly",
                "Allows you to fly like a bird", // Fly wie ein Pelikan
                new VanillaFly(),
                new HypixelFly(),
                new MineplexFly(),
                new JetpackFly(),
                new BowFly(),
                new OmegaCraftFly(),
                new ViperMCFly(),
                new VeltPvPFly(),
                new HawkFly(),
                new LibreCraftFly(),
                new ACRFly(),
                new NCPFly(),
                new HorizonFly(),
                new SpartanFly(),
                new OmegaCraftTestFly()
        );
    }
}
