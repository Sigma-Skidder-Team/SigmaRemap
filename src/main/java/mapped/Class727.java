package mapped;

public class Class727 implements Runnable {
   private static String[] field3750;
   public final int field3751;
   public final int field3752;
   public final int field3753;
   public final int field3754;
   public final double[][][] field3755;
   public final boolean field3756;
   public final Class7274 field3757;

   public Class727(Class7274 var1, int var2, int var3, int var4, int var5, double[][][] var6, boolean var7) {
      this.field3757 = var1;
      this.field3751 = var2;
      this.field3752 = var3;
      this.field3753 = var4;
      this.field3754 = var5;
      this.field3755 = var6;
      this.field3756 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field3751];
      if (this.field3752 != -1) {
         if (Class7274.method22898(this.field3757) <= 4) {
            if (Class7274.method22898(this.field3757) != 4) {
               if (Class7274.method22898(this.field3757) == 2) {
                  for (int var4 = this.field3753; var4 < Class7274.method22895(this.field3757); var4 += this.field3754) {
                     for (int var5 = 0; var5 < Class7274.method22900(this.field3757); var5++) {
                        int var7 = 2 * var5;
                        var3[var7] = this.field3755[var5][var4][0];
                        var3[var7 + 1] = this.field3755[var5][var4][1];
                     }

                     Class7274.method22901(this.field3757).method27168(var3, 0, this.field3756);

                     for (int var16 = 0; var16 < Class7274.method22900(this.field3757); var16++) {
                        int var28 = 2 * var16;
                        this.field3755[var16][var4][0] = var3[var28];
                        this.field3755[var16][var4][1] = var3[var28 + 1];
                     }
                  }
               }
            } else {
               for (int var11 = this.field3753; var11 < Class7274.method22895(this.field3757); var11 += this.field3754) {
                  for (int var17 = 0; var17 < Class7274.method22900(this.field3757); var17++) {
                     int var29 = 2 * var17;
                     int var8 = 2 * Class7274.method22900(this.field3757) + 2 * var17;
                     var3[var29] = this.field3755[var17][var11][0];
                     var3[var29 + 1] = this.field3755[var17][var11][1];
                     var3[var8] = this.field3755[var17][var11][2];
                     var3[var8 + 1] = this.field3755[var17][var11][3];
                  }

                  Class7274.method22901(this.field3757).method27168(var3, 0, this.field3756);
                  Class7274.method22901(this.field3757).method27168(var3, 2 * Class7274.method22900(this.field3757), this.field3756);

                  for (int var18 = 0; var18 < Class7274.method22900(this.field3757); var18++) {
                     int var30 = 2 * var18;
                     int var39 = 2 * Class7274.method22900(this.field3757) + 2 * var18;
                     this.field3755[var18][var11][0] = var3[var30];
                     this.field3755[var18][var11][1] = var3[var30 + 1];
                     this.field3755[var18][var11][2] = var3[var39];
                     this.field3755[var18][var11][3] = var3[var39 + 1];
                  }
               }
            }
         } else {
            for (int var12 = this.field3753; var12 < Class7274.method22895(this.field3757); var12 += this.field3754) {
               for (int var19 = 0; var19 < Class7274.method22898(this.field3757); var19 += 8) {
                  for (int var6 = 0; var6 < Class7274.method22900(this.field3757); var6++) {
                     int var31 = 2 * var6;
                     int var40 = 2 * Class7274.method22900(this.field3757) + 2 * var6;
                     int var9 = var40 + 2 * Class7274.method22900(this.field3757);
                     int var10 = var9 + 2 * Class7274.method22900(this.field3757);
                     var3[var31] = this.field3755[var6][var12][var19];
                     var3[var31 + 1] = this.field3755[var6][var12][var19 + 1];
                     var3[var40] = this.field3755[var6][var12][var19 + 2];
                     var3[var40 + 1] = this.field3755[var6][var12][var19 + 3];
                     var3[var9] = this.field3755[var6][var12][var19 + 4];
                     var3[var9 + 1] = this.field3755[var6][var12][var19 + 5];
                     var3[var10] = this.field3755[var6][var12][var19 + 6];
                     var3[var10 + 1] = this.field3755[var6][var12][var19 + 7];
                  }

                  Class7274.method22901(this.field3757).method27168(var3, 0, this.field3756);
                  Class7274.method22901(this.field3757).method27168(var3, 2 * Class7274.method22900(this.field3757), this.field3756);
                  Class7274.method22901(this.field3757).method27168(var3, 4 * Class7274.method22900(this.field3757), this.field3756);
                  Class7274.method22901(this.field3757).method27168(var3, 6 * Class7274.method22900(this.field3757), this.field3756);

                  for (int var25 = 0; var25 < Class7274.method22900(this.field3757); var25++) {
                     int var32 = 2 * var25;
                     int var41 = 2 * Class7274.method22900(this.field3757) + 2 * var25;
                     int var46 = var41 + 2 * Class7274.method22900(this.field3757);
                     int var49 = var46 + 2 * Class7274.method22900(this.field3757);
                     this.field3755[var25][var12][var19] = var3[var32];
                     this.field3755[var25][var12][var19 + 1] = var3[var32 + 1];
                     this.field3755[var25][var12][var19 + 2] = var3[var41];
                     this.field3755[var25][var12][var19 + 3] = var3[var41 + 1];
                     this.field3755[var25][var12][var19 + 4] = var3[var46];
                     this.field3755[var25][var12][var19 + 5] = var3[var46 + 1];
                     this.field3755[var25][var12][var19 + 6] = var3[var49];
                     this.field3755[var25][var12][var19 + 7] = var3[var49 + 1];
                  }
               }
            }
         }
      } else if (Class7274.method22898(this.field3757) <= 4) {
         if (Class7274.method22898(this.field3757) != 4) {
            if (Class7274.method22898(this.field3757) == 2) {
               for (int var13 = this.field3753; var13 < Class7274.method22895(this.field3757); var13 += this.field3754) {
                  for (int var20 = 0; var20 < Class7274.method22900(this.field3757); var20++) {
                     int var33 = 2 * var20;
                     var3[var33] = this.field3755[var20][var13][0];
                     var3[var33 + 1] = this.field3755[var20][var13][1];
                  }

                  Class7274.method22901(this.field3757).method27164(var3, 0);

                  for (int var21 = 0; var21 < Class7274.method22900(this.field3757); var21++) {
                     int var34 = 2 * var21;
                     this.field3755[var21][var13][0] = var3[var34];
                     this.field3755[var21][var13][1] = var3[var34 + 1];
                  }
               }
            }
         } else {
            for (int var14 = this.field3753; var14 < Class7274.method22895(this.field3757); var14 += this.field3754) {
               for (int var22 = 0; var22 < Class7274.method22900(this.field3757); var22++) {
                  int var35 = 2 * var22;
                  int var42 = 2 * Class7274.method22900(this.field3757) + 2 * var22;
                  var3[var35] = this.field3755[var22][var14][0];
                  var3[var35 + 1] = this.field3755[var22][var14][1];
                  var3[var42] = this.field3755[var22][var14][2];
                  var3[var42 + 1] = this.field3755[var22][var14][3];
               }

               Class7274.method22901(this.field3757).method27164(var3, 0);
               Class7274.method22901(this.field3757).method27164(var3, 2 * Class7274.method22900(this.field3757));

               for (int var23 = 0; var23 < Class7274.method22900(this.field3757); var23++) {
                  int var36 = 2 * var23;
                  int var43 = 2 * Class7274.method22900(this.field3757) + 2 * var23;
                  this.field3755[var23][var14][0] = var3[var36];
                  this.field3755[var23][var14][1] = var3[var36 + 1];
                  this.field3755[var23][var14][2] = var3[var43];
                  this.field3755[var23][var14][3] = var3[var43 + 1];
               }
            }
         }
      } else {
         for (int var15 = this.field3753; var15 < Class7274.method22895(this.field3757); var15 += this.field3754) {
            for (int var24 = 0; var24 < Class7274.method22898(this.field3757); var24 += 8) {
               for (int var26 = 0; var26 < Class7274.method22900(this.field3757); var26++) {
                  int var37 = 2 * var26;
                  int var44 = 2 * Class7274.method22900(this.field3757) + 2 * var26;
                  int var47 = var44 + 2 * Class7274.method22900(this.field3757);
                  int var50 = var47 + 2 * Class7274.method22900(this.field3757);
                  var3[var37] = this.field3755[var26][var15][var24];
                  var3[var37 + 1] = this.field3755[var26][var15][var24 + 1];
                  var3[var44] = this.field3755[var26][var15][var24 + 2];
                  var3[var44 + 1] = this.field3755[var26][var15][var24 + 3];
                  var3[var47] = this.field3755[var26][var15][var24 + 4];
                  var3[var47 + 1] = this.field3755[var26][var15][var24 + 5];
                  var3[var50] = this.field3755[var26][var15][var24 + 6];
                  var3[var50 + 1] = this.field3755[var26][var15][var24 + 7];
               }

               Class7274.method22901(this.field3757).method27164(var3, 0);
               Class7274.method22901(this.field3757).method27164(var3, 2 * Class7274.method22900(this.field3757));
               Class7274.method22901(this.field3757).method27164(var3, 4 * Class7274.method22900(this.field3757));
               Class7274.method22901(this.field3757).method27164(var3, 6 * Class7274.method22900(this.field3757));

               for (int var27 = 0; var27 < Class7274.method22900(this.field3757); var27++) {
                  int var38 = 2 * var27;
                  int var45 = 2 * Class7274.method22900(this.field3757) + 2 * var27;
                  int var48 = var45 + 2 * Class7274.method22900(this.field3757);
                  int var51 = var48 + 2 * Class7274.method22900(this.field3757);
                  this.field3755[var27][var15][var24] = var3[var38];
                  this.field3755[var27][var15][var24 + 1] = var3[var38 + 1];
                  this.field3755[var27][var15][var24 + 2] = var3[var45];
                  this.field3755[var27][var15][var24 + 3] = var3[var45 + 1];
                  this.field3755[var27][var15][var24 + 4] = var3[var48];
                  this.field3755[var27][var15][var24 + 5] = var3[var48 + 1];
                  this.field3755[var27][var15][var24 + 6] = var3[var51];
                  this.field3755[var27][var15][var24 + 7] = var3[var51 + 1];
               }
            }
         }
      }
   }
}
