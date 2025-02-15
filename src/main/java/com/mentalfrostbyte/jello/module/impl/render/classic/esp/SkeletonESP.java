package com.mentalfrostbyte.jello.module.impl.render.classic.esp;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.impl.EventRender3D;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.ColorSetting;
import com.mentalfrostbyte.jello.util.ClientColors;
import mapped.PlayerModel;
import mapped.Vector3d;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class SkeletonESP extends Module {
    private static final Map<PlayerEntity, float[][]> bodyParts = new HashMap<>();

    public SkeletonESP() {
        super(ModuleCategory.RENDER, "Skeleton", "Skeleton ESP.");
        this.registerSetting(
                new ColorSetting("Color", "The Skeleton color", ClientColors.LIGHT_GREYISH_BLUE.getColor()));
        this.registerSetting(new BooleanSetting("CSGO", "Add a CSGO look.", true));
    }

    private void method16089(EventRender3D var1, PlayerEntity entity) {
        Color color = new Color(
                !Client.getInstance().friendManager.isFriend(entity.getName().getString())
                        ? (!entity.getName().getString().equalsIgnoreCase(mc.player.getName().getString())
                        ? new Color(16775672).getRGB()
                        : -6684775)
                        : -8401409);
        if (!entity.isInvisible()) {
            float[][] bodyPart = bodyParts.get(entity);
            if (bodyPart != null && entity.isAlive() && entity != mc.player && !entity.isSleeping()) {
                GL11.glPushMatrix();
                GL11.glLineWidth(2.0F);
                GL11.glColor4f((float) (color.getRed() / 255), (float) (color.getGreen() / 255),
                        (float) (color.getBlue() / 255), 1.0F);
                Vector3d var7 = this.method16090(var1, entity);
                double var8 = var7.getX() - mc.getRenderManager().info.getPos().x;
                double var10 = var7.getY() - mc.getRenderManager().info.getPos().y;
                double var12 = var7.getZ() - mc.getRenderManager().info.getPos().z;
                GL11.glTranslated(var8, var10, var12);
                float var14 = entity.prevRenderYawOffset
                        + (entity.renderYawOffset - entity.prevRenderYawOffset) * mc.getRenderPartialTicks();
                GL11.glRotatef(-var14, 0.0F, 1.0F, 0.0F);
                GL11.glTranslated(0.0, 0.0, !entity.isSneaking() ? 0.0 : -0.235);
                float var15 = !entity.isSneaking() ? 0.75F : 0.6F;
                GL11.glPushMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslated(-0.125, (double) var15, 0.0);
                if (bodyPart[3][0] != 0.0F) {
                    GL11.glRotatef(bodyPart[3][0] * (180.0F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                }

                if (bodyPart[3][1] != 0.0F) {
                    GL11.glRotatef(bodyPart[3][1] * (180.0F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
                }

                if (bodyPart[3][2] != 0.0F) {
                    GL11.glRotatef(bodyPart[3][2] * (180.0F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
                }

                GL11.glBegin(3);
                GL11.glVertex3d(0.0, 0.0, 0.0);
                GL11.glVertex3d(0.0, (double) (-var15), 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslated(0.125, (double) var15, 0.0);
                if (bodyPart[4][0] != 0.0F) {
                    GL11.glRotatef(bodyPart[4][0] * (180.0F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                }

                if (bodyPart[4][1] != 0.0F) {
                    GL11.glRotatef(bodyPart[4][1] * (180.0F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
                }

                if (bodyPart[4][2] != 0.0F) {
                    GL11.glRotatef(bodyPart[4][2] * (180.0F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
                }

                GL11.glBegin(3);
                GL11.glVertex3d(0.0, 0.0, 0.0);
                GL11.glVertex3d(0.0, (double) (-var15), 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glTranslated(0.0, 0.0, !entity.isSneaking() ? 0.0 : 0.25);
                GL11.glPushMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslated(0.0, !entity.isSneaking() ? 0.0 : -0.05, !entity.isSneaking() ? 0.0 : -0.01725);
                GL11.glPushMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslated(-0.375, (double) var15 + 0.55, 0.0);
                if (bodyPart[1][0] != 0.0F) {
                    GL11.glRotatef(bodyPart[1][0] * (180.0F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                }

                if (bodyPart[1][1] != 0.0F) {
                    GL11.glRotatef(bodyPart[1][1] * (180.0F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
                }

                if (bodyPart[1][2] != 0.0F) {
                    GL11.glRotatef(-bodyPart[1][2] * (180.0F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
                }

                GL11.glBegin(3);
                GL11.glVertex3d(0.0, 0.0, 0.0);
                GL11.glVertex3d(0.0, -0.5, 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glTranslated(0.375, (double) var15 + 0.55, 0.0);
                if (bodyPart[2][0] != 0.0F) {
                    GL11.glRotatef(bodyPart[2][0] * (180.0F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                }

                if (bodyPart[2][1] != 0.0F) {
                    GL11.glRotatef(bodyPart[2][1] * (180.0F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
                }

                if (bodyPart[2][2] != 0.0F) {
                    GL11.glRotatef(-bodyPart[2][2] * (180.0F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
                }

                GL11.glBegin(3);
                GL11.glVertex3d(0.0, 0.0, 0.0);
                GL11.glVertex3d(0.0, -0.5, 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glRotatef(var14 - entity.rotationYawHead, 0.0F, 1.0F, 0.0F);
                GL11.glPushMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslated(0.0, (double) var15 + 0.55, 0.0);
                if (bodyPart[0][0] != 0.0F) {
                    GL11.glRotatef(bodyPart[0][0] * (180.0F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                }

                GL11.glBegin(3);
                GL11.glVertex3d(0.0, 0.0, 0.0);
                GL11.glVertex3d(0.0, 0.3, 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glPopMatrix();
                GL11.glRotatef(!entity.isSneaking() ? 0.0F : 25.0F, 1.0F, 0.0F, 0.0F);
                GL11.glTranslated(0.0, !entity.isSneaking() ? 0.0 : -0.16175, !entity.isSneaking() ? 0.0 : -0.48025);
                GL11.glPushMatrix();
                GL11.glTranslated(0.0, (double) var15, 0.0);
                GL11.glBegin(3);
                GL11.glVertex3d(-0.125, 0.0, 0.0);
                GL11.glVertex3d(0.125, 0.0, 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslated(0.0, (double) var15, 0.0);
                GL11.glBegin(3);
                GL11.glVertex3d(0.0, 0.0, 0.0);
                GL11.glVertex3d(0.0, 0.55, 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glTranslated(0.0, (double) var15 + 0.55, 0.0);
                GL11.glBegin(3);
                GL11.glVertex3d(-0.375, 0.0, 0.0);
                GL11.glVertex3d(0.375, 0.0, 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glPopMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    private Vector3d method16090(EventRender3D var1, PlayerEntity var2) {
        float var5 = mc.getRenderPartialTicks();
        double var6 = var2.lastTickPosX + (var2.getPosX() - var2.lastTickPosX) * (double) var5;
        double var8 = var2.lastTickPosY + (var2.getPosY() - var2.lastTickPosY) * (double) var5;
        double var10 = var2.lastTickPosZ + (var2.getPosZ() - var2.lastTickPosZ) * (double) var5;
        return new Vector3d(var6, var8, var10);
    }

    public static void method16091(PlayerEntity var0, PlayerModel<PlayerEntity> var1) {
        bodyParts.put(
                var0,
                new float[][]{
                        {var1.bipedHead.rotateAngleX, var1.bipedHead.rotateAngleY, var1.bipedHead.rotateAngleZ},
                        {var1.bipedRightArm.rotateAngleX, var1.bipedRightArm.rotateAngleY,
                                var1.bipedRightArm.rotateAngleZ},
                        {var1.bipedLeftArm.rotateAngleX, var1.bipedLeftArm.rotateAngleY,
                                var1.bipedLeftArm.rotateAngleZ},
                        {var1.bipedRightLeg.rotateAngleX, var1.bipedRightLeg.rotateAngleY,
                                var1.bipedRightLeg.rotateAngleZ},
                        {var1.bipedLeftLeg.rotateAngleX, var1.bipedLeftLeg.rotateAngleY,
                                var1.bipedLeftLeg.rotateAngleZ}
                });
    }

    private boolean method16092(PlayerEntity var1) {
        return !mc.world.getPlayers().contains(var1);
    }

    private void method16093(boolean var1) {
        if (!var1) {
            GL11.glDisable(3042);
            GL11.glDisable(2848);
            GL11.glEnable(2929);
            GL11.glEnable(3553);
            GL11.glPopMatrix();
        } else {
            GL11.glPopMatrix();
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            GL11.glBlendFunc(770, 771);
            GL11.glHint(3154, 4354);
        }

        GL11.glDepthMask(var1);
    }

    private int method16094(LivingEntity var1) {
        float var4 = var1.getHealth();
        float var5 = var1.getMaxHealth();
        float var6 = Math.max(0.0F, Math.min(var4, var5) / var5);
        return Color.HSBtoRGB(var6 / 3.0F, 1.0F, 1.0F) | 0xFF000000;
    }
}
