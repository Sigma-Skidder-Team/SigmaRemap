package mapped;

public class Class737 implements Runnable {
   private static String[] field3820;
   public final int field3821;
   public final int field3822;
   public final double[][] field3823;
   public final Class9615 field3824;

   public Class737(Class9615 var1, int var2, int var3, double[][] var4) {
      this.field3824 = var1;
      this.field3821 = var2;
      this.field3822 = var3;
      this.field3823 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field3821; var3 < this.field3822; var3++) {
         Class9615.method37423(this.field3824).method27170(this.field3823[var3]);
      }
   }
}
