package remapped;

import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.function.Predicate;

public class class_1535 {
   private static String[] field_8139;

   public static class_8623 method_6972(class_1331 var0, class_9249 var1, int var2, class_9249 var3, int var4, Predicate<class_1331> var5) {
      class_2921 var8 = var0.method_6089();
      class_240 var9 = class_240.method_1043(class_137.field_403, var1);
      class_240 var10 = var9.method_1046();
      class_240 var11 = class_240.method_1043(class_137.field_403, var3);
      class_240 var12 = var11.method_1046();
      int var13 = method_6973(var5, var8.method_13364(var0), var9, var2);
      int var14 = method_6973(var5, var8.method_13364(var0), var10, var2);
      int var15 = var13;
      class_6443[] var16 = new class_6443[var13 + 1 + var14];
      var16[var13] = new class_6443(method_6973(var5, var8.method_13364(var0), var11, var4), method_6973(var5, var8.method_13364(var0), var12, var4));
      int var17 = var16[var13].field_32884;

      for (int var18 = 1; var18 <= var13; var18++) {
         class_6443 var19 = var16[var15 - (var18 - 1)];
         var16[var15 - var18] = new class_6443(
            method_6973(var5, var8.method_13364(var0).method_13369(var9, var18), var11, var19.field_32884),
            method_6973(var5, var8.method_13364(var0).method_13369(var9, var18), var12, var19.field_32885)
         );
      }

      for (int var28 = 1; var28 <= var14; var28++) {
         class_6443 var30 = var16[var15 + var28 - 1];
         var16[var15 + var28] = new class_6443(
            method_6973(var5, var8.method_13364(var0).method_13369(var10, var28), var11, var30.field_32884),
            method_6973(var5, var8.method_13364(var0).method_13369(var10, var28), var12, var30.field_32885)
         );
      }

      int var29 = 0;
      int var31 = 0;
      int var20 = 0;
      int var21 = 0;
      int[] var22 = new int[var16.length];

      for (int var23 = var17; var23 >= 0; var23--) {
         for (int var24 = 0; var24 < var16.length; var24++) {
            class_6443 var25 = var16[var24];
            int var26 = var17 - var25.field_32884;
            int var27 = var17 + var25.field_32885;
            var22[var24] = var23 >= var26 && var23 <= var27 ? var27 + 1 - var23 : 0;
         }

         Pair var32 = method_6974(var22);
         class_6443 var33 = (class_6443)var32.getFirst();
         int var34 = 1 + var33.field_32885 - var33.field_32884;
         int var35 = (Integer)var32.getSecond();
         if (var34 * var35 > var20 * var21) {
            var29 = var33.field_32884;
            var31 = var23;
            var20 = var34;
            var21 = var35;
         }
      }

      return new class_8623(var0.method_6068(var1, var29 - var15).method_6068(var3, var31 - var17), var20, var21);
   }

   private static int method_6973(Predicate<class_1331> var0, class_2921 var1, class_240 var2, int var3) {
      int var6 = 0;

      while (var6 < var3 && var0.test(var1.method_13368(var2))) {
         var6++;
      }

      return var6;
   }

   @VisibleForTesting
   public static Pair<class_6443, Integer> method_6974(int[] var0) {
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

      return new Pair(new class_6443(var3, var4 - 1), var5);
   }
}
