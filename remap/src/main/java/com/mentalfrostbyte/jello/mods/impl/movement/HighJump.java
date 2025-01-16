// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.movement.highjumps.HypixelHighJump;
import com.mentalfrostbyte.jello.mods.impl.movement.highjumps.VanillaHighJump;

public class HighJump extends ModuleWithSettings
{
    public HighJump() {
        super(Category.MOVEMENT, "HighJump", "Makes you jump higher", new Module[] { new VanillaHighJump(), new HypixelHighJump() });
    }
}
