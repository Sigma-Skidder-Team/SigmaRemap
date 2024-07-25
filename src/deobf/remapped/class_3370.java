package remapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

public final class class_3370 {
   private static String[] field_16612;
   private static final class_4190 field_16615 = Util.<class_6697>method_44660(() -> {
      class_3087 var2 = new class_3087(1, 1, 1);
      var2.method_26202(0, 0, 0, true, true);
      return new class_6697(var2);
   });
   public static final class_4190 field_16614 = method_15522(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final class_4190 field_16613 = new class_2573(
      new class_3087(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static class_4190 method_15536() {
      return field_16613;
   }

   public static class_4190 method_15524() {
      return field_16615;
   }

   public static class_4190 method_15522(double var0, double var2, double var4, double var6, double var8, double var10) {
      return method_15523(new Box(var0, var2, var4, var6, var8, var10));
   }

   public static class_4190 method_15523(Box var0) {
      int var3 = method_15539(var0.field_19941, var0.field_19940);
      int var4 = method_15539(var0.field_19937, var0.field_19939);
      int var5 = method_15539(var0.field_19938, var0.field_19942);
      if (var3 >= 0 && var4 >= 0 && var5 >= 0) {
         if (var3 == 0 && var4 == 0 && var5 == 0) {
            return !var0.method_18902(0.5, 0.5, 0.5) ? method_15536() : method_15524();
         } else {
            int var6 = 1 << var3;
            int var7 = 1 << var4;
            int var8 = 1 << var5;
            int var9 = (int)Math.round(var0.field_19941 * (double)var6);
            int var10 = (int)Math.round(var0.field_19940 * (double)var6);
            int var11 = (int)Math.round(var0.field_19937 * (double)var7);
            int var12 = (int)Math.round(var0.field_19939 * (double)var7);
            int var13 = (int)Math.round(var0.field_19938 * (double)var8);
            int var14 = (int)Math.round(var0.field_19942 * (double)var8);
            class_3087 var15 = new class_3087(var6, var7, var8, var9, var11, var13, var10, var12, var14);

            for (long var16 = (long)var9; var16 < (long)var10; var16++) {
               for (long var18 = (long)var11; var18 < (long)var12; var18++) {
                  for (long var20 = (long)var13; var20 < (long)var14; var20++) {
                     var15.method_26202((int)var16, (int)var18, (int)var20, false, true);
                  }
               }
            }

            return new class_6697(var15);
         }
      } else {
         return new class_2573(
            field_16615.field_20395,
            new double[]{var0.field_19941, var0.field_19940},
            new double[]{var0.field_19937, var0.field_19939},
            new double[]{var0.field_19938, var0.field_19942}
         );
      }
   }

   private static int method_15539(double var0, double var2) {
      if (!(var0 < -1.0E-7) && !(var2 > 1.0000001)) {
         for (int var6 = 0; var6 <= 3; var6++) {
            double var7 = var0 * (double)(1 << var6);
            double var9 = var2 * (double)(1 << var6);
            boolean var11 = Math.abs(var7 - Math.floor(var7)) < 1.0E-7;
            boolean var12 = Math.abs(var9 - Math.floor(var9)) < 1.0E-7;
            if (var11 && var12) {
               return var6;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static long method_15538(int var0, int var1) {
      return (long)var0 * (long)(var1 / IntMath.gcd(var0, var1));
   }

   public static class_4190 method_15530(class_4190 var0, class_4190 var1) {
      return method_15533(var0, var1, class_8529.field_43644);
   }

   public static class_4190 method_15531(class_4190 var0, class_4190... var1) {
      return Arrays.<class_4190>stream(var1).reduce(var0, class_3370::method_15530);
   }

   public static class_4190 method_15533(class_4190 var0, class_4190 var1, class_8529 var2) {
      return method_15529(var0, var1, var2).method_19497();
   }

   public static class_4190 method_15529(class_4190 var0, class_4190 var1, class_8529 var2) {
      if (!var2.method_39260(false, false)) {
         if (var0 == var1) {
            return !var2.method_39260(true, true) ? method_15536() : var0;
         } else {
            boolean var5 = var2.method_39260(true, false);
            boolean var6 = var2.method_39260(false, true);
            if (!var0.method_19485()) {
               if (var1.method_19485()) {
                  return !var5 ? method_15536() : var0;
               } else {
                  class_1205 var7 = method_15527(1, var0.method_19486(class_9249.field_47215), var1.method_19486(class_9249.field_47215), var5, var6);
                  class_1205 var8 = method_15527(
                     var7.method_5336().size() - 1, var0.method_19486(class_9249.field_47216), var1.method_19486(class_9249.field_47216), var5, var6
                  );
                  class_1205 var9 = method_15527(
                     (var7.method_5336().size() - 1) * (var8.method_5336().size() - 1),
                     var0.method_19486(class_9249.field_47219),
                     var1.method_19486(class_9249.field_47219),
                     var5,
                     var6
                  );
                  class_3087 var10 = class_3087.method_14162(var0.field_20395, var1.field_20395, var7, var8, var9, var2);
                  return (class_4190)(var7 instanceof class_1705 && var8 instanceof class_1705 && var9 instanceof class_1705
                     ? new class_6697(var10)
                     : new class_2573(var10, var7.method_5336(), var8.method_5336(), var9.method_5336()));
               }
            } else {
               return !var6 ? method_15536() : var1;
            }
         }
      } else {
         throw (IllegalArgumentException) Util.method_44658(new IllegalArgumentException());
      }
   }

   public static boolean method_15537(class_4190 var0, class_4190 var1, class_8529 var2) {
      if (var2.method_39260(false, false)) {
         throw (IllegalArgumentException) Util.method_44658(new IllegalArgumentException());
      } else if (var0 == var1) {
         return var2.method_39260(true, true);
      } else if (var0.method_19485()) {
         return var2.method_39260(false, !var1.method_19485());
      } else if (var1.method_19485()) {
         return var2.method_39260(!var0.method_19485(), false);
      } else {
         boolean var5 = var2.method_39260(true, false);
         boolean var6 = var2.method_39260(false, true);

         for (class_9249 var10 : class_5587.field_28369) {
            if (var0.method_19495(var10) < var1.method_19491(var10) - 1.0E-7) {
               return var5 || var6;
            }

            if (var1.method_19495(var10) < var0.method_19491(var10) - 1.0E-7) {
               return var5 || var6;
            }
         }

         class_1205 var11 = method_15527(1, var0.method_19486(class_9249.field_47215), var1.method_19486(class_9249.field_47215), var5, var6);
         class_1205 var12 = method_15527(
            var11.method_5336().size() - 1, var0.method_19486(class_9249.field_47216), var1.method_19486(class_9249.field_47216), var5, var6
         );
         class_1205 var13 = method_15527(
            (var11.method_5336().size() - 1) * (var12.method_5336().size() - 1),
            var0.method_19486(class_9249.field_47219),
            var1.method_19486(class_9249.field_47219),
            var5,
            var6
         );
         return method_15535(var11, var12, var13, var0.field_20395, var1.field_20395, var2);
      }
   }

   private static boolean method_15535(class_1205 var0, class_1205 var1, class_1205 var2, class_5791 var3, class_5791 var4, class_8529 var5) {
      return !var0.method_5337(
         (var5x, var6, var7) -> var1.method_5337(
               (var6x, var7x, var8) -> var2.method_5337(
                     (var7xx, var8x, var9) -> !var5.method_39260(var3.method_26204(var5x, var6x, var7xx), var4.method_26204(var6, var7x, var8x))
                  )
            )
      );
   }

   public static double method_15520(class_9249 var0, Box var1, Stream<class_4190> var2, double var3) {
      Iterator var7 = var2.iterator();

      while (var7.hasNext()) {
         if (Math.abs(var3) < 1.0E-7) {
            return 0.0;
         }

         var3 = ((class_4190)var7.next()).method_19482(var0, var1, var3);
      }

      return var3;
   }

   public static double method_15521(class_9249 var0, Box var1, class_4924 var2, double var3, class_214 var5, Stream<class_4190> var6, boolean var7) {
      return method_15519(var1, var2, var3, var5, class_5587.method_25381(var0, class_9249.field_47219), var6, var7);
   }

   private static double method_15519(Box var0, class_4924 var1, double var2, class_214 var4, class_5587 var5, Stream<class_4190> var6, boolean var7) {
      if (var0.method_18910() < 1.0E-6 || var0.method_18901() < 1.0E-6 || var0.method_18921() < 1.0E-6) {
         return var2;
      } else if (Math.abs(var2) < 1.0E-7) {
         return 0.0;
      } else {
         class_5587 var10 = var5.method_25383();
         class_9249 var11 = var10.method_25382(class_9249.field_47215);
         class_9249 var12 = var10.method_25382(class_9249.field_47216);
         class_9249 var13 = var10.method_25382(class_9249.field_47219);
         class_2921 var14 = new class_2921();
         int var15 = MathHelper.floor(var0.method_18915(var11) - 1.0E-7) - 1;
         int var16 = MathHelper.floor(var0.method_18917(var11) + 1.0E-7) + 1;
         int var17 = MathHelper.floor(var0.method_18915(var12) - 1.0E-7) - 1;
         int var18 = MathHelper.floor(var0.method_18917(var12) + 1.0E-7) + 1;
         double var19 = var0.method_18915(var13) - 1.0E-7;
         double var21 = var0.method_18917(var13) + 1.0E-7;
         boolean var23 = var2 > 0.0;
         int var24 = !var23 ? MathHelper.floor(var0.method_18915(var13) + 1.0E-7) + 1 : MathHelper.floor(var0.method_18917(var13) - 1.0E-7) - 1;
         int var25 = method_15528(var2, var19, var21);
         int var26 = !var23 ? -1 : 1;

         for (int var27 = var24; !var23 ? var27 >= var25 : var27 <= var25; var27 += var26) {
            for (int var28 = var15; var28 <= var16; var28++) {
               for (int var29 = var17; var29 <= var18; var29++) {
                  int var30 = 0;
                  if (var28 == var15 || var28 == var16) {
                     var30++;
                  }

                  if (var29 == var17 || var29 == var18) {
                     var30++;
                  }

                  if (var27 == var24 || var27 == var25) {
                     var30++;
                  }

                  if (var30 < 3) {
                     var14.method_13365(var10, var28, var29, var27);
                     class_2522 var31 = var1.method_28262(var14);
                     if ((var30 != 1 || var31.method_8357()) && (var30 != 2 || var31.method_8350(class_4783.field_23833))) {
                        class_4190 var32 = var31.method_8325(var1, var14, var4);
                        if (var7) {
                           class_5243 var33 = new class_5243(var14, var32);
                           SigmaMainClass.getInstance().getEventManager().call(var33);
                           var32 = var33.method_23988();
                        }

                        var2 = var32.method_19482(
                           var13, var0.method_18918((double)(-var14.getX()), (double)(-var14.getY()), (double)(-var14.getZ())), var2
                        );
                        if (Math.abs(var2) < 1.0E-7) {
                           return 0.0;
                        }

                        var25 = method_15528(var2, var19, var21);
                     }
                  }
               }
            }
         }

         double[] var34 = new double[]{var2};
         var6.forEach(var3 -> var34[0] = var3.method_19482(var13, var0, var34[0]));
         return var34[0];
      }
   }

   private static int method_15528(double var0, double var2, double var4) {
      return !(var0 > 0.0) ? MathHelper.floor(var2 + var0) - 1 : MathHelper.floor(var4 + var0) + 1;
   }

   public static boolean method_15534(class_4190 var0, class_4190 var1, Direction var2) {
      if (var0 == method_15524() && var1 == method_15524()) {
         return true;
      } else if (!var1.method_19485()) {
         class_9249 var5 = var2.method_1029();
         class_137 var6 = var2.method_1049();
         class_4190 var7 = var6 != class_137.field_405 ? var1 : var0;
         class_4190 var8 = var6 != class_137.field_405 ? var0 : var1;
         class_8529 var9 = var6 != class_137.field_405 ? class_8529.field_43654 : class_8529.field_43656;
         return DoubleMath.fuzzyEquals(var7.method_19495(var5), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals(var8.method_19491(var5), 0.0, 1.0E-7)
            && !method_15537(new class_641(var7, var5, var7.field_20395.method_26199(var5) - 1), new class_641(var8, var5, 0), var9);
      } else {
         return false;
      }
   }

   public static class_4190 method_15526(class_4190 var0, Direction var1) {
      if (var0 != method_15524()) {
         class_9249 var4 = var1.method_1029();
         boolean var5;
         int var6;
         if (var1.method_1049() != class_137.field_405) {
            var5 = DoubleMath.fuzzyEquals(var0.method_19491(var4), 0.0, 1.0E-7);
            var6 = 0;
         } else {
            var5 = DoubleMath.fuzzyEquals(var0.method_19495(var4), 1.0, 1.0E-7);
            var6 = var0.field_20395.method_26199(var4) - 1;
         }

         return (class_4190)(var5 ? new class_641(var0, var4, var6) : method_15536());
      } else {
         return method_15524();
      }
   }

   public static boolean method_15525(class_4190 var0, class_4190 var1, Direction var2) {
      if (var0 != method_15524() && var1 != method_15524()) {
         class_9249 var5 = var2.method_1029();
         class_137 var6 = var2.method_1049();
         class_4190 var7 = var6 != class_137.field_405 ? var1 : var0;
         class_4190 var8 = var6 != class_137.field_405 ? var0 : var1;
         if (!DoubleMath.fuzzyEquals(var7.method_19495(var5), 1.0, 1.0E-7)) {
            var7 = method_15536();
         }

         if (!DoubleMath.fuzzyEquals(var8.method_19491(var5), 0.0, 1.0E-7)) {
            var8 = method_15536();
         }

         return !method_15537(
            method_15524(),
            method_15529(new class_641(var7, var5, var7.field_20395.method_26199(var5) - 1), new class_641(var8, var5, 0), class_8529.field_43644),
            class_8529.field_43656
         );
      } else {
         return true;
      }
   }

   public static boolean method_15540(class_4190 var0, class_4190 var1) {
      if (var0 == method_15524() || var1 == method_15524()) {
         return true;
      } else {
         return var0.method_19485() && var1.method_19485()
            ? false
            : !method_15537(method_15524(), method_15529(var0, var1, class_8529.field_43644), class_8529.field_43656);
      }
   }

   @VisibleForTesting
   public static class_1205 method_15527(int var0, DoubleList var1, DoubleList var2, boolean var3, boolean var4) {
      int var7 = var1.size() - 1;
      int var8 = var2.size() - 1;
      if (var1 instanceof class_4347 && var2 instanceof class_4347) {
         long var9 = method_15538(var7, var8);
         if ((long)var0 * var9 <= 256L) {
            return new class_1705(var7, var8);
         }
      }

      if (!(var1.getDouble(var7) < var2.getDouble(0) - 1.0E-7)) {
         if (!(var2.getDouble(var8) < var1.getDouble(0) - 1.0E-7)) {
            if (var7 != var8 || !Objects.equals(var1, var2)) {
               return new class_9621(var1, var2, var3, var4);
            } else if (!(var1 instanceof class_3992)) {
               return (class_1205)(!(var2 instanceof class_3992) ? new class_3992(var1) : (class_1205)var2);
            } else {
               return (class_1205)var1;
            }
         } else {
            return new class_7536(var2, var1, true);
         }
      } else {
         return new class_7536(var1, var2, false);
      }
   }
}
