// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods;

public class Category
{
    public static final Category RENDER;
    public static final Category PLAYER;
    public static final Category COMBAT;
    public static final Category WORLD;
    public static final Category MISC;
    public static final Category EXPLOIT;
    public static final Category MOVEMENT;
    public static final Category GUI;
    public static final Category ITEM;
    private final String name;
    
    public Category(final String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Category && ((Category)o).name.equals(this.name);
    }
    
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    static {
        RENDER = new Category("Render");
        PLAYER = new Category("Player");
        COMBAT = new Category("Combat");
        WORLD = new Category("World");
        MISC = new Category("Misc");
        EXPLOIT = new Category("Exploit");
        MOVEMENT = new Category("Movement");
        GUI = new Category("Gui");
        ITEM = new Category("Item");
    }
}
