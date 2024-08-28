package mapped;

public class Class1604 implements Runnable {
   private static String[] field8693;
   public final int field8694;
   public final int field8695;
   public final double[][][] field8696;
   public final boolean field8697;
   public final Class8832 field8698;

   public Class1604(Class8832 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field8698 = var1;
      this.field8694 = var2;
      this.field8695 = var3;
      this.field8696 = var4;
      this.field8697 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class8832.method31961(this.field8698)];

      for (int var4 = this.field8694; var4 < this.field8695; var4++) {
         for (int var5 = 0; var5 < Class8832.method31959(this.field8698); var5++) {
            for (int var6 = 0; var6 < Class8832.method31961(this.field8698); var6++) {
               var3[var6] = this.field8696[var6][var4][var5];
            }

            Class8832.method31962(this.field8698).method33650(var3, this.field8697);

            for (int var7 = 0; var7 < Class8832.method31961(this.field8698); var7++) {
               this.field8696[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
