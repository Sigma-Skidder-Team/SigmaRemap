package mapped;

public class Class704 implements Runnable {
   private static String[] field3602;
   public final int field3603;
   public final int field3604;
   public final float[][][] field3605;
   public final boolean field3606;
   public final Class7824 field3607;

   public Class704(Class7824 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field3607 = var1;
      this.field3603 = var2;
      this.field3604 = var3;
      this.field3605 = var4;
      this.field3606 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7824.method26180(this.field3607)];

      for (int var4 = this.field3603; var4 < this.field3604; var4++) {
         for (int var5 = 0; var5 < Class7824.method26183(this.field3607); var5++) {
            for (int var6 = 0; var6 < Class7824.method26180(this.field3607); var6++) {
               var3[var6] = this.field3605[var4][var6][var5];
            }

            Class7824.method26184(this.field3607).method29631(var3, this.field3606);

            for (int var7 = 0; var7 < Class7824.method26180(this.field3607); var7++) {
               this.field3605[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
