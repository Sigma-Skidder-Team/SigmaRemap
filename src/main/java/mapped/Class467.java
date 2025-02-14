package mapped;

public class Class467 implements Runnable {
   private static String[] field2164;
   public final int field2165;
   public final int field2166;
   public final int field2167;
   public final int field2168;
   public final int field2169;
   public final float[][][] field2170;
   public final boolean field2171;
   public final Class8026 field2172;

   public Class467(Class8026 var1, int var2, int var3, int var4, int var5, int var6, float[][][] var7, boolean var8) {
      this.field2172 = var1;
      this.field2165 = var2;
      this.field2166 = var3;
      this.field2167 = var4;
      this.field2168 = var5;
      this.field2169 = var6;
      this.field2170 = var7;
      this.field2171 = var8;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field2165];
      if (this.field2166 != -1) {
         for (int var4 = this.field2167; var4 < Class8026.method27518(this.field2172); var4 += this.field2168) {
            if (this.field2169 == 0) {
               for (int var5 = 0; var5 < Class8026.method27513(this.field2172); var5++) {
                  Class8026.method27515(this.field2172).method30933(this.field2170[var4][var5], this.field2171);
               }
            }

            if (Class8026.method27516(this.field2172) <= 4) {
               if (Class8026.method27516(this.field2172) != 4) {
                  if (Class8026.method27516(this.field2172) == 2) {
                     for (int var15 = 0; var15 < Class8026.method27513(this.field2172); var15++) {
                        int var31 = 2 * var15;
                        var3[var31] = this.field2170[var4][var15][0];
                        var3[var31 + 1] = this.field2170[var4][var15][1];
                     }

                     Class8026.method27517(this.field2172).method30935(var3, 0, this.field2171);

                     for (int var16 = 0; var16 < Class8026.method27513(this.field2172); var16++) {
                        int var32 = 2 * var16;
                        this.field2170[var4][var16][0] = var3[var32];
                        this.field2170[var4][var16][1] = var3[var32 + 1];
                     }
                  }
               } else {
                  for (int var13 = 0; var13 < Class8026.method27513(this.field2172); var13++) {
                     int var29 = 2 * var13;
                     int var40 = 2 * Class8026.method27513(this.field2172) + 2 * var13;
                     var3[var29] = this.field2170[var4][var13][0];
                     var3[var29 + 1] = this.field2170[var4][var13][1];
                     var3[var40] = this.field2170[var4][var13][2];
                     var3[var40 + 1] = this.field2170[var4][var13][3];
                  }

                  Class8026.method27517(this.field2172).method30935(var3, 0, this.field2171);
                  Class8026.method27517(this.field2172).method30935(var3, 2 * Class8026.method27513(this.field2172), this.field2171);

                  for (int var14 = 0; var14 < Class8026.method27513(this.field2172); var14++) {
                     int var30 = 2 * var14;
                     int var41 = 2 * Class8026.method27513(this.field2172) + 2 * var14;
                     this.field2170[var4][var14][0] = var3[var30];
                     this.field2170[var4][var14][1] = var3[var30 + 1];
                     this.field2170[var4][var14][2] = var3[var41];
                     this.field2170[var4][var14][3] = var3[var41 + 1];
                  }
               }
            } else {
               for (int var12 = 0; var12 < Class8026.method27516(this.field2172); var12 += 8) {
                  for (int var6 = 0; var6 < Class8026.method27513(this.field2172); var6++) {
                     int var7 = 2 * var6;
                     int var8 = 2 * Class8026.method27513(this.field2172) + 2 * var6;
                     int var9 = var8 + 2 * Class8026.method27513(this.field2172);
                     int var10 = var9 + 2 * Class8026.method27513(this.field2172);
                     var3[var7] = this.field2170[var4][var6][var12];
                     var3[var7 + 1] = this.field2170[var4][var6][var12 + 1];
                     var3[var8] = this.field2170[var4][var6][var12 + 2];
                     var3[var8 + 1] = this.field2170[var4][var6][var12 + 3];
                     var3[var9] = this.field2170[var4][var6][var12 + 4];
                     var3[var9 + 1] = this.field2170[var4][var6][var12 + 5];
                     var3[var10] = this.field2170[var4][var6][var12 + 6];
                     var3[var10 + 1] = this.field2170[var4][var6][var12 + 7];
                  }

                  Class8026.method27517(this.field2172).method30935(var3, 0, this.field2171);
                  Class8026.method27517(this.field2172).method30935(var3, 2 * Class8026.method27513(this.field2172), this.field2171);
                  Class8026.method27517(this.field2172).method30935(var3, 4 * Class8026.method27513(this.field2172), this.field2171);
                  Class8026.method27517(this.field2172).method30935(var3, 6 * Class8026.method27513(this.field2172), this.field2171);

                  for (int var25 = 0; var25 < Class8026.method27513(this.field2172); var25++) {
                     int var28 = 2 * var25;
                     int var39 = 2 * Class8026.method27513(this.field2172) + 2 * var25;
                     int var46 = var39 + 2 * Class8026.method27513(this.field2172);
                     int var49 = var46 + 2 * Class8026.method27513(this.field2172);
                     this.field2170[var4][var25][var12] = var3[var28];
                     this.field2170[var4][var25][var12 + 1] = var3[var28 + 1];
                     this.field2170[var4][var25][var12 + 2] = var3[var39];
                     this.field2170[var4][var25][var12 + 3] = var3[var39 + 1];
                     this.field2170[var4][var25][var12 + 4] = var3[var46];
                     this.field2170[var4][var25][var12 + 5] = var3[var46 + 1];
                     this.field2170[var4][var25][var12 + 6] = var3[var49];
                     this.field2170[var4][var25][var12 + 7] = var3[var49 + 1];
                  }
               }
            }

            if (this.field2169 != 0) {
               for (int var17 = 0; var17 < Class8026.method27513(this.field2172); var17++) {
                  Class8026.method27515(this.field2172).method30945(this.field2170[var4][var17], this.field2171);
               }
            }
         }
      } else {
         for (int var11 = this.field2167; var11 < Class8026.method27518(this.field2172); var11 += this.field2168) {
            if (this.field2169 != 0) {
               for (int var19 = 0; var19 < Class8026.method27513(this.field2172); var19++) {
                  Class8026.method27515(this.field2172).method30939(this.field2170[var11][var19], 0);
               }
            } else {
               for (int var18 = 0; var18 < Class8026.method27513(this.field2172); var18++) {
                  Class8026.method27515(this.field2172).method30929(this.field2170[var11][var18]);
               }
            }

            if (Class8026.method27516(this.field2172) <= 4) {
               if (Class8026.method27516(this.field2172) != 4) {
                  if (Class8026.method27516(this.field2172) == 2) {
                     for (int var23 = 0; var23 < Class8026.method27513(this.field2172); var23++) {
                        int var37 = 2 * var23;
                        var3[var37] = this.field2170[var11][var23][0];
                        var3[var37 + 1] = this.field2170[var11][var23][1];
                     }

                     Class8026.method27517(this.field2172).method30931(var3, 0);

                     for (int var24 = 0; var24 < Class8026.method27513(this.field2172); var24++) {
                        int var38 = 2 * var24;
                        this.field2170[var11][var24][0] = var3[var38];
                        this.field2170[var11][var24][1] = var3[var38 + 1];
                     }
                  }
               } else {
                  for (int var21 = 0; var21 < Class8026.method27513(this.field2172); var21++) {
                     int var35 = 2 * var21;
                     int var44 = 2 * Class8026.method27513(this.field2172) + 2 * var21;
                     var3[var35] = this.field2170[var11][var21][0];
                     var3[var35 + 1] = this.field2170[var11][var21][1];
                     var3[var44] = this.field2170[var11][var21][2];
                     var3[var44 + 1] = this.field2170[var11][var21][3];
                  }

                  Class8026.method27517(this.field2172).method30931(var3, 0);
                  Class8026.method27517(this.field2172).method30931(var3, 2 * Class8026.method27513(this.field2172));

                  for (int var22 = 0; var22 < Class8026.method27513(this.field2172); var22++) {
                     int var36 = 2 * var22;
                     int var45 = 2 * Class8026.method27513(this.field2172) + 2 * var22;
                     this.field2170[var11][var22][0] = var3[var36];
                     this.field2170[var11][var22][1] = var3[var36 + 1];
                     this.field2170[var11][var22][2] = var3[var45];
                     this.field2170[var11][var22][3] = var3[var45 + 1];
                  }
               }
            } else {
               for (int var20 = 0; var20 < Class8026.method27516(this.field2172); var20 += 8) {
                  for (int var26 = 0; var26 < Class8026.method27513(this.field2172); var26++) {
                     int var33 = 2 * var26;
                     int var42 = 2 * Class8026.method27513(this.field2172) + 2 * var26;
                     int var47 = var42 + 2 * Class8026.method27513(this.field2172);
                     int var50 = var47 + 2 * Class8026.method27513(this.field2172);
                     var3[var33] = this.field2170[var11][var26][var20];
                     var3[var33 + 1] = this.field2170[var11][var26][var20 + 1];
                     var3[var42] = this.field2170[var11][var26][var20 + 2];
                     var3[var42 + 1] = this.field2170[var11][var26][var20 + 3];
                     var3[var47] = this.field2170[var11][var26][var20 + 4];
                     var3[var47 + 1] = this.field2170[var11][var26][var20 + 5];
                     var3[var50] = this.field2170[var11][var26][var20 + 6];
                     var3[var50 + 1] = this.field2170[var11][var26][var20 + 7];
                  }

                  Class8026.method27517(this.field2172).method30931(var3, 0);
                  Class8026.method27517(this.field2172).method30931(var3, 2 * Class8026.method27513(this.field2172));
                  Class8026.method27517(this.field2172).method30931(var3, 4 * Class8026.method27513(this.field2172));
                  Class8026.method27517(this.field2172).method30931(var3, 6 * Class8026.method27513(this.field2172));

                  for (int var27 = 0; var27 < Class8026.method27513(this.field2172); var27++) {
                     int var34 = 2 * var27;
                     int var43 = 2 * Class8026.method27513(this.field2172) + 2 * var27;
                     int var48 = var43 + 2 * Class8026.method27513(this.field2172);
                     int var51 = var48 + 2 * Class8026.method27513(this.field2172);
                     this.field2170[var11][var27][var20] = var3[var34];
                     this.field2170[var11][var27][var20 + 1] = var3[var34 + 1];
                     this.field2170[var11][var27][var20 + 2] = var3[var43];
                     this.field2170[var11][var27][var20 + 3] = var3[var43 + 1];
                     this.field2170[var11][var27][var20 + 4] = var3[var48];
                     this.field2170[var11][var27][var20 + 5] = var3[var48 + 1];
                     this.field2170[var11][var27][var20 + 6] = var3[var51];
                     this.field2170[var11][var27][var20 + 7] = var3[var51 + 1];
                  }
               }
            }
         }
      }
   }
}
