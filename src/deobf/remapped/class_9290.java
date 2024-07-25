package remapped;

public class class_9290 implements Runnable {
   private static String[] field_47397;

   public class_9290(class_9035 var1, int var2, int var3, int var4, int var5, double[][] var6, boolean var7) {
      this.field_47394 = var1;
      this.field_47392 = var2;
      this.field_47395 = var3;
      this.field_47390 = var4;
      this.field_47396 = var5;
      this.field_47393 = var6;
      this.field_47391 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_47392];
      if (this.field_47395 != -1) {
         if (class_9035.method_41431(this.field_47394) <= 4 * this.field_47390) {
            if (class_9035.method_41431(this.field_47394) != 4 * this.field_47390) {
               if (class_9035.method_41431(this.field_47394) == 2 * this.field_47390) {
                  for (int var4 = 0; var4 < class_9035.method_41470(this.field_47394); var4++) {
                     int var6 = 2 * var4;
                     var3[var6] = this.field_47393[var4][2 * this.field_47396];
                     var3[var6 + 1] = this.field_47393[var4][2 * this.field_47396 + 1];
                  }

                  class_9035.method_41455(this.field_47394).method_15035(var3, 0, this.field_47391);

                  for (int var10 = 0; var10 < class_9035.method_41470(this.field_47394); var10++) {
                     int var22 = 2 * var10;
                     this.field_47393[var10][2 * this.field_47396] = var3[var22];
                     this.field_47393[var10][2 * this.field_47396 + 1] = var3[var22 + 1];
                  }
               }
            } else {
               for (int var11 = 0; var11 < class_9035.method_41470(this.field_47394); var11++) {
                  int var23 = 2 * var11;
                  int var7 = 2 * class_9035.method_41470(this.field_47394) + 2 * var11;
                  var3[var23] = this.field_47393[var11][4 * this.field_47396];
                  var3[var23 + 1] = this.field_47393[var11][4 * this.field_47396 + 1];
                  var3[var7] = this.field_47393[var11][4 * this.field_47396 + 2];
                  var3[var7 + 1] = this.field_47393[var11][4 * this.field_47396 + 3];
               }

               class_9035.method_41455(this.field_47394).method_15035(var3, 0, this.field_47391);
               class_9035.method_41455(this.field_47394).method_15035(var3, 2 * class_9035.method_41470(this.field_47394), this.field_47391);

               for (int var12 = 0; var12 < class_9035.method_41470(this.field_47394); var12++) {
                  int var24 = 2 * var12;
                  int var33 = 2 * class_9035.method_41470(this.field_47394) + 2 * var12;
                  this.field_47393[var12][4 * this.field_47396] = var3[var24];
                  this.field_47393[var12][4 * this.field_47396 + 1] = var3[var24 + 1];
                  this.field_47393[var12][4 * this.field_47396 + 2] = var3[var33];
                  this.field_47393[var12][4 * this.field_47396 + 3] = var3[var33 + 1];
               }
            }
         } else {
            for (int var13 = 8 * this.field_47396; var13 < class_9035.method_41431(this.field_47394); var13 += 8 * this.field_47390) {
               for (int var5 = 0; var5 < class_9035.method_41470(this.field_47394); var5++) {
                  int var25 = 2 * var5;
                  int var34 = 2 * class_9035.method_41470(this.field_47394) + 2 * var5;
                  int var8 = var34 + 2 * class_9035.method_41470(this.field_47394);
                  int var9 = var8 + 2 * class_9035.method_41470(this.field_47394);
                  var3[var25] = this.field_47393[var5][var13];
                  var3[var25 + 1] = this.field_47393[var5][var13 + 1];
                  var3[var34] = this.field_47393[var5][var13 + 2];
                  var3[var34 + 1] = this.field_47393[var5][var13 + 3];
                  var3[var8] = this.field_47393[var5][var13 + 4];
                  var3[var8 + 1] = this.field_47393[var5][var13 + 5];
                  var3[var9] = this.field_47393[var5][var13 + 6];
                  var3[var9 + 1] = this.field_47393[var5][var13 + 7];
               }

               class_9035.method_41455(this.field_47394).method_15035(var3, 0, this.field_47391);
               class_9035.method_41455(this.field_47394).method_15035(var3, 2 * class_9035.method_41470(this.field_47394), this.field_47391);
               class_9035.method_41455(this.field_47394).method_15035(var3, 4 * class_9035.method_41470(this.field_47394), this.field_47391);
               class_9035.method_41455(this.field_47394).method_15035(var3, 6 * class_9035.method_41470(this.field_47394), this.field_47391);

               for (int var19 = 0; var19 < class_9035.method_41470(this.field_47394); var19++) {
                  int var26 = 2 * var19;
                  int var35 = 2 * class_9035.method_41470(this.field_47394) + 2 * var19;
                  int var40 = var35 + 2 * class_9035.method_41470(this.field_47394);
                  int var43 = var40 + 2 * class_9035.method_41470(this.field_47394);
                  this.field_47393[var19][var13] = var3[var26];
                  this.field_47393[var19][var13 + 1] = var3[var26 + 1];
                  this.field_47393[var19][var13 + 2] = var3[var35];
                  this.field_47393[var19][var13 + 3] = var3[var35 + 1];
                  this.field_47393[var19][var13 + 4] = var3[var40];
                  this.field_47393[var19][var13 + 5] = var3[var40 + 1];
                  this.field_47393[var19][var13 + 6] = var3[var43];
                  this.field_47393[var19][var13 + 7] = var3[var43 + 1];
               }
            }
         }
      } else if (class_9035.method_41431(this.field_47394) <= 4 * this.field_47390) {
         if (class_9035.method_41431(this.field_47394) != 4 * this.field_47390) {
            if (class_9035.method_41431(this.field_47394) == 2 * this.field_47390) {
               for (int var14 = 0; var14 < class_9035.method_41470(this.field_47394); var14++) {
                  int var27 = 2 * var14;
                  var3[var27] = this.field_47393[var14][2 * this.field_47396];
                  var3[var27 + 1] = this.field_47393[var14][2 * this.field_47396 + 1];
               }

               class_9035.method_41455(this.field_47394).method_15029(var3, 0);

               for (int var15 = 0; var15 < class_9035.method_41470(this.field_47394); var15++) {
                  int var28 = 2 * var15;
                  this.field_47393[var15][2 * this.field_47396] = var3[var28];
                  this.field_47393[var15][2 * this.field_47396 + 1] = var3[var28 + 1];
               }
            }
         } else {
            for (int var16 = 0; var16 < class_9035.method_41470(this.field_47394); var16++) {
               int var29 = 2 * var16;
               int var36 = 2 * class_9035.method_41470(this.field_47394) + 2 * var16;
               var3[var29] = this.field_47393[var16][4 * this.field_47396];
               var3[var29 + 1] = this.field_47393[var16][4 * this.field_47396 + 1];
               var3[var36] = this.field_47393[var16][4 * this.field_47396 + 2];
               var3[var36 + 1] = this.field_47393[var16][4 * this.field_47396 + 3];
            }

            class_9035.method_41455(this.field_47394).method_15029(var3, 0);
            class_9035.method_41455(this.field_47394).method_15029(var3, 2 * class_9035.method_41470(this.field_47394));

            for (int var17 = 0; var17 < class_9035.method_41470(this.field_47394); var17++) {
               int var30 = 2 * var17;
               int var37 = 2 * class_9035.method_41470(this.field_47394) + 2 * var17;
               this.field_47393[var17][4 * this.field_47396] = var3[var30];
               this.field_47393[var17][4 * this.field_47396 + 1] = var3[var30 + 1];
               this.field_47393[var17][4 * this.field_47396 + 2] = var3[var37];
               this.field_47393[var17][4 * this.field_47396 + 3] = var3[var37 + 1];
            }
         }
      } else {
         for (int var18 = 8 * this.field_47396; var18 < class_9035.method_41431(this.field_47394); var18 += 8 * this.field_47390) {
            for (int var20 = 0; var20 < class_9035.method_41470(this.field_47394); var20++) {
               int var31 = 2 * var20;
               int var38 = 2 * class_9035.method_41470(this.field_47394) + 2 * var20;
               int var41 = var38 + 2 * class_9035.method_41470(this.field_47394);
               int var44 = var41 + 2 * class_9035.method_41470(this.field_47394);
               var3[var31] = this.field_47393[var20][var18];
               var3[var31 + 1] = this.field_47393[var20][var18 + 1];
               var3[var38] = this.field_47393[var20][var18 + 2];
               var3[var38 + 1] = this.field_47393[var20][var18 + 3];
               var3[var41] = this.field_47393[var20][var18 + 4];
               var3[var41 + 1] = this.field_47393[var20][var18 + 5];
               var3[var44] = this.field_47393[var20][var18 + 6];
               var3[var44 + 1] = this.field_47393[var20][var18 + 7];
            }

            class_9035.method_41455(this.field_47394).method_15029(var3, 0);
            class_9035.method_41455(this.field_47394).method_15029(var3, 2 * class_9035.method_41470(this.field_47394));
            class_9035.method_41455(this.field_47394).method_15029(var3, 4 * class_9035.method_41470(this.field_47394));
            class_9035.method_41455(this.field_47394).method_15029(var3, 6 * class_9035.method_41470(this.field_47394));

            for (int var21 = 0; var21 < class_9035.method_41470(this.field_47394); var21++) {
               int var32 = 2 * var21;
               int var39 = 2 * class_9035.method_41470(this.field_47394) + 2 * var21;
               int var42 = var39 + 2 * class_9035.method_41470(this.field_47394);
               int var45 = var42 + 2 * class_9035.method_41470(this.field_47394);
               this.field_47393[var21][var18] = var3[var32];
               this.field_47393[var21][var18 + 1] = var3[var32 + 1];
               this.field_47393[var21][var18 + 2] = var3[var39];
               this.field_47393[var21][var18 + 3] = var3[var39 + 1];
               this.field_47393[var21][var18 + 4] = var3[var42];
               this.field_47393[var21][var18 + 5] = var3[var42 + 1];
               this.field_47393[var21][var18 + 6] = var3[var45];
               this.field_47393[var21][var18 + 7] = var3[var45 + 1];
            }
         }
      }
   }
}
