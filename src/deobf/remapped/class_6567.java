package remapped;

import java.util.Random;

public class class_6567 {
   private static String[] field_33499;
   public static final int[][] field_33494 = new int[][]{
      {1, 1, 0},
      {-1, 1, 0},
      {1, -1, 0},
      {-1, -1, 0},
      {1, 0, 1},
      {-1, 0, 1},
      {1, 0, -1},
      {-1, 0, -1},
      {0, 1, 1},
      {0, -1, 1},
      {0, 1, -1},
      {0, -1, -1},
      {1, 1, 0},
      {0, -1, 1},
      {-1, 1, 0},
      {0, -1, -1}
   };
   private static final double field_33496 = Math.sqrt(3.0);
   private static final double field_33493 = 0.5 * (field_33496 - 1.0);
   private static final double field_33500 = (3.0 - field_33496) / 6.0;
   private final int[] field_33501 = new int[512];
   public final double field_33495;
   public final double field_33497;
   public final double field_33498;

   public class_6567(Random var1) {
      this.field_33495 = var1.nextDouble() * 256.0;
      this.field_33497 = var1.nextDouble() * 256.0;
      this.field_33498 = var1.nextDouble() * 256.0;
      int var4 = 0;

      while (var4 < 256) {
         this.field_33501[var4] = var4++;
      }

      for (int var7 = 0; var7 < 256; var7++) {
         int var5 = var1.nextInt(256 - var7);
         int var6 = this.field_33501[var7];
         this.field_33501[var7] = this.field_33501[var5 + var7];
         this.field_33501[var5 + var7] = var6;
      }
   }

   private int method_30014(int var1) {
      return this.field_33501[var1 & 0xFF];
   }

   public static double method_30009(int[] var0, double var1, double var3, double var5) {
      return (double)var0[0] * var1 + (double)var0[1] * var3 + (double)var0[2] * var5;
   }

   private double method_30010(int var1, double var2, double var4, double var6, double var8) {
      double var12 = var8 - var2 * var2 - var4 * var4 - var6 * var6;
      double var14;
      if (!(var12 < 0.0)) {
         var12 *= var12;
         var14 = var12 * var12 * method_30009(field_33494[var1], var2, var4, var6);
      } else {
         var14 = 0.0;
      }

      return var14;
   }

   public double method_30013(double var1, double var3) {
      double var7 = (var1 + var3) * field_33493;
      int var9 = MathHelper.floor(var1 + var7);
      int var10 = MathHelper.floor(var3 + var7);
      double var11 = (double)(var9 + var10) * field_33500;
      double var13 = (double)var9 - var11;
      double var15 = (double)var10 - var11;
      double var17 = var1 - var13;
      double var19 = var3 - var15;
      byte var21;
      byte var22;
      if (!(var17 > var19)) {
         var21 = 0;
         var22 = 1;
      } else {
         var21 = 1;
         var22 = 0;
      }

      double var23 = var17 - (double)var21 + field_33500;
      double var25 = var19 - (double)var22 + field_33500;
      double var27 = var17 - 1.0 + 2.0 * field_33500;
      double var29 = var19 - 1.0 + 2.0 * field_33500;
      int var31 = var9 & 0xFF;
      int var32 = var10 & 0xFF;
      int var33 = this.method_30014(var31 + this.method_30014(var32)) % 12;
      int var34 = this.method_30014(var31 + var21 + this.method_30014(var32 + var22)) % 12;
      int var35 = this.method_30014(var31 + 1 + this.method_30014(var32 + 1)) % 12;
      double var36 = this.method_30010(var33, var17, var19, 0.0, 0.5);
      double var38 = this.method_30010(var34, var23, var25, 0.0, 0.5);
      double var40 = this.method_30010(var35, var27, var29, 0.0, 0.5);
      return 70.0 * (var36 + var38 + var40);
   }

   public double method_30011(double var1, double var3, double var5) {
      double var9 = 0.3333333333333333;
      double var11 = (var1 + var3 + var5) * 0.3333333333333333;
      int var13 = MathHelper.floor(var1 + var11);
      int var14 = MathHelper.floor(var3 + var11);
      int var15 = MathHelper.floor(var5 + var11);
      double var16 = 0.16666666666666666;
      double var18 = (double)(var13 + var14 + var15) * 0.16666666666666666;
      double var20 = (double)var13 - var18;
      double var22 = (double)var14 - var18;
      double var24 = (double)var15 - var18;
      double var26 = var1 - var20;
      double var28 = var3 - var22;
      double var30 = var5 - var24;
      byte var32;
      byte var33;
      byte var34;
      byte var35;
      byte var36;
      byte var37;
      if (!(var26 >= var28)) {
         if (!(var28 < var30)) {
            if (!(var26 < var30)) {
               var32 = 0;
               var33 = 1;
               var34 = 0;
               var35 = 1;
               var36 = 1;
               var37 = 0;
            } else {
               var32 = 0;
               var33 = 1;
               var34 = 0;
               var35 = 0;
               var36 = 1;
               var37 = 1;
            }
         } else {
            var32 = 0;
            var33 = 0;
            var34 = 1;
            var35 = 0;
            var36 = 1;
            var37 = 1;
         }
      } else if (!(var28 >= var30)) {
         if (!(var26 >= var30)) {
            var32 = 0;
            var33 = 0;
            var34 = 1;
            var35 = 1;
            var36 = 0;
            var37 = 1;
         } else {
            var32 = 1;
            var33 = 0;
            var34 = 0;
            var35 = 1;
            var36 = 0;
            var37 = 1;
         }
      } else {
         var32 = 1;
         var33 = 0;
         var34 = 0;
         var35 = 1;
         var36 = 1;
         var37 = 0;
      }

      double var38 = var26 - (double)var32 + 0.16666666666666666;
      double var40 = var28 - (double)var33 + 0.16666666666666666;
      double var42 = var30 - (double)var34 + 0.16666666666666666;
      double var44 = var26 - (double)var35 + 0.3333333333333333;
      double var46 = var28 - (double)var36 + 0.3333333333333333;
      double var48 = var30 - (double)var37 + 0.3333333333333333;
      double var50 = var26 - 1.0 + 0.5;
      double var52 = var28 - 1.0 + 0.5;
      double var54 = var30 - 1.0 + 0.5;
      int var56 = var13 & 0xFF;
      int var57 = var14 & 0xFF;
      int var58 = var15 & 0xFF;
      int var59 = this.method_30014(var56 + this.method_30014(var57 + this.method_30014(var58))) % 12;
      int var60 = this.method_30014(var56 + var32 + this.method_30014(var57 + var33 + this.method_30014(var58 + var34))) % 12;
      int var61 = this.method_30014(var56 + var35 + this.method_30014(var57 + var36 + this.method_30014(var58 + var37))) % 12;
      int var62 = this.method_30014(var56 + 1 + this.method_30014(var57 + 1 + this.method_30014(var58 + 1))) % 12;
      double var63 = this.method_30010(var59, var26, var28, var30, 0.6);
      double var65 = this.method_30010(var60, var38, var40, var42, 0.6);
      double var67 = this.method_30010(var61, var44, var46, var48, 0.6);
      double var69 = this.method_30010(var62, var50, var52, var54, 0.6);
      return 32.0 * (var63 + var65 + var67 + var69);
   }
}
