package mapped;

public class Class419 implements Runnable {
   private static String[] field1841;
   public final long field1842;
   public final long field1843;
   public final long field1844;
   public final long field1845;
   public final Class2378 field1846;
   public final Class2378 field1847;
   public final long field1848;
   public final Class8543 field1849;

   public Class419(Class8543 var1, long var2, long var4, long var6, long var8, Class2378 var10, Class2378 var11, long var12) {
      this.field1849 = var1;
      this.field1842 = var2;
      this.field1843 = var4;
      this.field1844 = var6;
      this.field1845 = var8;
      this.field1846 = var10;
      this.field1847 = var11;
      this.field1848 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field1842; var3 < this.field1843; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < this.field1844; var7++) {
            long var9 = 2L * var7;
            long var11 = var3 * this.field1845 + var9;
            this.field1846.method9687(var11, (double)this.field1847.method9651(var7 * this.field1848 + var5));
            this.field1846.method9687(var11 + 1L, (double)this.field1847.method9651(var7 * this.field1848 + var5 + 1L));
         }
      }
   }
}
