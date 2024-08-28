package mapped;

public class Class1476 implements Runnable {
   private static String[] field7939;
   public final int field7940;
   public final int field7941;
   public final int field7942;
   public final int field7943;
   public final float[][][] field7944;
   public final boolean field7945;
   public final Class8026 field7946;

   public Class1476(Class8026 var1, int var2, int var3, int var4, int var5, float[][][] var6, boolean var7) {
      this.field7946 = var1;
      this.field7940 = var2;
      this.field7941 = var3;
      this.field7942 = var4;
      this.field7943 = var5;
      this.field7944 = var6;
      this.field7945 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field7940];
      if (this.field7941 != -1) {
         if (Class8026.method27516(this.field7946) <= 4) {
            if (Class8026.method27516(this.field7946) != 4) {
               if (Class8026.method27516(this.field7946) == 2) {
                  for (int var4 = this.field7942; var4 < Class8026.method27513(this.field7946); var4 += this.field7943) {
                     for (int var5 = 0; var5 < Class8026.method27518(this.field7946); var5++) {
                        int var7 = 2 * var5;
                        var3[var7] = this.field7944[var5][var4][0];
                        var3[var7 + 1] = this.field7944[var5][var4][1];
                     }

                     Class8026.method27519(this.field7946).method30935(var3, 0, this.field7945);

                     for (int var16 = 0; var16 < Class8026.method27518(this.field7946); var16++) {
                        int var28 = 2 * var16;
                        this.field7944[var16][var4][0] = var3[var28];
                        this.field7944[var16][var4][1] = var3[var28 + 1];
                     }
                  }
               }
            } else {
               for (int var11 = this.field7942; var11 < Class8026.method27513(this.field7946); var11 += this.field7943) {
                  for (int var17 = 0; var17 < Class8026.method27518(this.field7946); var17++) {
                     int var29 = 2 * var17;
                     int var8 = 2 * Class8026.method27518(this.field7946) + 2 * var17;
                     var3[var29] = this.field7944[var17][var11][0];
                     var3[var29 + 1] = this.field7944[var17][var11][1];
                     var3[var8] = this.field7944[var17][var11][2];
                     var3[var8 + 1] = this.field7944[var17][var11][3];
                  }

                  Class8026.method27519(this.field7946).method30935(var3, 0, this.field7945);
                  Class8026.method27519(this.field7946).method30935(var3, 2 * Class8026.method27518(this.field7946), this.field7945);

                  for (int var18 = 0; var18 < Class8026.method27518(this.field7946); var18++) {
                     int var30 = 2 * var18;
                     int var39 = 2 * Class8026.method27518(this.field7946) + 2 * var18;
                     this.field7944[var18][var11][0] = var3[var30];
                     this.field7944[var18][var11][1] = var3[var30 + 1];
                     this.field7944[var18][var11][2] = var3[var39];
                     this.field7944[var18][var11][3] = var3[var39 + 1];
                  }
               }
            }
         } else {
            for (int var12 = this.field7942; var12 < Class8026.method27513(this.field7946); var12 += this.field7943) {
               for (int var19 = 0; var19 < Class8026.method27516(this.field7946); var19 += 8) {
                  for (int var6 = 0; var6 < Class8026.method27518(this.field7946); var6++) {
                     int var31 = 2 * var6;
                     int var40 = 2 * Class8026.method27518(this.field7946) + 2 * var6;
                     int var9 = var40 + 2 * Class8026.method27518(this.field7946);
                     int var10 = var9 + 2 * Class8026.method27518(this.field7946);
                     var3[var31] = this.field7944[var6][var12][var19];
                     var3[var31 + 1] = this.field7944[var6][var12][var19 + 1];
                     var3[var40] = this.field7944[var6][var12][var19 + 2];
                     var3[var40 + 1] = this.field7944[var6][var12][var19 + 3];
                     var3[var9] = this.field7944[var6][var12][var19 + 4];
                     var3[var9 + 1] = this.field7944[var6][var12][var19 + 5];
                     var3[var10] = this.field7944[var6][var12][var19 + 6];
                     var3[var10 + 1] = this.field7944[var6][var12][var19 + 7];
                  }

                  Class8026.method27519(this.field7946).method30935(var3, 0, this.field7945);
                  Class8026.method27519(this.field7946).method30935(var3, 2 * Class8026.method27518(this.field7946), this.field7945);
                  Class8026.method27519(this.field7946).method30935(var3, 4 * Class8026.method27518(this.field7946), this.field7945);
                  Class8026.method27519(this.field7946).method30935(var3, 6 * Class8026.method27518(this.field7946), this.field7945);

                  for (int var25 = 0; var25 < Class8026.method27518(this.field7946); var25++) {
                     int var32 = 2 * var25;
                     int var41 = 2 * Class8026.method27518(this.field7946) + 2 * var25;
                     int var46 = var41 + 2 * Class8026.method27518(this.field7946);
                     int var49 = var46 + 2 * Class8026.method27518(this.field7946);
                     this.field7944[var25][var12][var19] = var3[var32];
                     this.field7944[var25][var12][var19 + 1] = var3[var32 + 1];
                     this.field7944[var25][var12][var19 + 2] = var3[var41];
                     this.field7944[var25][var12][var19 + 3] = var3[var41 + 1];
                     this.field7944[var25][var12][var19 + 4] = var3[var46];
                     this.field7944[var25][var12][var19 + 5] = var3[var46 + 1];
                     this.field7944[var25][var12][var19 + 6] = var3[var49];
                     this.field7944[var25][var12][var19 + 7] = var3[var49 + 1];
                  }
               }
            }
         }
      } else if (Class8026.method27516(this.field7946) <= 4) {
         if (Class8026.method27516(this.field7946) != 4) {
            if (Class8026.method27516(this.field7946) == 2) {
               for (int var13 = this.field7942; var13 < Class8026.method27513(this.field7946); var13 += this.field7943) {
                  for (int var20 = 0; var20 < Class8026.method27518(this.field7946); var20++) {
                     int var33 = 2 * var20;
                     var3[var33] = this.field7944[var20][var13][0];
                     var3[var33 + 1] = this.field7944[var20][var13][1];
                  }

                  Class8026.method27519(this.field7946).method30931(var3, 0);

                  for (int var21 = 0; var21 < Class8026.method27518(this.field7946); var21++) {
                     int var34 = 2 * var21;
                     this.field7944[var21][var13][0] = var3[var34];
                     this.field7944[var21][var13][1] = var3[var34 + 1];
                  }
               }
            }
         } else {
            for (int var14 = this.field7942; var14 < Class8026.method27513(this.field7946); var14 += this.field7943) {
               for (int var22 = 0; var22 < Class8026.method27518(this.field7946); var22++) {
                  int var35 = 2 * var22;
                  int var42 = 2 * Class8026.method27518(this.field7946) + 2 * var22;
                  var3[var35] = this.field7944[var22][var14][0];
                  var3[var35 + 1] = this.field7944[var22][var14][1];
                  var3[var42] = this.field7944[var22][var14][2];
                  var3[var42 + 1] = this.field7944[var22][var14][3];
               }

               Class8026.method27519(this.field7946).method30931(var3, 0);
               Class8026.method27519(this.field7946).method30931(var3, 2 * Class8026.method27518(this.field7946));

               for (int var23 = 0; var23 < Class8026.method27518(this.field7946); var23++) {
                  int var36 = 2 * var23;
                  int var43 = 2 * Class8026.method27518(this.field7946) + 2 * var23;
                  this.field7944[var23][var14][0] = var3[var36];
                  this.field7944[var23][var14][1] = var3[var36 + 1];
                  this.field7944[var23][var14][2] = var3[var43];
                  this.field7944[var23][var14][3] = var3[var43 + 1];
               }
            }
         }
      } else {
         for (int var15 = this.field7942; var15 < Class8026.method27513(this.field7946); var15 += this.field7943) {
            for (int var24 = 0; var24 < Class8026.method27516(this.field7946); var24 += 8) {
               for (int var26 = 0; var26 < Class8026.method27518(this.field7946); var26++) {
                  int var37 = 2 * var26;
                  int var44 = 2 * Class8026.method27518(this.field7946) + 2 * var26;
                  int var47 = var44 + 2 * Class8026.method27518(this.field7946);
                  int var50 = var47 + 2 * Class8026.method27518(this.field7946);
                  var3[var37] = this.field7944[var26][var15][var24];
                  var3[var37 + 1] = this.field7944[var26][var15][var24 + 1];
                  var3[var44] = this.field7944[var26][var15][var24 + 2];
                  var3[var44 + 1] = this.field7944[var26][var15][var24 + 3];
                  var3[var47] = this.field7944[var26][var15][var24 + 4];
                  var3[var47 + 1] = this.field7944[var26][var15][var24 + 5];
                  var3[var50] = this.field7944[var26][var15][var24 + 6];
                  var3[var50 + 1] = this.field7944[var26][var15][var24 + 7];
               }

               Class8026.method27519(this.field7946).method30931(var3, 0);
               Class8026.method27519(this.field7946).method30931(var3, 2 * Class8026.method27518(this.field7946));
               Class8026.method27519(this.field7946).method30931(var3, 4 * Class8026.method27518(this.field7946));
               Class8026.method27519(this.field7946).method30931(var3, 6 * Class8026.method27518(this.field7946));

               for (int var27 = 0; var27 < Class8026.method27518(this.field7946); var27++) {
                  int var38 = 2 * var27;
                  int var45 = 2 * Class8026.method27518(this.field7946) + 2 * var27;
                  int var48 = var45 + 2 * Class8026.method27518(this.field7946);
                  int var51 = var48 + 2 * Class8026.method27518(this.field7946);
                  this.field7944[var27][var15][var24] = var3[var38];
                  this.field7944[var27][var15][var24 + 1] = var3[var38 + 1];
                  this.field7944[var27][var15][var24 + 2] = var3[var45];
                  this.field7944[var27][var15][var24 + 3] = var3[var45 + 1];
                  this.field7944[var27][var15][var24 + 4] = var3[var48];
                  this.field7944[var27][var15][var24 + 5] = var3[var48 + 1];
                  this.field7944[var27][var15][var24 + 6] = var3[var51];
                  this.field7944[var27][var15][var24 + 7] = var3[var51 + 1];
               }
            }
         }
      }
   }
}
