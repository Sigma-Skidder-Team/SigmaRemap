package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class class_9713 {
   private static int[] field_49375 = null;
   private static boolean field_49374;

   public static int method_44861(int var0) {
      if (field_49375 == null) {
         return -1;
      } else {
         return var0 >= 0 && var0 < field_49375.length ? field_49375[var0] : -1;
      }
   }

   public static void method_44867() {
      if (field_49374) {
         field_49374 = false;
         method_44866(class_6588.method_30120());
      }
   }

   public static void method_44866(class_8591 var0) {
      method_44863();
      if (var0 != null) {
         if (class_7860.field_39861.method_3596() && MinecraftClient.method_8510().method_8498() == null) {
            class_3111.method_14277("[Shaders] Delayed loading of entity mappings after resources are loaded");
            field_49374 = true;
         } else {
            ArrayList var3 = new ArrayList();
            String var4 = "/shaders/entity.properties";
            InputStream var5 = var0.method_39505(var4);
            if (var5 != null) {
               method_44862(var5, var4, var3);
            }

            method_44859(var3);
            if (var3.size() > 0) {
               field_49375 = method_44864(var3);
            }
         }
      }
   }

   private static void method_44859(List<Integer> var0) {
      String[] var3 = class_8835.method_40646();

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];

         try {
            class_4639 var6 = new class_4639(var5, "shaders/entity.properties");
            InputStream var7 = class_3111.method_14374(var6);
            method_44862(var7, var6.toString(), var0);
         } catch (IOException var8) {
         }
      }
   }

   private static void method_44862(InputStream var0, String var1, List<Integer> var2) {
      if (var0 != null) {
         try {
            var0 = class_9441.method_43672(var0, var1);
            class_8407 var5 = new class_8407();
            var5.load(var0);
            var0.close();
            class_3111.method_14277("[Shaders] Parsing entity mappings: " + var1);
            class_6284 var6 = new class_6284("Shaders");

            for (String var8 : var5.keySet()) {
               String var9 = var5.getProperty(var8);
               String var10 = "entity.";
               if (!var8.startsWith(var10)) {
                  class_3111.method_14317("[Shaders] Invalid entity ID: " + var8);
               } else {
                  String var11 = class_8251.method_37832(var8, var10);
                  int var12 = class_3111.method_14361(var11, -1);
                  if (var12 < 0) {
                     class_3111.method_14317("[Shaders] Invalid entity alias ID: " + var12);
                  } else {
                     int[] var13 = var6.method_28669(var9);
                     if (var13 != null && var13.length >= 1) {
                        for (int var14 = 0; var14 < var13.length; var14++) {
                           int var15 = var13[var14];
                           method_44860(var2, var15, var12);
                        }
                     } else {
                        class_3111.method_14317("[Shaders] Invalid entity ID mapping: " + var8 + "=" + var9);
                     }
                  }
               }
            }
         } catch (IOException var16) {
            class_3111.method_14317("[Shaders] Error reading: " + var1);
         }
      }
   }

   private static void method_44860(List<Integer> var0, int var1, int var2) {
      while (var0.size() <= var1) {
         var0.add(-1);
      }

      var0.set(var1, var2);
   }

   private static int[] method_44864(List<Integer> var0) {
      int[] var3 = new int[var0.size()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = (Integer)var0.get(var4);
      }

      return var3;
   }

   public static void method_44863() {
      field_49375 = null;
   }
}
