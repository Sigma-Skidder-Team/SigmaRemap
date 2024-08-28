package mapped;

public class Class585 implements Runnable {
   private static String[] field2868;
   public final int field2869;
   public final int field2870;
   public final float[][][] field2871;
   public final boolean field2872;
   public final Class8162 field2873;

   public Class585(Class8162 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field2873 = var1;
      this.field2869 = var2;
      this.field2870 = var3;
      this.field2871 = var4;
      this.field2872 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class8162.method28398(this.field2873)];

      for (int var4 = this.field2869; var4 < this.field2870; var4++) {
         for (int var5 = 0; var5 < Class8162.method28396(this.field2873); var5++) {
            for (int var6 = 0; var6 < Class8162.method28398(this.field2873); var6++) {
               var3[var6] = this.field2871[var6][var4][var5];
            }

            Class8162.method28399(this.field2873).method28459(var3, this.field2872);

            for (int var7 = 0; var7 < Class8162.method28398(this.field2873); var7++) {
               this.field2871[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
