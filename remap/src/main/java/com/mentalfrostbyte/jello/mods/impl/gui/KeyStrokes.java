// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.gui;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

import java.util.Iterator;
import java.util.ArrayList;

public class KeyStrokes extends Module
{
    public int field15538;
    public int field15539;
    public ArrayList<Class9151> field15540;
    
    public KeyStrokes() {
        super(Category.GUI, "KeyStrokes", "Shows what keybind you are pressing");
        this.field15538 = 10;
        this.field15539 = 260;
        this.field15540 = new ArrayList<Class9151>();
        this.method9915(false);
    }
    
    public Class2090 method9949(final int n) {
        if (n == KeyStrokes.mc.gameSettings.field23436.field2161.field32860) {
            return Class2090.field12082;
        }
        if (n == KeyStrokes.mc.gameSettings.field23438.field2161.field32860) {
            return Class2090.field12083;
        }
        if (n == KeyStrokes.mc.gameSettings.field23435.field2161.field32860) {
            return Class2090.field12084;
        }
        if (n == KeyStrokes.mc.gameSettings.field23437.field2161.field32860) {
            return Class2090.field12085;
        }
        if (n == KeyStrokes.mc.gameSettings.field23446.field2161.field32860) {
            return Class2090.field12086;
        }
        if (n != KeyStrokes.mc.gameSettings.field23445.field2161.field32860) {
            return null;
        }
        return Class2090.field12087;
    }
    
    @EventListener
    private void method9950(final Class5740 class5740) {
        if (!this.isEnabled() || KeyStrokes.mc.player == null) {
            return;
        }
        if (Minecraft.method5277().gameSettings.field23466) {
            return;
        }
        if (!Minecraft.method5277().gameSettings.field23464) {
            this.field15539 = class5740.method17028();
            if (Client.getInstance().method35193().method32146()) {
                for (final Class2090 class5741 : Class2090.values()) {
                    final Class8883 method8208 = class5741.method8208();
                    final Class8883 method8209 = class5741.method8209();
                    RenderUtil.method26870(this.field15538 + method8208.field37368, this.field15539 + method8208.field37369, this.field15538 + method8208.field37368 + method8209.field37368, this.field15539 + method8208.field37369 + method8209.field37369);
                    Class8707.method29896(this.field15538 + method8208.field37368, this.field15539 + method8208.field37369, method8209.field37368, method8209.field37369);
                    Class8707.method29899();
                    RenderUtil.method26872();
                }
            }
            for (final Class2090 class5742 : Class2090.values()) {
                final Class8883 method8210 = class5742.method8208();
                final Class8883 method8211 = class5742.method8209();
                float n = 1.0f;
                float n2 = 1.0f;
                if (Client.getInstance().method35193().method32146()) {
                    n2 = 0.5f;
                    n = 0.5f;
                }
                String method8212 = ColorUtils.method19166(class5742.field12093.field2161.field32860);
                if (class5742.field12093 != KeyStrokes.mc.gameSettings.field23446) {
                    if (class5742.field12093 == KeyStrokes.mc.gameSettings.field23445) {
                        method8212 = "R";
                    }
                }
                else {
                    method8212 = "L";
                }
                RenderUtil.method26876((float)(this.field15538 + method8210.field37368), (float)(this.field15539 + method8210.field37369), (float)(this.field15538 + method8210.field37368 + method8211.field37368), (float)(this.field15539 + method8210.field37369 + method8211.field37369), ColorUtils.applyAlpha(ClientColors.field1273.color, 0.5f * n));
                RenderUtil.method26913((float)(this.field15538 + method8210.field37368), (float)(this.field15539 + method8210.field37369), (float)method8211.field37368, (float)method8211.field37369, 10.0f, 0.75f * n2);
                RenderUtil.drawString(ClientFonts.JelloLight18, (float)(this.field15538 + method8210.field37368 + (method8211.field37368 - ClientFonts.JelloLight18.getWidth(method8212)) / 2), (float)(this.field15539 + method8210.field37369 + 12), method8212, ClientColors.LIGHT_GREYISH_BLUE.color);
            }
            final Iterator<Class9151> iterator = this.field15540.iterator();
            while (iterator.hasNext()) {
                final Class9151 class5743 = iterator.next();
                final Class2090 field38781 = class5743.field38781;
                final Class8883 method8213 = field38781.method8208();
                final Class8883 method8214 = field38781.method8209();
                RenderUtil.method26870(this.field15538 + method8213.field37368, this.field15539 + method8213.field37369, this.field15538 + method8213.field37368 + method8214.field37368, this.field15539 + method8213.field37369 + method8214.field37369);
                final float n3 = 0.7f;
                int n4 = 0;
                final Iterator<Class9151> iterator2 = this.field15540.iterator();
                while (iterator2.hasNext()) {
                    if (!iterator2.next().field38781.equals(field38781)) {
                        continue;
                    }
                    ++n4;
                }
                if (field38781.method8210().method1056()) {
                    if (class5743.field38782.calcPercent() >= n3) {
                        if (n4 < 2) {
                            class5743.field38782.method35856(n3);
                        }
                    }
                }
                final float method8215 = class5743.field38782.calcPercent();
                int n5 = ColorUtils.applyAlpha(-5658199, (1.0f - method8215 * (0.5f + method8215 * 0.5f)) * 0.8f);
                if (Client.getInstance().method35193().method32146()) {
                    n5 = ColorUtils.applyAlpha(-1, (1.0f - method8215 * (0.5f + method8215 * 0.5f)) * 0.8f);
                }
                RenderUtil.method26886((float)(this.field15538 + method8213.field37368 + method8214.method31267() / 2), (float)(this.field15539 + method8213.field37369 + method8214.field37369 / 2), (method8214.method31267() - 4) * method8215 + 4.0f, n5);
                RenderUtil.method26872();
                if (class5743.field38782.calcPercent() != 1.0f) {
                    continue;
                }
                iterator.remove();
            }
            class5740.method17030(160);
        }
    }
    
    @EventListener
    private void method9951(final Class5752 class5752) {
        if (this.isEnabled() && KeyStrokes.mc.player != null) {
            if (this.method9949(class5752.method17061()) != null) {
                if (!class5752.method17062()) {
                    this.field15540.add(new Class9151(this, this.method9949(class5752.method17061())));
                }
            }
        }
    }
    
    @EventListener
    private void method9952(final Class5748 class5748) {
        if (this.isEnabled() && KeyStrokes.mc.player != null) {
            return;
        }
    }
}
