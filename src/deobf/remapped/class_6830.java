package remapped;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.util.List;
import java.util.stream.IntStream;

public class class_6830 implements class_5580 {
   private final class_6567[] field_35224;
   private final double field_35222;
   private final double field_35225;

   public class_6830(class_8679 var1, IntStream var2) {
      this(var1, var2.boxed().collect(ImmutableList.toImmutableList()));
   }

   public class_6830(class_8679 var1, List<Integer> var2) {
      this(var1, new IntRBTreeSet(var2));
   }

   private class_6830(class_8679 var1, IntSortedSet var2) {
      if (var2.isEmpty()) {
         throw new IllegalArgumentException("Need some octaves!");
      } else {
         int var5 = -var2.firstInt();
         int var6 = var2.lastInt();
         int var7 = var5 + var6 + 1;
         if (var7 < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
         } else {
            class_6567 var8 = new class_6567(var1);
            int var9 = var6;
            this.field_35224 = new class_6567[var7];
            if (var6 >= 0 && var6 < var7 && var2.contains(0)) {
               this.field_35224[var6] = var8;
            }

            for (int var10 = var6 + 1; var10 < var7; var10++) {
               if (var10 >= 0 && var2.contains(var9 - var10)) {
                  this.field_35224[var10] = new class_6567(var1);
               } else {
                  var1.method_39868(262);
               }
            }

            if (var6 > 0) {
               long var11 = (long)(var8.method_30011(var8.field_33495, var8.field_33497, var8.field_33498) * 9.223372E18F);
               class_8679 var13 = new class_8679(var11);

               for (int var14 = var9 - 1; var14 >= 0; var14--) {
                  if (var14 < var7 && var2.contains(var9 - var14)) {
                     this.field_35224[var14] = new class_6567(var13);
                  } else {
                     var13.method_39868(262);
                  }
               }
            }

            this.field_35225 = Math.pow(2.0, (double)var6);
            this.field_35222 = 1.0 / (Math.pow(2.0, (double)var7) - 1.0);
         }
      }
   }

   public double method_31321(double var1, double var3, boolean var5) {
      double var8 = 0.0;
      double var10 = this.field_35225;
      double var12 = this.field_35222;

      for (class_6567 var17 : this.field_35224) {
         if (var17 != null) {
            var8 += var17.method_30013(var1 * var10 + (!var5 ? 0.0 : var17.field_33495), var3 * var10 + (!var5 ? 0.0 : var17.field_33497)) * var12;
         }

         var10 /= 2.0;
         var12 *= 2.0;
      }

      return var8;
   }

   @Override
   public double method_25346(double var1, double var3, double var5, double var7) {
      return this.method_31321(var1, var3, true) * 0.55;
   }
}
