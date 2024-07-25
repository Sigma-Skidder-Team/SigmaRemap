package remapped;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class class_1303 {
   private static class_3581[] field_7220 = null;
   public static boolean field_7218 = false;

   public static class_3581 method_5950(class_6163 var0, class_2522 var1, class_1331 var2) {
      if (field_7220 != null) {
         if (var1.method_8321(var0, var2)) {
            return null;
         } else {
            int var5 = var1.method_11477();
            return var5 > 0 && var5 < field_7220.length ? field_7220[var5] : null;
         }
      } else {
         return null;
      }
   }

   public static void method_5951() {
      field_7220 = null;
      field_7218 = false;
      ArrayList var2 = new ArrayList();
      String var3 = "optifine/block.properties";
      Properties var4 = class_9654.method_44541(var3, "CustomBlockLayers");
      if (var4 != null) {
         method_5949(var3, var4, var2);
      }

      if (class_3111.method_14424()) {
         class_8407 var5 = class_7330.method_33405();
         if (var5 != null) {
            String var6 = "shaders/block.properties";
            method_5949(var6, var5, var2);
         }
      }

      if (!var2.isEmpty()) {
         field_7220 = var2.<class_3581>toArray(new class_3581[var2.size()]);
         field_7218 = true;
      }
   }

   private static void method_5949(String var0, Properties var1, List<class_3581> var2) {
      class_3111.method_14277("CustomBlockLayers: " + var0);
      method_5947("solid", class_6727.field_34745, var1, var2);
      method_5947("cutout", class_6727.field_34743, var1, var2);
      method_5947("cutout_mipped", class_6727.field_34746, var1, var2);
      method_5947("translucent", class_6727.field_34740, var1, var2);
   }

   private static void method_5947(String var0, class_3581 var1, Properties var2, List<class_3581> var3) {
      String var6 = "layer." + var0;
      String var7 = var2.getProperty(var6);
      if (var7 != null) {
         class_6284 var8 = new class_6284("CustomBlockLayers");
         class_9491[] var9 = var8.method_28680(var7);
         if (var9 != null) {
            for (int var10 = 0; var10 < var9.length; var10++) {
               class_9491 var11 = var9[var10];
               int var12 = var11.method_43838();
               if (var12 > 0) {
                  while (var3.size() < var12 + 1) {
                     var3.add((class_3581)null);
                  }

                  if (var3.get(var12) != null) {
                     class_3111.method_14317("CustomBlockLayers: Block layer is already set, block: " + var12 + ", layer: " + var0);
                  }

                  var3.set(var12, var1);
               }
            }
         }
      }
   }

   public static boolean method_5952() {
      return field_7218;
   }
}
