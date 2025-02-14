package mapped;

public class Class481 implements Runnable {
   private static String[] field2252;
   public final int field2253;
   public final int field2254;
   public final double[] field2255;
   public final Class9186 field2256;

   public Class481(Class9186 var1, int var2, int var3, double[] var4) {
      this.field2256 = var1;
      this.field2253 = var2;
      this.field2254 = var3;
      this.field2255 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field2253; var3 < this.field2254; var3++) {
         Class9186.method34382(this.field2256).method33648(this.field2255, var3 * Class9186.method34381(this.field2256));
      }
   }
}
