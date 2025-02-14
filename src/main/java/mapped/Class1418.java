package mapped;

public class Class1418 implements Runnable {
   private static String[] field7597;
   public final int field7598;
   public final int field7599;
   public final double[] field7600;
   public final boolean field7601;
   public final Class9186 field7602;

   public Class1418(Class9186 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field7602 = var1;
      this.field7598 = var2;
      this.field7599 = var3;
      this.field7600 = var4;
      this.field7601 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class9186.method34383(this.field7602)];

      for (int var4 = this.field7598; var4 < this.field7599; var4++) {
         for (int var5 = 0; var5 < Class9186.method34383(this.field7602); var5++) {
            var3[var5] = this.field7600[var5 * Class9186.method34381(this.field7602) + var4];
         }

         Class9186.method34384(this.field7602).method33650(var3, this.field7601);

         for (int var6 = 0; var6 < Class9186.method34383(this.field7602); var6++) {
            this.field7600[var6 * Class9186.method34381(this.field7602) + var4] = var3[var6];
         }
      }
   }
}
