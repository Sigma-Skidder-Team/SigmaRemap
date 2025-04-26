// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;
import org.newdawn.slick.TrueTypeFont;

import java.util.Map;
import java.util.TreeMap;

public class ActiveMods extends Module
{
    private TreeMap<Module, Animation> field15896;
    private TrueTypeFont field15897;
    private TrueTypeFont field15898;
    private Animation field15899;
    
    public ActiveMods() {
        super(Category.RENDER, "ActiveMods", "Shows active mods");
        this.field15896 = new TreeMap<Module, Animation>();
        this.addSetting(new StringSetting("Outline", "Outline", 0, new String[] { "All", "Left", "Right", "None" }));
        this.addSetting(new StringSetting("Animation", "Animation", 0, new String[] { "Smooth", "Slide", "Both", "None" }));
        this.addSetting(new BooleanSetting("Sound", "Toggle sound", true));
    }
    
    @Override
    public void initialize() {
        this.method10487();
        this.method10486();
    }
    
    private void method10486() {
        this.field15899 = new Animation(2000, 2000, Direction.BACKWARDS);
    }
    
    private void method10487() {
        this.field15896.clear();
        this.field15897 = ClassicAssets.field40812;
        this.field15898 = ClassicAssets.field40813;
        this.field15896 = new TreeMap<Module, Animation>(new Class4462(this));
    }
    
    @EventListener
    private void method10488(final Class5740 class5740) {
        if (this.isEnabled() && ActiveMods.mc.player != null) {
            final String method9887 = this.getStringSettingValueByName("Animation");
            final String method9888 = this.getStringSettingValueByName("Outline");
            this.method10489();
            if (this.field15899.calcPercent() == 1.0f) {
                this.field15899.method35856(0.0f);
            }
            int n = -2;
            final int n2 = Minecraft.getInstance().window.method7694() - 2;
            final int n3 = -2;
            new java.awt.Color(0, 192, 255, 255).getRGB();
            int n4 = new java.awt.Color(0, 192, 255, 255).getRGB();
            int n5 = -7;
            float method9889 = this.field15899.calcPercent();
            for (final Map.Entry<K, Animation> entry : this.field15896.entrySet()) {
                final Animation class5741 = entry.getValue();
                final Module class5742 = (Module)entry.getKey();
                if (!class5742.isEnabled()) {
                    if (class5741.calcPercent() == 1.0f) {
                        continue;
                    }
                    if (method9887.equalsIgnoreCase("None")) {
                        continue;
                    }
                }
                final int hsBtoRGB = java.awt.Color.HSBtoRGB(method9889, 1.0f, 1.0f);
                n4 = java.awt.Color.HSBtoRGB(method9889, 1.0f, 1.0f);
                final int method9890 = this.method10491(class5742);
                int n6 = this.field15897.getHeight(class5742.getFormattedName()) + n3;
                final float n7 = 1.0f - Class7791.method25030(class5741.calcPercent(), 0.0f, 1.0f, 1.0f);
                if (method9887.equalsIgnoreCase("Smooth") || method9887.equalsIgnoreCase("Both")) {
                    n6 *= (int)n7;
                }
                RenderSystem.pushMatrix();
                if (method9888.equalsIgnoreCase("Right")) {
                    GL11.glTranslated(-3.0, 0.0, 0.0);
                }
                RenderUtil.method26876((float)(n2 - method9890 - 3), (float)(n + 1), (float)(n2 + 2), (float)(n + n6 + 1), new java.awt.Color(0, 0, 0, 150).getRGB());
                if (!method9888.equalsIgnoreCase("None")) {
                    if (!method9888.equalsIgnoreCase("All")) {
                        if (!method9888.equalsIgnoreCase("Left")) {
                            if (method9888.equalsIgnoreCase("Right")) {
                                RenderUtil.method26876((float)(n2 + 2), (float)(n + 1), (float)(n2 + 7), (float)(n + 1 + n6), n4);
                            }
                        }
                        else {
                            RenderUtil.method26876((float)(n2 - method9890 - 6), (float)(n + 1), (float)(n2 - method9890 - 3), (float)(n + 1 + n6), n4);
                        }
                    }
                    else {
                        RenderUtil.method26876((float)(n2 - method9890 - 5), (float)(n + 1), (float)(n2 - method9890 - 3), (float)(n + 1 + n6), n4);
                        RenderUtil.method26876((float)(n2 - method9890 - 3), (float)(n + 1), (float)(n2 - n5 - 5), (float)(n + 3), n4);
                    }
                }
                RenderSystem.method30070();
                RenderSystem.enableBlend();
                if (method9887.equalsIgnoreCase("Slide") || method9887.equalsIgnoreCase("Both")) {
                    GL11.glTranslated((double)(method9890 * Class7791.method25030(class5741.calcPercent(), 0.0f, 1.0f, 1.0f)), 0.0, 0.0);
                }
                RenderUtil.method26868((float)(n2 - method9890 - 3), (float)(n + 1), (float)n2, n + n6 - Class7791.method25030(class5741.calcPercent(), 0.0f, 1.0f, 1.0f));
                this.field15897.drawString((float)(n2 - method9890), (float)n, class5742.getFormattedName(), new Color(hsBtoRGB));
                this.field15898.drawString((float)(n2 - this.field15898.getWidth(this.method10490(class5742))), n + 1.6f, this.method10490(class5742), new Color(160, 160, 160));
                RenderUtil.endScissor();
                RenderSystem.disableBlend();
                n += n6;
                RenderSystem.popMatrix();
                n5 = method9890;
                method9889 += (float)0.0196078431372549;
                if (method9889 <= 1.0f) {
                    continue;
                }
                method9889 = 0.0f;
            }
            if (method9888.equalsIgnoreCase("All")) {
                if (n5 > 0) {
                    RenderUtil.method26876((float)(n2 - n5 - 5), (float)(n + 1), (float)(n2 + 2), (float)(n + 3), n4);
                }
            }
        }
    }
    
    private void method10489() {
        if (this.field15896.isEmpty()) {
            this.field15896.clear();
            for (final Module key : Client.getInstance().moduleManager().getModuleMap().values()) {
                if (key == this) {
                    continue;
                }
                if (key.getCategory() == Category.GUI) {
                    continue;
                }
                final Animation value = new Animation(200, 200, key.isEnabled() ? Direction.FORWARDS : Direction.BACKWARDS);
                value.method35856(key.isEnabled() ? 0.0f : 1.0f);
                this.field15896.put(key, value);
                final Setting class4997 = key.method9899().get("Type");
                if (class4997 == null) {
                    final Setting class4998 = key.method9899().get("Mode");
                    if (class4998 == null) {
                        continue;
                    }
                    class4998.method15195(class4997 -> this.method10487());
                }
                else {
                    class4997.method15195(class4997 -> this.method10487());
                }
            }
        }
        for (final Map.Entry entry : this.field15896.entrySet()) {
            ((Animation)entry.getValue()).changeDirection(((Module)entry.getKey()).isEnabled() ? Direction.FORWARDS : Direction.BACKWARDS);
        }
    }
    
    private String method10490(final Module class3167) {
        String s = "";
        if (class3167.getStringSettingValueByName("Type") == null) {
            if (class3167.getStringSettingValueByName("Mode") != null) {
                s = s + " " + class3167.getStringSettingValueByName("Mode");
            }
        }
        else {
            s = s + " " + class3167.getStringSettingValueByName("Type");
        }
        return s;
    }
    
    private int method10491(final Module class3167) {
        return this.field15897.getWidth(class3167.getFormattedName()) + this.field15898.getWidth(this.method10490(class3167));
    }
}
