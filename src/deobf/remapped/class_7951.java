package remapped;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class class_7951 {
   private static String[] field_40682;

   public static <S extends class_3757> class_7892<S> method_35989(
      class_133<S> var0,
      Function<class_2522, class_1168> var1,
      Function<class_2522, Direction> var2,
      class_6162 var3,
      class_2522 var4,
      class_9379 var5,
      BlockPos var6,
      BiPredicate<class_9379, BlockPos> var7
   ) {
      class_3757 var10 = var0.method_447(var5, var6);
      if (var10 != null) {
         if (!var7.test(var5, var6)) {
            class_1168 var11 = (class_1168)var1.apply(var4);
            boolean var12 = var11 == class_1168.field_6622;
            boolean var13 = var11 == class_1168.field_6621;
            if (!var12) {
               BlockPos var14 = var6.method_6098((Direction)var2.apply(var4));
               class_2522 var15 = var5.method_28262(var14);
               if (var15.method_8350(var4.method_8360())) {
                  class_1168 var16 = (class_1168)var1.apply(var15);
                  if (var16 != class_1168.field_6622 && var11 != var16 && var15.<Direction>method_10313(var3) == var4.<Direction>method_10313(var3)) {
                     if (var7.test(var5, var14)) {
                        return class_3606::method_16828;
                     }

                     class_3757 var17 = var0.method_447(var5, var14);
                     if (var17 != null) {
                        class_3757 var18 = !var13 ? var17 : var10;
                        class_3757 var19 = !var13 ? var10 : var17;
                        return new class_4793<S>((S)var18, (S)var19);
                     }
                  }
               }

               return new class_3308<S>((S)var10);
            } else {
               return new class_3308<S>((S)var10);
            }
         } else {
            return class_3606::method_16828;
         }
      } else {
         return class_3606::method_16828;
      }
   }
}
