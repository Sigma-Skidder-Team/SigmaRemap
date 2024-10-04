package com.mentalfrostbyte.jello.module.impl.render.classic.esp;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.ColorSetting;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mojang.blaze3d.systems.RenderSystem;
import lol.ClientColors;
import mapped.*;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class BoxOutlineESP extends Module {
    public int field23719 = MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.8F);

    public BoxOutlineESP() {
        super(ModuleCategory.RENDER, "Box Outline", "Draws a line arround players");
        this.registerSetting(new ColorSetting("Color", "The tracers color", ClientColors.LIGHT_GREYISH_BLUE.getColor));
    }

    @EventTarget
    private void method16506(Render3DEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null && mc.world != null) {
                this.method16509();
                RenderUtil.method11476();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.method16508(false);
                RenderUtil.method11477(Class2329.field15941);
                GL11.glLineWidth(3.0F);
                RenderSystem.alphaFunc(518, 0.0F);
                RenderSystem.enableAlphaTest();
                this.method16507();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.1F);
                GL11.glEnable(3042);
                GL11.glDisable(2896);
                this.method16508(true);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                RenderUtil.method11478();
                this.method16510();
            }
        }
    }

    private void method16507() {
        if (Client.getInstance().getClientMode() == ClientMode.JELLO) {
            mc.world
                    .entitiesById
                    .forEach(
                            (var1, var2) -> {
                                boolean var5 = MultiUtilities.method17744(var2) == Class2258.field14690 && this.access().getBooleanValueFromSettingName("Show Players");
                                boolean var6 = !var2.isInvisible() || this.access().getBooleanValueFromSettingName("Show Invisibles");
                                if (!Client.getInstance().getCombatManager().isValidTarget(var2) && var5 && var6 && var2 != mc.player) {
                                    double var7 = Class9647.method37623(var2).field43722;
                                    double var9 = Class9647.method37623(var2).field43723;
                                    double var11 = Class9647.method37623(var2).field43724;
                                    GL11.glPushMatrix();
                                    GL11.glAlphaFunc(519, 0.0F);
                                    GL11.glTranslated(var7, var9, var11);
                                    GL11.glTranslatef(0.0F, var2.getHeight(), 0.0F);
                                    GL11.glTranslatef(0.0F, 0.1F, 0.0F);
                                    GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().getYaw(), 0.0F, -1.0F, 0.0F);
                                    GL11.glScalef(-0.11F, -0.11F, -0.11F);
                                    RenderUtil.method11450(
                                            -var2.getWidth() * 22.0F,
                                            -var2.getHeight() * 5.5F,
                                            var2.getWidth() * 44.0F,
                                            var2.getHeight() * 21.0F,
                                            ResourcesDecrypter.shadowPNG,
                                            this.field23719,
                                            false
                                    );
                                    ResourcesDecrypter.shoutIconPNG.bind();
                                    GL11.glPopMatrix();
                                }
                            }
                    );
        }
    }

    private void method16508(boolean var1) {
        for (Entity var5 : mc.world.getEntities()) {
            if (!Client.getInstance().getCombatManager().isValidTarget(var5)) {
                boolean var6 = MultiUtilities.method17744(var5) == Class2258.field14690 && this.access().getBooleanValueFromSettingName("Show Players");
                boolean var7 = MultiUtilities.method17744(var5) == Class2258.field14689 && this.access().getBooleanValueFromSettingName("Show Mobs");
                boolean var8 = MultiUtilities.method17744(var5) == Class2258.field14691 && this.access().getBooleanValueFromSettingName("Show Passives");
                boolean var9 = !var5.isInvisible() || this.access().getBooleanValueFromSettingName("Show Invisibles");
                if ((var7 || var6 || var8) && var9 && var5 != mc.player) {
                    GL11.glPushMatrix();
                    GL11.glTranslated(
                            -mc.gameRenderer.getActiveRenderInfo().getPos().getX(),
                            -mc.gameRenderer.getActiveRenderInfo().getPos().getY(),
                            -mc.gameRenderer.getActiveRenderInfo().getPos().getZ()
                    );
                    GL11.glDisable(2929);
                    GL11.glEnable(3042);
                    int var10 = this.parseSettingValueToIntBySettingName("Color");
                    double var11 = (var5.getPosX() - var5.lastTickPosX) * (double) mc.timer.renderPartialTicks - (var5.getPosX() - var5.lastTickPosX);
                    double var13 = (var5.getPosY() - var5.lastTickPosY) * (double) mc.timer.renderPartialTicks - (var5.getPosY() - var5.lastTickPosY);
                    double var15 = (var5.getPosZ() - var5.lastTickPosZ) * (double) mc.timer.renderPartialTicks - (var5.getPosZ() - var5.lastTickPosZ);
                    Box3D var17 = new Box3D(var5.getBoundingBox().offset(var11, var13, var15)).expand(0.1F);
                    if (var1) {
                        RenderUtil.renderWireframeBox(var17, 3.0F, MultiUtilities.applyAlpha(var10, Client.getInstance().getClientMode() != ClientMode.JELLO ? 0.8F : 0.35F));
                    } else {
                        RenderUtil.render3DColoredBox(var17, ClientColors.LIGHT_GREYISH_BLUE.getColor);
                    }

                    GL11.glDisable(3042);
                    GL11.glPopMatrix();
                }
            }
        }
    }

    private void method16509() {
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

    private void method16510() {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        RenderSystem.method27905(33986, 240.0F, 240.0F);
        TextureImpl.method36180();
        TextureManager var10000 = mc.getTextureManager();
        mc.getTextureManager();
        var10000.bindTexture(TextureManager.field1094);
        mc.gameRenderer.lightmapTexture.method7317();
    }
}
