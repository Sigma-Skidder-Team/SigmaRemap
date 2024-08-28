package mapped;

public class Class597 implements Runnable {
   private static String[] field2940;
   public final int field2941;
   public final int field2942;
   public final int field2943;
   public final int field2944;
   public final int field2945;
   public final double[] field2946;
   public final Class7274 field2947;

   public Class597(Class7274 var1, int var2, int var3, int var4, int var5, int var6, double[] var7) {
      this.field2947 = var1;
      this.field2941 = var2;
      this.field2942 = var3;
      this.field2943 = var4;
      this.field2944 = var5;
      this.field2945 = var6;
      this.field2946 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field2941; var3 < this.field2942; var3++) {
         int var4 = (Class7274.method22900(this.field2947) - var3) % Class7274.method22900(this.field2947) * this.field2943;
         int var5 = var3 * this.field2943;

         for (int var6 = 1; var6 < this.field2944; var6++) {
            int var7 = var4 + (Class7274.method22895(this.field2947) - var6) * this.field2945;
            int var8 = var5 + var6 * this.field2945;
            this.field2946[var7] = this.field2946[var8];
            this.field2946[var7 + 1] = -this.field2946[var8 + 1];
         }
      }
   }
}
