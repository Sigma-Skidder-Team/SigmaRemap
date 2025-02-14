package mapped;

public class Class449 implements Runnable {
   private static String[] field2043;
   public final int field2044;
   public final int field2045;
   public final double[] field2046;
   public final boolean field2047;
   public final Class9055 field2048;

   public Class449(Class9055 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field2048 = var1;
      this.field2044 = var2;
      this.field2045 = var3;
      this.field2046 = var4;
      this.field2047 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class9055.method33699(this.field2048)];

      for (int var4 = this.field2044; var4 < this.field2045; var4++) {
         for (int var5 = 0; var5 < Class9055.method33699(this.field2048); var5++) {
            var3[var5] = this.field2046[var5 * Class9055.method33697(this.field2048) + var4];
         }

         Class9055.method33700(this.field2048).method33656(var3, this.field2047);

         for (int var6 = 0; var6 < Class9055.method33699(this.field2048); var6++) {
            this.field2046[var6 * Class9055.method33697(this.field2048) + var4] = var3[var6];
         }
      }
   }
}
