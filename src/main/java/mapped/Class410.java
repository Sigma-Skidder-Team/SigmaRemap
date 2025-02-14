package mapped;

public class Class410 implements Runnable {
   private static String[] field1787;
   public final int field1788;
   public final int field1789;
   public final int field1790;
   public final int field1791;
   public final double[] field1792;
   public final boolean field1793;
   public final int field1794;
   public final Class7274 field1795;

   public Class410(Class7274 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7, int var8) {
      this.field1795 = var1;
      this.field1788 = var2;
      this.field1789 = var3;
      this.field1790 = var4;
      this.field1791 = var5;
      this.field1792 = var6;
      this.field1793 = var7;
      this.field1794 = var8;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field1788];

      for (int var4 = this.field1789; var4 >= this.field1790; var4--) {
         int var5 = var4 * Class7274.method22894(this.field1795);
         int var6 = var4 * this.field1791;

         for (int var7 = Class7274.method22895(this.field1795) - 1; var7 >= 0; var7--) {
            System.arraycopy(this.field1792, var5 + var7 * Class7274.method22896(this.field1795), var3, 0, Class7274.method22898(this.field1795));
            Class7274.method22897(this.field1795).method27182(var3, this.field1793);
            System.arraycopy(var3, 0, this.field1792, var6 + var7 * this.field1794, this.field1788);
         }
      }
   }
}
