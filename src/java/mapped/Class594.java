package mapped;

public class Class594 implements Runnable {
   private static String[] field2919;
   public final int field2920;
   public final int field2921;
   public final double[] field2922;
   public final boolean field2923;
   public final Class9055 field2924;

   public Class594(Class9055 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field2924 = var1;
      this.field2920 = var2;
      this.field2921 = var3;
      this.field2922 = var4;
      this.field2923 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class9055.method33699(this.field2924)];

      for (int var4 = this.field2920; var4 < this.field2921; var4++) {
         for (int var5 = 0; var5 < Class9055.method33699(this.field2924); var5++) {
            var3[var5] = this.field2922[var5 * Class9055.method33697(this.field2924) + var4];
         }

         Class9055.method33700(this.field2924).method33660(var3, this.field2923);

         for (int var6 = 0; var6 < Class9055.method33699(this.field2924); var6++) {
            this.field2922[var6 * Class9055.method33697(this.field2924) + var4] = var3[var6];
         }
      }
   }
}
