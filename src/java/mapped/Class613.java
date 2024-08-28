package mapped;

public class Class613 implements Runnable {
   private static String[] field3039;
   public final int field3040;
   public final int field3041;
   public final int field3042;
   public final int field3043;
   public final double[][] field3044;
   public final boolean field3045;
   public final Class9186 field3046;

   public Class613(Class9186 var1, int var2, int var3, int var4, int var5, double[][] var6, boolean var7) {
      this.field3046 = var1;
      this.field3040 = var2;
      this.field3041 = var3;
      this.field3042 = var4;
      this.field3043 = var5;
      this.field3044 = var6;
      this.field3045 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field3040];
      if (Class9186.method34381(this.field3046) <= 2) {
         if (Class9186.method34381(this.field3046) == 2) {
            for (int var4 = 0; var4 < Class9186.method34383(this.field3046); var4++) {
               var3[var4] = this.field3044[var4][2 * this.field3042];
               var3[var4 + Class9186.method34383(this.field3046)] = this.field3044[var4][2 * this.field3042 + 1];
            }

            if (this.field3041 != -1) {
               Class9186.method34384(this.field3046).method33652(var3, 0, this.field3045);
               Class9186.method34384(this.field3046).method33652(var3, Class9186.method34383(this.field3046), this.field3045);
            } else {
               Class9186.method34384(this.field3046).method33648(var3, 0);
               Class9186.method34384(this.field3046).method33648(var3, Class9186.method34383(this.field3046));
            }

            for (int var7 = 0; var7 < Class9186.method34383(this.field3046); var7++) {
               this.field3044[var7][2 * this.field3042] = var3[var7];
               this.field3044[var7][2 * this.field3042 + 1] = var3[var7 + Class9186.method34383(this.field3046)];
            }
         }
      } else if (this.field3041 != -1) {
         for (int var8 = 4 * this.field3042; var8 < Class9186.method34381(this.field3046); var8 += 4 * this.field3043) {
            for (int var5 = 0; var5 < Class9186.method34383(this.field3046); var5++) {
               int var6 = Class9186.method34383(this.field3046) + var5;
               var3[var5] = this.field3044[var5][var8];
               var3[var6] = this.field3044[var5][var8 + 1];
               var3[var6 + Class9186.method34383(this.field3046)] = this.field3044[var5][var8 + 2];
               var3[var6 + 2 * Class9186.method34383(this.field3046)] = this.field3044[var5][var8 + 3];
            }

            Class9186.method34384(this.field3046).method33652(var3, 0, this.field3045);
            Class9186.method34384(this.field3046).method33652(var3, Class9186.method34383(this.field3046), this.field3045);
            Class9186.method34384(this.field3046).method33652(var3, 2 * Class9186.method34383(this.field3046), this.field3045);
            Class9186.method34384(this.field3046).method33652(var3, 3 * Class9186.method34383(this.field3046), this.field3045);

            for (int var10 = 0; var10 < Class9186.method34383(this.field3046); var10++) {
               int var13 = Class9186.method34383(this.field3046) + var10;
               this.field3044[var10][var8] = var3[var10];
               this.field3044[var10][var8 + 1] = var3[var13];
               this.field3044[var10][var8 + 2] = var3[var13 + Class9186.method34383(this.field3046)];
               this.field3044[var10][var8 + 3] = var3[var13 + 2 * Class9186.method34383(this.field3046)];
            }
         }
      } else {
         for (int var9 = 4 * this.field3042; var9 < Class9186.method34381(this.field3046); var9 += 4 * this.field3043) {
            for (int var11 = 0; var11 < Class9186.method34383(this.field3046); var11++) {
               int var14 = Class9186.method34383(this.field3046) + var11;
               var3[var11] = this.field3044[var11][var9];
               var3[var14] = this.field3044[var11][var9 + 1];
               var3[var14 + Class9186.method34383(this.field3046)] = this.field3044[var11][var9 + 2];
               var3[var14 + 2 * Class9186.method34383(this.field3046)] = this.field3044[var11][var9 + 3];
            }

            Class9186.method34384(this.field3046).method33648(var3, 0);
            Class9186.method34384(this.field3046).method33648(var3, Class9186.method34383(this.field3046));
            Class9186.method34384(this.field3046).method33648(var3, 2 * Class9186.method34383(this.field3046));
            Class9186.method34384(this.field3046).method33648(var3, 3 * Class9186.method34383(this.field3046));

            for (int var12 = 0; var12 < Class9186.method34383(this.field3046); var12++) {
               int var15 = Class9186.method34383(this.field3046) + var12;
               this.field3044[var12][var9] = var3[var12];
               this.field3044[var12][var9 + 1] = var3[var15];
               this.field3044[var12][var9 + 2] = var3[var15 + Class9186.method34383(this.field3046)];
               this.field3044[var12][var9 + 3] = var3[var15 + 2 * Class9186.method34383(this.field3046)];
            }
         }
      }
   }
}
