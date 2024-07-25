package remapped;

import net.minecraft.network.ThreadQuickExitException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5965 {
   private static final Logger field_30384 = LogManager.getLogger();
   public static class_5621<World> field_30386 = null;

   public static <T extends class_1977> void method_27245(class_6310<T> var0, T var1, class_6331 var2) throws ThreadQuickExitException {
      method_27246(var0, var1, var2.method_29522());
   }

   public static <T extends class_1977> void method_27246(class_6310<T> var0, T var1, class_7582<?> var2) throws ThreadQuickExitException {
      if (var2.method_34466()) {
         method_27243(var0);
      } else {
         var2.execute(() -> {
            method_27243(var0);
            if (!var1.method_9091().method_23493()) {
               field_30384.debug("Ignoring packet due to disconnection: " + var0);
            } else {
               var0.method_28777(var1);
            }
         });
         throw class_2506.field_12445;
      }
   }

   public static void method_27243(class_6310 var0) {
      if (var0 instanceof class_509) {
         MinecraftClient.getInstance().worldRenderer.method_20000();
      }

      if (!(var0 instanceof class_7786)) {
         if (!(var0 instanceof class_1992)) {
            field_30386 = null;
         } else {
            class_1992 var3 = (class_1992)var0;
            field_30386 = var3.method_9234();
         }
      } else {
         class_7786 var4 = (class_7786)var0;
         field_30386 = var4.method_35339();
      }
   }
}
