package remapped;

public class class_3041 implements Runnable {
   private static String[] field_14920;

   public class_3041(class_5519 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field_14919 = var1;
      this.field_14921 = var2;
      this.field_14922 = var3;
      this.field_14923 = var4;
      this.field_14917 = var5;
      this.field_14924 = var6;
      this.field_14918 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_14921];
      if (class_5519.method_24997(this.field_14919) <= 2) {
         if (class_5519.method_24997(this.field_14919) == 2) {
            for (int var4 = 0; var4 < class_5519.method_24995(this.field_14919); var4++) {
               int var6 = var4 * class_5519.method_24997(this.field_14919) + 2 * this.field_14923;
               var3[var4] = this.field_14924[var6];
               var3[var4 + class_5519.method_24995(this.field_14919)] = this.field_14924[var6 + 1];
            }

            if (this.field_14922 != -1) {
               class_5519.method_24990(this.field_14919).method_19203(var3, 0, this.field_14918);
               class_5519.method_24990(this.field_14919).method_19203(var3, class_5519.method_24995(this.field_14919), this.field_14918);
            } else {
               class_5519.method_24990(this.field_14919).method_19196(var3, 0, this.field_14918);
               class_5519.method_24990(this.field_14919).method_19196(var3, class_5519.method_24995(this.field_14919), this.field_14918);
            }

            for (int var8 = 0; var8 < class_5519.method_24995(this.field_14919); var8++) {
               int var14 = var8 * class_5519.method_24997(this.field_14919) + 2 * this.field_14923;
               this.field_14924[var14] = var3[var8];
               this.field_14924[var14 + 1] = var3[var8 + class_5519.method_24995(this.field_14919)];
            }
         }
      } else if (this.field_14922 != -1) {
         for (int var9 = 4 * this.field_14923; var9 < class_5519.method_24997(this.field_14919); var9 += 4 * this.field_14917) {
            for (int var5 = 0; var5 < class_5519.method_24995(this.field_14919); var5++) {
               int var15 = var5 * class_5519.method_24997(this.field_14919) + var9;
               int var7 = class_5519.method_24995(this.field_14919) + var5;
               var3[var5] = this.field_14924[var15];
               var3[var7] = this.field_14924[var15 + 1];
               var3[var7 + class_5519.method_24995(this.field_14919)] = this.field_14924[var15 + 2];
               var3[var7 + 2 * class_5519.method_24995(this.field_14919)] = this.field_14924[var15 + 3];
            }

            class_5519.method_24990(this.field_14919).method_19203(var3, 0, this.field_14918);
            class_5519.method_24990(this.field_14919).method_19203(var3, class_5519.method_24995(this.field_14919), this.field_14918);
            class_5519.method_24990(this.field_14919).method_19203(var3, 2 * class_5519.method_24995(this.field_14919), this.field_14918);
            class_5519.method_24990(this.field_14919).method_19203(var3, 3 * class_5519.method_24995(this.field_14919), this.field_14918);

            for (int var11 = 0; var11 < class_5519.method_24995(this.field_14919); var11++) {
               int var16 = var11 * class_5519.method_24997(this.field_14919) + var9;
               int var19 = class_5519.method_24995(this.field_14919) + var11;
               this.field_14924[var16] = var3[var11];
               this.field_14924[var16 + 1] = var3[var19];
               this.field_14924[var16 + 2] = var3[var19 + class_5519.method_24995(this.field_14919)];
               this.field_14924[var16 + 3] = var3[var19 + 2 * class_5519.method_24995(this.field_14919)];
            }
         }
      } else {
         for (int var10 = 4 * this.field_14923; var10 < class_5519.method_24997(this.field_14919); var10 += 4 * this.field_14917) {
            for (int var12 = 0; var12 < class_5519.method_24995(this.field_14919); var12++) {
               int var17 = var12 * class_5519.method_24997(this.field_14919) + var10;
               int var20 = class_5519.method_24995(this.field_14919) + var12;
               var3[var12] = this.field_14924[var17];
               var3[var20] = this.field_14924[var17 + 1];
               var3[var20 + class_5519.method_24995(this.field_14919)] = this.field_14924[var17 + 2];
               var3[var20 + 2 * class_5519.method_24995(this.field_14919)] = this.field_14924[var17 + 3];
            }

            class_5519.method_24990(this.field_14919).method_19196(var3, 0, this.field_14918);
            class_5519.method_24990(this.field_14919).method_19196(var3, class_5519.method_24995(this.field_14919), this.field_14918);
            class_5519.method_24990(this.field_14919).method_19196(var3, 2 * class_5519.method_24995(this.field_14919), this.field_14918);
            class_5519.method_24990(this.field_14919).method_19196(var3, 3 * class_5519.method_24995(this.field_14919), this.field_14918);

            for (int var13 = 0; var13 < class_5519.method_24995(this.field_14919); var13++) {
               int var18 = var13 * class_5519.method_24997(this.field_14919) + var10;
               int var21 = class_5519.method_24995(this.field_14919) + var13;
               this.field_14924[var18] = var3[var13];
               this.field_14924[var18 + 1] = var3[var21];
               this.field_14924[var18 + 2] = var3[var21 + class_5519.method_24995(this.field_14919)];
               this.field_14924[var18 + 3] = var3[var21 + 2 * class_5519.method_24995(this.field_14919)];
            }
         }
      }
   }
}
