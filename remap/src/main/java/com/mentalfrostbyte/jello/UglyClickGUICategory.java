// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello;

import com.mentalfrostbyte.jello.mods.Category;
import mapped.*;
import slick2d.Texture;

import java.util.ArrayList;
import java.util.List;

public class UglyClickGUICategory extends Class4807
{
    private List<Class4868> field20530;
    public int field20531;
    public UglyClickGUICategoryIcon combatCat;
    public UglyClickGUICategoryIcon movementCat;
    public UglyClickGUICategoryIcon otherCat;
    public UglyClickGUICategoryIcon playerCat;
    public UglyClickGUICategoryIcon visualsCat;
    public UglyClickGUICategoryIcon worldCat;
    public static Texture colors;
    public static Texture colors2;
    public static Texture combat;
    public static Texture combat2;
    public static Texture downarrow;
    public static Texture gear;
    public static Texture gear2;
    public static Texture movement;
    public static Texture movement2;
    public static Texture msgo;
    public static Texture msgo2;
    public static Texture others;
    public static Texture others2;
    public static Texture player;
    public static Texture player2;
    public static Texture uparrow;
    public static Texture uparrow2;
    public static Texture visuals;
    public static Texture visuals2;
    public static Texture xmark;
    public static Texture xmark2;
    public static Texture world;
    public static Texture world2;
    
    public UglyClickGUICategory(final Class4803 class4803, final String s, final int n, final int n2) {
        super(class4803, s, n - 198, n2 - 298, 396, 596);
        this.field20530 = new ArrayList<Class4868>();
        decryptUglyGuiAssets();
        this.addVisualThing(this.combatCat = new UglyClickGUICategoryIcon(this, "combat", 24, 58, 170, 130, "Combat", UglyClickGUICategory.combat, UglyClickGUICategory.combat2));
        this.addVisualThing(this.movementCat = new UglyClickGUICategoryIcon(this, "movement", 24, 208, 170, 130, "Movement", UglyClickGUICategory.movement, UglyClickGUICategory.movement2));
        this.addVisualThing(this.worldCat = new UglyClickGUICategoryIcon(this, "world", 24, 358, 170, 130, "World", UglyClickGUICategory.world, UglyClickGUICategory.world2));
        this.addVisualThing(this.playerCat = new UglyClickGUICategoryIcon(this, "player", 201, 58, 170, 130, "Player", UglyClickGUICategory.player, UglyClickGUICategory.player2));
        this.addVisualThing(this.visualsCat = new UglyClickGUICategoryIcon(this, "visuals", 201, 208, 170, 130, "Visuals", UglyClickGUICategory.visuals, UglyClickGUICategory.visuals2));
        this.addVisualThing(this.otherCat = new UglyClickGUICategoryIcon(this, "other", 201, 358, 170, 130, "Others", UglyClickGUICategory.others, UglyClickGUICategory.others2));
        final Class4886 class4804;
        this.addVisualThing(class4804 = new Class4886(this, "exit", this.method14276() - 41, 9));
        class4804.method14260((class4803, n) -> Minecraft.method5277().displayGuiScreen(null));
        final Class4799 class4805 = (Class4799)this.method14267();
        this.combatCat.method14260((class4800, n) -> class4805.method14198("Combat", Category.COMBAT));
        this.movementCat.method14260((class4800, n) -> class4805.method14198("Movement", Category.MOVEMENT));
        this.worldCat.method14260((class4800, n) -> class4805.method14198("World", Category.WORLD));
        this.playerCat.method14260((class4800, n) -> class4805.method14198("Player", Category.PLAYER));
        this.visualsCat.method14260((class4800, n) -> class4805.method14198("Visuals", Category.RENDER, Category.GUI));
        this.otherCat.method14260((class4800, n) -> class4805.method14198("Others", Category.MISC));
        this.method14311(false);
    }
    
    public static void decryptUglyGuiAssets() {
        if (UglyClickGUICategory.colors == null) {
            UglyClickGUICategory.colors = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/colors.png");
            UglyClickGUICategory.colors2 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/colors2.png");
            UglyClickGUICategory.combat = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/combat.png");
            UglyClickGUICategory.combat2 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/combat2.png");
            UglyClickGUICategory.downarrow = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/downarrow.png");
            UglyClickGUICategory.gear = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/gear.png");
            UglyClickGUICategory.gear2 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/gear2.png");
            UglyClickGUICategory.movement = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/movement.png");
            UglyClickGUICategory.movement2 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/movement2.png");
            UglyClickGUICategory.msgo = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/msgo.png");
            UglyClickGUICategory.msgo2 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/msgo2.png");
            UglyClickGUICategory.others = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/others.png");
            UglyClickGUICategory.others2 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/others2.png");
            UglyClickGUICategory.player = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/player.png");
            UglyClickGUICategory.player2 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/player2.png");
            UglyClickGUICategory.uparrow = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/uparrow.png");
            UglyClickGUICategory.uparrow2 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/uparrow2.png");
            UglyClickGUICategory.visuals = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/visuals.png");
            UglyClickGUICategory.visuals2 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/visuals2.png");
            UglyClickGUICategory.xmark = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/xmark.png");
            UglyClickGUICategory.xmark2 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/xmark2.png");
            UglyClickGUICategory.world = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/world.png");
            UglyClickGUICategory.world2 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/world2.png");
        }
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
}
