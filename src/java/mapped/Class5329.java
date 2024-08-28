package mapped;

import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5329 extends Class5325 {
    public Class5329() {
        super(ModuleCategory.RENDER, "ESP", "See entities anywhere anytime", new Class5183(), new Class5278(), new Class5276(), new Class5293());
        this.method15972(new Class6004("Show Players", "Draws a line arround players", true));
        this.method15972(new Class6004("Show Mobs", "Draws a line arround hostile creatures", false));
        this.method15972(new Class6004("Show Passives", "Draws a line arround animals", false));
        this.method15972(new Class6004("Show Invisibles", "Shows invisible entities", true));
    }
}
