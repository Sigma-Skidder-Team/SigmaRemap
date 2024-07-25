package remapped;

import java.util.Arrays;
import java.util.List;

public class class_6151 {
   private static String[] field_31517;
   private static boolean field_31518;
   private static final class_5348[] field_31519 = new class_5348[RenderLayer.method_16729()];

   public static void method_28221(List<class_5348> var0) {
      if (!field_31518) {
         var0.forEach(class_5348::method_24420);
      } else {
         method_28219(var0);
      }
   }

   public static void method_28226(List<class_5348> var0) {
      if (!field_31518) {
         var0.forEach(class_5348::method_24422);
      } else {
         method_28224(var0);
      }
   }

   private static void method_28219(List<class_5348> var0) {
      for (int var3 = 0; var3 < var0.size(); var3++) {
         class_5348 var4 = (class_5348)var0.get(var3);
         method_28220(var4, var3);
      }
   }

   private static void method_28224(List<class_5348> var0) {
      for (int var3 = 0; var3 < var0.size(); var3++) {
         class_5348 var4 = (class_5348)var0.get(var3);
         method_28225(var4, var3);
      }
   }

   private static void method_28220(class_5348 var0, int var1) {
      class_5348 var4 = field_31519[var1];
      if (var4 != null) {
         if (var0 == var4) {
            field_31519[var1] = null;
            return;
         }

         var4.method_24422();
         field_31519[var1] = null;
      }

      var0.method_24420();
   }

   private static void method_28225(class_5348 var0, int var1) {
      class_5348 var4 = field_31519[var1];
      if (var4 != null) {
         var4.method_24422();
      }

      field_31519[var1] = var0;
   }

   public static void method_28223() {
      if (!field_31518) {
         field_31518 = true;
         Arrays.fill(field_31519, null);
      }
   }

   public static void method_28222() {
      if (field_31518) {
         field_31518 = false;

         for (int var2 = 0; var2 < field_31519.length; var2++) {
            class_5348 var3 = field_31519[var2];
            if (var3 != null) {
               var3.method_24422();
            }
         }

         Arrays.fill(field_31519, null);
      }
   }
}
