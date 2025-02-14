package mapped;

public class Class648 implements Runnable {
   private static String[] field3244;
   public final int field3245;
   public final int field3246;
   public final double[][] field3247;
   public final boolean field3248;
   public final Class9186 field3249;

   public Class648(Class9186 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field3249 = var1;
      this.field3245 = var2;
      this.field3246 = var3;
      this.field3247 = var4;
      this.field3248 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class9186.method34383(this.field3249)];

      for (int var4 = this.field3245; var4 < this.field3246; var4++) {
         for (int var5 = 0; var5 < Class9186.method34383(this.field3249); var5++) {
            var3[var5] = this.field3247[var5][var4];
         }

         Class9186.method34384(this.field3249).method33650(var3, this.field3248);

         for (int var6 = 0; var6 < Class9186.method34383(this.field3249); var6++) {
            this.field3247[var6][var4] = var3[var6];
         }
      }
   }
}
