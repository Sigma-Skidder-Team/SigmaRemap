package mapped;

public class Class414 implements Runnable {
   private static String[] field1811;
   public final int field1812;
   public final int field1813;
   public final int field1814;
   public final double[] field1815;
   public final double[] field1816;
   public final Class7990 field1817;

   public Class414(Class7990 var1, int var2, int var3, int var4, double[] var5, double[] var6) {
      this.field1817 = var1;
      this.field1812 = var2;
      this.field1813 = var3;
      this.field1814 = var4;
      this.field1815 = var5;
      this.field1816 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field1812; var3 < this.field1813; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         int var6 = this.field1814 + var3;
         this.field1815[var4] = this.field1816[var6] * Class7990.method27241(this.field1817)[var4];
         this.field1815[var5] = -this.field1816[var6] * Class7990.method27241(this.field1817)[var5];
      }
   }
}
