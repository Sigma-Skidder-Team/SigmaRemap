package remapped;

public class class_4406 implements Runnable {
   private static String[] field_21556;

   public class_4406(class_573 var1, int var2, int var3, int var4, int var5, double[][][] var6, boolean var7) {
      this.field_21559 = var1;
      this.field_21558 = var2;
      this.field_21555 = var3;
      this.field_21561 = var4;
      this.field_21557 = var5;
      this.field_21562 = var6;
      this.field_21560 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_21558];
      if (this.field_21555 != -1) {
         for (int var4 = this.field_21561; var4 < class_573.method_2716(this.field_21559); var4 += this.field_21557) {
            for (int var5 = 0; var5 < class_573.method_2721(this.field_21559); var5++) {
               class_573.method_2736(this.field_21559).method_44821(this.field_21562[var4][var5], this.field_21560);
            }

            if (class_573.method_2730(this.field_21559) <= 2) {
               if (class_573.method_2730(this.field_21559) == 2) {
                  for (int var10 = 0; var10 < class_573.method_2721(this.field_21559); var10++) {
                     var3[var10] = this.field_21562[var4][var10][0];
                     var3[class_573.method_2721(this.field_21559) + var10] = this.field_21562[var4][var10][1];
                  }

                  class_573.method_2711(this.field_21559).method_44820(var3, 0, this.field_21560);
                  class_573.method_2711(this.field_21559).method_44820(var3, class_573.method_2721(this.field_21559), this.field_21560);

                  for (int var11 = 0; var11 < class_573.method_2721(this.field_21559); var11++) {
                     this.field_21562[var4][var11][0] = var3[var11];
                     this.field_21562[var4][var11][1] = var3[class_573.method_2721(this.field_21559) + var11];
                  }
               }
            } else {
               for (byte var9 = 0; var9 < class_573.method_2730(this.field_21559); var9 += 4) {
                  for (int var6 = 0; var6 < class_573.method_2721(this.field_21559); var6++) {
                     int var7 = class_573.method_2721(this.field_21559) + var6;
                     var3[var6] = this.field_21562[var4][var6][var9];
                     var3[var7] = this.field_21562[var4][var6][var9 + 1];
                     var3[var7 + class_573.method_2721(this.field_21559)] = this.field_21562[var4][var6][var9 + 2];
                     var3[var7 + 2 * class_573.method_2721(this.field_21559)] = this.field_21562[var4][var6][var9 + 3];
                  }

                  class_573.method_2711(this.field_21559).method_44820(var3, 0, this.field_21560);
                  class_573.method_2711(this.field_21559).method_44820(var3, class_573.method_2721(this.field_21559), this.field_21560);
                  class_573.method_2711(this.field_21559).method_44820(var3, 2 * class_573.method_2721(this.field_21559), this.field_21560);
                  class_573.method_2711(this.field_21559).method_44820(var3, 3 * class_573.method_2721(this.field_21559), this.field_21560);

                  for (int var16 = 0; var16 < class_573.method_2721(this.field_21559); var16++) {
                     int var19 = class_573.method_2721(this.field_21559) + var16;
                     this.field_21562[var4][var16][var9] = var3[var16];
                     this.field_21562[var4][var16][var9 + 1] = var3[var19];
                     this.field_21562[var4][var16][var9 + 2] = var3[var19 + class_573.method_2721(this.field_21559)];
                     this.field_21562[var4][var16][var9 + 3] = var3[var19 + 2 * class_573.method_2721(this.field_21559)];
                  }
               }
            }
         }
      } else {
         for (int var8 = this.field_21561; var8 < class_573.method_2716(this.field_21559); var8 += this.field_21557) {
            for (int var12 = 0; var12 < class_573.method_2721(this.field_21559); var12++) {
               class_573.method_2736(this.field_21559).method_44816(this.field_21562[var8][var12], this.field_21560);
            }

            if (class_573.method_2730(this.field_21559) <= 2) {
               if (class_573.method_2730(this.field_21559) == 2) {
                  for (int var14 = 0; var14 < class_573.method_2721(this.field_21559); var14++) {
                     var3[var14] = this.field_21562[var8][var14][0];
                     var3[class_573.method_2721(this.field_21559) + var14] = this.field_21562[var8][var14][1];
                  }

                  class_573.method_2711(this.field_21559).method_44815(var3, 0, this.field_21560);
                  class_573.method_2711(this.field_21559).method_44815(var3, class_573.method_2721(this.field_21559), this.field_21560);

                  for (int var15 = 0; var15 < class_573.method_2721(this.field_21559); var15++) {
                     this.field_21562[var8][var15][0] = var3[var15];
                     this.field_21562[var8][var15][1] = var3[class_573.method_2721(this.field_21559) + var15];
                  }
               }
            } else {
               for (byte var13 = 0; var13 < class_573.method_2730(this.field_21559); var13 += 4) {
                  for (int var17 = 0; var17 < class_573.method_2721(this.field_21559); var17++) {
                     int var20 = class_573.method_2721(this.field_21559) + var17;
                     var3[var17] = this.field_21562[var8][var17][var13];
                     var3[var20] = this.field_21562[var8][var17][var13 + 1];
                     var3[var20 + class_573.method_2721(this.field_21559)] = this.field_21562[var8][var17][var13 + 2];
                     var3[var20 + 2 * class_573.method_2721(this.field_21559)] = this.field_21562[var8][var17][var13 + 3];
                  }

                  class_573.method_2711(this.field_21559).method_44815(var3, 0, this.field_21560);
                  class_573.method_2711(this.field_21559).method_44815(var3, class_573.method_2721(this.field_21559), this.field_21560);
                  class_573.method_2711(this.field_21559).method_44815(var3, 2 * class_573.method_2721(this.field_21559), this.field_21560);
                  class_573.method_2711(this.field_21559).method_44815(var3, 3 * class_573.method_2721(this.field_21559), this.field_21560);

                  for (int var18 = 0; var18 < class_573.method_2721(this.field_21559); var18++) {
                     int var21 = class_573.method_2721(this.field_21559) + var18;
                     this.field_21562[var8][var18][var13] = var3[var18];
                     this.field_21562[var8][var18][var13 + 1] = var3[var21];
                     this.field_21562[var8][var18][var13 + 2] = var3[var21 + class_573.method_2721(this.field_21559)];
                     this.field_21562[var8][var18][var13 + 3] = var3[var21 + 2 * class_573.method_2721(this.field_21559)];
                  }
               }
            }
         }
      }
   }
}
