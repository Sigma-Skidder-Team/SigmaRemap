package mapped;

public class Class405 implements Runnable {
   private static String[] field1751;
   public final int field1752;
   public final int field1753;
   public final double[][] field1754;
   public final boolean field1755;
   public final Class9330 field1756;

   public Class405(Class9330 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field1756 = var1;
      this.field1752 = var2;
      this.field1753 = var3;
      this.field1754 = var4;
      this.field1755 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class9330.method35279(this.field1756)];

      for (int var4 = this.field1752; var4 < this.field1753; var4++) {
         for (int var5 = 0; var5 < Class9330.method35279(this.field1756); var5++) {
            var3[var5] = this.field1754[var5][var4];
         }

         Class9330.method35280(this.field1756).method38576(var3, this.field1755);

         for (int var6 = 0; var6 < Class9330.method35279(this.field1756); var6++) {
            this.field1754[var6][var4] = var3[var6];
         }
      }
   }
}
