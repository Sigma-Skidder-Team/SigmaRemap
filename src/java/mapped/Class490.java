package mapped;

public class Class490 implements Runnable {
   private static String[] field2310;
   public final int field2311;
   public final int field2312;
   public final int field2313;
   public final int field2314;
   public final double[][][] field2315;
   public final boolean field2316;
   public final Class6352 field2317;

   public Class490(Class6352 var1, int var2, int var3, int var4, int var5, double[][][] var6, boolean var7) {
      this.field2317 = var1;
      this.field2311 = var2;
      this.field2312 = var3;
      this.field2313 = var4;
      this.field2314 = var5;
      this.field2315 = var6;
      this.field2316 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field2311];
      if (this.field2312 != -1) {
         for (int var4 = this.field2313; var4 < Class6352.method19333(this.field2317); var4 += this.field2314) {
            for (int var5 = 0; var5 < Class6352.method19328(this.field2317); var5++) {
               Class6352.method19330(this.field2317).method38580(this.field2315[var4][var5], this.field2316);
            }

            if (Class6352.method19331(this.field2317) <= 2) {
               if (Class6352.method19331(this.field2317) == 2) {
                  for (int var10 = 0; var10 < Class6352.method19328(this.field2317); var10++) {
                     var3[var10] = this.field2315[var4][var10][0];
                     var3[Class6352.method19328(this.field2317) + var10] = this.field2315[var4][var10][1];
                  }

                  Class6352.method19332(this.field2317).method38582(var3, 0, this.field2316);
                  Class6352.method19332(this.field2317).method38582(var3, Class6352.method19328(this.field2317), this.field2316);

                  for (int var11 = 0; var11 < Class6352.method19328(this.field2317); var11++) {
                     this.field2315[var4][var11][0] = var3[var11];
                     this.field2315[var4][var11][1] = var3[Class6352.method19328(this.field2317) + var11];
                  }
               }
            } else {
               for (int var9 = 0; var9 < Class6352.method19331(this.field2317); var9 += 4) {
                  for (int var6 = 0; var6 < Class6352.method19328(this.field2317); var6++) {
                     int var7 = Class6352.method19328(this.field2317) + var6;
                     var3[var6] = this.field2315[var4][var6][var9];
                     var3[var7] = this.field2315[var4][var6][var9 + 1];
                     var3[var7 + Class6352.method19328(this.field2317)] = this.field2315[var4][var6][var9 + 2];
                     var3[var7 + 2 * Class6352.method19328(this.field2317)] = this.field2315[var4][var6][var9 + 3];
                  }

                  Class6352.method19332(this.field2317).method38582(var3, 0, this.field2316);
                  Class6352.method19332(this.field2317).method38582(var3, Class6352.method19328(this.field2317), this.field2316);
                  Class6352.method19332(this.field2317).method38582(var3, 2 * Class6352.method19328(this.field2317), this.field2316);
                  Class6352.method19332(this.field2317).method38582(var3, 3 * Class6352.method19328(this.field2317), this.field2316);

                  for (int var16 = 0; var16 < Class6352.method19328(this.field2317); var16++) {
                     int var19 = Class6352.method19328(this.field2317) + var16;
                     this.field2315[var4][var16][var9] = var3[var16];
                     this.field2315[var4][var16][var9 + 1] = var3[var19];
                     this.field2315[var4][var16][var9 + 2] = var3[var19 + Class6352.method19328(this.field2317)];
                     this.field2315[var4][var16][var9 + 3] = var3[var19 + 2 * Class6352.method19328(this.field2317)];
                  }
               }
            }
         }
      } else {
         for (int var8 = this.field2313; var8 < Class6352.method19333(this.field2317); var8 += this.field2314) {
            for (int var12 = 0; var12 < Class6352.method19328(this.field2317); var12++) {
               Class6352.method19330(this.field2317).method38576(this.field2315[var8][var12], this.field2316);
            }

            if (Class6352.method19331(this.field2317) <= 2) {
               if (Class6352.method19331(this.field2317) == 2) {
                  for (int var14 = 0; var14 < Class6352.method19328(this.field2317); var14++) {
                     var3[var14] = this.field2315[var8][var14][0];
                     var3[Class6352.method19328(this.field2317) + var14] = this.field2315[var8][var14][1];
                  }

                  Class6352.method19332(this.field2317).method38578(var3, 0, this.field2316);
                  Class6352.method19332(this.field2317).method38578(var3, Class6352.method19328(this.field2317), this.field2316);

                  for (int var15 = 0; var15 < Class6352.method19328(this.field2317); var15++) {
                     this.field2315[var8][var15][0] = var3[var15];
                     this.field2315[var8][var15][1] = var3[Class6352.method19328(this.field2317) + var15];
                  }
               }
            } else {
               for (int var13 = 0; var13 < Class6352.method19331(this.field2317); var13 += 4) {
                  for (int var17 = 0; var17 < Class6352.method19328(this.field2317); var17++) {
                     int var20 = Class6352.method19328(this.field2317) + var17;
                     var3[var17] = this.field2315[var8][var17][var13];
                     var3[var20] = this.field2315[var8][var17][var13 + 1];
                     var3[var20 + Class6352.method19328(this.field2317)] = this.field2315[var8][var17][var13 + 2];
                     var3[var20 + 2 * Class6352.method19328(this.field2317)] = this.field2315[var8][var17][var13 + 3];
                  }

                  Class6352.method19332(this.field2317).method38578(var3, 0, this.field2316);
                  Class6352.method19332(this.field2317).method38578(var3, Class6352.method19328(this.field2317), this.field2316);
                  Class6352.method19332(this.field2317).method38578(var3, 2 * Class6352.method19328(this.field2317), this.field2316);
                  Class6352.method19332(this.field2317).method38578(var3, 3 * Class6352.method19328(this.field2317), this.field2316);

                  for (int var18 = 0; var18 < Class6352.method19328(this.field2317); var18++) {
                     int var21 = Class6352.method19328(this.field2317) + var18;
                     this.field2315[var8][var18][var13] = var3[var18];
                     this.field2315[var8][var18][var13 + 1] = var3[var21];
                     this.field2315[var8][var18][var13 + 2] = var3[var21 + Class6352.method19328(this.field2317)];
                     this.field2315[var8][var18][var13 + 3] = var3[var21 + 2 * Class6352.method19328(this.field2317)];
                  }
               }
            }
         }
      }
   }
}
