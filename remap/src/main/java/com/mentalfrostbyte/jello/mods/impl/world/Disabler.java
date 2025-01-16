// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.exploit.disablers.*;
import mapped.*;

public class Disabler extends ModuleWithSettings
{
    public Class9171 field15747;
    
    public Disabler() {
        super(Category.WORLD, "Disabler", "Disables some anticheats", new PingSpoofDisabler(), new NullDisabler(), new HypixelDisabler(), new TPDisabler(), new GhostlyDisabler());
        this.field15747 = new Class9171();
    }
}
