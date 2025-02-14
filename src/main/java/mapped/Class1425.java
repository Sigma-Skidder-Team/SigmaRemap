package mapped;

public class Class1425 implements Runnable {
   private static String[] field7641;
   public final int field7642;
   public final int field7643;
   public final int field7644;
   public final int field7645;
   public final double[][] field7646;
   public final boolean field7647;
   public final Class9055 field7648;

   public Class1425(Class9055 var1, int var2, int var3, int var4, int var5, double[][] var6, boolean var7) {
      this.field7648 = var1;
      this.field7642 = var2;
      this.field7643 = var3;
      this.field7644 = var4;
      this.field7645 = var5;
      this.field7646 = var6;
      this.field7647 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field7642];
      if (Class9055.method33697(this.field7648) <= 2) {
         if (Class9055.method33697(this.field7648) == 2) {
            for (int var4 = 0; var4 < Class9055.method33699(this.field7648); var4++) {
               var3[var4] = this.field7646[var4][2 * this.field7644];
               var3[var4 + Class9055.method33699(this.field7648)] = this.field7646[var4][2 * this.field7644 + 1];
            }

            if (this.field7643 != -1) {
               Class9055.method33700(this.field7648).method33662(var3, 0, this.field7647);
               Class9055.method33700(this.field7648).method33662(var3, Class9055.method33699(this.field7648), this.field7647);
            } else {
               Class9055.method33700(this.field7648).method33658(var3, 0, this.field7647);
               Class9055.method33700(this.field7648).method33658(var3, Class9055.method33699(this.field7648), this.field7647);
            }

            for (int var7 = 0; var7 < Class9055.method33699(this.field7648); var7++) {
               this.field7646[var7][2 * this.field7644] = var3[var7];
               this.field7646[var7][2 * this.field7644 + 1] = var3[var7 + Class9055.method33699(this.field7648)];
            }
         }
      } else if (this.field7643 != -1) {
         for (int var8 = 4 * this.field7644; var8 < Class9055.method33697(this.field7648); var8 += 4 * this.field7645) {
            for (int var5 = 0; var5 < Class9055.method33699(this.field7648); var5++) {
               int var6 = Class9055.method33699(this.field7648) + var5;
               var3[var5] = this.field7646[var5][var8];
               var3[var6] = this.field7646[var5][var8 + 1];
               var3[var6 + Class9055.method33699(this.field7648)] = this.field7646[var5][var8 + 2];
               var3[var6 + 2 * Class9055.method33699(this.field7648)] = this.field7646[var5][var8 + 3];
            }

            Class9055.method33700(this.field7648).method33662(var3, 0, this.field7647);
            Class9055.method33700(this.field7648).method33662(var3, Class9055.method33699(this.field7648), this.field7647);
            Class9055.method33700(this.field7648).method33662(var3, 2 * Class9055.method33699(this.field7648), this.field7647);
            Class9055.method33700(this.field7648).method33662(var3, 3 * Class9055.method33699(this.field7648), this.field7647);

            for (int var10 = 0; var10 < Class9055.method33699(this.field7648); var10++) {
               int var13 = Class9055.method33699(this.field7648) + var10;
               this.field7646[var10][var8] = var3[var10];
               this.field7646[var10][var8 + 1] = var3[var13];
               this.field7646[var10][var8 + 2] = var3[var13 + Class9055.method33699(this.field7648)];
               this.field7646[var10][var8 + 3] = var3[var13 + 2 * Class9055.method33699(this.field7648)];
            }
         }
      } else {
         for (int var9 = 4 * this.field7644; var9 < Class9055.method33697(this.field7648); var9 += 4 * this.field7645) {
            for (int var11 = 0; var11 < Class9055.method33699(this.field7648); var11++) {
               int var14 = Class9055.method33699(this.field7648) + var11;
               var3[var11] = this.field7646[var11][var9];
               var3[var14] = this.field7646[var11][var9 + 1];
               var3[var14 + Class9055.method33699(this.field7648)] = this.field7646[var11][var9 + 2];
               var3[var14 + 2 * Class9055.method33699(this.field7648)] = this.field7646[var11][var9 + 3];
            }

            Class9055.method33700(this.field7648).method33658(var3, 0, this.field7647);
            Class9055.method33700(this.field7648).method33658(var3, Class9055.method33699(this.field7648), this.field7647);
            Class9055.method33700(this.field7648).method33658(var3, 2 * Class9055.method33699(this.field7648), this.field7647);
            Class9055.method33700(this.field7648).method33658(var3, 3 * Class9055.method33699(this.field7648), this.field7647);

            for (int var12 = 0; var12 < Class9055.method33699(this.field7648); var12++) {
               int var15 = Class9055.method33699(this.field7648) + var12;
               this.field7646[var12][var9] = var3[var12];
               this.field7646[var12][var9 + 1] = var3[var15];
               this.field7646[var12][var9 + 2] = var3[var15 + Class9055.method33699(this.field7648)];
               this.field7646[var12][var9 + 3] = var3[var15 + 2 * Class9055.method33699(this.field7648)];
            }
         }
      }
   }
}
