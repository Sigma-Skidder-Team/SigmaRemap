package remapped;

public class class_5450 implements Runnable {
   private static String[] field_27785;

   public class_5450(class_84 var1, int var2, int var3, int var4, int var5, double[][][] var6, boolean var7) {
      this.field_27781 = var1;
      this.field_27779 = var2;
      this.field_27784 = var3;
      this.field_27783 = var4;
      this.field_27780 = var5;
      this.field_27786 = var6;
      this.field_27782 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_27779];
      if (this.field_27784 != -1) {
         for (int var4 = this.field_27783; var4 < class_84.method_175(this.field_27781); var4 += this.field_27780) {
            for (int var5 = 0; var5 < class_84.method_200(this.field_27781); var5++) {
               class_84.method_187(this.field_27781).method_31289(this.field_27786[var4][var5], this.field_27782);
            }

            if (class_84.method_198(this.field_27781) <= 2) {
               if (class_84.method_198(this.field_27781) == 2) {
                  for (int var10 = 0; var10 < class_84.method_200(this.field_27781); var10++) {
                     var3[var10] = this.field_27786[var4][var10][0];
                     var3[class_84.method_200(this.field_27781) + var10] = this.field_27786[var4][var10][1];
                  }

                  class_84.method_189(this.field_27781).method_31288(var3, 0, this.field_27782);
                  class_84.method_189(this.field_27781).method_31288(var3, class_84.method_200(this.field_27781), this.field_27782);

                  for (int var11 = 0; var11 < class_84.method_200(this.field_27781); var11++) {
                     this.field_27786[var4][var11][0] = var3[var11];
                     this.field_27786[var4][var11][1] = var3[class_84.method_200(this.field_27781) + var11];
                  }
               }
            } else {
               for (byte var9 = 0; var9 < class_84.method_198(this.field_27781); var9 += 4) {
                  for (int var6 = 0; var6 < class_84.method_200(this.field_27781); var6++) {
                     int var7 = class_84.method_200(this.field_27781) + var6;
                     var3[var6] = this.field_27786[var4][var6][var9];
                     var3[var7] = this.field_27786[var4][var6][var9 + 1];
                     var3[var7 + class_84.method_200(this.field_27781)] = this.field_27786[var4][var6][var9 + 2];
                     var3[var7 + 2 * class_84.method_200(this.field_27781)] = this.field_27786[var4][var6][var9 + 3];
                  }

                  class_84.method_189(this.field_27781).method_31288(var3, 0, this.field_27782);
                  class_84.method_189(this.field_27781).method_31288(var3, class_84.method_200(this.field_27781), this.field_27782);
                  class_84.method_189(this.field_27781).method_31288(var3, 2 * class_84.method_200(this.field_27781), this.field_27782);
                  class_84.method_189(this.field_27781).method_31288(var3, 3 * class_84.method_200(this.field_27781), this.field_27782);

                  for (int var16 = 0; var16 < class_84.method_200(this.field_27781); var16++) {
                     int var19 = class_84.method_200(this.field_27781) + var16;
                     this.field_27786[var4][var16][var9] = var3[var16];
                     this.field_27786[var4][var16][var9 + 1] = var3[var19];
                     this.field_27786[var4][var16][var9 + 2] = var3[var19 + class_84.method_200(this.field_27781)];
                     this.field_27786[var4][var16][var9 + 3] = var3[var19 + 2 * class_84.method_200(this.field_27781)];
                  }
               }
            }
         }
      } else {
         for (int var8 = this.field_27783; var8 < class_84.method_175(this.field_27781); var8 += this.field_27780) {
            for (int var12 = 0; var12 < class_84.method_200(this.field_27781); var12++) {
               class_84.method_187(this.field_27781).method_31295(this.field_27786[var8][var12], this.field_27782);
            }

            if (class_84.method_198(this.field_27781) <= 2) {
               if (class_84.method_198(this.field_27781) == 2) {
                  for (int var14 = 0; var14 < class_84.method_200(this.field_27781); var14++) {
                     var3[var14] = this.field_27786[var8][var14][0];
                     var3[class_84.method_200(this.field_27781) + var14] = this.field_27786[var8][var14][1];
                  }

                  class_84.method_189(this.field_27781).method_31294(var3, 0, this.field_27782);
                  class_84.method_189(this.field_27781).method_31294(var3, class_84.method_200(this.field_27781), this.field_27782);

                  for (int var15 = 0; var15 < class_84.method_200(this.field_27781); var15++) {
                     this.field_27786[var8][var15][0] = var3[var15];
                     this.field_27786[var8][var15][1] = var3[class_84.method_200(this.field_27781) + var15];
                  }
               }
            } else {
               for (byte var13 = 0; var13 < class_84.method_198(this.field_27781); var13 += 4) {
                  for (int var17 = 0; var17 < class_84.method_200(this.field_27781); var17++) {
                     int var20 = class_84.method_200(this.field_27781) + var17;
                     var3[var17] = this.field_27786[var8][var17][var13];
                     var3[var20] = this.field_27786[var8][var17][var13 + 1];
                     var3[var20 + class_84.method_200(this.field_27781)] = this.field_27786[var8][var17][var13 + 2];
                     var3[var20 + 2 * class_84.method_200(this.field_27781)] = this.field_27786[var8][var17][var13 + 3];
                  }

                  class_84.method_189(this.field_27781).method_31294(var3, 0, this.field_27782);
                  class_84.method_189(this.field_27781).method_31294(var3, class_84.method_200(this.field_27781), this.field_27782);
                  class_84.method_189(this.field_27781).method_31294(var3, 2 * class_84.method_200(this.field_27781), this.field_27782);
                  class_84.method_189(this.field_27781).method_31294(var3, 3 * class_84.method_200(this.field_27781), this.field_27782);

                  for (int var18 = 0; var18 < class_84.method_200(this.field_27781); var18++) {
                     int var21 = class_84.method_200(this.field_27781) + var18;
                     this.field_27786[var8][var18][var13] = var3[var18];
                     this.field_27786[var8][var18][var13 + 1] = var3[var21];
                     this.field_27786[var8][var18][var13 + 2] = var3[var21 + class_84.method_200(this.field_27781)];
                     this.field_27786[var8][var18][var13 + 3] = var3[var21 + 2 * class_84.method_200(this.field_27781)];
                  }
               }
            }
         }
      }
   }
}
