package remapped;

public class class_8842 implements Runnable {
   private static String[] field_45217;

   public class_8842(class_7963 var1, int var2, int var3, int var4, int var5, double[][] var6, boolean var7) {
      this.field_45216 = var1;
      this.field_45215 = var2;
      this.field_45219 = var3;
      this.field_45220 = var4;
      this.field_45222 = var5;
      this.field_45218 = var6;
      this.field_45221 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_45215];
      if (class_7963.method_36038(this.field_45216) <= 2) {
         if (class_7963.method_36038(this.field_45216) == 2) {
            for (int var4 = 0; var4 < class_7963.method_36040(this.field_45216); var4++) {
               var3[var4] = this.field_45218[var4][2 * this.field_45220];
               var3[var4 + class_7963.method_36040(this.field_45216)] = this.field_45218[var4][2 * this.field_45220 + 1];
            }

            if (this.field_45219 != -1) {
               class_7963.method_36041(this.field_45216).method_44820(var3, 0, this.field_45221);
               class_7963.method_36041(this.field_45216).method_44820(var3, class_7963.method_36040(this.field_45216), this.field_45221);
            } else {
               class_7963.method_36041(this.field_45216).method_44815(var3, 0, this.field_45221);
               class_7963.method_36041(this.field_45216).method_44815(var3, class_7963.method_36040(this.field_45216), this.field_45221);
            }

            for (int var7 = 0; var7 < class_7963.method_36040(this.field_45216); var7++) {
               this.field_45218[var7][2 * this.field_45220] = var3[var7];
               this.field_45218[var7][2 * this.field_45220 + 1] = var3[var7 + class_7963.method_36040(this.field_45216)];
            }
         }
      } else if (this.field_45219 != -1) {
         for (int var8 = 4 * this.field_45220; var8 < class_7963.method_36038(this.field_45216); var8 += 4 * this.field_45222) {
            for (int var5 = 0; var5 < class_7963.method_36040(this.field_45216); var5++) {
               int var6 = class_7963.method_36040(this.field_45216) + var5;
               var3[var5] = this.field_45218[var5][var8];
               var3[var6] = this.field_45218[var5][var8 + 1];
               var3[var6 + class_7963.method_36040(this.field_45216)] = this.field_45218[var5][var8 + 2];
               var3[var6 + 2 * class_7963.method_36040(this.field_45216)] = this.field_45218[var5][var8 + 3];
            }

            class_7963.method_36041(this.field_45216).method_44820(var3, 0, this.field_45221);
            class_7963.method_36041(this.field_45216).method_44820(var3, class_7963.method_36040(this.field_45216), this.field_45221);
            class_7963.method_36041(this.field_45216).method_44820(var3, 2 * class_7963.method_36040(this.field_45216), this.field_45221);
            class_7963.method_36041(this.field_45216).method_44820(var3, 3 * class_7963.method_36040(this.field_45216), this.field_45221);

            for (int var10 = 0; var10 < class_7963.method_36040(this.field_45216); var10++) {
               int var13 = class_7963.method_36040(this.field_45216) + var10;
               this.field_45218[var10][var8] = var3[var10];
               this.field_45218[var10][var8 + 1] = var3[var13];
               this.field_45218[var10][var8 + 2] = var3[var13 + class_7963.method_36040(this.field_45216)];
               this.field_45218[var10][var8 + 3] = var3[var13 + 2 * class_7963.method_36040(this.field_45216)];
            }
         }
      } else {
         for (int var9 = 4 * this.field_45220; var9 < class_7963.method_36038(this.field_45216); var9 += 4 * this.field_45222) {
            for (int var11 = 0; var11 < class_7963.method_36040(this.field_45216); var11++) {
               int var14 = class_7963.method_36040(this.field_45216) + var11;
               var3[var11] = this.field_45218[var11][var9];
               var3[var14] = this.field_45218[var11][var9 + 1];
               var3[var14 + class_7963.method_36040(this.field_45216)] = this.field_45218[var11][var9 + 2];
               var3[var14 + 2 * class_7963.method_36040(this.field_45216)] = this.field_45218[var11][var9 + 3];
            }

            class_7963.method_36041(this.field_45216).method_44815(var3, 0, this.field_45221);
            class_7963.method_36041(this.field_45216).method_44815(var3, class_7963.method_36040(this.field_45216), this.field_45221);
            class_7963.method_36041(this.field_45216).method_44815(var3, 2 * class_7963.method_36040(this.field_45216), this.field_45221);
            class_7963.method_36041(this.field_45216).method_44815(var3, 3 * class_7963.method_36040(this.field_45216), this.field_45221);

            for (int var12 = 0; var12 < class_7963.method_36040(this.field_45216); var12++) {
               int var15 = class_7963.method_36040(this.field_45216) + var12;
               this.field_45218[var12][var9] = var3[var12];
               this.field_45218[var12][var9 + 1] = var3[var15];
               this.field_45218[var12][var9 + 2] = var3[var15 + class_7963.method_36040(this.field_45216)];
               this.field_45218[var12][var9 + 3] = var3[var15 + 2 * class_7963.method_36040(this.field_45216)];
            }
         }
      }
   }
}
