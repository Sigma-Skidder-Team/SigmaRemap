package remapped;

public class class_9407 implements Runnable {
   private static String[] field_48093;

   public class_9407(class_1637 var1, int var2, int var3, int var4, int var5, int var6, double[][][] var7, boolean var8) {
      this.field_48095 = var1;
      this.field_48100 = var2;
      this.field_48098 = var3;
      this.field_48096 = var4;
      this.field_48099 = var5;
      this.field_48094 = var6;
      this.field_48097 = var7;
      this.field_48101 = var8;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_48100];
      if (this.field_48098 != -1) {
         for (int var4 = this.field_48096; var4 < class_1637.method_7338(this.field_48095); var4 += this.field_48099) {
            if (this.field_48094 == 0) {
               for (int var5 = 0; var5 < class_1637.method_7321(this.field_48095); var5++) {
                  class_1637.method_7310(this.field_48095).method_15036(this.field_48097[var4][var5], this.field_48101);
               }
            }

            if (class_1637.method_7344(this.field_48095) <= 4) {
               if (class_1637.method_7344(this.field_48095) != 4) {
                  if (class_1637.method_7344(this.field_48095) == 2) {
                     for (int var15 = 0; var15 < class_1637.method_7321(this.field_48095); var15++) {
                        int var31 = 2 * var15;
                        var3[var31] = this.field_48097[var4][var15][0];
                        var3[var31 + 1] = this.field_48097[var4][var15][1];
                     }

                     class_1637.method_7323(this.field_48095).method_15035(var3, 0, this.field_48101);

                     for (int var16 = 0; var16 < class_1637.method_7321(this.field_48095); var16++) {
                        int var32 = 2 * var16;
                        this.field_48097[var4][var16][0] = var3[var32];
                        this.field_48097[var4][var16][1] = var3[var32 + 1];
                     }
                  }
               } else {
                  for (int var13 = 0; var13 < class_1637.method_7321(this.field_48095); var13++) {
                     int var29 = 2 * var13;
                     int var40 = 2 * class_1637.method_7321(this.field_48095) + 2 * var13;
                     var3[var29] = this.field_48097[var4][var13][0];
                     var3[var29 + 1] = this.field_48097[var4][var13][1];
                     var3[var40] = this.field_48097[var4][var13][2];
                     var3[var40 + 1] = this.field_48097[var4][var13][3];
                  }

                  class_1637.method_7323(this.field_48095).method_15035(var3, 0, this.field_48101);
                  class_1637.method_7323(this.field_48095).method_15035(var3, 2 * class_1637.method_7321(this.field_48095), this.field_48101);

                  for (int var14 = 0; var14 < class_1637.method_7321(this.field_48095); var14++) {
                     int var30 = 2 * var14;
                     int var41 = 2 * class_1637.method_7321(this.field_48095) + 2 * var14;
                     this.field_48097[var4][var14][0] = var3[var30];
                     this.field_48097[var4][var14][1] = var3[var30 + 1];
                     this.field_48097[var4][var14][2] = var3[var41];
                     this.field_48097[var4][var14][3] = var3[var41 + 1];
                  }
               }
            } else {
               for (byte var12 = 0; var12 < class_1637.method_7344(this.field_48095); var12 += 8) {
                  for (int var6 = 0; var6 < class_1637.method_7321(this.field_48095); var6++) {
                     int var7 = 2 * var6;
                     int var8 = 2 * class_1637.method_7321(this.field_48095) + 2 * var6;
                     int var9 = var8 + 2 * class_1637.method_7321(this.field_48095);
                     int var10 = var9 + 2 * class_1637.method_7321(this.field_48095);
                     var3[var7] = this.field_48097[var4][var6][var12];
                     var3[var7 + 1] = this.field_48097[var4][var6][var12 + 1];
                     var3[var8] = this.field_48097[var4][var6][var12 + 2];
                     var3[var8 + 1] = this.field_48097[var4][var6][var12 + 3];
                     var3[var9] = this.field_48097[var4][var6][var12 + 4];
                     var3[var9 + 1] = this.field_48097[var4][var6][var12 + 5];
                     var3[var10] = this.field_48097[var4][var6][var12 + 6];
                     var3[var10 + 1] = this.field_48097[var4][var6][var12 + 7];
                  }

                  class_1637.method_7323(this.field_48095).method_15035(var3, 0, this.field_48101);
                  class_1637.method_7323(this.field_48095).method_15035(var3, 2 * class_1637.method_7321(this.field_48095), this.field_48101);
                  class_1637.method_7323(this.field_48095).method_15035(var3, 4 * class_1637.method_7321(this.field_48095), this.field_48101);
                  class_1637.method_7323(this.field_48095).method_15035(var3, 6 * class_1637.method_7321(this.field_48095), this.field_48101);

                  for (int var25 = 0; var25 < class_1637.method_7321(this.field_48095); var25++) {
                     int var28 = 2 * var25;
                     int var39 = 2 * class_1637.method_7321(this.field_48095) + 2 * var25;
                     int var46 = var39 + 2 * class_1637.method_7321(this.field_48095);
                     int var49 = var46 + 2 * class_1637.method_7321(this.field_48095);
                     this.field_48097[var4][var25][var12] = var3[var28];
                     this.field_48097[var4][var25][var12 + 1] = var3[var28 + 1];
                     this.field_48097[var4][var25][var12 + 2] = var3[var39];
                     this.field_48097[var4][var25][var12 + 3] = var3[var39 + 1];
                     this.field_48097[var4][var25][var12 + 4] = var3[var46];
                     this.field_48097[var4][var25][var12 + 5] = var3[var46 + 1];
                     this.field_48097[var4][var25][var12 + 6] = var3[var49];
                     this.field_48097[var4][var25][var12 + 7] = var3[var49 + 1];
                  }
               }
            }

            if (this.field_48094 != 0) {
               for (int var17 = 0; var17 < class_1637.method_7321(this.field_48095); var17++) {
                  class_1637.method_7310(this.field_48095).method_15023(this.field_48097[var4][var17], this.field_48101);
               }
            }
         }
      } else {
         for (int var11 = this.field_48096; var11 < class_1637.method_7338(this.field_48095); var11 += this.field_48099) {
            if (this.field_48094 != 0) {
               for (int var19 = 0; var19 < class_1637.method_7321(this.field_48095); var19++) {
                  class_1637.method_7310(this.field_48095).method_15045(this.field_48097[var11][var19], 0);
               }
            } else {
               for (int var18 = 0; var18 < class_1637.method_7321(this.field_48095); var18++) {
                  class_1637.method_7310(this.field_48095).method_15028(this.field_48097[var11][var18]);
               }
            }

            if (class_1637.method_7344(this.field_48095) <= 4) {
               if (class_1637.method_7344(this.field_48095) != 4) {
                  if (class_1637.method_7344(this.field_48095) == 2) {
                     for (int var23 = 0; var23 < class_1637.method_7321(this.field_48095); var23++) {
                        int var37 = 2 * var23;
                        var3[var37] = this.field_48097[var11][var23][0];
                        var3[var37 + 1] = this.field_48097[var11][var23][1];
                     }

                     class_1637.method_7323(this.field_48095).method_15029(var3, 0);

                     for (int var24 = 0; var24 < class_1637.method_7321(this.field_48095); var24++) {
                        int var38 = 2 * var24;
                        this.field_48097[var11][var24][0] = var3[var38];
                        this.field_48097[var11][var24][1] = var3[var38 + 1];
                     }
                  }
               } else {
                  for (int var21 = 0; var21 < class_1637.method_7321(this.field_48095); var21++) {
                     int var35 = 2 * var21;
                     int var44 = 2 * class_1637.method_7321(this.field_48095) + 2 * var21;
                     var3[var35] = this.field_48097[var11][var21][0];
                     var3[var35 + 1] = this.field_48097[var11][var21][1];
                     var3[var44] = this.field_48097[var11][var21][2];
                     var3[var44 + 1] = this.field_48097[var11][var21][3];
                  }

                  class_1637.method_7323(this.field_48095).method_15029(var3, 0);
                  class_1637.method_7323(this.field_48095).method_15029(var3, 2 * class_1637.method_7321(this.field_48095));

                  for (int var22 = 0; var22 < class_1637.method_7321(this.field_48095); var22++) {
                     int var36 = 2 * var22;
                     int var45 = 2 * class_1637.method_7321(this.field_48095) + 2 * var22;
                     this.field_48097[var11][var22][0] = var3[var36];
                     this.field_48097[var11][var22][1] = var3[var36 + 1];
                     this.field_48097[var11][var22][2] = var3[var45];
                     this.field_48097[var11][var22][3] = var3[var45 + 1];
                  }
               }
            } else {
               for (byte var20 = 0; var20 < class_1637.method_7344(this.field_48095); var20 += 8) {
                  for (int var26 = 0; var26 < class_1637.method_7321(this.field_48095); var26++) {
                     int var33 = 2 * var26;
                     int var42 = 2 * class_1637.method_7321(this.field_48095) + 2 * var26;
                     int var47 = var42 + 2 * class_1637.method_7321(this.field_48095);
                     int var50 = var47 + 2 * class_1637.method_7321(this.field_48095);
                     var3[var33] = this.field_48097[var11][var26][var20];
                     var3[var33 + 1] = this.field_48097[var11][var26][var20 + 1];
                     var3[var42] = this.field_48097[var11][var26][var20 + 2];
                     var3[var42 + 1] = this.field_48097[var11][var26][var20 + 3];
                     var3[var47] = this.field_48097[var11][var26][var20 + 4];
                     var3[var47 + 1] = this.field_48097[var11][var26][var20 + 5];
                     var3[var50] = this.field_48097[var11][var26][var20 + 6];
                     var3[var50 + 1] = this.field_48097[var11][var26][var20 + 7];
                  }

                  class_1637.method_7323(this.field_48095).method_15029(var3, 0);
                  class_1637.method_7323(this.field_48095).method_15029(var3, 2 * class_1637.method_7321(this.field_48095));
                  class_1637.method_7323(this.field_48095).method_15029(var3, 4 * class_1637.method_7321(this.field_48095));
                  class_1637.method_7323(this.field_48095).method_15029(var3, 6 * class_1637.method_7321(this.field_48095));

                  for (int var27 = 0; var27 < class_1637.method_7321(this.field_48095); var27++) {
                     int var34 = 2 * var27;
                     int var43 = 2 * class_1637.method_7321(this.field_48095) + 2 * var27;
                     int var48 = var43 + 2 * class_1637.method_7321(this.field_48095);
                     int var51 = var48 + 2 * class_1637.method_7321(this.field_48095);
                     this.field_48097[var11][var27][var20] = var3[var34];
                     this.field_48097[var11][var27][var20 + 1] = var3[var34 + 1];
                     this.field_48097[var11][var27][var20 + 2] = var3[var43];
                     this.field_48097[var11][var27][var20 + 3] = var3[var43 + 1];
                     this.field_48097[var11][var27][var20 + 4] = var3[var48];
                     this.field_48097[var11][var27][var20 + 5] = var3[var48 + 1];
                     this.field_48097[var11][var27][var20 + 6] = var3[var51];
                     this.field_48097[var11][var27][var20 + 7] = var3[var51 + 1];
                  }
               }
            }
         }
      }
   }
}
