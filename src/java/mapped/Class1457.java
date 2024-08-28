package mapped;

public class Class1457 implements Runnable {
   private static String[] field7834;
   public final int field7835;
   public final int field7836;
   public final double[] field7837;
   public final boolean field7838;
   public final Class8832 field7839;

   public Class1457(Class8832 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field7839 = var1;
      this.field7835 = var2;
      this.field7836 = var3;
      this.field7837 = var4;
      this.field7838 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7835; var3 < this.field7836; var3++) {
         int var4 = var3 * Class8832.method31955(this.field7839);

         for (int var5 = 0; var5 < Class8832.method31956(this.field7839); var5++) {
            Class8832.method31958(this.field7839).method33652(this.field7837, var4 + var5 * Class8832.method31957(this.field7839), this.field7838);
         }
      }
   }
}
