package remapped;

public class class_1933 implements class_4086 {
   private static String[] field_9880;
   private int field_9882;
   private int[] field_9883 = new int[3];
   private int[] field_9879 = new int[5];
   private float[][] field_9878;
   private float[][][] field_9881;
   private float[][][] field_9877;

   public class_1933(int var1) {
      this.field_9879[0] = 12;
      this.field_9879[1] = 8;
      this.field_9879[2] = 4;
      this.field_9879[3] = 4;
      this.field_9879[4] = 4;
      this.field_9883[0] = 8;
      this.field_9883[1] = 2;
      this.field_9883[2] = 2;
      this.field_9882 = var1;
      this.field_9878 = new float[this.field_9882 + 12][2];
      this.field_9881 = new float[5][2][2];
      this.field_9877 = new float[this.field_9882][12][2];
   }

   public void method_8973(float[][][] var1, float[][][] var2, boolean var3, int var4) {
      int var7 = 0;
      int var8 = var3 ? 5 : 3;
      int[] var9 = var3 ? this.field_9879 : this.field_9883;

      for (int var10 = 0; var10 < var8; var10++) {
         for (int var11 = 0; var11 < 12; var11++) {
            this.field_9878[var11][0] = this.field_9881[var10][var11][0];
            this.field_9878[var11][1] = this.field_9881[var10][var11][1];
         }

         for (int var12 = 0; var12 < this.field_9882; var12++) {
            this.field_9878[12 + var12][0] = var1[var12 + 6][var10][0];
            this.field_9878[12 + var12][0] = var1[var12 + 6][var10][0];
         }

         for (int var14 = 0; var14 < 12; var14++) {
            this.field_9881[var10][var14][0] = this.field_9878[this.field_9882 + var14][0];
            this.field_9881[var10][var14][1] = this.field_9878[this.field_9882 + var14][1];
         }

         switch (var9[var10]) {
            case 2:
               method_8978(this.field_9882, field_19893, this.field_9878, this.field_9877);
               break;
            case 4:
               method_8974(this.field_9882, field_19900, this.field_9878, this.field_9877);
               break;
            case 8:
               this.method_8972(this.field_9882, var3 ? field_19891 : field_19903, this.field_9878, this.field_9877);
               break;
            case 12:
               this.method_8977(this.field_9882, field_19886, this.field_9878, this.field_9877);
         }

         for (int var15 = 0; var15 < this.field_9882; var15++) {
            for (int var13 = 0; var13 < var9[var10]; var13++) {
               var2[var15][var7 + var13][0] = this.field_9877[var15][var13][0];
               var2[var15][var7 + var13][1] = this.field_9877[var15][var13][1];
            }
         }

         var7 += var9[var10];
      }

      if (!var3) {
         for (int var16 = 0; var16 < var4; var16++) {
            var2[var16][3][0] = var2[var16][3][0] + var2[var16][4][0];
            var2[var16][3][1] = var2[var16][3][1] + var2[var16][4][1];
            var2[var16][4][0] = 0.0F;
            var2[var16][4][1] = 0.0F;
            var2[var16][2][0] = var2[var16][2][0] + var2[var16][5][0];
            var2[var16][2][1] = var2[var16][2][1] + var2[var16][5][1];
            var2[var16][5][0] = 0.0F;
            var2[var16][5][1] = 0.0F;
         }
      }
   }

   public static void method_8978(int var0, float[] var1, float[][] var2, float[][][] var3) {
      for (int var6 = 0; var6 < var0; var6++) {
         float var7 = var1[0] * (var2[0 + var6][0] + var2[12 + var6][0]);
         float var8 = var1[1] * (var2[1 + var6][0] + var2[11 + var6][0]);
         float var9 = var1[2] * (var2[2 + var6][0] + var2[10 + var6][0]);
         float var10 = var1[3] * (var2[3 + var6][0] + var2[9 + var6][0]);
         float var11 = var1[4] * (var2[4 + var6][0] + var2[8 + var6][0]);
         float var12 = var1[5] * (var2[5 + var6][0] + var2[7 + var6][0]);
         float var13 = var1[6] * var2[6 + var6][0];
         float var14 = var1[0] * (var2[0 + var6][1] + var2[12 + var6][1]);
         float var15 = var1[1] * (var2[1 + var6][1] + var2[11 + var6][1]);
         float var16 = var1[2] * (var2[2 + var6][1] + var2[10 + var6][1]);
         float var17 = var1[3] * (var2[3 + var6][1] + var2[9 + var6][1]);
         float var18 = var1[4] * (var2[4 + var6][1] + var2[8 + var6][1]);
         float var19 = var1[5] * (var2[5 + var6][1] + var2[7 + var6][1]);
         float var20 = var1[6] * var2[6 + var6][1];
         var3[var6][0][0] = var7 + var8 + var9 + var10 + var11 + var12 + var13;
         var3[var6][0][1] = var14 + var15 + var16 + var17 + var18 + var19 + var20;
         var3[var6][1][0] = var7 - var8 + var9 - var10 + var11 - var12 + var13;
         var3[var6][1][1] = var14 - var15 + var16 - var17 + var18 - var19 + var20;
      }
   }

   public static void method_8974(int var0, float[] var1, float[][] var2, float[][][] var3) {
      float[] var6 = new float[2];
      float[] var7 = new float[2];
      float[] var8 = new float[2];
      float[] var9 = new float[2];

      for (int var10 = 0; var10 < var0; var10++) {
         var6[0] = -(var1[2] * (var2[var10 + 2][0] + var2[var10 + 10][0])) + var1[6] * var2[var10 + 6][0];
         var6[1] = -0.70710677F
            * (
               var1[1] * (var2[var10 + 1][0] + var2[var10 + 11][0])
                  + var1[3] * (var2[var10 + 3][0] + var2[var10 + 9][0])
                  - var1[5] * (var2[var10 + 5][0] + var2[var10 + 7][0])
            );
         var8[0] = var1[0] * (var2[var10 + 0][1] - var2[var10 + 12][1]) - var1[4] * (var2[var10 + 4][1] - var2[var10 + 8][1]);
         var8[1] = 0.70710677F
            * (
               var1[1] * (var2[var10 + 1][1] - var2[var10 + 11][1])
                  - var1[3] * (var2[var10 + 3][1] - var2[var10 + 9][1])
                  - var1[5] * (var2[var10 + 5][1] - var2[var10 + 7][1])
            );
         var7[0] = var1[0] * (var2[var10 + 0][0] - var2[var10 + 12][0]) - var1[4] * (var2[var10 + 4][0] - var2[var10 + 8][0]);
         var7[1] = 0.70710677F
            * (
               var1[1] * (var2[var10 + 1][0] - var2[var10 + 11][0])
                  - var1[3] * (var2[var10 + 3][0] - var2[var10 + 9][0])
                  - var1[5] * (var2[var10 + 5][0] - var2[var10 + 7][0])
            );
         var9[0] = -(var1[2] * (var2[var10 + 2][1] + var2[var10 + 10][1])) + var1[6] * var2[var10 + 6][1];
         var9[1] = -0.70710677F
            * (
               var1[1] * (var2[var10 + 1][1] + var2[var10 + 11][1])
                  + var1[3] * (var2[var10 + 3][1] + var2[var10 + 9][1])
                  - var1[5] * (var2[var10 + 5][1] + var2[var10 + 7][1])
            );
         var3[var10][0][0] = var6[0] + var6[1] + var8[0] + var8[1];
         var3[var10][0][1] = -var7[0] - var7[1] + var9[0] + var9[1];
         var3[var10][1][0] = var6[0] - var6[1] - var8[0] + var8[1];
         var3[var10][1][1] = var7[0] - var7[1] + var9[0] - var9[1];
         var3[var10][2][0] = var6[0] - var6[1] + var8[0] - var8[1];
         var3[var10][2][1] = -var7[0] + var7[1] + var9[0] - var9[1];
         var3[var10][3][0] = var6[0] + var6[1] - var8[0] - var8[1];
         var3[var10][3][1] = var7[0] + var7[1] + var9[0] + var9[1];
      }
   }

   public static void method_8979(float[] var0, float[] var1) {
      float var4 = var1[2] * 0.70710677F;
      float var5 = var1[0] - var4;
      float var6 = var1[0] + var4;
      float var7 = var1[1] + var1[3];
      float var8 = var1[1] * 1.306563F;
      float var9 = var7 * -0.9238795F;
      float var10 = var1[3] * -0.5411961F;
      float var11 = var8 + var9;
      float var12 = var10 - var9;
      var0[3] = var6 - var12;
      var0[0] = var6 + var12;
      var0[2] = var5 - var11;
      var0[1] = var5 + var11;
   }

   public void method_8972(int var1, float[] var2, float[][] var3, float[][][] var4) {
      float[] var7 = new float[4];
      float[] var8 = new float[4];
      float[] var9 = new float[4];
      float[] var10 = new float[4];
      float[] var11 = new float[4];

      for (int var12 = 0; var12 < var1; var12++) {
         var7[0] = var2[6] * var3[6 + var12][0];
         var7[1] = var2[5] * (var3[5 + var12][0] + var3[7 + var12][0]);
         var7[2] = -(var2[0] * (var3[0 + var12][0] + var3[12 + var12][0])) + var2[4] * (var3[4 + var12][0] + var3[8 + var12][0]);
         var7[3] = -(var2[1] * (var3[1 + var12][0] + var3[11 + var12][0])) + var2[3] * (var3[3 + var12][0] + var3[9 + var12][0]);
         var9[0] = var2[5] * (var3[7 + var12][1] - var3[5 + var12][1]);
         var9[1] = var2[0] * (var3[12 + var12][1] - var3[0 + var12][1]) + var2[4] * (var3[8 + var12][1] - var3[4 + var12][1]);
         var9[2] = var2[1] * (var3[11 + var12][1] - var3[1 + var12][1]) + var2[3] * (var3[9 + var12][1] - var3[3 + var12][1]);
         var9[3] = var2[2] * (var3[10 + var12][1] - var3[2 + var12][1]);

         for (int var13 = 0; var13 < 4; var13++) {
            var11[var13] = var7[var13] - var9[3 - var13];
         }

         method_8979(var11, var11);
         var4[var12][7][0] = var11[0];
         var4[var12][5][0] = var11[2];
         var4[var12][3][0] = var11[3];
         var4[var12][1][0] = var11[1];

         for (int var14 = 0; var14 < 4; var14++) {
            var11[var14] = var7[var14] + var9[3 - var14];
         }

         method_8979(var11, var11);
         var4[var12][6][0] = var11[1];
         var4[var12][4][0] = var11[3];
         var4[var12][2][0] = var11[2];
         var4[var12][0][0] = var11[0];
         var10[0] = var2[6] * var3[6 + var12][1];
         var10[1] = var2[5] * (var3[5 + var12][1] + var3[7 + var12][1]);
         var10[2] = -(var2[0] * (var3[0 + var12][1] + var3[12 + var12][1])) + var2[4] * (var3[4 + var12][1] + var3[8 + var12][1]);
         var10[3] = -(var2[1] * (var3[1 + var12][1] + var3[11 + var12][1])) + var2[3] * (var3[3 + var12][1] + var3[9 + var12][1]);
         var8[0] = var2[5] * (var3[7 + var12][0] - var3[5 + var12][0]);
         var8[1] = var2[0] * (var3[12 + var12][0] - var3[0 + var12][0]) + var2[4] * (var3[8 + var12][0] - var3[4 + var12][0]);
         var8[2] = var2[1] * (var3[11 + var12][0] - var3[1 + var12][0]) + var2[3] * (var3[9 + var12][0] - var3[3 + var12][0]);
         var8[3] = var2[2] * (var3[10 + var12][0] - var3[2 + var12][0]);

         for (int var15 = 0; var15 < 4; var15++) {
            var11[var15] = var10[var15] + var8[3 - var15];
         }

         method_8979(var11, var11);
         var4[var12][7][1] = var11[0];
         var4[var12][5][1] = var11[2];
         var4[var12][3][1] = var11[3];
         var4[var12][1][1] = var11[1];

         for (int var16 = 0; var16 < 4; var16++) {
            var11[var16] = var10[var16] - var8[3 - var16];
         }

         method_8979(var11, var11);
         var4[var12][6][1] = var11[1];
         var4[var12][4][1] = var11[3];
         var4[var12][2][1] = var11[2];
         var4[var12][0][1] = var11[0];
      }
   }

   public void method_8980(float[] var1, float[] var2) {
      float var5 = var2[3] * 0.70710677F;
      float var6 = var2[0] + var5;
      float var7 = var2[0] - var5;
      float var8 = (var2[1] - var2[5]) * 0.70710677F;
      float var9 = var2[2] * 0.8660254F + var2[4] * 0.5F;
      float var10 = var9 - var2[4];
      float var11 = var2[1] * 0.9659258F + var2[5] * 0.25881904F;
      float var12 = var11 - var8;
      var1[0] = var6 + var11 + var9;
      var1[1] = var7 + var8 - var2[4];
      var1[2] = var12 + var7 - var10;
      var1[3] = var6 - var12 - var10;
      var1[4] = var6 - var8 - var2[4];
      var1[5] = var7 - var11 + var9;
   }

   public void method_8977(int var1, float[] var2, float[][] var3, float[][][] var4) {
      float[] var7 = new float[6];
      float[] var8 = new float[6];
      float[] var9 = new float[6];
      float[] var10 = new float[6];
      float[] var11 = new float[6];
      float[] var12 = new float[6];
      float[] var13 = new float[6];
      float[] var14 = new float[6];

      for (int var15 = 0; var15 < var1; var15++) {
         for (int var16 = 0; var16 < 6; var16++) {
            if (var16 != 0) {
               var7[6 - var16] = (var3[var16 + var15][0] + var3[12 - var16 + var15][0]) * var2[var16];
               var8[6 - var16] = (var3[var16 + var15][1] + var3[12 - var16 + var15][1]) * var2[var16];
            } else {
               var7[0] = var3[6 + var15][0] * var2[6];
               var8[0] = var3[6 + var15][1] * var2[6];
            }

            var10[var16] = (var3[var16 + var15][0] - var3[12 - var16 + var15][0]) * var2[var16];
            var9[var16] = (var3[var16 + var15][1] - var3[12 - var16 + var15][1]) * var2[var16];
         }

         this.method_8980(var11, var7);
         this.method_8980(var12, var8);
         this.method_8980(var13, var9);
         this.method_8980(var14, var10);

         for (byte var17 = 0; var17 < 6; var17 += 2) {
            var4[var15][var17][0] = var11[var17] - var13[var17];
            var4[var15][var17][1] = var12[var17] + var14[var17];
            var4[var15][var17 + 1][0] = var11[var17 + 1] + var13[var17 + 1];
            var4[var15][var17 + 1][1] = var12[var17 + 1] - var14[var17 + 1];
            var4[var15][10 - var17][0] = var11[var17 + 1] - var13[var17 + 1];
            var4[var15][10 - var17][1] = var12[var17 + 1] + var14[var17 + 1];
            var4[var15][11 - var17][0] = var11[var17] + var13[var17];
            var4[var15][11 - var17][1] = var12[var17] - var14[var17];
         }
      }
   }

   public void method_8975(float[][][] var1, float[][][] var2, boolean var3, int var4) {
      int var7 = 0;
      int var8 = !var3 ? 3 : 5;
      int[] var9 = !var3 ? this.field_9883 : this.field_9879;

      for (int var10 = 0; var10 < var8; var10++) {
         for (int var11 = 0; var11 < this.field_9882; var11++) {
            var1[var11][var10][0] = 0.0F;
            var1[var11][var10][1] = 0.0F;

            for (int var12 = 0; var12 < var9[var10]; var12++) {
               var1[var11][var10][0] = var1[var11][var10][0] + var2[var11][var7 + var12][0];
               var1[var11][var10][1] = var1[var11][var10][1] + var2[var11][var7 + var12][1];
            }
         }

         var7 += var9[var10];
      }
   }
}
