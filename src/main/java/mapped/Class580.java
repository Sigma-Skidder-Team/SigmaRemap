package mapped;

public class Class580 implements Runnable {
   private static String[] field2838;
   public final int field2839;
   public final int field2840;
   public final int field2841;
   public final int field2842;
   public final double[] field2843;
   public final Class9615 field2844;

   public Class580(Class9615 var1, int var2, int var3, int var4, int var5, double[] var6) {
      this.field2844 = var1;
      this.field2839 = var2;
      this.field2840 = var3;
      this.field2841 = var4;
      this.field2842 = var5;
      this.field2843 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field2839; var3 < this.field2840; var3++) {
         int var4 = var3 * this.field2841;
         int var5 = (Class9615.method37424(this.field2844) - var3 + 1) * this.field2841;

         for (int var6 = this.field2842; var6 < Class9615.method37427(this.field2844); var6++) {
            int var7 = 2 * var6;
            int var8 = 2 * (Class9615.method37427(this.field2844) - var6);
            this.field2843[var7] = this.field2843[var8];
            this.field2843[var7 + 1] = -this.field2843[var8 + 1];
            int var9 = var4 + var7;
            int var10 = var5 - var7;
            this.field2843[var9] = this.field2843[var10];
            this.field2843[var9 + 1] = -this.field2843[var10 + 1];
         }
      }
   }
}
