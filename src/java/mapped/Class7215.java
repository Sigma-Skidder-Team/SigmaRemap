package mapped;

import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.function.Predicate;

public class Class7215 {
   private static String[] field31023;

   public static Class9502 method22658(BlockPos var0, Class113 var1, int var2, Class113 var3, int var4, Predicate<BlockPos> var5) {
      Mutable var8 = var0.method8354();
      Direction var9 = Direction.method555(Class1892.field11093, var1);
      Direction var10 = var9.method536();
      Direction var11 = Direction.method555(Class1892.field11093, var3);
      Direction var12 = var11.method536();
      int var13 = method22659(var5, var8.method8374(var0), var9, var2);
      int var14 = method22659(var5, var8.method8374(var0), var10, var2);
      int var15 = var13;
      Class8936[] var16 = new Class8936[var13 + 1 + var14];
      var16[var13] = new Class8936(method22659(var5, var8.method8374(var0), var11, var4), method22659(var5, var8.method8374(var0), var12, var4));
      int var17 = var16[var13].field40426;

      for (int var18 = 1; var18 <= var13; var18++) {
         Class8936 var19 = var16[var15 - (var18 - 1)];
         var16[var15 - var18] = new Class8936(
            method22659(var5, var8.method8374(var0).method8380(var9, var18), var11, var19.field40426),
            method22659(var5, var8.method8374(var0).method8380(var9, var18), var12, var19.field40427)
         );
      }

      for (int var28 = 1; var28 <= var14; var28++) {
         Class8936 var30 = var16[var15 + var28 - 1];
         var16[var15 + var28] = new Class8936(
            method22659(var5, var8.method8374(var0).method8380(var10, var28), var11, var30.field40426),
            method22659(var5, var8.method8374(var0).method8380(var10, var28), var12, var30.field40427)
         );
      }

      int var29 = 0;
      int var31 = 0;
      int var20 = 0;
      int var21 = 0;
      int[] var22 = new int[var16.length];

      for (int var23 = var17; var23 >= 0; var23--) {
         for (int var24 = 0; var24 < var16.length; var24++) {
            Class8936 var25 = var16[var24];
            int var26 = var17 - var25.field40426;
            int var27 = var17 + var25.field40427;
            var22[var24] = var23 >= var26 && var23 <= var27 ? var27 + 1 - var23 : 0;
         }

         Pair var32 = method22660(var22);
         Class8936 var33 = (Class8936)var32.getFirst();
         int var34 = 1 + var33.field40427 - var33.field40426;
         int var35 = (Integer)var32.getSecond();
         if (var34 * var35 > var20 * var21) {
            var29 = var33.field40426;
            var31 = var23;
            var20 = var34;
            var21 = var35;
         }
      }

      return new Class9502(var0.method8351(var1, var29 - var15).method8351(var3, var31 - var17), var20, var21);
   }

   private static int method22659(Predicate<BlockPos> var0, Mutable var1, Direction var2, int var3) {
      int var6 = 0;

      while (var6 < var3 && var0.test(var1.method8379(var2))) {
         var6++;
      }

      return var6;
   }

   @VisibleForTesting
   public static Pair<Class8936, Integer> method22660(int[] var0) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      IntArrayList var6 = new IntArrayList();
      var6.push(0);

      for (int var7 = 1; var7 <= var0.length; var7++) {
         int var8 = var7 != var0.length ? var0[var7] : 0;

         while (!var6.isEmpty()) {
            int var9 = var0[var6.topInt()];
            if (var8 >= var9) {
               var6.push(var7);
               break;
            }

            var6.popInt();
            int var10 = !var6.isEmpty() ? var6.topInt() + 1 : 0;
            if (var9 * (var7 - var10) > var5 * (var4 - var3)) {
               var4 = var7;
               var3 = var10;
               var5 = var9;
            }
         }

         if (var6.isEmpty()) {
            var6.push(var7);
         }
      }

      return new Pair(new Class8936(var3, var4 - 1), var5);
   }
}
