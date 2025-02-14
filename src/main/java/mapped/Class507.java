package mapped;

public class Class507 implements Runnable {
   private static String[] field2406;
   public final int field2407;
   public final int field2408;
   public final int field2409;
   public final int field2410;
   public final double[][][] field2411;
   public final boolean field2412;
   public final Class8832 field2413;

   public Class507(Class8832 var1, int var2, int var3, int var4, int var5, double[][][] var6, boolean var7) {
      this.field2413 = var1;
      this.field2407 = var2;
      this.field2408 = var3;
      this.field2409 = var4;
      this.field2410 = var5;
      this.field2411 = var6;
      this.field2412 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field2407];
      if (this.field2408 != -1) {
         if (Class8832.method31959(this.field2413) <= 2) {
            if (Class8832.method31959(this.field2413) == 2) {
               for (int var4 = this.field2409; var4 < Class8832.method31956(this.field2413); var4 += this.field2410) {
                  for (int var5 = 0; var5 < Class8832.method31961(this.field2413); var5++) {
                     var3[var5] = this.field2411[var5][var4][0];
                     var3[Class8832.method31961(this.field2413) + var5] = this.field2411[var5][var4][1];
                  }

                  Class8832.method31962(this.field2413).method33652(var3, 0, this.field2412);
                  Class8832.method31962(this.field2413).method33652(var3, Class8832.method31961(this.field2413), this.field2412);

                  for (int var11 = 0; var11 < Class8832.method31961(this.field2413); var11++) {
                     this.field2411[var11][var4][0] = var3[var11];
                     this.field2411[var11][var4][1] = var3[Class8832.method31961(this.field2413) + var11];
                  }
               }
            }
         } else {
            for (int var8 = this.field2409; var8 < Class8832.method31956(this.field2413); var8 += this.field2410) {
               for (int var12 = 0; var12 < Class8832.method31959(this.field2413); var12 += 4) {
                  for (int var6 = 0; var6 < Class8832.method31961(this.field2413); var6++) {
                     int var7 = Class8832.method31961(this.field2413) + var6;
                     var3[var6] = this.field2411[var6][var8][var12];
                     var3[var7] = this.field2411[var6][var8][var12 + 1];
                     var3[var7 + Class8832.method31961(this.field2413)] = this.field2411[var6][var8][var12 + 2];
                     var3[var7 + 2 * Class8832.method31961(this.field2413)] = this.field2411[var6][var8][var12 + 3];
                  }

                  Class8832.method31962(this.field2413).method33652(var3, 0, this.field2412);
                  Class8832.method31962(this.field2413).method33652(var3, Class8832.method31961(this.field2413), this.field2412);
                  Class8832.method31962(this.field2413).method33652(var3, 2 * Class8832.method31961(this.field2413), this.field2412);
                  Class8832.method31962(this.field2413).method33652(var3, 3 * Class8832.method31961(this.field2413), this.field2412);

                  for (int var16 = 0; var16 < Class8832.method31961(this.field2413); var16++) {
                     int var19 = Class8832.method31961(this.field2413) + var16;
                     this.field2411[var16][var8][var12] = var3[var16];
                     this.field2411[var16][var8][var12 + 1] = var3[var19];
                     this.field2411[var16][var8][var12 + 2] = var3[var19 + Class8832.method31961(this.field2413)];
                     this.field2411[var16][var8][var12 + 3] = var3[var19 + 2 * Class8832.method31961(this.field2413)];
                  }
               }
            }
         }
      } else if (Class8832.method31959(this.field2413) <= 2) {
         if (Class8832.method31959(this.field2413) == 2) {
            for (int var9 = this.field2409; var9 < Class8832.method31956(this.field2413); var9 += this.field2410) {
               for (int var13 = 0; var13 < Class8832.method31961(this.field2413); var13++) {
                  var3[var13] = this.field2411[var13][var9][0];
                  var3[Class8832.method31961(this.field2413) + var13] = this.field2411[var13][var9][1];
               }

               Class8832.method31962(this.field2413).method33648(var3, 0);
               Class8832.method31962(this.field2413).method33648(var3, Class8832.method31961(this.field2413));

               for (int var14 = 0; var14 < Class8832.method31961(this.field2413); var14++) {
                  this.field2411[var14][var9][0] = var3[var14];
                  this.field2411[var14][var9][1] = var3[Class8832.method31961(this.field2413) + var14];
               }
            }
         }
      } else {
         for (int var10 = this.field2409; var10 < Class8832.method31956(this.field2413); var10 += this.field2410) {
            for (int var15 = 0; var15 < Class8832.method31959(this.field2413); var15 += 4) {
               for (int var17 = 0; var17 < Class8832.method31961(this.field2413); var17++) {
                  int var20 = Class8832.method31961(this.field2413) + var17;
                  var3[var17] = this.field2411[var17][var10][var15];
                  var3[var20] = this.field2411[var17][var10][var15 + 1];
                  var3[var20 + Class8832.method31961(this.field2413)] = this.field2411[var17][var10][var15 + 2];
                  var3[var20 + 2 * Class8832.method31961(this.field2413)] = this.field2411[var17][var10][var15 + 3];
               }

               Class8832.method31962(this.field2413).method33648(var3, 0);
               Class8832.method31962(this.field2413).method33648(var3, Class8832.method31961(this.field2413));
               Class8832.method31962(this.field2413).method33648(var3, 2 * Class8832.method31961(this.field2413));
               Class8832.method31962(this.field2413).method33648(var3, 3 * Class8832.method31961(this.field2413));

               for (int var18 = 0; var18 < Class8832.method31961(this.field2413); var18++) {
                  int var21 = Class8832.method31961(this.field2413) + var18;
                  this.field2411[var18][var10][var15] = var3[var18];
                  this.field2411[var18][var10][var15 + 1] = var3[var21];
                  this.field2411[var18][var10][var15 + 2] = var3[var21 + Class8832.method31961(this.field2413)];
                  this.field2411[var18][var10][var15 + 3] = var3[var21 + 2 * Class8832.method31961(this.field2413)];
               }
            }
         }
      }
   }
}
