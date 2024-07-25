package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class class_7524 extends class_7157 {
   private static String[] field_38422;

   public class_7524(Identifier var1) {
      super(var1);
   }

   public boolean method_34280(class_6946 var1, class_6486 var2) {
      ArrayList var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < var1.method_31505(); var6++) {
         class_6098 var7 = var1.method_31498(var6);
         if (!var7.method_28022()) {
            var5.add(var7);
            if (var5.size() > 1) {
               class_6098 var8 = (class_6098)var5.get(0);
               if (var7.method_27960() != var8.method_27960() || var8.method_27997() != 1 || var7.method_27997() != 1 || !var8.method_27960().method_11210()) {
                  return false;
               }
            }
         }
      }

      return var5.size() == 2;
   }

   public class_6098 method_34279(class_6946 var1) {
      ArrayList var4 = Lists.newArrayList();

      for (int var5 = 0; var5 < var1.method_31505(); var5++) {
         class_6098 var6 = var1.method_31498(var5);
         if (!var6.method_28022()) {
            var4.add(var6);
            if (var4.size() > 1) {
               class_6098 var7 = (class_6098)var4.get(0);
               if (var6.method_27960() != var7.method_27960() || var7.method_27997() != 1 || var6.method_27997() != 1 || !var7.method_27960().method_11210()) {
                  return class_6098.field_31203;
               }
            }
         }
      }

      if (var4.size() == 2) {
         class_6098 var16 = (class_6098)var4.get(0);
         class_6098 var17 = (class_6098)var4.get(1);
         if (var16.method_27960() == var17.method_27960() && var16.method_27997() == 1 && var17.method_27997() == 1 && var16.method_27960().method_11210()) {
            class_2451 var18 = var16.method_27960();
            int var8 = var18.method_11234() - var16.method_28026();
            int var9 = var18.method_11234() - var17.method_28026();
            int var10 = var8 + var9 + var18.method_11234() * 5 / 100;
            int var11 = var18.method_11234() - var10;
            if (var11 < 0) {
               var11 = 0;
            }

            class_6098 var12 = new class_6098(var16.method_27960());
            var12.method_27999(var11);
            HashMap var13 = Maps.newHashMap();
            Map var14 = class_2931.method_13402(var16);
            Map var15 = class_2931.method_13402(var17);
            class_8669.field_44445.method_39801().filter(class_4382::method_20435).forEach(var3 -> {
               int var6x = Math.max(var14.getOrDefault(var3, 0), var15.getOrDefault(var3, 0));
               if (var6x > 0) {
                  var13.put(var3, var6x);
               }
            });
            if (!var13.isEmpty()) {
               class_2931.method_13398(var13, var12);
            }

            return var12;
         }
      }

      return class_6098.field_31203;
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14720;
   }
}
