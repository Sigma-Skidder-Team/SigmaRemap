package com.mentalfrostbyte.jello.unmapped;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.util.ColorUtils;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.server.SCloseWindowPacket;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class BlurEngine {
   private static Minecraft mc = Minecraft.getInstance();
   private static Class1647 field36351;
   public static Framebuffer field36352;
   public static Framebuffer field36353;
   public static int field36354 = mc.framebuffer.field35732;
   public static int field36355 = mc.framebuffer.field35733;
   public static int field36356 = 0;
   public static int field36357 = 0;
   public static int field36358 = 0;

   public void method29970() {
      Client.getInstance().getEventManager().register(this);
   }

   public static void method29971(int var0, int var1, int var2, int var3) {
      field36354 = Math.min(var0, field36354);
      field36355 = Math.min(var1, field36355);
      field36356 = Math.max(var0 + var2, field36356);
      field36357 = Math.max(var1 + var3, field36357);
   }

   @EventTarget
   public void method29972(ReceivePacketEvent var1) {
      if (var1.getPacket() instanceof SCloseWindowPacket) {
         ColorUtils.method17742();
      }
   }

   @EventTarget
   @LowestPriority
   public void method29973(Render3DEvent var1) {
      if (Client.getInstance().getGuiManager().method33472() && field36354 < field36356 && field36355 < field36357) {
         if (field36352 == null) {
            try {
               field36351 = new Class1647(mc.getTextureManager(), new Class1818(), mc.getFramebuffer(), new ResourceLocation("jelloblur"));
               field36351.method6525(mc.framebuffer.field35732, mc.framebuffer.field35733);
               field36351.field8939.get(0).method7410().method7937("Radius").method7437(35.0F);
               field36351.field8939.get(1).method7410().method7937("Radius").method7437(35.0F);
               field36352 = field36351.method6528("jello");
               field36353 = field36351.method6528("jelloswap");
            } catch (IOException | JsonSyntaxException var5) {
               var5.printStackTrace();
            }
         }

         if (field36352.field35733 != mc.framebuffer.field35733 || field36352.field35732 != mc.framebuffer.field35732) {
            field36351.method6525(mc.framebuffer.field35732, mc.framebuffer.field35733);
         }

         RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.field15997, DestFactor.field12932, GlStateManager.SourceFactor.field15990, DestFactor.field12936);
         RenderSystem.enableBlend();
         GL11.glDisable(2929);
         GL11.glDisable(3008);
         RenderSystem.disableBlend();
         field36352.method29119(true);
         field36353.method29119(true);
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
         RenderUtil.drawPortalBackground(field36354, field36355 - var4, field36356, field36357 + var4);
         field36351.method6526(mc.timer.renderPartialTicks);
         RenderUtil.endScissor();
         GL11.glEnable(3008);
         field36352.bindFramebuffer(true);
         mc.framebuffer.bindFramebuffer(true);
      }

      field36354 = mc.framebuffer.field35732;
      field36355 = mc.framebuffer.field35733;
      field36356 = 0;
      field36357 = 0;
   }

   public static void method29974() {
      if (field36352 != null) {
         GL11.glPushMatrix();
         field36352.method29110();
         field36352.framebufferRender(mc.framebuffer.field35732, mc.framebuffer.field35733);
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