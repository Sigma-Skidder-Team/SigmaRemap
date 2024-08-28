package mapped;

public class Class1410 implements Runnable {
   private static String[] field7554;
   public final int field7555;
   public final int field7556;
   public final double[] field7557;
   public final Class9615 field7558;

   public Class1410(Class9615 var1, int var2, int var3, double[] var4) {
      this.field7558 = var1;
      this.field7555 = var2;
      this.field7556 = var3;
      this.field7557 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field7555; var3 < this.field7556; var3++) {
         Class9615.method37423(this.field7558).method27172(this.field7557, var3 * Class9615.method37427(this.field7558));
      }
   }
}
