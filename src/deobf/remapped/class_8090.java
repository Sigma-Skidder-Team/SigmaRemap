package remapped;

public class class_8090 implements Runnable {
   private static String[] field_41438;

   public class_8090(class_3101 var1, int var2, int var3, int var4, int var5, float[][][] var6, boolean var7) {
      this.field_41431 = var1;
      this.field_41437 = var2;
      this.field_41436 = var3;
      this.field_41433 = var4;
      this.field_41434 = var5;
      this.field_41435 = var6;
      this.field_41432 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_41437];
      if (this.field_41436 != -1) {
         if (class_3101.method_14191(this.field_41431) <= 2) {
            if (class_3101.method_14191(this.field_41431) == 2) {
               for (int var4 = this.field_41433; var4 < class_3101.method_14204(this.field_41431); var4 += this.field_41434) {
                  for (int var5 = 0; var5 < class_3101.method_14192(this.field_41431); var5++) {
                     var3[var5] = this.field_41435[var5][var4][0];
                     var3[class_3101.method_14192(this.field_41431) + var5] = this.field_41435[var5][var4][1];
                  }

                  class_3101.method_14200(this.field_41431).method_19203(var3, 0, this.field_41432);
                  class_3101.method_14200(this.field_41431).method_19203(var3, class_3101.method_14192(this.field_41431), this.field_41432);

                  for (int var11 = 0; var11 < class_3101.method_14192(this.field_41431); var11++) {
                     this.field_41435[var11][var4][0] = var3[var11];
                     this.field_41435[var11][var4][1] = var3[class_3101.method_14192(this.field_41431) + var11];
                  }
               }
            }
         } else {
            for (int var8 = this.field_41433; var8 < class_3101.method_14204(this.field_41431); var8 += this.field_41434) {
               for (byte var12 = 0; var12 < class_3101.method_14191(this.field_41431); var12 += 4) {
                  for (int var6 = 0; var6 < class_3101.method_14192(this.field_41431); var6++) {
                     int var7 = class_3101.method_14192(this.field_41431) + var6;
                     var3[var6] = this.field_41435[var6][var8][var12];
                     var3[var7] = this.field_41435[var6][var8][var12 + 1];
                     var3[var7 + class_3101.method_14192(this.field_41431)] = this.field_41435[var6][var8][var12 + 2];
                     var3[var7 + 2 * class_3101.method_14192(this.field_41431)] = this.field_41435[var6][var8][var12 + 3];
                  }

                  class_3101.method_14200(this.field_41431).method_19203(var3, 0, this.field_41432);
                  class_3101.method_14200(this.field_41431).method_19203(var3, class_3101.method_14192(this.field_41431), this.field_41432);
                  class_3101.method_14200(this.field_41431).method_19203(var3, 2 * class_3101.method_14192(this.field_41431), this.field_41432);
                  class_3101.method_14200(this.field_41431).method_19203(var3, 3 * class_3101.method_14192(this.field_41431), this.field_41432);

                  for (int var16 = 0; var16 < class_3101.method_14192(this.field_41431); var16++) {
                     int var19 = class_3101.method_14192(this.field_41431) + var16;
                     this.field_41435[var16][var8][var12] = var3[var16];
                     this.field_41435[var16][var8][var12 + 1] = var3[var19];
                     this.field_41435[var16][var8][var12 + 2] = var3[var19 + class_3101.method_14192(this.field_41431)];
                     this.field_41435[var16][var8][var12 + 3] = var3[var19 + 2 * class_3101.method_14192(this.field_41431)];
                  }
               }
            }
         }
      } else if (class_3101.method_14191(this.field_41431) <= 2) {
         if (class_3101.method_14191(this.field_41431) == 2) {
            for (int var9 = this.field_41433; var9 < class_3101.method_14204(this.field_41431); var9 += this.field_41434) {
               for (int var13 = 0; var13 < class_3101.method_14192(this.field_41431); var13++) {
                  var3[var13] = this.field_41435[var13][var9][0];
                  var3[class_3101.method_14192(this.field_41431) + var13] = this.field_41435[var13][var9][1];
               }

               class_3101.method_14200(this.field_41431).method_19196(var3, 0, this.field_41432);
               class_3101.method_14200(this.field_41431).method_19196(var3, class_3101.method_14192(this.field_41431), this.field_41432);

               for (int var14 = 0; var14 < class_3101.method_14192(this.field_41431); var14++) {
                  this.field_41435[var14][var9][0] = var3[var14];
                  this.field_41435[var14][var9][1] = var3[class_3101.method_14192(this.field_41431) + var14];
               }
            }
         }
      } else {
         for (int var10 = this.field_41433; var10 < class_3101.method_14204(this.field_41431); var10 += this.field_41434) {
            for (byte var15 = 0; var15 < class_3101.method_14191(this.field_41431); var15 += 4) {
               for (int var17 = 0; var17 < class_3101.method_14192(this.field_41431); var17++) {
                  int var20 = class_3101.method_14192(this.field_41431) + var17;
                  var3[var17] = this.field_41435[var17][var10][var15];
                  var3[var20] = this.field_41435[var17][var10][var15 + 1];
                  var3[var20 + class_3101.method_14192(this.field_41431)] = this.field_41435[var17][var10][var15 + 2];
                  var3[var20 + 2 * class_3101.method_14192(this.field_41431)] = this.field_41435[var17][var10][var15 + 3];
               }

               class_3101.method_14200(this.field_41431).method_19196(var3, 0, this.field_41432);
               class_3101.method_14200(this.field_41431).method_19196(var3, class_3101.method_14192(this.field_41431), this.field_41432);
               class_3101.method_14200(this.field_41431).method_19196(var3, 2 * class_3101.method_14192(this.field_41431), this.field_41432);
               class_3101.method_14200(this.field_41431).method_19196(var3, 3 * class_3101.method_14192(this.field_41431), this.field_41432);

               for (int var18 = 0; var18 < class_3101.method_14192(this.field_41431); var18++) {
                  int var21 = class_3101.method_14192(this.field_41431) + var18;
                  this.field_41435[var18][var10][var15] = var3[var18];
                  this.field_41435[var18][var10][var15 + 1] = var3[var21];
                  this.field_41435[var18][var10][var15 + 2] = var3[var21 + class_3101.method_14192(this.field_41431)];
                  this.field_41435[var18][var10][var15 + 3] = var3[var21 + 2 * class_3101.method_14192(this.field_41431)];
               }
            }
         }
      }
   }
}