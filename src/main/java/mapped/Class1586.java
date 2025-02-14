package mapped;

public class Class1586 implements Runnable {
   private static String[] field8593;
   public final int field8594;
   public final int field8595;
   public final float[] field8596;
   public final boolean field8597;
   public final Class8162 field8598;

   public Class1586(Class8162 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field8598 = var1;
      this.field8594 = var2;
      this.field8595 = var3;
      this.field8596 = var4;
      this.field8597 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class8162.method28393(this.field8598)];

      for (int var4 = this.field8594; var4 < this.field8595; var4++) {
         int var5 = var4 * Class8162.method28392(this.field8598);

         for (int var6 = 0; var6 < Class8162.method28396(this.field8598); var6++) {
            for (int var7 = 0; var7 < Class8162.method28393(this.field8598); var7++) {
               int var8 = var5 + var7 * Class8162.method28394(this.field8598) + var6;
               var3[var7] = this.field8596[var8];
            }

            Class8162.method28397(this.field8598).method28459(var3, this.field8597);

            for (int var9 = 0; var9 < Class8162.method28393(this.field8598); var9++) {
               int var10 = var5 + var9 * Class8162.method28394(this.field8598) + var6;
               this.field8596[var10] = var3[var9];
            }
         }
      }
   }
}
