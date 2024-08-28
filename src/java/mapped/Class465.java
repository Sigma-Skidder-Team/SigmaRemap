package mapped;

public class Class465 implements Runnable {
   private static String[] field2152;
   public final int field2153;
   public final int field2154;
   public final float[] field2155;
   public final boolean field2156;
   public final Class7824 field2157;

   public Class465(Class7824 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field2157 = var1;
      this.field2153 = var2;
      this.field2154 = var3;
      this.field2155 = var4;
      this.field2156 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7824.method26180(this.field2157)];

      for (int var4 = this.field2153; var4 < this.field2154; var4++) {
         int var5 = var4 * Class7824.method26179(this.field2157);

         for (int var6 = 0; var6 < Class7824.method26183(this.field2157); var6++) {
            for (int var7 = 0; var7 < Class7824.method26180(this.field2157); var7++) {
               int var8 = var5 + var7 * Class7824.method26181(this.field2157) + var6;
               var3[var7] = this.field2155[var8];
            }

            Class7824.method26184(this.field2157).method29631(var3, this.field2156);

            for (int var9 = 0; var9 < Class7824.method26180(this.field2157); var9++) {
               int var10 = var5 + var9 * Class7824.method26181(this.field2157) + var6;
               this.field2155[var10] = var3[var9];
            }
         }
      }
   }
}
