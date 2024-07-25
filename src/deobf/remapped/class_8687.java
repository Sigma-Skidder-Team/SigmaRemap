package remapped;

public class class_8687 implements Runnable {
   private static String[] field_44563;

   public class_8687(class_3381 var1, int var2, int var3, int var4, int var5, int var6, float[] var7, boolean var8) {
      this.field_44566 = var1;
      this.field_44565 = var2;
      this.field_44560 = var3;
      this.field_44561 = var4;
      this.field_44567 = var5;
      this.field_44564 = var6;
      this.field_44568 = var7;
      this.field_44562 = var8;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_44565];
      if (this.field_44560 != -1) {
         for (int var4 = this.field_44561; var4 < class_3381.method_15623(this.field_44566); var4 += this.field_44567) {
            int var5 = var4 * class_3381.method_15637(this.field_44566);
            if (this.field_44564 != 0) {
               for (int var15 = 0; var15 < class_3381.method_15581(this.field_44566); var15++) {
                  class_3381.method_15625(this.field_44566)
                     .method_24207(this.field_44568, var5 + var15 * class_3381.method_15616(this.field_44566), this.field_44562);
               }
            } else {
               for (int var6 = 0; var6 < class_3381.method_15581(this.field_44566); var6++) {
                  class_3381.method_15625(this.field_44566)
                     .method_24215(this.field_44568, var5 + var6 * class_3381.method_15616(this.field_44566), this.field_44562);
               }
            }

            if (class_3381.method_15629(this.field_44566) <= 4) {
               if (class_3381.method_15629(this.field_44566) != 4) {
                  if (class_3381.method_15629(this.field_44566) == 2) {
                     for (int var19 = 0; var19 < class_3381.method_15581(this.field_44566); var19++) {
                        int var34 = var5 + var19 * class_3381.method_15616(this.field_44566);
                        int var45 = 2 * var19;
                        var3[var45] = this.field_44568[var34];
                        var3[var45 + 1] = this.field_44568[var34 + 1];
                     }

                     class_3381.method_15639(this.field_44566).method_24215(var3, 0, this.field_44562);

                     for (int var20 = 0; var20 < class_3381.method_15581(this.field_44566); var20++) {
                        int var35 = var5 + var20 * class_3381.method_15616(this.field_44566);
                        int var46 = 2 * var20;
                        this.field_44568[var35] = var3[var46];
                        this.field_44568[var35 + 1] = var3[var46 + 1];
                     }
                  }
               } else {
                  for (int var17 = 0; var17 < class_3381.method_15581(this.field_44566); var17++) {
                     int var32 = var5 + var17 * class_3381.method_15616(this.field_44566);
                     int var43 = 2 * var17;
                     int var54 = 2 * class_3381.method_15581(this.field_44566) + 2 * var17;
                     var3[var43] = this.field_44568[var32];
                     var3[var43 + 1] = this.field_44568[var32 + 1];
                     var3[var54] = this.field_44568[var32 + 2];
                     var3[var54 + 1] = this.field_44568[var32 + 3];
                  }

                  class_3381.method_15639(this.field_44566).method_24215(var3, 0, this.field_44562);
                  class_3381.method_15639(this.field_44566).method_24215(var3, 2 * class_3381.method_15581(this.field_44566), this.field_44562);

                  for (int var18 = 0; var18 < class_3381.method_15581(this.field_44566); var18++) {
                     int var33 = var5 + var18 * class_3381.method_15616(this.field_44566);
                     int var44 = 2 * var18;
                     int var55 = 2 * class_3381.method_15581(this.field_44566) + 2 * var18;
                     this.field_44568[var33] = var3[var44];
                     this.field_44568[var33 + 1] = var3[var44 + 1];
                     this.field_44568[var33 + 2] = var3[var55];
                     this.field_44568[var33 + 3] = var3[var55 + 1];
                  }
               }
            } else {
               for (byte var16 = 0; var16 < class_3381.method_15629(this.field_44566); var16 += 8) {
                  for (int var7 = 0; var7 < class_3381.method_15581(this.field_44566); var7++) {
                     int var8 = var5 + var7 * class_3381.method_15616(this.field_44566) + var16;
                     int var9 = 2 * var7;
                     int var10 = 2 * class_3381.method_15581(this.field_44566) + 2 * var7;
                     int var11 = var10 + 2 * class_3381.method_15581(this.field_44566);
                     int var12 = var11 + 2 * class_3381.method_15581(this.field_44566);
                     var3[var9] = this.field_44568[var8];
                     var3[var9 + 1] = this.field_44568[var8 + 1];
                     var3[var10] = this.field_44568[var8 + 2];
                     var3[var10 + 1] = this.field_44568[var8 + 3];
                     var3[var11] = this.field_44568[var8 + 4];
                     var3[var11 + 1] = this.field_44568[var8 + 5];
                     var3[var12] = this.field_44568[var8 + 6];
                     var3[var12 + 1] = this.field_44568[var8 + 7];
                  }

                  class_3381.method_15639(this.field_44566).method_24215(var3, 0, this.field_44562);
                  class_3381.method_15639(this.field_44566).method_24215(var3, 2 * class_3381.method_15581(this.field_44566), this.field_44562);
                  class_3381.method_15639(this.field_44566).method_24215(var3, 4 * class_3381.method_15581(this.field_44566), this.field_44562);
                  class_3381.method_15639(this.field_44566).method_24215(var3, 6 * class_3381.method_15581(this.field_44566), this.field_44562);

                  for (int var28 = 0; var28 < class_3381.method_15581(this.field_44566); var28++) {
                     int var31 = var5 + var28 * class_3381.method_15616(this.field_44566) + var16;
                     int var42 = 2 * var28;
                     int var53 = 2 * class_3381.method_15581(this.field_44566) + 2 * var28;
                     int var60 = var53 + 2 * class_3381.method_15581(this.field_44566);
                     int var63 = var60 + 2 * class_3381.method_15581(this.field_44566);
                     this.field_44568[var31] = var3[var42];
                     this.field_44568[var31 + 1] = var3[var42 + 1];
                     this.field_44568[var31 + 2] = var3[var53];
                     this.field_44568[var31 + 3] = var3[var53 + 1];
                     this.field_44568[var31 + 4] = var3[var60];
                     this.field_44568[var31 + 5] = var3[var60 + 1];
                     this.field_44568[var31 + 6] = var3[var63];
                     this.field_44568[var31 + 7] = var3[var63 + 1];
                  }
               }
            }
         }
      } else {
         for (int var13 = this.field_44561; var13 < class_3381.method_15623(this.field_44566); var13 += this.field_44567) {
            int var14 = var13 * class_3381.method_15637(this.field_44566);
            if (this.field_44564 != 0) {
               for (int var22 = 0; var22 < class_3381.method_15581(this.field_44566); var22++) {
                  class_3381.method_15625(this.field_44566).method_24205(this.field_44568, var14 + var22 * class_3381.method_15616(this.field_44566));
               }
            } else {
               for (int var21 = 0; var21 < class_3381.method_15581(this.field_44566); var21++) {
                  class_3381.method_15625(this.field_44566).method_24186(this.field_44568, var14 + var21 * class_3381.method_15616(this.field_44566));
               }
            }

            if (class_3381.method_15629(this.field_44566) <= 4) {
               if (class_3381.method_15629(this.field_44566) != 4) {
                  if (class_3381.method_15629(this.field_44566) == 2) {
                     for (int var26 = 0; var26 < class_3381.method_15581(this.field_44566); var26++) {
                        int var40 = var14 + var26 * class_3381.method_15616(this.field_44566);
                        int var51 = 2 * var26;
                        var3[var51] = this.field_44568[var40];
                        var3[var51 + 1] = this.field_44568[var40 + 1];
                     }

                     class_3381.method_15639(this.field_44566).method_24186(var3, 0);

                     for (int var27 = 0; var27 < class_3381.method_15581(this.field_44566); var27++) {
                        int var41 = var14 + var27 * class_3381.method_15616(this.field_44566);
                        int var52 = 2 * var27;
                        this.field_44568[var41] = var3[var52];
                        this.field_44568[var41 + 1] = var3[var52 + 1];
                     }
                  }
               } else {
                  for (int var24 = 0; var24 < class_3381.method_15581(this.field_44566); var24++) {
                     int var38 = var14 + var24 * class_3381.method_15616(this.field_44566);
                     int var49 = 2 * var24;
                     int var58 = 2 * class_3381.method_15581(this.field_44566) + 2 * var24;
                     var3[var49] = this.field_44568[var38];
                     var3[var49 + 1] = this.field_44568[var38 + 1];
                     var3[var58] = this.field_44568[var38 + 2];
                     var3[var58 + 1] = this.field_44568[var38 + 3];
                  }

                  class_3381.method_15639(this.field_44566).method_24186(var3, 0);
                  class_3381.method_15639(this.field_44566).method_24186(var3, 2 * class_3381.method_15581(this.field_44566));

                  for (int var25 = 0; var25 < class_3381.method_15581(this.field_44566); var25++) {
                     int var39 = var14 + var25 * class_3381.method_15616(this.field_44566);
                     int var50 = 2 * var25;
                     int var59 = 2 * class_3381.method_15581(this.field_44566) + 2 * var25;
                     this.field_44568[var39] = var3[var50];
                     this.field_44568[var39 + 1] = var3[var50 + 1];
                     this.field_44568[var39 + 2] = var3[var59];
                     this.field_44568[var39 + 3] = var3[var59 + 1];
                  }
               }
            } else {
               for (byte var23 = 0; var23 < class_3381.method_15629(this.field_44566); var23 += 8) {
                  for (int var29 = 0; var29 < class_3381.method_15581(this.field_44566); var29++) {
                     int var36 = var14 + var29 * class_3381.method_15616(this.field_44566) + var23;
                     int var47 = 2 * var29;
                     int var56 = 2 * class_3381.method_15581(this.field_44566) + 2 * var29;
                     int var61 = var56 + 2 * class_3381.method_15581(this.field_44566);
                     int var64 = var61 + 2 * class_3381.method_15581(this.field_44566);
                     var3[var47] = this.field_44568[var36];
                     var3[var47 + 1] = this.field_44568[var36 + 1];
                     var3[var56] = this.field_44568[var36 + 2];
                     var3[var56 + 1] = this.field_44568[var36 + 3];
                     var3[var61] = this.field_44568[var36 + 4];
                     var3[var61 + 1] = this.field_44568[var36 + 5];
                     var3[var64] = this.field_44568[var36 + 6];
                     var3[var64 + 1] = this.field_44568[var36 + 7];
                  }

                  class_3381.method_15639(this.field_44566).method_24186(var3, 0);
                  class_3381.method_15639(this.field_44566).method_24186(var3, 2 * class_3381.method_15581(this.field_44566));
                  class_3381.method_15639(this.field_44566).method_24186(var3, 4 * class_3381.method_15581(this.field_44566));
                  class_3381.method_15639(this.field_44566).method_24186(var3, 6 * class_3381.method_15581(this.field_44566));

                  for (int var30 = 0; var30 < class_3381.method_15581(this.field_44566); var30++) {
                     int var37 = var14 + var30 * class_3381.method_15616(this.field_44566) + var23;
                     int var48 = 2 * var30;
                     int var57 = 2 * class_3381.method_15581(this.field_44566) + 2 * var30;
                     int var62 = var57 + 2 * class_3381.method_15581(this.field_44566);
                     int var65 = var62 + 2 * class_3381.method_15581(this.field_44566);
                     this.field_44568[var37] = var3[var48];
                     this.field_44568[var37 + 1] = var3[var48 + 1];
                     this.field_44568[var37 + 2] = var3[var57];
                     this.field_44568[var37 + 3] = var3[var57 + 1];
                     this.field_44568[var37 + 4] = var3[var62];
                     this.field_44568[var37 + 5] = var3[var62 + 1];
                     this.field_44568[var37 + 6] = var3[var65];
                     this.field_44568[var37 + 7] = var3[var65 + 1];
                  }
               }
            }
         }
      }
   }
}
