package remapped;

public class class_6602 implements Runnable {
   private static String[] field_34043;

   public class_6602(class_5519 var1, int var2, int var3, int var4, int var5, float[][] var6, boolean var7) {
      this.field_34042 = var1;
      this.field_34047 = var2;
      this.field_34049 = var3;
      this.field_34048 = var4;
      this.field_34045 = var5;
      this.field_34046 = var6;
      this.field_34044 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_34047];
      if (class_5519.method_24997(this.field_34042) <= 2) {
         if (class_5519.method_24997(this.field_34042) == 2) {
            for (int var4 = 0; var4 < class_5519.method_24995(this.field_34042); var4++) {
               var3[var4] = this.field_34046[var4][2 * this.field_34048];
               var3[var4 + class_5519.method_24995(this.field_34042)] = this.field_34046[var4][2 * this.field_34048 + 1];
            }

            if (this.field_34049 != -1) {
               class_5519.method_24990(this.field_34042).method_19203(var3, 0, this.field_34044);
               class_5519.method_24990(this.field_34042).method_19203(var3, class_5519.method_24995(this.field_34042), this.field_34044);
            } else {
               class_5519.method_24990(this.field_34042).method_19196(var3, 0, this.field_34044);
               class_5519.method_24990(this.field_34042).method_19196(var3, class_5519.method_24995(this.field_34042), this.field_34044);
            }

            for (int var7 = 0; var7 < class_5519.method_24995(this.field_34042); var7++) {
               this.field_34046[var7][2 * this.field_34048] = var3[var7];
               this.field_34046[var7][2 * this.field_34048 + 1] = var3[var7 + class_5519.method_24995(this.field_34042)];
            }
         }
      } else if (this.field_34049 != -1) {
         for (int var8 = 4 * this.field_34048; var8 < class_5519.method_24997(this.field_34042); var8 += 4 * this.field_34045) {
            for (int var5 = 0; var5 < class_5519.method_24995(this.field_34042); var5++) {
               int var6 = class_5519.method_24995(this.field_34042) + var5;
               var3[var5] = this.field_34046[var5][var8];
               var3[var6] = this.field_34046[var5][var8 + 1];
               var3[var6 + class_5519.method_24995(this.field_34042)] = this.field_34046[var5][var8 + 2];
               var3[var6 + 2 * class_5519.method_24995(this.field_34042)] = this.field_34046[var5][var8 + 3];
            }

            class_5519.method_24990(this.field_34042).method_19203(var3, 0, this.field_34044);
            class_5519.method_24990(this.field_34042).method_19203(var3, class_5519.method_24995(this.field_34042), this.field_34044);
            class_5519.method_24990(this.field_34042).method_19203(var3, 2 * class_5519.method_24995(this.field_34042), this.field_34044);
            class_5519.method_24990(this.field_34042).method_19203(var3, 3 * class_5519.method_24995(this.field_34042), this.field_34044);

            for (int var10 = 0; var10 < class_5519.method_24995(this.field_34042); var10++) {
               int var13 = class_5519.method_24995(this.field_34042) + var10;
               this.field_34046[var10][var8] = var3[var10];
               this.field_34046[var10][var8 + 1] = var3[var13];
               this.field_34046[var10][var8 + 2] = var3[var13 + class_5519.method_24995(this.field_34042)];
               this.field_34046[var10][var8 + 3] = var3[var13 + 2 * class_5519.method_24995(this.field_34042)];
            }
         }
      } else {
         for (int var9 = 4 * this.field_34048; var9 < class_5519.method_24997(this.field_34042); var9 += 4 * this.field_34045) {
            for (int var11 = 0; var11 < class_5519.method_24995(this.field_34042); var11++) {
               int var14 = class_5519.method_24995(this.field_34042) + var11;
               var3[var11] = this.field_34046[var11][var9];
               var3[var14] = this.field_34046[var11][var9 + 1];
               var3[var14 + class_5519.method_24995(this.field_34042)] = this.field_34046[var11][var9 + 2];
               var3[var14 + 2 * class_5519.method_24995(this.field_34042)] = this.field_34046[var11][var9 + 3];
            }

            class_5519.method_24990(this.field_34042).method_19196(var3, 0, this.field_34044);
            class_5519.method_24990(this.field_34042).method_19196(var3, class_5519.method_24995(this.field_34042), this.field_34044);
            class_5519.method_24990(this.field_34042).method_19196(var3, 2 * class_5519.method_24995(this.field_34042), this.field_34044);
            class_5519.method_24990(this.field_34042).method_19196(var3, 3 * class_5519.method_24995(this.field_34042), this.field_34044);

            for (int var12 = 0; var12 < class_5519.method_24995(this.field_34042); var12++) {
               int var15 = class_5519.method_24995(this.field_34042) + var12;
               this.field_34046[var12][var9] = var3[var12];
               this.field_34046[var12][var9 + 1] = var3[var15];
               this.field_34046[var12][var9 + 2] = var3[var15 + class_5519.method_24995(this.field_34042)];
               this.field_34046[var12][var9 + 3] = var3[var15 + 2 * class_5519.method_24995(this.field_34042)];
            }
         }
      }
   }
}
