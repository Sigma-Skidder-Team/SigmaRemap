package mapped;

public class Class530 implements Runnable {
   private static String[] field2530;
   public final int field2531;
   public final int field2532;
   public final float[][] field2533;
   public final Class7821 field2534;

   public Class530(Class7821 var1, int var2, int var3, float[][] var4) {
      this.field2534 = var1;
      this.field2531 = var2;
      this.field2532 = var3;
      this.field2533 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7821.method26151(this.field2534)];

      for (int var4 = this.field2531; var4 < this.field2532; var4++) {
         for (int var5 = 0; var5 < Class7821.method26151(this.field2534); var5++) {
            var3[var5] = this.field2533[var5][var4];
         }

         Class7821.method26152(this.field2534).method28455(var3);

         for (int var6 = 0; var6 < Class7821.method26151(this.field2534); var6++) {
            this.field2533[var6][var4] = var3[var6];
         }
      }
   }
}
