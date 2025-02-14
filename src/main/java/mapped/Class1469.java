package mapped;

public class Class1469 implements Runnable {
   private static String[] field7899;
   public final int field7900;
   public final int field7901;
   public final int field7902;
   public final int field7903;
   public final double[] field7904;
   public final boolean field7905;
   public final Class9055 field7906;

   public Class1469(Class9055 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field7906 = var1;
      this.field7900 = var2;
      this.field7901 = var3;
      this.field7902 = var4;
      this.field7903 = var5;
      this.field7904 = var6;
      this.field7905 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field7900];
      if (Class9055.method33697(this.field7906) <= 2) {
         if (Class9055.method33697(this.field7906) == 2) {
            for (int var4 = 0; var4 < Class9055.method33699(this.field7906); var4++) {
               int var6 = var4 * Class9055.method33697(this.field7906) + 2 * this.field7902;
               var3[var4] = this.field7904[var6];
               var3[var4 + Class9055.method33699(this.field7906)] = this.field7904[var6 + 1];
            }

            if (this.field7901 != -1) {
               Class9055.method33700(this.field7906).method33662(var3, 0, this.field7905);
               Class9055.method33700(this.field7906).method33662(var3, Class9055.method33699(this.field7906), this.field7905);
            } else {
               Class9055.method33700(this.field7906).method33658(var3, 0, this.field7905);
               Class9055.method33700(this.field7906).method33658(var3, Class9055.method33699(this.field7906), this.field7905);
            }

            for (int var8 = 0; var8 < Class9055.method33699(this.field7906); var8++) {
               int var14 = var8 * Class9055.method33697(this.field7906) + 2 * this.field7902;
               this.field7904[var14] = var3[var8];
               this.field7904[var14 + 1] = var3[var8 + Class9055.method33699(this.field7906)];
            }
         }
      } else if (this.field7901 != -1) {
         for (int var9 = 4 * this.field7902; var9 < Class9055.method33697(this.field7906); var9 += 4 * this.field7903) {
            for (int var5 = 0; var5 < Class9055.method33699(this.field7906); var5++) {
               int var15 = var5 * Class9055.method33697(this.field7906) + var9;
               int var7 = Class9055.method33699(this.field7906) + var5;
               var3[var5] = this.field7904[var15];
               var3[var7] = this.field7904[var15 + 1];
               var3[var7 + Class9055.method33699(this.field7906)] = this.field7904[var15 + 2];
               var3[var7 + 2 * Class9055.method33699(this.field7906)] = this.field7904[var15 + 3];
            }

            Class9055.method33700(this.field7906).method33662(var3, 0, this.field7905);
            Class9055.method33700(this.field7906).method33662(var3, Class9055.method33699(this.field7906), this.field7905);
            Class9055.method33700(this.field7906).method33662(var3, 2 * Class9055.method33699(this.field7906), this.field7905);
            Class9055.method33700(this.field7906).method33662(var3, 3 * Class9055.method33699(this.field7906), this.field7905);

            for (int var11 = 0; var11 < Class9055.method33699(this.field7906); var11++) {
               int var16 = var11 * Class9055.method33697(this.field7906) + var9;
               int var19 = Class9055.method33699(this.field7906) + var11;
               this.field7904[var16] = var3[var11];
               this.field7904[var16 + 1] = var3[var19];
               this.field7904[var16 + 2] = var3[var19 + Class9055.method33699(this.field7906)];
               this.field7904[var16 + 3] = var3[var19 + 2 * Class9055.method33699(this.field7906)];
            }
         }
      } else {
         for (int var10 = 4 * this.field7902; var10 < Class9055.method33697(this.field7906); var10 += 4 * this.field7903) {
            for (int var12 = 0; var12 < Class9055.method33699(this.field7906); var12++) {
               int var17 = var12 * Class9055.method33697(this.field7906) + var10;
               int var20 = Class9055.method33699(this.field7906) + var12;
               var3[var12] = this.field7904[var17];
               var3[var20] = this.field7904[var17 + 1];
               var3[var20 + Class9055.method33699(this.field7906)] = this.field7904[var17 + 2];
               var3[var20 + 2 * Class9055.method33699(this.field7906)] = this.field7904[var17 + 3];
            }

            Class9055.method33700(this.field7906).method33658(var3, 0, this.field7905);
            Class9055.method33700(this.field7906).method33658(var3, Class9055.method33699(this.field7906), this.field7905);
            Class9055.method33700(this.field7906).method33658(var3, 2 * Class9055.method33699(this.field7906), this.field7905);
            Class9055.method33700(this.field7906).method33658(var3, 3 * Class9055.method33699(this.field7906), this.field7905);

            for (int var13 = 0; var13 < Class9055.method33699(this.field7906); var13++) {
               int var18 = var13 * Class9055.method33697(this.field7906) + var10;
               int var21 = Class9055.method33699(this.field7906) + var13;
               this.field7904[var18] = var3[var13];
               this.field7904[var18 + 1] = var3[var21];
               this.field7904[var18 + 2] = var3[var21 + Class9055.method33699(this.field7906)];
               this.field7904[var18 + 3] = var3[var21 + 2 * Class9055.method33699(this.field7906)];
            }
         }
      }
   }
}
