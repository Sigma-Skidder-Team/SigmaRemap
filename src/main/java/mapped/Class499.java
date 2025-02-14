package mapped;

public class Class499 implements Runnable {
   private static String[] field2354;
   public final int field2355;
   public final int field2356;
   public final float[][][] field2357;
   public final boolean field2358;
   public final Class8026 field2359;

   public Class499(Class8026 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field2359 = var1;
      this.field2355 = var2;
      this.field2356 = var3;
      this.field2357 = var4;
      this.field2358 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2355; var3 < this.field2356; var3++) {
         for (int var4 = 0; var4 < Class8026.method27513(this.field2359); var4++) {
            Class8026.method27515(this.field2359).method30949(this.field2357[var3][var4], this.field2358);
         }
      }
   }
}
