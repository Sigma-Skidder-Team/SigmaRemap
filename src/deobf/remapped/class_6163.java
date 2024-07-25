package remapped;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface class_6163 {
   @Nullable
   class_3757 method_28260(class_1331 var1);

   class_2522 method_28262(class_1331 var1);

   class_4774 method_28258(class_1331 var1);

   default int method_28263(class_1331 var1) {
      return this.method_28262(var1).method_8339();
   }

   default int method_28255() {
      return 15;
   }

   default int method_28261() {
      return 256;
   }

   default Stream<class_2522> method_28256(class_4092 var1) {
      return class_1331.method_6085(var1).<class_2522>map(this::method_28262);
   }

   default class_9529 method_28265(class_972 var1) {
      return method_28257(
         var1,
         (var1x, var2) -> {
            class_2522 var5 = this.method_28262(var2);
            class_4774 var6 = this.method_28258(var2);
            class_1343 var7 = var1x.method_4255();
            class_1343 var8 = var1x.method_4256();
            class_4190 var9 = var1x.method_4257(var5, this, var2);
            class_9529 var10 = this.method_28266(var7, var8, var2, var9, var5);
            class_4190 var11 = var1x.method_4258(var6, this, var2);
            class_9529 var12 = var11.method_19493(var7, var8, var2);
            double var13 = var10 != null ? var1x.method_4255().method_6204(var10.method_33993()) : Double.MAX_VALUE;
            double var15 = var12 != null ? var1x.method_4255().method_6204(var12.method_33993()) : Double.MAX_VALUE;
            return !(var13 <= var15) ? var12 : var10;
         },
         var0 -> {
            class_1343 var3 = var0.method_4255().method_6194(var0.method_4256());
            return class_9529.method_43958(
               var0.method_4256(), Direction.method_1044(var3.field_7336, var3.field_7333, var3.field_7334), new class_1331(var0.method_4256())
            );
         }
      );
   }

   @Nullable
   default class_9529 method_28266(class_1343 var1, class_1343 var2, class_1331 var3, class_4190 var4, class_2522 var5) {
      class_9529 var8 = var4.method_19493(var1, var2, var3);
      if (var8 != null) {
         class_9529 var9 = var5.method_8351(this, var3).method_19493(var1, var2, var3);
         if (var9 != null && var9.method_33993().method_6194(var1).method_6221() < var8.method_33993().method_6194(var1).method_6221()) {
            return var8.method_43954(var9.method_43956());
         }
      }

      return var8;
   }

   default double method_28264(class_4190 var1, Supplier<class_4190> var2) {
      if (var1.method_19485()) {
         double var5 = ((class_4190)var2.get()).method_19495(class_9249.field_47216);
         return !(var5 >= 1.0) ? Double.NEGATIVE_INFINITY : var5 - 1.0;
      } else {
         return var1.method_19495(class_9249.field_47216);
      }
   }

   default double method_28259(class_1331 var1) {
      return this.method_28264(this.method_28262(var1).method_8324(this, var1), () -> {
         class_1331 var4 = var1.method_6100();
         return this.method_28262(var4).method_8324(this, var4);
      });
   }

   static <T> T method_28257(class_972 var0, BiFunction<class_972, class_1331, T> var1, Function<class_972, T> var2) {
      class_1343 var5 = var0.method_4255();
      class_1343 var6 = var0.method_4256();
      if (!var5.equals(var6)) {
         double var7 = class_9299.method_42794(-1.0E-7, var6.field_7336, var5.field_7336);
         double var9 = class_9299.method_42794(-1.0E-7, var6.field_7333, var5.field_7333);
         double var11 = class_9299.method_42794(-1.0E-7, var6.field_7334, var5.field_7334);
         double var13 = class_9299.method_42794(-1.0E-7, var5.field_7336, var6.field_7336);
         double var15 = class_9299.method_42794(-1.0E-7, var5.field_7333, var6.field_7333);
         double var17 = class_9299.method_42794(-1.0E-7, var5.field_7334, var6.field_7334);
         int var19 = class_9299.method_42847(var13);
         int var20 = class_9299.method_42847(var15);
         int var21 = class_9299.method_42847(var17);
         class_2921 var22 = new class_2921(var19, var20, var21);
         Object var23 = var1.apply(var0, var22);
         if (var23 == null) {
            double var24 = var7 - var13;
            double var26 = var9 - var15;
            double var28 = var11 - var17;
            int var30 = class_9299.method_42793(var24);
            int var31 = class_9299.method_42793(var26);
            int var32 = class_9299.method_42793(var28);
            double var33 = var30 != 0 ? (double)var30 / var24 : Double.MAX_VALUE;
            double var35 = var31 != 0 ? (double)var31 / var26 : Double.MAX_VALUE;
            double var37 = var32 != 0 ? (double)var32 / var28 : Double.MAX_VALUE;
            double var39 = var33 * (var30 <= 0 ? class_9299.method_42822(var13) : 1.0 - class_9299.method_42822(var13));
            double var41 = var35 * (var31 <= 0 ? class_9299.method_42822(var15) : 1.0 - class_9299.method_42822(var15));
            double var43 = var37 * (var32 <= 0 ? class_9299.method_42822(var17) : 1.0 - class_9299.method_42822(var17));

            while (var39 <= 1.0 || var41 <= 1.0 || var43 <= 1.0) {
               if (!(var39 < var41)) {
                  if (!(var41 < var43)) {
                     var21 += var32;
                     var43 += var37;
                  } else {
                     var20 += var31;
                     var41 += var35;
                  }
               } else if (!(var39 < var43)) {
                  var21 += var32;
                  var43 += var37;
               } else {
                  var19 += var30;
                  var39 += var33;
               }

               Object var45 = var1.apply(var0, var22.method_13362(var19, var20, var21));
               if (var45 != null) {
                  return (T)var45;
               }
            }

            return (T)var2.apply(var0);
         } else {
            return (T)var23;
         }
      } else {
         return (T)var2.apply(var0);
      }
   }
}
