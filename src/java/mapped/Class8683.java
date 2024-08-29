package mapped;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8683 {
   private static final Logger field39161 = LogManager.getLogger();
   private static final DateFormat field39162 = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");

   public static void method31251(File var0, int var1, int var2, Framebuffer var3, Consumer<ITextComponent> var4) {
      method31252(var0, (String)null, var1, var2, var3, var4);
   }

   public static void method31252(File var0, String var1, int var2, int var3, Framebuffer var4, Consumer<ITextComponent> var5) {
      if (RenderSystem.method27803()) {
         method31253(var0, var1, var2, var3, var4, var5);
      } else {
         RenderSystem.method27810(() -> method31253(var0, var1, var2, var3, var4, var5));
      }
   }

   private static void method31253(File var0, String var1, int var2, int var3, Framebuffer var4, Consumer<ITextComponent> var5) {
      Minecraft var8 = Class7944.method26860();
      MainWindow var9 = var8.getMainWindow();
      GameSettings var10 = Class7944.method26928();
      int var11 = var9.getFramebufferWidth();
      int var12 = var9.getFramebufferHeight();
      int var13 = var10.guiScale;
      int var14 = var9.calcGuiScale(var8.gameSettings.guiScale, var8.gameSettings.forceUnicodeFont);
      int var15 = Class7944.method26975();
      boolean var16 = Class8157.method28309() && var15 > 1;
      if (var16) {
         var10.guiScale = var14 * var15;
         var9.method8052(var11 * var15, var12 * var15);
         Class7414.method23832();
         Class7414.method23883(16640);
         var8.getFramebuffer().bindFramebuffer(true);
         Class7414.method23804();
         var8.gameRenderer.updateCameraAndRender(var8.getRenderPartialTicks(), System.nanoTime(), true);
      }

      Class1806 var17 = method31254(var2, var3, var4);
      if (var16) {
         var8.getFramebuffer().unbindFramebuffer();
         Class7414.method23833();
         Class7944.method26928().guiScale = var13;
         var9.method8052(var11, var12);
      }

      File var18 = new File(var0, "screenshots");
      var18.mkdir();
      File var19;
      if (var1 != null) {
         var19 = new File(var18, var1);
      } else {
         var19 = method31255(var18);
      }

      Object var20 = null;
      if (Class9299.field42890.method20214()) {
         var20 = Class9299.method35062(Class9299.field42890, var17, var19);
         if (Class9299.method35064(var20, Class9299.field42809)) {
            ITextComponent var23 = (ITextComponent)Class9299.method35070(var20, Class9299.field42997);
            var5.accept(var23);
            return;
         }

         var19 = (File)Class9299.method35070(var20, Class9299.field42998);
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
                  if (var22 != null && Class9299.method35070(var22, Class9299.field42999) != null) {
                     var5.accept((ITextComponent)Class9299.method35070(var22, Class9299.field42999));
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

   public static Class1806 method31254(int var0, int var1, Framebuffer var2) {
      var0 = var2.field35730;
      var1 = var2.field35731;
      Class1806 var5 = new Class1806(var0, var1, false);
      RenderSystem.method27865(var2.method29120());
      var5.method7897(0, true);
      var5.method7906();
      return var5;
   }

   private static File method31255(File var0) {
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
