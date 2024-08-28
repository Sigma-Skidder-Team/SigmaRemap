package mapped;

public class Class690 implements Runnable {
   private static String[] field3517;
   public final int field3518;
   public final int field3519;
   public final int field3520;
   public final int field3521;
   public final double[] field3522;
   public final boolean field3523;
   public final Class9186 field3524;

   public Class690(Class9186 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field3524 = var1;
      this.field3518 = var2;
      this.field3519 = var3;
      this.field3520 = var4;
      this.field3521 = var5;
      this.field3522 = var6;
      this.field3523 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field3518];
      if (Class9186.method34381(this.field3524) <= 2) {
         if (Class9186.method34381(this.field3524) == 2) {
            for (int var4 = 0; var4 < Class9186.method34383(this.field3524); var4++) {
               int var6 = var4 * Class9186.method34381(this.field3524) + 2 * this.field3520;
               var3[var4] = this.field3522[var6];
               var3[var4 + Class9186.method34383(this.field3524)] = this.field3522[var6 + 1];
            }

            if (this.field3519 != -1) {
               Class9186.method34384(this.field3524).method33652(var3, 0, this.field3523);
               Class9186.method34384(this.field3524).method33652(var3, Class9186.method34383(this.field3524), this.field3523);
            } else {
               Class9186.method34384(this.field3524).method33648(var3, 0);
               Class9186.method34384(this.field3524).method33648(var3, Class9186.method34383(this.field3524));
            }

            for (int var8 = 0; var8 < Class9186.method34383(this.field3524); var8++) {
               int var14 = var8 * Class9186.method34381(this.field3524) + 2 * this.field3520;
               this.field3522[var14] = var3[var8];
               this.field3522[var14 + 1] = var3[var8 + Class9186.method34383(this.field3524)];
            }
         }
      } else if (this.field3519 != -1) {
         for (int var9 = 4 * this.field3520; var9 < Class9186.method34381(this.field3524); var9 += 4 * this.field3521) {
            for (int var5 = 0; var5 < Class9186.method34383(this.field3524); var5++) {
               int var15 = var5 * Class9186.method34381(this.field3524) + var9;
               int var7 = Class9186.method34383(this.field3524) + var5;
               var3[var5] = this.field3522[var15];
               var3[var7] = this.field3522[var15 + 1];
               var3[var7 + Class9186.method34383(this.field3524)] = this.field3522[var15 + 2];
               var3[var7 + 2 * Class9186.method34383(this.field3524)] = this.field3522[var15 + 3];
            }

            Class9186.method34384(this.field3524).method33652(var3, 0, this.field3523);
            Class9186.method34384(this.field3524).method33652(var3, Class9186.method34383(this.field3524), this.field3523);
            Class9186.method34384(this.field3524).method33652(var3, 2 * Class9186.method34383(this.field3524), this.field3523);
            Class9186.method34384(this.field3524).method33652(var3, 3 * Class9186.method34383(this.field3524), this.field3523);

            for (int var11 = 0; var11 < Class9186.method34383(this.field3524); var11++) {
               int var16 = var11 * Class9186.method34381(this.field3524) + var9;
               int var19 = Class9186.method34383(this.field3524) + var11;
               this.field3522[var16] = var3[var11];
               this.field3522[var16 + 1] = var3[var19];
               this.field3522[var16 + 2] = var3[var19 + Class9186.method34383(this.field3524)];
               this.field3522[var16 + 3] = var3[var19 + 2 * Class9186.method34383(this.field3524)];
            }
         }
      } else {
         for (int var10 = 4 * this.field3520; var10 < Class9186.method34381(this.field3524); var10 += 4 * this.field3521) {
            for (int var12 = 0; var12 < Class9186.method34383(this.field3524); var12++) {
               int var17 = var12 * Class9186.method34381(this.field3524) + var10;
               int var20 = Class9186.method34383(this.field3524) + var12;
               var3[var12] = this.field3522[var17];
               var3[var20] = this.field3522[var17 + 1];
               var3[var20 + Class9186.method34383(this.field3524)] = this.field3522[var17 + 2];
               var3[var20 + 2 * Class9186.method34383(this.field3524)] = this.field3522[var17 + 3];
            }

            Class9186.method34384(this.field3524).method33648(var3, 0);
            Class9186.method34384(this.field3524).method33648(var3, Class9186.method34383(this.field3524));
            Class9186.method34384(this.field3524).method33648(var3, 2 * Class9186.method34383(this.field3524));
            Class9186.method34384(this.field3524).method33648(var3, 3 * Class9186.method34383(this.field3524));

            for (int var13 = 0; var13 < Class9186.method34383(this.field3524); var13++) {
               int var18 = var13 * Class9186.method34381(this.field3524) + var10;
               int var21 = Class9186.method34383(this.field3524) + var13;
               this.field3522[var18] = var3[var13];
               this.field3522[var18 + 1] = var3[var21];
               this.field3522[var18 + 2] = var3[var21 + Class9186.method34383(this.field3524)];
               this.field3522[var18 + 3] = var3[var21 + 2 * Class9186.method34383(this.field3524)];
            }
         }
      }
   }
}
