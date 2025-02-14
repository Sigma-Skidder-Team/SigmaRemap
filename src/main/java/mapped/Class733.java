package mapped;

public class Class733 implements Runnable {
   private static String[] field3792;
   public final int field3793;
   public final int field3794;
   public final double[] field3795;
   public final int field3796;
   public final double[] field3797;
   public final Class7990 field3798;

   public Class733(Class7990 var1, int var2, int var3, double[] var4, int var5, double[] var6) {
      this.field3798 = var1;
      this.field3793 = var2;
      this.field3794 = var3;
      this.field3795 = var4;
      this.field3796 = var5;
      this.field3797 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field3793; var3 < this.field3794; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         this.field3795[this.field3796 + var3] = Class7990.method27241(this.field3798)[var4] * this.field3797[var4]
            - Class7990.method27241(this.field3798)[var5] * this.field3797[var5];
      }
   }
}
