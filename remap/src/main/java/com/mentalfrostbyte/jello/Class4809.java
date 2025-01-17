// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello;

import com.mentalfrostbyte.jello.mods.Category;
import mapped.*;
import slick2d.Texture;

import java.util.ArrayList;
import java.util.List;

public class Class4809 extends Class4807
{
    private List<Class4868> field20530;
    public int field20531;
    public Class4853 field20532;
    public Class4853 field20533;
    public Class4853 field20534;
    public Class4853 field20535;
    public Class4853 field20536;
    public Class4853 field20537;
    public static Texture field20538;
    public static Texture field20539;
    public static Texture field20540;
    public static Texture field20541;
    public static Texture field20542;
    public static Texture field20543;
    public static Texture field20544;
    public static Texture field20545;
    public static Texture field20546;
    public static Texture field20547;
    public static Texture field20548;
    public static Texture field20549;
    public static Texture field20550;
    public static Texture field20551;
    public static Texture field20552;
    public static Texture field20553;
    public static Texture field20554;
    public static Texture field20555;
    public static Texture field20556;
    public static Texture field20557;
    public static Texture field20558;
    public static Texture field20559;
    public static Texture field20560;
    
    public Class4809(final Class4803 class4803, final String s, final int n, final int n2) {
        super(class4803, s, n - 198, n2 - 298, 396, 596);
        this.field20530 = new ArrayList<Class4868>();
        method14332();
        this.method14239(this.field20532 = new Class4853(this, "combat", 24, 58, 170, 130, "Combat", Class4809.field20540, Class4809.field20541));
        this.method14239(this.field20533 = new Class4853(this, "movement", 24, 208, 170, 130, "Movement", Class4809.field20545, Class4809.field20546));
        this.method14239(this.field20537 = new Class4853(this, "world", 24, 358, 170, 130, "World", Class4809.field20559, Class4809.field20560));
        this.method14239(this.field20535 = new Class4853(this, "player", 201, 58, 170, 130, "Player", Class4809.field20551, Class4809.field20552));
        this.method14239(this.field20536 = new Class4853(this, "visuals", 201, 208, 170, 130, "Visuals", Class4809.field20555, Class4809.field20556));
        this.method14239(this.field20534 = new Class4853(this, "other", 201, 358, 170, 130, "Others", Class4809.field20549, Class4809.field20550));
        final Class4886 class4804;
        this.method14239(class4804 = new Class4886(this, "exit", this.method14276() - 41, 9));
        class4804.method14260((class4803, n) -> Minecraft.method5277().displayGuiScreen(null));
        final Class4799 class4805 = (Class4799)this.method14267();
        this.field20532.method14260((class4800, n) -> class4805.method14198("Combat", Category.COMBAT));
        this.field20533.method14260((class4800, n) -> class4805.method14198("Movement", Category.MOVEMENT));
        this.field20537.method14260((class4800, n) -> class4805.method14198("World", Category.WORLD));
        this.field20535.method14260((class4800, n) -> class4805.method14198("Player", Category.PLAYER));
        this.field20536.method14260((class4800, n) -> class4805.method14198("Visuals", Category.RENDER, Category.GUI));
        this.field20534.method14260((class4800, n) -> class4805.method14198("Others", Category.MISC));
        this.method14311(false);
    }
    
    public static void method14332() {
        if (Class4809.field20538 == null) {
            Class4809.field20538 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/colors.png");
            Class4809.field20539 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/colors2.png");
            Class4809.field20540 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/combat.png");
            Class4809.field20541 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/combat2.png");
            Class4809.field20542 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/downarrow.png");
            Class4809.field20543 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/gear.png");
            Class4809.field20544 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/gear2.png");
            Class4809.field20545 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/movement.png");
            Class4809.field20546 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/movement2.png");
            Class4809.field20547 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/msgo.png");
            Class4809.field20548 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/msgo2.png");
            Class4809.field20549 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/others.png");
            Class4809.field20550 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/others2.png");
            Class4809.field20551 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/player.png");
            Class4809.field20552 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/player2.png");
            Class4809.field20553 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/uparrow.png");
            Class4809.field20554 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/uparrow2.png");
            Class4809.field20555 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/visuals.png");
            Class4809.field20556 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/visuals2.png");
            Class4809.field20557 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/xmark.png");
            Class4809.field20558 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/xmark2.png");
            Class4809.field20559 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/world.png");
            Class4809.field20560 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/world2.png");
        }
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
}
