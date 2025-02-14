package mapped;

public class Class666 implements Runnable {
   private static String[] field3360;
   public final int field3361;
   public final int field3362;
   public final float[][] field3363;
   public final boolean field3364;
   public final Class8543 field3365;

   public Class666(Class8543 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field3365 = var1;
      this.field3361 = var2;
      this.field3362 = var3;
      this.field3363 = var4;
      this.field3364 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8543.method30435(this.field3365)];

      for (int var4 = this.field3361; var4 < this.field3362; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < Class8543.method30435(this.field3365); var6++) {
            int var7 = 2 * var6;
            var3[var7] = this.field3363[var6][var5];
            var3[var7 + 1] = this.field3363[var6][var5 + 1];
         }

         Class8543.method30436(this.field3365).method30933(var3, this.field3364);

         for (int var8 = 0; var8 < Class8543.method30435(this.field3365); var8++) {
            int var9 = 2 * var8;
            this.field3363[var8][var5] = var3[var9];
            this.field3363[var8][var5 + 1] = var3[var9 + 1];
         }
      }
   }
}
