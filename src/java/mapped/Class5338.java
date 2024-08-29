package mapped;

import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5338 extends Class5325 {
    public Class5338() {
        super(ModuleCategory.RENDER, "ChestESP", "Allows you to see chests through blocks", new Class5384(), new Class5232());
        this.registerSetting(new BooleanSetting("Show Regular Chests", "Renders the regular chest esp", true));
        this.registerSetting(new ColorSetting("Regular Color", "The render color", ClientColors.LIGHT_GREYISH_BLUE.getColor));
        this.registerSetting(new BooleanSetting("Show Trapped Chests", "Renders the regular chest esp", true));
        this.registerSetting(new ColorSetting("Trapped Color", "The render color", -13108));
        this.registerSetting(new BooleanSetting("Show Ender Chests", "Renders the regular chest esp", true));
        this.registerSetting(new ColorSetting("Ender Color", "The render color", -1848065));
    }
}
