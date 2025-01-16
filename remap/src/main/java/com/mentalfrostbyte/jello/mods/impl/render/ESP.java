// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.render.esps.BoxOutlineESP;
import com.mentalfrostbyte.jello.mods.impl.render.esps.Class3242;
import com.mentalfrostbyte.jello.mods.impl.render.esps.Class3335;
import com.mentalfrostbyte.jello.mods.impl.render.esps.VanillaESP;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;

public class ESP extends ModuleWithSettings
{
    public ESP() {
        super(Category.RENDER, "ESP", "See entities anywhere anytime", new Module[] { new Class3242(), new Class3335(), new BoxOutlineESP(), new VanillaESP() });
        this.addSetting(new BooleanSetting("Show Players", "Draws a line arround players", true));
        this.addSetting(new BooleanSetting("Show Mobs", "Draws a line arround hostile creatures", false));
        this.addSetting(new BooleanSetting("Show Passives", "Draws a line arround animals", false));
        this.addSetting(new BooleanSetting("Show Invisibles", "Shows invisible entities", true));
    }
}
