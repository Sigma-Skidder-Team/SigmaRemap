package mapped;

public class Class426 implements Runnable {
   private static String[] field1884;
   public final int field1885;
   public final int field1886;
   public final int field1887;
   public final double[] field1888;
   public final double[] field1889;
   public final Class7990 field1890;

   public Class426(Class7990 var1, int var2, int var3, int var4, double[] var5, double[] var6) {
      this.field1890 = var1;
      this.field1885 = var2;
      this.field1886 = var3;
      this.field1887 = var4;
      this.field1888 = var5;
      this.field1889 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field1885; var3 < this.field1886; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         int var6 = this.field1887 + var3;
         this.field1888[var4] = this.field1889[var6] * Class7990.method27241(this.field1890)[var4];
         this.field1888[var5] = this.field1889[var6] * Class7990.method27241(this.field1890)[var5];
      }
   }
}
