package mapped;

public class Class1623 implements Runnable {
   private static String[] field8793;
   public final int field8794;
   public final int field8795;
   public final double[][] field8796;
   public final double[] field8797;
   public final boolean field8798;
   public final Class9615 field8799;

   public Class1623(Class9615 var1, int var2, int var3, double[][] var4, double[] var5, boolean var6) {
      this.field8799 = var1;
      this.field8794 = var2;
      this.field8795 = var3;
      this.field8796 = var4;
      this.field8797 = var5;
      this.field8798 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field8794; var3 < this.field8795; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < Class9615.method37424(this.field8799); var5++) {
            int var6 = 2 * var5;
            int var7 = var5 * Class9615.method37427(this.field8799) + var4;
            this.field8796[var3][var6] = this.field8797[var7];
            this.field8796[var3][var6 + 1] = this.field8797[var7 + 1];
         }

         Class9615.method37425(this.field8799).method27166(this.field8796[var3], this.field8798);
      }
   }
}
