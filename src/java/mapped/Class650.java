package mapped;

public class Class650 implements Runnable {
   private static String[] field3254;
   public final int field3255;
   public final int field3256;
   public final double[][] field3257;
   public final double[][] field3258;
   public final boolean field3259;
   public final Class9615 field3260;

   public Class650(Class9615 var1, int var2, int var3, double[][] var4, double[][] var5, boolean var6) {
      this.field3260 = var1;
      this.field3255 = var2;
      this.field3256 = var3;
      this.field3257 = var4;
      this.field3258 = var5;
      this.field3259 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field3255; var3 < this.field3256; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < Class9615.method37424(this.field3260); var5++) {
            int var6 = 2 * var5;
            this.field3257[var3][var6] = this.field3258[var5][var4];
            this.field3257[var3][var6 + 1] = this.field3258[var5][var4 + 1];
         }

         Class9615.method37425(this.field3260).method27166(this.field3257[var3], this.field3259);
      }
   }
}
