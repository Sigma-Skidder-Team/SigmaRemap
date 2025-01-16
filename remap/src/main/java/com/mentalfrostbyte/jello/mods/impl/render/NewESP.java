// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.render.esps.BoxOutlineESP;
import com.mentalfrostbyte.jello.mods.impl.render.esps.ShadowESP;
import com.mentalfrostbyte.jello.mods.impl.render.esps.SimsESP;
import com.mentalfrostbyte.jello.mods.impl.render.esps.VanillaESP;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;

public class NewESP extends ModuleWithSettings
{
    public NewESP() {
        super(Category.RENDER, "ESP", "See entities anywhere anytime", new Module[] { new ShadowESP(), new SimsESP(), new BoxOutlineESP(), new VanillaESP() });
        this.addSetting(new BooleanSetting("Show Players", "Draws a line arround players", true));
        this.addSetting(new BooleanSetting("Show Mobs", "Draws a line arround hostile creatures", false));
        this.addSetting(new BooleanSetting("Show Passives", "Draws a line arround animals", false));
        this.addSetting(new BooleanSetting("Show Invisibles", "Shows invisible entities", true));
    }
}
