package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class class_5644 {
   private static int[] field_28615 = null;
   private static boolean field_28614;

   public static int method_25548(int var0) {
      if (field_28615 == null) {
         return -1;
      } else {
         return var0 >= 0 && var0 < field_28615.length ? field_28615[var0] : -1;
      }
   }

   public static void method_25555() {
      if (field_28614) {
         field_28614 = false;
         method_25553(class_6588.method_30120());
      }
   }

   public static void method_25553(class_8591 var0) {
      method_25554();
      if (var0 != null) {
         if (class_7860.field_39861.method_3596() && MinecraftClient.getInstance().method_8498() == null) {
            class_3111.method_14277("[Shaders] Delayed loading of item mappings after resources are loaded");
            field_28614 = true;
         } else {
            ArrayList var3 = new ArrayList();
            String var4 = "/shaders/item.properties";
            InputStream var5 = var0.method_39505(var4);
            if (var5 != null) {
               method_25550(var5, var4, var3);
            }

            method_25549(var3);
            if (var3.size() > 0) {
               field_28615 = method_25551(var3);
            }
         }
      }
   }

   private static void method_25549(List<Integer> var0) {
      String[] var3 = class_8835.method_40646();

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];

         try {
            class_4639 var6 = new class_4639(var5, "shaders/item.properties");
            InputStream var7 = class_3111.method_14374(var6);
            method_25550(var7, var6.toString(), var0);
         } catch (IOException var8) {
         }
      }
   }

   private static void method_25550(InputStream var0, String var1, List<Integer> var2) {
      if (var0 != null) {
         try {
            var0 = class_9441.method_43672(var0, var1);
            class_8407 var5 = new class_8407();
            var5.load(var0);
            var0.close();
            class_3111.method_14277("[Shaders] Parsing item mappings: " + var1);
            class_6284 var6 = new class_6284("Shaders");

            for (String var8 : var5.keySet()) {
               String var9 = var5.getProperty(var8);
               String var10 = "item.";
               if (!var8.startsWith(var10)) {
                  class_3111.method_14317("[Shaders] Invalid item ID: " + var8);
               } else {
                  String var11 = class_8251.method_37832(var8, var10);
                  int var12 = class_3111.method_14361(var11, -1);
                  if (var12 < 0) {
                     class_3111.method_14317("[Shaders] Invalid item alias ID: " + var12);
                  } else {
                     int[] var13 = var6.method_28681(var9);
                     if (var13 != null && var13.length >= 1) {
                        for (int var14 = 0; var14 < var13.length; var14++) {
                           int var15 = var13[var14];
                           method_25552(var2, var15, var12);
                        }
                     } else {
                        class_3111.method_14317("[Shaders] Invalid item ID mapping: " + var8 + "=" + var9);
                     }
                  }
               }
            }
         } catch (IOException var16) {
            class_3111.method_14317("[Shaders] Error reading: " + var1);
         }
      }
   }

   private static void method_25552(List<Integer> var0, int var1, int var2) {
      while (var0.size() <= var1) {
         var0.add(-1);
      }

      var0.set(var1, var2);
   }

   private static int[] method_25551(List<Integer> var0) {
      int[] var3 = new int[var0.size()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = (Integer)var0.get(var4);
      }

      return var3;
   }

   public static void method_25554() {
      field_28615 = null;
   }
}
