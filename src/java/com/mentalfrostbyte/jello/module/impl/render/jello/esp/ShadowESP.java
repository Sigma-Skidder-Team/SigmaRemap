package com.mentalfrostbyte.jello.module.impl.render.jello.esp;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRenderEntity;
import com.mentalfrostbyte.jello.event.impl.EventRenderNameTag;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.ColorSetting;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.PositionUtils;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mentalfrostbyte.jello.util.ClientColors;
import lol.TextureImpl;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.opengl.GL11;

public class ShadowESP extends Module {
    public static Class2191 field23794 = Class2191.field14327;
    public Class7735 field23795 = Class7733.method25596(mc.getRenderTypeBuffers().field33890, new BufferBuilder(256));

    public ShadowESP() {
        super(ModuleCategory.RENDER, "Shadow", "Draws a line arround entities");
        this.registerSetting(new ColorSetting("Color", "The tracers color", ClientColors.LIGHT_GREYISH_BLUE.getColor));
    }

    @EventTarget
    private void method16605(Render3DEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null && mc.world != null) {
                this.method16612();
                RenderUtil.method11476();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.method16607(Class2191.field14328);
                RenderUtil.method11477(Class2329.field15941);
                GL11.glLineWidth(1.0F);
                this.method16606();
                this.method16607(Class2191.field14329);
                RenderSystem.alphaFunc(518, 0.0F);
                RenderSystem.enableAlphaTest();
                GL11.glColor4f(1.0F, 0.0F, 1.0F, 0.1F);
                GL11.glEnable(3042);
                GL11.glDisable(2896);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                RenderUtil.method11478();
                this.method16613();
                this.field23795.finish();
            }
        }
    }

    private void method16606() {
        int var3 = MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.8F);
        mc.world.entitiesById
                .forEach(
                        (var2, var3x) -> {
                            if (this.method16611(var3x)) {
                                double var6 = PositionUtils.getRelativePosition(var3x).x;
                                double var8 = PositionUtils.getRelativePosition(var3x).y;
                                double var10 = PositionUtils.getRelativePosition(var3x).z;
                                GL11.glPushMatrix();
                                GL11.glAlphaFunc(519, 0.0F);
                                GL11.glTranslated(var6, var8, var10);
                                GL11.glTranslatef(0.0F, var3x.getHeight(), 0.0F);
                                GL11.glTranslatef(0.0F, 0.1F, 0.0F);
                                GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().getYaw(), 0.0F, -1.0F, 0.0F);
                                GL11.glScalef(-0.11F, -0.11F, -0.11F);
                                RenderUtil.method11450(
                                        -var3x.getWidth() * 22.0F,
                                        -var3x.getHeight() * 5.5F,
                                        var3x.getWidth() * 44.0F,
                                        var3x.getHeight() * 21.0F,
                                        ResourceList.shadowPNG,
                                        var3,
                                        false);
                                ResourceList.shoutIconPNG.bind();
                                GL11.glPopMatrix();
                            }
                        });
    }

    private void method16607(Class2191 var1) {
        GL11.glDepthFunc(519);
        field23794 = var1;
        int var4 = this.parseSettingValueToIntBySettingName("Color");
        float var5 = (float) (var4 >> 24 & 0xFF) / 255.0F;
        float var6 = (float) (var4 >> 16 & 0xFF) / 255.0F;
        float var7 = (float) (var4 >> 8 & 0xFF) / 255.0F;
        float var8 = (float) (var4 & 0xFF) / 255.0F;
        GL11.glEnable(2896);
        GL11.glLightModelfv(2899, new float[] { var6, var7, var8, var5 });
        RenderSystem.enableLighting();
        if (field23794 == Class2191.field14329) {
            GL11.glEnable(10754);
            GL11.glLineWidth(2.0F);
            GL11.glPolygonMode(1032, 6913);
            GL11.glDisable(3553);
            GL11.glEnable(3008);
            GL11.glEnable(2896);
        }

        for (Entity var10 : mc.world.getAllEntities()) {
            if (this.method16611(var10)) {
                GL11.glPushMatrix();
                Vector3d var11 = mc.gameRenderer.getActiveRenderInfo().getPos();
                double var12 = var11.getX();
                double var14 = var11.getY();
                double var16 = var11.getZ();
                MatrixStack var18 = new MatrixStack();
                boolean var19 = mc.gameSettings.entityShadows;
                RenderSystem.disableLighting();
                RenderSystem.color4f(0.0F, 0.0F, 1.0F, 0.5F);
                RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, DestFactor.field12932,
                        GlStateManager.SourceFactor.ONE, DestFactor.field12936);
                RenderSystem.enableBlend();
                mc.gameSettings.entityShadows = false;
                int var20 = var10.getFireTimer();
                boolean var21 = var10.getFlag(0);
                var10.setFire(0);
                var10.setFlag(0, false);
                this.method16608(var10, var12, var14, var16, mc.timer.renderPartialTicks, var18, this.field23795);
                var10.setFire(var20);
                var10.setFlag(0, var21);
                mc.gameSettings.entityShadows = var19;
                GL11.glPopMatrix();
            }
        }

        this.field23795.finish(RenderType.getEntitySolid(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
        this.field23795.finish(RenderType.getEntityCutout(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
        this.field23795.finish(RenderType.getEntityCutoutNoCull(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
        this.field23795.finish(RenderType.getEntitySmoothCutout(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
        this.field23795.finish(RenderType.getLines());
        this.field23795.finish();
        if (field23794 == Class2191.field14329) {
            GL11.glPolygonMode(1032, 6914);
            GL11.glDisable(10754);
        }

        field23794 = Class2191.field14327;
        GL11.glDepthFunc(515);
    }

    public void method16608(Entity var1, double var2, double var4, double var6, float var8, MatrixStack var9,
            Class7733 var10) {
        double var13 = MathHelper.lerp(var8, var1.lastTickPosX, var1.getPosX());
        double var15 = MathHelper.lerp(var8, var1.lastTickPosY, var1.getPosY());
        double var17 = MathHelper.lerp(var8, var1.lastTickPosZ, var1.getPosZ());
        float var19 = MathHelper.lerp(var8, var1.prevRotationYaw, var1.rotationYaw);
        mc.worldRenderer.renderManager.renderEntityStatic(var1, var13 - var2, var15 - var4, var17 - var6, var19, var8,
                var9, var10, 238);
    }

    @EventTarget
    public void method16609(EventRenderEntity var1) {
        if (this.isEnabled()) {
            if (field23794 != Class2191.field14327) {
                var1.method13957(false);
            }
        }
    }

    @EventTarget
    public void method16610(EventRenderNameTag var1) {
        if (this.isEnabled() && field23794 != Class2191.field14327 && var1.getEntity() instanceof PlayerEntity) {
            var1.setCancelled(true);
        }
    }

    private boolean method16611(Entity var1) {
        if (var1 instanceof LivingEntity) {
            if (var1 instanceof PlayerEntity) {
                if (!(var1 instanceof ClientPlayerEntity)) {
                    return !var1.isInvisible() && !Client.getInstance().combatManager.isTargetABot(var1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private void method16612() {
        GL11.glLineWidth(3.0F);
        GL11.glPointSize(3.0F);
        GL11.glEnable(2832);
        GL11.glEnable(2848);
        GL11.glEnable(3042);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
        GL11.glDisable(3553);
        GL11.glDisable(2903);
        GL11.glDisable(2929);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.gameRenderer.lightmapTexture.method7316();
    }

    private void method16613() {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        RenderSystem.glMultiTexCoord2f(33986, 240.0F, 240.0F);
        TextureImpl.method36180();
        TextureManager var10000 = mc.getTextureManager();
        mc.getTextureManager();
        var10000.bindTexture(TextureManager.field1094);
        mc.gameRenderer.lightmapTexture.method7317();
        GL11.glLightModelfv(2899, new float[] { 0.4F, 0.4F, 0.4F, 1.0F });
        field23794 = Class2191.field14327;
    }
}
