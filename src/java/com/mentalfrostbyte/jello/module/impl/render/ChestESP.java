package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.render.chestesp.BoxChestESP;
import com.mentalfrostbyte.jello.module.impl.render.chestesp.OutlineChestESP;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ColorSetting;
import com.mentalfrostbyte.jello.util.ClientColors;

public class ChestESP extends ModuleWithModuleSettings {
    public ChestESP() {
        super(ModuleCategory.RENDER, "ChestESP", "Allows you to see chests through blocks", new OutlineChestESP(), new BoxChestESP());
        this.registerSetting(new BooleanSetting("Show Regular Chests", "Renders the regular chest esp", true));
        this.registerSetting(new ColorSetting("Regular Color", "The render color", ClientColors.LIGHT_GREYISH_BLUE.getColor));
        this.registerSetting(new BooleanSetting("Show Trapped Chests", "Renders the regular chest esp", true));
        this.registerSetting(new ColorSetting("Trapped Color", "The render color", -13108));
        this.registerSetting(new BooleanSetting("Show Ender Chests", "Renders the regular chest esp", true));
        this.registerSetting(new ColorSetting("Ender Color", "The render color", -1848065));
    }
}
