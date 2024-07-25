package remapped;

public class class_7724 implements Runnable {
   private static String[] field_39153;

   public class_7724(class_3381 var1, int var2, int var3, int var4, int var5, float[][][] var6, boolean var7) {
      this.field_39152 = var1;
      this.field_39155 = var2;
      this.field_39158 = var3;
      this.field_39156 = var4;
      this.field_39159 = var5;
      this.field_39154 = var6;
      this.field_39157 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_39155];
      if (this.field_39158 != -1) {
         if (class_3381.method_15629(this.field_39152) <= 4) {
            if (class_3381.method_15629(this.field_39152) != 4) {
               if (class_3381.method_15629(this.field_39152) == 2) {
                  for (int var4 = this.field_39156; var4 < class_3381.method_15581(this.field_39152); var4 += this.field_39159) {
                     for (int var5 = 0; var5 < class_3381.method_15623(this.field_39152); var5++) {
                        int var7 = 2 * var5;
                        var3[var7] = this.field_39154[var5][var4][0];
                        var3[var7 + 1] = this.field_39154[var5][var4][1];
                     }

                     class_3381.method_15603(this.field_39152).method_24215(var3, 0, this.field_39157);

                     for (int var16 = 0; var16 < class_3381.method_15623(this.field_39152); var16++) {
                        int var28 = 2 * var16;
                        this.field_39154[var16][var4][0] = var3[var28];
                        this.field_39154[var16][var4][1] = var3[var28 + 1];
                     }
                  }
               }
            } else {
               for (int var11 = this.field_39156; var11 < class_3381.method_15581(this.field_39152); var11 += this.field_39159) {
                  for (int var17 = 0; var17 < class_3381.method_15623(this.field_39152); var17++) {
                     int var29 = 2 * var17;
                     int var8 = 2 * class_3381.method_15623(this.field_39152) + 2 * var17;
                     var3[var29] = this.field_39154[var17][var11][0];
                     var3[var29 + 1] = this.field_39154[var17][var11][1];
                     var3[var8] = this.field_39154[var17][var11][2];
                     var3[var8 + 1] = this.field_39154[var17][var11][3];
                  }

                  class_3381.method_15603(this.field_39152).method_24215(var3, 0, this.field_39157);
                  class_3381.method_15603(this.field_39152).method_24215(var3, 2 * class_3381.method_15623(this.field_39152), this.field_39157);

                  for (int var18 = 0; var18 < class_3381.method_15623(this.field_39152); var18++) {
                     int var30 = 2 * var18;
                     int var39 = 2 * class_3381.method_15623(this.field_39152) + 2 * var18;
                     this.field_39154[var18][var11][0] = var3[var30];
                     this.field_39154[var18][var11][1] = var3[var30 + 1];
                     this.field_39154[var18][var11][2] = var3[var39];
                     this.field_39154[var18][var11][3] = var3[var39 + 1];
                  }
               }
            }
         } else {
            for (int var12 = this.field_39156; var12 < class_3381.method_15581(this.field_39152); var12 += this.field_39159) {
               for (byte var19 = 0; var19 < class_3381.method_15629(this.field_39152); var19 += 8) {
                  for (int var6 = 0; var6 < class_3381.method_15623(this.field_39152); var6++) {
                     int var31 = 2 * var6;
                     int var40 = 2 * class_3381.method_15623(this.field_39152) + 2 * var6;
                     int var9 = var40 + 2 * class_3381.method_15623(this.field_39152);
                     int var10 = var9 + 2 * class_3381.method_15623(this.field_39152);
                     var3[var31] = this.field_39154[var6][var12][var19];
                     var3[var31 + 1] = this.field_39154[var6][var12][var19 + 1];
                     var3[var40] = this.field_39154[var6][var12][var19 + 2];
                     var3[var40 + 1] = this.field_39154[var6][var12][var19 + 3];
                     var3[var9] = this.field_39154[var6][var12][var19 + 4];
                     var3[var9 + 1] = this.field_39154[var6][var12][var19 + 5];
                     var3[var10] = this.field_39154[var6][var12][var19 + 6];
                     var3[var10 + 1] = this.field_39154[var6][var12][var19 + 7];
                  }

                  class_3381.method_15603(this.field_39152).method_24215(var3, 0, this.field_39157);
                  class_3381.method_15603(this.field_39152).method_24215(var3, 2 * class_3381.method_15623(this.field_39152), this.field_39157);
                  class_3381.method_15603(this.field_39152).method_24215(var3, 4 * class_3381.method_15623(this.field_39152), this.field_39157);
                  class_3381.method_15603(this.field_39152).method_24215(var3, 6 * class_3381.method_15623(this.field_39152), this.field_39157);

                  for (int var25 = 0; var25 < class_3381.method_15623(this.field_39152); var25++) {
                     int var32 = 2 * var25;
                     int var41 = 2 * class_3381.method_15623(this.field_39152) + 2 * var25;
                     int var46 = var41 + 2 * class_3381.method_15623(this.field_39152);
                     int var49 = var46 + 2 * class_3381.method_15623(this.field_39152);
                     this.field_39154[var25][var12][var19] = var3[var32];
                     this.field_39154[var25][var12][var19 + 1] = var3[var32 + 1];
                     this.field_39154[var25][var12][var19 + 2] = var3[var41];
                     this.field_39154[var25][var12][var19 + 3] = var3[var41 + 1];
                     this.field_39154[var25][var12][var19 + 4] = var3[var46];
                     this.field_39154[var25][var12][var19 + 5] = var3[var46 + 1];
                     this.field_39154[var25][var12][var19 + 6] = var3[var49];
                     this.field_39154[var25][var12][var19 + 7] = var3[var49 + 1];
                  }
               }
            }
         }
      } else if (class_3381.method_15629(this.field_39152) <= 4) {
         if (class_3381.method_15629(this.field_39152) != 4) {
            if (class_3381.method_15629(this.field_39152) == 2) {
               for (int var13 = this.field_39156; var13 < class_3381.method_15581(this.field_39152); var13 += this.field_39159) {
                  for (int var20 = 0; var20 < class_3381.method_15623(this.field_39152); var20++) {
                     int var33 = 2 * var20;
                     var3[var33] = this.field_39154[var20][var13][0];
                     var3[var33 + 1] = this.field_39154[var20][var13][1];
                  }

                  class_3381.method_15603(this.field_39152).method_24186(var3, 0);

                  for (int var21 = 0; var21 < class_3381.method_15623(this.field_39152); var21++) {
                     int var34 = 2 * var21;
                     this.field_39154[var21][var13][0] = var3[var34];
                     this.field_39154[var21][var13][1] = var3[var34 + 1];
                  }
               }
            }
         } else {
            for (int var14 = this.field_39156; var14 < class_3381.method_15581(this.field_39152); var14 += this.field_39159) {
               for (int var22 = 0; var22 < class_3381.method_15623(this.field_39152); var22++) {
                  int var35 = 2 * var22;
                  int var42 = 2 * class_3381.method_15623(this.field_39152) + 2 * var22;
                  var3[var35] = this.field_39154[var22][var14][0];
                  var3[var35 + 1] = this.field_39154[var22][var14][1];
                  var3[var42] = this.field_39154[var22][var14][2];
                  var3[var42 + 1] = this.field_39154[var22][var14][3];
               }

               class_3381.method_15603(this.field_39152).method_24186(var3, 0);
               class_3381.method_15603(this.field_39152).method_24186(var3, 2 * class_3381.method_15623(this.field_39152));

               for (int var23 = 0; var23 < class_3381.method_15623(this.field_39152); var23++) {
                  int var36 = 2 * var23;
                  int var43 = 2 * class_3381.method_15623(this.field_39152) + 2 * var23;
                  this.field_39154[var23][var14][0] = var3[var36];
                  this.field_39154[var23][var14][1] = var3[var36 + 1];
                  this.field_39154[var23][var14][2] = var3[var43];
                  this.field_39154[var23][var14][3] = var3[var43 + 1];
               }
            }
         }
      } else {
         for (int var15 = this.field_39156; var15 < class_3381.method_15581(this.field_39152); var15 += this.field_39159) {
            for (byte var24 = 0; var24 < class_3381.method_15629(this.field_39152); var24 += 8) {
               for (int var26 = 0; var26 < class_3381.method_15623(this.field_39152); var26++) {
                  int var37 = 2 * var26;
                  int var44 = 2 * class_3381.method_15623(this.field_39152) + 2 * var26;
                  int var47 = var44 + 2 * class_3381.method_15623(this.field_39152);
                  int var50 = var47 + 2 * class_3381.method_15623(this.field_39152);
                  var3[var37] = this.field_39154[var26][var15][var24];
                  var3[var37 + 1] = this.field_39154[var26][var15][var24 + 1];
                  var3[var44] = this.field_39154[var26][var15][var24 + 2];
                  var3[var44 + 1] = this.field_39154[var26][var15][var24 + 3];
                  var3[var47] = this.field_39154[var26][var15][var24 + 4];
                  var3[var47 + 1] = this.field_39154[var26][var15][var24 + 5];
                  var3[var50] = this.field_39154[var26][var15][var24 + 6];
                  var3[var50 + 1] = this.field_39154[var26][var15][var24 + 7];
               }

               class_3381.method_15603(this.field_39152).method_24186(var3, 0);
               class_3381.method_15603(this.field_39152).method_24186(var3, 2 * class_3381.method_15623(this.field_39152));
               class_3381.method_15603(this.field_39152).method_24186(var3, 4 * class_3381.method_15623(this.field_39152));
               class_3381.method_15603(this.field_39152).method_24186(var3, 6 * class_3381.method_15623(this.field_39152));

               for (int var27 = 0; var27 < class_3381.method_15623(this.field_39152); var27++) {
                  int var38 = 2 * var27;
                  int var45 = 2 * class_3381.method_15623(this.field_39152) + 2 * var27;
                  int var48 = var45 + 2 * class_3381.method_15623(this.field_39152);
                  int var51 = var48 + 2 * class_3381.method_15623(this.field_39152);
                  this.field_39154[var27][var15][var24] = var3[var38];
                  this.field_39154[var27][var15][var24 + 1] = var3[var38 + 1];
                  this.field_39154[var27][var15][var24 + 2] = var3[var45];
                  this.field_39154[var27][var15][var24 + 3] = var3[var45 + 1];
                  this.field_39154[var27][var15][var24 + 4] = var3[var48];
                  this.field_39154[var27][var15][var24 + 5] = var3[var48 + 1];
                  this.field_39154[var27][var15][var24 + 6] = var3[var51];
                  this.field_39154[var27][var15][var24 + 7] = var3[var51 + 1];
               }
            }
         }
      }
   }
}
