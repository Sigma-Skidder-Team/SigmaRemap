package remapped;

public class class_4065 implements Runnable {
   private static String[] field_19787;

   public class_4065(class_84 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field_19790 = var1;
      this.field_19791 = var2;
      this.field_19788 = var3;
      this.field_19786 = var4;
      this.field_19793 = var5;
      this.field_19789 = var6;
      this.field_19792 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_19791];
      if (this.field_19788 != -1) {
         if (class_84.method_198(this.field_19790) <= 2) {
            if (class_84.method_198(this.field_19790) == 2) {
               for (int var4 = this.field_19786; var4 < class_84.method_200(this.field_19790); var4 += this.field_19793) {
                  int var5 = var4 * class_84.method_188(this.field_19790);

                  for (int var6 = 0; var6 < class_84.method_175(this.field_19790); var6++) {
                     int var8 = var6 * class_84.method_180(this.field_19790) + var5;
                     var3[var6] = this.field_19789[var8];
                     var3[class_84.method_175(this.field_19790) + var6] = this.field_19789[var8 + 1];
                  }

                  class_84.method_181(this.field_19790).method_31288(var3, 0, this.field_19792);
                  class_84.method_181(this.field_19790).method_31288(var3, class_84.method_175(this.field_19790), this.field_19792);

                  for (int var16 = 0; var16 < class_84.method_175(this.field_19790); var16++) {
                     int var24 = var16 * class_84.method_180(this.field_19790) + var5;
                     this.field_19789[var24] = var3[var16];
                     this.field_19789[var24 + 1] = var3[class_84.method_175(this.field_19790) + var16];
                  }
               }
            }
         } else {
            for (int var10 = this.field_19786; var10 < class_84.method_200(this.field_19790); var10 += this.field_19793) {
               int var13 = var10 * class_84.method_188(this.field_19790);

               for (byte var17 = 0; var17 < class_84.method_198(this.field_19790); var17 += 4) {
                  for (int var7 = 0; var7 < class_84.method_175(this.field_19790); var7++) {
                     int var25 = var7 * class_84.method_180(this.field_19790) + var13 + var17;
                     int var9 = class_84.method_175(this.field_19790) + var7;
                     var3[var7] = this.field_19789[var25];
                     var3[var9] = this.field_19789[var25 + 1];
                     var3[var9 + class_84.method_175(this.field_19790)] = this.field_19789[var25 + 2];
                     var3[var9 + 2 * class_84.method_175(this.field_19790)] = this.field_19789[var25 + 3];
                  }

                  class_84.method_181(this.field_19790).method_31288(var3, 0, this.field_19792);
                  class_84.method_181(this.field_19790).method_31288(var3, class_84.method_175(this.field_19790), this.field_19792);
                  class_84.method_181(this.field_19790).method_31288(var3, 2 * class_84.method_175(this.field_19790), this.field_19792);
                  class_84.method_181(this.field_19790).method_31288(var3, 3 * class_84.method_175(this.field_19790), this.field_19792);

                  for (int var21 = 0; var21 < class_84.method_175(this.field_19790); var21++) {
                     int var26 = var21 * class_84.method_180(this.field_19790) + var13 + var17;
                     int var31 = class_84.method_175(this.field_19790) + var21;
                     this.field_19789[var26] = var3[var21];
                     this.field_19789[var26 + 1] = var3[var31];
                     this.field_19789[var26 + 2] = var3[var31 + class_84.method_175(this.field_19790)];
                     this.field_19789[var26 + 3] = var3[var31 + 2 * class_84.method_175(this.field_19790)];
                  }
               }
            }
         }
      } else if (class_84.method_198(this.field_19790) <= 2) {
         if (class_84.method_198(this.field_19790) == 2) {
            for (int var11 = this.field_19786; var11 < class_84.method_200(this.field_19790); var11 += this.field_19793) {
               int var14 = var11 * class_84.method_188(this.field_19790);

               for (int var18 = 0; var18 < class_84.method_175(this.field_19790); var18++) {
                  int var27 = var18 * class_84.method_180(this.field_19790) + var14;
                  var3[var18] = this.field_19789[var27];
                  var3[class_84.method_175(this.field_19790) + var18] = this.field_19789[var27 + 1];
               }

               class_84.method_181(this.field_19790).method_31294(var3, 0, this.field_19792);
               class_84.method_181(this.field_19790).method_31294(var3, class_84.method_175(this.field_19790), this.field_19792);

               for (int var19 = 0; var19 < class_84.method_175(this.field_19790); var19++) {
                  int var28 = var19 * class_84.method_180(this.field_19790) + var14;
                  this.field_19789[var28] = var3[var19];
                  this.field_19789[var28 + 1] = var3[class_84.method_175(this.field_19790) + var19];
               }
            }
         }
      } else {
         for (int var12 = this.field_19786; var12 < class_84.method_200(this.field_19790); var12 += this.field_19793) {
            int var15 = var12 * class_84.method_188(this.field_19790);

            for (byte var20 = 0; var20 < class_84.method_198(this.field_19790); var20 += 4) {
               for (int var22 = 0; var22 < class_84.method_175(this.field_19790); var22++) {
                  int var29 = var22 * class_84.method_180(this.field_19790) + var15 + var20;
                  int var32 = class_84.method_175(this.field_19790) + var22;
                  var3[var22] = this.field_19789[var29];
                  var3[var32] = this.field_19789[var29 + 1];
                  var3[var32 + class_84.method_175(this.field_19790)] = this.field_19789[var29 + 2];
                  var3[var32 + 2 * class_84.method_175(this.field_19790)] = this.field_19789[var29 + 3];
               }

               class_84.method_181(this.field_19790).method_31294(var3, 0, this.field_19792);
               class_84.method_181(this.field_19790).method_31294(var3, class_84.method_175(this.field_19790), this.field_19792);
               class_84.method_181(this.field_19790).method_31294(var3, 2 * class_84.method_175(this.field_19790), this.field_19792);
               class_84.method_181(this.field_19790).method_31294(var3, 3 * class_84.method_175(this.field_19790), this.field_19792);

               for (int var23 = 0; var23 < class_84.method_175(this.field_19790); var23++) {
                  int var30 = var23 * class_84.method_180(this.field_19790) + var15 + var20;
                  int var33 = class_84.method_175(this.field_19790) + var23;
                  this.field_19789[var30] = var3[var23];
                  this.field_19789[var30 + 1] = var3[var33];
                  this.field_19789[var30 + 2] = var3[var33 + class_84.method_175(this.field_19790)];
                  this.field_19789[var30 + 3] = var3[var33 + 2 * class_84.method_175(this.field_19790)];
               }
            }
         }
      }
   }
}
