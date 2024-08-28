package mapped;

public class Class700 implements Runnable {
   private static String[] field3574;
   public final int field3575;
   public final int field3576;
   public final int field3577;
   public final int field3578;
   public final double[] field3579;
   public final boolean field3580;
   public final Class8832 field3581;

   public Class700(Class8832 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field3581 = var1;
      this.field3575 = var2;
      this.field3576 = var3;
      this.field3577 = var4;
      this.field3578 = var5;
      this.field3579 = var6;
      this.field3580 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field3575];
      if (this.field3576 != -1) {
         for (int var4 = this.field3577; var4 < Class8832.method31961(this.field3581); var4 += this.field3578) {
            int var5 = var4 * Class8832.method31955(this.field3581);

            for (int var6 = 0; var6 < Class8832.method31956(this.field3581); var6++) {
               Class8832.method31958(this.field3581).method33652(this.field3579, var5 + var6 * Class8832.method31957(this.field3581), this.field3580);
            }

            if (Class8832.method31959(this.field3581) <= 2) {
               if (Class8832.method31959(this.field3581) == 2) {
                  for (int var13 = 0; var13 < Class8832.method31956(this.field3581); var13++) {
                     int var23 = var5 + var13 * Class8832.method31957(this.field3581);
                     var3[var13] = this.field3579[var23];
                     var3[Class8832.method31956(this.field3581) + var13] = this.field3579[var23 + 1];
                  }

                  Class8832.method31960(this.field3581).method33652(var3, 0, this.field3580);
                  Class8832.method31960(this.field3581).method33652(var3, Class8832.method31956(this.field3581), this.field3580);

                  for (int var14 = 0; var14 < Class8832.method31956(this.field3581); var14++) {
                     int var24 = var5 + var14 * Class8832.method31957(this.field3581);
                     this.field3579[var24] = var3[var14];
                     this.field3579[var24 + 1] = var3[Class8832.method31956(this.field3581) + var14];
                  }
               }
            } else {
               for (int var12 = 0; var12 < Class8832.method31959(this.field3581); var12 += 4) {
                  for (int var7 = 0; var7 < Class8832.method31956(this.field3581); var7++) {
                     int var8 = var5 + var7 * Class8832.method31957(this.field3581) + var12;
                     int var9 = Class8832.method31956(this.field3581) + var7;
                     var3[var7] = this.field3579[var8];
                     var3[var9] = this.field3579[var8 + 1];
                     var3[var9 + Class8832.method31956(this.field3581)] = this.field3579[var8 + 2];
                     var3[var9 + 2 * Class8832.method31956(this.field3581)] = this.field3579[var8 + 3];
                  }

                  Class8832.method31960(this.field3581).method33652(var3, 0, this.field3580);
                  Class8832.method31960(this.field3581).method33652(var3, Class8832.method31956(this.field3581), this.field3580);
                  Class8832.method31960(this.field3581).method33652(var3, 2 * Class8832.method31956(this.field3581), this.field3580);
                  Class8832.method31960(this.field3581).method33652(var3, 3 * Class8832.method31956(this.field3581), this.field3580);

                  for (int var19 = 0; var19 < Class8832.method31956(this.field3581); var19++) {
                     int var22 = var5 + var19 * Class8832.method31957(this.field3581) + var12;
                     int var29 = Class8832.method31956(this.field3581) + var19;
                     this.field3579[var22] = var3[var19];
                     this.field3579[var22 + 1] = var3[var29];
                     this.field3579[var22 + 2] = var3[var29 + Class8832.method31956(this.field3581)];
                     this.field3579[var22 + 3] = var3[var29 + 2 * Class8832.method31956(this.field3581)];
                  }
               }
            }
         }
      } else {
         for (int var10 = this.field3577; var10 < Class8832.method31961(this.field3581); var10 += this.field3578) {
            int var11 = var10 * Class8832.method31955(this.field3581);

            for (int var15 = 0; var15 < Class8832.method31956(this.field3581); var15++) {
               Class8832.method31958(this.field3581).method33648(this.field3579, var11 + var15 * Class8832.method31957(this.field3581));
            }

            if (Class8832.method31959(this.field3581) <= 2) {
               if (Class8832.method31959(this.field3581) == 2) {
                  for (int var17 = 0; var17 < Class8832.method31956(this.field3581); var17++) {
                     int var27 = var11 + var17 * Class8832.method31957(this.field3581);
                     var3[var17] = this.field3579[var27];
                     var3[Class8832.method31956(this.field3581) + var17] = this.field3579[var27 + 1];
                  }

                  Class8832.method31960(this.field3581).method33648(var3, 0);
                  Class8832.method31960(this.field3581).method33648(var3, Class8832.method31956(this.field3581));

                  for (int var18 = 0; var18 < Class8832.method31956(this.field3581); var18++) {
                     int var28 = var11 + var18 * Class8832.method31957(this.field3581);
                     this.field3579[var28] = var3[var18];
                     this.field3579[var28 + 1] = var3[Class8832.method31956(this.field3581) + var18];
                  }
               }
            } else {
               for (int var16 = 0; var16 < Class8832.method31959(this.field3581); var16 += 4) {
                  for (int var20 = 0; var20 < Class8832.method31956(this.field3581); var20++) {
                     int var25 = var11 + var20 * Class8832.method31957(this.field3581) + var16;
                     int var30 = Class8832.method31956(this.field3581) + var20;
                     var3[var20] = this.field3579[var25];
                     var3[var30] = this.field3579[var25 + 1];
                     var3[var30 + Class8832.method31956(this.field3581)] = this.field3579[var25 + 2];
                     var3[var30 + 2 * Class8832.method31956(this.field3581)] = this.field3579[var25 + 3];
                  }

                  Class8832.method31960(this.field3581).method33648(var3, 0);
                  Class8832.method31960(this.field3581).method33648(var3, Class8832.method31956(this.field3581));
                  Class8832.method31960(this.field3581).method33648(var3, 2 * Class8832.method31956(this.field3581));
                  Class8832.method31960(this.field3581).method33648(var3, 3 * Class8832.method31956(this.field3581));

                  for (int var21 = 0; var21 < Class8832.method31956(this.field3581); var21++) {
                     int var26 = var11 + var21 * Class8832.method31957(this.field3581) + var16;
                     int var31 = Class8832.method31956(this.field3581) + var21;
                     this.field3579[var26] = var3[var21];
                     this.field3579[var26 + 1] = var3[var31];
                     this.field3579[var26 + 2] = var3[var31 + Class8832.method31956(this.field3581)];
                     this.field3579[var26 + 3] = var3[var31 + 2 * Class8832.method31956(this.field3581)];
                  }
               }
            }
         }
      }
   }
}
