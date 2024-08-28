package mapped;

public class Class1357 implements Runnable {
   private static String[] field7236;
   public final int field7237;
   public final int field7238;
   public final int field7239;
   public final int field7240;
   public final double[] field7241;
   public final boolean field7242;
   public final Class3612 field7243;

   public Class1357(Class3612 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field7243 = var1;
      this.field7237 = var2;
      this.field7238 = var3;
      this.field7239 = var4;
      this.field7240 = var5;
      this.field7241 = var6;
      this.field7242 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field7237];
      if (this.field7238 != -1) {
         if (Class3612.method12224(this.field7243) <= 2) {
            if (Class3612.method12224(this.field7243) == 2) {
               for (int var4 = this.field7239; var4 < Class3612.method12221(this.field7243); var4 += this.field7240) {
                  int var5 = var4 * Class3612.method12222(this.field7243);

                  for (int var6 = 0; var6 < Class3612.method12226(this.field7243); var6++) {
                     int var8 = var6 * Class3612.method12220(this.field7243) + var5;
                     var3[var6] = this.field7241[var8];
                     var3[Class3612.method12226(this.field7243) + var6] = this.field7241[var8 + 1];
                  }

                  Class3612.method12227(this.field7243).method33662(var3, 0, this.field7242);
                  Class3612.method12227(this.field7243).method33662(var3, Class3612.method12226(this.field7243), this.field7242);

                  for (int var16 = 0; var16 < Class3612.method12226(this.field7243); var16++) {
                     int var24 = var16 * Class3612.method12220(this.field7243) + var5;
                     this.field7241[var24] = var3[var16];
                     this.field7241[var24 + 1] = var3[Class3612.method12226(this.field7243) + var16];
                  }
               }
            }
         } else {
            for (int var10 = this.field7239; var10 < Class3612.method12221(this.field7243); var10 += this.field7240) {
               int var13 = var10 * Class3612.method12222(this.field7243);

               for (int var17 = 0; var17 < Class3612.method12224(this.field7243); var17 += 4) {
                  for (int var7 = 0; var7 < Class3612.method12226(this.field7243); var7++) {
                     int var25 = var7 * Class3612.method12220(this.field7243) + var13 + var17;
                     int var9 = Class3612.method12226(this.field7243) + var7;
                     var3[var7] = this.field7241[var25];
                     var3[var9] = this.field7241[var25 + 1];
                     var3[var9 + Class3612.method12226(this.field7243)] = this.field7241[var25 + 2];
                     var3[var9 + 2 * Class3612.method12226(this.field7243)] = this.field7241[var25 + 3];
                  }

                  Class3612.method12227(this.field7243).method33662(var3, 0, this.field7242);
                  Class3612.method12227(this.field7243).method33662(var3, Class3612.method12226(this.field7243), this.field7242);
                  Class3612.method12227(this.field7243).method33662(var3, 2 * Class3612.method12226(this.field7243), this.field7242);
                  Class3612.method12227(this.field7243).method33662(var3, 3 * Class3612.method12226(this.field7243), this.field7242);

                  for (int var21 = 0; var21 < Class3612.method12226(this.field7243); var21++) {
                     int var26 = var21 * Class3612.method12220(this.field7243) + var13 + var17;
                     int var31 = Class3612.method12226(this.field7243) + var21;
                     this.field7241[var26] = var3[var21];
                     this.field7241[var26 + 1] = var3[var31];
                     this.field7241[var26 + 2] = var3[var31 + Class3612.method12226(this.field7243)];
                     this.field7241[var26 + 3] = var3[var31 + 2 * Class3612.method12226(this.field7243)];
                  }
               }
            }
         }
      } else if (Class3612.method12224(this.field7243) <= 2) {
         if (Class3612.method12224(this.field7243) == 2) {
            for (int var11 = this.field7239; var11 < Class3612.method12221(this.field7243); var11 += this.field7240) {
               int var14 = var11 * Class3612.method12222(this.field7243);

               for (int var18 = 0; var18 < Class3612.method12226(this.field7243); var18++) {
                  int var27 = var18 * Class3612.method12220(this.field7243) + var14;
                  var3[var18] = this.field7241[var27];
                  var3[Class3612.method12226(this.field7243) + var18] = this.field7241[var27 + 1];
               }

               Class3612.method12227(this.field7243).method33658(var3, 0, this.field7242);
               Class3612.method12227(this.field7243).method33658(var3, Class3612.method12226(this.field7243), this.field7242);

               for (int var19 = 0; var19 < Class3612.method12226(this.field7243); var19++) {
                  int var28 = var19 * Class3612.method12220(this.field7243) + var14;
                  this.field7241[var28] = var3[var19];
                  this.field7241[var28 + 1] = var3[Class3612.method12226(this.field7243) + var19];
               }
            }
         }
      } else {
         for (int var12 = this.field7239; var12 < Class3612.method12221(this.field7243); var12 += this.field7240) {
            int var15 = var12 * Class3612.method12222(this.field7243);

            for (int var20 = 0; var20 < Class3612.method12224(this.field7243); var20 += 4) {
               for (int var22 = 0; var22 < Class3612.method12226(this.field7243); var22++) {
                  int var29 = var22 * Class3612.method12220(this.field7243) + var15 + var20;
                  int var32 = Class3612.method12226(this.field7243) + var22;
                  var3[var22] = this.field7241[var29];
                  var3[var32] = this.field7241[var29 + 1];
                  var3[var32 + Class3612.method12226(this.field7243)] = this.field7241[var29 + 2];
                  var3[var32 + 2 * Class3612.method12226(this.field7243)] = this.field7241[var29 + 3];
               }

               Class3612.method12227(this.field7243).method33658(var3, 0, this.field7242);
               Class3612.method12227(this.field7243).method33658(var3, Class3612.method12226(this.field7243), this.field7242);
               Class3612.method12227(this.field7243).method33658(var3, 2 * Class3612.method12226(this.field7243), this.field7242);
               Class3612.method12227(this.field7243).method33658(var3, 3 * Class3612.method12226(this.field7243), this.field7242);

               for (int var23 = 0; var23 < Class3612.method12226(this.field7243); var23++) {
                  int var30 = var23 * Class3612.method12220(this.field7243) + var15 + var20;
                  int var33 = Class3612.method12226(this.field7243) + var23;
                  this.field7241[var30] = var3[var23];
                  this.field7241[var30 + 1] = var3[var33];
                  this.field7241[var30 + 2] = var3[var33 + Class3612.method12226(this.field7243)];
                  this.field7241[var30 + 3] = var3[var33 + 2 * Class3612.method12226(this.field7243)];
               }
            }
         }
      }
   }
}
