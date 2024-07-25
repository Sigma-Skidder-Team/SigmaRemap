package remapped;

import java.io.IOException;
import java.io.InputStream;

public class class_7289 extends class_1809 {
   private static String[] field_37289;

   public class_7289() {
      super(class_2789.method_12673());
   }

   @Override
   public class_4150 method_8032(class_7832 var1) {
      MinecraftClient var4 = MinecraftClient.getInstance();
      class_599 var5 = var4.method_8606().method_25060();

      try (InputStream var6 = method_33283(var1, var5)) {
         return new class_4150(new class_9051(true, true), class_5797.method_26230(var6));
      } catch (IOException var20) {
         return new class_4150(var20);
      }
   }

   private static InputStream method_33283(class_7832 var0, class_599 var1) throws IOException {
      return !var0.method_35456(class_2789.method_12673())
         ? var1.䴂쬫ಽ䩉㐖쬫(class_3168.field_15844, class_2789.method_12673())
         : var0.method_35458(class_2789.method_12673()).method_18576();
   }
}
