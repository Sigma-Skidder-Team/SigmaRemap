package remapped;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class class_2750 {
   private static final IntSet field_13458 = new IntOpenHashSet(70, 1.0F);

   public static void method_12392(class_4106 var0) {
      var0.method_19015(class_2277.field_11366, new class_6627());
      var0.method_19015(class_2277.field_11378, new class_4632());
      var0.method_19015(class_2277.field_11339, new class_5771());
      var0.method_19015(class_2277.field_11351, new class_4273());
      var0.method_19015(class_2277.field_11346, new class_8956());
      var0.method_19015(class_2277.field_11356, new class_6105());
      var0.method_19015(class_2277.field_11381, new class_5113());
      var0.method_19015(class_2277.field_11326, new class_7876());
      var0.method_19015(class_2277.field_11307, new class_9262());
      var0.method_19015(class_2277.field_11314, new class_6559());
   }

   public static int method_12391(int var0) {
      if (var0 < 0) {
         var0 = 0;
      }

      int var3 = class_8633.field_44277.method_28211().method_6437(var0);
      if (var3 != -1) {
         return var3;
      } else {
         var3 = class_8633.field_44277.method_28211().method_6437(var0 & -16);
         if (var3 == -1) {
            if (!class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731()) {
               class_3446.method_15886().method_34617().warning("Missing block completely " + var0);
            }

            return 1;
         } else {
            if (!class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731()) {
               class_3446.method_15886().method_34617().warning("Missing block " + var0);
            }

            return var3;
         }
      }
   }

   private static int method_12395(class_1455 var0, class_9371 var1, int var2) {
      class_4081 var5 = var0.<class_4081>method_6746(class_4081.class);
      if (!var5.method_18811(var1)) {
         if (var5.method_18810(var2)) {
            var5.method_18812(var1, var2);
         }
      } else {
         class_8012 var6 = var5.method_18809(var1);
         if (var6.method_36355() != var2) {
            var5.method_18814(var1);
            if (var5.method_18810(var2)) {
               var5.method_18812(var1, var2);
            }
         } else if (var6.method_36354() != -1) {
            return var6.method_36354();
         }
      }

      return var2;
   }

   static {
      for (int var4 = 0; var4 < 50; var4++) {
         field_13458.add(var4);
      }

      field_13458.add(127);

      for (int var7 = 129; var7 <= 134; var7++) {
         field_13458.add(var7);
      }

      field_13458.add(140);
      field_13458.add(149);
      field_13458.add(151);

      for (int var8 = 155; var8 <= 158; var8++) {
         field_13458.add(var8);
      }

      for (int var9 = 160; var9 <= 167; var9++) {
         field_13458.add(var9);
      }
   }
}
