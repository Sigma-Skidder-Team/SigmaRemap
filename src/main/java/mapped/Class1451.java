package mapped;

public class Class1451 implements Runnable {
   private static String[] field7798;
   public final int field7799;
   public final int field7800;
   public final double[] field7801;
   public final int field7802;
   public final double[] field7803;
   public final Class9788 field7804;

   public Class1451(Class9788 var1, int var2, int var3, double[] var4, int var5, double[] var6) {
      this.field7804 = var1;
      this.field7799 = var2;
      this.field7800 = var3;
      this.field7801 = var4;
      this.field7802 = var5;
      this.field7803 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field7799; var3 < this.field7800; var3++) {
         int var4 = 2 * var3;
         double var5 = this.field7801[this.field7802 + var3];
         this.field7803[var4] = Class9788.method38590(this.field7804)[var4] * var5;
         this.field7803[var4 + 1] = -Class9788.method38590(this.field7804)[var4 + 1] * var5;
      }
   }
}
