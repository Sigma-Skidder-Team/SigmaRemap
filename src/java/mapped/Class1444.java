package mapped;

public class Class1444 implements Runnable {
   private static String[] field7757;
   public final int field7758;
   public final int field7759;
   public final double[][] field7760;
   public final boolean field7761;
   public final Class9615 field7762;

   public Class1444(Class9615 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field7762 = var1;
      this.field7758 = var2;
      this.field7759 = var3;
      this.field7760 = var4;
      this.field7761 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7758; var3 < this.field7759; var3++) {
         Class9615.method37423(this.field7762).method27166(this.field7760[var3], this.field7761);
      }
   }
}
