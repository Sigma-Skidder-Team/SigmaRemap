package mapped;

public class Class726 implements Runnable {
   private static String[] field3744;
   public final int field3745;
   public final int field3746;
   public final double[][][] field3747;
   public final boolean field3748;
   public final Class6352 field3749;

   public Class726(Class6352 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field3749 = var1;
      this.field3745 = var2;
      this.field3746 = var3;
      this.field3747 = var4;
      this.field3748 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class6352.method19328(this.field3749)];

      for (int var4 = this.field3745; var4 < this.field3746; var4++) {
         for (int var5 = 0; var5 < Class6352.method19331(this.field3749); var5++) {
            for (int var6 = 0; var6 < Class6352.method19328(this.field3749); var6++) {
               var3[var6] = this.field3747[var4][var6][var5];
            }

            Class6352.method19332(this.field3749).method38576(var3, this.field3748);

            for (int var7 = 0; var7 < Class6352.method19328(this.field3749); var7++) {
               this.field3747[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
