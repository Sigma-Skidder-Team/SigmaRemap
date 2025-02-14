package mapped;

public class Class538 implements Runnable {
   private static String[] field2575;
   public final int field2576;
   public final int field2577;
   public final float[][][] field2578;
   public final Class8026 field2579;

   public Class538(Class8026 var1, int var2, int var3, float[][][] var4) {
      this.field2579 = var1;
      this.field2576 = var2;
      this.field2577 = var3;
      this.field2578 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27513(this.field2579)];

      for (int var4 = this.field2576; var4 < this.field2577; var4++) {
         for (int var5 = 0; var5 < Class8026.method27516(this.field2579); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class8026.method27513(this.field2579); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field2578[var4][var7][var6];
               var3[var8 + 1] = this.field2578[var4][var7][var6 + 1];
            }

            Class8026.method27517(this.field2579).method30929(var3);

            for (int var9 = 0; var9 < Class8026.method27513(this.field2579); var9++) {
               int var10 = 2 * var9;
               this.field2578[var4][var9][var6] = var3[var10];
               this.field2578[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
