package mapped;

public class Class778 implements Runnable {
   private static String[] field4057;
   public final int field4058;
   public final int field4059;
   public final int field4060;
   public final double[] field4061;
   public final boolean field4062;
   public final Class9615 field4063;

   public Class778(Class9615 var1, int var2, int var3, int var4, double[] var5, boolean var6) {
      this.field4063 = var1;
      this.field4058 = var2;
      this.field4059 = var3;
      this.field4060 = var4;
      this.field4061 = var5;
      this.field4062 = var6;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class9615.method37424(this.field4063)];

      for (int var4 = this.field4058; var4 < this.field4059; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < Class9615.method37424(this.field4063); var6++) {
            int var7 = 2 * var6;
            int var8 = var6 * this.field4060 + var5;
            var3[var7] = this.field4061[var8];
            var3[var7 + 1] = this.field4061[var8 + 1];
         }

         Class9615.method37425(this.field4063).method27166(var3, this.field4062);

         for (int var9 = 0; var9 < Class9615.method37424(this.field4063); var9++) {
            int var10 = 2 * var9;
            int var11 = var9 * this.field4060 + var5;
            this.field4061[var11] = var3[var10];
            this.field4061[var11 + 1] = var3[var10 + 1];
         }
      }
   }
}
