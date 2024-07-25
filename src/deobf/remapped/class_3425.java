package remapped;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class class_3425 {
   @Nullable
   public static class_1343 method_15845(class_4612 var0, int var1, int var2) {
      return method_15833(var0, var1, var2, 0, (class_1343)null, true, (float) (Math.PI / 2), var0::method_21375, false, 0, 0, true);
   }

   @Nullable
   public static class_1343 method_15843(class_4612 var0, int var1, int var2, int var3, class_1343 var4, double var5) {
      return method_15833(var0, var1, var2, var3, var4, true, var5, var0::method_21375, true, 0, 0, false);
   }

   @Nullable
   public static class_1343 method_15834(class_4612 var0, int var1, int var2) {
      return method_15846(var0, var1, var2, var0::method_21375);
   }

   @Nullable
   public static class_1343 method_15846(class_4612 var0, int var1, int var2, ToDoubleFunction<class_1331> var3) {
      return method_15833(var0, var1, var2, 0, (class_1343)null, false, 0.0, var3, true, 0, 0, true);
   }

   @Nullable
   public static class_1343 method_15842(class_4612 var0, int var1, int var2, class_1343 var3, float var4, int var5, int var6) {
      return method_15833(var0, var1, var2, 0, var3, false, (double)var4, var0::method_21375, true, var5, var6, true);
   }

   @Nullable
   public static class_1343 method_15838(class_4612 var0, int var1, int var2, class_1343 var3) {
      class_1343 var6 = var3.method_6193(var0.method_37302(), var0.method_37309(), var0.method_37156());
      return method_15833(var0, var1, var2, 0, var6, false, (float) (Math.PI / 2), var0::method_21375, true, 0, 0, true);
   }

   @Nullable
   public static class_1343 method_15837(class_4612 var0, int var1, int var2, class_1343 var3) {
      class_1343 var6 = var3.method_6193(var0.method_37302(), var0.method_37309(), var0.method_37156());
      return method_15833(var0, var1, var2, 0, var6, true, (float) (Math.PI / 2), var0::method_21375, false, 0, 0, true);
   }

   @Nullable
   public static class_1343 method_15841(class_4612 var0, int var1, int var2, class_1343 var3, double var4) {
      class_1343 var8 = var3.method_6193(var0.method_37302(), var0.method_37309(), var0.method_37156());
      return method_15833(var0, var1, var2, 0, var8, true, var4, var0::method_21375, false, 0, 0, true);
   }

   @Nullable
   public static class_1343 method_15847(class_4612 var0, int var1, int var2, int var3, class_1343 var4, double var5) {
      class_1343 var9 = var4.method_6193(var0.method_37302(), var0.method_37309(), var0.method_37156());
      return method_15833(var0, var1, var2, var3, var9, false, var5, var0::method_21375, true, 0, 0, false);
   }

   @Nullable
   public static class_1343 method_15835(class_4612 var0, int var1, int var2, class_1343 var3) {
      class_1343 var6 = var0.method_37245().method_6194(var3);
      return method_15833(var0, var1, var2, 0, var6, true, (float) (Math.PI / 2), var0::method_21375, false, 0, 0, true);
   }

   @Nullable
   public static class_1343 method_15836(class_4612 var0, int var1, int var2, class_1343 var3) {
      class_1343 var6 = var0.method_37245().method_6194(var3);
      return method_15833(var0, var1, var2, 0, var6, false, (float) (Math.PI / 2), var0::method_21375, true, 0, 0, true);
   }

   @Nullable
   private static class_1343 method_15833(
      class_4612 var0,
      int var1,
      int var2,
      int var3,
      class_1343 var4,
      boolean var5,
      double var6,
      ToDoubleFunction<class_1331> var8,
      boolean var9,
      int var10,
      int var11,
      boolean var12
   ) {
      class_1249 var15 = var0.method_26927();
      Random var16 = var0.method_26594();
      boolean var17;
      if (!var0.method_26848()) {
         var17 = false;
      } else {
         var17 = var0.method_26885().method_12170(var0.method_37245(), (double)(var0.method_26912() + (float)var1) + 1.0);
      }

      boolean var18 = false;
      double var19 = Double.NEGATIVE_INFINITY;
      class_1331 var21 = var0.method_37075();

      for (int var22 = 0; var22 < 10; var22++) {
         class_1331 var23 = method_15840(var16, var1, var2, var3, var4, var6);
         if (var23 != null) {
            int var24 = var23.method_12173();
            int var25 = var23.method_12165();
            int var26 = var23.method_12185();
            if (var0.method_26848() && var1 > 1) {
               class_1331 var27 = var0.method_26885();
               if (!(var0.method_37302() > (double)var27.method_12173())) {
                  var24 += var16.nextInt(var1 / 2);
               } else {
                  var24 -= var16.nextInt(var1 / 2);
               }

               if (!(var0.method_37156() > (double)var27.method_12185())) {
                  var26 += var16.nextInt(var1 / 2);
               } else {
                  var26 -= var16.nextInt(var1 / 2);
               }
            }

            class_1331 var31 = new class_1331((double)var24 + var0.method_37302(), (double)var25 + var0.method_37309(), (double)var26 + var0.method_37156());
            if (var31.method_12165() >= 0
               && var31.method_12165() <= var0.field_41768.method_28261()
               && (!var17 || var0.method_26880(var31))
               && (!var12 || var15.method_5609(var31))) {
               if (var9) {
                  var31 = method_15844(
                     var31,
                     var16.nextInt(var10 + 1) + var11,
                     var0.field_41768.method_28261(),
                     var1x -> var0.field_41768.method_28262(var1x).method_8362().method_24499()
                  );
               }

               if (var5 || !var0.field_41768.method_28258(var31).method_22007(class_6503.field_33094)) {
                  class_1108 var28 = class_2266.method_10452(var0.field_41768, var31.method_6089());
                  if (var0.method_26931(var28) == 0.0F) {
                     double var29 = var8.applyAsDouble(var31);
                     if (var29 > var19) {
                        var19 = var29;
                        var21 = var31;
                        var18 = true;
                     }
                  }
               }
            }
         }
      }

      return !var18 ? null : class_1343.method_6200(var21);
   }

   @Nullable
   private static class_1331 method_15840(Random var0, int var1, int var2, int var3, class_1343 var4, double var5) {
      if (var4 != null && !(var5 >= Math.PI)) {
         double var12 = class_9299.method_42821(var4.field_7334, var4.field_7336) - (float) (Math.PI / 2);
         double var14 = var12 + (double)(2.0F * var0.nextFloat() - 1.0F) * var5;
         double var16 = Math.sqrt(var0.nextDouble()) * (double)class_9299.field_47448 * (double)var1;
         double var18 = -var16 * Math.sin(var14);
         double var20 = var16 * Math.cos(var14);
         if (!(Math.abs(var18) > (double)var1) && !(Math.abs(var20) > (double)var1)) {
            int var22 = var0.nextInt(2 * var2 + 1) - var2 + var3;
            return new class_1331(var18, (double)var22, var20);
         } else {
            return null;
         }
      } else {
         int var9 = var0.nextInt(2 * var1 + 1) - var1;
         int var10 = var0.nextInt(2 * var2 + 1) - var2 + var3;
         int var11 = var0.nextInt(2 * var1 + 1) - var1;
         return new class_1331(var9, var10, var11);
      }
   }

   public static class_1331 method_15844(class_1331 var0, int var1, int var2, Predicate<class_1331> var3) {
      if (var1 < 0) {
         throw new IllegalArgumentException("aboveSolidAmount was " + var1 + ", expected >= 0");
      } else if (!var3.test(var0)) {
         return var0;
      } else {
         class_1331 var6 = var0.method_6081();

         while (var6.method_12165() < var2 && var3.test(var6)) {
            var6 = var6.method_6081();
         }

         class_1331 var7 = var6;

         while (var7.method_12165() < var2 && var7.method_12165() - var6.method_12165() < var1) {
            class_1331 var8 = var7.method_6081();
            if (var3.test(var8)) {
               break;
            }

            var7 = var8;
         }

         return var7;
      }
   }
}
