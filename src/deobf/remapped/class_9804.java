package remapped;

public class class_9804 implements Runnable {
   private static String[] field_49704;

   public class_9804(class_7380 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field_49706 = var1;
      this.field_49703 = var2;
      this.field_49707 = var3;
      this.field_49702 = var4;
      this.field_49705 = var5;
      this.field_49708 = var6;
      this.field_49709 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_49703];
      if (class_7380.method_33621(this.field_49706) <= 2) {
         if (class_7380.method_33621(this.field_49706) == 2) {
            for (int var4 = 0; var4 < class_7380.method_33612(this.field_49706); var4++) {
               int var6 = var4 * class_7380.method_33621(this.field_49706) + 2 * this.field_49702;
               var3[var4] = this.field_49708[var6];
               var3[var4 + class_7380.method_33612(this.field_49706)] = this.field_49708[var6 + 1];
            }

            if (this.field_49707 != -1) {
               class_7380.method_33616(this.field_49706).method_31282(var3, 0, this.field_49709);
               class_7380.method_33616(this.field_49706).method_31282(var3, class_7380.method_33612(this.field_49706), this.field_49709);
            } else {
               class_7380.method_33616(this.field_49706).method_31276(var3, 0);
               class_7380.method_33616(this.field_49706).method_31276(var3, class_7380.method_33612(this.field_49706));
            }

            for (int var8 = 0; var8 < class_7380.method_33612(this.field_49706); var8++) {
               int var14 = var8 * class_7380.method_33621(this.field_49706) + 2 * this.field_49702;
               this.field_49708[var14] = var3[var8];
               this.field_49708[var14 + 1] = var3[var8 + class_7380.method_33612(this.field_49706)];
            }
         }
      } else if (this.field_49707 != -1) {
         for (int var9 = 4 * this.field_49702; var9 < class_7380.method_33621(this.field_49706); var9 += 4 * this.field_49705) {
            for (int var5 = 0; var5 < class_7380.method_33612(this.field_49706); var5++) {
               int var15 = var5 * class_7380.method_33621(this.field_49706) + var9;
               int var7 = class_7380.method_33612(this.field_49706) + var5;
               var3[var5] = this.field_49708[var15];
               var3[var7] = this.field_49708[var15 + 1];
               var3[var7 + class_7380.method_33612(this.field_49706)] = this.field_49708[var15 + 2];
               var3[var7 + 2 * class_7380.method_33612(this.field_49706)] = this.field_49708[var15 + 3];
            }

            class_7380.method_33616(this.field_49706).method_31282(var3, 0, this.field_49709);
            class_7380.method_33616(this.field_49706).method_31282(var3, class_7380.method_33612(this.field_49706), this.field_49709);
            class_7380.method_33616(this.field_49706).method_31282(var3, 2 * class_7380.method_33612(this.field_49706), this.field_49709);
            class_7380.method_33616(this.field_49706).method_31282(var3, 3 * class_7380.method_33612(this.field_49706), this.field_49709);

            for (int var11 = 0; var11 < class_7380.method_33612(this.field_49706); var11++) {
               int var16 = var11 * class_7380.method_33621(this.field_49706) + var9;
               int var19 = class_7380.method_33612(this.field_49706) + var11;
               this.field_49708[var16] = var3[var11];
               this.field_49708[var16 + 1] = var3[var19];
               this.field_49708[var16 + 2] = var3[var19 + class_7380.method_33612(this.field_49706)];
               this.field_49708[var16 + 3] = var3[var19 + 2 * class_7380.method_33612(this.field_49706)];
            }
         }
      } else {
         for (int var10 = 4 * this.field_49702; var10 < class_7380.method_33621(this.field_49706); var10 += 4 * this.field_49705) {
            for (int var12 = 0; var12 < class_7380.method_33612(this.field_49706); var12++) {
               int var17 = var12 * class_7380.method_33621(this.field_49706) + var10;
               int var20 = class_7380.method_33612(this.field_49706) + var12;
               var3[var12] = this.field_49708[var17];
               var3[var20] = this.field_49708[var17 + 1];
               var3[var20 + class_7380.method_33612(this.field_49706)] = this.field_49708[var17 + 2];
               var3[var20 + 2 * class_7380.method_33612(this.field_49706)] = this.field_49708[var17 + 3];
            }

            class_7380.method_33616(this.field_49706).method_31276(var3, 0);
            class_7380.method_33616(this.field_49706).method_31276(var3, class_7380.method_33612(this.field_49706));
            class_7380.method_33616(this.field_49706).method_31276(var3, 2 * class_7380.method_33612(this.field_49706));
            class_7380.method_33616(this.field_49706).method_31276(var3, 3 * class_7380.method_33612(this.field_49706));

            for (int var13 = 0; var13 < class_7380.method_33612(this.field_49706); var13++) {
               int var18 = var13 * class_7380.method_33621(this.field_49706) + var10;
               int var21 = class_7380.method_33612(this.field_49706) + var13;
               this.field_49708[var18] = var3[var13];
               this.field_49708[var18 + 1] = var3[var21];
               this.field_49708[var18 + 2] = var3[var21 + class_7380.method_33612(this.field_49706)];
               this.field_49708[var18 + 3] = var3[var21 + 2 * class_7380.method_33612(this.field_49706)];
            }
         }
      }
   }
}
