package com.mentalfrostbyte.jello.util.render.blur;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.network.play.server.SCloseWindowPacket;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

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
      Client.getInstance().getEventManager().register(this);
   }

   public static void drawBlur(int var0, int var1, int var2, int var3) {
      frameBuffWidth = Math.min(var0, frameBuffWidth);
      frameBuffHeight = Math.min(var1, frameBuffHeight);
      screenWidth = Math.max(var0 + var2, screenWidth);
      screenHeight = Math.max(var1 + var3, screenHeight);
   }

   @EventTarget
   public void method29972(ReceivePacketEvent var1) {
      if (var1.getPacket() instanceof SCloseWindowPacket) {
         MultiUtilities.method17742();
      }
   }

   @EventTarget
   @LowestPriority
   public void on3DRender(Render3DEvent event) {
      if (Client.getInstance().getGuiManager().method33472() && frameBuffWidth < screenWidth && frameBuffHeight < screenHeight) {
         if (frameBuff == null) {
            try {
               blurShader = new ShaderGroup(mc.getTextureManager(), new SigmaBlurShader(), mc.getFramebuffer(), new ResourceLocation("jelloblur"));
               blurShader.createBindFramebuffers(mc.framebuffer.framebufferWidth, mc.framebuffer.framebufferHeight);
               blurShader.elements.get(0).method7410().getFromName("Radius").setValue(35.0F);
               blurShader.elements.get(1).method7410().getFromName("Radius").setValue(35.0F);
               frameBuff = blurShader.method6528("jello");
               frameBuff2 = blurShader.method6528("jelloswap");
            } catch (IOException | JsonSyntaxException var5) {
               var5.printStackTrace();
            }
         }

         if (frameBuff.framebufferHeight != mc.framebuffer.framebufferHeight || frameBuff.framebufferWidth != mc.framebuffer.framebufferWidth) {
            blurShader.createBindFramebuffers(mc.framebuffer.framebufferWidth, mc.framebuffer.framebufferHeight);
         }

         RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, DestFactor.field12932, GlStateManager.SourceFactor.ONE, DestFactor.field12936);
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
            1.0 / mc.mainWindow.getGuiScaleFactor() * (double) GuiManager.portalScaleFactor, 1.0 / mc.mainWindow.getGuiScaleFactor() * (double) GuiManager.portalScaleFactor, 1.0
         );
         int var4 = 35;
         RenderUtil.drawPortalBackground(frameBuffWidth, frameBuffHeight - var4, screenWidth, screenHeight + var4);
         blurShader.method6526(mc.timer.renderPartialTicks);
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
            1.0 / mc.mainWindow.getGuiScaleFactor() * (double) GuiManager.portalScaleFactor, 1.0 / mc.mainWindow.getGuiScaleFactor() * (double) GuiManager.portalScaleFactor, 1.0
         );
         mc.framebuffer.bindFramebuffer(true);
      }
   }

   // $VF: synthetic method
   public static Minecraft method29975() {
      return mc;
   }
}
