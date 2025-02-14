package mapped;

public class Class453 implements Runnable {
   private static String[] field2069;
   public final int field2070;
   public final int field2071;
   public final double[] field2072;
   public final boolean field2073;
   public final Class9615 field2074;

   public Class453(Class9615 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field2074 = var1;
      this.field2070 = var2;
      this.field2071 = var3;
      this.field2072 = var4;
      this.field2073 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2070; var3 < this.field2071; var3++) {
         Class9615.method37423(this.field2074).method27186(this.field2072, var3 * Class9615.method37427(this.field2074), this.field2073);
      }
   }
}
