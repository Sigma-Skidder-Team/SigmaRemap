package mapped;

public class Class455 implements Runnable {
   private static String[] field2080;
   public final int field2081;
   public final int field2082;
   public final float[] field2083;
   public final boolean field2084;
   public final Class8162 field2085;

   public Class455(Class8162 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field2085 = var1;
      this.field2081 = var2;
      this.field2082 = var3;
      this.field2083 = var4;
      this.field2084 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class8162.method28398(this.field2085)];

      for (int var4 = this.field2081; var4 < this.field2082; var4++) {
         int var5 = var4 * Class8162.method28394(this.field2085);

         for (int var6 = 0; var6 < Class8162.method28396(this.field2085); var6++) {
            for (int var7 = 0; var7 < Class8162.method28398(this.field2085); var7++) {
               int var8 = var7 * Class8162.method28392(this.field2085) + var5 + var6;
               var3[var7] = this.field2083[var8];
            }

            Class8162.method28399(this.field2085).method28459(var3, this.field2084);

            for (int var9 = 0; var9 < Class8162.method28398(this.field2085); var9++) {
               int var10 = var9 * Class8162.method28392(this.field2085) + var5 + var6;
               this.field2083[var10] = var3[var9];
            }
         }
      }
   }
}
