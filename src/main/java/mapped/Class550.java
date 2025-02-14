package mapped;

public class Class550 implements Runnable {
   private static String[] field2640;
   public final int field2641;
   public final int field2642;
   public final float[] field2643;
   public final Class8162 field2644;

   public Class550(Class8162 var1, int var2, int var3, float[] var4) {
      this.field2644 = var1;
      this.field2641 = var2;
      this.field2642 = var3;
      this.field2643 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class8162.method28393(this.field2644)];

      for (int var4 = this.field2641; var4 < this.field2642; var4++) {
         int var5 = var4 * Class8162.method28392(this.field2644);

         for (int var6 = 0; var6 < Class8162.method28396(this.field2644); var6++) {
            for (int var7 = 0; var7 < Class8162.method28393(this.field2644); var7++) {
               int var8 = var5 + var7 * Class8162.method28394(this.field2644) + var6;
               var3[var7] = this.field2643[var8];
            }

            Class8162.method28397(this.field2644).method28455(var3);

            for (int var9 = 0; var9 < Class8162.method28393(this.field2644); var9++) {
               int var10 = var5 + var9 * Class8162.method28394(this.field2644) + var6;
               this.field2643[var10] = var3[var9];
            }
         }
      }
   }
}
