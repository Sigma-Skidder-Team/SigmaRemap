package mapped;

public class Class1416 implements Runnable {
   private static String[] field7583;
   public final int field7584;
   public final int field7585;
   public final int field7586;
   public final int field7587;
   public final double[] field7588;
   public final double[] field7589;
   public final Class7990 field7590;

   public Class1416(Class7990 var1, int var2, int var3, int var4, int var5, double[] var6, double[] var7) {
      this.field7590 = var1;
      this.field7584 = var2;
      this.field7585 = var3;
      this.field7586 = var4;
      this.field7587 = var5;
      this.field7588 = var6;
      this.field7589 = var7;
   }

   @Override
   public void run() {
      if (this.field7584 <= 0) {
         for (int var3 = this.field7585; var3 < this.field7586; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            int var6 = this.field7587 + var3;
            this.field7588[var4] = this.field7589[var6] * Class7990.method27241(this.field7590)[var4];
            this.field7588[var5] = -this.field7589[var6] * Class7990.method27241(this.field7590)[var5];
         }
      } else {
         for (int var7 = this.field7585; var7 < this.field7586; var7++) {
            int var8 = 2 * var7;
            int var9 = var8 + 1;
            int var10 = this.field7587 + var7;
            this.field7588[var8] = this.field7589[var10] * Class7990.method27241(this.field7590)[var8];
            this.field7588[var9] = this.field7589[var10] * Class7990.method27241(this.field7590)[var9];
         }
      }
   }
}
