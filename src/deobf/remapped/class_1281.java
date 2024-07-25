package remapped;

public class class_1281 implements Runnable {
   private static String[] field_7045;

   public class_1281(class_6056 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field_7043 = var1;
      this.field_7044 = var2;
      this.field_7050 = var3;
      this.field_7048 = var4;
      this.field_7049 = var5;
      this.field_7046 = var6;
      this.field_7047 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_7044];
      if (this.field_7050 != -1) {
         for (int var4 = this.field_7048; var4 < class_6056.method_27671(this.field_7043); var4 += this.field_7049) {
            int var5 = var4 * class_6056.method_27649(this.field_7043);

            for (int var6 = 0; var6 < class_6056.method_27660(this.field_7043); var6++) {
               class_6056.method_27665(this.field_7043).method_31282(this.field_7046, var5 + var6 * class_6056.method_27661(this.field_7043), this.field_7047);
            }

            if (class_6056.method_27666(this.field_7043) <= 2) {
               if (class_6056.method_27666(this.field_7043) == 2) {
                  for (int var13 = 0; var13 < class_6056.method_27660(this.field_7043); var13++) {
                     int var23 = var5 + var13 * class_6056.method_27661(this.field_7043);
                     var3[var13] = this.field_7046[var23];
                     var3[class_6056.method_27660(this.field_7043) + var13] = this.field_7046[var23 + 1];
                  }

                  class_6056.method_27680(this.field_7043).method_31282(var3, 0, this.field_7047);
                  class_6056.method_27680(this.field_7043).method_31282(var3, class_6056.method_27660(this.field_7043), this.field_7047);

                  for (int var14 = 0; var14 < class_6056.method_27660(this.field_7043); var14++) {
                     int var24 = var5 + var14 * class_6056.method_27661(this.field_7043);
                     this.field_7046[var24] = var3[var14];
                     this.field_7046[var24 + 1] = var3[class_6056.method_27660(this.field_7043) + var14];
                  }
               }
            } else {
               for (byte var12 = 0; var12 < class_6056.method_27666(this.field_7043); var12 += 4) {
                  for (int var7 = 0; var7 < class_6056.method_27660(this.field_7043); var7++) {
                     int var8 = var5 + var7 * class_6056.method_27661(this.field_7043) + var12;
                     int var9 = class_6056.method_27660(this.field_7043) + var7;
                     var3[var7] = this.field_7046[var8];
                     var3[var9] = this.field_7046[var8 + 1];
                     var3[var9 + class_6056.method_27660(this.field_7043)] = this.field_7046[var8 + 2];
                     var3[var9 + 2 * class_6056.method_27660(this.field_7043)] = this.field_7046[var8 + 3];
                  }

                  class_6056.method_27680(this.field_7043).method_31282(var3, 0, this.field_7047);
                  class_6056.method_27680(this.field_7043).method_31282(var3, class_6056.method_27660(this.field_7043), this.field_7047);
                  class_6056.method_27680(this.field_7043).method_31282(var3, 2 * class_6056.method_27660(this.field_7043), this.field_7047);
                  class_6056.method_27680(this.field_7043).method_31282(var3, 3 * class_6056.method_27660(this.field_7043), this.field_7047);

                  for (int var19 = 0; var19 < class_6056.method_27660(this.field_7043); var19++) {
                     int var22 = var5 + var19 * class_6056.method_27661(this.field_7043) + var12;
                     int var29 = class_6056.method_27660(this.field_7043) + var19;
                     this.field_7046[var22] = var3[var19];
                     this.field_7046[var22 + 1] = var3[var29];
                     this.field_7046[var22 + 2] = var3[var29 + class_6056.method_27660(this.field_7043)];
                     this.field_7046[var22 + 3] = var3[var29 + 2 * class_6056.method_27660(this.field_7043)];
                  }
               }
            }
         }
      } else {
         for (int var10 = this.field_7048; var10 < class_6056.method_27671(this.field_7043); var10 += this.field_7049) {
            int var11 = var10 * class_6056.method_27649(this.field_7043);

            for (int var15 = 0; var15 < class_6056.method_27660(this.field_7043); var15++) {
               class_6056.method_27665(this.field_7043).method_31276(this.field_7046, var11 + var15 * class_6056.method_27661(this.field_7043));
            }

            if (class_6056.method_27666(this.field_7043) <= 2) {
               if (class_6056.method_27666(this.field_7043) == 2) {
                  for (int var17 = 0; var17 < class_6056.method_27660(this.field_7043); var17++) {
                     int var27 = var11 + var17 * class_6056.method_27661(this.field_7043);
                     var3[var17] = this.field_7046[var27];
                     var3[class_6056.method_27660(this.field_7043) + var17] = this.field_7046[var27 + 1];
                  }

                  class_6056.method_27680(this.field_7043).method_31276(var3, 0);
                  class_6056.method_27680(this.field_7043).method_31276(var3, class_6056.method_27660(this.field_7043));

                  for (int var18 = 0; var18 < class_6056.method_27660(this.field_7043); var18++) {
                     int var28 = var11 + var18 * class_6056.method_27661(this.field_7043);
                     this.field_7046[var28] = var3[var18];
                     this.field_7046[var28 + 1] = var3[class_6056.method_27660(this.field_7043) + var18];
                  }
               }
            } else {
               for (byte var16 = 0; var16 < class_6056.method_27666(this.field_7043); var16 += 4) {
                  for (int var20 = 0; var20 < class_6056.method_27660(this.field_7043); var20++) {
                     int var25 = var11 + var20 * class_6056.method_27661(this.field_7043) + var16;
                     int var30 = class_6056.method_27660(this.field_7043) + var20;
                     var3[var20] = this.field_7046[var25];
                     var3[var30] = this.field_7046[var25 + 1];
                     var3[var30 + class_6056.method_27660(this.field_7043)] = this.field_7046[var25 + 2];
                     var3[var30 + 2 * class_6056.method_27660(this.field_7043)] = this.field_7046[var25 + 3];
                  }

                  class_6056.method_27680(this.field_7043).method_31276(var3, 0);
                  class_6056.method_27680(this.field_7043).method_31276(var3, class_6056.method_27660(this.field_7043));
                  class_6056.method_27680(this.field_7043).method_31276(var3, 2 * class_6056.method_27660(this.field_7043));
                  class_6056.method_27680(this.field_7043).method_31276(var3, 3 * class_6056.method_27660(this.field_7043));

                  for (int var21 = 0; var21 < class_6056.method_27660(this.field_7043); var21++) {
                     int var26 = var11 + var21 * class_6056.method_27661(this.field_7043) + var16;
                     int var31 = class_6056.method_27660(this.field_7043) + var21;
                     this.field_7046[var26] = var3[var21];
                     this.field_7046[var26 + 1] = var3[var31];
                     this.field_7046[var26 + 2] = var3[var31 + class_6056.method_27660(this.field_7043)];
                     this.field_7046[var26 + 3] = var3[var31 + 2 * class_6056.method_27660(this.field_7043)];
                  }
               }
            }
         }
      }
   }
}
