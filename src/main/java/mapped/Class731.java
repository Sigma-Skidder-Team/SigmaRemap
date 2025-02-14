package mapped;

public class Class731 implements Runnable {
   private static String[] field3778;
   public final int field3779;
   public final int field3780;
   public final int field3781;
   public final int field3782;
   public final double[][][] field3783;
   public final boolean field3784;
   public final Class3612 field3785;

   public Class731(Class3612 var1, int var2, int var3, int var4, int var5, double[][][] var6, boolean var7) {
      this.field3785 = var1;
      this.field3779 = var2;
      this.field3780 = var3;
      this.field3781 = var4;
      this.field3782 = var5;
      this.field3783 = var6;
      this.field3784 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field3779];
      if (this.field3780 != -1) {
         for (int var4 = this.field3781; var4 < Class3612.method12226(this.field3785); var4 += this.field3782) {
            for (int var5 = 0; var5 < Class3612.method12221(this.field3785); var5++) {
               Class3612.method12223(this.field3785).method33660(this.field3783[var4][var5], this.field3784);
            }

            if (Class3612.method12224(this.field3785) <= 2) {
               if (Class3612.method12224(this.field3785) == 2) {
                  for (int var10 = 0; var10 < Class3612.method12221(this.field3785); var10++) {
                     var3[var10] = this.field3783[var4][var10][0];
                     var3[Class3612.method12221(this.field3785) + var10] = this.field3783[var4][var10][1];
                  }

                  Class3612.method12225(this.field3785).method33662(var3, 0, this.field3784);
                  Class3612.method12225(this.field3785).method33662(var3, Class3612.method12221(this.field3785), this.field3784);

                  for (int var11 = 0; var11 < Class3612.method12221(this.field3785); var11++) {
                     this.field3783[var4][var11][0] = var3[var11];
                     this.field3783[var4][var11][1] = var3[Class3612.method12221(this.field3785) + var11];
                  }
               }
            } else {
               for (int var9 = 0; var9 < Class3612.method12224(this.field3785); var9 += 4) {
                  for (int var6 = 0; var6 < Class3612.method12221(this.field3785); var6++) {
                     int var7 = Class3612.method12221(this.field3785) + var6;
                     var3[var6] = this.field3783[var4][var6][var9];
                     var3[var7] = this.field3783[var4][var6][var9 + 1];
                     var3[var7 + Class3612.method12221(this.field3785)] = this.field3783[var4][var6][var9 + 2];
                     var3[var7 + 2 * Class3612.method12221(this.field3785)] = this.field3783[var4][var6][var9 + 3];
                  }

                  Class3612.method12225(this.field3785).method33662(var3, 0, this.field3784);
                  Class3612.method12225(this.field3785).method33662(var3, Class3612.method12221(this.field3785), this.field3784);
                  Class3612.method12225(this.field3785).method33662(var3, 2 * Class3612.method12221(this.field3785), this.field3784);
                  Class3612.method12225(this.field3785).method33662(var3, 3 * Class3612.method12221(this.field3785), this.field3784);

                  for (int var16 = 0; var16 < Class3612.method12221(this.field3785); var16++) {
                     int var19 = Class3612.method12221(this.field3785) + var16;
                     this.field3783[var4][var16][var9] = var3[var16];
                     this.field3783[var4][var16][var9 + 1] = var3[var19];
                     this.field3783[var4][var16][var9 + 2] = var3[var19 + Class3612.method12221(this.field3785)];
                     this.field3783[var4][var16][var9 + 3] = var3[var19 + 2 * Class3612.method12221(this.field3785)];
                  }
               }
            }
         }
      } else {
         for (int var8 = this.field3781; var8 < Class3612.method12226(this.field3785); var8 += this.field3782) {
            for (int var12 = 0; var12 < Class3612.method12221(this.field3785); var12++) {
               Class3612.method12223(this.field3785).method33656(this.field3783[var8][var12], this.field3784);
            }

            if (Class3612.method12224(this.field3785) <= 2) {
               if (Class3612.method12224(this.field3785) == 2) {
                  for (int var14 = 0; var14 < Class3612.method12221(this.field3785); var14++) {
                     var3[var14] = this.field3783[var8][var14][0];
                     var3[Class3612.method12221(this.field3785) + var14] = this.field3783[var8][var14][1];
                  }

                  Class3612.method12225(this.field3785).method33658(var3, 0, this.field3784);
                  Class3612.method12225(this.field3785).method33658(var3, Class3612.method12221(this.field3785), this.field3784);

                  for (int var15 = 0; var15 < Class3612.method12221(this.field3785); var15++) {
                     this.field3783[var8][var15][0] = var3[var15];
                     this.field3783[var8][var15][1] = var3[Class3612.method12221(this.field3785) + var15];
                  }
               }
            } else {
               for (int var13 = 0; var13 < Class3612.method12224(this.field3785); var13 += 4) {
                  for (int var17 = 0; var17 < Class3612.method12221(this.field3785); var17++) {
                     int var20 = Class3612.method12221(this.field3785) + var17;
                     var3[var17] = this.field3783[var8][var17][var13];
                     var3[var20] = this.field3783[var8][var17][var13 + 1];
                     var3[var20 + Class3612.method12221(this.field3785)] = this.field3783[var8][var17][var13 + 2];
                     var3[var20 + 2 * Class3612.method12221(this.field3785)] = this.field3783[var8][var17][var13 + 3];
                  }

                  Class3612.method12225(this.field3785).method33658(var3, 0, this.field3784);
                  Class3612.method12225(this.field3785).method33658(var3, Class3612.method12221(this.field3785), this.field3784);
                  Class3612.method12225(this.field3785).method33658(var3, 2 * Class3612.method12221(this.field3785), this.field3784);
                  Class3612.method12225(this.field3785).method33658(var3, 3 * Class3612.method12221(this.field3785), this.field3784);

                  for (int var18 = 0; var18 < Class3612.method12221(this.field3785); var18++) {
                     int var21 = Class3612.method12221(this.field3785) + var18;
                     this.field3783[var8][var18][var13] = var3[var18];
                     this.field3783[var8][var18][var13 + 1] = var3[var21];
                     this.field3783[var8][var18][var13 + 2] = var3[var21 + Class3612.method12221(this.field3785)];
                     this.field3783[var8][var18][var13 + 3] = var3[var21 + 2 * Class3612.method12221(this.field3785)];
                  }
               }
            }
         }
      }
   }
}
