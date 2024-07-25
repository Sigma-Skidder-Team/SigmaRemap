package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntBidirectionalIterator;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class class_2439 implements class_5580 {
   private final class_5652[] field_12120;
   private final DoubleList field_12122;
   private final double field_12124;
   private final double field_12121;

   public class_2439(class_8679 var1, IntStream var2) {
      this(var1, var2.boxed().collect(ImmutableList.toImmutableList()));
   }

   public class_2439(class_8679 var1, List<Integer> var2) {
      this(var1, new IntRBTreeSet(var2));
   }

   public static class_2439 method_11117(class_8679 var0, int var1, DoubleList var2) {
      return new class_2439(var0, Pair.of(var1, var2));
   }

   private static Pair<Integer, DoubleList> method_11116(IntSortedSet var0) {
      if (var0.isEmpty()) {
         throw new IllegalArgumentException("Need some octaves!");
      } else {
         int var3 = -var0.firstInt();
         int var4 = var0.lastInt();
         int var5 = var3 + var4 + 1;
         if (var5 < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
         } else {
            DoubleArrayList var6 = new DoubleArrayList(new double[var5]);
            IntBidirectionalIterator var7 = var0.iterator();

            while (var7.hasNext()) {
               int var8 = var7.nextInt();
               var6.set(var8 + var3, 1.0);
            }

            return Pair.of(-var3, var6);
         }
      }
   }

   private class_2439(class_8679 var1, IntSortedSet var2) {
      this(var1, method_11116(var2));
   }

   private class_2439(class_8679 var1, Pair<Integer, DoubleList> var2) {
      int var5 = (Integer)var2.getFirst();
      this.field_12122 = (DoubleList)var2.getSecond();
      class_5652 var6 = new class_5652(var1);
      int var7 = this.field_12122.size();
      int var8 = -var5;
      this.field_12120 = new class_5652[var7];
      if (var8 >= 0 && var8 < var7) {
         double var10 = this.field_12122.getDouble(var8);
         if (var10 != 0.0) {
            this.field_12120[var8] = var6;
         }
      }

      for (int var9 = var8 - 1; var9 >= 0; var9--) {
         if (var9 >= var7) {
            var1.method_39868(262);
         } else {
            double var12 = this.field_12122.getDouble(var9);
            if (var12 == 0.0) {
               var1.method_39868(262);
            } else {
               this.field_12120[var9] = new class_5652(var1);
            }
         }
      }

      if (var8 < var7 - 1) {
         long var18 = (long)(var6.method_25572(0.0, 0.0, 0.0, 0.0, 0.0) * 9.223372E18F);
         class_8679 var14 = new class_8679(var18);

         for (int var15 = var8 + 1; var15 < var7; var15++) {
            if (var15 < 0) {
               var14.method_39868(262);
            } else {
               double var16 = this.field_12122.getDouble(var15);
               if (var16 == 0.0) {
                  var14.method_39868(262);
               } else {
                  this.field_12120[var15] = new class_5652(var14);
               }
            }
         }
      }

      this.field_12121 = Math.pow(2.0, (double)(-var8));
      this.field_12124 = Math.pow(2.0, (double)(var7 - 1)) / (Math.pow(2.0, (double)var7) - 1.0);
   }

   public double method_11112(double var1, double var3, double var5) {
      return this.method_11118(var1, var3, var5, 0.0, 0.0, false);
   }

   public double method_11118(double var1, double var3, double var5, double var7, double var9, boolean var11) {
      double var14 = 0.0;
      double var16 = this.field_12121;
      double var18 = this.field_12124;

      for (int var20 = 0; var20 < this.field_12120.length; var20++) {
         class_5652 var21 = this.field_12120[var20];
         if (var21 != null) {
            var14 += this.field_12122.getDouble(var20)
               * var21.method_25572(
                  method_11113(var1 * var16), !var11 ? method_11113(var3 * var16) : -var21.field_28670, method_11113(var5 * var16), var7 * var16, var9 * var16
               )
               * var18;
         }

         var16 *= 2.0;
         var18 /= 2.0;
      }

      return var14;
   }

   @Nullable
   public class_5652 method_11114(int var1) {
      return this.field_12120[this.field_12120.length - 1 - var1];
   }

   public static double method_11113(double var0) {
      return var0 - (double)class_9299.method_42854(var0 / 3.3554432E7 + 0.5) * 3.3554432E7;
   }

   @Override
   public double method_25346(double var1, double var3, double var5, double var7) {
      return this.method_11118(var1, var3, 0.0, var5, var7, false);
   }
}
