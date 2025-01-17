// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.gui;

import java.nio.ByteBuffer;
import java.awt.Color;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import org.lwjgl.opengl.GL11;
import slick2d.TrueTypeFont;

import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ActiveMods extends Module
{
    private List<Module> field15890;
    public int field15891;
    public int field15892;
    public HashMap<Module, Class9572> field15893;
    public TrueTypeFont field15894;
    
    public ActiveMods() {
        super(Category.GUI, "ActiveMods", "Renders active mods");
        this.field15890 = new ArrayList<Module>();
        this.field15891 = 0;
        this.field15893 = new HashMap<Module, Class9572>();
        this.field15894 = ClientFonts.JelloLight20;
        this.addSetting(new StringSetting("Size", "The font size", 0, new String[] { "Normal", "Small", "Tiny" }));
        this.addSetting(new BooleanSetting("Animations", "Scale in animation", true));
        this.addSetting(new BooleanSetting("Sound", "Toggle sound", true));
        this.method9899().get("Size").method15195(class4997 -> this.method10476());
        this.method9915(false);
    }
    
    @Override
    public void method9879() {
        this.method10476();
    }
    
    public void method10476() {
        final String method9887 = this.method9887("Size");
        switch (method9887) {
            case "Normal": {
                this.field15894 = ClientFonts.JelloLight20;
                break;
            }
            case "Small": {
                this.field15894 = ClientFonts.JelloLight18;
                break;
            }
            default: {
                this.field15894 = ClientFonts.JelloLight14;
                break;
            }
        }
    }
    
    @Override
    public void method9917() {
        this.field15890.clear();
        for (final Module class3167 : Client.method35173().method35189().method21553().values()) {
            if (class3167.getCategory2() != Category.GUI) {
                this.field15890.add(class3167);
                this.field15893.put(class3167, new Class9572(150, 150, Class2186.field12965));
                if (!this.method9883("Animations")) {
                    continue;
                }
                this.field15893.get(class3167).method35855(class3167.method9906() ? Class2186.field12964 : Class2186.field12965);
            }
        }
        Collections.sort(this.field15890, new Class4466(this));
    }
    
    @EventListener
    private void method10477(final Class5726 class5726) {
        if (this.method9906() && ActiveMods.mc.player != null) {
            if (!class5726.method17000()) {
                Class8933.method31642(0.0f, (float)(-this.field15892), 0.0f);
            }
            else {
                final Class6516 method6782 = ActiveMods.mc.world.method6782();
                Class9290 method6783 = null;
                final Class6749 method6784 = method6782.method19651(ActiveMods.mc.player.method1867());
                if (method6784 != null) {
                    final int method6785 = method6784.getColor().getColorIndex();
                    if (method6785 >= 0) {
                        method6783 = method6782.method19644(3 + method6785);
                    }
                }
                final Collection<Class7628> method6786 = method6782.method19637((method6783 == null) ? method6782.method19644(1) : method6783);
                int n = 0;
                final Iterator<Module> iterator = this.field15890.iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next().method9906()) {
                        continue;
                    }
                    ++n;
                }
                final int n2 = 23 + n * (this.field15894.getHeight() + 1);
                final int size = method6786.size();
                final int n3 = Minecraft.method5277().field4632.method7695() / 2;
                ActiveMods.mc.fontRenderer.getClass();
                final int n4 = n3 - (9 + 5) * (size - 3 + 2);
                if (n2 <= n4) {
                    this.field15892 = 0;
                }
                else {
                    this.field15892 = (n2 - n4) / 2;
                    Class8933.method31642(0.0f, (float)this.field15892, 0.0f);
                }
            }
        }
    }
    
    @EventListener
    private void method10478(final Class5740 class5740) {
        if (!this.method9906() || ActiveMods.mc.player == null) {
            return;
        }
        for (final Module key : this.field15893.keySet()) {
            if (!this.method9883("Animations")) {
                continue;
            }
            this.field15893.get(key).method35855(key.method9906() ? Class2186.field12964 : Class2186.field12965);
        }
        if (!Minecraft.method5277().gameSettings.field23464) {
            int n = 10;
            final int n2 = 1;
            final int method7694 = Minecraft.method5277().field4632.method7694();
            final TrueTypeFont field15894 = this.field15894;
            int field15895 = n - 4;
            if (this.field15894 == ClientFonts.JelloLight14) {
                n -= 3;
            }
            if (Minecraft.method5277().gameSettings.field23466) {
                field15895 = (int)(ActiveMods.mc.field4647.field3763.field3801.size() * 9 * ActiveMods.mc.field4632.method7700() + 7.0);
            }
            int n3 = 0;
            final int method7695 = Class6430.method19118(-1, 0.95f);
            for (final Module key2 : this.field15890) {
                float n4 = 1.0f;
                float method7696 = 1.0f;
                if (!this.method9883("Animations")) {
                    if (!key2.method9906()) {
                        continue;
                    }
                }
                else {
                    final Class9572 class5741 = this.field15893.get(key2);
                    if (class5741.method35858() == 0.0f) {
                        continue;
                    }
                    method7696 = class5741.method35858();
                    n4 = 0.86f + 0.14f * method7696;
                }
                final String method7697 = key2.getName2();
                GL11.glAlphaFunc(519, 0.0f);
                GL11.glPushMatrix();
                final int n5 = method7694 - n - field15894.getWidth(method7697) / 2;
                final int n6 = field15895 + 12;
                GL11.glTranslatef((float)n5, (float)n6, 0.0f);
                GL11.glScalef(n4, n4, 1.0f);
                GL11.glTranslatef((float)(-n5), (float)(-n6), 0.0f);
                Class8154.method26899(method7694 - field15894.getWidth(method7697) * 1.5f - n - 20.0f, (float)(field15895 - 20), field15894.getWidth(method7697) * 3.0f, (float)(field15894.getHeight() + n2 + 40), ClientAssets.shadow, Class6430.method19118(Class265.field1278.field1292, 0.36f * method7696 * (float)Math.sqrt(Math.min(1.2f, field15894.getWidth(method7697) / 63.0f))));
                Class8154.method26889(field15894, (float)(method7694 - n - field15894.getWidth(method7697)), (float)field15895, method7697, (method7696 != 1.0f) ? Class6430.method19118(-1, method7696 * 0.95f) : method7695);
                GL11.glPopMatrix();
                n3 -= 100;
                field15895 += (int)((field15894.getHeight() + n2) * Class7791.method25031(method7696, 0.0f, 1.0f, 1.0f));
            }
            this.field15891 = field15895;
        }
    }
    
    public int method10479() {
        return this.field15891;
    }
    
    private Color method10480(final int n, final int n2, final Color color) {
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(3);
        GL11.glPixelStorei(3317, 1);
        GL11.glReadPixels(n, Minecraft.method5277().field4632.method7695() - n2, 1, 1, 6407, 5120, allocateDirect);
        Color method19109 = new Color(allocateDirect.get(0) * 2, allocateDirect.get(1) * 2, allocateDirect.get(2) * 2, 1);
        if (color != null) {
            method19109 = Class6430.method19109(method19109, color, 0.08f);
        }
        return method19109;
    }
}
