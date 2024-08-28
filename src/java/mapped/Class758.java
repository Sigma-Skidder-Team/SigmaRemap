package mapped;

public class Class758 implements Runnable {
   private static String[] field3931;
   public final int field3932;
   public final int field3933;
   public final int field3934;
   public final int field3935;
   public final double[] field3936;
   public final boolean field3937;
   public final Class9615 field3938;

   public Class758(Class9615 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field3938 = var1;
      this.field3932 = var2;
      this.field3933 = var3;
      this.field3934 = var4;
      this.field3935 = var5;
      this.field3936 = var6;
      this.field3937 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field3932];
      if (this.field3933 != -1) {
         if (Class9615.method37427(this.field3938) <= 4 * this.field3934) {
            if (Class9615.method37427(this.field3938) != 4 * this.field3934) {
               if (Class9615.method37427(this.field3938) == 2 * this.field3934) {
                  for (int var4 = 0; var4 < Class9615.method37424(this.field3938); var4++) {
                     int var6 = var4 * Class9615.method37427(this.field3938) + 2 * this.field3935;
                     int var7 = 2 * var4;
                     var3[var7] = this.field3936[var6];
                     var3[var7 + 1] = this.field3936[var6 + 1];
                  }

                  Class9615.method37425(this.field3938).method27168(var3, 0, this.field3937);

                  for (int var11 = 0; var11 < Class9615.method37424(this.field3938); var11++) {
                     int var23 = var11 * Class9615.method37427(this.field3938) + 2 * this.field3935;
                     int var34 = 2 * var11;
                     this.field3936[var23] = var3[var34];
                     this.field3936[var23 + 1] = var3[var34 + 1];
                  }
               }
            } else {
               for (int var12 = 0; var12 < Class9615.method37424(this.field3938); var12++) {
                  int var24 = var12 * Class9615.method37427(this.field3938) + 4 * this.field3935;
                  int var35 = 2 * var12;
                  int var8 = 2 * Class9615.method37424(this.field3938) + 2 * var12;
                  var3[var35] = this.field3936[var24];
                  var3[var35 + 1] = this.field3936[var24 + 1];
                  var3[var8] = this.field3936[var24 + 2];
                  var3[var8 + 1] = this.field3936[var24 + 3];
               }

               Class9615.method37425(this.field3938).method27168(var3, 0, this.field3937);
               Class9615.method37425(this.field3938).method27168(var3, 2 * Class9615.method37424(this.field3938), this.field3937);

               for (int var13 = 0; var13 < Class9615.method37424(this.field3938); var13++) {
                  int var25 = var13 * Class9615.method37427(this.field3938) + 4 * this.field3935;
                  int var36 = 2 * var13;
                  int var45 = 2 * Class9615.method37424(this.field3938) + 2 * var13;
                  this.field3936[var25] = var3[var36];
                  this.field3936[var25 + 1] = var3[var36 + 1];
                  this.field3936[var25 + 2] = var3[var45];
                  this.field3936[var25 + 3] = var3[var45 + 1];
               }
            }
         } else {
            for (int var14 = 8 * this.field3935; var14 < Class9615.method37427(this.field3938); var14 += 8 * this.field3934) {
               for (int var5 = 0; var5 < Class9615.method37424(this.field3938); var5++) {
                  int var26 = var5 * Class9615.method37427(this.field3938) + var14;
                  int var37 = 2 * var5;
                  int var46 = 2 * Class9615.method37424(this.field3938) + 2 * var5;
                  int var9 = var46 + 2 * Class9615.method37424(this.field3938);
                  int var10 = var9 + 2 * Class9615.method37424(this.field3938);
                  var3[var37] = this.field3936[var26];
                  var3[var37 + 1] = this.field3936[var26 + 1];
                  var3[var46] = this.field3936[var26 + 2];
                  var3[var46 + 1] = this.field3936[var26 + 3];
                  var3[var9] = this.field3936[var26 + 4];
                  var3[var9 + 1] = this.field3936[var26 + 5];
                  var3[var10] = this.field3936[var26 + 6];
                  var3[var10 + 1] = this.field3936[var26 + 7];
               }

               Class9615.method37425(this.field3938).method27168(var3, 0, this.field3937);
               Class9615.method37425(this.field3938).method27168(var3, 2 * Class9615.method37424(this.field3938), this.field3937);
               Class9615.method37425(this.field3938).method27168(var3, 4 * Class9615.method37424(this.field3938), this.field3937);
               Class9615.method37425(this.field3938).method27168(var3, 6 * Class9615.method37424(this.field3938), this.field3937);

               for (int var20 = 0; var20 < Class9615.method37424(this.field3938); var20++) {
                  int var27 = var20 * Class9615.method37427(this.field3938) + var14;
                  int var38 = 2 * var20;
                  int var47 = 2 * Class9615.method37424(this.field3938) + 2 * var20;
                  int var52 = var47 + 2 * Class9615.method37424(this.field3938);
                  int var55 = var52 + 2 * Class9615.method37424(this.field3938);
                  this.field3936[var27] = var3[var38];
                  this.field3936[var27 + 1] = var3[var38 + 1];
                  this.field3936[var27 + 2] = var3[var47];
                  this.field3936[var27 + 3] = var3[var47 + 1];
                  this.field3936[var27 + 4] = var3[var52];
                  this.field3936[var27 + 5] = var3[var52 + 1];
                  this.field3936[var27 + 6] = var3[var55];
                  this.field3936[var27 + 7] = var3[var55 + 1];
               }
            }
         }
      } else if (Class9615.method37427(this.field3938) <= 4 * this.field3934) {
         if (Class9615.method37427(this.field3938) != 4 * this.field3934) {
            if (Class9615.method37427(this.field3938) == 2 * this.field3934) {
               for (int var15 = 0; var15 < Class9615.method37424(this.field3938); var15++) {
                  int var28 = var15 * Class9615.method37427(this.field3938) + 2 * this.field3935;
                  int var39 = 2 * var15;
                  var3[var39] = this.field3936[var28];
                  var3[var39 + 1] = this.field3936[var28 + 1];
               }

               Class9615.method37425(this.field3938).method27164(var3, 0);

               for (int var16 = 0; var16 < Class9615.method37424(this.field3938); var16++) {
                  int var29 = var16 * Class9615.method37427(this.field3938) + 2 * this.field3935;
                  int var40 = 2 * var16;
                  this.field3936[var29] = var3[var40];
                  this.field3936[var29 + 1] = var3[var40 + 1];
               }
            }
         } else {
            for (int var17 = 0; var17 < Class9615.method37424(this.field3938); var17++) {
               int var30 = var17 * Class9615.method37427(this.field3938) + 4 * this.field3935;
               int var41 = 2 * var17;
               int var48 = 2 * Class9615.method37424(this.field3938) + 2 * var17;
               var3[var41] = this.field3936[var30];
               var3[var41 + 1] = this.field3936[var30 + 1];
               var3[var48] = this.field3936[var30 + 2];
               var3[var48 + 1] = this.field3936[var30 + 3];
            }

            Class9615.method37425(this.field3938).method27164(var3, 0);
            Class9615.method37425(this.field3938).method27164(var3, 2 * Class9615.method37424(this.field3938));

            for (int var18 = 0; var18 < Class9615.method37424(this.field3938); var18++) {
               int var31 = var18 * Class9615.method37427(this.field3938) + 4 * this.field3935;
               int var42 = 2 * var18;
               int var49 = 2 * Class9615.method37424(this.field3938) + 2 * var18;
               this.field3936[var31] = var3[var42];
               this.field3936[var31 + 1] = var3[var42 + 1];
               this.field3936[var31 + 2] = var3[var49];
               this.field3936[var31 + 3] = var3[var49 + 1];
            }
         }
      } else {
         for (int var19 = 8 * this.field3935; var19 < Class9615.method37427(this.field3938); var19 += 8 * this.field3934) {
            for (int var21 = 0; var21 < Class9615.method37424(this.field3938); var21++) {
               int var32 = var21 * Class9615.method37427(this.field3938) + var19;
               int var43 = 2 * var21;
               int var50 = 2 * Class9615.method37424(this.field3938) + 2 * var21;
               int var53 = var50 + 2 * Class9615.method37424(this.field3938);
               int var56 = var53 + 2 * Class9615.method37424(this.field3938);
               var3[var43] = this.field3936[var32];
               var3[var43 + 1] = this.field3936[var32 + 1];
               var3[var50] = this.field3936[var32 + 2];
               var3[var50 + 1] = this.field3936[var32 + 3];
               var3[var53] = this.field3936[var32 + 4];
               var3[var53 + 1] = this.field3936[var32 + 5];
               var3[var56] = this.field3936[var32 + 6];
               var3[var56 + 1] = this.field3936[var32 + 7];
            }

            Class9615.method37425(this.field3938).method27164(var3, 0);
            Class9615.method37425(this.field3938).method27164(var3, 2 * Class9615.method37424(this.field3938));
            Class9615.method37425(this.field3938).method27164(var3, 4 * Class9615.method37424(this.field3938));
            Class9615.method37425(this.field3938).method27164(var3, 6 * Class9615.method37424(this.field3938));

            for (int var22 = 0; var22 < Class9615.method37424(this.field3938); var22++) {
               int var33 = var22 * Class9615.method37427(this.field3938) + var19;
               int var44 = 2 * var22;
               int var51 = 2 * Class9615.method37424(this.field3938) + 2 * var22;
               int var54 = var51 + 2 * Class9615.method37424(this.field3938);
               int var57 = var54 + 2 * Class9615.method37424(this.field3938);
               this.field3936[var33] = var3[var44];
               this.field3936[var33 + 1] = var3[var44 + 1];
               this.field3936[var33 + 2] = var3[var51];
               this.field3936[var33 + 3] = var3[var51 + 1];
               this.field3936[var33 + 4] = var3[var54];
               this.field3936[var33 + 5] = var3[var54 + 1];
               this.field3936[var33 + 6] = var3[var57];
               this.field3936[var33 + 7] = var3[var57 + 1];
            }
         }
      }
   }
}
