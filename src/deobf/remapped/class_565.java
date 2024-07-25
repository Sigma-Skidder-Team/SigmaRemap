package remapped;

public class class_565 implements Runnable {
   private static String[] field_3340;

   public class_565(class_84 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field_3341 = var1;
      this.field_3344 = var2;
      this.field_3342 = var3;
      this.field_3338 = var4;
      this.field_3339 = var5;
      this.field_3343 = var6;
      this.field_3345 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_3344];
      if (this.field_3342 != -1) {
         for (int var4 = this.field_3338; var4 < class_84.method_175(this.field_3341); var4 += this.field_3339) {
            int var5 = var4 * class_84.method_180(this.field_3341);

            for (int var6 = 0; var6 < class_84.method_200(this.field_3341); var6++) {
               class_84.method_187(this.field_3341).method_31288(this.field_3343, var5 + var6 * class_84.method_188(this.field_3341), this.field_3345);
            }

            if (class_84.method_198(this.field_3341) <= 2) {
               if (class_84.method_198(this.field_3341) == 2) {
                  for (int var13 = 0; var13 < class_84.method_200(this.field_3341); var13++) {
                     int var23 = var5 + var13 * class_84.method_188(this.field_3341);
                     var3[var13] = this.field_3343[var23];
                     var3[class_84.method_200(this.field_3341) + var13] = this.field_3343[var23 + 1];
                  }

                  class_84.method_189(this.field_3341).method_31288(var3, 0, this.field_3345);
                  class_84.method_189(this.field_3341).method_31288(var3, class_84.method_200(this.field_3341), this.field_3345);

                  for (int var14 = 0; var14 < class_84.method_200(this.field_3341); var14++) {
                     int var24 = var5 + var14 * class_84.method_188(this.field_3341);
                     this.field_3343[var24] = var3[var14];
                     this.field_3343[var24 + 1] = var3[class_84.method_200(this.field_3341) + var14];
                  }
               }
            } else {
               for (byte var12 = 0; var12 < class_84.method_198(this.field_3341); var12 += 4) {
                  for (int var7 = 0; var7 < class_84.method_200(this.field_3341); var7++) {
                     int var8 = var5 + var7 * class_84.method_188(this.field_3341) + var12;
                     int var9 = class_84.method_200(this.field_3341) + var7;
                     var3[var7] = this.field_3343[var8];
                     var3[var9] = this.field_3343[var8 + 1];
                     var3[var9 + class_84.method_200(this.field_3341)] = this.field_3343[var8 + 2];
                     var3[var9 + 2 * class_84.method_200(this.field_3341)] = this.field_3343[var8 + 3];
                  }

                  class_84.method_189(this.field_3341).method_31288(var3, 0, this.field_3345);
                  class_84.method_189(this.field_3341).method_31288(var3, class_84.method_200(this.field_3341), this.field_3345);
                  class_84.method_189(this.field_3341).method_31288(var3, 2 * class_84.method_200(this.field_3341), this.field_3345);
                  class_84.method_189(this.field_3341).method_31288(var3, 3 * class_84.method_200(this.field_3341), this.field_3345);

                  for (int var19 = 0; var19 < class_84.method_200(this.field_3341); var19++) {
                     int var22 = var5 + var19 * class_84.method_188(this.field_3341) + var12;
                     int var29 = class_84.method_200(this.field_3341) + var19;
                     this.field_3343[var22] = var3[var19];
                     this.field_3343[var22 + 1] = var3[var29];
                     this.field_3343[var22 + 2] = var3[var29 + class_84.method_200(this.field_3341)];
                     this.field_3343[var22 + 3] = var3[var29 + 2 * class_84.method_200(this.field_3341)];
                  }
               }
            }
         }
      } else {
         for (int var10 = this.field_3338; var10 < class_84.method_175(this.field_3341); var10 += this.field_3339) {
            int var11 = var10 * class_84.method_180(this.field_3341);

            for (int var15 = 0; var15 < class_84.method_200(this.field_3341); var15++) {
               class_84.method_187(this.field_3341).method_31294(this.field_3343, var11 + var15 * class_84.method_188(this.field_3341), this.field_3345);
            }

            if (class_84.method_198(this.field_3341) <= 2) {
               if (class_84.method_198(this.field_3341) == 2) {
                  for (int var17 = 0; var17 < class_84.method_200(this.field_3341); var17++) {
                     int var27 = var11 + var17 * class_84.method_188(this.field_3341);
                     var3[var17] = this.field_3343[var27];
                     var3[class_84.method_200(this.field_3341) + var17] = this.field_3343[var27 + 1];
                  }

                  class_84.method_189(this.field_3341).method_31294(var3, 0, this.field_3345);
                  class_84.method_189(this.field_3341).method_31294(var3, class_84.method_200(this.field_3341), this.field_3345);

                  for (int var18 = 0; var18 < class_84.method_200(this.field_3341); var18++) {
                     int var28 = var11 + var18 * class_84.method_188(this.field_3341);
                     this.field_3343[var28] = var3[var18];
                     this.field_3343[var28 + 1] = var3[class_84.method_200(this.field_3341) + var18];
                  }
               }
            } else {
               for (byte var16 = 0; var16 < class_84.method_198(this.field_3341); var16 += 4) {
                  for (int var20 = 0; var20 < class_84.method_200(this.field_3341); var20++) {
                     int var25 = var11 + var20 * class_84.method_188(this.field_3341) + var16;
                     int var30 = class_84.method_200(this.field_3341) + var20;
                     var3[var20] = this.field_3343[var25];
                     var3[var30] = this.field_3343[var25 + 1];
                     var3[var30 + class_84.method_200(this.field_3341)] = this.field_3343[var25 + 2];
                     var3[var30 + 2 * class_84.method_200(this.field_3341)] = this.field_3343[var25 + 3];
                  }

                  class_84.method_189(this.field_3341).method_31294(var3, 0, this.field_3345);
                  class_84.method_189(this.field_3341).method_31294(var3, class_84.method_200(this.field_3341), this.field_3345);
                  class_84.method_189(this.field_3341).method_31294(var3, 2 * class_84.method_200(this.field_3341), this.field_3345);
                  class_84.method_189(this.field_3341).method_31294(var3, 3 * class_84.method_200(this.field_3341), this.field_3345);

                  for (int var21 = 0; var21 < class_84.method_200(this.field_3341); var21++) {
                     int var26 = var11 + var21 * class_84.method_188(this.field_3341) + var16;
                     int var31 = class_84.method_200(this.field_3341) + var21;
                     this.field_3343[var26] = var3[var21];
                     this.field_3343[var26 + 1] = var3[var31];
                     this.field_3343[var26 + 2] = var3[var31 + class_84.method_200(this.field_3341)];
                     this.field_3343[var26 + 3] = var3[var31 + 2 * class_84.method_200(this.field_3341)];
                  }
               }
            }
         }
      }
   }
}
