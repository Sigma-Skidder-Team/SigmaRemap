package mapped;

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

public class Class7689 implements Class7690 {
   private final Class8718[] field32928;
   private final DoubleList field32929;
   private final double field32930;
   private final double field32931;

   public Class7689(Class2420 var1, IntStream var2) {
      this(var1, var2.boxed().collect(ImmutableList.toImmutableList()));
   }

   public Class7689(Class2420 var1, List<Integer> var2) {
      this(var1, new IntRBTreeSet(var2));
   }

   public static Class7689 method25308(Class2420 var0, int var1, DoubleList var2) {
      return new Class7689(var0, Pair.of(var1, var2));
   }

   private static Pair<Integer, DoubleList> method25309(IntSortedSet var0) {
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

   private Class7689(Class2420 var1, IntSortedSet var2) {
      this(var1, method25309(var2));
   }

   private Class7689(Class2420 var1, Pair<Integer, DoubleList> var2) {
      int var5 = (Integer)var2.getFirst();
      this.field32929 = (DoubleList)var2.getSecond();
      Class8718 var6 = new Class8718(var1);
      int var7 = this.field32929.size();
      int var8 = -var5;
      this.field32928 = new Class8718[var7];
      if (var8 >= 0 && var8 < var7) {
         double var10 = this.field32929.getDouble(var8);
         if (var10 != 0.0) {
            this.field32928[var8] = var6;
         }
      }

      for (int var9 = var8 - 1; var9 >= 0; var9--) {
         if (var9 >= var7) {
            var1.method10369(262);
         } else {
            double var12 = this.field32929.getDouble(var9);
            if (var12 == 0.0) {
               var1.method10369(262);
            } else {
               this.field32928[var9] = new Class8718(var1);
            }
         }
      }

      if (var8 < var7 - 1) {
         long var18 = (long)(var6.method31444(0.0, 0.0, 0.0, 0.0, 0.0) * 9.223372E18F);
         Class2420 var14 = new Class2420(var18);

         for (int var15 = var8 + 1; var15 < var7; var15++) {
            if (var15 < 0) {
               var14.method10369(262);
            } else {
               double var16 = this.field32929.getDouble(var15);
               if (var16 == 0.0) {
                  var14.method10369(262);
               } else {
                  this.field32928[var15] = new Class8718(var14);
               }
            }
         }
      }

      this.field32931 = Math.pow(2.0, (double)(-var8));
      this.field32930 = Math.pow(2.0, (double)(var7 - 1)) / (Math.pow(2.0, (double)var7) - 1.0);
   }

   public double method25310(double var1, double var3, double var5) {
      return this.method25311(var1, var3, var5, 0.0, 0.0, false);
   }

   public double method25311(double var1, double var3, double var5, double var7, double var9, boolean var11) {
      double var14 = 0.0;
      double var16 = this.field32931;
      double var18 = this.field32930;

      for (int var20 = 0; var20 < this.field32928.length; var20++) {
         Class8718 var21 = this.field32928[var20];
         if (var21 != null) {
            var14 += this.field32929.getDouble(var20)
               * var21.method31444(
                  method25313(var1 * var16), !var11 ? method25313(var3 * var16) : -var21.field39338, method25313(var5 * var16), var7 * var16, var9 * var16
               )
               * var18;
         }

         var16 *= 2.0;
         var18 /= 2.0;
      }

      return var14;
   }

   @Nullable
   public Class8718 method25312(int var1) {
      return this.field32928[this.field32928.length - 1 - var1];
   }

   public static double method25313(double var0) {
      return var0 - (double)Class9679.method37770(var0 / 3.3554432E7 + 0.5) * 3.3554432E7;
   }

   @Override
   public double method25314(double var1, double var3, double var5, double var7) {
      return this.method25311(var1, var3, 0.0, var5, var7, false);
   }
}
