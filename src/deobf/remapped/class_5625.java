package remapped;

public class class_5625 implements class_6924, class_9789 {
   private static String[] field_28547;
   private static final float[] field_28548 = new float[]{0.0318305F, 0.11516383F, 0.2181695F, 0.30150282F, 0.33333334F};
   private static final int[] field_28546 = new int[]{1, 0, -1, 0};
   private static final int[] field_28549 = new int[]{0, 1, 0, -1};
   private static final float[] field_28550 = new float[]{0.5F, 1.0F, 2.0F, 1.0E10F};
   private static final float field_28552 = 1.0E-12F;
   private float[][] field_28551 = new float[5][49];
   private float[][] field_28553 = new float[5][49];
   private float[][] field_28554 = new float[5][49];

   public static int method_25505(class_8470 var0, float[][][] var1, int var2) {
      class_5625 var5 = new class_5625();
      int var6 = 0;
      if (var0.field_43369[var2] != 0) {
         if (var0.field_43369[var2] != 2) {
            if (var0.field_43306[var2] != 0) {
               var0.field_43351[var2] = var0.field_43378[var2] + 1 - var0.field_43306[var2];
            } else {
               var0.field_43351[var2] = -1;
            }
         } else if (var0.field_43306[var2] <= 1) {
            var0.field_43351[var2] = -1;
         } else {
            var0.field_43351[var2] = var0.field_43306[var2] - 1;
         }
      } else {
         var0.field_43351[var2] = -1;
      }

      var6 = method_25504(var0, var5, var1, var2);
      if (var6 <= 0) {
         method_25507(var0, var5, var2);
         method_25508(var0, var5, var1, var2);
         return 0;
      } else {
         return 1;
      }
   }

   private static int method_25506(class_8470 var0, int var1, int var2, int var3) {
      if (var0.field_43357[var1][var2] != 1) {
         int var6 = 2 * var3 - ((var0.field_43390 & 1) == 0 ? 0 : 1);
         int var7 = 2 * (var3 + 1) - ((var0.field_43390 & 1) == 0 ? 0 : 1);

         for (int var8 = var6; var8 < var7; var8++) {
            if ((var2 >= var0.field_43351[var1] || var0.field_43315[var1][var8] != 0 && var0.field_43403[var1]) && var0.field_43396[var1][var8] == 1) {
               return 1;
            }
         }
      } else if (var2 >= var0.field_43351[var1] || var0.field_43315[var1][var3] != 0 && var0.field_43403[var1]) {
         return var0.field_43396[var1][var3];
      }

      return 0;
   }

   private static int method_25504(class_8470 var0, class_5625 var1, float[][][] var2, int var3) {
      if (!var0.field_43389) {
         for (int var6 = 0; var6 < var0.field_43378[var3]; var6++) {
            for (int var13 = 0; var13 < var0.field_43362[var0.field_43357[var3][var6]]; var13++) {
               int var14 = var0.field_43347[var0.field_43357[var3][var6]][var13];
               int var15 = var0.field_43347[var0.field_43357[var3][var6]][var13 + 1];

               for (int var16 = var14; var16 < var15; var16++) {
                  float var11 = 0.0F;
                  int var7 = var0.field_43361[var3][var6];
                  int var8 = var0.field_43361[var3][var6 + 1];
                  float var9 = (float)((var8 - var7) * (var15 - var14));
                  if (var9 == 0.0F) {
                     var9 = 1.0F;
                  }

                  for (int var12 = var7 + var0.field_43316; var12 < var8 + var0.field_43316; var12++) {
                     for (int var17 = var14; var17 < var15; var17++) {
                        var11 += var2[var12][var17][0] * var2[var12][var17][0] + var2[var12][var17][1] * var2[var12][var17][1];
                     }
                  }

                  var0.field_43349[var3][var16 - var0.field_43327][var6] = var11 / var9;
               }
            }
         }
      } else {
         for (int var18 = 0; var18 < var0.field_43378[var3]; var18++) {
            int var19 = var0.field_43361[var3][var18];
            int var20 = var0.field_43361[var3][var18 + 1];
            float var21 = (float)(var20 - var19);
            if (var21 == 0.0F) {
               var21 = 1.0F;
            }

            for (int var10 = 0; var10 < var0.field_43339; var10++) {
               float var22 = 0.0F;

               for (int var23 = var19 + var0.field_43316; var23 < var20 + var0.field_43316; var23++) {
                  var22 += var2[var23][var10 + var0.field_43327][0] * var2[var23][var10 + var0.field_43327][0]
                     + var2[var23][var10 + var0.field_43327][1] * var2[var23][var10 + var0.field_43327][1];
               }

               var0.field_43349[var3][var10][var18] = var22 / var21;
            }
         }
      }

      return 0;
   }

   private static void method_25508(class_8470 var0, class_5625 var1, float[][][] var2, int var3) {
      int var6 = 0;
      int var7 = 0;
      boolean var8 = false;
      if (!var0.field_43392) {
         var6 = var0.field_43320[var3];
      } else {
         var8 = true;
         var6 = 0;
      }

      var7 = var0.field_43377[var3];

      for (int var9 = 0; var9 < var0.field_43378[var3]; var9++) {
         boolean var10 = var9 == var0.field_43351[var3] || var9 == var0.field_43397[var3];
         int var11 = !var0.field_43400 ? 4 : 0;
         var11 = !var10 ? var11 : 0;
         if (var8) {
            for (int var13 = 0; var13 < 4; var13++) {
               System.arraycopy(var1.field_28551[var9], 0, var0.field_43298[var3][var13], 0, var0.field_43339);
               System.arraycopy(var1.field_28553[var9], 0, var0.field_43322[var3][var13], 0, var0.field_43339);
            }

            var0.field_43328[var3] = 4;
            var8 = false;
         }

         for (int var12 = var0.field_43361[var3][var9]; var12 < var0.field_43361[var3][var9 + 1]; var12++) {
            System.arraycopy(var1.field_28551[var9], 0, var0.field_43298[var3][var0.field_43328[var3]], 0, var0.field_43339);
            System.arraycopy(var1.field_28553[var9], 0, var0.field_43322[var3][var0.field_43328[var3]], 0, var0.field_43339);

            for (int var14 = 0; var14 < var0.field_43339; var14++) {
               float[] var15 = new float[2];
               float var16 = 0.0F;
               float var17 = 0.0F;
               if (var11 == 0) {
                  var16 = var0.field_43298[var3][var0.field_43328[var3]][var14];
                  var17 = var0.field_43322[var3][var0.field_43328[var3]][var14];
               } else {
                  int var18 = var0.field_43328[var3];

                  for (int var23 = 0; var23 <= 4; var23++) {
                     float var19 = field_28548[var23];
                     if (++var18 >= 5) {
                        var18 -= 5;
                     }

                     var16 += var0.field_43298[var3][var18][var14] * var19;
                     var17 += var0.field_43322[var3][var18][var14] * var19;
                  }
               }

               var17 = var1.field_28554[var9][var14] == 0.0F && !var10 ? var17 : 0.0F;
               var6 = var6 + 1 & 511;
               var2[var12 + var0.field_43316][var14 + var0.field_43327][0] = var16 * var2[var12 + var0.field_43316][var14 + var0.field_43327][0]
                  + var17 * field_49676[var6][0];
               if (var0.field_43291 == 3 && var0.field_43385 == 42) {
                  var2[var12 + var0.field_43316][var14 + var0.field_43327][0] = 1.642832E7F;
               }

               var2[var12 + var0.field_43316][var14 + var0.field_43327][1] = var16 * var2[var12 + var0.field_43316][var14 + var0.field_43327][1]
                  + var17 * field_49676[var6][1];
               int var25 = (var14 + var0.field_43327 & 1) == 0 ? 1 : -1;
               var15[0] = var1.field_28554[var9][var14] * (float)field_28546[var7];
               var2[var12 + var0.field_43316][var14 + var0.field_43327][0] = var2[var12 + var0.field_43316][var14 + var0.field_43327][0] + var15[0];
               var15[1] = (float)var25 * var1.field_28554[var9][var14] * (float)field_28549[var7];
               var2[var12 + var0.field_43316][var14 + var0.field_43327][1] = var2[var12 + var0.field_43316][var14 + var0.field_43327][1] + var15[1];
            }

            var7 = var7 + 1 & 3;
            var0.field_43328[var3]++;
            if (var0.field_43328[var3] >= 5) {
               var0.field_43328[var3] = 0;
            }
         }
      }

      var0.field_43320[var3] = var6;
      var0.field_43377[var3] = var7;
   }

   private static void method_25507(class_8470 var0, class_5625 var1, int var2) {
      int var5 = 0;
      float[] var6 = new float[49];
      float[] var7 = new float[49];
      float[] var8 = new float[49];

      for (int var9 = 0; var9 < var0.field_43378[var2]; var9++) {
         int var10 = 0;
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         float var14 = var9 != var0.field_43351[var2] && var9 != var0.field_43397[var2] ? 1.0F : 0.0F;
         int var15 = method_25506(var0, var2, var9, var12);
         if (var0.field_43361[var2][var9 + 1] > var0.field_43290[var2][var5 + 1]) {
            var5++;
         }

         for (int var16 = 0; var16 < var0.field_43379[var0.field_43303]; var16++) {
            float var17 = 0.0F;
            float var18 = 0.0F;
            float var19 = 0.0F;
            boolean var20 = false;
            int var21 = var0.field_43359[var0.field_43303][var16];
            int var22 = var0.field_43359[var0.field_43303][var16 + 1];

            for (int var23 = var21; var23 < var22; var23++) {
               if (var23 + var0.field_43327 == var0.field_43347[var0.field_43357[var2][var9]][var11 + 1]) {
                  var11++;
               }

               var18 += var0.field_43341[var2][var11][var9];
               var19 += var0.field_43349[var2][var23][var9];
            }

            float var24 = (1.0E-12F + var18) / (1.0E-12F + var19) * field_28550[var0.field_43388];
            var24 = Math.min(var24, 1.0E10F);

            for (int var31 = var21; var31 < var22; var31++) {
               if (var31 + var0.field_43327 == var0.field_43356[var10 + 1]) {
                  var10++;
               }

               if (var31 + var0.field_43327 == var0.field_43347[var0.field_43357[var2][var9]][var12 + 1]) {
                  var15 = method_25506(var0, var2, var9, ++var12);
               }

               if (var31 + var0.field_43327 == var0.field_43347[1][var13 + 1]) {
                  var13++;
               }

               int var26 = 0;
               if ((var9 >= var0.field_43351[var2] || var0.field_43315[var2][var13] != 0 && var0.field_43403[var2])
                  && var31 + var0.field_43327 == var0.field_43347[1][var13 + 1] + var0.field_43347[1][var13] >> 1) {
                  var26 = var0.field_43396[var2][var13];
               }

               float var27 = var0.field_43402[var2][var10][var5];
               float var28 = var0.field_43335[var2][var10][var5];
               float var29 = var0.field_43341[var2][var12][var9] * var28;
               if (var26 != 0) {
                  var8[var31] = var0.field_43341[var2][var12][var9] * var27;
                  var17 += var8[var31];
               } else {
                  var8[var31] = 0.0F;
               }

               float var30 = var0.field_43341[var2][var12][var9] / (1.0F + var0.field_43349[var2][var31][var9]);
               if (var15 == 0 && var14 == 1.0F) {
                  var30 *= var27;
               } else if (var15 == 1) {
                  var30 *= var28;
               }

               if (!(var24 > var30)) {
                  var6[var31] = var29 * var24 / var30;
                  var7[var31] = var24;
               } else {
                  var6[var31] = var29;
                  var7[var31] = var30;
               }

               var17 += var0.field_43349[var2][var31][var9] * var7[var31];
               if (var26 == 0 && var9 != var0.field_43351[var2]) {
                  var17 += var6[var31];
               }
            }

            float var25 = (var18 + 1.0E-12F) / (var17 + 1.0E-12F);
            var25 = Math.min(var25, 2.5118864F);

            for (int var32 = var21; var32 < var22; var32++) {
               var1.field_28551[var9][var32] = (float)Math.sqrt((double)(var7[var32] * var25));
               var1.field_28553[var9][var32] = (float)Math.sqrt((double)(var6[var32] * var25));
               if (var8[var32] == 0.0F) {
                  var1.field_28554[var9][var32] = 0.0F;
               } else {
                  var1.field_28554[var9][var32] = (float)Math.sqrt((double)(var8[var32] * var25));
               }
            }
         }
      }
   }
}
