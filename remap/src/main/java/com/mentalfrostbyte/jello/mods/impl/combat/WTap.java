// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.combat.wtaps.Normal;

public class WTap extends ModuleWithSettings
{
    public WTap() {
        super(Category.COMBAT, "WTap", "Increase the knockback you give to players", new Normal());
    }
}
