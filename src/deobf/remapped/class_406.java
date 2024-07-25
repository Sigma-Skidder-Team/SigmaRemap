package remapped;

public class class_406 implements Runnable {
   private static String[] field_1695;

   public class_406(class_2841 var1, int var2, int var3, int var4, int var5, float[][][] var6, boolean var7) {
      this.field_1691 = var1;
      this.field_1692 = var2;
      this.field_1690 = var3;
      this.field_1689 = var4;
      this.field_1688 = var5;
      this.field_1694 = var6;
      this.field_1693 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_1692];
      if (this.field_1690 != -1) {
         for (int var4 = this.field_1689; var4 < class_2841.method_12914(this.field_1691); var4 += this.field_1688) {
            for (int var5 = 0; var5 < class_2841.method_12928(this.field_1691); var5++) {
               class_2841.method_12923(this.field_1691).method_21132(this.field_1694[var4][var5], this.field_1693);
            }

            if (class_2841.method_12908(this.field_1691) <= 2) {
               if (class_2841.method_12908(this.field_1691) == 2) {
                  for (int var10 = 0; var10 < class_2841.method_12928(this.field_1691); var10++) {
                     var3[var10] = this.field_1694[var4][var10][0];
                     var3[class_2841.method_12928(this.field_1691) + var10] = this.field_1694[var4][var10][1];
                  }

                  class_2841.method_12921(this.field_1691).method_21131(var3, 0, this.field_1693);
                  class_2841.method_12921(this.field_1691).method_21131(var3, class_2841.method_12928(this.field_1691), this.field_1693);

                  for (int var11 = 0; var11 < class_2841.method_12928(this.field_1691); var11++) {
                     this.field_1694[var4][var11][0] = var3[var11];
                     this.field_1694[var4][var11][1] = var3[class_2841.method_12928(this.field_1691) + var11];
                  }
               }
            } else {
               for (byte var9 = 0; var9 < class_2841.method_12908(this.field_1691); var9 += 4) {
                  for (int var6 = 0; var6 < class_2841.method_12928(this.field_1691); var6++) {
                     int var7 = class_2841.method_12928(this.field_1691) + var6;
                     var3[var6] = this.field_1694[var4][var6][var9];
                     var3[var7] = this.field_1694[var4][var6][var9 + 1];
                     var3[var7 + class_2841.method_12928(this.field_1691)] = this.field_1694[var4][var6][var9 + 2];
                     var3[var7 + 2 * class_2841.method_12928(this.field_1691)] = this.field_1694[var4][var6][var9 + 3];
                  }

                  class_2841.method_12921(this.field_1691).method_21131(var3, 0, this.field_1693);
                  class_2841.method_12921(this.field_1691).method_21131(var3, class_2841.method_12928(this.field_1691), this.field_1693);
                  class_2841.method_12921(this.field_1691).method_21131(var3, 2 * class_2841.method_12928(this.field_1691), this.field_1693);
                  class_2841.method_12921(this.field_1691).method_21131(var3, 3 * class_2841.method_12928(this.field_1691), this.field_1693);

                  for (int var16 = 0; var16 < class_2841.method_12928(this.field_1691); var16++) {
                     int var19 = class_2841.method_12928(this.field_1691) + var16;
                     this.field_1694[var4][var16][var9] = var3[var16];
                     this.field_1694[var4][var16][var9 + 1] = var3[var19];
                     this.field_1694[var4][var16][var9 + 2] = var3[var19 + class_2841.method_12928(this.field_1691)];
                     this.field_1694[var4][var16][var9 + 3] = var3[var19 + 2 * class_2841.method_12928(this.field_1691)];
                  }
               }
            }
         }
      } else {
         for (int var8 = this.field_1689; var8 < class_2841.method_12914(this.field_1691); var8 += this.field_1688) {
            for (int var12 = 0; var12 < class_2841.method_12928(this.field_1691); var12++) {
               class_2841.method_12923(this.field_1691).method_21140(this.field_1694[var8][var12], this.field_1693);
            }

            if (class_2841.method_12908(this.field_1691) <= 2) {
               if (class_2841.method_12908(this.field_1691) == 2) {
                  for (int var14 = 0; var14 < class_2841.method_12928(this.field_1691); var14++) {
                     var3[var14] = this.field_1694[var8][var14][0];
                     var3[class_2841.method_12928(this.field_1691) + var14] = this.field_1694[var8][var14][1];
                  }

                  class_2841.method_12921(this.field_1691).method_21139(var3, 0, this.field_1693);
                  class_2841.method_12921(this.field_1691).method_21139(var3, class_2841.method_12928(this.field_1691), this.field_1693);

                  for (int var15 = 0; var15 < class_2841.method_12928(this.field_1691); var15++) {
                     this.field_1694[var8][var15][0] = var3[var15];
                     this.field_1694[var8][var15][1] = var3[class_2841.method_12928(this.field_1691) + var15];
                  }
               }
            } else {
               for (byte var13 = 0; var13 < class_2841.method_12908(this.field_1691); var13 += 4) {
                  for (int var17 = 0; var17 < class_2841.method_12928(this.field_1691); var17++) {
                     int var20 = class_2841.method_12928(this.field_1691) + var17;
                     var3[var17] = this.field_1694[var8][var17][var13];
                     var3[var20] = this.field_1694[var8][var17][var13 + 1];
                     var3[var20 + class_2841.method_12928(this.field_1691)] = this.field_1694[var8][var17][var13 + 2];
                     var3[var20 + 2 * class_2841.method_12928(this.field_1691)] = this.field_1694[var8][var17][var13 + 3];
                  }

                  class_2841.method_12921(this.field_1691).method_21139(var3, 0, this.field_1693);
                  class_2841.method_12921(this.field_1691).method_21139(var3, class_2841.method_12928(this.field_1691), this.field_1693);
                  class_2841.method_12921(this.field_1691).method_21139(var3, 2 * class_2841.method_12928(this.field_1691), this.field_1693);
                  class_2841.method_12921(this.field_1691).method_21139(var3, 3 * class_2841.method_12928(this.field_1691), this.field_1693);

                  for (int var18 = 0; var18 < class_2841.method_12928(this.field_1691); var18++) {
                     int var21 = class_2841.method_12928(this.field_1691) + var18;
                     this.field_1694[var8][var18][var13] = var3[var18];
                     this.field_1694[var8][var18][var13 + 1] = var3[var21];
                     this.field_1694[var8][var18][var13 + 2] = var3[var21 + class_2841.method_12928(this.field_1691)];
                     this.field_1694[var8][var18][var13 + 3] = var3[var21 + 2 * class_2841.method_12928(this.field_1691)];
                  }
               }
            }
         }
      }
   }
}
