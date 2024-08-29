package mapped;

import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5339 extends ModuleWithModuleSettings {
    public Class5339() {
        super(ModuleCategory.RENDER, "ESP", "See entities anywhere anytime", new Class5289(), new Class5205(), new Class5276(), new Class5293());
        this.registerSetting(new BooleanSetting("Show Players", "Draws a line arround players", true));
        this.registerSetting(new BooleanSetting("Show Mobs", "Draws a line arround hostile creatures", false));
        this.registerSetting(new BooleanSetting("Show Passives", "Draws a line arround animals", false));
        this.registerSetting(new BooleanSetting("Show Invisibles", "Shows invisible entities", true));
    }
}
