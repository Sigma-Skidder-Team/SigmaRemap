package com.mentalfrostbyte.jello.module;

public class ModuleCategory {
    public static final ModuleCategory RENDER = new ModuleCategory("Render");
    public static final ModuleCategory PLAYER = new ModuleCategory("Player");
    public static final ModuleCategory COMBAT = new ModuleCategory("Combat");
    public static final ModuleCategory WORLD = new ModuleCategory("World");
    public static final ModuleCategory MISC = new ModuleCategory("Misc");
    public static final ModuleCategory EXPLOIT = new ModuleCategory("Exploit");
    public static final ModuleCategory MOVEMENT = new ModuleCategory("Movement");
    public static final ModuleCategory GUI = new ModuleCategory("Gui");
    public static final ModuleCategory ITEM = new ModuleCategory("Item");
    private final String name;

    public ModuleCategory(String var1) {
        this.name = var1;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object var1) {
        return var1 instanceof ModuleCategory && ((ModuleCategory) var1).name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
