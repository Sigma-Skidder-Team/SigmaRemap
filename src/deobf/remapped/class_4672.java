package remapped;

public class class_4672 implements Runnable {
   private static String[] field_22776;

   public class_4672(class_7963 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field_22773 = var1;
      this.field_22780 = var2;
      this.field_22775 = var3;
      this.field_22777 = var4;
      this.field_22774 = var5;
      this.field_22778 = var6;
      this.field_22779 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_22780];
      if (class_7963.method_36038(this.field_22773) <= 2) {
         if (class_7963.method_36038(this.field_22773) == 2) {
            for (int var4 = 0; var4 < class_7963.method_36040(this.field_22773); var4++) {
               int var6 = var4 * class_7963.method_36038(this.field_22773) + 2 * this.field_22777;
               var3[var4] = this.field_22778[var6];
               var3[var4 + class_7963.method_36040(this.field_22773)] = this.field_22778[var6 + 1];
            }

            if (this.field_22775 != -1) {
               class_7963.method_36041(this.field_22773).method_44820(var3, 0, this.field_22779);
               class_7963.method_36041(this.field_22773).method_44820(var3, class_7963.method_36040(this.field_22773), this.field_22779);
            } else {
               class_7963.method_36041(this.field_22773).method_44815(var3, 0, this.field_22779);
               class_7963.method_36041(this.field_22773).method_44815(var3, class_7963.method_36040(this.field_22773), this.field_22779);
            }

            for (int var8 = 0; var8 < class_7963.method_36040(this.field_22773); var8++) {
               int var14 = var8 * class_7963.method_36038(this.field_22773) + 2 * this.field_22777;
               this.field_22778[var14] = var3[var8];
               this.field_22778[var14 + 1] = var3[var8 + class_7963.method_36040(this.field_22773)];
            }
         }
      } else if (this.field_22775 != -1) {
         for (int var9 = 4 * this.field_22777; var9 < class_7963.method_36038(this.field_22773); var9 += 4 * this.field_22774) {
            for (int var5 = 0; var5 < class_7963.method_36040(this.field_22773); var5++) {
               int var15 = var5 * class_7963.method_36038(this.field_22773) + var9;
               int var7 = class_7963.method_36040(this.field_22773) + var5;
               var3[var5] = this.field_22778[var15];
               var3[var7] = this.field_22778[var15 + 1];
               var3[var7 + class_7963.method_36040(this.field_22773)] = this.field_22778[var15 + 2];
               var3[var7 + 2 * class_7963.method_36040(this.field_22773)] = this.field_22778[var15 + 3];
            }

            class_7963.method_36041(this.field_22773).method_44821(var3, this.field_22779);
            class_7963.method_36041(this.field_22773).method_44820(var3, class_7963.method_36040(this.field_22773), this.field_22779);
            class_7963.method_36041(this.field_22773).method_44820(var3, 2 * class_7963.method_36040(this.field_22773), this.field_22779);
            class_7963.method_36041(this.field_22773).method_44820(var3, 3 * class_7963.method_36040(this.field_22773), this.field_22779);

            for (int var11 = 0; var11 < class_7963.method_36040(this.field_22773); var11++) {
               int var16 = var11 * class_7963.method_36038(this.field_22773) + var9;
               int var19 = class_7963.method_36040(this.field_22773) + var11;
               this.field_22778[var16] = var3[var11];
               this.field_22778[var16 + 1] = var3[var19];
               this.field_22778[var16 + 2] = var3[var19 + class_7963.method_36040(this.field_22773)];
               this.field_22778[var16 + 3] = var3[var19 + 2 * class_7963.method_36040(this.field_22773)];
            }
         }
      } else {
         for (int var10 = 4 * this.field_22777; var10 < class_7963.method_36038(this.field_22773); var10 += 4 * this.field_22774) {
            for (int var12 = 0; var12 < class_7963.method_36040(this.field_22773); var12++) {
               int var17 = var12 * class_7963.method_36038(this.field_22773) + var10;
               int var20 = class_7963.method_36040(this.field_22773) + var12;
               var3[var12] = this.field_22778[var17];
               var3[var20] = this.field_22778[var17 + 1];
               var3[var20 + class_7963.method_36040(this.field_22773)] = this.field_22778[var17 + 2];
               var3[var20 + 2 * class_7963.method_36040(this.field_22773)] = this.field_22778[var17 + 3];
            }

            class_7963.method_36041(this.field_22773).method_44815(var3, 0, this.field_22779);
            class_7963.method_36041(this.field_22773).method_44815(var3, class_7963.method_36040(this.field_22773), this.field_22779);
            class_7963.method_36041(this.field_22773).method_44815(var3, 2 * class_7963.method_36040(this.field_22773), this.field_22779);
            class_7963.method_36041(this.field_22773).method_44815(var3, 3 * class_7963.method_36040(this.field_22773), this.field_22779);

            for (int var13 = 0; var13 < class_7963.method_36040(this.field_22773); var13++) {
               int var18 = var13 * class_7963.method_36038(this.field_22773) + var10;
               int var21 = class_7963.method_36040(this.field_22773) + var13;
               this.field_22778[var18] = var3[var13];
               this.field_22778[var18 + 1] = var3[var21];
               this.field_22778[var18 + 2] = var3[var21 + class_7963.method_36040(this.field_22773)];
               this.field_22778[var18 + 3] = var3[var21 + 2 * class_7963.method_36040(this.field_22773)];
            }
         }
      }
   }
}
