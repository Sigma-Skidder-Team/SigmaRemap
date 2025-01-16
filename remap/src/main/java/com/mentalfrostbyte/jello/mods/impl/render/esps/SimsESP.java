// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render.esps;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import java.awt.Color;

public class SimsESP extends Module
{
    public SimsESP() {
        super(Category.RENDER, "Sims", "You know what it is");
    }
    
    @EventListener
    public void method10797(final Class5739 class5739) {
        if (this.method9906()) {
            for (final Entity class5740 : Class4609.method13679(Class6430.method19108())) {
                if (class5740 != SimsESP.mc.player) {
                    if (Client.method35173().method35191().method31751(class5740)) {
                        continue;
                    }
                    method10800(class5740.lastTickPosX + (class5740.posX - class5740.lastTickPosX) * Minecraft.method5277().timer.field26528, class5740.lastTickPosY + class5740.method1931() + (class5740.posY - class5740.lastTickPosY) * Minecraft.method5277().timer.field26528, class5740.lastTickPosZ + (class5740.posZ - class5740.lastTickPosZ) * Minecraft.method5277().timer.field26528, class5740);
                }
            }
        }
    }
    
    public static void method10798() {
        final Color[] array = { new Color(136, 217, 72), new Color(124, 189, 72), new Color(103, 181, 75), new Color(136, 217, 72), new Color(124, 189, 72), new Color(103, 181, 75), new Color(136, 217, 72), new Color(103, 181, 75), null, null };
        for (int i = 0; i <= 315; i += 45) {
            GL11.glPushMatrix();
            GL11.glRotatef((float)i, 0.0f, 1.0f, 0.0f);
            final int n = i / 45;
            method10799(array[n].getRed() / 255.0f, array[n].getGreen() / 255.0f, array[n].getBlue() / 255.0f);
            GL11.glPopMatrix();
        }
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        for (int j = 0; j <= 315; j += 45) {
            GL11.glPushMatrix();
            GL11.glRotatef((float)j, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
            final Color color = new Color(Class6430.method19121(array[j / 45].getRGB(), 0.2f), false);
            method10799(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f);
            GL11.glPopMatrix();
        }
    }
    
    public static void method10799(final float n, final float n2, final float n3) {
        GL11.glColor3f(n, n2, n3);
        GL11.glTranslatef(0.0f, 0.0f, 0.25f);
        GL11.glNormal3f(0.0f, 0.0f, 1.0f);
        GL11.glRotated(-30.0, 1.0, 0.0, 0.0);
        GL11.glBegin(6);
        GL11.glVertex2f(0.0f, 0.5f);
        GL11.glVertex2f(-0.105f, 0.0f);
        GL11.glVertex2f(0.105f, 0.0f);
        GL11.glEnd();
    }
    
    public static void method10800(final double n, final double n2, final double n3, final Entity class399) {
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glPushMatrix();
        GL11.glTranslated(n - SimsESP.mc.field4644.method5833().method18161().getX(), n2 - SimsESP.mc.field4644.method5833().method18161().getY(), n3 - SimsESP.mc.field4644.method5833().method18161().getZ());
        GL11.glRotated((double)(class399.ticksExisted % 180 * 2), 0.0, -1.0, 0.0);
        float n4 = (float)(class399.ticksExisted % 100 - 50);
        if (n4 < 0.0f) {
            n4 *= -1.0f;
        }
        GL11.glTranslated(0.0, (double)(0.7f + n4 / 500.0f), 0.0);
        method10798();
        GL11.glPopMatrix();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }
}
