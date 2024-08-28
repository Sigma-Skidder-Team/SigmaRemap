package mapped;

public class Class6531 implements Class6529 {
   private static String[] field28799;

   public static int method19828(Class6528 var0, int var1) {
      int[] var4;
      var4 = new int[6];
      var4[0] = var0.field28657 * var0.field28675[var1];
      var4[var0.field28679[var1]] = var0.field28657 * var0.field28676[var1];
      label97:
      switch (var0.field28757[var1]) {
         case 0:
            switch (var0.field28679[var1]) {
               case 2:
                  var4[1] = var0.field28657 * (var0.field28729 / 2);
                  break label97;
               case 4:
                  int var5 = var0.field28729 / 4;
                  var4[3] = var0.field28657 * 3 * var5;
                  var4[2] = var0.field28657 * 2 * var5;
                  var4[1] = var0.field28657 * var5;
               default:
                  break label97;
            }
         case 1:
            if (var0.field28679[var1] > 1) {
               int var11 = var0.field28679[var1];
               int var14 = var0.field28676[var1];

               for (int var17 = 0; var17 < var0.field28679[var1] - 1; var17++) {
                  if (var14 < var0.field28758[var1][var17]) {
                     return 1;
                  }

                  var14 -= var0.field28758[var1][var17];
                  var11--;
                  var4[var11] = var0.field28657 * var14;
               }
            }
            break;
         case 2:
            if (var0.field28679[var1] > 1) {
               int var10 = 1;
               int var13 = var0.field28675[var1];

               for (int var16 = 0; var16 < var0.field28679[var1] - 1; var16++) {
                  var13 += var0.field28758[var1][var16];
                  if (var0.field28657 * var13 + var0.field28731 > var0.field28728 + var0.field28730) {
                     return 1;
                  }

                  var4[var10++] = var0.field28657 * var13;
               }
            }
            break;
         case 3:
            if (var0.field28764[var1] != 0) {
               int var6 = 1;
               int var7 = var0.field28675[var1];

               for (int var8 = 0; var8 < var0.field28764[var1]; var8++) {
                  var7 += var0.field28759[var1][var8];
                  if (var0.field28657 * var7 + var0.field28731 > var0.field28728 + var0.field28730) {
                     return 1;
                  }

                  var4[var6++] = var0.field28657 * var7;
               }
            }

            if (var0.field28765[var1] != 0) {
               int var9 = var0.field28679[var1];
               int var12 = var0.field28676[var1];

               for (int var15 = 0; var15 < var0.field28765[var1]; var15++) {
                  if (var12 < var0.field28760[var1][var15]) {
                     return 1;
                  }

                  var12 -= var0.field28760[var1][var15];
                  var9--;
                  var4[var9] = var0.field28657 * var12;
               }
            }
      }

      for (int var18 = 0; var18 < 6; var18++) {
         var0.field28682[var1][var18] = var4[var18];
      }

      return 0;
   }

   public static void method19829(Class6528 var0, int var1) {
      var0.field28683[var1][0] = var0.field28682[var1][0];
      if (var0.field28679[var1] != 1) {
         int var4 = method19830(var0, var1);
         var0.field28683[var1][1] = var0.field28682[var1][var4];
         var0.field28683[var1][2] = var0.field28682[var1][var0.field28679[var1]];
      } else {
         var0.field28683[var1][1] = var0.field28682[var1][1];
         var0.field28683[var1][2] = 0;
      }
   }

   private static int method19830(Class6528 var0, int var1) {
      int var4 = 0;
      switch (var0.field28757[var1]) {
         case 0:
            var4 = var0.field28679[var1] / 2;
            break;
         case 1:
         case 3:
            if (var0.field28761[var1] > 1) {
               var4 = var0.field28679[var1] + 1 - var0.field28761[var1];
            } else {
               var4 = var0.field28679[var1] - 1;
            }
            break;
         case 2:
            if (var0.field28761[var1] == 0) {
               var4 = 1;
            } else if (var0.field28761[var1] == 1) {
               var4 = var0.field28679[var1] - 1;
            } else {
               var4 = var0.field28761[var1] - 1;
            }
      }

      return var4 > 0 ? var4 : 0;
   }
}
