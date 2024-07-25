package remapped;

import java.io.IOException;
import java.io.InputStream;

public class class_1012 extends class_1809 {
   private static String[] field_5188;

   public class_1012() {
      super(class_6340.method_29018());
   }

   public class_4150 method_4362(class_7832 var1) {
      MinecraftClient var4 = MinecraftClient.method_8510();
      class_599 var5 = var4.method_8606().method_25060();

      try (InputStream var6 = var5.䴂쬫ಽ䩉㐖쬫(class_3168.field_15844, class_6340.method_29018())) {
         return new class_4150((class_9051)null, class_5797.method_26230(var6));
      } catch (IOException var21) {
         return new class_4150(var21);
      }
   }
}
