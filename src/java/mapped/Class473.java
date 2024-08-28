package mapped;

public class Class473 implements Runnable {
   private static String[] field2204;
   public final int field2205;
   public final int field2206;
   public final double[] field2207;
   public final int field2208;
   public final boolean field2209;
   public final Class9615 field2210;

   public Class473(Class9615 var1, int var2, int var3, double[] var4, int var5, boolean var6) {
      this.field2210 = var1;
      this.field2205 = var2;
      this.field2206 = var3;
      this.field2207 = var4;
      this.field2208 = var5;
      this.field2209 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field2205; var3 < this.field2206; var3++) {
         Class9615.method37423(this.field2210).method27168(this.field2207, var3 * this.field2208, this.field2209);
      }
   }
}
