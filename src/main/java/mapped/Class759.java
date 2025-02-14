package mapped;

public class Class759 implements Runnable {
   private static String[] field3939;
   public final int field3940;
   public final int field3941;
   public final float[][][] field3942;
   public final boolean field3943;
   public final Class8026 field3944;

   public Class759(Class8026 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field3944 = var1;
      this.field3940 = var2;
      this.field3941 = var3;
      this.field3942 = var4;
      this.field3943 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27513(this.field3944)];

      for (int var4 = this.field3940; var4 < this.field3941; var4++) {
         for (int var5 = 0; var5 < Class8026.method27516(this.field3944); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class8026.method27513(this.field3944); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field3942[var4][var7][var6];
               var3[var8 + 1] = this.field3942[var4][var7][var6 + 1];
            }

            Class8026.method27517(this.field3944).method30933(var3, this.field3943);

            for (int var9 = 0; var9 < Class8026.method27513(this.field3944); var9++) {
               int var10 = 2 * var9;
               this.field3942[var4][var9][var6] = var3[var10];
               this.field3942[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
