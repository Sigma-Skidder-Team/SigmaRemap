// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import java.util.List;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class Projectiles extends Module
{
    public Class8551 field15657;
    public Class8423 field15658;
    public Class8423 field15659;
    public Class8423 field15660;
    
    public Projectiles() {
        super(Category.RENDER, "Projectiles", "Predict the path of a projectile");
        this.field15657 = Projectiles.mc.method5306();
        this.field15658 = new Class8423(0.0f, 0.0f, 0.0f);
        this.field15659 = new Class8423(0.0f, 0.0f, 0.0f);
        this.field15660 = new Class8423(0.0f, 0.0f, 0.0f);
        this.method9915(false);
    }
    
    @EventListener
    public void method10109(final Custom3DRenderEvent custom3DRenderEvent) {
        if (!this.isEnabled()) {
            return;
        }
        if (Projectiles.mc.player.getHeldItemMainhand() != null) {
            final Class234 method872 = Class234.method872(Projectiles.mc.player.getHeldItemMainhand().getItem());
            if (method872 != null) {
                final float n = (float)Math.toRadians(Projectiles.mc.player.rotationYaw - 25.0f);
                final float n2 = (float)Math.toRadians(Projectiles.mc.player.rotationPitch);
                final double n3 = 0.20000000298023224;
                final double n4 = Projectiles.mc.player.boundingBox.getAverageEdgeLength() / 2.0;
                final double n5 = MathHelper.cos(n) * n4;
                final double n6 = MathHelper.sin(n) * n4;
                final double n7 = Projectiles.mc.player.lastTickPosX + (Projectiles.mc.player.posX - Projectiles.mc.player.lastTickPosX) * Projectiles.mc.timer.field26528;
                final double n8 = Projectiles.mc.player.lastTickPosY + (Projectiles.mc.player.posY - Projectiles.mc.player.lastTickPosY) * Projectiles.mc.timer.field26528;
                final double n9 = Projectiles.mc.player.lastTickPosZ + (Projectiles.mc.player.posZ - Projectiles.mc.player.lastTickPosZ) * Projectiles.mc.timer.field26528;
                GL11.glPushMatrix();
                GL11.glEnable(2848);
                GL11.glBlendFunc(770, 771);
                GL11.glEnable(3042);
                GL11.glDisable(3553);
                GL11.glDisable(2929);
                GL11.glEnable(32925);
                GL11.glDisable(2896);
                GL11.glShadeModel(7425);
                GL11.glDepthMask(false);
                GL11.glLineWidth(10.0f);
                GL11.glColor4d(0.0, 0.0, 0.0, 0.05000000074505806);
                GL11.glAlphaFunc(519, 0.0f);
                GL11.glBegin(3);
                final List<Class8797> method873 = method872.method873();
                for (int i = 0; i < method873.size(); ++i) {
                    final Class8797 class5740 = method873.get(i);
                    final double n10 = n5 - (i + 1) / (float)method873.size() * n5;
                    final double n11 = n6 - (i + 1) / (float)method873.size() * n6;
                    final double n12 = n3 - (i + 1) / (float)method873.size() * n3;
                    GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.05f * Math.min(1, i));
                    GL11.glVertex3d(class5740.method30683() - Projectiles.mc.field4644.method5833().method18161().getX() - n10, class5740.method30684() - Projectiles.mc.field4644.method5833().method18161().getY() - n12, class5740.method30685() - Projectiles.mc.field4644.method5833().method18161().getZ() - n11);
                }
                GL11.glEnd();
                GL11.glLineWidth(2.0f * ScreenManager.guiScale);
                GL11.glColor4d(1.0, 1.0, 1.0, 0.75);
                GL11.glBegin(3);
                for (int j = 0; j < method873.size(); ++j) {
                    final Class8797 class5741 = method873.get(j);
                    final double n13 = n5 - (j + 1) / (float)method873.size() * n5;
                    final double n14 = n6 - (j + 1) / (float)method873.size() * n6;
                    final double n15 = n3 - (j + 1) / (float)method873.size() * n3;
                    GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.75f * Math.min(1, j));
                    GL11.glVertex3d(class5741.method30683() - Projectiles.mc.field4644.method5833().method18161().getX() - n13, class5741.method30684() - Projectiles.mc.field4644.method5833().method18161().getY() - n15, class5741.method30685() - Projectiles.mc.field4644.method5833().method18161().getZ() - n14);
                }
                GL11.glEnd();
                GL11.glDisable(2929);
                if (method872.field894 == null) {
                    if (method872.field895 != null) {
                        final double n16 = method872.field895.lastTickPosX + (method872.field895.posX - method872.field895.lastTickPosX) * Projectiles.mc.timer.field26528 - Projectiles.mc.field4644.method5833().method18161().getX();
                        final double n17 = method872.field895.lastTickPosY + (method872.field895.posY - method872.field895.lastTickPosY) * Projectiles.mc.timer.field26528 - Projectiles.mc.field4644.method5833().method18161().getY();
                        final double n18 = method872.field895.lastTickPosZ + (method872.field895.posZ - method872.field895.lastTickPosZ) * Projectiles.mc.timer.field26528 - Projectiles.mc.field4644.method5833().method18161().getZ();
                        final double n19 = method872.field895.method1930() / 2.0f + 0.2f;
                        final Class7644 class5742 = new Class7644(n16 - n19, n17, n18 - n19, n16 + n19, n17 + (method872.field895.method1931() + 0.1f), n18 + n19);
                        RenderUtil.method26909(class5742, AllUtils.applyAlpha(ClientColors.DARK_BLUE_GREY.color, 0.1f));
                        RenderUtil.method26911(class5742, AllUtils.applyAlpha(ClientColors.DARK_BLUE_GREY.color, 0.1f));
                    }
                }
                else {
                    final double n20 = method872.field888 - Projectiles.mc.field4644.method5833().method18161().getX();
                    final double n21 = method872.field889 - Projectiles.mc.field4644.method5833().method18161().getY();
                    final double n22 = method872.field890 - Projectiles.mc.field4644.method5833().method18161().getZ();
                    GL11.glPushMatrix();
                    GL11.glTranslated(n20, n21, n22);
                    final BlockPos method874 = new BlockPos(0, 0, 0).method1149(((BlockRayTraceResult)method872.field894).getFace());
                    GL11.glRotatef(45.0f, this.field15658.method28124((float)method874.getX()), this.field15658.method28125((float)(-method874.getY())), this.field15658.method28126((float)method874.getZ()));
                    GL11.glRotatef(90.0f, this.field15659.method28124((float)method874.getZ()), this.field15659.method28125((float)method874.getY()), this.field15659.method28126((float)(-method874.getX())));
                    GL11.glTranslatef(-0.5f, 0.0f, -0.5f);
                    final Class7644 class5743 = new Class7644(0.0, 0.0, 0.0, 1.0, 0.0, 1.0);
                    RenderUtil.method26909(class5743, AllUtils.applyAlpha(ClientColors.PALE_ORANGE.color, 0.1f));
                    RenderUtil.method26911(class5743, AllUtils.applyAlpha(ClientColors.PALE_ORANGE.color, 0.1f));
                    GL11.glPopMatrix();
                }
                GL11.glDisable(2896);
                GL11.glColor3f(1.0f, 1.0f, 1.0f);
                GL11.glEnable(2896);
                GL11.glDisable(3042);
                GL11.glEnable(3553);
                GL11.glDisable(32925);
                GL11.glDisable(2848);
                GL11.glPopMatrix();
            }
        }
    }
}
