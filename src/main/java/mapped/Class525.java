package mapped;

public class Class525 implements Runnable {
   private static String[] field2498;
   public final int field2499;
   public final int field2500;
   public final float[] field2501;
   public final Class8026 field2502;

   public Class525(Class8026 var1, int var2, int var3, float[] var4) {
      this.field2502 = var1;
      this.field2499 = var2;
      this.field2500 = var3;
      this.field2501 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27513(this.field2502)];

      for (int var4 = this.field2499; var4 < this.field2500; var4++) {
         int var5 = var4 * Class8026.method27512(this.field2502);

         for (int var6 = 0; var6 < Class8026.method27516(this.field2502); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class8026.method27513(this.field2502); var8++) {
               int var9 = var5 + var7 + var8 * Class8026.method27514(this.field2502);
               int var10 = 2 * var8;
               var3[var10] = this.field2501[var9];
               var3[var10 + 1] = this.field2501[var9 + 1];
            }

            Class8026.method27517(this.field2502).method30929(var3);

            for (int var11 = 0; var11 < Class8026.method27513(this.field2502); var11++) {
               int var12 = var5 + var7 + var11 * Class8026.method27514(this.field2502);
               int var13 = 2 * var11;
               this.field2501[var12] = var3[var13];
               this.field2501[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
