package remapped;

public class class_7242 implements Runnable {
   private static String[] field_37152;

   public class_7242(class_6842 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field_37153 = var1;
      this.field_37146 = var2;
      this.field_37149 = var3;
      this.field_37147 = var4;
      this.field_37151 = var5;
      this.field_37150 = var6;
      this.field_37148 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_37146];
      if (class_6842.method_31373(this.field_37153) <= 2) {
         if (class_6842.method_31373(this.field_37153) == 2) {
            for (int var4 = 0; var4 < class_6842.method_31358(this.field_37153); var4++) {
               int var6 = var4 * class_6842.method_31373(this.field_37153) + 2 * this.field_37147;
               var3[var4] = this.field_37150[var6];
               var3[var4 + class_6842.method_31358(this.field_37153)] = this.field_37150[var6 + 1];
            }

            if (this.field_37149 != -1) {
               class_6842.method_31368(this.field_37153).method_31288(var3, 0, this.field_37148);
               class_6842.method_31368(this.field_37153).method_31288(var3, class_6842.method_31358(this.field_37153), this.field_37148);
            } else {
               class_6842.method_31368(this.field_37153).method_31294(var3, 0, this.field_37148);
               class_6842.method_31368(this.field_37153).method_31294(var3, class_6842.method_31358(this.field_37153), this.field_37148);
            }

            for (int var8 = 0; var8 < class_6842.method_31358(this.field_37153); var8++) {
               int var14 = var8 * class_6842.method_31373(this.field_37153) + 2 * this.field_37147;
               this.field_37150[var14] = var3[var8];
               this.field_37150[var14 + 1] = var3[var8 + class_6842.method_31358(this.field_37153)];
            }
         }
      } else if (this.field_37149 != -1) {
         for (int var9 = 4 * this.field_37147; var9 < class_6842.method_31373(this.field_37153); var9 += 4 * this.field_37151) {
            for (int var5 = 0; var5 < class_6842.method_31358(this.field_37153); var5++) {
               int var15 = var5 * class_6842.method_31373(this.field_37153) + var9;
               int var7 = class_6842.method_31358(this.field_37153) + var5;
               var3[var5] = this.field_37150[var15];
               var3[var7] = this.field_37150[var15 + 1];
               var3[var7 + class_6842.method_31358(this.field_37153)] = this.field_37150[var15 + 2];
               var3[var7 + 2 * class_6842.method_31358(this.field_37153)] = this.field_37150[var15 + 3];
            }

            class_6842.method_31368(this.field_37153).method_31288(var3, 0, this.field_37148);
            class_6842.method_31368(this.field_37153).method_31288(var3, class_6842.method_31358(this.field_37153), this.field_37148);
            class_6842.method_31368(this.field_37153).method_31288(var3, 2 * class_6842.method_31358(this.field_37153), this.field_37148);
            class_6842.method_31368(this.field_37153).method_31288(var3, 3 * class_6842.method_31358(this.field_37153), this.field_37148);

            for (int var11 = 0; var11 < class_6842.method_31358(this.field_37153); var11++) {
               int var16 = var11 * class_6842.method_31373(this.field_37153) + var9;
               int var19 = class_6842.method_31358(this.field_37153) + var11;
               this.field_37150[var16] = var3[var11];
               this.field_37150[var16 + 1] = var3[var19];
               this.field_37150[var16 + 2] = var3[var19 + class_6842.method_31358(this.field_37153)];
               this.field_37150[var16 + 3] = var3[var19 + 2 * class_6842.method_31358(this.field_37153)];
            }
         }
      } else {
         for (int var10 = 4 * this.field_37147; var10 < class_6842.method_31373(this.field_37153); var10 += 4 * this.field_37151) {
            for (int var12 = 0; var12 < class_6842.method_31358(this.field_37153); var12++) {
               int var17 = var12 * class_6842.method_31373(this.field_37153) + var10;
               int var20 = class_6842.method_31358(this.field_37153) + var12;
               var3[var12] = this.field_37150[var17];
               var3[var20] = this.field_37150[var17 + 1];
               var3[var20 + class_6842.method_31358(this.field_37153)] = this.field_37150[var17 + 2];
               var3[var20 + 2 * class_6842.method_31358(this.field_37153)] = this.field_37150[var17 + 3];
            }

            class_6842.method_31368(this.field_37153).method_31294(var3, 0, this.field_37148);
            class_6842.method_31368(this.field_37153).method_31294(var3, class_6842.method_31358(this.field_37153), this.field_37148);
            class_6842.method_31368(this.field_37153).method_31294(var3, 2 * class_6842.method_31358(this.field_37153), this.field_37148);
            class_6842.method_31368(this.field_37153).method_31294(var3, 3 * class_6842.method_31358(this.field_37153), this.field_37148);

            for (int var13 = 0; var13 < class_6842.method_31358(this.field_37153); var13++) {
               int var18 = var13 * class_6842.method_31373(this.field_37153) + var10;
               int var21 = class_6842.method_31358(this.field_37153) + var13;
               this.field_37150[var18] = var3[var13];
               this.field_37150[var18 + 1] = var3[var21];
               this.field_37150[var18 + 2] = var3[var21 + class_6842.method_31358(this.field_37153)];
               this.field_37150[var18 + 3] = var3[var21 + 2 * class_6842.method_31358(this.field_37153)];
            }
         }
      }
   }
}
