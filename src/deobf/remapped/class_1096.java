package remapped;

public class class_1096 implements Runnable {
   private static String[] field_6050;

   public class_1096(class_7380 var1, int var2, int var3, int var4, int var5, double[][] var6, boolean var7) {
      this.field_6053 = var1;
      this.field_6052 = var2;
      this.field_6048 = var3;
      this.field_6049 = var4;
      this.field_6051 = var5;
      this.field_6046 = var6;
      this.field_6047 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_6052];
      if (class_7380.method_33621(this.field_6053) <= 2) {
         if (class_7380.method_33621(this.field_6053) == 2) {
            for (int var4 = 0; var4 < class_7380.method_33612(this.field_6053); var4++) {
               var3[var4] = this.field_6046[var4][2 * this.field_6049];
               var3[var4 + class_7380.method_33612(this.field_6053)] = this.field_6046[var4][2 * this.field_6049 + 1];
            }

            if (this.field_6048 != -1) {
               class_7380.method_33616(this.field_6053).method_31282(var3, 0, this.field_6047);
               class_7380.method_33616(this.field_6053).method_31282(var3, class_7380.method_33612(this.field_6053), this.field_6047);
            } else {
               class_7380.method_33616(this.field_6053).method_31276(var3, 0);
               class_7380.method_33616(this.field_6053).method_31276(var3, class_7380.method_33612(this.field_6053));
            }

            for (int var7 = 0; var7 < class_7380.method_33612(this.field_6053); var7++) {
               this.field_6046[var7][2 * this.field_6049] = var3[var7];
               this.field_6046[var7][2 * this.field_6049 + 1] = var3[var7 + class_7380.method_33612(this.field_6053)];
            }
         }
      } else if (this.field_6048 != -1) {
         for (int var8 = 4 * this.field_6049; var8 < class_7380.method_33621(this.field_6053); var8 += 4 * this.field_6051) {
            for (int var5 = 0; var5 < class_7380.method_33612(this.field_6053); var5++) {
               int var6 = class_7380.method_33612(this.field_6053) + var5;
               var3[var5] = this.field_6046[var5][var8];
               var3[var6] = this.field_6046[var5][var8 + 1];
               var3[var6 + class_7380.method_33612(this.field_6053)] = this.field_6046[var5][var8 + 2];
               var3[var6 + 2 * class_7380.method_33612(this.field_6053)] = this.field_6046[var5][var8 + 3];
            }

            class_7380.method_33616(this.field_6053).method_31282(var3, 0, this.field_6047);
            class_7380.method_33616(this.field_6053).method_31282(var3, class_7380.method_33612(this.field_6053), this.field_6047);
            class_7380.method_33616(this.field_6053).method_31282(var3, 2 * class_7380.method_33612(this.field_6053), this.field_6047);
            class_7380.method_33616(this.field_6053).method_31282(var3, 3 * class_7380.method_33612(this.field_6053), this.field_6047);

            for (int var10 = 0; var10 < class_7380.method_33612(this.field_6053); var10++) {
               int var13 = class_7380.method_33612(this.field_6053) + var10;
               this.field_6046[var10][var8] = var3[var10];
               this.field_6046[var10][var8 + 1] = var3[var13];
               this.field_6046[var10][var8 + 2] = var3[var13 + class_7380.method_33612(this.field_6053)];
               this.field_6046[var10][var8 + 3] = var3[var13 + 2 * class_7380.method_33612(this.field_6053)];
            }
         }
      } else {
         for (int var9 = 4 * this.field_6049; var9 < class_7380.method_33621(this.field_6053); var9 += 4 * this.field_6051) {
            for (int var11 = 0; var11 < class_7380.method_33612(this.field_6053); var11++) {
               int var14 = class_7380.method_33612(this.field_6053) + var11;
               var3[var11] = this.field_6046[var11][var9];
               var3[var14] = this.field_6046[var11][var9 + 1];
               var3[var14 + class_7380.method_33612(this.field_6053)] = this.field_6046[var11][var9 + 2];
               var3[var14 + 2 * class_7380.method_33612(this.field_6053)] = this.field_6046[var11][var9 + 3];
            }

            class_7380.method_33616(this.field_6053).method_31276(var3, 0);
            class_7380.method_33616(this.field_6053).method_31276(var3, class_7380.method_33612(this.field_6053));
            class_7380.method_33616(this.field_6053).method_31276(var3, 2 * class_7380.method_33612(this.field_6053));
            class_7380.method_33616(this.field_6053).method_31276(var3, 3 * class_7380.method_33612(this.field_6053));

            for (int var12 = 0; var12 < class_7380.method_33612(this.field_6053); var12++) {
               int var15 = class_7380.method_33612(this.field_6053) + var12;
               this.field_6046[var12][var9] = var3[var12];
               this.field_6046[var12][var9 + 1] = var3[var15];
               this.field_6046[var12][var9 + 2] = var3[var15 + class_7380.method_33612(this.field_6053)];
               this.field_6046[var12][var9 + 3] = var3[var15 + 2 * class_7380.method_33612(this.field_6053)];
            }
         }
      }
   }
}
