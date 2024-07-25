package remapped;

public class class_3285 implements Runnable {
   private static String[] field_16267;

   public class_3285(class_3381 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field_16263 = var1;
      this.field_16266 = var2;
      this.field_16268 = var3;
      this.field_16265 = var4;
      this.field_16264 = var5;
      this.field_16269 = var6;
      this.field_16262 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_16266];
      if (this.field_16268 != -1) {
         if (class_3381.method_15629(this.field_16263) <= 4) {
            if (class_3381.method_15629(this.field_16263) != 4) {
               if (class_3381.method_15629(this.field_16263) == 2) {
                  for (int var4 = this.field_16265; var4 < class_3381.method_15581(this.field_16263); var4 += this.field_16264) {
                     int var5 = var4 * class_3381.method_15616(this.field_16263);

                     for (int var6 = 0; var6 < class_3381.method_15623(this.field_16263); var6++) {
                        int var8 = var6 * class_3381.method_15637(this.field_16263) + var5;
                        int var9 = 2 * var6;
                        var3[var9] = this.field_16269[var8];
                        var3[var9 + 1] = this.field_16269[var8 + 1];
                     }

                     class_3381.method_15603(this.field_16263).method_24215(var3, 0, this.field_16262);

                     for (int var23 = 0; var23 < class_3381.method_15623(this.field_16263); var23++) {
                        int var35 = var23 * class_3381.method_15637(this.field_16263) + var5;
                        int var46 = 2 * var23;
                        this.field_16269[var35] = var3[var46];
                        this.field_16269[var35 + 1] = var3[var46 + 1];
                     }
                  }
               }
            } else {
               for (int var13 = this.field_16265; var13 < class_3381.method_15581(this.field_16263); var13 += this.field_16264) {
                  int var18 = var13 * class_3381.method_15616(this.field_16263);

                  for (int var24 = 0; var24 < class_3381.method_15623(this.field_16263); var24++) {
                     int var36 = var24 * class_3381.method_15637(this.field_16263) + var18;
                     int var47 = 2 * var24;
                     int var10 = 2 * class_3381.method_15623(this.field_16263) + 2 * var24;
                     var3[var47] = this.field_16269[var36];
                     var3[var47 + 1] = this.field_16269[var36 + 1];
                     var3[var10] = this.field_16269[var36 + 2];
                     var3[var10 + 1] = this.field_16269[var36 + 3];
                  }

                  class_3381.method_15603(this.field_16263).method_24215(var3, 0, this.field_16262);
                  class_3381.method_15603(this.field_16263).method_24215(var3, 2 * class_3381.method_15623(this.field_16263), this.field_16262);

                  for (int var25 = 0; var25 < class_3381.method_15623(this.field_16263); var25++) {
                     int var37 = var25 * class_3381.method_15637(this.field_16263) + var18;
                     int var48 = 2 * var25;
                     int var57 = 2 * class_3381.method_15623(this.field_16263) + 2 * var25;
                     this.field_16269[var37] = var3[var48];
                     this.field_16269[var37 + 1] = var3[var48 + 1];
                     this.field_16269[var37 + 2] = var3[var57];
                     this.field_16269[var37 + 3] = var3[var57 + 1];
                  }
               }
            }
         } else {
            for (int var14 = this.field_16265; var14 < class_3381.method_15581(this.field_16263); var14 += this.field_16264) {
               int var19 = var14 * class_3381.method_15616(this.field_16263);

               for (byte var26 = 0; var26 < class_3381.method_15629(this.field_16263); var26 += 8) {
                  for (int var7 = 0; var7 < class_3381.method_15623(this.field_16263); var7++) {
                     int var38 = var7 * class_3381.method_15637(this.field_16263) + var19 + var26;
                     int var49 = 2 * var7;
                     int var58 = 2 * class_3381.method_15623(this.field_16263) + 2 * var7;
                     int var11 = var58 + 2 * class_3381.method_15623(this.field_16263);
                     int var12 = var11 + 2 * class_3381.method_15623(this.field_16263);
                     var3[var49] = this.field_16269[var38];
                     var3[var49 + 1] = this.field_16269[var38 + 1];
                     var3[var58] = this.field_16269[var38 + 2];
                     var3[var58 + 1] = this.field_16269[var38 + 3];
                     var3[var11] = this.field_16269[var38 + 4];
                     var3[var11 + 1] = this.field_16269[var38 + 5];
                     var3[var12] = this.field_16269[var38 + 6];
                     var3[var12 + 1] = this.field_16269[var38 + 7];
                  }

                  class_3381.method_15603(this.field_16263).method_24215(var3, 0, this.field_16262);
                  class_3381.method_15603(this.field_16263).method_24215(var3, 2 * class_3381.method_15623(this.field_16263), this.field_16262);
                  class_3381.method_15603(this.field_16263).method_24215(var3, 4 * class_3381.method_15623(this.field_16263), this.field_16262);
                  class_3381.method_15603(this.field_16263).method_24215(var3, 6 * class_3381.method_15623(this.field_16263), this.field_16262);

                  for (int var32 = 0; var32 < class_3381.method_15623(this.field_16263); var32++) {
                     int var39 = var32 * class_3381.method_15637(this.field_16263) + var19 + var26;
                     int var50 = 2 * var32;
                     int var59 = 2 * class_3381.method_15623(this.field_16263) + 2 * var32;
                     int var64 = var59 + 2 * class_3381.method_15623(this.field_16263);
                     int var67 = var64 + 2 * class_3381.method_15623(this.field_16263);
                     this.field_16269[var39] = var3[var50];
                     this.field_16269[var39 + 1] = var3[var50 + 1];
                     this.field_16269[var39 + 2] = var3[var59];
                     this.field_16269[var39 + 3] = var3[var59 + 1];
                     this.field_16269[var39 + 4] = var3[var64];
                     this.field_16269[var39 + 5] = var3[var64 + 1];
                     this.field_16269[var39 + 6] = var3[var67];
                     this.field_16269[var39 + 7] = var3[var67 + 1];
                  }
               }
            }
         }
      } else if (class_3381.method_15629(this.field_16263) <= 4) {
         if (class_3381.method_15629(this.field_16263) != 4) {
            if (class_3381.method_15629(this.field_16263) == 2) {
               for (int var15 = this.field_16265; var15 < class_3381.method_15581(this.field_16263); var15 += this.field_16264) {
                  int var20 = var15 * class_3381.method_15616(this.field_16263);

                  for (int var27 = 0; var27 < class_3381.method_15623(this.field_16263); var27++) {
                     int var40 = var27 * class_3381.method_15637(this.field_16263) + var20;
                     int var51 = 2 * var27;
                     var3[var51] = this.field_16269[var40];
                     var3[var51 + 1] = this.field_16269[var40 + 1];
                  }

                  class_3381.method_15603(this.field_16263).method_24186(var3, 0);

                  for (int var28 = 0; var28 < class_3381.method_15623(this.field_16263); var28++) {
                     int var41 = var28 * class_3381.method_15637(this.field_16263) + var20;
                     int var52 = 2 * var28;
                     this.field_16269[var41] = var3[var52];
                     this.field_16269[var41 + 1] = var3[var52 + 1];
                  }
               }
            }
         } else {
            for (int var16 = this.field_16265; var16 < class_3381.method_15581(this.field_16263); var16 += this.field_16264) {
               int var21 = var16 * class_3381.method_15616(this.field_16263);

               for (int var29 = 0; var29 < class_3381.method_15623(this.field_16263); var29++) {
                  int var42 = var29 * class_3381.method_15637(this.field_16263) + var21;
                  int var53 = 2 * var29;
                  int var60 = 2 * class_3381.method_15623(this.field_16263) + 2 * var29;
                  var3[var53] = this.field_16269[var42];
                  var3[var53 + 1] = this.field_16269[var42 + 1];
                  var3[var60] = this.field_16269[var42 + 2];
                  var3[var60 + 1] = this.field_16269[var42 + 3];
               }

               class_3381.method_15603(this.field_16263).method_24186(var3, 0);
               class_3381.method_15603(this.field_16263).method_24186(var3, 2 * class_3381.method_15623(this.field_16263));

               for (int var30 = 0; var30 < class_3381.method_15623(this.field_16263); var30++) {
                  int var43 = var30 * class_3381.method_15637(this.field_16263) + var21;
                  int var54 = 2 * var30;
                  int var61 = 2 * class_3381.method_15623(this.field_16263) + 2 * var30;
                  this.field_16269[var43] = var3[var54];
                  this.field_16269[var43 + 1] = var3[var54 + 1];
                  this.field_16269[var43 + 2] = var3[var61];
                  this.field_16269[var43 + 3] = var3[var61 + 1];
               }
            }
         }
      } else {
         for (int var17 = this.field_16265; var17 < class_3381.method_15581(this.field_16263); var17 += this.field_16264) {
            int var22 = var17 * class_3381.method_15616(this.field_16263);

            for (byte var31 = 0; var31 < class_3381.method_15629(this.field_16263); var31 += 8) {
               for (int var33 = 0; var33 < class_3381.method_15623(this.field_16263); var33++) {
                  int var44 = var33 * class_3381.method_15637(this.field_16263) + var22 + var31;
                  int var55 = 2 * var33;
                  int var62 = 2 * class_3381.method_15623(this.field_16263) + 2 * var33;
                  int var65 = var62 + 2 * class_3381.method_15623(this.field_16263);
                  int var68 = var65 + 2 * class_3381.method_15623(this.field_16263);
                  var3[var55] = this.field_16269[var44];
                  var3[var55 + 1] = this.field_16269[var44 + 1];
                  var3[var62] = this.field_16269[var44 + 2];
                  var3[var62 + 1] = this.field_16269[var44 + 3];
                  var3[var65] = this.field_16269[var44 + 4];
                  var3[var65 + 1] = this.field_16269[var44 + 5];
                  var3[var68] = this.field_16269[var44 + 6];
                  var3[var68 + 1] = this.field_16269[var44 + 7];
               }

               class_3381.method_15603(this.field_16263).method_24186(var3, 0);
               class_3381.method_15603(this.field_16263).method_24186(var3, 2 * class_3381.method_15623(this.field_16263));
               class_3381.method_15603(this.field_16263).method_24186(var3, 4 * class_3381.method_15623(this.field_16263));
               class_3381.method_15603(this.field_16263).method_24186(var3, 6 * class_3381.method_15623(this.field_16263));

               for (int var34 = 0; var34 < class_3381.method_15623(this.field_16263); var34++) {
                  int var45 = var34 * class_3381.method_15637(this.field_16263) + var22 + var31;
                  int var56 = 2 * var34;
                  int var63 = 2 * class_3381.method_15623(this.field_16263) + 2 * var34;
                  int var66 = var63 + 2 * class_3381.method_15623(this.field_16263);
                  int var69 = var66 + 2 * class_3381.method_15623(this.field_16263);
                  this.field_16269[var45] = var3[var56];
                  this.field_16269[var45 + 1] = var3[var56 + 1];
                  this.field_16269[var45 + 2] = var3[var63];
                  this.field_16269[var45 + 3] = var3[var63 + 1];
                  this.field_16269[var45 + 4] = var3[var66];
                  this.field_16269[var45 + 5] = var3[var66 + 1];
                  this.field_16269[var45 + 6] = var3[var69];
                  this.field_16269[var45 + 7] = var3[var69 + 1];
               }
            }
         }
      }
   }
}
