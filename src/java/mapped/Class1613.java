package mapped;

public class Class1613 implements Runnable {
   private static String[] field8742;
   public final int field8743;
   public final int field8744;
   public final double[][][] field8745;
   public final boolean field8746;
   public final Class8832 field8747;

   public Class1613(Class8832 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field8747 = var1;
      this.field8743 = var2;
      this.field8744 = var3;
      this.field8745 = var4;
      this.field8746 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class8832.method31956(this.field8747)];

      for (int var4 = this.field8743; var4 < this.field8744; var4++) {
         for (int var5 = 0; var5 < Class8832.method31959(this.field8747); var5++) {
            for (int var6 = 0; var6 < Class8832.method31956(this.field8747); var6++) {
               var3[var6] = this.field8745[var4][var6][var5];
            }

            Class8832.method31960(this.field8747).method33650(var3, this.field8746);

            for (int var7 = 0; var7 < Class8832.method31956(this.field8747); var7++) {
               this.field8745[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
