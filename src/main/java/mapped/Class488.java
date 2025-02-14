package mapped;

public class Class488 implements Runnable {
   private static String[] field2298;
   public final int field2299;
   public final int field2300;
   public final float[] field2301;
   public final Class8543 field2302;

   public Class488(Class8543 var1, int var2, int var3, float[] var4) {
      this.field2302 = var1;
      this.field2299 = var2;
      this.field2300 = var3;
      this.field2301 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field2299; var3 < this.field2300; var3++) {
         Class8543.method30434(this.field2302).method30939(this.field2301, var3 * Class8543.method30438(this.field2302));
      }
   }
}
