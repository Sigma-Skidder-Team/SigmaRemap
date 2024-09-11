package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.ColorUtils;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class Projectiles extends Module {
    public EntityRendererManager field23731 = mc.getRenderManager();
    public Class7423 field23732 = new Class7423(0.0F, 0.0F, 0.0F);
    public Class7423 field23733 = new Class7423(0.0F, 0.0F, 0.0F);
    public Class7423 field23734 = new Class7423(0.0F, 0.0F, 0.0F);

    public Projectiles() {
        super(ModuleCategory.RENDER, "Projectiles", "Predict the path of a projectile");
        this.method16005(false);
    }

    // $VF: synthetic method
    public static Minecraft method16524() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16525() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16526() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16527() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16528() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16529() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16530() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16531() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16532() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16533() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16534() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16535() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16536() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16537() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16538() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16539() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16540() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16541() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16542() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16543() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16544() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16545() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16546() {
        return mc;
    }

    @EventTarget
    public void method16523(Render3DEvent var1) {
        if (this.isEnabled()) {
            if (mc.player.getHeldItemMainhand() != null) {
                Class2309 var4 = Class2309.method9085(mc.player.getHeldItemMainhand().getItem());
                if (var4 != null) {
                    float var5 = (float) Math.toRadians(mc.player.rotationYaw - 25.0F);
                    float var6 = (float) Math.toRadians(mc.player.rotationPitch);
                    double var7 = 0.2F;
                    double var9 = mc.player.boundingBox.getAverageEdgeLength() / 2.0;
                    double var11 = (double) MathHelper.cos(var5) * var9;
                    double var13 = (double) MathHelper.sin(var5) * var9;
                    double var15 = mc.player.lastTickPosX
                            + (mc.player.getPosX() - mc.player.lastTickPosX) * (double) mc.timer.renderPartialTicks;
                    double var17 = mc.player.lastTickPosY
                            + (mc.player.getPosY() - mc.player.lastTickPosY) * (double) mc.timer.renderPartialTicks;
                    double var19 = mc.player.lastTickPosZ
                            + (mc.player.getPosZ() - mc.player.lastTickPosZ) * (double) mc.timer.renderPartialTicks;
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
                    GL11.glLineWidth(10.0F);
                    GL11.glColor4d(0.0, 0.0, 0.0, 0.05F);
                    GL11.glAlphaFunc(519, 0.0F);
                    GL11.glBegin(3);
                    List var21 = var4.method9086();

                    for (int var22 = 0; var22 < var21.size(); var22++) {
                        Class9110 var23 = (Class9110) var21.get(var22);
                        double var24 = var11 - (double) ((float) (var22 + 1) / (float) var21.size()) * var11;
                        double var26 = var13 - (double) ((float) (var22 + 1) / (float) var21.size()) * var13;
                        double var28 = var7 - (double) ((float) (var22 + 1) / (float) var21.size()) * var7;
                        float var30 = (float) Math.min(1, var22);
                        GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.05F * var30);
                        GL11.glVertex3d(
                                var23.method33969() - mc.gameRenderer.getActiveRenderInfo().getPos().getX() - var24,
                                var23.method33970() - mc.gameRenderer.getActiveRenderInfo().getPos().getY() - var28,
                                var23.method33971() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ() - var26
                        );
                    }

                    GL11.glEnd();
                    GL11.glLineWidth(2.0F * GuiManager.portalScaleFactor);
                    GL11.glColor4d(1.0, 1.0, 1.0, 0.75);
                    GL11.glBegin(3);

                    for (int var38 = 0; var38 < var21.size(); var38++) {
                        Class9110 var39 = (Class9110) var21.get(var38);
                        double var40 = var11 - (double) ((float) (var38 + 1) / (float) var21.size()) * var11;
                        double var43 = var13 - (double) ((float) (var38 + 1) / (float) var21.size()) * var13;
                        double var46 = var7 - (double) ((float) (var38 + 1) / (float) var21.size()) * var7;
                        float var48 = (float) Math.min(1, var38);
                        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F * var48);
                        GL11.glVertex3d(
                                var39.method33969() - mc.gameRenderer.getActiveRenderInfo().getPos().getX() - var40,
                                var39.method33970() - mc.gameRenderer.getActiveRenderInfo().getPos().getY() - var46,
                                var39.method33971() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ() - var43
                        );
                    }

                    GL11.glEnd();
                    GL11.glDisable(2929);
                    if (var4.field15831 == null) {
                        if (var4.field15832 != null) {
                            double var31 = var4.field15832.lastTickPosX
                                    + (var4.field15832.getPosX() - var4.field15832.lastTickPosX) * (double) mc.timer.renderPartialTicks
                                    - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
                            double var41 = var4.field15832.lastTickPosY
                                    + (var4.field15832.getPosY() - var4.field15832.lastTickPosY) * (double) mc.timer.renderPartialTicks
                                    - mc.gameRenderer.getActiveRenderInfo().getPos().getY();
                            double var44 = var4.field15832.lastTickPosZ
                                    + (var4.field15832.getPosZ() - var4.field15832.lastTickPosZ) * (double) mc.timer.renderPartialTicks
                                    - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
                            double var47 = var4.field15832.getWidth() / 2.0F + 0.2F;
                            double var35 = var4.field15832.getHeight() + 0.1F;
                            Box3D var37 = new Box3D(var31 - var47, var41, var44 - var47, var31 + var47, var41 + var35, var44 + var47);
                            RenderUtil.render3DColoredBox(var37, ColorUtils.applyAlpha(ClientColors.DARK_BLUE_GREY.getColor, 0.1F));
                            RenderUtil.renderWireframeBox(var37, ColorUtils.applyAlpha(ClientColors.DARK_BLUE_GREY.getColor, 0.1F));
                        }
                    } else {
                        double var49 = var4.field15825 - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
                        double var42 = var4.field15826 - mc.gameRenderer.getActiveRenderInfo().getPos().getY();
                        double var45 = var4.field15827 - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
                        GL11.glPushMatrix();
                        GL11.glTranslated(var49, var42, var45);
                        BlockPos var33 = new BlockPos(0, 0, 0).method8349(((BlockRayTraceResult) var4.field15831).getFace());
                        GL11.glRotatef(
                                45.0F,
                                this.field23732.method23931((float) var33.getX()),
                                this.field23732.method23932((float) (-var33.getY())),
                                this.field23732.method23933((float) var33.getZ())
                        );
                        GL11.glRotatef(
                                90.0F,
                                this.field23733.method23931((float) var33.getZ()),
                                this.field23733.method23932((float) var33.getY()),
                                this.field23733.method23933((float) (-var33.getX()))
                        );
                        GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
                        Box3D var34 = new Box3D(0.0, 0.0, 0.0, 1.0, 0.0, 1.0);
                        RenderUtil.render3DColoredBox(var34, ColorUtils.applyAlpha(ClientColors.PALE_ORANGE.getColor, 0.1F));
                        RenderUtil.renderWireframeBox(var34, ColorUtils.applyAlpha(ClientColors.PALE_ORANGE.getColor, 0.1F));
                        GL11.glPopMatrix();
                    }

                    GL11.glDisable(2896);
                    GL11.glColor3f(1.0F, 1.0F, 1.0F);
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
}
