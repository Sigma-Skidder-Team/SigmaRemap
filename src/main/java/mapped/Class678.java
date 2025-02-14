package mapped;

public class Class678 implements Runnable {
   private static String[] field3436;
   public final int field3437;
   public final int field3438;
   public final int field3439;
   public final int field3440;
   public final float[] field3441;
   public final boolean field3442;
   public final Class8026 field3443;

   public Class678(Class8026 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field3443 = var1;
      this.field3437 = var2;
      this.field3438 = var3;
      this.field3439 = var4;
      this.field3440 = var5;
      this.field3441 = var6;
      this.field3442 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field3437];
      if (this.field3438 != -1) {
         if (Class8026.method27516(this.field3443) <= 4) {
            if (Class8026.method27516(this.field3443) != 4) {
               if (Class8026.method27516(this.field3443) == 2) {
                  for (int var4 = this.field3439; var4 < Class8026.method27513(this.field3443); var4 += this.field3440) {
                     int var5 = var4 * Class8026.method27514(this.field3443);

                     for (int var6 = 0; var6 < Class8026.method27518(this.field3443); var6++) {
                        int var8 = var6 * Class8026.method27512(this.field3443) + var5;
                        int var9 = 2 * var6;
                        var3[var9] = this.field3441[var8];
                        var3[var9 + 1] = this.field3441[var8 + 1];
                     }

                     Class8026.method27519(this.field3443).method30935(var3, 0, this.field3442);

                     for (int var23 = 0; var23 < Class8026.method27518(this.field3443); var23++) {
                        int var35 = var23 * Class8026.method27512(this.field3443) + var5;
                        int var46 = 2 * var23;
                        this.field3441[var35] = var3[var46];
                        this.field3441[var35 + 1] = var3[var46 + 1];
                     }
                  }
               }
            } else {
               for (int var13 = this.field3439; var13 < Class8026.method27513(this.field3443); var13 += this.field3440) {
                  int var18 = var13 * Class8026.method27514(this.field3443);

                  for (int var24 = 0; var24 < Class8026.method27518(this.field3443); var24++) {
                     int var36 = var24 * Class8026.method27512(this.field3443) + var18;
                     int var47 = 2 * var24;
                     int var10 = 2 * Class8026.method27518(this.field3443) + 2 * var24;
                     var3[var47] = this.field3441[var36];
                     var3[var47 + 1] = this.field3441[var36 + 1];
                     var3[var10] = this.field3441[var36 + 2];
                     var3[var10 + 1] = this.field3441[var36 + 3];
                  }

                  Class8026.method27519(this.field3443).method30935(var3, 0, this.field3442);
                  Class8026.method27519(this.field3443).method30935(var3, 2 * Class8026.method27518(this.field3443), this.field3442);

                  for (int var25 = 0; var25 < Class8026.method27518(this.field3443); var25++) {
                     int var37 = var25 * Class8026.method27512(this.field3443) + var18;
                     int var48 = 2 * var25;
                     int var57 = 2 * Class8026.method27518(this.field3443) + 2 * var25;
                     this.field3441[var37] = var3[var48];
                     this.field3441[var37 + 1] = var3[var48 + 1];
                     this.field3441[var37 + 2] = var3[var57];
                     this.field3441[var37 + 3] = var3[var57 + 1];
                  }
               }
            }
         } else {
            for (int var14 = this.field3439; var14 < Class8026.method27513(this.field3443); var14 += this.field3440) {
               int var19 = var14 * Class8026.method27514(this.field3443);

               for (int var26 = 0; var26 < Class8026.method27516(this.field3443); var26 += 8) {
                  for (int var7 = 0; var7 < Class8026.method27518(this.field3443); var7++) {
                     int var38 = var7 * Class8026.method27512(this.field3443) + var19 + var26;
                     int var49 = 2 * var7;
                     int var58 = 2 * Class8026.method27518(this.field3443) + 2 * var7;
                     int var11 = var58 + 2 * Class8026.method27518(this.field3443);
                     int var12 = var11 + 2 * Class8026.method27518(this.field3443);
                     var3[var49] = this.field3441[var38];
                     var3[var49 + 1] = this.field3441[var38 + 1];
                     var3[var58] = this.field3441[var38 + 2];
                     var3[var58 + 1] = this.field3441[var38 + 3];
                     var3[var11] = this.field3441[var38 + 4];
                     var3[var11 + 1] = this.field3441[var38 + 5];
                     var3[var12] = this.field3441[var38 + 6];
                     var3[var12 + 1] = this.field3441[var38 + 7];
                  }

                  Class8026.method27519(this.field3443).method30935(var3, 0, this.field3442);
                  Class8026.method27519(this.field3443).method30935(var3, 2 * Class8026.method27518(this.field3443), this.field3442);
                  Class8026.method27519(this.field3443).method30935(var3, 4 * Class8026.method27518(this.field3443), this.field3442);
                  Class8026.method27519(this.field3443).method30935(var3, 6 * Class8026.method27518(this.field3443), this.field3442);

                  for (int var32 = 0; var32 < Class8026.method27518(this.field3443); var32++) {
                     int var39 = var32 * Class8026.method27512(this.field3443) + var19 + var26;
                     int var50 = 2 * var32;
                     int var59 = 2 * Class8026.method27518(this.field3443) + 2 * var32;
                     int var64 = var59 + 2 * Class8026.method27518(this.field3443);
                     int var67 = var64 + 2 * Class8026.method27518(this.field3443);
                     this.field3441[var39] = var3[var50];
                     this.field3441[var39 + 1] = var3[var50 + 1];
                     this.field3441[var39 + 2] = var3[var59];
                     this.field3441[var39 + 3] = var3[var59 + 1];
                     this.field3441[var39 + 4] = var3[var64];
                     this.field3441[var39 + 5] = var3[var64 + 1];
                     this.field3441[var39 + 6] = var3[var67];
                     this.field3441[var39 + 7] = var3[var67 + 1];
                  }
               }
            }
         }
      } else if (Class8026.method27516(this.field3443) <= 4) {
         if (Class8026.method27516(this.field3443) != 4) {
            if (Class8026.method27516(this.field3443) == 2) {
               for (int var15 = this.field3439; var15 < Class8026.method27513(this.field3443); var15 += this.field3440) {
                  int var20 = var15 * Class8026.method27514(this.field3443);

                  for (int var27 = 0; var27 < Class8026.method27518(this.field3443); var27++) {
                     int var40 = var27 * Class8026.method27512(this.field3443) + var20;
                     int var51 = 2 * var27;
                     var3[var51] = this.field3441[var40];
                     var3[var51 + 1] = this.field3441[var40 + 1];
                  }

                  Class8026.method27519(this.field3443).method30931(var3, 0);

                  for (int var28 = 0; var28 < Class8026.method27518(this.field3443); var28++) {
                     int var41 = var28 * Class8026.method27512(this.field3443) + var20;
                     int var52 = 2 * var28;
                     this.field3441[var41] = var3[var52];
                     this.field3441[var41 + 1] = var3[var52 + 1];
                  }
               }
            }
         } else {
            for (int var16 = this.field3439; var16 < Class8026.method27513(this.field3443); var16 += this.field3440) {
               int var21 = var16 * Class8026.method27514(this.field3443);

               for (int var29 = 0; var29 < Class8026.method27518(this.field3443); var29++) {
                  int var42 = var29 * Class8026.method27512(this.field3443) + var21;
                  int var53 = 2 * var29;
                  int var60 = 2 * Class8026.method27518(this.field3443) + 2 * var29;
                  var3[var53] = this.field3441[var42];
                  var3[var53 + 1] = this.field3441[var42 + 1];
                  var3[var60] = this.field3441[var42 + 2];
                  var3[var60 + 1] = this.field3441[var42 + 3];
               }

               Class8026.method27519(this.field3443).method30931(var3, 0);
               Class8026.method27519(this.field3443).method30931(var3, 2 * Class8026.method27518(this.field3443));

               for (int var30 = 0; var30 < Class8026.method27518(this.field3443); var30++) {
                  int var43 = var30 * Class8026.method27512(this.field3443) + var21;
                  int var54 = 2 * var30;
                  int var61 = 2 * Class8026.method27518(this.field3443) + 2 * var30;
                  this.field3441[var43] = var3[var54];
                  this.field3441[var43 + 1] = var3[var54 + 1];
                  this.field3441[var43 + 2] = var3[var61];
                  this.field3441[var43 + 3] = var3[var61 + 1];
               }
            }
         }
      } else {
         for (int var17 = this.field3439; var17 < Class8026.method27513(this.field3443); var17 += this.field3440) {
            int var22 = var17 * Class8026.method27514(this.field3443);

            for (int var31 = 0; var31 < Class8026.method27516(this.field3443); var31 += 8) {
               for (int var33 = 0; var33 < Class8026.method27518(this.field3443); var33++) {
                  int var44 = var33 * Class8026.method27512(this.field3443) + var22 + var31;
                  int var55 = 2 * var33;
                  int var62 = 2 * Class8026.method27518(this.field3443) + 2 * var33;
                  int var65 = var62 + 2 * Class8026.method27518(this.field3443);
                  int var68 = var65 + 2 * Class8026.method27518(this.field3443);
                  var3[var55] = this.field3441[var44];
                  var3[var55 + 1] = this.field3441[var44 + 1];
                  var3[var62] = this.field3441[var44 + 2];
                  var3[var62 + 1] = this.field3441[var44 + 3];
                  var3[var65] = this.field3441[var44 + 4];
                  var3[var65 + 1] = this.field3441[var44 + 5];
                  var3[var68] = this.field3441[var44 + 6];
                  var3[var68 + 1] = this.field3441[var44 + 7];
               }

               Class8026.method27519(this.field3443).method30931(var3, 0);
               Class8026.method27519(this.field3443).method30931(var3, 2 * Class8026.method27518(this.field3443));
               Class8026.method27519(this.field3443).method30931(var3, 4 * Class8026.method27518(this.field3443));
               Class8026.method27519(this.field3443).method30931(var3, 6 * Class8026.method27518(this.field3443));

               for (int var34 = 0; var34 < Class8026.method27518(this.field3443); var34++) {
                  int var45 = var34 * Class8026.method27512(this.field3443) + var22 + var31;
                  int var56 = 2 * var34;
                  int var63 = 2 * Class8026.method27518(this.field3443) + 2 * var34;
                  int var66 = var63 + 2 * Class8026.method27518(this.field3443);
                  int var69 = var66 + 2 * Class8026.method27518(this.field3443);
                  this.field3441[var45] = var3[var56];
                  this.field3441[var45 + 1] = var3[var56 + 1];
                  this.field3441[var45 + 2] = var3[var63];
                  this.field3441[var45 + 3] = var3[var63 + 1];
                  this.field3441[var45 + 4] = var3[var66];
                  this.field3441[var45 + 5] = var3[var66 + 1];
                  this.field3441[var45 + 6] = var3[var69];
                  this.field3441[var45 + 7] = var3[var69 + 1];
               }
            }
         }
      }
   }
}
