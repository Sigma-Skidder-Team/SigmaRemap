package mapped;

public class Class1590 implements Runnable {
   private static String[] field8611;
   public final int field8612;
   public final int field8613;
   public final int field8614;
   public final double[][][] field8615;
   public final double[] field8616;
   public final int field8617;
   public final int field8618;
   public final Class7274 field8619;

   public Class1590(Class7274 var1, int var2, int var3, int var4, double[][][] var5, double[] var6, int var7, int var8) {
      this.field8619 = var1;
      this.field8612 = var2;
      this.field8613 = var3;
      this.field8614 = var4;
      this.field8615 = var5;
      this.field8616 = var6;
      this.field8617 = var7;
      this.field8618 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field8612; var3 < this.field8613; var3++) {
         int var4 = var3 * this.field8614;

         for (int var5 = 0; var5 < Class7274.method22895(this.field8619); var5++) {
            System.arraycopy(this.field8615[var3][var5], 0, this.field8616, var4 + var5 * this.field8617, this.field8618);
         }
      }
   }
}
