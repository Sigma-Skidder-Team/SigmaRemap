package mapped;

public class Class470 implements Runnable {
   private static String[] field2184;
   public final int field2185;
   public final int field2186;
   public final int field2187;
   public final int field2188;
   public final float[][][] field2189;
   public final boolean field2190;
   public final Class7824 field2191;

   public Class470(Class7824 var1, int var2, int var3, int var4, int var5, float[][][] var6, boolean var7) {
      this.field2191 = var1;
      this.field2185 = var2;
      this.field2186 = var3;
      this.field2187 = var4;
      this.field2188 = var5;
      this.field2189 = var6;
      this.field2190 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field2185];
      if (this.field2186 != -1) {
         if (Class7824.method26183(this.field2191) <= 2) {
            if (Class7824.method26183(this.field2191) == 2) {
               for (int var4 = this.field2187; var4 < Class7824.method26180(this.field2191); var4 += this.field2188) {
                  for (int var5 = 0; var5 < Class7824.method26185(this.field2191); var5++) {
                     var3[var5] = this.field2189[var5][var4][0];
                     var3[Class7824.method26185(this.field2191) + var5] = this.field2189[var5][var4][1];
                  }

                  Class7824.method26186(this.field2191).method29633(var3, 0, this.field2190);
                  Class7824.method26186(this.field2191).method29633(var3, Class7824.method26185(this.field2191), this.field2190);

                  for (int var11 = 0; var11 < Class7824.method26185(this.field2191); var11++) {
                     this.field2189[var11][var4][0] = var3[var11];
                     this.field2189[var11][var4][1] = var3[Class7824.method26185(this.field2191) + var11];
                  }
               }
            }
         } else {
            for (int var8 = this.field2187; var8 < Class7824.method26180(this.field2191); var8 += this.field2188) {
               for (int var12 = 0; var12 < Class7824.method26183(this.field2191); var12 += 4) {
                  for (int var6 = 0; var6 < Class7824.method26185(this.field2191); var6++) {
                     int var7 = Class7824.method26185(this.field2191) + var6;
                     var3[var6] = this.field2189[var6][var8][var12];
                     var3[var7] = this.field2189[var6][var8][var12 + 1];
                     var3[var7 + Class7824.method26185(this.field2191)] = this.field2189[var6][var8][var12 + 2];
                     var3[var7 + 2 * Class7824.method26185(this.field2191)] = this.field2189[var6][var8][var12 + 3];
                  }

                  Class7824.method26186(this.field2191).method29633(var3, 0, this.field2190);
                  Class7824.method26186(this.field2191).method29633(var3, Class7824.method26185(this.field2191), this.field2190);
                  Class7824.method26186(this.field2191).method29633(var3, 2 * Class7824.method26185(this.field2191), this.field2190);
                  Class7824.method26186(this.field2191).method29633(var3, 3 * Class7824.method26185(this.field2191), this.field2190);

                  for (int var16 = 0; var16 < Class7824.method26185(this.field2191); var16++) {
                     int var19 = Class7824.method26185(this.field2191) + var16;
                     this.field2189[var16][var8][var12] = var3[var16];
                     this.field2189[var16][var8][var12 + 1] = var3[var19];
                     this.field2189[var16][var8][var12 + 2] = var3[var19 + Class7824.method26185(this.field2191)];
                     this.field2189[var16][var8][var12 + 3] = var3[var19 + 2 * Class7824.method26185(this.field2191)];
                  }
               }
            }
         }
      } else if (Class7824.method26183(this.field2191) <= 2) {
         if (Class7824.method26183(this.field2191) == 2) {
            for (int var9 = this.field2187; var9 < Class7824.method26180(this.field2191); var9 += this.field2188) {
               for (int var13 = 0; var13 < Class7824.method26185(this.field2191); var13++) {
                  var3[var13] = this.field2189[var13][var9][0];
                  var3[Class7824.method26185(this.field2191) + var13] = this.field2189[var13][var9][1];
               }

               Class7824.method26186(this.field2191).method29629(var3, 0, this.field2190);
               Class7824.method26186(this.field2191).method29629(var3, Class7824.method26185(this.field2191), this.field2190);

               for (int var14 = 0; var14 < Class7824.method26185(this.field2191); var14++) {
                  this.field2189[var14][var9][0] = var3[var14];
                  this.field2189[var14][var9][1] = var3[Class7824.method26185(this.field2191) + var14];
               }
            }
         }
      } else {
         for (int var10 = this.field2187; var10 < Class7824.method26180(this.field2191); var10 += this.field2188) {
            for (int var15 = 0; var15 < Class7824.method26183(this.field2191); var15 += 4) {
               for (int var17 = 0; var17 < Class7824.method26185(this.field2191); var17++) {
                  int var20 = Class7824.method26185(this.field2191) + var17;
                  var3[var17] = this.field2189[var17][var10][var15];
                  var3[var20] = this.field2189[var17][var10][var15 + 1];
                  var3[var20 + Class7824.method26185(this.field2191)] = this.field2189[var17][var10][var15 + 2];
                  var3[var20 + 2 * Class7824.method26185(this.field2191)] = this.field2189[var17][var10][var15 + 3];
               }

               Class7824.method26186(this.field2191).method29629(var3, 0, this.field2190);
               Class7824.method26186(this.field2191).method29629(var3, Class7824.method26185(this.field2191), this.field2190);
               Class7824.method26186(this.field2191).method29629(var3, 2 * Class7824.method26185(this.field2191), this.field2190);
               Class7824.method26186(this.field2191).method29629(var3, 3 * Class7824.method26185(this.field2191), this.field2190);

               for (int var18 = 0; var18 < Class7824.method26185(this.field2191); var18++) {
                  int var21 = Class7824.method26185(this.field2191) + var18;
                  this.field2189[var18][var10][var15] = var3[var18];
                  this.field2189[var18][var10][var15 + 1] = var3[var21];
                  this.field2189[var18][var10][var15 + 2] = var3[var21 + Class7824.method26185(this.field2191)];
                  this.field2189[var18][var10][var15 + 3] = var3[var21 + 2 * Class7824.method26185(this.field2191)];
               }
            }
         }
      }
   }
}
