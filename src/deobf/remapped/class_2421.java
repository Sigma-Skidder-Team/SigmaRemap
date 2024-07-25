package remapped;

public class class_2421 implements Runnable {
   private static String[] field_12054;

   public class_2421(class_8751 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field_12053 = var1;
      this.field_12058 = var2;
      this.field_12057 = var3;
      this.field_12055 = var4;
      this.field_12060 = var5;
      this.field_12056 = var6;
      this.field_12059 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_12058];
      if (class_8751.method_40179(this.field_12053) <= 2) {
         if (class_8751.method_40179(this.field_12053) == 2) {
            for (int var4 = 0; var4 < class_8751.method_40170(this.field_12053); var4++) {
               int var6 = var4 * class_8751.method_40179(this.field_12053) + 2 * this.field_12055;
               var3[var4] = this.field_12056[var6];
               var3[var4 + class_8751.method_40170(this.field_12053)] = this.field_12056[var6 + 1];
            }

            if (this.field_12057 != -1) {
               class_8751.method_40180(this.field_12053).method_21131(var3, 0, this.field_12059);
               class_8751.method_40180(this.field_12053).method_21131(var3, class_8751.method_40170(this.field_12053), this.field_12059);
            } else {
               class_8751.method_40180(this.field_12053).method_21139(var3, 0, this.field_12059);
               class_8751.method_40180(this.field_12053).method_21139(var3, class_8751.method_40170(this.field_12053), this.field_12059);
            }

            for (int var8 = 0; var8 < class_8751.method_40170(this.field_12053); var8++) {
               int var14 = var8 * class_8751.method_40179(this.field_12053) + 2 * this.field_12055;
               this.field_12056[var14] = var3[var8];
               this.field_12056[var14 + 1] = var3[var8 + class_8751.method_40170(this.field_12053)];
            }
         }
      } else if (this.field_12057 != -1) {
         for (int var9 = 4 * this.field_12055; var9 < class_8751.method_40179(this.field_12053); var9 += 4 * this.field_12060) {
            for (int var5 = 0; var5 < class_8751.method_40170(this.field_12053); var5++) {
               int var15 = var5 * class_8751.method_40179(this.field_12053) + var9;
               int var7 = class_8751.method_40170(this.field_12053) + var5;
               var3[var5] = this.field_12056[var15];
               var3[var7] = this.field_12056[var15 + 1];
               var3[var7 + class_8751.method_40170(this.field_12053)] = this.field_12056[var15 + 2];
               var3[var7 + 2 * class_8751.method_40170(this.field_12053)] = this.field_12056[var15 + 3];
            }

            class_8751.method_40180(this.field_12053).method_21132(var3, this.field_12059);
            class_8751.method_40180(this.field_12053).method_21131(var3, class_8751.method_40170(this.field_12053), this.field_12059);
            class_8751.method_40180(this.field_12053).method_21131(var3, 2 * class_8751.method_40170(this.field_12053), this.field_12059);
            class_8751.method_40180(this.field_12053).method_21131(var3, 3 * class_8751.method_40170(this.field_12053), this.field_12059);

            for (int var11 = 0; var11 < class_8751.method_40170(this.field_12053); var11++) {
               int var16 = var11 * class_8751.method_40179(this.field_12053) + var9;
               int var19 = class_8751.method_40170(this.field_12053) + var11;
               this.field_12056[var16] = var3[var11];
               this.field_12056[var16 + 1] = var3[var19];
               this.field_12056[var16 + 2] = var3[var19 + class_8751.method_40170(this.field_12053)];
               this.field_12056[var16 + 3] = var3[var19 + 2 * class_8751.method_40170(this.field_12053)];
            }
         }
      } else {
         for (int var10 = 4 * this.field_12055; var10 < class_8751.method_40179(this.field_12053); var10 += 4 * this.field_12060) {
            for (int var12 = 0; var12 < class_8751.method_40170(this.field_12053); var12++) {
               int var17 = var12 * class_8751.method_40179(this.field_12053) + var10;
               int var20 = class_8751.method_40170(this.field_12053) + var12;
               var3[var12] = this.field_12056[var17];
               var3[var20] = this.field_12056[var17 + 1];
               var3[var20 + class_8751.method_40170(this.field_12053)] = this.field_12056[var17 + 2];
               var3[var20 + 2 * class_8751.method_40170(this.field_12053)] = this.field_12056[var17 + 3];
            }

            class_8751.method_40180(this.field_12053).method_21139(var3, 0, this.field_12059);
            class_8751.method_40180(this.field_12053).method_21139(var3, class_8751.method_40170(this.field_12053), this.field_12059);
            class_8751.method_40180(this.field_12053).method_21139(var3, 2 * class_8751.method_40170(this.field_12053), this.field_12059);
            class_8751.method_40180(this.field_12053).method_21139(var3, 3 * class_8751.method_40170(this.field_12053), this.field_12059);

            for (int var13 = 0; var13 < class_8751.method_40170(this.field_12053); var13++) {
               int var18 = var13 * class_8751.method_40179(this.field_12053) + var10;
               int var21 = class_8751.method_40170(this.field_12053) + var13;
               this.field_12056[var18] = var3[var13];
               this.field_12056[var18 + 1] = var3[var21];
               this.field_12056[var18 + 2] = var3[var21 + class_8751.method_40170(this.field_12053)];
               this.field_12056[var18 + 3] = var3[var21 + 2 * class_8751.method_40170(this.field_12053)];
            }
         }
      }
   }
}
