package mapped;

public class Class1637 implements Runnable {
   private static String[] field8883;
   public final int field8884;
   public final int field8885;
   public final int field8886;
   public final int field8887;
   public final float[][] field8888;
   public final boolean field8889;
   public final Class9533 field8890;

   public Class1637(Class9533 var1, int var2, int var3, int var4, int var5, float[][] var6, boolean var7) {
      this.field8890 = var1;
      this.field8884 = var2;
      this.field8885 = var3;
      this.field8886 = var4;
      this.field8887 = var5;
      this.field8888 = var6;
      this.field8889 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field8884];
      if (Class9533.method36856(this.field8890) <= 2) {
         if (Class9533.method36856(this.field8890) == 2) {
            for (int var4 = 0; var4 < Class9533.method36858(this.field8890); var4++) {
               var3[var4] = this.field8888[var4][2 * this.field8886];
               var3[var4 + Class9533.method36858(this.field8890)] = this.field8888[var4][2 * this.field8886 + 1];
            }

            if (this.field8885 != -1) {
               Class9533.method36859(this.field8890).method29633(var3, 0, this.field8889);
               Class9533.method36859(this.field8890).method29633(var3, Class9533.method36858(this.field8890), this.field8889);
            } else {
               Class9533.method36859(this.field8890).method29629(var3, 0, this.field8889);
               Class9533.method36859(this.field8890).method29629(var3, Class9533.method36858(this.field8890), this.field8889);
            }

            for (int var7 = 0; var7 < Class9533.method36858(this.field8890); var7++) {
               this.field8888[var7][2 * this.field8886] = var3[var7];
               this.field8888[var7][2 * this.field8886 + 1] = var3[var7 + Class9533.method36858(this.field8890)];
            }
         }
      } else if (this.field8885 != -1) {
         for (int var8 = 4 * this.field8886; var8 < Class9533.method36856(this.field8890); var8 += 4 * this.field8887) {
            for (int var5 = 0; var5 < Class9533.method36858(this.field8890); var5++) {
               int var6 = Class9533.method36858(this.field8890) + var5;
               var3[var5] = this.field8888[var5][var8];
               var3[var6] = this.field8888[var5][var8 + 1];
               var3[var6 + Class9533.method36858(this.field8890)] = this.field8888[var5][var8 + 2];
               var3[var6 + 2 * Class9533.method36858(this.field8890)] = this.field8888[var5][var8 + 3];
            }

            Class9533.method36859(this.field8890).method29633(var3, 0, this.field8889);
            Class9533.method36859(this.field8890).method29633(var3, Class9533.method36858(this.field8890), this.field8889);
            Class9533.method36859(this.field8890).method29633(var3, 2 * Class9533.method36858(this.field8890), this.field8889);
            Class9533.method36859(this.field8890).method29633(var3, 3 * Class9533.method36858(this.field8890), this.field8889);

            for (int var10 = 0; var10 < Class9533.method36858(this.field8890); var10++) {
               int var13 = Class9533.method36858(this.field8890) + var10;
               this.field8888[var10][var8] = var3[var10];
               this.field8888[var10][var8 + 1] = var3[var13];
               this.field8888[var10][var8 + 2] = var3[var13 + Class9533.method36858(this.field8890)];
               this.field8888[var10][var8 + 3] = var3[var13 + 2 * Class9533.method36858(this.field8890)];
            }
         }
      } else {
         for (int var9 = 4 * this.field8886; var9 < Class9533.method36856(this.field8890); var9 += 4 * this.field8887) {
            for (int var11 = 0; var11 < Class9533.method36858(this.field8890); var11++) {
               int var14 = Class9533.method36858(this.field8890) + var11;
               var3[var11] = this.field8888[var11][var9];
               var3[var14] = this.field8888[var11][var9 + 1];
               var3[var14 + Class9533.method36858(this.field8890)] = this.field8888[var11][var9 + 2];
               var3[var14 + 2 * Class9533.method36858(this.field8890)] = this.field8888[var11][var9 + 3];
            }

            Class9533.method36859(this.field8890).method29629(var3, 0, this.field8889);
            Class9533.method36859(this.field8890).method29629(var3, Class9533.method36858(this.field8890), this.field8889);
            Class9533.method36859(this.field8890).method29629(var3, 2 * Class9533.method36858(this.field8890), this.field8889);
            Class9533.method36859(this.field8890).method29629(var3, 3 * Class9533.method36858(this.field8890), this.field8889);

            for (int var12 = 0; var12 < Class9533.method36858(this.field8890); var12++) {
               int var15 = Class9533.method36858(this.field8890) + var12;
               this.field8888[var12][var9] = var3[var12];
               this.field8888[var12][var9 + 1] = var3[var15];
               this.field8888[var12][var9 + 2] = var3[var15 + Class9533.method36858(this.field8890)];
               this.field8888[var12][var9 + 3] = var3[var15 + 2 * Class9533.method36858(this.field8890)];
            }
         }
      }
   }
}
