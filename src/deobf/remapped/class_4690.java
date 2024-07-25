package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class class_4690 {
   private static String[] field_22828;
   private static final List<class_5024> field_22827 = ImmutableList.of();

   public static class_7373 method_21661(class_7373 var0, class_2522 var1, class_4460 var2) {
      if (var2.method_20696()) {
         var0 = class_9582.method_44261(var0, var1);
      }

      return var0;
   }

   public static List<class_5024> method_21658(
      List<class_5024> var0, class_5561 var1, class_2522 var2, class_1331 var3, class_240 var4, class_3581 var5, long var6, class_4460 var8
   ) {
      if (var4 != null) {
         if (var8.method_20696() && class_9582.method_44266(var1.method_28262(var3.method_6098(var4)), var2)) {
            return field_22827;
         }

         if (!var8.method_20690(var0) && class_3111.method_14331()) {
            var0 = class_8316.method_38342(var1, var2, var3, var4, var0);
         }
      }

      List var11 = var8.method_20697();
      var11.clear();

      for (int var12 = 0; var12 < var0.size(); var12++) {
         class_5024 var13 = (class_5024)var0.get(var12);
         class_5024[] var14 = method_21659(var13, var1, var2, var3, var4, var6, var8);
         if (var12 == 0 && var0.size() == 1 && var14.length == 1 && var14[0] == var13 && var13.method_23162() == null) {
            return var0;
         }

         for (int var15 = 0; var15 < var14.length; var15++) {
            class_5024 var16 = var14[var15];
            var11.add(var16);
            if (var16.method_23162() != null) {
               var8.method_20695(method_21660(var5)).method_40989(var16.method_23162(), var2);
               var8.method_20698(true);
            }
         }
      }

      return var11;
   }

   private static class_3581 method_21660(class_3581 var0) {
      return var0 != null && var0 != class_6727.field_34745 ? var0 : class_6727.field_34746;
   }

   private static class_5024[] method_21659(class_5024 var0, class_5561 var1, class_2522 var2, class_1331 var3, class_240 var4, long var5, class_4460 var7) {
      if (var7.method_20691(var0)) {
         return var7.method_20683(var0);
      } else {
         class_5024 var10 = var0;
         if (class_3111.method_14370()) {
            class_5024[] var11 = class_9049.method_41550(var1, var2, var3, var0, var7);
            if (var11.length != 1 || var11[0] != var0) {
               return var11;
            }
         }

         if (class_3111.method_14404()) {
            var0 = class_3475.method_15966(var3, var0);
            if (var0 != var10) {
               return var7.method_20683(var0);
            }
         }

         return var7.method_20683(var0);
      }
   }
}
