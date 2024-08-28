package mapped;

public class Class484 implements Runnable {
   private static String[] field2270;
   public final int field2271;
   public final int field2272;
   public final float[] field2273;
   public final boolean field2274;
   public final Class9533 field2275;

   public Class484(Class9533 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field2275 = var1;
      this.field2271 = var2;
      this.field2272 = var3;
      this.field2273 = var4;
      this.field2274 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2271; var3 < this.field2272; var3++) {
         Class9533.method36857(this.field2275).method29633(this.field2273, var3 * Class9533.method36856(this.field2275), this.field2274);
      }
   }
}
