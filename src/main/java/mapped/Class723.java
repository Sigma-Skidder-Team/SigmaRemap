package mapped;

public class Class723 implements Runnable {
   private static String[] field3723;
   public final int field3724;
   public final int field3725;
   public final int field3726;
   public final int field3727;
   public final double[] field3728;
   public final boolean field3729;
   public final Class8832 field3730;

   public Class723(Class8832 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field3730 = var1;
      this.field3724 = var2;
      this.field3725 = var3;
      this.field3726 = var4;
      this.field3727 = var5;
      this.field3728 = var6;
      this.field3729 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field3724];
      if (this.field3725 != -1) {
         if (Class8832.method31959(this.field3730) <= 2) {
            if (Class8832.method31959(this.field3730) == 2) {
               for (int var4 = this.field3726; var4 < Class8832.method31956(this.field3730); var4 += this.field3727) {
                  int var5 = var4 * Class8832.method31957(this.field3730);

                  for (int var6 = 0; var6 < Class8832.method31961(this.field3730); var6++) {
                     int var8 = var6 * Class8832.method31955(this.field3730) + var5;
                     var3[var6] = this.field3728[var8];
                     var3[Class8832.method31961(this.field3730) + var6] = this.field3728[var8 + 1];
                  }

                  Class8832.method31962(this.field3730).method33652(var3, 0, this.field3729);
                  Class8832.method31962(this.field3730).method33652(var3, Class8832.method31961(this.field3730), this.field3729);

                  for (int var16 = 0; var16 < Class8832.method31961(this.field3730); var16++) {
                     int var24 = var16 * Class8832.method31955(this.field3730) + var5;
                     this.field3728[var24] = var3[var16];
                     this.field3728[var24 + 1] = var3[Class8832.method31961(this.field3730) + var16];
                  }
               }
            }
         } else {
            for (int var10 = this.field3726; var10 < Class8832.method31956(this.field3730); var10 += this.field3727) {
               int var13 = var10 * Class8832.method31957(this.field3730);

               for (int var17 = 0; var17 < Class8832.method31959(this.field3730); var17 += 4) {
                  for (int var7 = 0; var7 < Class8832.method31961(this.field3730); var7++) {
                     int var25 = var7 * Class8832.method31955(this.field3730) + var13 + var17;
                     int var9 = Class8832.method31961(this.field3730) + var7;
                     var3[var7] = this.field3728[var25];
                     var3[var9] = this.field3728[var25 + 1];
                     var3[var9 + Class8832.method31961(this.field3730)] = this.field3728[var25 + 2];
                     var3[var9 + 2 * Class8832.method31961(this.field3730)] = this.field3728[var25 + 3];
                  }

                  Class8832.method31962(this.field3730).method33652(var3, 0, this.field3729);
                  Class8832.method31962(this.field3730).method33652(var3, Class8832.method31961(this.field3730), this.field3729);
                  Class8832.method31962(this.field3730).method33652(var3, 2 * Class8832.method31961(this.field3730), this.field3729);
                  Class8832.method31962(this.field3730).method33652(var3, 3 * Class8832.method31961(this.field3730), this.field3729);

                  for (int var21 = 0; var21 < Class8832.method31961(this.field3730); var21++) {
                     int var26 = var21 * Class8832.method31955(this.field3730) + var13 + var17;
                     int var31 = Class8832.method31961(this.field3730) + var21;
                     this.field3728[var26] = var3[var21];
                     this.field3728[var26 + 1] = var3[var31];
                     this.field3728[var26 + 2] = var3[var31 + Class8832.method31961(this.field3730)];
                     this.field3728[var26 + 3] = var3[var31 + 2 * Class8832.method31961(this.field3730)];
                  }
               }
            }
         }
      } else if (Class8832.method31959(this.field3730) <= 2) {
         if (Class8832.method31959(this.field3730) == 2) {
            for (int var11 = this.field3726; var11 < Class8832.method31956(this.field3730); var11 += this.field3727) {
               int var14 = var11 * Class8832.method31957(this.field3730);

               for (int var18 = 0; var18 < Class8832.method31961(this.field3730); var18++) {
                  int var27 = var18 * Class8832.method31955(this.field3730) + var14;
                  var3[var18] = this.field3728[var27];
                  var3[Class8832.method31961(this.field3730) + var18] = this.field3728[var27 + 1];
               }

               Class8832.method31962(this.field3730).method33648(var3, 0);
               Class8832.method31962(this.field3730).method33648(var3, Class8832.method31961(this.field3730));

               for (int var19 = 0; var19 < Class8832.method31961(this.field3730); var19++) {
                  int var28 = var19 * Class8832.method31955(this.field3730) + var14;
                  this.field3728[var28] = var3[var19];
                  this.field3728[var28 + 1] = var3[Class8832.method31961(this.field3730) + var19];
               }
            }
         }
      } else {
         for (int var12 = this.field3726; var12 < Class8832.method31956(this.field3730); var12 += this.field3727) {
            int var15 = var12 * Class8832.method31957(this.field3730);

            for (int var20 = 0; var20 < Class8832.method31959(this.field3730); var20 += 4) {
               for (int var22 = 0; var22 < Class8832.method31961(this.field3730); var22++) {
                  int var29 = var22 * Class8832.method31955(this.field3730) + var15 + var20;
                  int var32 = Class8832.method31961(this.field3730) + var22;
                  var3[var22] = this.field3728[var29];
                  var3[var32] = this.field3728[var29 + 1];
                  var3[var32 + Class8832.method31961(this.field3730)] = this.field3728[var29 + 2];
                  var3[var32 + 2 * Class8832.method31961(this.field3730)] = this.field3728[var29 + 3];
               }

               Class8832.method31962(this.field3730).method33648(var3, 0);
               Class8832.method31962(this.field3730).method33648(var3, Class8832.method31961(this.field3730));
               Class8832.method31962(this.field3730).method33648(var3, 2 * Class8832.method31961(this.field3730));
               Class8832.method31962(this.field3730).method33648(var3, 3 * Class8832.method31961(this.field3730));

               for (int var23 = 0; var23 < Class8832.method31961(this.field3730); var23++) {
                  int var30 = var23 * Class8832.method31955(this.field3730) + var15 + var20;
                  int var33 = Class8832.method31961(this.field3730) + var23;
                  this.field3728[var30] = var3[var23];
                  this.field3728[var30 + 1] = var3[var33];
                  this.field3728[var30 + 2] = var3[var33 + Class8832.method31961(this.field3730)];
                  this.field3728[var30 + 3] = var3[var33 + 2 * Class8832.method31961(this.field3730)];
               }
            }
         }
      }
   }
}
