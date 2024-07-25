package remapped;

import java.util.Comparator;
import java.util.Optional;

public class class_90 {
   private static String[] field_171;
   private final class_6331 field_172;

   public class_90(class_6331 var1) {
      this.field_172 = var1;
   }

   public Optional<class_8623> method_241(BlockPos var1, boolean var2) {
      class_1489 var5 = this.field_172.method_28969();
      int var6 = !var2 ? 128 : 16;
      var5.method_6862(this.field_172, var1, var6);
      Optional var7 = var5.method_6863(var0 -> var0 == class_236.field_782, var1, var6, class_8122.field_41615)
         .sorted(
            Comparator.<class_8009>comparingDouble(var1x -> var1x.method_36337().method_12180(var1))
               .thenComparingInt(var0 -> var0.method_36337().method_12165())
         )
         .filter(var1x -> this.field_172.method_28262(var1x.method_36337()).method_10307(class_6023.field_30670))
         .findFirst();
      return var7.<class_8623>map(
         var1x -> {
            BlockPos var4 = var1x.method_36337();
            this.field_172.method_28945().method_10177(class_5032.field_26022, new class_2034(var4), 3, var4);
            class_2522 var5x = this.field_172.method_28262(var4);
            return class_1535.method_6972(
               var4,
               var5x.<class_9249>method_10313(class_6023.field_30670),
               21,
               class_9249.field_47216,
               21,
               var2x -> this.field_172.method_28262(var2x) == var5x
            );
         }
      );
   }

   public Optional<class_8623> method_242(BlockPos var1, class_9249 var2) {
      Direction var5 = Direction.method_1043(class_137.field_405, var2);
      double var6 = -1.0;
      BlockPos var8 = null;
      double var9 = -1.0;
      BlockPos var11 = null;
      class_2098 var12 = this.field_172.method_6673();
      int var13 = this.field_172.method_43371() - 1;
      class_2921 var14 = var1.method_6089();

      for (class_2921 var16 : BlockPos.method_6070(var1, 16, Direction.field_804, Direction.field_800)) {
         int var17 = Math.min(var13, this.field_172.method_22562(class_3801.field_18595, var16.method_12173(), var16.method_12185()));
         boolean var18 = true;
         if (var12.method_9813(var16) && var12.method_9813(var16.method_13369(var5, 1))) {
            var16.method_13369(var5.method_1046(), 1);

            for (int var19 = var17; var19 >= 0; var19--) {
               var16.method_12184(var19);
               if (this.field_172.method_22548(var16)) {
                  int var20 = var19;

                  while (var19 > 0 && this.field_172.method_22548(var16.method_13368(Direction.field_802))) {
                     var19--;
                  }

                  if (var19 + 4 <= var13) {
                     int var21 = var20 - var19;
                     if (var21 <= 0 || var21 >= 3) {
                        var16.method_12184(var19);
                        if (this.method_239(var16, var14, var5, 0)) {
                           double var22 = var1.method_12180(var16);
                           if (this.method_239(var16, var14, var5, -1) && this.method_239(var16, var14, var5, 1) && (var6 == -1.0 || var6 > var22)) {
                              var6 = var22;
                              var8 = var16.method_6072();
                           }

                           if (var6 == -1.0 && (var9 == -1.0 || var9 > var22)) {
                              var9 = var22;
                              var11 = var16.method_6072();
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 == -1.0 && var9 != -1.0) {
         var8 = var11;
         var6 = var9;
      }

      if (var6 == -1.0) {
         var8 = new BlockPos(var1.method_12173(), class_9299.method_42829(var1.method_12165(), 70, this.field_172.method_43371() - 10), var1.method_12185())
            .method_6072();
         Direction var24 = var5.method_1042();
         if (!var12.method_9813(var8)) {
            return Optional.<class_8623>empty();
         }

         for (int var27 = -1; var27 < 2; var27++) {
            for (int var30 = 0; var30 < 2; var30++) {
               for (int var32 = -1; var32 < 3; var32++) {
                  class_2522 var33 = var32 >= 0 ? class_4783.field_23184.method_29260() : class_4783.field_23881.method_29260();
                  var14.method_13360(
                     var8, var30 * var5.method_1041() + var27 * var24.method_1041(), var32, var30 * var5.method_1034() + var27 * var24.method_1034()
                  );
                  this.field_172.method_29594(var14, var33);
               }
            }
         }
      }

      for (int var25 = -1; var25 < 3; var25++) {
         for (int var28 = -1; var28 < 4; var28++) {
            if (var25 == -1 || var25 == 2 || var28 == -1 || var28 == 3) {
               var14.method_13360(var8, var25 * var5.method_1041(), var28, var25 * var5.method_1034());
               this.field_172.method_7513(var14, class_4783.field_23881.method_29260(), 3);
            }
         }
      }

      class_2522 var26 = class_4783.field_23588.method_29260().method_10308(class_3465.field_16975, var2);

      for (int var29 = 0; var29 < 2; var29++) {
         for (int var31 = 0; var31 < 3; var31++) {
            var14.method_13360(var8, var29 * var5.method_1041(), var31, var29 * var5.method_1034());
            this.field_172.method_7513(var14, var26, 18);
         }
      }

      return Optional.<class_8623>of(new class_8623(var8.method_6072(), 2, 3));
   }

   private boolean method_239(BlockPos var1, class_2921 var2, Direction var3, int var4) {
      Direction var7 = var3.method_1042();

      for (int var8 = -1; var8 < 3; var8++) {
         for (int var9 = -1; var9 < 4; var9++) {
            var2.method_13360(var1, var3.method_1041() * var8 + var7.method_1041() * var4, var9, var3.method_1034() * var8 + var7.method_1034() * var4);
            if (var9 < 0 && !this.field_172.method_28262(var2).method_8362().method_24499()) {
               return false;
            }

            if (var9 >= 0 && !this.field_172.method_22548(var2)) {
               return false;
            }
         }
      }

      return true;
   }
}
