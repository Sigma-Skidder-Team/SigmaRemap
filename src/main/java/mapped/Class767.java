package mapped;

public class Class767 implements Runnable {
   private static String[] field3990;
   public final int field3991;
   public final int field3992;
   public final float[][][] field3993;
   public final Class8026 field3994;

   public Class767(Class8026 var1, int var2, int var3, float[][][] var4) {
      this.field3994 = var1;
      this.field3991 = var2;
      this.field3992 = var3;
      this.field3993 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27518(this.field3994)];

      for (int var4 = this.field3991; var4 < this.field3992; var4++) {
         for (int var5 = 0; var5 < Class8026.method27516(this.field3994); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class8026.method27518(this.field3994); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field3993[var7][var4][var6];
               var3[var8 + 1] = this.field3993[var7][var4][var6 + 1];
            }

            Class8026.method27519(this.field3994).method30929(var3);

            for (int var9 = 0; var9 < Class8026.method27518(this.field3994); var9++) {
               int var10 = 2 * var9;
               this.field3993[var9][var4][var6] = var3[var10];
               this.field3993[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
