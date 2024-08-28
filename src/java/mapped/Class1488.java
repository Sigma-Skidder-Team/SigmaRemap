package mapped;

public class Class1488 implements Runnable {
   private static String[] field8007;
   public final int field8008;
   public final int field8009;
   public final int field8010;
   public final int field8011;
   public final float[][][] field8012;
   public final boolean field8013;
   public final Class7824 field8014;

   public Class1488(Class7824 var1, int var2, int var3, int var4, int var5, float[][][] var6, boolean var7) {
      this.field8014 = var1;
      this.field8008 = var2;
      this.field8009 = var3;
      this.field8010 = var4;
      this.field8011 = var5;
      this.field8012 = var6;
      this.field8013 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field8008];
      if (this.field8009 != -1) {
         for (int var4 = this.field8010; var4 < Class7824.method26185(this.field8014); var4 += this.field8011) {
            for (int var5 = 0; var5 < Class7824.method26180(this.field8014); var5++) {
               Class7824.method26182(this.field8014).method29631(this.field8012[var4][var5], this.field8013);
            }

            if (Class7824.method26183(this.field8014) <= 2) {
               if (Class7824.method26183(this.field8014) == 2) {
                  for (int var10 = 0; var10 < Class7824.method26180(this.field8014); var10++) {
                     var3[var10] = this.field8012[var4][var10][0];
                     var3[Class7824.method26180(this.field8014) + var10] = this.field8012[var4][var10][1];
                  }

                  Class7824.method26184(this.field8014).method29633(var3, 0, this.field8013);
                  Class7824.method26184(this.field8014).method29633(var3, Class7824.method26180(this.field8014), this.field8013);

                  for (int var11 = 0; var11 < Class7824.method26180(this.field8014); var11++) {
                     this.field8012[var4][var11][0] = var3[var11];
                     this.field8012[var4][var11][1] = var3[Class7824.method26180(this.field8014) + var11];
                  }
               }
            } else {
               for (int var9 = 0; var9 < Class7824.method26183(this.field8014); var9 += 4) {
                  for (int var6 = 0; var6 < Class7824.method26180(this.field8014); var6++) {
                     int var7 = Class7824.method26180(this.field8014) + var6;
                     var3[var6] = this.field8012[var4][var6][var9];
                     var3[var7] = this.field8012[var4][var6][var9 + 1];
                     var3[var7 + Class7824.method26180(this.field8014)] = this.field8012[var4][var6][var9 + 2];
                     var3[var7 + 2 * Class7824.method26180(this.field8014)] = this.field8012[var4][var6][var9 + 3];
                  }

                  Class7824.method26184(this.field8014).method29633(var3, 0, this.field8013);
                  Class7824.method26184(this.field8014).method29633(var3, Class7824.method26180(this.field8014), this.field8013);
                  Class7824.method26184(this.field8014).method29633(var3, 2 * Class7824.method26180(this.field8014), this.field8013);
                  Class7824.method26184(this.field8014).method29633(var3, 3 * Class7824.method26180(this.field8014), this.field8013);

                  for (int var16 = 0; var16 < Class7824.method26180(this.field8014); var16++) {
                     int var19 = Class7824.method26180(this.field8014) + var16;
                     this.field8012[var4][var16][var9] = var3[var16];
                     this.field8012[var4][var16][var9 + 1] = var3[var19];
                     this.field8012[var4][var16][var9 + 2] = var3[var19 + Class7824.method26180(this.field8014)];
                     this.field8012[var4][var16][var9 + 3] = var3[var19 + 2 * Class7824.method26180(this.field8014)];
                  }
               }
            }
         }
      } else {
         for (int var8 = this.field8010; var8 < Class7824.method26185(this.field8014); var8 += this.field8011) {
            for (int var12 = 0; var12 < Class7824.method26180(this.field8014); var12++) {
               Class7824.method26182(this.field8014).method29627(this.field8012[var8][var12], this.field8013);
            }

            if (Class7824.method26183(this.field8014) <= 2) {
               if (Class7824.method26183(this.field8014) == 2) {
                  for (int var14 = 0; var14 < Class7824.method26180(this.field8014); var14++) {
                     var3[var14] = this.field8012[var8][var14][0];
                     var3[Class7824.method26180(this.field8014) + var14] = this.field8012[var8][var14][1];
                  }

                  Class7824.method26184(this.field8014).method29629(var3, 0, this.field8013);
                  Class7824.method26184(this.field8014).method29629(var3, Class7824.method26180(this.field8014), this.field8013);

                  for (int var15 = 0; var15 < Class7824.method26180(this.field8014); var15++) {
                     this.field8012[var8][var15][0] = var3[var15];
                     this.field8012[var8][var15][1] = var3[Class7824.method26180(this.field8014) + var15];
                  }
               }
            } else {
               for (int var13 = 0; var13 < Class7824.method26183(this.field8014); var13 += 4) {
                  for (int var17 = 0; var17 < Class7824.method26180(this.field8014); var17++) {
                     int var20 = Class7824.method26180(this.field8014) + var17;
                     var3[var17] = this.field8012[var8][var17][var13];
                     var3[var20] = this.field8012[var8][var17][var13 + 1];
                     var3[var20 + Class7824.method26180(this.field8014)] = this.field8012[var8][var17][var13 + 2];
                     var3[var20 + 2 * Class7824.method26180(this.field8014)] = this.field8012[var8][var17][var13 + 3];
                  }

                  Class7824.method26184(this.field8014).method29629(var3, 0, this.field8013);
                  Class7824.method26184(this.field8014).method29629(var3, Class7824.method26180(this.field8014), this.field8013);
                  Class7824.method26184(this.field8014).method29629(var3, 2 * Class7824.method26180(this.field8014), this.field8013);
                  Class7824.method26184(this.field8014).method29629(var3, 3 * Class7824.method26180(this.field8014), this.field8013);

                  for (int var18 = 0; var18 < Class7824.method26180(this.field8014); var18++) {
                     int var21 = Class7824.method26180(this.field8014) + var18;
                     this.field8012[var8][var18][var13] = var3[var18];
                     this.field8012[var8][var18][var13 + 1] = var3[var21];
                     this.field8012[var8][var18][var13 + 2] = var3[var21 + Class7824.method26180(this.field8014)];
                     this.field8012[var8][var18][var13 + 3] = var3[var21 + 2 * Class7824.method26180(this.field8014)];
                  }
               }
            }
         }
      }
   }
}
