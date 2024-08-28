package mapped;

public class Class1627 implements Runnable {
   private static String[] field8819;
   public final int field8820;
   public final int field8821;
   public final double[] field8822;
   public final boolean field8823;
   public final Class9330 field8824;

   public Class1627(Class9330 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field8824 = var1;
      this.field8820 = var2;
      this.field8821 = var3;
      this.field8822 = var4;
      this.field8823 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field8820; var3 < this.field8821; var3++) {
         Class9330.method35278(this.field8824).method38582(this.field8822, var3 * Class9330.method35277(this.field8824), this.field8823);
      }
   }
}
