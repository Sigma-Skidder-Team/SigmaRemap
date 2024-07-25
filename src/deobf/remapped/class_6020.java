package remapped;

public class class_6020 implements Runnable {
   private static String[] field_30656;

   public class_6020(class_84 var1, int var2, int var3, int var4, int var5, double[][][] var6, boolean var7) {
      this.field_30659 = var1;
      this.field_30654 = var2;
      this.field_30655 = var3;
      this.field_30653 = var4;
      this.field_30658 = var5;
      this.field_30657 = var6;
      this.field_30652 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_30654];
      if (this.field_30655 != -1) {
         if (class_84.method_198(this.field_30659) <= 2) {
            if (class_84.method_198(this.field_30659) == 2) {
               for (int var4 = this.field_30653; var4 < class_84.method_200(this.field_30659); var4 += this.field_30658) {
                  for (int var5 = 0; var5 < class_84.method_175(this.field_30659); var5++) {
                     var3[var5] = this.field_30657[var5][var4][0];
                     var3[class_84.method_175(this.field_30659) + var5] = this.field_30657[var5][var4][1];
                  }

                  class_84.method_181(this.field_30659).method_31288(var3, 0, this.field_30652);
                  class_84.method_181(this.field_30659).method_31288(var3, class_84.method_175(this.field_30659), this.field_30652);

                  for (int var11 = 0; var11 < class_84.method_175(this.field_30659); var11++) {
                     this.field_30657[var11][var4][0] = var3[var11];
                     this.field_30657[var11][var4][1] = var3[class_84.method_175(this.field_30659) + var11];
                  }
               }
            }
         } else {
            for (int var8 = this.field_30653; var8 < class_84.method_200(this.field_30659); var8 += this.field_30658) {
               for (byte var12 = 0; var12 < class_84.method_198(this.field_30659); var12 += 4) {
                  for (int var6 = 0; var6 < class_84.method_175(this.field_30659); var6++) {
                     int var7 = class_84.method_175(this.field_30659) + var6;
                     var3[var6] = this.field_30657[var6][var8][var12];
                     var3[var7] = this.field_30657[var6][var8][var12 + 1];
                     var3[var7 + class_84.method_175(this.field_30659)] = this.field_30657[var6][var8][var12 + 2];
                     var3[var7 + 2 * class_84.method_175(this.field_30659)] = this.field_30657[var6][var8][var12 + 3];
                  }

                  class_84.method_181(this.field_30659).method_31288(var3, 0, this.field_30652);
                  class_84.method_181(this.field_30659).method_31288(var3, class_84.method_175(this.field_30659), this.field_30652);
                  class_84.method_181(this.field_30659).method_31288(var3, 2 * class_84.method_175(this.field_30659), this.field_30652);
                  class_84.method_181(this.field_30659).method_31288(var3, 3 * class_84.method_175(this.field_30659), this.field_30652);

                  for (int var16 = 0; var16 < class_84.method_175(this.field_30659); var16++) {
                     int var19 = class_84.method_175(this.field_30659) + var16;
                     this.field_30657[var16][var8][var12] = var3[var16];
                     this.field_30657[var16][var8][var12 + 1] = var3[var19];
                     this.field_30657[var16][var8][var12 + 2] = var3[var19 + class_84.method_175(this.field_30659)];
                     this.field_30657[var16][var8][var12 + 3] = var3[var19 + 2 * class_84.method_175(this.field_30659)];
                  }
               }
            }
         }
      } else if (class_84.method_198(this.field_30659) <= 2) {
         if (class_84.method_198(this.field_30659) == 2) {
            for (int var9 = this.field_30653; var9 < class_84.method_200(this.field_30659); var9 += this.field_30658) {
               for (int var13 = 0; var13 < class_84.method_175(this.field_30659); var13++) {
                  var3[var13] = this.field_30657[var13][var9][0];
                  var3[class_84.method_175(this.field_30659) + var13] = this.field_30657[var13][var9][1];
               }

               class_84.method_181(this.field_30659).method_31294(var3, 0, this.field_30652);
               class_84.method_181(this.field_30659).method_31294(var3, class_84.method_175(this.field_30659), this.field_30652);

               for (int var14 = 0; var14 < class_84.method_175(this.field_30659); var14++) {
                  this.field_30657[var14][var9][0] = var3[var14];
                  this.field_30657[var14][var9][1] = var3[class_84.method_175(this.field_30659) + var14];
               }
            }
         }
      } else {
         for (int var10 = this.field_30653; var10 < class_84.method_200(this.field_30659); var10 += this.field_30658) {
            for (byte var15 = 0; var15 < class_84.method_198(this.field_30659); var15 += 4) {
               for (int var17 = 0; var17 < class_84.method_175(this.field_30659); var17++) {
                  int var20 = class_84.method_175(this.field_30659) + var17;
                  var3[var17] = this.field_30657[var17][var10][var15];
                  var3[var20] = this.field_30657[var17][var10][var15 + 1];
                  var3[var20 + class_84.method_175(this.field_30659)] = this.field_30657[var17][var10][var15 + 2];
                  var3[var20 + 2 * class_84.method_175(this.field_30659)] = this.field_30657[var17][var10][var15 + 3];
               }

               class_84.method_181(this.field_30659).method_31294(var3, 0, this.field_30652);
               class_84.method_181(this.field_30659).method_31294(var3, class_84.method_175(this.field_30659), this.field_30652);
               class_84.method_181(this.field_30659).method_31294(var3, 2 * class_84.method_175(this.field_30659), this.field_30652);
               class_84.method_181(this.field_30659).method_31294(var3, 3 * class_84.method_175(this.field_30659), this.field_30652);

               for (int var18 = 0; var18 < class_84.method_175(this.field_30659); var18++) {
                  int var21 = class_84.method_175(this.field_30659) + var18;
                  this.field_30657[var18][var10][var15] = var3[var18];
                  this.field_30657[var18][var10][var15 + 1] = var3[var21];
                  this.field_30657[var18][var10][var15 + 2] = var3[var21 + class_84.method_175(this.field_30659)];
                  this.field_30657[var18][var10][var15 + 3] = var3[var21 + 2 * class_84.method_175(this.field_30659)];
               }
            }
         }
      }
   }
}
