package mapped;

public class Class660 implements Runnable {
   private static String[] field3317;
   public final int field3318;
   public final int field3319;
   public final double[][][] field3320;
   public final boolean field3321;
   public final Class3612 field3322;

   public Class660(Class3612 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field3322 = var1;
      this.field3318 = var2;
      this.field3319 = var3;
      this.field3320 = var4;
      this.field3321 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class3612.method12226(this.field3322)];

      for (int var4 = this.field3318; var4 < this.field3319; var4++) {
         for (int var5 = 0; var5 < Class3612.method12224(this.field3322); var5++) {
            for (int var6 = 0; var6 < Class3612.method12226(this.field3322); var6++) {
               var3[var6] = this.field3320[var6][var4][var5];
            }

            Class3612.method12227(this.field3322).method33656(var3, this.field3321);

            for (int var7 = 0; var7 < Class3612.method12226(this.field3322); var7++) {
               this.field3320[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
