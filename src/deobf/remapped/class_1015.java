package remapped;

public class class_1015 implements class_6924 {
   private static String[] field_5329;

   public static int method_4499(class_8470 var0, int var1) {
      int[] var4;
      var4 = new int[6];
      var4[0] = var0.field_43308 * var0.field_43340[var1];
      var4[var0.field_43378[var1]] = var0.field_43308 * var0.field_43305[var1];
      label97:
      switch (var0.field_43369[var1]) {
         case 0:
            switch (var0.field_43378[var1]) {
               case 2:
                  var4[1] = var0.field_43308 * (var0.field_43395 / 2);
                  break label97;
               case 4:
                  int var5 = var0.field_43395 / 4;
                  var4[3] = var0.field_43308 * 3 * var5;
                  var4[2] = var0.field_43308 * 2 * var5;
                  var4[1] = var0.field_43308 * var5;
               default:
                  break label97;
            }
         case 1:
            if (var0.field_43378[var1] > 1) {
               int var11 = var0.field_43378[var1];
               int var14 = var0.field_43305[var1];

               for (int var17 = 0; var17 < var0.field_43378[var1] - 1; var17++) {
                  if (var14 < var0.field_43384[var1][var17]) {
                     return 1;
                  }

                  var14 -= var0.field_43384[var1][var17];
                  var11--;
                  var4[var11] = var0.field_43308 * var14;
               }
            }
            break;
         case 2:
            if (var0.field_43378[var1] > 1) {
               int var10 = 1;
               int var13 = var0.field_43340[var1];

               for (int var16 = 0; var16 < var0.field_43378[var1] - 1; var16++) {
                  var13 += var0.field_43384[var1][var16];
                  if (var0.field_43308 * var13 + var0.field_43316 > var0.field_43294 + var0.field_43293) {
                     return 1;
                  }

                  var4[var10++] = var0.field_43308 * var13;
               }
            }
            break;
         case 3:
            if (var0.field_43387[var1] != 0) {
               int var6 = 1;
               int var7 = var0.field_43340[var1];

               for (int var8 = 0; var8 < var0.field_43387[var1]; var8++) {
                  var7 += var0.field_43326[var1][var8];
                  if (var0.field_43308 * var7 + var0.field_43316 > var0.field_43294 + var0.field_43293) {
                     return 1;
                  }

                  var4[var6++] = var0.field_43308 * var7;
               }
            }

            if (var0.field_43366[var1] != 0) {
               int var9 = var0.field_43378[var1];
               int var12 = var0.field_43305[var1];

               for (int var15 = 0; var15 < var0.field_43366[var1]; var15++) {
                  if (var12 < var0.field_43304[var1][var15]) {
                     return 1;
                  }

                  var12 -= var0.field_43304[var1][var15];
                  var9--;
                  var4[var9] = var0.field_43308 * var12;
               }
            }
      }

      for (int var18 = 0; var18 < 6; var18++) {
         var0.field_43361[var1][var18] = var4[var18];
      }

      return 0;
   }

   public static void method_4500(class_8470 var0, int var1) {
      var0.field_43290[var1][0] = var0.field_43361[var1][0];
      if (var0.field_43378[var1] != 1) {
         int var4 = method_4498(var0, var1);
         var0.field_43290[var1][1] = var0.field_43361[var1][var4];
         var0.field_43290[var1][2] = var0.field_43361[var1][var0.field_43378[var1]];
      } else {
         var0.field_43290[var1][1] = var0.field_43361[var1][1];
         var0.field_43290[var1][2] = 0;
      }
   }

   private static int method_4498(class_8470 var0, int var1) {
      int var4 = 0;
      switch (var0.field_43369[var1]) {
         case 0:
            var4 = var0.field_43378[var1] / 2;
            break;
         case 1:
         case 3:
            if (var0.field_43306[var1] > 1) {
               var4 = var0.field_43378[var1] + 1 - var0.field_43306[var1];
            } else {
               var4 = var0.field_43378[var1] - 1;
            }
            break;
         case 2:
            if (var0.field_43306[var1] == 0) {
               var4 = 1;
            } else if (var0.field_43306[var1] == 1) {
               var4 = var0.field_43378[var1] - 1;
            } else {
               var4 = var0.field_43306[var1] - 1;
            }
      }

      return var4 > 0 ? var4 : 0;
   }
}
