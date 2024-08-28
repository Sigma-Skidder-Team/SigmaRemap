package mapped;

public class Class415 implements Runnable {
   private static String[] field1818;
   public final int field1819;
   public final int field1820;
   public final double[] field1821;
   public final boolean field1822;
   public final Class7274 field1823;

   public Class415(Class7274 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field1823 = var1;
      this.field1819 = var2;
      this.field1820 = var3;
      this.field1821 = var4;
      this.field1822 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field1819; var3 < this.field1820; var3++) {
         int var4 = var3 * Class7274.method22894(this.field1823);

         for (int var5 = 0; var5 < Class7274.method22895(this.field1823); var5++) {
            Class7274.method22897(this.field1823).method27168(this.field1821, var4 + var5 * Class7274.method22896(this.field1823), this.field1822);
         }
      }
   }
}
