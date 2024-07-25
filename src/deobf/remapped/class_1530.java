package remapped;

public class class_1530 implements Runnable {
   private static String[] field_8126;

   public class_1530(class_2841 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field_8120 = var1;
      this.field_8127 = var2;
      this.field_8124 = var3;
      this.field_8121 = var4;
      this.field_8125 = var5;
      this.field_8122 = var6;
      this.field_8123 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_8127];
      if (this.field_8124 != -1) {
         if (class_2841.method_12908(this.field_8120) <= 2) {
            if (class_2841.method_12908(this.field_8120) == 2) {
               for (int var4 = this.field_8121; var4 < class_2841.method_12928(this.field_8120); var4 += this.field_8125) {
                  int var5 = var4 * class_2841.method_12922(this.field_8120);

                  for (int var6 = 0; var6 < class_2841.method_12914(this.field_8120); var6++) {
                     int var8 = var6 * class_2841.method_12913(this.field_8120) + var5;
                     var3[var6] = this.field_8122[var8];
                     var3[class_2841.method_12914(this.field_8120) + var6] = this.field_8122[var8 + 1];
                  }

                  class_2841.method_12933(this.field_8120).method_21131(var3, 0, this.field_8123);
                  class_2841.method_12933(this.field_8120).method_21131(var3, class_2841.method_12914(this.field_8120), this.field_8123);

                  for (int var16 = 0; var16 < class_2841.method_12914(this.field_8120); var16++) {
                     int var24 = var16 * class_2841.method_12913(this.field_8120) + var5;
                     this.field_8122[var24] = var3[var16];
                     this.field_8122[var24 + 1] = var3[class_2841.method_12914(this.field_8120) + var16];
                  }
               }
            }
         } else {
            for (int var10 = this.field_8121; var10 < class_2841.method_12928(this.field_8120); var10 += this.field_8125) {
               int var13 = var10 * class_2841.method_12922(this.field_8120);

               for (byte var17 = 0; var17 < class_2841.method_12908(this.field_8120); var17 += 4) {
                  for (int var7 = 0; var7 < class_2841.method_12914(this.field_8120); var7++) {
                     int var25 = var7 * class_2841.method_12913(this.field_8120) + var13 + var17;
                     int var9 = class_2841.method_12914(this.field_8120) + var7;
                     var3[var7] = this.field_8122[var25];
                     var3[var9] = this.field_8122[var25 + 1];
                     var3[var9 + class_2841.method_12914(this.field_8120)] = this.field_8122[var25 + 2];
                     var3[var9 + 2 * class_2841.method_12914(this.field_8120)] = this.field_8122[var25 + 3];
                  }

                  class_2841.method_12933(this.field_8120).method_21131(var3, 0, this.field_8123);
                  class_2841.method_12933(this.field_8120).method_21131(var3, class_2841.method_12914(this.field_8120), this.field_8123);
                  class_2841.method_12933(this.field_8120).method_21131(var3, 2 * class_2841.method_12914(this.field_8120), this.field_8123);
                  class_2841.method_12933(this.field_8120).method_21131(var3, 3 * class_2841.method_12914(this.field_8120), this.field_8123);

                  for (int var21 = 0; var21 < class_2841.method_12914(this.field_8120); var21++) {
                     int var26 = var21 * class_2841.method_12913(this.field_8120) + var13 + var17;
                     int var31 = class_2841.method_12914(this.field_8120) + var21;
                     this.field_8122[var26] = var3[var21];
                     this.field_8122[var26 + 1] = var3[var31];
                     this.field_8122[var26 + 2] = var3[var31 + class_2841.method_12914(this.field_8120)];
                     this.field_8122[var26 + 3] = var3[var31 + 2 * class_2841.method_12914(this.field_8120)];
                  }
               }
            }
         }
      } else if (class_2841.method_12908(this.field_8120) <= 2) {
         if (class_2841.method_12908(this.field_8120) == 2) {
            for (int var11 = this.field_8121; var11 < class_2841.method_12928(this.field_8120); var11 += this.field_8125) {
               int var14 = var11 * class_2841.method_12922(this.field_8120);

               for (int var18 = 0; var18 < class_2841.method_12914(this.field_8120); var18++) {
                  int var27 = var18 * class_2841.method_12913(this.field_8120) + var14;
                  var3[var18] = this.field_8122[var27];
                  var3[class_2841.method_12914(this.field_8120) + var18] = this.field_8122[var27 + 1];
               }

               class_2841.method_12933(this.field_8120).method_21139(var3, 0, this.field_8123);
               class_2841.method_12933(this.field_8120).method_21139(var3, class_2841.method_12914(this.field_8120), this.field_8123);

               for (int var19 = 0; var19 < class_2841.method_12914(this.field_8120); var19++) {
                  int var28 = var19 * class_2841.method_12913(this.field_8120) + var14;
                  this.field_8122[var28] = var3[var19];
                  this.field_8122[var28 + 1] = var3[class_2841.method_12914(this.field_8120) + var19];
               }
            }
         }
      } else {
         for (int var12 = this.field_8121; var12 < class_2841.method_12928(this.field_8120); var12 += this.field_8125) {
            int var15 = var12 * class_2841.method_12922(this.field_8120);

            for (byte var20 = 0; var20 < class_2841.method_12908(this.field_8120); var20 += 4) {
               for (int var22 = 0; var22 < class_2841.method_12914(this.field_8120); var22++) {
                  int var29 = var22 * class_2841.method_12913(this.field_8120) + var15 + var20;
                  int var32 = class_2841.method_12914(this.field_8120) + var22;
                  var3[var22] = this.field_8122[var29];
                  var3[var32] = this.field_8122[var29 + 1];
                  var3[var32 + class_2841.method_12914(this.field_8120)] = this.field_8122[var29 + 2];
                  var3[var32 + 2 * class_2841.method_12914(this.field_8120)] = this.field_8122[var29 + 3];
               }

               class_2841.method_12933(this.field_8120).method_21139(var3, 0, this.field_8123);
               class_2841.method_12933(this.field_8120).method_21139(var3, class_2841.method_12914(this.field_8120), this.field_8123);
               class_2841.method_12933(this.field_8120).method_21139(var3, 2 * class_2841.method_12914(this.field_8120), this.field_8123);
               class_2841.method_12933(this.field_8120).method_21139(var3, 3 * class_2841.method_12914(this.field_8120), this.field_8123);

               for (int var23 = 0; var23 < class_2841.method_12914(this.field_8120); var23++) {
                  int var30 = var23 * class_2841.method_12913(this.field_8120) + var15 + var20;
                  int var33 = class_2841.method_12914(this.field_8120) + var23;
                  this.field_8122[var30] = var3[var23];
                  this.field_8122[var30 + 1] = var3[var33];
                  this.field_8122[var30 + 2] = var3[var33 + class_2841.method_12914(this.field_8120)];
                  this.field_8122[var30 + 3] = var3[var33 + 2 * class_2841.method_12914(this.field_8120)];
               }
            }
         }
      }
   }
}
