package mapped;

public class Class749 implements Runnable {
   private static String[] field3882;
   public final int field3883;
   public final int field3884;
   public final double[] field3885;
   public final Class9186 field3886;

   public Class749(Class9186 var1, int var2, int var3, double[] var4) {
      this.field3886 = var1;
      this.field3883 = var2;
      this.field3884 = var3;
      this.field3885 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class9186.method34383(this.field3886)];

      for (int var4 = this.field3883; var4 < this.field3884; var4++) {
         for (int var5 = 0; var5 < Class9186.method34383(this.field3886); var5++) {
            var3[var5] = this.field3885[var5 * Class9186.method34381(this.field3886) + var4];
         }

         Class9186.method34384(this.field3886).method33646(var3);

         for (int var6 = 0; var6 < Class9186.method34383(this.field3886); var6++) {
            this.field3885[var6 * Class9186.method34381(this.field3886) + var4] = var3[var6];
         }
      }
   }
}
