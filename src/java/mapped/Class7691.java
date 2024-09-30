package mapped;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import net.minecraft.util.SharedSeedRandom;

import java.util.List;
import java.util.stream.IntStream;

public class Class7691 implements Class7690 {
   private final Class8972[] field32932;
   private final double field32933;
   private final double field32934;

   public Class7691(SharedSeedRandom var1, IntStream var2) {
      this(var1, var2.boxed().collect(ImmutableList.toImmutableList()));
   }

   public Class7691(SharedSeedRandom var1, List<Integer> var2) {
      this(var1, new IntRBTreeSet(var2));
   }

   private Class7691(SharedSeedRandom var1, IntSortedSet var2) {
      if (var2.isEmpty()) {
         throw new IllegalArgumentException("Need some octaves!");
      } else {
         int var5 = -var2.firstInt();
         int var6 = var2.lastInt();
         int var7 = var5 + var6 + 1;
         if (var7 < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
         } else {
            Class8972 var8 = new Class8972(var1);
            int var9 = var6;
            this.field32932 = new Class8972[var7];
            if (var6 >= 0 && var6 < var7 && var2.contains(0)) {
               this.field32932[var6] = var8;
            }

            for (int var10 = var6 + 1; var10 < var7; var10++) {
               if (var10 >= 0 && var2.contains(var9 - var10)) {
                  this.field32932[var10] = new Class8972(var1);
               } else {
                  var1.skip(262);
               }
            }

            if (var6 > 0) {
               long var11 = (long)(var8.method32932(var8.field40562, var8.field40563, var8.field40564) * 9.223372E18F);
               SharedSeedRandom var13 = new SharedSeedRandom(var11);

               for (int var14 = var9 - 1; var14 >= 0; var14--) {
                  if (var14 < var7 && var2.contains(var9 - var14)) {
                     this.field32932[var14] = new Class8972(var13);
                  } else {
                     var13.skip(262);
                  }
               }
            }

            this.field32934 = Math.pow(2.0, (double)var6);
            this.field32933 = 1.0 / (Math.pow(2.0, (double)var7) - 1.0);
         }
      }
   }

   public double method25315(double var1, double var3, boolean var5) {
      double var8 = 0.0;
      double var10 = this.field32934;
      double var12 = this.field32933;

      for (Class8972 var17 : this.field32932) {
         if (var17 != null) {
            var8 += var17.method32931(var1 * var10 + (!var5 ? 0.0 : var17.field40562), var3 * var10 + (!var5 ? 0.0 : var17.field40563)) * var12;
         }

         var10 /= 2.0;
         var12 *= 2.0;
      }

      return var8;
   }

   @Override
   public double method25314(double var1, double var3, double var5, double var7) {
      return this.method25315(var1, var3, true) * 0.55;
   }
}
