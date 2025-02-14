package mapped;

public class Class523 implements Runnable {
   private static String[] field2485;
   public final int field2486;
   public final int field2487;
   public final float[][][] field2488;
   public final boolean field2489;
   public final Class8026 field2490;

   public Class523(Class8026 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field2490 = var1;
      this.field2486 = var2;
      this.field2487 = var3;
      this.field2488 = var4;
      this.field2489 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27518(this.field2490)];

      for (int var4 = this.field2486; var4 < this.field2487; var4++) {
         for (int var5 = 0; var5 < Class8026.method27516(this.field2490); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class8026.method27518(this.field2490); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field2488[var7][var4][var6];
               var3[var8 + 1] = this.field2488[var7][var4][var6 + 1];
            }

            Class8026.method27519(this.field2490).method30933(var3, this.field2489);

            for (int var9 = 0; var9 < Class8026.method27518(this.field2490); var9++) {
               int var10 = 2 * var9;
               this.field2488[var9][var4][var6] = var3[var10];
               this.field2488[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
