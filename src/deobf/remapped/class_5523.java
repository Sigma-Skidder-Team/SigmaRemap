package remapped;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5523 {
   private static final Logger field_28110 = LogManager.getLogger();
   private static final DateFormat field_28111 = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");

   public static void method_25041(File var0, int var1, int var2, class_4230 var3, Consumer<ITextComponent> var4) {
      method_25042(var0, (String)null, var1, var2, var3, var4);
   }

   public static void method_25042(File var0, String var1, int var2, int var3, class_4230 var4, Consumer<ITextComponent> var5) {
      if (class_3542.method_16366()) {
         method_25040(var0, var1, var2, var3, var4, var5);
      } else {
         class_3542.method_16474(() -> method_25040(var0, var1, var2, var3, var4, var5));
      }
   }

   private static void method_25040(File var0, String var1, int var2, int var3, class_4230 var4, Consumer<ITextComponent> var5) {
      class_1893 var8 = class_3111.method_14327();
      class_9352 var9 = var8.method_8552();
      class_8881 var10 = class_3111.method_14310();
      int var11 = var9.method_43178();
      int var12 = var9.method_43198();
      int var13 = var10.field_45484;
      int var14 = var9.method_43164(var8.field_9577.field_45484, var8.field_9577.field_45463);
      int var15 = class_3111.method_14389();
      boolean var16 = class_3776.method_17487() && var15 > 1;
      if (var16) {
         var10.field_45484 = var14 * var15;
         var9.method_43161(var11 * var15, var12 * var15);
         class_1920.method_8757();
         class_1920.method_8793(16640);
         var8.method_8584().method_19717(true);
         class_1920.method_8843();
         var8.field_9590.method_35945(var8.method_8554(), System.nanoTime(), true);
      }

      class_5797 var17 = method_25038(var2, var3, var4);
      if (var16) {
         var8.method_8584().method_19723();
         class_1920.method_8761();
         class_3111.method_14310().field_45484 = var13;
         var9.method_43161(var11, var12);
      }

      File var18 = new File(var0, "screenshots");
      var18.mkdir();
      File var19;
      if (var1 != null) {
         var19 = new File(var18, var1);
      } else {
         var19 = method_25037(var18);
      }

      Object var20 = null;
      if (class_7860.field_40240.method_3596()) {
         var20 = class_7860.method_35556(class_7860.field_40240, var17, var19);
         if (class_7860.method_35565(var20, class_7860.field_40233)) {
            ITextComponent var23 = (ITextComponent)class_7860.method_35555(var20, class_7860.field_40047);
            var5.accept(var23);
            return;
         }

         var19 = (File)class_7860.method_35555(var20, class_7860.field_40176);
      }

      File var21 = var19;
      Object var22 = var20;
      class_9665.method_44683()
         .execute(
            () -> {
               try {
                  var17.method_26237(var21);
                  IFormattableTextComponent var6 = new StringTextComponent(var21.getName())
                     .mergeStyle(TextFormatting.UNDERLINE)
                     .modifyStyle(var1xx -> var1xx.setClickEvent(new ClickEvent(ClickEvent$class_47.OPEN_FILE, var21.getAbsolutePath())));
                  if (var22 != null && class_7860.method_35555(var22, class_7860.field_39984) != null) {
                     var5.accept((ITextComponent)class_7860.method_35555(var22, class_7860.field_39984));
                  } else {
                     var5.accept(new TranslationTextComponent("screenshot.success", var6));
                  }
               } catch (Exception var10x) {
                  field_28110.warn("Couldn't save screenshot", var10x);
                  var5.accept(new TranslationTextComponent("screenshot.failure", var10x.getMessage()));
               } finally {
                  var17.close();
               }
            }
         );
   }

   public static class_5797 method_25038(int var0, int var1, class_4230 var2) {
      var0 = var2.field_20533;
      var1 = var2.field_20535;
      class_5797 var5 = new class_5797(var0, var1, false);
      class_3542.method_16446(var2.method_19724());
      var5.method_26229(0, true);
      var5.method_26256();
      return var5;
   }

   private static File method_25037(File var0) {
      String var3 = field_28111.format(new Date());
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
