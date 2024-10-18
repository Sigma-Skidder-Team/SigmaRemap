package com.mentalfrostbyte.jello.module.impl.render.classic.esp;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRenderEntity;
import com.mentalfrostbyte.jello.event.impl.EventRenderNameTag;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.ColorSetting;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import lol.ClientColors;
import lol.TextureImpl;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.opengl.GL11;

public class FillESP extends Module {
    public boolean field23481 = false;
    public Class7735 field23482 = Class7733.method25596(mc.getRenderTypeBuffers().field33890, new BufferBuilder(256));

    public FillESP() {
        super(ModuleCategory.RENDER, "Fill", "Fill ESP");
        this.registerSetting(new ColorSetting("Color", "The tracers color", ClientColors.LIGHT_GREYISH_BLUE.getColor));
    }

    @EventTarget
    private void method16133(Render3DEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null && mc.world != null) {
                this.method16139();
                this.method16134();
                this.method16140();
                this.field23482.finish();
            }
        }
    }

    private void method16134() {
        this.field23481 = true;
        int var3 = this.parseSettingValueToIntBySettingName("Color");
        float var4 = (float) (var3 >> 24 & 0xFF) / 255.0F;
        float var5 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var6 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var7 = (float) (var3 & 0xFF) / 255.0F;
        GL11.glEnable(2896);
        GL11.glLightModelfv(2899, new float[]{var5, var6, var7, var4});
        RenderSystem.enableLighting();
        GL11.glDepthFunc(519);
        GL11.glEnable(2929);
        GL11.glEnable(32823);
        GL11.glLineWidth(2.0F);
        GL11.glPolygonMode(1032, 6914);
        GL11.glDisable(3553);
        GL11.glEnable(3008);
        GL11.glEnable(2896);
        GL11.glPolygonOffset(-30000.0F, 1.0F);

        for (Entity var9 : mc.world.getAllEntities()) {
            if (this.method16138(var9)) {
                GL11.glPushMatrix();
                Vector3d var10 = mc.gameRenderer.getActiveRenderInfo().getPos();
                double var11 = var10.getX();
                double var13 = var10.getY();
                double var15 = var10.getZ();
                MatrixStack var17 = new MatrixStack();
                boolean var18 = mc.gameSettings.entityShadows;
                RenderSystem.disableLighting();
                RenderSystem.color4f(0.0F, 0.0F, 1.0F, 0.5F);
                RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, DestFactor.field12932, GlStateManager.SourceFactor.ONE, DestFactor.field12936);
                RenderSystem.enableBlend();
                mc.gameSettings.entityShadows = false;
                this.method16136(var9, var11, var13, var15, mc.timer.renderPartialTicks, var17, this.field23482);
                mc.gameSettings.entityShadows = var18;
                GL11.glPopMatrix();
            }
        }

        this.field23482.finish(RenderType.getEntitySolid(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
        this.field23482.finish(RenderType.getEntityCutout(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
        this.field23482.finish(RenderType.getEntityCutoutNoCull(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
        this.field23482.finish(RenderType.getEntitySmoothCutout(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
        this.field23482.finish(RenderType.getLines());
        this.field23482.finish();
        GL11.glDepthFunc(515);
        GL11.glPolygonMode(1032, 6914);
        GL11.glDisable(32823);
        this.field23481 = false;
    }

    @EventTarget
    public void method16135(EventRenderNameTag var1) {
        if (this.isEnabled() && this.field23481 && var1.method13987() instanceof PlayerEntity) {
            var1.setCancelled(true);
        }
    }

    public void method16136(Entity var1, double var2, double var4, double var6, float var8, MatrixStack var9, Class7733 var10) {
        double var13 = MathHelper.lerp(var8, var1.lastTickPosX, var1.getPosX());
        double var15 = MathHelper.lerp(var8, var1.lastTickPosY, var1.getPosY());
        double var17 = MathHelper.lerp(var8, var1.lastTickPosZ, var1.getPosZ());
        float var19 = MathHelper.lerp(var8, var1.prevRotationYaw, var1.rotationYaw);
        mc.worldRenderer.renderManager.renderEntityStatic(var1, var13 - var2, var15 - var4, var17 - var6, var19, var8, var9, var10, 255);
    }

    @EventTarget
    public void method16137(EventRenderEntity var1) {
        if (this.isEnabled()) {
            if (this.field23481) {
                var1.method13957(false);
            }
        }
    }

    private boolean method16138(Entity var1) {
        if (var1 instanceof LivingEntity) {
            if (var1 instanceof PlayerEntity) {
                return !(var1 instanceof ClientPlayerEntity) && !Client.getInstance().getCombatManager().isTargetABot(var1);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private void method16139() {
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

    private void method16140() {
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
        GL11.glLightModelfv(2899, new float[]{0.4F, 0.4F, 0.4F, 1.0F});
    }
}
