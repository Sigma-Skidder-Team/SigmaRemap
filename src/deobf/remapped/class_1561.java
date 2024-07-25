package remapped;

public class class_1561 implements Runnable {
   private static String[] field_8226;

   public class_1561(class_2817 var1, int var2, int var3, int var4, int var5, float[][] var6, boolean var7) {
      this.field_8224 = var1;
      this.field_8230 = var2;
      this.field_8228 = var3;
      this.field_8231 = var4;
      this.field_8225 = var5;
      this.field_8229 = var6;
      this.field_8227 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_8230];
      if (class_2817.method_12836(this.field_8224) <= 2) {
         if (class_2817.method_12836(this.field_8224) == 2) {
            for (int var4 = 0; var4 < class_2817.method_12821(this.field_8224); var4++) {
               var3[var4] = this.field_8229[var4][2 * this.field_8231];
               var3[var4 + class_2817.method_12821(this.field_8224)] = this.field_8229[var4][2 * this.field_8231 + 1];
            }

            if (this.field_8228 != -1) {
               class_2817.method_12837(this.field_8224).method_17789(var3, 0, this.field_8227);
               class_2817.method_12837(this.field_8224).method_17789(var3, class_2817.method_12821(this.field_8224), this.field_8227);
            } else {
               class_2817.method_12837(this.field_8224).method_17786(var3, 0);
               class_2817.method_12837(this.field_8224).method_17786(var3, class_2817.method_12821(this.field_8224));
            }

            for (int var7 = 0; var7 < class_2817.method_12821(this.field_8224); var7++) {
               this.field_8229[var7][2 * this.field_8231] = var3[var7];
               this.field_8229[var7][2 * this.field_8231 + 1] = var3[var7 + class_2817.method_12821(this.field_8224)];
            }
         }
      } else if (this.field_8228 != -1) {
         for (int var8 = 4 * this.field_8231; var8 < class_2817.method_12836(this.field_8224); var8 += 4 * this.field_8225) {
            for (int var5 = 0; var5 < class_2817.method_12821(this.field_8224); var5++) {
               int var6 = class_2817.method_12821(this.field_8224) + var5;
               var3[var5] = this.field_8229[var5][var8];
               var3[var6] = this.field_8229[var5][var8 + 1];
               var3[var6 + class_2817.method_12821(this.field_8224)] = this.field_8229[var5][var8 + 2];
               var3[var6 + 2 * class_2817.method_12821(this.field_8224)] = this.field_8229[var5][var8 + 3];
            }

            class_2817.method_12837(this.field_8224).method_17789(var3, 0, this.field_8227);
            class_2817.method_12837(this.field_8224).method_17789(var3, class_2817.method_12821(this.field_8224), this.field_8227);
            class_2817.method_12837(this.field_8224).method_17789(var3, 2 * class_2817.method_12821(this.field_8224), this.field_8227);
            class_2817.method_12837(this.field_8224).method_17789(var3, 3 * class_2817.method_12821(this.field_8224), this.field_8227);

            for (int var10 = 0; var10 < class_2817.method_12821(this.field_8224); var10++) {
               int var13 = class_2817.method_12821(this.field_8224) + var10;
               this.field_8229[var10][var8] = var3[var10];
               this.field_8229[var10][var8 + 1] = var3[var13];
               this.field_8229[var10][var8 + 2] = var3[var13 + class_2817.method_12821(this.field_8224)];
               this.field_8229[var10][var8 + 3] = var3[var13 + 2 * class_2817.method_12821(this.field_8224)];
            }
         }
      } else {
         for (int var9 = 4 * this.field_8231; var9 < class_2817.method_12836(this.field_8224); var9 += 4 * this.field_8225) {
            for (int var11 = 0; var11 < class_2817.method_12821(this.field_8224); var11++) {
               int var14 = class_2817.method_12821(this.field_8224) + var11;
               var3[var11] = this.field_8229[var11][var9];
               var3[var14] = this.field_8229[var11][var9 + 1];
               var3[var14 + class_2817.method_12821(this.field_8224)] = this.field_8229[var11][var9 + 2];
               var3[var14 + 2 * class_2817.method_12821(this.field_8224)] = this.field_8229[var11][var9 + 3];
            }

            class_2817.method_12837(this.field_8224).method_17786(var3, 0);
            class_2817.method_12837(this.field_8224).method_17786(var3, class_2817.method_12821(this.field_8224));
            class_2817.method_12837(this.field_8224).method_17786(var3, 2 * class_2817.method_12821(this.field_8224));
            class_2817.method_12837(this.field_8224).method_17786(var3, 3 * class_2817.method_12821(this.field_8224));

            for (int var12 = 0; var12 < class_2817.method_12821(this.field_8224); var12++) {
               int var15 = class_2817.method_12821(this.field_8224) + var12;
               this.field_8229[var12][var9] = var3[var12];
               this.field_8229[var12][var9 + 1] = var3[var15];
               this.field_8229[var12][var9 + 2] = var3[var15 + class_2817.method_12821(this.field_8224)];
               this.field_8229[var12][var9 + 3] = var3[var15 + 2 * class_2817.method_12821(this.field_8224)];
            }
         }
      }
   }
}
