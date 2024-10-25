package mapped;



public class Class8253 implements Class8252 {
   private static final boolean[] field35464 = new boolean[]{false, false, true, true, false, false, true, true, true, true, true};
   private static final int field35465 = 4;
   private static final int field35466 = 2;

   private Class8253() {
   }

   private static int method28774(Class9189 var0, int[][] var1) throws AACException {
      int var4 = 0;
      int var5 = var1[var4][0];
      int var6 = var0.method34397(var5);

      while (var6 != var1[var4][1]) {
         var4++;
         int var7 = var1[var4][0] - var5;
         var5 = var1[var4][0];
         var6 <<= var7;
         var6 |= var0.method34397(var7);
      }

      return var4;
   }

   private static void method28775(Class9189 var0, int[] var1, int var2, int var3) throws AACException {
      for (int var6 = var2; var6 < var2 + var3; var6++) {
         if (var1[var6] != 0 && var0.method34399()) {
            var1[var6] = -var1[var6];
         }
      }
   }

   private static int method28776(Class9189 var0, int var1) throws AACException {
      boolean var4 = var1 < 0;
      int var5 = 4;

      while (var0.method34399()) {
         var5++;
      }

      int var6 = var0.method34397(var5) | 1 << var5;
      return !var4 ? var6 : -var6;
   }

   public static int method28777(Class9189 var0) throws AACException {
      int var3 = method28774(var0, field35462);
      return field35462[var3][2];
   }

   public static void method28778(Class9189 var0, int var1, int[] var2, int var3) throws AACException {
      int[][] var6 = field35463[var1 - 1];
      int var7 = method28774(var0, var6);
      var2[var3] = var6[var7][2];
      var2[var3 + 1] = var6[var7][3];
      if (var1 < 5) {
         var2[var3 + 2] = var6[var7][4];
         var2[var3 + 3] = var6[var7][5];
      }

      if (var1 >= 11) {
         if (var1 != 11 && var1 <= 15) {
            throw new AACException("Huffman: unknown spectral codebook: " + var1);
         }

         method28775(var0, var2, var3, var1 >= 5 ? 2 : 4);
         if (Math.abs(var2[var3]) == 16) {
            var2[var3] = method28776(var0, var2[var3]);
         }

         if (Math.abs(var2[var3 + 1]) == 16) {
            var2[var3 + 1] = method28776(var0, var2[var3 + 1]);
         }
      } else if (field35464[var1 - 1]) {
         method28775(var0, var2, var3, var1 >= 5 ? 2 : 4);
      }
   }
}
