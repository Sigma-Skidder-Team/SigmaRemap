package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_4883 implements class_4052 {
   private static final boolean[] field_24286 = new boolean[]{false, false, true, true, false, false, true, true, true, true, true};
   private static final int field_24285 = 4;
   private static final int field_24284 = 2;

   private class_4883() {
   }

   private static int method_22404(class_7390 var0, int[][] var1) throws AACException {
      int var4 = 0;
      int var5 = var1[var4][0];
      int var6 = var0.method_33662(var5);

      while (var6 != var1[var4][1]) {
         var4++;
         int var7 = var1[var4][0] - var5;
         var5 = var1[var4][0];
         var6 <<= var7;
         var6 |= var0.method_33662(var7);
      }

      return var4;
   }

   private static void method_22402(class_7390 var0, int[] var1, int var2, int var3) throws AACException {
      for (int var6 = var2; var6 < var2 + var3; var6++) {
         if (var1[var6] != 0 && var0.method_33660()) {
            var1[var6] = -var1[var6];
         }
      }
   }

   private static int method_22399(class_7390 var0, int var1) throws AACException {
      boolean var4 = var1 < 0;
      int var5 = 4;

      while (var0.method_33660()) {
         var5++;
      }

      int var6 = var0.method_33662(var5) | 1 << var5;
      return !var4 ? var6 : -var6;
   }

   public static int method_22401(class_7390 var0) throws AACException {
      int var3 = method_22404(var0, field_19709);
      return field_19709[var3][2];
   }

   public static void method_22400(class_7390 var0, int var1, int[] var2, int var3) throws AACException {
      int[][] var6 = field_19708[var1 - 1];
      int var7 = method_22404(var0, var6);
      var2[var3] = var6[var7][2];
      var2[var3 + 1] = var6[var7][3];
      if (var1 < 5) {
         var2[var3 + 2] = var6[var7][4];
         var2[var3 + 3] = var6[var7][5];
      }

      if (var1 >= 11) {
         if (var1 != 11 && var1 <= 15) {
            throw new class_5060("Huffman: unknown spectral codebook: " + var1);
         }

         method_22402(var0, var2, var3, var1 >= 5 ? 2 : 4);
         if (Math.abs(var2[var3]) == 16) {
            var2[var3] = method_22399(var0, var2[var3]);
         }

         if (Math.abs(var2[var3 + 1]) == 16) {
            var2[var3 + 1] = method_22399(var0, var2[var3 + 1]);
         }
      } else if (field_24286[var1 - 1]) {
         method_22402(var0, var2, var3, var1 >= 5 ? 2 : 4);
      }
   }
}
