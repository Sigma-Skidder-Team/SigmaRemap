package mapped;

public class Class1535 implements Runnable {
   private static String[] field8327;
   public final int field8328;
   public final int field8329;
   public final double[][][] field8330;
   public final boolean field8331;
   public final Class3612 field8332;

   public Class1535(Class3612 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field8332 = var1;
      this.field8328 = var2;
      this.field8329 = var3;
      this.field8330 = var4;
      this.field8331 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class3612.method12221(this.field8332)];

      for (int var4 = this.field8328; var4 < this.field8329; var4++) {
         for (int var5 = 0; var5 < Class3612.method12224(this.field8332); var5++) {
            for (int var6 = 0; var6 < Class3612.method12221(this.field8332); var6++) {
               var3[var6] = this.field8330[var4][var6][var5];
            }

            Class3612.method12225(this.field8332).method33660(var3, this.field8331);

            for (int var7 = 0; var7 < Class3612.method12221(this.field8332); var7++) {
               this.field8330[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
