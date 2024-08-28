package mapped;

public class Class570 implements Runnable {
   private static String[] field2770;
   public final int field2771;
   public final int field2772;
   public final int field2773;
   public final int field2774;
   public final double[] field2775;
   public final double[][] field2776;
   public final Class9615 field2777;

   public Class570(Class9615 var1, int var2, int var3, int var4, int var5, double[] var6, double[][] var7) {
      this.field2777 = var1;
      this.field2771 = var2;
      this.field2772 = var3;
      this.field2773 = var4;
      this.field2774 = var5;
      this.field2775 = var6;
      this.field2776 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field2771; var3 < this.field2772; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field2773; var5++) {
            int var6 = 2 * var5;
            int var7 = var3 * this.field2774 + var6;
            this.field2775[var7] = this.field2776[var5][var4];
            this.field2775[var7 + 1] = this.field2776[var5][var4 + 1];
         }
      }
   }
}
