package remapped;

public class class_7115 implements Runnable {
   private static String[] field_36690;

   public class_7115(class_3803 var1, int var2, int var3, int var4, int var5, float[][][] var6, boolean var7) {
      this.field_36684 = var1;
      this.field_36686 = var2;
      this.field_36688 = var3;
      this.field_36685 = var4;
      this.field_36687 = var5;
      this.field_36689 = var6;
      this.field_36683 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_36686];
      if (this.field_36688 != -1) {
         for (int var4 = this.field_36685; var4 < class_3803.method_17688(this.field_36684); var4 += this.field_36687) {
            for (int var5 = 0; var5 < class_3803.method_17681(this.field_36684); var5++) {
               class_3803.method_17704(this.field_36684).method_17790(this.field_36689[var4][var5], this.field_36683);
            }

            if (class_3803.method_17715(this.field_36684) <= 2) {
               if (class_3803.method_17715(this.field_36684) == 2) {
                  for (int var10 = 0; var10 < class_3803.method_17681(this.field_36684); var10++) {
                     var3[var10] = this.field_36689[var4][var10][0];
                     var3[class_3803.method_17681(this.field_36684) + var10] = this.field_36689[var4][var10][1];
                  }

                  class_3803.method_17714(this.field_36684).method_17789(var3, 0, this.field_36683);
                  class_3803.method_17714(this.field_36684).method_17789(var3, class_3803.method_17681(this.field_36684), this.field_36683);

                  for (int var11 = 0; var11 < class_3803.method_17681(this.field_36684); var11++) {
                     this.field_36689[var4][var11][0] = var3[var11];
                     this.field_36689[var4][var11][1] = var3[class_3803.method_17681(this.field_36684) + var11];
                  }
               }
            } else {
               for (byte var9 = 0; var9 < class_3803.method_17715(this.field_36684); var9 += 4) {
                  for (int var6 = 0; var6 < class_3803.method_17681(this.field_36684); var6++) {
                     int var7 = class_3803.method_17681(this.field_36684) + var6;
                     var3[var6] = this.field_36689[var4][var6][var9];
                     var3[var7] = this.field_36689[var4][var6][var9 + 1];
                     var3[var7 + class_3803.method_17681(this.field_36684)] = this.field_36689[var4][var6][var9 + 2];
                     var3[var7 + 2 * class_3803.method_17681(this.field_36684)] = this.field_36689[var4][var6][var9 + 3];
                  }

                  class_3803.method_17714(this.field_36684).method_17789(var3, 0, this.field_36683);
                  class_3803.method_17714(this.field_36684).method_17789(var3, class_3803.method_17681(this.field_36684), this.field_36683);
                  class_3803.method_17714(this.field_36684).method_17789(var3, 2 * class_3803.method_17681(this.field_36684), this.field_36683);
                  class_3803.method_17714(this.field_36684).method_17789(var3, 3 * class_3803.method_17681(this.field_36684), this.field_36683);

                  for (int var16 = 0; var16 < class_3803.method_17681(this.field_36684); var16++) {
                     int var19 = class_3803.method_17681(this.field_36684) + var16;
                     this.field_36689[var4][var16][var9] = var3[var16];
                     this.field_36689[var4][var16][var9 + 1] = var3[var19];
                     this.field_36689[var4][var16][var9 + 2] = var3[var19 + class_3803.method_17681(this.field_36684)];
                     this.field_36689[var4][var16][var9 + 3] = var3[var19 + 2 * class_3803.method_17681(this.field_36684)];
                  }
               }
            }
         }
      } else {
         for (int var8 = this.field_36685; var8 < class_3803.method_17688(this.field_36684); var8 += this.field_36687) {
            for (int var12 = 0; var12 < class_3803.method_17681(this.field_36684); var12++) {
               class_3803.method_17704(this.field_36684).method_17785(this.field_36689[var8][var12]);
            }

            if (class_3803.method_17715(this.field_36684) <= 2) {
               if (class_3803.method_17715(this.field_36684) == 2) {
                  for (int var14 = 0; var14 < class_3803.method_17681(this.field_36684); var14++) {
                     var3[var14] = this.field_36689[var8][var14][0];
                     var3[class_3803.method_17681(this.field_36684) + var14] = this.field_36689[var8][var14][1];
                  }

                  class_3803.method_17714(this.field_36684).method_17786(var3, 0);
                  class_3803.method_17714(this.field_36684).method_17786(var3, class_3803.method_17681(this.field_36684));

                  for (int var15 = 0; var15 < class_3803.method_17681(this.field_36684); var15++) {
                     this.field_36689[var8][var15][0] = var3[var15];
                     this.field_36689[var8][var15][1] = var3[class_3803.method_17681(this.field_36684) + var15];
                  }
               }
            } else {
               for (byte var13 = 0; var13 < class_3803.method_17715(this.field_36684); var13 += 4) {
                  for (int var17 = 0; var17 < class_3803.method_17681(this.field_36684); var17++) {
                     int var20 = class_3803.method_17681(this.field_36684) + var17;
                     var3[var17] = this.field_36689[var8][var17][var13];
                     var3[var20] = this.field_36689[var8][var17][var13 + 1];
                     var3[var20 + class_3803.method_17681(this.field_36684)] = this.field_36689[var8][var17][var13 + 2];
                     var3[var20 + 2 * class_3803.method_17681(this.field_36684)] = this.field_36689[var8][var17][var13 + 3];
                  }

                  class_3803.method_17714(this.field_36684).method_17786(var3, 0);
                  class_3803.method_17714(this.field_36684).method_17786(var3, class_3803.method_17681(this.field_36684));
                  class_3803.method_17714(this.field_36684).method_17786(var3, 2 * class_3803.method_17681(this.field_36684));
                  class_3803.method_17714(this.field_36684).method_17786(var3, 3 * class_3803.method_17681(this.field_36684));

                  for (int var18 = 0; var18 < class_3803.method_17681(this.field_36684); var18++) {
                     int var21 = class_3803.method_17681(this.field_36684) + var18;
                     this.field_36689[var8][var18][var13] = var3[var18];
                     this.field_36689[var8][var18][var13 + 1] = var3[var21];
                     this.field_36689[var8][var18][var13 + 2] = var3[var21 + class_3803.method_17681(this.field_36684)];
                     this.field_36689[var8][var18][var13 + 3] = var3[var21 + 2 * class_3803.method_17681(this.field_36684)];
                  }
               }
            }
         }
      }
   }
}
