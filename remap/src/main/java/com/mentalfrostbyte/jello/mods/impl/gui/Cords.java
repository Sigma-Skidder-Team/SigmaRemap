// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.gui;

import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import org.lwjgl.opengl.GL11;

public class Cords extends Module
{
    private int field15924;
    private Animation field15925;
    
    public Cords() {
        super(Category.GUI, "Cords", "Displays coordinates");
        this.field15925 = new Animation(1500, 1500, Direction.FORWARDS);
    }
    
    @EventListener
    private void method10528(final Class5743 class5743) {
        if (this.isEnabled()) {
            if (ColorUtils.method19135() > this.field15924) {
                if (Cords.mc.player.ticksExisted % 3 == 0) {
                    ++this.field15924;
                }
            }
            if (ColorUtils.method19135() < this.field15924) {
                if (Cords.mc.player.ticksExisted % 3 == 0) {
                    --this.field15924;
                }
            }
            boolean b = false;
            Label_0141: {
                if (!Class7482.method23148()) {
                    if (!Cords.mc.player.field2967) {
                        if (!Cords.mc.player.method1809()) {
                            b = false;
                            break Label_0141;
                        }
                    }
                }
                b = true;
            }
            if (!b) {
                if (this.field15925.calcPercent() == 1.0f) {
                    if (this.field15925.getDirection() == Direction.BACKWARDS) {
                        this.field15925.changeDirection(Direction.FORWARDS);
                    }
                }
            }
            else {
                this.field15925.changeDirection(Direction.BACKWARDS);
            }
        }
    }
    
    @EventListener
    @Class6755
    private void method10529(final Class5740 class5740) {
        if (!this.isEnabled()) {
            return;
        }
        if (Cords.mc.player == null) {
            return;
        }
        if (Minecraft.method5277().gameSettings.field23466) {
            return;
        }
        if (!Minecraft.method5277().gameSettings.field23464) {
            final float min = Math.min(1.0f, 0.6f + this.field15925.calcPercent() * 4.0f);
            final String string = Cords.mc.player.method1894().getX() + " " + Cords.mc.player.method1894().getY() + " " + Cords.mc.player.method1894().getZ();
            final int n = 85;
            final int method17028 = class5740.method17028();
            final float min2 = Math.min(1.0f, 150 / (float) ClientFonts.JelloLight18.getWidth(string));
            float n2;
            if (this.field15925.getDirection() != Direction.BACKWARDS) {
                n2 = min2 * (0.9f + Class7791.method25029(Math.min(1.0f, this.field15925.calcPercent() * 8.0f), 0.0f, 1.0f, 1.0f) * 0.1f);
            }
            else {
                n2 = min2 * (0.9f + Class7707.method24584(Math.min(1.0f, this.field15925.calcPercent() * 7.0f), 0.0f, 1.0f, 1.0f) * 0.1f);
            }
            GL11.glPushMatrix();
            GL11.glTranslatef((float)n, (float)(method17028 + 10), 0.0f);
            GL11.glScalef(n2, n2, 1.0f);
            GL11.glTranslatef((float)(-n), (float)(-method17028 - 10), 0.0f);
            RenderUtil.method26890(ClientFonts.JelloLight18_AA, (float)n, (float)method17028, string, ColorUtils.applyAlpha(-16777216, 0.5f * min), Class2056.field11738, Class2056.field11734);
            RenderUtil.method26890(ClientFonts.JelloLight18, (float)n, (float)method17028, string, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.8f * min), Class2056.field11738, Class2056.field11734);
            GL11.glPopMatrix();
        }
    }
}
