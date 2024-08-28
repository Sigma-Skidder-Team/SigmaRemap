package mapped;

public class Class579 implements Runnable {
   private static String[] field2829;
   public final int field2830;
   public final int field2831;
   public final int field2832;
   public final int field2833;
   public final int field2834;
   public final double[][][] field2835;
   public final boolean field2836;
   public final Class7274 field2837;

   public Class579(Class7274 var1, int var2, int var3, int var4, int var5, int var6, double[][][] var7, boolean var8) {
      this.field2837 = var1;
      this.field2830 = var2;
      this.field2831 = var3;
      this.field2832 = var4;
      this.field2833 = var5;
      this.field2834 = var6;
      this.field2835 = var7;
      this.field2836 = var8;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field2830];
      if (this.field2831 != -1) {
         for (int var4 = this.field2832; var4 < Class7274.method22900(this.field2837); var4 += this.field2833) {
            if (this.field2834 == 0) {
               for (int var5 = 0; var5 < Class7274.method22895(this.field2837); var5++) {
                  Class7274.method22897(this.field2837).method27166(this.field2835[var4][var5], this.field2836);
               }
            }

            if (Class7274.method22898(this.field2837) <= 4) {
               if (Class7274.method22898(this.field2837) != 4) {
                  if (Class7274.method22898(this.field2837) == 2) {
                     for (int var15 = 0; var15 < Class7274.method22895(this.field2837); var15++) {
                        int var31 = 2 * var15;
                        var3[var31] = this.field2835[var4][var15][0];
                        var3[var31 + 1] = this.field2835[var4][var15][1];
                     }

                     Class7274.method22899(this.field2837).method27168(var3, 0, this.field2836);

                     for (int var16 = 0; var16 < Class7274.method22895(this.field2837); var16++) {
                        int var32 = 2 * var16;
                        this.field2835[var4][var16][0] = var3[var32];
                        this.field2835[var4][var16][1] = var3[var32 + 1];
                     }
                  }
               } else {
                  for (int var13 = 0; var13 < Class7274.method22895(this.field2837); var13++) {
                     int var29 = 2 * var13;
                     int var40 = 2 * Class7274.method22895(this.field2837) + 2 * var13;
                     var3[var29] = this.field2835[var4][var13][0];
                     var3[var29 + 1] = this.field2835[var4][var13][1];
                     var3[var40] = this.field2835[var4][var13][2];
                     var3[var40 + 1] = this.field2835[var4][var13][3];
                  }

                  Class7274.method22899(this.field2837).method27168(var3, 0, this.field2836);
                  Class7274.method22899(this.field2837).method27168(var3, 2 * Class7274.method22895(this.field2837), this.field2836);

                  for (int var14 = 0; var14 < Class7274.method22895(this.field2837); var14++) {
                     int var30 = 2 * var14;
                     int var41 = 2 * Class7274.method22895(this.field2837) + 2 * var14;
                     this.field2835[var4][var14][0] = var3[var30];
                     this.field2835[var4][var14][1] = var3[var30 + 1];
                     this.field2835[var4][var14][2] = var3[var41];
                     this.field2835[var4][var14][3] = var3[var41 + 1];
                  }
               }
            } else {
               for (int var12 = 0; var12 < Class7274.method22898(this.field2837); var12 += 8) {
                  for (int var6 = 0; var6 < Class7274.method22895(this.field2837); var6++) {
                     int var7 = 2 * var6;
                     int var8 = 2 * Class7274.method22895(this.field2837) + 2 * var6;
                     int var9 = var8 + 2 * Class7274.method22895(this.field2837);
                     int var10 = var9 + 2 * Class7274.method22895(this.field2837);
                     var3[var7] = this.field2835[var4][var6][var12];
                     var3[var7 + 1] = this.field2835[var4][var6][var12 + 1];
                     var3[var8] = this.field2835[var4][var6][var12 + 2];
                     var3[var8 + 1] = this.field2835[var4][var6][var12 + 3];
                     var3[var9] = this.field2835[var4][var6][var12 + 4];
                     var3[var9 + 1] = this.field2835[var4][var6][var12 + 5];
                     var3[var10] = this.field2835[var4][var6][var12 + 6];
                     var3[var10 + 1] = this.field2835[var4][var6][var12 + 7];
                  }

                  Class7274.method22899(this.field2837).method27168(var3, 0, this.field2836);
                  Class7274.method22899(this.field2837).method27168(var3, 2 * Class7274.method22895(this.field2837), this.field2836);
                  Class7274.method22899(this.field2837).method27168(var3, 4 * Class7274.method22895(this.field2837), this.field2836);
                  Class7274.method22899(this.field2837).method27168(var3, 6 * Class7274.method22895(this.field2837), this.field2836);

                  for (int var25 = 0; var25 < Class7274.method22895(this.field2837); var25++) {
                     int var28 = 2 * var25;
                     int var39 = 2 * Class7274.method22895(this.field2837) + 2 * var25;
                     int var46 = var39 + 2 * Class7274.method22895(this.field2837);
                     int var49 = var46 + 2 * Class7274.method22895(this.field2837);
                     this.field2835[var4][var25][var12] = var3[var28];
                     this.field2835[var4][var25][var12 + 1] = var3[var28 + 1];
                     this.field2835[var4][var25][var12 + 2] = var3[var39];
                     this.field2835[var4][var25][var12 + 3] = var3[var39 + 1];
                     this.field2835[var4][var25][var12 + 4] = var3[var46];
                     this.field2835[var4][var25][var12 + 5] = var3[var46 + 1];
                     this.field2835[var4][var25][var12 + 6] = var3[var49];
                     this.field2835[var4][var25][var12 + 7] = var3[var49 + 1];
                  }
               }
            }

            if (this.field2834 != 0) {
               for (int var17 = 0; var17 < Class7274.method22895(this.field2837); var17++) {
                  Class7274.method22897(this.field2837).method27178(this.field2835[var4][var17], this.field2836);
               }
            }
         }
      } else {
         for (int var11 = this.field2832; var11 < Class7274.method22900(this.field2837); var11 += this.field2833) {
            if (this.field2834 != 0) {
               for (int var19 = 0; var19 < Class7274.method22895(this.field2837); var19++) {
                  Class7274.method22897(this.field2837).method27172(this.field2835[var11][var19], 0);
               }
            } else {
               for (int var18 = 0; var18 < Class7274.method22895(this.field2837); var18++) {
                  Class7274.method22897(this.field2837).method27162(this.field2835[var11][var18]);
               }
            }

            if (Class7274.method22898(this.field2837) <= 4) {
               if (Class7274.method22898(this.field2837) != 4) {
                  if (Class7274.method22898(this.field2837) == 2) {
                     for (int var23 = 0; var23 < Class7274.method22895(this.field2837); var23++) {
                        int var37 = 2 * var23;
                        var3[var37] = this.field2835[var11][var23][0];
                        var3[var37 + 1] = this.field2835[var11][var23][1];
                     }

                     Class7274.method22899(this.field2837).method27164(var3, 0);

                     for (int var24 = 0; var24 < Class7274.method22895(this.field2837); var24++) {
                        int var38 = 2 * var24;
                        this.field2835[var11][var24][0] = var3[var38];
                        this.field2835[var11][var24][1] = var3[var38 + 1];
                     }
                  }
               } else {
                  for (int var21 = 0; var21 < Class7274.method22895(this.field2837); var21++) {
                     int var35 = 2 * var21;
                     int var44 = 2 * Class7274.method22895(this.field2837) + 2 * var21;
                     var3[var35] = this.field2835[var11][var21][0];
                     var3[var35 + 1] = this.field2835[var11][var21][1];
                     var3[var44] = this.field2835[var11][var21][2];
                     var3[var44 + 1] = this.field2835[var11][var21][3];
                  }

                  Class7274.method22899(this.field2837).method27164(var3, 0);
                  Class7274.method22899(this.field2837).method27164(var3, 2 * Class7274.method22895(this.field2837));

                  for (int var22 = 0; var22 < Class7274.method22895(this.field2837); var22++) {
                     int var36 = 2 * var22;
                     int var45 = 2 * Class7274.method22895(this.field2837) + 2 * var22;
                     this.field2835[var11][var22][0] = var3[var36];
                     this.field2835[var11][var22][1] = var3[var36 + 1];
                     this.field2835[var11][var22][2] = var3[var45];
                     this.field2835[var11][var22][3] = var3[var45 + 1];
                  }
               }
            } else {
               for (int var20 = 0; var20 < Class7274.method22898(this.field2837); var20 += 8) {
                  for (int var26 = 0; var26 < Class7274.method22895(this.field2837); var26++) {
                     int var33 = 2 * var26;
                     int var42 = 2 * Class7274.method22895(this.field2837) + 2 * var26;
                     int var47 = var42 + 2 * Class7274.method22895(this.field2837);
                     int var50 = var47 + 2 * Class7274.method22895(this.field2837);
                     var3[var33] = this.field2835[var11][var26][var20];
                     var3[var33 + 1] = this.field2835[var11][var26][var20 + 1];
                     var3[var42] = this.field2835[var11][var26][var20 + 2];
                     var3[var42 + 1] = this.field2835[var11][var26][var20 + 3];
                     var3[var47] = this.field2835[var11][var26][var20 + 4];
                     var3[var47 + 1] = this.field2835[var11][var26][var20 + 5];
                     var3[var50] = this.field2835[var11][var26][var20 + 6];
                     var3[var50 + 1] = this.field2835[var11][var26][var20 + 7];
                  }

                  Class7274.method22899(this.field2837).method27164(var3, 0);
                  Class7274.method22899(this.field2837).method27164(var3, 2 * Class7274.method22895(this.field2837));
                  Class7274.method22899(this.field2837).method27164(var3, 4 * Class7274.method22895(this.field2837));
                  Class7274.method22899(this.field2837).method27164(var3, 6 * Class7274.method22895(this.field2837));

                  for (int var27 = 0; var27 < Class7274.method22895(this.field2837); var27++) {
                     int var34 = 2 * var27;
                     int var43 = 2 * Class7274.method22895(this.field2837) + 2 * var27;
                     int var48 = var43 + 2 * Class7274.method22895(this.field2837);
                     int var51 = var48 + 2 * Class7274.method22895(this.field2837);
                     this.field2835[var11][var27][var20] = var3[var34];
                     this.field2835[var11][var27][var20 + 1] = var3[var34 + 1];
                     this.field2835[var11][var27][var20 + 2] = var3[var43];
                     this.field2835[var11][var27][var20 + 3] = var3[var43 + 1];
                     this.field2835[var11][var27][var20 + 4] = var3[var48];
                     this.field2835[var11][var27][var20 + 5] = var3[var48 + 1];
                     this.field2835[var11][var27][var20 + 6] = var3[var51];
                     this.field2835[var11][var27][var20 + 7] = var3[var51 + 1];
                  }
               }
            }
         }
      }
   }
}
