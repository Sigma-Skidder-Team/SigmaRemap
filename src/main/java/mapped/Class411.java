package mapped;

public class Class411 implements Runnable {
   private static String[] field1796;
   public final int field1797;
   public final int field1798;
   public final int field1799;
   public final Class2381 field1800;
   public final boolean field1801;
   public final Class9330 field1802;

   public Class411(Class9330 var1, int var2, int var3, int var4, Class2381 var5, boolean var6) {
      this.field1802 = var1;
      this.field1797 = var2;
      this.field1798 = var3;
      this.field1799 = var4;
      this.field1800 = var5;
      this.field1801 = var6;
   }

   @Override
   public void run() {
      if (this.field1797 != -1) {
         for (long var3 = (long)this.field1798; var3 < Class9330.method35282(this.field1802); var3 += (long)this.field1799) {
            Class9330.method35278(this.field1802).method38583(this.field1800, var3 * Class9330.method35281(this.field1802), this.field1801);
         }
      } else {
         for (long var5 = (long)this.field1798; var5 < Class9330.method35282(this.field1802); var5 += (long)this.field1799) {
            Class9330.method35278(this.field1802).method38579(this.field1800, var5 * Class9330.method35281(this.field1802), this.field1801);
         }
      }
   }
}
