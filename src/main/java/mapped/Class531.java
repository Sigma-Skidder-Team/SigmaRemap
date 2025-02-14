package mapped;

public class Class531 implements Runnable {
   private static String[] field2535;
   public final int field2536;
   public final int field2537;
   public final int field2538;
   public final int field2539;
   public final double[][][] field2540;
   public final boolean field2541;
   public final Class8832 field2542;

   public Class531(Class8832 var1, int var2, int var3, int var4, int var5, double[][][] var6, boolean var7) {
      this.field2542 = var1;
      this.field2536 = var2;
      this.field2537 = var3;
      this.field2538 = var4;
      this.field2539 = var5;
      this.field2540 = var6;
      this.field2541 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field2536];
      if (this.field2537 != -1) {
         for (int var4 = this.field2538; var4 < Class8832.method31961(this.field2542); var4 += this.field2539) {
            for (int var5 = 0; var5 < Class8832.method31956(this.field2542); var5++) {
               Class8832.method31958(this.field2542).method33650(this.field2540[var4][var5], this.field2541);
            }

            if (Class8832.method31959(this.field2542) <= 2) {
               if (Class8832.method31959(this.field2542) == 2) {
                  for (int var10 = 0; var10 < Class8832.method31956(this.field2542); var10++) {
                     var3[var10] = this.field2540[var4][var10][0];
                     var3[Class8832.method31956(this.field2542) + var10] = this.field2540[var4][var10][1];
                  }

                  Class8832.method31960(this.field2542).method33652(var3, 0, this.field2541);
                  Class8832.method31960(this.field2542).method33652(var3, Class8832.method31956(this.field2542), this.field2541);

                  for (int var11 = 0; var11 < Class8832.method31956(this.field2542); var11++) {
                     this.field2540[var4][var11][0] = var3[var11];
                     this.field2540[var4][var11][1] = var3[Class8832.method31956(this.field2542) + var11];
                  }
               }
            } else {
               for (int var9 = 0; var9 < Class8832.method31959(this.field2542); var9 += 4) {
                  for (int var6 = 0; var6 < Class8832.method31956(this.field2542); var6++) {
                     int var7 = Class8832.method31956(this.field2542) + var6;
                     var3[var6] = this.field2540[var4][var6][var9];
                     var3[var7] = this.field2540[var4][var6][var9 + 1];
                     var3[var7 + Class8832.method31956(this.field2542)] = this.field2540[var4][var6][var9 + 2];
                     var3[var7 + 2 * Class8832.method31956(this.field2542)] = this.field2540[var4][var6][var9 + 3];
                  }

                  Class8832.method31960(this.field2542).method33652(var3, 0, this.field2541);
                  Class8832.method31960(this.field2542).method33652(var3, Class8832.method31956(this.field2542), this.field2541);
                  Class8832.method31960(this.field2542).method33652(var3, 2 * Class8832.method31956(this.field2542), this.field2541);
                  Class8832.method31960(this.field2542).method33652(var3, 3 * Class8832.method31956(this.field2542), this.field2541);

                  for (int var16 = 0; var16 < Class8832.method31956(this.field2542); var16++) {
                     int var19 = Class8832.method31956(this.field2542) + var16;
                     this.field2540[var4][var16][var9] = var3[var16];
                     this.field2540[var4][var16][var9 + 1] = var3[var19];
                     this.field2540[var4][var16][var9 + 2] = var3[var19 + Class8832.method31956(this.field2542)];
                     this.field2540[var4][var16][var9 + 3] = var3[var19 + 2 * Class8832.method31956(this.field2542)];
                  }
               }
            }
         }
      } else {
         for (int var8 = this.field2538; var8 < Class8832.method31961(this.field2542); var8 += this.field2539) {
            for (int var12 = 0; var12 < Class8832.method31956(this.field2542); var12++) {
               Class8832.method31958(this.field2542).method33646(this.field2540[var8][var12]);
            }

            if (Class8832.method31959(this.field2542) <= 2) {
               if (Class8832.method31959(this.field2542) == 2) {
                  for (int var14 = 0; var14 < Class8832.method31956(this.field2542); var14++) {
                     var3[var14] = this.field2540[var8][var14][0];
                     var3[Class8832.method31956(this.field2542) + var14] = this.field2540[var8][var14][1];
                  }

                  Class8832.method31960(this.field2542).method33648(var3, 0);
                  Class8832.method31960(this.field2542).method33648(var3, Class8832.method31956(this.field2542));

                  for (int var15 = 0; var15 < Class8832.method31956(this.field2542); var15++) {
                     this.field2540[var8][var15][0] = var3[var15];
                     this.field2540[var8][var15][1] = var3[Class8832.method31956(this.field2542) + var15];
                  }
               }
            } else {
               for (int var13 = 0; var13 < Class8832.method31959(this.field2542); var13 += 4) {
                  for (int var17 = 0; var17 < Class8832.method31956(this.field2542); var17++) {
                     int var20 = Class8832.method31956(this.field2542) + var17;
                     var3[var17] = this.field2540[var8][var17][var13];
                     var3[var20] = this.field2540[var8][var17][var13 + 1];
                     var3[var20 + Class8832.method31956(this.field2542)] = this.field2540[var8][var17][var13 + 2];
                     var3[var20 + 2 * Class8832.method31956(this.field2542)] = this.field2540[var8][var17][var13 + 3];
                  }

                  Class8832.method31960(this.field2542).method33648(var3, 0);
                  Class8832.method31960(this.field2542).method33648(var3, Class8832.method31956(this.field2542));
                  Class8832.method31960(this.field2542).method33648(var3, 2 * Class8832.method31956(this.field2542));
                  Class8832.method31960(this.field2542).method33648(var3, 3 * Class8832.method31956(this.field2542));

                  for (int var18 = 0; var18 < Class8832.method31956(this.field2542); var18++) {
                     int var21 = Class8832.method31956(this.field2542) + var18;
                     this.field2540[var8][var18][var13] = var3[var18];
                     this.field2540[var8][var18][var13 + 1] = var3[var21];
                     this.field2540[var8][var18][var13 + 2] = var3[var21 + Class8832.method31956(this.field2542)];
                     this.field2540[var8][var18][var13 + 3] = var3[var21 + 2 * Class8832.method31956(this.field2542)];
                  }
               }
            }
         }
      }
   }
}
