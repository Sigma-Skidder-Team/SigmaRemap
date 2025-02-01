// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.render.chestesps.BoxChestESP;
import com.mentalfrostbyte.jello.mods.impl.render.chestesps.OutlineChestESP;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.ClientColors;
import com.mentalfrostbyte.jello.settings.impl.ColorSetting;

public class ChestESP extends ModuleWithSettings
{
    public ChestESP() {
        super(Category.RENDER, "ChestESP", "Allows you to see chests through blocks", new Module[] { new OutlineChestESP(), new BoxChestESP() });
        this.addSetting(new BooleanSetting("Show Regular Chests", "Renders the regular chest esp", true));
        this.addSetting(new ColorSetting("Regular Color", "The render color", ClientColors.LIGHT_GREYISH_BLUE.color));
        this.addSetting(new BooleanSetting("Show Trapped Chests", "Renders the regular chest esp", true));
        this.addSetting(new ColorSetting("Trapped Color", "The render color", -13108));
        this.addSetting(new BooleanSetting("Show Ender Chests", "Renders the regular chest esp", true));
        this.addSetting(new ColorSetting("Ender Color", "The render color", -1848065));
    }
}
