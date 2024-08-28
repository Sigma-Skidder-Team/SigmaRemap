package mapped;

public class Class471 implements Runnable {
   private static String[] field2192;
   public final int field2193;
   public final int field2194;
   public final float[][][] field2195;
   public final Class8026 field2196;

   public Class471(Class8026 var1, int var2, int var3, float[][][] var4) {
      this.field2196 = var1;
      this.field2193 = var2;
      this.field2194 = var3;
      this.field2195 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27513(this.field2196)];

      for (int var4 = this.field2193; var4 < this.field2194; var4++) {
         for (int var5 = 0; var5 < Class8026.method27516(this.field2196); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class8026.method27513(this.field2196); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field2195[var4][var7][var6];
               var3[var8 + 1] = this.field2195[var4][var7][var6 + 1];
            }

            Class8026.method27517(this.field2196).method30929(var3);

            for (int var9 = 0; var9 < Class8026.method27513(this.field2196); var9++) {
               int var10 = 2 * var9;
               this.field2195[var4][var9][var6] = var3[var10];
               this.field2195[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
