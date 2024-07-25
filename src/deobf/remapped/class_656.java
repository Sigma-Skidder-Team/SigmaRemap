package remapped;

public class class_656 implements Runnable {
   private static String[] field_3642;

   public class_656(class_2817 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field_3645 = var1;
      this.field_3646 = var2;
      this.field_3644 = var3;
      this.field_3643 = var4;
      this.field_3648 = var5;
      this.field_3647 = var6;
      this.field_3649 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_3646];
      if (class_2817.method_12836(this.field_3645) <= 2) {
         if (class_2817.method_12836(this.field_3645) == 2) {
            for (int var4 = 0; var4 < class_2817.method_12821(this.field_3645); var4++) {
               int var6 = var4 * class_2817.method_12836(this.field_3645) + 2 * this.field_3643;
               var3[var4] = this.field_3647[var6];
               var3[var4 + class_2817.method_12821(this.field_3645)] = this.field_3647[var6 + 1];
            }

            if (this.field_3644 != -1) {
               class_2817.method_12837(this.field_3645).method_17789(var3, 0, this.field_3649);
               class_2817.method_12837(this.field_3645).method_17789(var3, class_2817.method_12821(this.field_3645), this.field_3649);
            } else {
               class_2817.method_12837(this.field_3645).method_17786(var3, 0);
               class_2817.method_12837(this.field_3645).method_17786(var3, class_2817.method_12821(this.field_3645));
            }

            for (int var8 = 0; var8 < class_2817.method_12821(this.field_3645); var8++) {
               int var14 = var8 * class_2817.method_12836(this.field_3645) + 2 * this.field_3643;
               this.field_3647[var14] = var3[var8];
               this.field_3647[var14 + 1] = var3[var8 + class_2817.method_12821(this.field_3645)];
            }
         }
      } else if (this.field_3644 != -1) {
         for (int var9 = 4 * this.field_3643; var9 < class_2817.method_12836(this.field_3645); var9 += 4 * this.field_3648) {
            for (int var5 = 0; var5 < class_2817.method_12821(this.field_3645); var5++) {
               int var15 = var5 * class_2817.method_12836(this.field_3645) + var9;
               int var7 = class_2817.method_12821(this.field_3645) + var5;
               var3[var5] = this.field_3647[var15];
               var3[var7] = this.field_3647[var15 + 1];
               var3[var7 + class_2817.method_12821(this.field_3645)] = this.field_3647[var15 + 2];
               var3[var7 + 2 * class_2817.method_12821(this.field_3645)] = this.field_3647[var15 + 3];
            }

            class_2817.method_12837(this.field_3645).method_17789(var3, 0, this.field_3649);
            class_2817.method_12837(this.field_3645).method_17789(var3, class_2817.method_12821(this.field_3645), this.field_3649);
            class_2817.method_12837(this.field_3645).method_17789(var3, 2 * class_2817.method_12821(this.field_3645), this.field_3649);
            class_2817.method_12837(this.field_3645).method_17789(var3, 3 * class_2817.method_12821(this.field_3645), this.field_3649);

            for (int var11 = 0; var11 < class_2817.method_12821(this.field_3645); var11++) {
               int var16 = var11 * class_2817.method_12836(this.field_3645) + var9;
               int var19 = class_2817.method_12821(this.field_3645) + var11;
               this.field_3647[var16] = var3[var11];
               this.field_3647[var16 + 1] = var3[var19];
               this.field_3647[var16 + 2] = var3[var19 + class_2817.method_12821(this.field_3645)];
               this.field_3647[var16 + 3] = var3[var19 + 2 * class_2817.method_12821(this.field_3645)];
            }
         }
      } else {
         for (int var10 = 4 * this.field_3643; var10 < class_2817.method_12836(this.field_3645); var10 += 4 * this.field_3648) {
            for (int var12 = 0; var12 < class_2817.method_12821(this.field_3645); var12++) {
               int var17 = var12 * class_2817.method_12836(this.field_3645) + var10;
               int var20 = class_2817.method_12821(this.field_3645) + var12;
               var3[var12] = this.field_3647[var17];
               var3[var20] = this.field_3647[var17 + 1];
               var3[var20 + class_2817.method_12821(this.field_3645)] = this.field_3647[var17 + 2];
               var3[var20 + 2 * class_2817.method_12821(this.field_3645)] = this.field_3647[var17 + 3];
            }

            class_2817.method_12837(this.field_3645).method_17786(var3, 0);
            class_2817.method_12837(this.field_3645).method_17786(var3, class_2817.method_12821(this.field_3645));
            class_2817.method_12837(this.field_3645).method_17786(var3, 2 * class_2817.method_12821(this.field_3645));
            class_2817.method_12837(this.field_3645).method_17786(var3, 3 * class_2817.method_12821(this.field_3645));

            for (int var13 = 0; var13 < class_2817.method_12821(this.field_3645); var13++) {
               int var18 = var13 * class_2817.method_12836(this.field_3645) + var10;
               int var21 = class_2817.method_12821(this.field_3645) + var13;
               this.field_3647[var18] = var3[var13];
               this.field_3647[var18 + 1] = var3[var21];
               this.field_3647[var18 + 2] = var3[var21 + class_2817.method_12821(this.field_3645)];
               this.field_3647[var18 + 3] = var3[var21 + 2 * class_2817.method_12821(this.field_3645)];
            }
         }
      }
   }
}
