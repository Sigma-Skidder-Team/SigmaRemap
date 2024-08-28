package mapped;

public class Class614 implements Runnable {
   private static String[] field3047;
   public final int field3048;
   public final int field3049;
   public final float[] field3050;
   public final boolean field3051;
   public final Class7824 field3052;

   public Class614(Class7824 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field3052 = var1;
      this.field3048 = var2;
      this.field3049 = var3;
      this.field3050 = var4;
      this.field3051 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7824.method26180(this.field3052)];

      for (int var4 = this.field3048; var4 < this.field3049; var4++) {
         int var5 = var4 * Class7824.method26179(this.field3052);

         for (int var6 = 0; var6 < Class7824.method26183(this.field3052); var6++) {
            for (int var7 = 0; var7 < Class7824.method26180(this.field3052); var7++) {
               int var8 = var5 + var7 * Class7824.method26181(this.field3052) + var6;
               var3[var7] = this.field3050[var8];
            }

            Class7824.method26184(this.field3052).method29627(var3, this.field3051);

            for (int var9 = 0; var9 < Class7824.method26180(this.field3052); var9++) {
               int var10 = var5 + var9 * Class7824.method26181(this.field3052) + var6;
               this.field3050[var10] = var3[var9];
            }
         }
      }
   }
}
