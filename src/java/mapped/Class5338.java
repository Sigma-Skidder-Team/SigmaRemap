package mapped;

import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5338 extends Class5325 {
    public Class5338() {
        super(ModuleCategory.RENDER, "ChestESP", "Allows you to see chests through blocks", new Class5384(), new Class5232());
        this.method15972(new Class6004("Show Regular Chests", "Renders the regular chest esp", true));
        this.method15972(new Class6010("Regular Color", "The render color", Class1979.field12896.field12910));
        this.method15972(new Class6004("Show Trapped Chests", "Renders the regular chest esp", true));
        this.method15972(new Class6010("Trapped Color", "The render color", -13108));
        this.method15972(new Class6004("Show Ender Chests", "Renders the regular chest esp", true));
        this.method15972(new Class6010("Ender Color", "The render color", -1848065));
    }
}
