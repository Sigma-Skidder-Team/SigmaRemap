package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.fly.*;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.fly.CubecraftFly;
import com.mentalfrostbyte.jello.module.impl.movement.fly.Cubecraft2Fly;

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
                new AGCFly(),
                new HorizonFly(),
                new SpartanFly(),
                new CubecraftFly(),
                new Cubecraft2Fly(),
                new OmegaCraftTestFly()
        );
    }
}
