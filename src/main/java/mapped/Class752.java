package mapped;

public class Class752 implements Runnable {
   private static String[] field3901;
   public final int field3902;
   public final int field3903;
   public final double[][][] field3904;
   public final boolean field3905;
   public final Class6352 field3906;

   public Class752(Class6352 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field3906 = var1;
      this.field3902 = var2;
      this.field3903 = var3;
      this.field3904 = var4;
      this.field3905 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class6352.method19333(this.field3906)];

      for (int var4 = this.field3902; var4 < this.field3903; var4++) {
         for (int var5 = 0; var5 < Class6352.method19331(this.field3906); var5++) {
            for (int var6 = 0; var6 < Class6352.method19333(this.field3906); var6++) {
               var3[var6] = this.field3904[var6][var4][var5];
            }

            Class6352.method19334(this.field3906).method38580(var3, this.field3905);

            for (int var7 = 0; var7 < Class6352.method19333(this.field3906); var7++) {
               this.field3904[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
