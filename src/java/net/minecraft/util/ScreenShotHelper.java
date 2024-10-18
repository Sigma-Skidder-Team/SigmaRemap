package net.minecraft.util;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.client.shader.Framebuffer;
import mapped.MainWindow;
import mapped.Reflector;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import net.optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScreenShotHelper {
   private static final Logger field39161 = LogManager.getLogger();
   private static final DateFormat field39162 = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");

   public static void saveScreenshot(File var0, int var1, int var2, Framebuffer var3, Consumer<ITextComponent> var4) {
      saveScreenshot(var0, (String)null, var1, var2, var3, var4);
   }

   public static void saveScreenshot(File var0, String var1, int var2, int var3, Framebuffer var4, Consumer<ITextComponent> var5) {
      if (RenderSystem.isOnRenderThread()) {
         method31253(var0, var1, var2, var3, var4, var5);
      } else {
         RenderSystem.recordRenderCall(() -> method31253(var0, var1, var2, var3, var4, var5));
      }
   }

   private static void method31253(File var0, String var1, int var2, int var3, Framebuffer var4, Consumer<ITextComponent> var5) {
      Minecraft var8 = Config.method26860();
      MainWindow var9 = var8.getMainWindow();
      GameSettings var10 = Config.method26928();
      int var11 = var9.getFramebufferWidth();
      int var12 = var9.getFramebufferHeight();
      int var13 = var10.guiScale;
      int var14 = var9.calcGuiScale(var8.gameSettings.guiScale, var8.gameSettings.forceUnicodeFont);
      int var15 = Config.method26975();
      boolean flag = GLX.isUsingFBOs() && var15 > 1;
      if (flag) {
         var10.guiScale = var14 * var15;
         var9.method8052(var11 * var15, var12 * var15);
         GlStateManager.pushMatrix();
         GlStateManager.method23883(16640);
         var8.getFramebuffer().bindFramebuffer(true);
         GlStateManager.enableTexture();
         var8.gameRenderer.updateCameraAndRender(var8.getRenderPartialTicks(), System.nanoTime(), true);
      }

      NativeImage var17 = createScreenshot(var2, var3, var4);
      if (flag) {
         var8.getFramebuffer().unbindFramebuffer();
         GlStateManager.popMatrix();
         Config.method26928().guiScale = var13;
         var9.method8052(var11, var12);
      }

      File var18 = new File(var0, "screenshots");
      var18.mkdir();
      File var19;
      if (var1 != null) {
         var19 = new File(var18, var1);
      } else {
         var19 = getTimestampedPNGFileForDirectory(var18);
      }

      Object var20 = null;
      if (Reflector.field42890.exists()) {
         var20 = Reflector.method35062(Reflector.field42890, var17, var19);
         if (Reflector.method35064(var20, Reflector.field42809)) {
            ITextComponent var23 = (ITextComponent) Reflector.call(var20, Reflector.field42997);
            var5.accept(var23);
            return;
         }

         var19 = (File) Reflector.call(var20, Reflector.field42998);
      }

      File var21 = var19;
      Object var22 = var20;
      Util.method38493()
         .execute(
            () -> {
               try {
                  var17.method7898(var21);
                  IFormattableTextComponent var6 = new StringTextComponent(var21.getName())
                     .mergeStyle(TextFormatting.UNDERLINE)
                     .modifyStyle(var1xx -> var1xx.setClickEvent(new ClickEvent(ClickEvent$Action.OPEN_FILE, var21.getAbsolutePath())));
                  if (var22 != null && Reflector.call(var22, Reflector.field42999) != null) {
                     var5.accept((ITextComponent) Reflector.call(var22, Reflector.field42999));
                  } else {
                     var5.accept(new TranslationTextComponent("screenshot.success", var6));
                  }
               } catch (Exception var10x) {
                  field39161.warn("Couldn't save screenshot", var10x);
                  var5.accept(new TranslationTextComponent("screenshot.failure", var10x.getMessage()));
               } finally {
                  var17.close();
               }
            }
         );
   }

   public static NativeImage createScreenshot(int width, int height, Framebuffer framebufferIn) {
      if (!GLX.isUsingFBOs())
      {
         NativeImage nativeimage1 = new NativeImage(width, height, false);
         nativeimage1.downloadFromFramebuffer(true);
         nativeimage1.flip();
         return nativeimage1;
      }
      else
      {
         width = framebufferIn.framebufferTextureWidth;
         height = framebufferIn.framebufferTextureHeight;
         NativeImage nativeimage = new NativeImage(width, height, false);
         RenderSystem.bindTexture(framebufferIn.getFramebufferTexture());
         nativeimage.downloadFromTexture(0, true);
         nativeimage.flip();
         return nativeimage;
      }
   }

   private static File getTimestampedPNGFileForDirectory(File var0) {
      String var3 = field39162.format(new Date());
      int var4 = 1;

      while (true) {
         File var5 = new File(var0, var3 + (var4 != 1 ? "_" + var4 : "") + ".png");
         if (!var5.exists()) {
            return var5;
         }

         var4++;
      }
   }
}
