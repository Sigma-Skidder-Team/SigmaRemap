package mapped;

public class Class463 implements Runnable {
   private static String[] field2135;
   public final int field2136;
   public final int field2137;
   public final int field2138;
   public final int field2139;
   public final float[][][] field2140;
   public final boolean field2141;
   public final Class7941 field2142;

   public Class463(Class7941 var1, int var2, int var3, int var4, int var5, float[][][] var6, boolean var7) {
      this.field2142 = var1;
      this.field2136 = var2;
      this.field2137 = var3;
      this.field2138 = var4;
      this.field2139 = var5;
      this.field2140 = var6;
      this.field2141 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field2136];
      if (this.field2137 != -1) {
         for (int var4 = this.field2138; var4 < Class7941.method26769(this.field2142); var4 += this.field2139) {
            for (int var5 = 0; var5 < Class7941.method26764(this.field2142); var5++) {
               Class7941.method26766(this.field2142).method28928(this.field2140[var4][var5], this.field2141);
            }

            if (Class7941.method26767(this.field2142) <= 2) {
               if (Class7941.method26767(this.field2142) == 2) {
                  for (int var10 = 0; var10 < Class7941.method26764(this.field2142); var10++) {
                     var3[var10] = this.field2140[var4][var10][0];
                     var3[Class7941.method26764(this.field2142) + var10] = this.field2140[var4][var10][1];
                  }

                  Class7941.method26768(this.field2142).method28930(var3, 0, this.field2141);
                  Class7941.method26768(this.field2142).method28930(var3, Class7941.method26764(this.field2142), this.field2141);

                  for (int var11 = 0; var11 < Class7941.method26764(this.field2142); var11++) {
                     this.field2140[var4][var11][0] = var3[var11];
                     this.field2140[var4][var11][1] = var3[Class7941.method26764(this.field2142) + var11];
                  }
               }
            } else {
               for (int var9 = 0; var9 < Class7941.method26767(this.field2142); var9 += 4) {
                  for (int var6 = 0; var6 < Class7941.method26764(this.field2142); var6++) {
                     int var7 = Class7941.method26764(this.field2142) + var6;
                     var3[var6] = this.field2140[var4][var6][var9];
                     var3[var7] = this.field2140[var4][var6][var9 + 1];
                     var3[var7 + Class7941.method26764(this.field2142)] = this.field2140[var4][var6][var9 + 2];
                     var3[var7 + 2 * Class7941.method26764(this.field2142)] = this.field2140[var4][var6][var9 + 3];
                  }

                  Class7941.method26768(this.field2142).method28930(var3, 0, this.field2141);
                  Class7941.method26768(this.field2142).method28930(var3, Class7941.method26764(this.field2142), this.field2141);
                  Class7941.method26768(this.field2142).method28930(var3, 2 * Class7941.method26764(this.field2142), this.field2141);
                  Class7941.method26768(this.field2142).method28930(var3, 3 * Class7941.method26764(this.field2142), this.field2141);

                  for (int var16 = 0; var16 < Class7941.method26764(this.field2142); var16++) {
                     int var19 = Class7941.method26764(this.field2142) + var16;
                     this.field2140[var4][var16][var9] = var3[var16];
                     this.field2140[var4][var16][var9 + 1] = var3[var19];
                     this.field2140[var4][var16][var9 + 2] = var3[var19 + Class7941.method26764(this.field2142)];
                     this.field2140[var4][var16][var9 + 3] = var3[var19 + 2 * Class7941.method26764(this.field2142)];
                  }
               }
            }
         }
      } else {
         for (int var8 = this.field2138; var8 < Class7941.method26769(this.field2142); var8 += this.field2139) {
            for (int var12 = 0; var12 < Class7941.method26764(this.field2142); var12++) {
               Class7941.method26766(this.field2142).method28924(this.field2140[var8][var12], this.field2141);
            }

            if (Class7941.method26767(this.field2142) <= 2) {
               if (Class7941.method26767(this.field2142) == 2) {
                  for (int var14 = 0; var14 < Class7941.method26764(this.field2142); var14++) {
                     var3[var14] = this.field2140[var8][var14][0];
                     var3[Class7941.method26764(this.field2142) + var14] = this.field2140[var8][var14][1];
                  }

                  Class7941.method26768(this.field2142).method28926(var3, 0, this.field2141);
                  Class7941.method26768(this.field2142).method28926(var3, Class7941.method26764(this.field2142), this.field2141);

                  for (int var15 = 0; var15 < Class7941.method26764(this.field2142); var15++) {
                     this.field2140[var8][var15][0] = var3[var15];
                     this.field2140[var8][var15][1] = var3[Class7941.method26764(this.field2142) + var15];
                  }
               }
            } else {
               for (int var13 = 0; var13 < Class7941.method26767(this.field2142); var13 += 4) {
                  for (int var17 = 0; var17 < Class7941.method26764(this.field2142); var17++) {
                     int var20 = Class7941.method26764(this.field2142) + var17;
                     var3[var17] = this.field2140[var8][var17][var13];
                     var3[var20] = this.field2140[var8][var17][var13 + 1];
                     var3[var20 + Class7941.method26764(this.field2142)] = this.field2140[var8][var17][var13 + 2];
                     var3[var20 + 2 * Class7941.method26764(this.field2142)] = this.field2140[var8][var17][var13 + 3];
                  }

                  Class7941.method26768(this.field2142).method28926(var3, 0, this.field2141);
                  Class7941.method26768(this.field2142).method28926(var3, Class7941.method26764(this.field2142), this.field2141);
                  Class7941.method26768(this.field2142).method28926(var3, 2 * Class7941.method26764(this.field2142), this.field2141);
                  Class7941.method26768(this.field2142).method28926(var3, 3 * Class7941.method26764(this.field2142), this.field2141);

                  for (int var18 = 0; var18 < Class7941.method26764(this.field2142); var18++) {
                     int var21 = Class7941.method26764(this.field2142) + var18;
                     this.field2140[var8][var18][var13] = var3[var18];
                     this.field2140[var8][var18][var13 + 1] = var3[var21];
                     this.field2140[var8][var18][var13 + 2] = var3[var21 + Class7941.method26764(this.field2142)];
                     this.field2140[var8][var18][var13 + 3] = var3[var21 + 2 * Class7941.method26764(this.field2142)];
                  }
               }
            }
         }
      }
   }
}
