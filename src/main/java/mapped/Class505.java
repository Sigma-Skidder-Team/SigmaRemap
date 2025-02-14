package mapped;

public class Class505 implements Runnable {
   private static String[] field2394;
   public final int field2395;
   public final int field2396;
   public final float[] field2397;
   public final boolean field2398;
   public final Class8543 field2399;

   public Class505(Class8543 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field2399 = var1;
      this.field2395 = var2;
      this.field2396 = var3;
      this.field2397 = var4;
      this.field2398 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2395; var3 < this.field2396; var3++) {
         Class8543.method30434(this.field2399).method30953(this.field2397, var3 * Class8543.method30438(this.field2399), this.field2398);
      }
   }
}
