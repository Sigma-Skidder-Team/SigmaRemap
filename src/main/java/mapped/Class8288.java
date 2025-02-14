package mapped;

import java.util.Arrays;


public class Class8288 implements Class8289 {
   private static String[] field35596;
   private final int field35597;
   private final int field35598;
   private final int field35599;
   private final Class8290 field35600;
   private final Class8293 field35601;
   private final float[] field35602;
   private final float[] field35603;
   private final float[][] field35604;
   private final float[][] field35605;
   private int field35606;
   private int[][][] field35607;
   private int[][][] field35608;
   private int[][][] field35609;
   private int[][][] field35610;

   public Class8288(int var1) {
      this.field35597 = var1;
      this.field35598 = var1 / 4;
      this.field35599 = this.field35598 / 8;
      this.field35600 = new Class8290(var1);
      this.field35601 = new Class8293();
      this.field35608 = new int[0][][];
      this.field35610 = new int[0][][];
      this.field35602 = new float[var1 / 2];
      this.field35604 = new float[4][this.field35598];
      this.field35603 = new float[this.field35598 * 2];
      this.field35605 = new float[4][this.field35598 * 2];
   }

   public void method28976(Class9189 var1, Class1973 var2) throws Class2460 {
      this.field35606 = var1.method34397(2) + 1;
      int var5 = 0;
      int var6;
      int var7;
      switch (Class9403.field43626[var2.ordinal()]) {
         case 1:
            var6 = 1;
            var7 = 5;
            var5 = 5;
            break;
         case 2:
            var6 = 8;
            var7 = 2;
            var5 = 2;
            break;
         case 3:
            var6 = 2;
            var7 = 4;
            var5 = 2;
            break;
         case 4:
            var6 = 2;
            var7 = 4;
            var5 = 5;
            break;
         default:
            return;
      }

      this.field35607 = new int[this.field35606][var6][];
      this.field35609 = new int[this.field35606][var6][];

      for (int var8 = 1; var8 < this.field35606; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            int var10 = var1.method34397(3);
            this.field35607[var8][var9] = new int[var10];
            this.field35609[var8][var9] = new int[var10];

            for (int var11 = 0; var11 < var10; var11++) {
               this.field35607[var8][var9][var11] = var1.method34397(4);
               int var12 = var9 == 0 ? var7 : var5;
               this.field35609[var8][var9][var11] = var1.method34397(var12);
            }
         }
      }
   }

   public void method28977(float[] var1, int var2, int var3, Class1973 var4) throws Class2460 {
      this.field35600.method28983(var1, this.field35602, var2, var3, var4);

      for (int var7 = 0; var7 < 4; var7++) {
         this.method28978(this.field35602, this.field35604, var4, var7);
      }

      this.field35601.method28986(this.field35604, this.field35597, this.field35606, var1);
   }

   private void method28978(float[] var1, float[][] var2, Class1973 var3, int var4) {
      if (!var3.equals(Class1973.field12845)) {
         this.method28979(this.field35598 * 2, var4, var3, 0);

         for (int var7 = 0; var7 < this.field35598 * 2; var7++) {
            var1[var4 * this.field35598 * 2 + var7] = var1[var4 * this.field35598 * 2 + var7] * this.field35603[var7];
         }

         for (int var11 = 0; var11 < this.field35598; var11++) {
            var2[var4][var11] = this.field35605[var4][var11] + var1[var4 * this.field35598 * 2 + var11];
         }

         for (int var12 = 0; var12 < this.field35598; var12++) {
            this.field35605[var4][var12] = var1[var4 * this.field35598 * 2 + this.field35598 + var12];
         }

         int var9 = !var3.equals(Class1973.field12843) ? 0 : 1;
         this.field35610[var4][0] = Arrays.copyOf(this.field35609[var4][var9], this.field35609[var4][var9].length);
         this.field35608[var4][0] = Arrays.copyOf(this.field35607[var4][var9], this.field35607[var4][var9].length);
      } else {
         for (int var8 = 0; var8 < 8; var8++) {
            this.method28979(this.field35599 * 2, var4, var3, var8);

            for (int var13 = 0; var13 < this.field35599 * 2; var13++) {
               int var16 = var4 * this.field35598 * 2 + var8 * this.field35599 * 2 + var13;
               var1[var16] *= this.field35603[var13];
            }

            for (int var14 = 0; var14 < this.field35599; var14++) {
               int var17 = var14 + this.field35598 * 7 / 16 + this.field35599 * var8;
               int var10 = var4 * this.field35598 * 2 + var8 * this.field35599 * 2 + var14;
               this.field35605[var4][var17] = this.field35605[var4][var17] + var1[var10];
            }

            for (int var15 = 0; var15 < this.field35599; var15++) {
               int var18 = var15 + this.field35598 * 7 / 16 + this.field35599 * (var8 + 1);
               int var19 = var4 * this.field35598 * 2 + var8 * this.field35599 * 2 + this.field35599 + var15;
               this.field35605[var4][var18] = var1[var19];
            }

            this.field35610[var4][0] = Arrays.copyOf(this.field35609[var4][var8], this.field35609[var4][var8].length);
            this.field35608[var4][0] = Arrays.copyOf(this.field35607[var4][var8], this.field35607[var4][var8].length);
         }

         System.arraycopy(this.field35605[var4], 0, var2[var4], 0, this.field35598);
         System.arraycopy(this.field35605[var4], this.field35598, this.field35605[var4], 0, this.field35598);
      }
   }

   private void method28979(int var1, int var2, Class1973 var3, int var4) {
      int[] var7 = new int[10];
      float[] var8 = new float[10];
      float[] var9 = new float[var1];
      float[] var10 = new float[var1 / 2];
      float[] var11 = new float[var1 / 2];
      float[] var12 = new float[var1 / 2];
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      switch (Class9403.field43626[var3.ordinal()]) {
         case 1:
         case 2:
            var13 = var14 = var1 / 2;
            var15 = 0;
            break;
         case 3:
            var13 = var1 / 2;
            var14 = var1 * 7 / 32;
            var15 = var1 / 16;
            break;
         case 4:
            var13 = var1 / 16;
            var14 = var1 * 7 / 32;
            var15 = var1 / 2;
      }

      this.method28980(var2, 0, true, var13, var1, var7, var8, var10);
      int var16 = var3.equals(Class1973.field12845) ? var4 : 0;
      float var17 = this.method28980(var2, var16, false, var14, var1, var7, var8, var11);
      if (var3.equals(Class1973.field12844) || var3.equals(Class1973.field12846)) {
         this.method28980(var2, 1, false, var15, var1, var7, var8, var12);
      }

      int var18 = 0;
      if (var3.equals(Class1973.field12846)) {
         var18 = var1 / 2 - var13 - var14;

         for (int var19 = 0; var19 < var18; var19++) {
            var9[var19] = 1.0F;
         }
      }

      if (var3.equals(Class1973.field12843) || var3.equals(Class1973.field12845)) {
         var8[0] = 1.0F;
      }

      for (int var21 = 0; var21 < var13; var21++) {
         var9[var21 + var18] = var8[0] * var17 * var10[var21];
      }

      for (int var22 = 0; var22 < var14; var22++) {
         var9[var22 + var18 + var13] = var8[0] * var11[var22];
      }

      if (var3.equals(Class1973.field12844)) {
         for (int var23 = 0; var23 < var15; var23++) {
            var9[var23 + var13 + var14] = var12[var23];
         }

         var18 = var1 / 2 - var14 - var15;

         for (int var24 = 0; var24 < var18; var24++) {
            var9[var24 + var13 + var14 + var15] = 1.0F;
         }
      } else if (var3.equals(Class1973.field12846)) {
         for (int var25 = 0; var25 < var15; var25++) {
            var9[var25 + var18 + var13 + var14] = var12[var25];
         }
      }

      for (int var26 = 0; var26 < var1; var26++) {
         this.field35603[var26] = 1.0F / var9[var26];
      }
   }

   private float method28980(int var1, int var2, boolean var3, int var4, int var5, int[] var6, float[] var7, float[] var8) {
      int[] var11 = new int[var5 / 2];
      int[] var12 = !var3 ? this.field35609[var1][var2] : this.field35610[var1][var2];
      int[] var13 = !var3 ? this.field35607[var1][var2] : this.field35608[var1][var2];
      int var14 = var12.length;

      for (int var15 = 0; var15 < var14; var15++) {
         var6[var15 + 1] = 8 * var12[var15];
         int var16 = this.method28981(var13[var15]);
         if (var16 >= 0) {
            var7[var15 + 1] = (float)Math.pow(2.0, (double)var16);
         } else {
            var7[var15 + 1] = 1.0F / (float)Math.pow(2.0, (double)(-var16));
         }
      }

      var6[0] = 0;
      if (var14 != 0) {
         var7[0] = var7[1];
      } else {
         var7[0] = 1.0F;
      }

      float var17 = var7[0];
      var6[var14 + 1] = var4;
      var7[var14 + 1] = 1.0F;

      for (int var19 = 0; var19 < var4; var19++) {
         var11[var19] = 0;

         for (int var18 = 0; var18 <= var14 + 1; var18++) {
            if (var6[var18] <= var19) {
               var11[var19] = var18;
            }
         }
      }

      for (int var20 = 0; var20 < var4; var20++) {
         if (var20 >= var6[var11[var20]] && var20 <= var6[var11[var20]] + 7) {
            var8[var20] = this.method28982(var7[var11[var20]], var7[var11[var20] + 1], var20 - var6[var11[var20]]);
         } else {
            var8[var20] = var7[var11[var20] + 1];
         }
      }

      return var17;
   }

   private int method28981(int var1) {
      for (int var4 = 0; var4 < 16; var4++) {
         if (var1 == field35616[var4]) {
            return var4;
         }
      }

      return 0;
   }

   private float method28982(float var1, float var2, int var3) {
      float var6 = (float)(Math.log((double)var1) / Math.log(2.0));
      float var7 = (float)(Math.log((double)var2) / Math.log(2.0));
      return (float)Math.pow(2.0, (double)(((float)(8 - var3) * var6 + (float)var3 * var7) / 8.0F));
   }
}
