package com.mentalfrostbyte.jello.module.impl.render.classic;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.render.classic.esp.*;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;

public class ESP extends ModuleWithModuleSettings {
    public ESP() {
        super(ModuleCategory.RENDER,
                "ESP",
                "See entities anywhere anytime",
                new FillESP(),
                new TwoDESP(),
                new BoxOutlineESP(),
                new SkeletonESP(),
                new VanillaESP());
        this.registerSetting(new BooleanSetting("Show Players", "Draws a line arround players", true));
        this.registerSetting(new BooleanSetting("Show Mobs", "Draws a line arround hostile creatures", false));
        this.registerSetting(new BooleanSetting("Show Passives", "Draws a line arround animals", false));
        this.registerSetting(new BooleanSetting("Show Invisibles", "Shows invisible entities", true));
    }
}
