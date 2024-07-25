package remapped;

public class class_2824 implements Runnable {
   private static String[] field_13856;

   public class_2824(class_8751 var1, int var2, int var3, int var4, int var5, float[][] var6, boolean var7) {
      this.field_13853 = var1;
      this.field_13851 = var2;
      this.field_13855 = var3;
      this.field_13854 = var4;
      this.field_13849 = var5;
      this.field_13850 = var6;
      this.field_13852 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_13851];
      if (class_8751.method_40179(this.field_13853) <= 2) {
         if (class_8751.method_40179(this.field_13853) == 2) {
            for (int var4 = 0; var4 < class_8751.method_40170(this.field_13853); var4++) {
               var3[var4] = this.field_13850[var4][2 * this.field_13854];
               var3[var4 + class_8751.method_40170(this.field_13853)] = this.field_13850[var4][2 * this.field_13854 + 1];
            }

            if (this.field_13855 != -1) {
               class_8751.method_40180(this.field_13853).method_21131(var3, 0, this.field_13852);
               class_8751.method_40180(this.field_13853).method_21131(var3, class_8751.method_40170(this.field_13853), this.field_13852);
            } else {
               class_8751.method_40180(this.field_13853).method_21139(var3, 0, this.field_13852);
               class_8751.method_40180(this.field_13853).method_21139(var3, class_8751.method_40170(this.field_13853), this.field_13852);
            }

            for (int var7 = 0; var7 < class_8751.method_40170(this.field_13853); var7++) {
               this.field_13850[var7][2 * this.field_13854] = var3[var7];
               this.field_13850[var7][2 * this.field_13854 + 1] = var3[var7 + class_8751.method_40170(this.field_13853)];
            }
         }
      } else if (this.field_13855 != -1) {
         for (int var8 = 4 * this.field_13854; var8 < class_8751.method_40179(this.field_13853); var8 += 4 * this.field_13849) {
            for (int var5 = 0; var5 < class_8751.method_40170(this.field_13853); var5++) {
               int var6 = class_8751.method_40170(this.field_13853) + var5;
               var3[var5] = this.field_13850[var5][var8];
               var3[var6] = this.field_13850[var5][var8 + 1];
               var3[var6 + class_8751.method_40170(this.field_13853)] = this.field_13850[var5][var8 + 2];
               var3[var6 + 2 * class_8751.method_40170(this.field_13853)] = this.field_13850[var5][var8 + 3];
            }

            class_8751.method_40180(this.field_13853).method_21131(var3, 0, this.field_13852);
            class_8751.method_40180(this.field_13853).method_21131(var3, class_8751.method_40170(this.field_13853), this.field_13852);
            class_8751.method_40180(this.field_13853).method_21131(var3, 2 * class_8751.method_40170(this.field_13853), this.field_13852);
            class_8751.method_40180(this.field_13853).method_21131(var3, 3 * class_8751.method_40170(this.field_13853), this.field_13852);

            for (int var10 = 0; var10 < class_8751.method_40170(this.field_13853); var10++) {
               int var13 = class_8751.method_40170(this.field_13853) + var10;
               this.field_13850[var10][var8] = var3[var10];
               this.field_13850[var10][var8 + 1] = var3[var13];
               this.field_13850[var10][var8 + 2] = var3[var13 + class_8751.method_40170(this.field_13853)];
               this.field_13850[var10][var8 + 3] = var3[var13 + 2 * class_8751.method_40170(this.field_13853)];
            }
         }
      } else {
         for (int var9 = 4 * this.field_13854; var9 < class_8751.method_40179(this.field_13853); var9 += 4 * this.field_13849) {
            for (int var11 = 0; var11 < class_8751.method_40170(this.field_13853); var11++) {
               int var14 = class_8751.method_40170(this.field_13853) + var11;
               var3[var11] = this.field_13850[var11][var9];
               var3[var14] = this.field_13850[var11][var9 + 1];
               var3[var14 + class_8751.method_40170(this.field_13853)] = this.field_13850[var11][var9 + 2];
               var3[var14 + 2 * class_8751.method_40170(this.field_13853)] = this.field_13850[var11][var9 + 3];
            }

            class_8751.method_40180(this.field_13853).method_21139(var3, 0, this.field_13852);
            class_8751.method_40180(this.field_13853).method_21139(var3, class_8751.method_40170(this.field_13853), this.field_13852);
            class_8751.method_40180(this.field_13853).method_21139(var3, 2 * class_8751.method_40170(this.field_13853), this.field_13852);
            class_8751.method_40180(this.field_13853).method_21139(var3, 3 * class_8751.method_40170(this.field_13853), this.field_13852);

            for (int var12 = 0; var12 < class_8751.method_40170(this.field_13853); var12++) {
               int var15 = class_8751.method_40170(this.field_13853) + var12;
               this.field_13850[var12][var9] = var3[var12];
               this.field_13850[var12][var9 + 1] = var3[var15];
               this.field_13850[var12][var9 + 2] = var3[var15 + class_8751.method_40170(this.field_13853)];
               this.field_13850[var12][var9 + 3] = var3[var15 + 2 * class_8751.method_40170(this.field_13853)];
            }
         }
      }
   }
}
