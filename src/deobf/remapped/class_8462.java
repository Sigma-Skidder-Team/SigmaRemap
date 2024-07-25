package remapped;

import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class class_8462 {
   private static String[] field_43262;

   public static class_7474 method_38935(Entity var0, Predicate<Entity> var1) {
      class_1343 var4 = var0.method_37098();
      World var5 = var0.field_41768;
      class_1343 var6 = var0.method_37245();
      class_1343 var7 = var6.method_6215(var4);
      Object var8 = var5.method_28265(new class_972(var6, var7, class_3132.field_15553, class_9583.field_48747, var0));
      if (((class_7474)var8).method_33990() != class_1430.field_7721) {
         var7 = ((class_7474)var8).method_33993();
      }

      class_5631 var9 = method_38931(var5, var0, var6, var7, var0.method_37241().method_18929(var0.method_37098()).method_18898(1.0), var1);
      if (var9 != null) {
         var8 = var9;
      }

      return (class_7474)var8;
   }

   @Nullable
   public static class_5631 method_38932(Entity var0, class_1343 var1, class_1343 var2, class_4092 var3, Predicate<Entity> var4, double var5) {
      World var9 = var0.field_41768;
      double var10 = var5;
      Entity var12 = null;
      class_1343 var13 = null;

      for (Entity var15 : var9.method_25867(var0, var3, var4)) {
         class_4092 var16 = var15.method_37241().method_18898((double)var15.method_37355());
         Optional var17 = var16.method_18923(var1, var2);
         if (!var16.method_18903(var1)) {
            if (var17.isPresent()) {
               class_1343 var18 = (class_1343)var17.get();
               double var19 = var1.method_6204(var18);
               if (var19 < var10 || var10 == 0.0) {
                  if (var15.method_37240() != var0.method_37240()) {
                     var12 = var15;
                     var13 = var18;
                     var10 = var19;
                  } else if (var10 == 0.0) {
                     var12 = var15;
                     var13 = var18;
                  }
               }
            }
         } else if (var10 >= 0.0) {
            var12 = var15;
            var13 = var17.orElse(var1);
            var10 = 0.0;
         }
      }

      return var12 != null ? new class_5631(var12, var13) : null;
   }

   @Nullable
   public static class_5631 method_38931(World var0, Entity var1, class_1343 var2, class_1343 var3, class_4092 var4, Predicate<Entity> var5) {
      double var8 = Double.MAX_VALUE;
      Entity var10 = null;

      for (Entity var12 : var0.method_25867(var1, var4, var5)) {
         class_4092 var13 = var12.method_37241().method_18898(0.3F);
         Optional var14 = var13.method_18923(var2, var3);
         if (var14.isPresent()) {
            double var15 = var2.method_6204((class_1343)var14.get());
            if (var15 < var8) {
               var10 = var12;
               var8 = var15;
            }
         }
      }

      return var10 != null ? new class_5631(var10) : null;
   }

   public static final void method_38933(Entity var0, float var1) {
      class_1343 var4 = var0.method_37098();
      if (var4.method_6221() != 0.0) {
         float var5 = class_9299.method_42842(Entity.method_37266(var4));
         var0.field_41701 = (float)(class_9299.method_42821(var4.field_7334, var4.field_7336) * 180.0F / (float)Math.PI) + 90.0F;
         var0.field_41755 = (float)(class_9299.method_42821((double)var5, var4.field_7333) * 180.0F / (float)Math.PI) - 90.0F;

         while (var0.field_41755 - var0.field_41762 < -180.0F) {
            var0.field_41762 -= 360.0F;
         }

         while (var0.field_41755 - var0.field_41762 >= 180.0F) {
            var0.field_41762 += 360.0F;
         }

         while (var0.field_41701 - var0.field_41711 < -180.0F) {
            var0.field_41711 -= 360.0F;
         }

         while (var0.field_41701 - var0.field_41711 >= 180.0F) {
            var0.field_41711 += 360.0F;
         }

         var0.field_41755 = class_9299.method_42795(var1, var0.field_41762, var0.field_41755);
         var0.field_41701 = class_9299.method_42795(var1, var0.field_41711, var0.field_41701);
      }
   }

   public static class_2584 method_38934(class_5834 var0, class_2451 var1) {
      return var0.method_26446().method_27960() != var1 ? class_2584.field_12794 : class_2584.field_12791;
   }

   public static class_6749 method_38930(class_5834 var0, ItemStack var1, float var2) {
      class_603 var5 = (class_603)(!(var1.method_27960() instanceof class_603) ? class_4897.field_25024 : var1.method_27960());
      class_6749 var6 = var5.method_2819(var0.field_41768, var1, var0);
      var6.method_30937(var0, var2);
      if (var1.method_27960() == class_4897.field_25013 && var6 instanceof class_581) {
         ((class_581)var6).method_2748(var1);
      }

      return var6;
   }
}
