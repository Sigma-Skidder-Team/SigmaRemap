package mapped;

public class Class8758 {
   private static String[] field39439;
   private static final int[] field39440 = new int[]{21, 23, 32, 43, 46, 64, 85, 93, 128, 0, 0, 0};

   public static void method31595(Class6528 var0, float[][][] var1, float[][][] var2, int var3) {
      float[][] var6 = new float[64][2];
      float[][] var7 = new float[64][2];
      int var8 = var0.field28731;
      int var9 = var0.field28682[var3][0];
      int var10 = var0.field28682[var3][var0.field28679[var3]];
      method31599(var0, var3);
      if (var3 == 0 && var0.field28721) {
         method31600(var0);
      }

      for (int var11 = 0; var11 < var0.field28703; var11++) {
         for (int var12 = 0; var12 < var0.field28704[var11]; var12++) {
            int var13 = var0.field28662 + var12;

            for (int var14 = 0; var14 < var11; var14++) {
               var13 += var0.field28704[var14];
            }

            int var15 = var0.field28705[var11] + var12;
            int var16 = var0.field28674[var13];
            float var17 = var0.field28701[var3][var16];
            float var18 = var17 * var17;
            if (!(var18 > 0.0F)) {
               for (int var30 = var9; var30 < var10; var30++) {
                  var2[var30 + var8][var13][0] = var1[var30 + var8][var15][0];
                  var2[var30 + var8][var13][1] = var1[var30 + var8][var15][1];
               }
            } else {
               method31597(var0, var1, var6, var7, var15);
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

      if (var0.field28721) {
         Class6534.method19843(var0);
      }
   }

   private static void method31596(Class6528 var0, Class7961 var1, float[][][] var2, int var3, int var4) {
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.99999905F;
      int var13 = var0.field28731;
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

      var1.field34234[0] = var7 - (var16 * var14 + var17 * var15) + var20 * var18 + var21 * var19;
      var1.field34234[1] = var8 - (var17 * var14 - var16 * var15) + (var21 * var18 - var20 * var19);
      var1.field34235[0] = var11 - (var14 * var14 + var15 * var15) + var18 * var18 + var19 * var19;
      var1.field34231[0] = var7;
      var1.field34231[1] = var8;
      var1.field34232[0] = var9;
      var1.field34232[1] = var10;
      var1.field34233[0] = var11;
      var1.field34236 = var1.field34233[0] * var1.field34235[0] - var12 * (var1.field34234[0] * var1.field34234[0] + var1.field34234[1] * var1.field34234[1]);
   }

   private static void method31597(Class6528 var0, float[][][] var1, float[][] var2, float[][] var3, int var4) {
      Class7961 var7 = new Class7961();
      method31596(var0, var7, var1, var4, var0.field28728 + 6);
      if (var7.field34236 != 0.0F) {
         float var8 = 1.0F / var7.field34236;
         var3[var4][0] = (var7.field34231[0] * var7.field34234[0] - var7.field34231[1] * var7.field34234[1] - var7.field34232[0] * var7.field34233[0]) * var8;
         var3[var4][1] = (var7.field34231[1] * var7.field34234[0] + var7.field34231[0] * var7.field34234[1] - var7.field34232[1] * var7.field34233[0]) * var8;
      } else {
         var3[var4][0] = 0.0F;
         var3[var4][1] = 0.0F;
      }

      if (var7.field34233[0] != 0.0F) {
         float var9 = 1.0F / var7.field34233[0];
         var2[var4][0] = -(var7.field34231[0] + var3[var4][0] * var7.field34234[0] + var3[var4][1] * var7.field34234[1]) * var9;
         var2[var4][1] = -(var7.field34231[1] + var3[var4][1] * var7.field34234[0] - var3[var4][0] * var7.field34234[1]) * var9;
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

   private static float method31598(int var0, int var1) {
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

   private static void method31599(Class6528 var0, int var1) {
      for (int var4 = 0; var4 < var0.field28667; var4++) {
         var0.field28701[var1][var4] = method31598(var0.field28699[var1][var4], var0.field28700[var1][var4]);
         if (!(var0.field28701[var1][var4] < var0.field28702[var1][var4])) {
            var0.field28701[var1][var4] = var0.field28701[var1][var4] * 0.90625F + var0.field28702[var1][var4] * 0.09375F;
         } else {
            var0.field28701[var1][var4] = var0.field28701[var1][var4] * 0.75F + var0.field28702[var1][var4] * 0.25F;
         }

         if (var0.field28701[var1][var4] < 0.015625F) {
            var0.field28701[var1][var4] = 0.0F;
         }

         if (var0.field28701[var1][var4] >= 0.99609375F) {
            var0.field28701[var1][var4] = 0.99609375F;
         }

         var0.field28702[var1][var4] = var0.field28701[var1][var4];
         var0.field28700[var1][var4] = var0.field28699[var1][var4];
      }
   }

   private static void method31600(Class6528 var0) {
      int var3 = var0.field28661;
      int var4 = var0.field28662;
      int var5 = field39440[var0.field28655.method9032()];
      var0.field28703 = 0;
      int var6;
      if (var5 >= var0.field28662 + var0.field28663) {
         var6 = var0.field28664;
      } else {
         int var7 = 0;

         for (var6 = 0; var0.field28670[var7] < var5; var7++) {
            var6 = var7 + 1;
         }
      }

      if (var0.field28664 == 0) {
         var0.field28703 = 0;
         var0.field28704[0] = 0;
         var0.field28705[0] = 0;
      } else {
         int var9;
         do {
            int var8 = var6 + 1;

            int var10;
            do {
               var9 = var0.field28670[--var8];
               var10 = (var9 - 2 + var0.field28661) % 2;
            } while (var9 > var0.field28661 - 1 + var3 - var10);

            var0.field28704[var0.field28703] = Math.max(var9 - var4, 0);
            var0.field28705[var0.field28703] = var0.field28661 - var10 - var0.field28704[var0.field28703];
            if (var0.field28704[var0.field28703] <= 0) {
               var3 = var0.field28662;
            } else {
               var4 = var9;
               var3 = var9;
               var0.field28703++;
            }

            if (var0.field28670[var6] - var9 < 3) {
               var6 = var0.field28664;
            }
         } while (var9 != var0.field28662 + var0.field28663);

         if (var0.field28704[var0.field28703 - 1] < 3 && var0.field28703 > 1) {
            var0.field28703--;
         }

         var0.field28703 = Math.min(var0.field28703, 5);
      }
   }
}
