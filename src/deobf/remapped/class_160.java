package remapped;

import java.util.function.Function;
import javax.annotation.Nullable;

public class class_160 {
   private static String[] field_483;

   public static int[][] method_645(Direction var0) {
      Direction var3 = var0.method_1042();
      Direction var4 = var3.method_1046();
      Direction var5 = var0.method_1046();
      return new int[][]{
         {var3.method_1041(), var3.method_1034()},
         {var4.method_1041(), var4.method_1034()},
         {var5.method_1041() + var3.method_1041(), var5.method_1034() + var3.method_1034()},
         {var5.method_1041() + var4.method_1041(), var5.method_1034() + var4.method_1034()},
         {var0.method_1041() + var3.method_1041(), var0.method_1034() + var3.method_1034()},
         {var0.method_1041() + var4.method_1041(), var0.method_1034() + var4.method_1034()},
         {var5.method_1041(), var5.method_1034()},
         {var0.method_1041(), var0.method_1034()}
      };
   }

   public static boolean method_648(double var0) {
      return !Double.isInfinite(var0) && var0 < 1.0;
   }

   public static boolean method_647(class_1449 var0, class_5834 var1, class_4092 var2) {
      return var0.method_6680(var1, var2).allMatch(class_4190::method_19485);
   }

   @Nullable
   public static class_1343 method_649(class_1449 var0, double var1, double var3, double var5, class_5834 var7, class_7653 var8) {
      if (method_648(var3)) {
         class_1343 var11 = new class_1343(var1, var3, var5);
         if (method_647(var0, var7, var7.method_26549(var8).method_18920(var11))) {
            return var11;
         }
      }

      return null;
   }

   public static class_4190 method_646(class_6163 var0, BlockPos var1) {
      class_2522 var4 = var0.method_28262(var1);
      return !var4.method_8349(class_2351.field_11770) && (!(var4.method_8360() instanceof class_7502) || !var4.<Boolean>method_10313(class_7502.field_38300))
         ? var4.method_8324(var0, var1)
         : class_3370.method_15536();
   }

   public static double method_652(BlockPos var0, int var1, Function<BlockPos, class_4190> var2) {
      class_2921 var5 = var0.method_6089();
      int var6 = 0;

      while (var6 < var1) {
         class_4190 var7 = (class_4190)var2.apply(var5);
         if (!var7.method_19485()) {
            return (double)(var0.method_12165() + var6) + var7.method_19491(class_9249.field_47216);
         }

         var6++;
         var5.method_13368(Direction.field_817);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static class_1343 method_650(class_6629<?> var0, class_1449 var1, BlockPos var2, boolean var3) {
      if (var3 && var0.method_30481(var1.method_28262(var2))) {
         return null;
      } else {
         double var6 = var1.method_28264(method_646(var1, var2), () -> method_646(var1, var2.method_6100()));
         if (method_648(var6)) {
            if (var3 && var6 <= 0.0 && var0.method_30481(var1.method_28262(var2.method_6100()))) {
               return null;
            } else {
               class_1343 var8 = class_1343.method_6219(var2, var6);
               return !var1.method_6680((Entity)null, var0.method_30473().method_27939(var8)).allMatch(class_4190::method_19485) ? null : var8;
            }
         } else {
            return null;
         }
      }
   }
}
