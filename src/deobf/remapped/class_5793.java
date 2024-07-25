package remapped;

public class class_5793 {
   private static String[] field_29273;
   private static final int[] field_29272 = new int[]{21, 23, 32, 43, 46, 64, 85, 93, 128, 0, 0, 0};

   public static void method_26217(class_8470 var0, float[][][] var1, float[][][] var2, int var3) {
      float[][] var6 = new float[64][2];
      float[][] var7 = new float[64][2];
      int var8 = var0.field_43316;
      int var9 = var0.field_43361[var3][0];
      int var10 = var0.field_43361[var3][var0.field_43378[var3]];
      method_26220(var0, var3);
      if (var3 == 0 && var0.field_43392) {
         method_26218(var0);
      }

      for (int var11 = 0; var11 < var0.field_43352; var11++) {
         for (int var12 = 0; var12 < var0.field_43310[var11]; var12++) {
            int var13 = var0.field_43327 + var12;

            for (int var14 = 0; var14 < var11; var14++) {
               var13 += var0.field_43310[var14];
            }

            int var15 = var0.field_43350[var11] + var12;
            int var16 = var0.field_43334[var13];
            float var17 = var0.field_43330[var3][var16];
            float var18 = var17 * var17;
            if (!(var18 > 0.0F)) {
               for (int var30 = var9; var30 < var10; var30++) {
                  var2[var30 + var8][var13][0] = var1[var30 + var8][var15][0];
                  var2[var30 + var8][var13][1] = var1[var30 + var8][var15][1];
               }
            } else {
               method_26215(var0, var1, var6, var7, var15);
               float var20 = var6[var15][0] * var17;
               float var21 = var7[var15][0] * var18;
               float var22 = var6[var15][1] * var17;
               float var23 = var7[var15][1] * var18;
               float var24 = var1[var9 - 2 + var8][var15][0];
               float var25 = var1[var9 - 1 + var8][var15][0];
               float var26 = var1[var9 - 2 + var8][var15][1];
               float var27 = var1[var9 - 1 + var8][var15][1];

               for (int var19 = var9; var19 < var10; var19++) {
                  float var28 = var24;
                  var24 = var25;
                  var25 = var1[var19 + var8][var15][0];
                  float var29 = var26;
                  var26 = var27;
                  var27 = var1[var19 + var8][var15][1];
                  var2[var19 + var8][var13][0] = var25 + (var20 * var24 - var22 * var26 + var21 * var28 - var23 * var29);
                  var2[var19 + var8][var13][1] = var27 + var22 * var24 + var20 * var26 + var23 * var28 + var21 * var29;
               }
            }
         }
      }

      if (var0.field_43392) {
         class_2015.method_9346(var0);
      }
   }

   private static void method_26219(class_8470 var0, class_3167 var1, float[][][] var2, int var3, int var4) {
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.99999905F;
      int var13 = var0.field_43316;
      float var14 = var2[var13 - 2][var3][0];
      float var15 = var2[var13 - 2][var3][1];
      float var16 = var2[var13 - 1][var3][0];
      float var17 = var2[var13 - 1][var3][1];
      float var18 = var14;
      float var19 = var15;
      float var20 = var16;
      float var21 = var17;

      for (int var22 = var13; var22 < var4 + var13; var22++) {
         float var23 = var14;
         float var24 = var15;
         var14 = var16;
         var15 = var17;
         var16 = var2[var22][var3][0];
         var17 = var2[var22][var3][1];
         var7 += var16 * var14 + var17 * var15;
         var8 += var17 * var14 - var16 * var15;
         var9 += var16 * var23 + var17 * var24;
         var10 += var17 * var23 - var16 * var24;
         var11 += var14 * var14 + var15 * var15;
      }

      var1.field_15835[0] = var7 - (var16 * var14 + var17 * var15) + var20 * var18 + var21 * var19;
      var1.field_15835[1] = var8 - (var17 * var14 - var16 * var15) + (var21 * var18 - var20 * var19);
      var1.field_15839[0] = var11 - (var14 * var14 + var15 * var15) + var18 * var18 + var19 * var19;
      var1.field_15837[0] = var7;
      var1.field_15837[1] = var8;
      var1.field_15840[0] = var9;
      var1.field_15840[1] = var10;
      var1.field_15834[0] = var11;
      var1.field_15838 = var1.field_15834[0] * var1.field_15839[0]
         - var12 * (var1.field_15835[0] * var1.field_15835[0] + var1.field_15835[1] * var1.field_15835[1]);
   }

   private static void method_26215(class_8470 var0, float[][][] var1, float[][] var2, float[][] var3, int var4) {
      class_3167 var7 = new class_3167(null);
      method_26219(var0, var7, var1, var4, var0.field_43294 + 6);
      if (var7.field_15838 != 0.0F) {
         float var8 = 1.0F / var7.field_15838;
         var3[var4][0] = (var7.field_15837[0] * var7.field_15835[0] - var7.field_15837[1] * var7.field_15835[1] - var7.field_15840[0] * var7.field_15834[0])
            * var8;
         var3[var4][1] = (var7.field_15837[1] * var7.field_15835[0] + var7.field_15837[0] * var7.field_15835[1] - var7.field_15840[1] * var7.field_15834[0])
            * var8;
      } else {
         var3[var4][0] = 0.0F;
         var3[var4][1] = 0.0F;
      }

      if (var7.field_15834[0] != 0.0F) {
         float var9 = 1.0F / var7.field_15834[0];
         var2[var4][0] = -(var7.field_15837[0] + var3[var4][0] * var7.field_15835[0] + var3[var4][1] * var7.field_15835[1]) * var9;
         var2[var4][1] = -(var7.field_15837[1] + var3[var4][1] * var7.field_15835[0] - var3[var4][0] * var7.field_15835[1]) * var9;
      } else {
         var2[var4][0] = 0.0F;
         var2[var4][1] = 0.0F;
      }

      if (var2[var4][0] * var2[var4][0] + var2[var4][1] * var2[var4][1] >= 16.0F || var3[var4][0] * var3[var4][0] + var3[var4][1] * var3[var4][1] >= 16.0F) {
         var2[var4][0] = 0.0F;
         var2[var4][1] = 0.0F;
         var3[var4][0] = 0.0F;
         var3[var4][1] = 0.0F;
      }
   }

   private static float method_26214(int var0, int var1) {
      switch (var0) {
         case 1:
            if (var1 == 0) {
               return 0.6F;
            }

            return 0.75F;
         case 2:
            return 0.9F;
         case 3:
            return 0.98F;
         default:
            return var1 == 1 ? 0.6F : 0.0F;
      }
   }

   private static void method_26220(class_8470 var0, int var1) {
      for (int var4 = 0; var4 < var0.field_43353; var4++) {
         var0.field_43330[var1][var4] = method_26214(var0.field_43336[var1][var4], var0.field_43332[var1][var4]);
         if (!(var0.field_43330[var1][var4] < var0.field_43338[var1][var4])) {
            var0.field_43330[var1][var4] = var0.field_43330[var1][var4] * 0.90625F + var0.field_43338[var1][var4] * 0.09375F;
         } else {
            var0.field_43330[var1][var4] = var0.field_43330[var1][var4] * 0.75F + var0.field_43338[var1][var4] * 0.25F;
         }

         if (var0.field_43330[var1][var4] < 0.015625F) {
            var0.field_43330[var1][var4] = 0.0F;
         }

         if (var0.field_43330[var1][var4] >= 0.99609375F) {
            var0.field_43330[var1][var4] = 0.99609375F;
         }

         var0.field_43338[var1][var4] = var0.field_43330[var1][var4];
         var0.field_43332[var1][var4] = var0.field_43336[var1][var4];
      }
   }

   private static void method_26218(class_8470 var0) {
      int var3 = var0.field_43354;
      int var4 = var0.field_43327;
      int var5 = field_29272[var0.field_43299.method_41129()];
      var0.field_43352 = 0;
      int var6;
      if (var5 >= var0.field_43327 + var0.field_43339) {
         var6 = var0.field_43317;
      } else {
         int var7 = 0;

         for (var6 = 0; var0.field_43319[var7] < var5; var7++) {
            var6 = var7 + 1;
         }
      }

      if (var0.field_43317 == 0) {
         var0.field_43352 = 0;
         var0.field_43310[0] = 0;
         var0.field_43350[0] = 0;
      } else {
         int var9;
         do {
            int var8 = var6 + 1;

            int var10;
            do {
               var9 = var0.field_43319[--var8];
               var10 = (var9 - 2 + var0.field_43354) % 2;
            } while (var9 > var0.field_43354 - 1 + var3 - var10);

            var0.field_43310[var0.field_43352] = Math.max(var9 - var4, 0);
            var0.field_43350[var0.field_43352] = var0.field_43354 - var10 - var0.field_43310[var0.field_43352];
            if (var0.field_43310[var0.field_43352] <= 0) {
               var3 = var0.field_43327;
            } else {
               var4 = var9;
               var3 = var9;
               var0.field_43352++;
            }

            if (var0.field_43319[var6] - var9 < 3) {
               var6 = var0.field_43317;
            }
         } while (var9 != var0.field_43327 + var0.field_43339);

         if (var0.field_43310[var0.field_43352 - 1] < 3 && var0.field_43352 > 1) {
            var0.field_43352--;
         }

         var0.field_43352 = Math.min(var0.field_43352, 5);
      }
   }
}
