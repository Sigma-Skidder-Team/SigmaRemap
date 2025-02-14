package mapped;

public class Class662 implements Runnable {
   private static String[] field3331;
   public final int field3332;
   public final int field3333;
   public final float[][][] field3334;
   public final boolean field3335;
   public final Class7824 field3336;

   public Class662(Class7824 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field3336 = var1;
      this.field3332 = var2;
      this.field3333 = var3;
      this.field3334 = var4;
      this.field3335 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7824.method26185(this.field3336)];

      for (int var4 = this.field3332; var4 < this.field3333; var4++) {
         for (int var5 = 0; var5 < Class7824.method26183(this.field3336); var5++) {
            for (int var6 = 0; var6 < Class7824.method26185(this.field3336); var6++) {
               var3[var6] = this.field3334[var6][var4][var5];
            }

            Class7824.method26186(this.field3336).method29627(var3, this.field3335);

            for (int var7 = 0; var7 < Class7824.method26185(this.field3336); var7++) {
               this.field3334[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
