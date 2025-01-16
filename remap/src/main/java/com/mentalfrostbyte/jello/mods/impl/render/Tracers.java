// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.ColorSetting;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class Tracers extends Module
{
    public Tracers() {
        super(Category.RENDER, "Tracers", "Shows players");
        this.addSetting(new ColorSetting("Color", "The tracers color", Class265.field1278.field1292));
    }
    
    @EventListener
    public void method10023(final Class5739 class5739) {
        if (this.method9906()) {
            GL11.glBlendFunc(770, 771);
            GL11.glAlphaFunc(519, 0.0f);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(3553);
            GL11.glDisable(2929);
            GL11.glLineWidth(2.0f * Class9000.field37993);
            GL11.glDepthMask(false);
            GL11.glShadeModel(7425);
            for (final Entity class5740 : Class6430.method19108()) {
                if (class5740 == Tracers.mc.player) {
                    continue;
                }
                if (!class5740.method1768()) {
                    continue;
                }
                if (class5740.boundingBox.getAverageEdgeLength() <= 0.8) {
                    continue;
                }
                if (class5740.ticksExisted <= 30) {
                    continue;
                }
                if (Client.method35173().method35191().method31751(class5740)) {
                    continue;
                }
                this.method10024(class5740);
            }
            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(2848);
            GL11.glDisable(3042);
            GL11.glDepthMask(true);
        }
    }
    
    public void method10024(final Entity class399) {
        final double field38854 = Class8591.method29094(class399).field38854;
        final double n = Class8591.method29094(class399).field38855 + class399.method1931() / 2.0f;
        final double field38855 = Class8591.method29094(class399).field38856;
        final Vec3d method16755 = new Vec3d(0.0, 0.0, 10.0).rotatePitch(-(float)Math.toRadians(Minecraft.method5277().player.rotationPitch)).rotateYaw(-(float)Math.toRadians(Minecraft.method5277().player.rotationYaw));
        final int method16756 = this.method9885("Color");
        GL11.glBegin(1);
        GL11.glColor4fv(Class6430.method19139(Class6430.method19118(method16756, 0.45f)));
        GL11.glVertex3d(method16755.x, method16755.y, method16755.z);
        GL11.glColor4fv(Class6430.method19139(Class6430.method19118(method16756, 0.0f)));
        GL11.glVertex3d(field38854, n, field38855);
        GL11.glEnd();
    }
}
