package mapped;

public class Class712 implements Runnable {
   private static String[] field3650;
   public final int field3651;
   public final int field3652;
   public final double[] field3653;
   public final boolean field3654;
   public final Class9330 field3655;

   public Class712(Class9330 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field3655 = var1;
      this.field3651 = var2;
      this.field3652 = var3;
      this.field3653 = var4;
      this.field3654 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class9330.method35279(this.field3655)];

      for (int var4 = this.field3651; var4 < this.field3652; var4++) {
         for (int var5 = 0; var5 < Class9330.method35279(this.field3655); var5++) {
            var3[var5] = this.field3653[var5 * Class9330.method35277(this.field3655) + var4];
         }

         Class9330.method35280(this.field3655).method38580(var3, this.field3654);

         for (int var6 = 0; var6 < Class9330.method35279(this.field3655); var6++) {
            this.field3653[var6 * Class9330.method35277(this.field3655) + var4] = var3[var6];
         }
      }
   }
}
