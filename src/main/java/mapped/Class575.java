package mapped;

public class Class575 implements Runnable {
   private static String[] field2806;
   public final int field2807;
   public final int field2808;
   public final float[][][] field2809;
   public final boolean field2810;
   public final Class7824 field2811;

   public Class575(Class7824 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field2811 = var1;
      this.field2807 = var2;
      this.field2808 = var3;
      this.field2809 = var4;
      this.field2810 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7824.method26185(this.field2811)];

      for (int var4 = this.field2807; var4 < this.field2808; var4++) {
         for (int var5 = 0; var5 < Class7824.method26183(this.field2811); var5++) {
            for (int var6 = 0; var6 < Class7824.method26185(this.field2811); var6++) {
               var3[var6] = this.field2809[var6][var4][var5];
            }

            Class7824.method26186(this.field2811).method29631(var3, this.field2810);

            for (int var7 = 0; var7 < Class7824.method26185(this.field2811); var7++) {
               this.field2809[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
