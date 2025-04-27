// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.movement.flys.*;

public class Fly extends ModuleWithSettings {
    public Fly() {
        super(Category.MOVEMENT, "Fly", "Allows you to fly like a bird", new VanillaFly(), new HypixelFly(), new CubecraftFly(), new Cubecraft2Fly(), new MineplexFly(), new JetpackFly(), new BowFly(), new OmegaCraftFly(), new ViperMCFly(), new VeltPvPFly(), new HawkFly(), new LibreCraftFly(), new ReloadedFly(), new NCPSpigotFly(), new HorizonFly(), new SpartanFly(), new TestFly());
    }
}
