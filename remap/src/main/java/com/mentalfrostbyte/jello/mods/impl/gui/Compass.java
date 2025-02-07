// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.gui;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

import java.util.ArrayList;

public class Compass extends Module
{
    public Compass() {
        super(Category.GUI, "Compass", "Fornite style directions");
        this.method9915(false);
    }
    
    @EventListener
    private void method10804(final Class5740 class5740) {
        if (!this.isEnabled() || Compass.mc.player == null) {
            return;
        }
        if (!Minecraft.method5277().gameSettings.field23464) {
            final int index = 5;
            final int n = 60;
            final int n2 = Minecraft.method5277().gameSettings.field23466 ? 60 : 0;
            final ArrayList<Integer> method10807 = this.method10807((int)this.method10809(Compass.mc.player.rotationYaw), index);
            int intValue = method10807.get(index);
            if (intValue == 0) {
                if (this.method10809(Compass.mc.player.rotationYaw) > 345.0f) {
                    intValue = 360;
                }
            }
            final double n3 = (7.0f + this.method10809(Compass.mc.player.rotationYaw) - intValue) / 15.0f * n;
            RenderUtil.method26899(Compass.mc.window.method7694() / 2 - index * n * 1.5f, -40.0f, index * n * 2 * 1.5f, (float)(220 + n2), ClientAssets.shadow, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.25f));
            int n4 = 0;
            for (final int intValue2 : method10807) {
                ++n4;
                this.method10805(Compass.mc.window.method7694() / 2 + n4 * n - (int)n3 - (index + 1) * n - 2, 30 + n2, n, intValue2, (float)Math.min(Math.max(0.0, Math.min((n4 * n - n3) / (float)(n * index), 1.0)), Math.max(0.0, Math.min(2.25 - (n4 * n - n3) / (float)(n * index), 1.0))) * 0.8f);
            }
        }
    }
    
    private void method10805(final int n, final int n2, final int n3, final int i, final float n4) {
        String string = i + "";
        if (!string.equals("0")) {
            if (!string.equals("90")) {
                if (!string.equals("180")) {
                    if (!string.equals("270")) {
                        if (!string.equals("45")) {
                            if (!string.equals("135")) {
                                if (!string.equals("225")) {
                                    if (string.equals("315")) {
                                        string = "SE";
                                    }
                                }
                                else {
                                    string = "NE";
                                }
                            }
                            else {
                                string = "NW";
                            }
                        }
                        else {
                            string = "SW";
                        }
                    }
                    else {
                        string = "E";
                    }
                }
                else {
                    string = "N";
                }
            }
            else {
                string = "W";
            }
        }
        else {
            string = "S";
        }
        if (!string.matches(".*\\d+.*")) {
            if (string.length() != 1) {
                RenderUtil.drawString(ClientFonts.JelloLight25, (float)(n + (n3 - ClientFonts.JelloLight25.getWidth(string)) / 2), (float)(n2 + 20), string, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n4));
            }
            else {
                RenderUtil.drawString(ClientFonts.JelloMedium40, (float)(n + (n3 - ClientFonts.JelloMedium40.getWidth(string)) / 2), (float)(n2 + 10), string, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n4));
            }
        }
        else {
            RenderUtil.method26876((float)(n + n3 / 2 - 1), (float)(n2 + 28), (float)(n + n3 / 2 + 1), (float)(n2 + 38), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n4 * 0.5f));
            RenderUtil.drawString(ClientFonts.JelloLight18, (float)(n + (n3 - ClientFonts.JelloLight18.getWidth(string)) / 2), (float)(n2 + 40), string, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n4));
        }
    }
    
    private int method10806(final int n, final int n2) {
        final int n3 = Math.abs(n2 - n) % 360;
        return (n3 <= 180) ? n3 : (360 - n3);
    }
    
    private ArrayList<Integer> method10807(final int n, final int n2) {
        final int method10808 = this.method10808(n);
        final ArrayList list = new ArrayList();
        for (int i = method10808 - 15 * n2; i < method10808; i += 15) {
            list.add((int)this.method10809((float)i));
        }
        for (int j = method10808; j < method10808 + 15 * (n2 + 1); j += 15) {
            list.add((int)this.method10809((float)j));
        }
        return list;
    }
    
    private int method10808(final int n) {
        return (n + 7) / 15 * 15;
    }
    
    public float method10809(float n) {
        n %= 360.0f;
        if (n < 0.0f) {
            n += 360.0f;
        }
        return n;
    }
}
