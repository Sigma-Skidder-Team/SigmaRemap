package mapped;

import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5329 extends ModuleWithModuleSettings {
    public Class5329() {
        super(ModuleCategory.RENDER, "ESP", "See entities anywhere anytime", new Class5183(), new Class5278(), new Class5276(), new Class5293());
        this.registerSetting(new BooleanSetting("Show Players", "Draws a line arround players", true));
        this.registerSetting(new BooleanSetting("Show Mobs", "Draws a line arround hostile creatures", false));
        this.registerSetting(new BooleanSetting("Show Passives", "Draws a line arround animals", false));
        this.registerSetting(new BooleanSetting("Show Invisibles", "Shows invisible entities", true));
    }
}
