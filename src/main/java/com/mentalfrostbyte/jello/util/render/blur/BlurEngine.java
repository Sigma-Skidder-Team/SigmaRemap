package com.mentalfrostbyte.jello.util.render.blur;

import com.google.gson.JsonSyntaxException;
import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.EventRender3D;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.DestFactor;
import mapped.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.network.play.server.SCloseWindowPacket;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.io.IOException;

public class BlurEngine {
    private static final Minecraft mc = Minecraft.getInstance();
    private static ShaderGroup blurShader;
    public static Framebuffer frameBuff;
    public static Framebuffer frameBuff2;
    public static int frameBuffWidth = mc.framebuffer.framebufferWidth;
    public static int frameBuffHeight = mc.framebuffer.framebufferHeight;
    public static int screenWidth = 0;
    public static int screenHeight = 0;

    public void init() {
        Client.getInstance().eventManager.register(this);
    }

    public static void drawBlur(int var0, int var1, int var2, int var3) {
        frameBuffWidth = Math.min(var0, frameBuffWidth);
        frameBuffHeight = Math.min(var1, frameBuffHeight);
        screenWidth = Math.max(var0 + var2, screenWidth);
        screenHeight = Math.max(var1 + var3, screenHeight);
    }

    @EventTarget
    public void onPacket(ReceivePacketEvent event) {
        if (event.getPacket() instanceof SCloseWindowPacket) {
            MultiUtilities.resetShaders();
        }
    }

    @EventTarget
    @LowestPriority
    public void on3DRender(EventRender3D event) {
        if (Client.getInstance().guiManager.getHqIngameBlur() && frameBuffWidth < screenWidth && frameBuffHeight < screenHeight) {
            if (frameBuff == null) {
                try {
                    blurShader = new ShaderGroup(mc.getTextureManager(), new SigmaBlurShader(), mc.getFramebuffer(), new ResourceLocation("jelloblur"));
                    blurShader.createBindFramebuffers(mc.framebuffer.framebufferWidth, mc.framebuffer.framebufferHeight);
                    blurShader.listShaders.get(0).getShaderManager().getShaderUniform("Radius").set(35.0F);
                    blurShader.listShaders.get(1).getShaderManager().getShaderUniform("Radius").set(35.0F);
                    frameBuff = blurShader.getFramebuffer("jello");
                    frameBuff2 = blurShader.getFramebuffer("jelloswap");
                } catch (IOException | JsonSyntaxException var5) {
                    var5.printStackTrace();
                }
            }

            if (frameBuff.framebufferHeight != mc.framebuffer.framebufferHeight || frameBuff.framebufferWidth != mc.framebuffer.framebufferWidth) {
                blurShader.createBindFramebuffers(mc.framebuffer.framebufferWidth, mc.framebuffer.framebufferHeight);
            }

            RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, DestFactor.ZERO);
            RenderSystem.enableBlend();
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            RenderSystem.disableBlend();
            frameBuff.framebufferClear(true);
            frameBuff2.framebufferClear(true);
            RenderSystem.clear(256, Minecraft.IS_RUNNING_ON_MAC);
            RenderSystem.matrixMode(5889);
            RenderSystem.loadIdentity();
            RenderSystem.ortho(
                    0.0,
                    (double) mc.mainWindow.getFramebufferWidth() / mc.mainWindow.getGuiScaleFactor(),
                    (double) mc.mainWindow.getFramebufferHeight() / mc.mainWindow.getGuiScaleFactor(),
                    0.0,
                    1000.0,
                    3000.0
            );
            RenderSystem.matrixMode(5888);
            RenderSystem.loadIdentity();
            RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
            GL11.glScaled(
                    1.0 / mc.mainWindow.getGuiScaleFactor() * (double) GuiManager.scaleFactor, 1.0 / mc.mainWindow.getGuiScaleFactor() * (double) GuiManager.scaleFactor, 1.0
            );
            int var4 = 35;
            RenderUtil.drawBlurredBackground(frameBuffWidth, frameBuffHeight - var4, screenWidth, screenHeight + var4);
            blurShader.render(mc.timer.renderPartialTicks);
            RenderUtil.endScissor();
            GL11.glEnable(3008);
            frameBuff.bindFramebuffer(true);
            mc.framebuffer.bindFramebuffer(true);
        }

        frameBuffWidth = mc.framebuffer.framebufferWidth;
        frameBuffHeight = mc.framebuffer.framebufferHeight;
        screenWidth = 0;
        screenHeight = 0;
    }

    public static void endBlur() {
        if (frameBuff != null) {
            GL11.glPushMatrix();
            frameBuff.bindFramebufferTexture();
            frameBuff.framebufferRender(mc.framebuffer.framebufferWidth, mc.framebuffer.framebufferHeight);
            GL11.glPopMatrix();
            RenderSystem.clear(256, Minecraft.IS_RUNNING_ON_MAC);
            RenderSystem.matrixMode(5889);
            RenderSystem.loadIdentity();
            RenderSystem.ortho(
                    0.0,
                    (double) mc.mainWindow.getFramebufferWidth() / mc.mainWindow.getGuiScaleFactor(),
                    (double) mc.mainWindow.getFramebufferHeight() / mc.mainWindow.getGuiScaleFactor(),
                    0.0,
                    1000.0,
                    3000.0
            );
            RenderSystem.matrixMode(5888);
            RenderSystem.loadIdentity();
            RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
            GL11.glScaled(
                    1.0 / mc.mainWindow.getGuiScaleFactor() * (double) GuiManager.scaleFactor, 1.0 / mc.mainWindow.getGuiScaleFactor() * (double) GuiManager.scaleFactor, 1.0
            );
            mc.framebuffer.bindFramebuffer(true);
        }
    }

    // $VF: synthetic method
    public static Minecraft getMC() {
        return mc;
    }
}
