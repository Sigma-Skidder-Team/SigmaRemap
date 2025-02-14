package mapped;

public class Class515 implements Runnable {
   private static String[] field2445;
   public final int field2446;
   public final int field2447;
   public final float[][] field2448;
   public final Class8543 field2449;

   public Class515(Class8543 var1, int var2, int var3, float[][] var4) {
      this.field2449 = var1;
      this.field2446 = var2;
      this.field2447 = var3;
      this.field2448 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8543.method30435(this.field2449)];

      for (int var4 = this.field2446; var4 < this.field2447; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < Class8543.method30435(this.field2449); var6++) {
            int var7 = 2 * var6;
            var3[var7] = this.field2448[var6][var5];
            var3[var7 + 1] = this.field2448[var6][var5 + 1];
         }

         Class8543.method30436(this.field2449).method30929(var3);

         for (int var8 = 0; var8 < Class8543.method30435(this.field2449); var8++) {
            int var9 = 2 * var8;
            this.field2448[var8][var5] = var3[var9];
            this.field2448[var8][var5 + 1] = var3[var9 + 1];
         }
      }
   }
}
