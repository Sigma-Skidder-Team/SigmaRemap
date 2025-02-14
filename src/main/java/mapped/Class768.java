package mapped;

public class Class768 implements Runnable {
   private static String[] field3995;
   public final int field3996;
   public final int field3997;
   public final double[][][] field3998;
   public final boolean field3999;
   public final Class3612 field4000;

   public Class768(Class3612 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field4000 = var1;
      this.field3996 = var2;
      this.field3997 = var3;
      this.field3998 = var4;
      this.field3999 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class3612.method12221(this.field4000)];

      for (int var4 = this.field3996; var4 < this.field3997; var4++) {
         for (int var5 = 0; var5 < Class3612.method12224(this.field4000); var5++) {
            for (int var6 = 0; var6 < Class3612.method12221(this.field4000); var6++) {
               var3[var6] = this.field3998[var4][var6][var5];
            }

            Class3612.method12225(this.field4000).method33656(var3, this.field3999);

            for (int var7 = 0; var7 < Class3612.method12221(this.field4000); var7++) {
               this.field3998[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
