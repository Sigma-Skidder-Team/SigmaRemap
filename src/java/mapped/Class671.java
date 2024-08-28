package mapped;

public class Class671 implements Runnable {
   private static String[] field3392;
   public final int field3393;
   public final int field3394;
   public final int field3395;
   public final int field3396;
   public final double[] field3397;
   public final boolean field3398;
   public final Class3612 field3399;

   public Class671(Class3612 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field3399 = var1;
      this.field3393 = var2;
      this.field3394 = var3;
      this.field3395 = var4;
      this.field3396 = var5;
      this.field3397 = var6;
      this.field3398 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field3393];
      if (this.field3394 != -1) {
         for (int var4 = this.field3395; var4 < Class3612.method12226(this.field3399); var4 += this.field3396) {
            int var5 = var4 * Class3612.method12220(this.field3399);

            for (int var6 = 0; var6 < Class3612.method12221(this.field3399); var6++) {
               Class3612.method12223(this.field3399).method33662(this.field3397, var5 + var6 * Class3612.method12222(this.field3399), this.field3398);
            }

            if (Class3612.method12224(this.field3399) <= 2) {
               if (Class3612.method12224(this.field3399) == 2) {
                  for (int var13 = 0; var13 < Class3612.method12221(this.field3399); var13++) {
                     int var23 = var5 + var13 * Class3612.method12222(this.field3399);
                     var3[var13] = this.field3397[var23];
                     var3[Class3612.method12221(this.field3399) + var13] = this.field3397[var23 + 1];
                  }

                  Class3612.method12225(this.field3399).method33662(var3, 0, this.field3398);
                  Class3612.method12225(this.field3399).method33662(var3, Class3612.method12221(this.field3399), this.field3398);

                  for (int var14 = 0; var14 < Class3612.method12221(this.field3399); var14++) {
                     int var24 = var5 + var14 * Class3612.method12222(this.field3399);
                     this.field3397[var24] = var3[var14];
                     this.field3397[var24 + 1] = var3[Class3612.method12221(this.field3399) + var14];
                  }
               }
            } else {
               for (int var12 = 0; var12 < Class3612.method12224(this.field3399); var12 += 4) {
                  for (int var7 = 0; var7 < Class3612.method12221(this.field3399); var7++) {
                     int var8 = var5 + var7 * Class3612.method12222(this.field3399) + var12;
                     int var9 = Class3612.method12221(this.field3399) + var7;
                     var3[var7] = this.field3397[var8];
                     var3[var9] = this.field3397[var8 + 1];
                     var3[var9 + Class3612.method12221(this.field3399)] = this.field3397[var8 + 2];
                     var3[var9 + 2 * Class3612.method12221(this.field3399)] = this.field3397[var8 + 3];
                  }

                  Class3612.method12225(this.field3399).method33662(var3, 0, this.field3398);
                  Class3612.method12225(this.field3399).method33662(var3, Class3612.method12221(this.field3399), this.field3398);
                  Class3612.method12225(this.field3399).method33662(var3, 2 * Class3612.method12221(this.field3399), this.field3398);
                  Class3612.method12225(this.field3399).method33662(var3, 3 * Class3612.method12221(this.field3399), this.field3398);

                  for (int var19 = 0; var19 < Class3612.method12221(this.field3399); var19++) {
                     int var22 = var5 + var19 * Class3612.method12222(this.field3399) + var12;
                     int var29 = Class3612.method12221(this.field3399) + var19;
                     this.field3397[var22] = var3[var19];
                     this.field3397[var22 + 1] = var3[var29];
                     this.field3397[var22 + 2] = var3[var29 + Class3612.method12221(this.field3399)];
                     this.field3397[var22 + 3] = var3[var29 + 2 * Class3612.method12221(this.field3399)];
                  }
               }
            }
         }
      } else {
         for (int var10 = this.field3395; var10 < Class3612.method12226(this.field3399); var10 += this.field3396) {
            int var11 = var10 * Class3612.method12220(this.field3399);

            for (int var15 = 0; var15 < Class3612.method12221(this.field3399); var15++) {
               Class3612.method12223(this.field3399).method33658(this.field3397, var11 + var15 * Class3612.method12222(this.field3399), this.field3398);
            }

            if (Class3612.method12224(this.field3399) <= 2) {
               if (Class3612.method12224(this.field3399) == 2) {
                  for (int var17 = 0; var17 < Class3612.method12221(this.field3399); var17++) {
                     int var27 = var11 + var17 * Class3612.method12222(this.field3399);
                     var3[var17] = this.field3397[var27];
                     var3[Class3612.method12221(this.field3399) + var17] = this.field3397[var27 + 1];
                  }

                  Class3612.method12225(this.field3399).method33658(var3, 0, this.field3398);
                  Class3612.method12225(this.field3399).method33658(var3, Class3612.method12221(this.field3399), this.field3398);

                  for (int var18 = 0; var18 < Class3612.method12221(this.field3399); var18++) {
                     int var28 = var11 + var18 * Class3612.method12222(this.field3399);
                     this.field3397[var28] = var3[var18];
                     this.field3397[var28 + 1] = var3[Class3612.method12221(this.field3399) + var18];
                  }
               }
            } else {
               for (int var16 = 0; var16 < Class3612.method12224(this.field3399); var16 += 4) {
                  for (int var20 = 0; var20 < Class3612.method12221(this.field3399); var20++) {
                     int var25 = var11 + var20 * Class3612.method12222(this.field3399) + var16;
                     int var30 = Class3612.method12221(this.field3399) + var20;
                     var3[var20] = this.field3397[var25];
                     var3[var30] = this.field3397[var25 + 1];
                     var3[var30 + Class3612.method12221(this.field3399)] = this.field3397[var25 + 2];
                     var3[var30 + 2 * Class3612.method12221(this.field3399)] = this.field3397[var25 + 3];
                  }

                  Class3612.method12225(this.field3399).method33658(var3, 0, this.field3398);
                  Class3612.method12225(this.field3399).method33658(var3, Class3612.method12221(this.field3399), this.field3398);
                  Class3612.method12225(this.field3399).method33658(var3, 2 * Class3612.method12221(this.field3399), this.field3398);
                  Class3612.method12225(this.field3399).method33658(var3, 3 * Class3612.method12221(this.field3399), this.field3398);

                  for (int var21 = 0; var21 < Class3612.method12221(this.field3399); var21++) {
                     int var26 = var11 + var21 * Class3612.method12222(this.field3399) + var16;
                     int var31 = Class3612.method12221(this.field3399) + var21;
                     this.field3397[var26] = var3[var21];
                     this.field3397[var26 + 1] = var3[var31];
                     this.field3397[var26 + 2] = var3[var31 + Class3612.method12221(this.field3399)];
                     this.field3397[var26 + 3] = var3[var31 + 2 * Class3612.method12221(this.field3399)];
                  }
               }
            }
         }
      }
   }
}
