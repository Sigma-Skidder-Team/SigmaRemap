package remapped;

public class class_3935 implements Runnable {
   private static String[] field_19116;

   public class_3935(class_6842 var1, int var2, int var3, int var4, int var5, double[][] var6, boolean var7) {
      this.field_19121 = var1;
      this.field_19122 = var2;
      this.field_19120 = var3;
      this.field_19119 = var4;
      this.field_19118 = var5;
      this.field_19117 = var6;
      this.field_19115 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_19122];
      if (class_6842.method_31373(this.field_19121) <= 2) {
         if (class_6842.method_31373(this.field_19121) == 2) {
            for (int var4 = 0; var4 < class_6842.method_31358(this.field_19121); var4++) {
               var3[var4] = this.field_19117[var4][2 * this.field_19119];
               var3[var4 + class_6842.method_31358(this.field_19121)] = this.field_19117[var4][2 * this.field_19119 + 1];
            }

            if (this.field_19120 != -1) {
               class_6842.method_31368(this.field_19121).method_31288(var3, 0, this.field_19115);
               class_6842.method_31368(this.field_19121).method_31288(var3, class_6842.method_31358(this.field_19121), this.field_19115);
            } else {
               class_6842.method_31368(this.field_19121).method_31294(var3, 0, this.field_19115);
               class_6842.method_31368(this.field_19121).method_31294(var3, class_6842.method_31358(this.field_19121), this.field_19115);
            }

            for (int var7 = 0; var7 < class_6842.method_31358(this.field_19121); var7++) {
               this.field_19117[var7][2 * this.field_19119] = var3[var7];
               this.field_19117[var7][2 * this.field_19119 + 1] = var3[var7 + class_6842.method_31358(this.field_19121)];
            }
         }
      } else if (this.field_19120 != -1) {
         for (int var8 = 4 * this.field_19119; var8 < class_6842.method_31373(this.field_19121); var8 += 4 * this.field_19118) {
            for (int var5 = 0; var5 < class_6842.method_31358(this.field_19121); var5++) {
               int var6 = class_6842.method_31358(this.field_19121) + var5;
               var3[var5] = this.field_19117[var5][var8];
               var3[var6] = this.field_19117[var5][var8 + 1];
               var3[var6 + class_6842.method_31358(this.field_19121)] = this.field_19117[var5][var8 + 2];
               var3[var6 + 2 * class_6842.method_31358(this.field_19121)] = this.field_19117[var5][var8 + 3];
            }

            class_6842.method_31368(this.field_19121).method_31288(var3, 0, this.field_19115);
            class_6842.method_31368(this.field_19121).method_31288(var3, class_6842.method_31358(this.field_19121), this.field_19115);
            class_6842.method_31368(this.field_19121).method_31288(var3, 2 * class_6842.method_31358(this.field_19121), this.field_19115);
            class_6842.method_31368(this.field_19121).method_31288(var3, 3 * class_6842.method_31358(this.field_19121), this.field_19115);

            for (int var10 = 0; var10 < class_6842.method_31358(this.field_19121); var10++) {
               int var13 = class_6842.method_31358(this.field_19121) + var10;
               this.field_19117[var10][var8] = var3[var10];
               this.field_19117[var10][var8 + 1] = var3[var13];
               this.field_19117[var10][var8 + 2] = var3[var13 + class_6842.method_31358(this.field_19121)];
               this.field_19117[var10][var8 + 3] = var3[var13 + 2 * class_6842.method_31358(this.field_19121)];
            }
         }
      } else {
         for (int var9 = 4 * this.field_19119; var9 < class_6842.method_31373(this.field_19121); var9 += 4 * this.field_19118) {
            for (int var11 = 0; var11 < class_6842.method_31358(this.field_19121); var11++) {
               int var14 = class_6842.method_31358(this.field_19121) + var11;
               var3[var11] = this.field_19117[var11][var9];
               var3[var14] = this.field_19117[var11][var9 + 1];
               var3[var14 + class_6842.method_31358(this.field_19121)] = this.field_19117[var11][var9 + 2];
               var3[var14 + 2 * class_6842.method_31358(this.field_19121)] = this.field_19117[var11][var9 + 3];
            }

            class_6842.method_31368(this.field_19121).method_31294(var3, 0, this.field_19115);
            class_6842.method_31368(this.field_19121).method_31294(var3, class_6842.method_31358(this.field_19121), this.field_19115);
            class_6842.method_31368(this.field_19121).method_31294(var3, 2 * class_6842.method_31358(this.field_19121), this.field_19115);
            class_6842.method_31368(this.field_19121).method_31294(var3, 3 * class_6842.method_31358(this.field_19121), this.field_19115);

            for (int var12 = 0; var12 < class_6842.method_31358(this.field_19121); var12++) {
               int var15 = class_6842.method_31358(this.field_19121) + var12;
               this.field_19117[var12][var9] = var3[var12];
               this.field_19117[var12][var9 + 1] = var3[var15];
               this.field_19117[var12][var9 + 2] = var3[var15 + class_6842.method_31358(this.field_19121)];
               this.field_19117[var12][var9 + 3] = var3[var15 + 2 * class_6842.method_31358(this.field_19121)];
            }
         }
      }
   }
}
