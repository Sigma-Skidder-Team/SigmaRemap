package mapped;

public class Class568 implements Runnable {
   private static String[] field2759;
   public final int field2760;
   public final int field2761;
   public final double[] field2762;
   public final Class7274 field2763;

   public Class568(Class7274 var1, int var2, int var3, double[] var4) {
      this.field2763 = var1;
      this.field2760 = var2;
      this.field2761 = var3;
      this.field2762 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field2760; var3 < this.field2761; var3++) {
         int var4 = var3 * Class7274.method22894(this.field2763);

         for (int var5 = 0; var5 < Class7274.method22895(this.field2763); var5++) {
            Class7274.method22897(this.field2763).method27164(this.field2762, var4 + var5 * Class7274.method22896(this.field2763));
         }
      }
   }
}
